// this file is auto generated by endoqa kotlin ffi, modify it with caution
package lib.quickjs

import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.VarHandle

@JvmInline
public value class JSMallocFunctions(
    public val `$mem`: MemorySegment,
) {
    public var js_malloc: Pointer<(s: Pointer<JSMallocState>, size: ULong) -> Pointer<Unit>>
        get() = js_mallocHandle.get(this.`$mem`, 0L) as MemorySegment
        set(`value`) {
            js_mallocHandle.set(this.`$mem`, 0L, value)
        }

    public var js_free: Pointer<(s: Pointer<JSMallocState>, ptr: Pointer<Unit>) -> Unit>
        get() = js_freeHandle.get(this.`$mem`, 0L) as MemorySegment
        set(`value`) {
            js_freeHandle.set(this.`$mem`, 0L, value)
        }

    public var js_realloc: Pointer<(
        s: Pointer<JSMallocState>,
        ptr: Pointer<Unit>,
        size: ULong,
    ) -> Pointer<Unit>>
        get() = js_reallocHandle.get(this.`$mem`, 0L) as MemorySegment
        set(`value`) {
            js_reallocHandle.set(this.`$mem`, 0L, value)
        }

    public var js_malloc_usable_size: Pointer<(ptr: Pointer<Unit>) -> ULong>
        get() = js_malloc_usable_sizeHandle.get(this.`$mem`, 0L) as MemorySegment
        set(`value`) {
            js_malloc_usable_sizeHandle.set(this.`$mem`, 0L, value)
        }

    public constructor(gc: Boolean) : this(kotlin.run {
        require(gc) { "Do not call this if gc is not want" }
        Arena.ofAuto().allocate(layout)
    })

    public companion object {
        public val layout: StructLayout = MemoryLayout.structLayout(
            `$RuntimeHelper`.POINTER.withName("js_malloc"),
            `$RuntimeHelper`.POINTER.withName("js_free"),
            `$RuntimeHelper`.POINTER.withName("js_realloc"),
            `$RuntimeHelper`.POINTER.withName("js_malloc_usable_size"),
        ).withName("JSMallocFunctions")

        @JvmField
        public val js_mallocHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("js_malloc"))

        @JvmField
        public val js_freeHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("js_free"))

        @JvmField
        public val js_reallocHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("js_realloc"))

        @JvmField
        public val js_malloc_usable_sizeHandle: VarHandle =
            layout.varHandle(MemoryLayout.PathElement.groupElement("js_malloc_usable_size"))

        @JvmStatic
        public fun allocate(alloc: SegmentAllocator): JSMallocFunctions =
            JSMallocFunctions(alloc.allocate(layout))

        public fun interface js_malloc {
            public fun invoke(s: Pointer<JSMallocState>, size: ULong): Pointer<Unit>

            public fun allocate(arena: Arena): MemorySegment =
                Linker.nativeLinker().upcallStub(invokeHandle.bindTo(this), fd, arena)

            public companion object {
                @JvmStatic
                public val invokeHandle: MethodHandle =
                    MethodHandles.lookup().unreflect(js_malloc::class.java.methods.find {
                        it.name == "invoke"
                    }
                    )

                @JvmStatic
                public val fd: FunctionDescriptor = FunctionDescriptor.of(
                    `$RuntimeHelper`.POINTER,
                    `$RuntimeHelper`.POINTER,
                    ValueLayout.JAVA_LONG,
                )
            }
        }

        public fun interface js_free {
            public fun invoke(s: Pointer<JSMallocState>, ptr: Pointer<Unit>)

            public fun allocate(arena: Arena): MemorySegment =
                Linker.nativeLinker().upcallStub(invokeHandle.bindTo(this), fd, arena)

            public companion object {
                @JvmStatic
                public val invokeHandle: MethodHandle =
                    MethodHandles.lookup().unreflect(js_free::class.java.methods.find {
                        it.name == "invoke"
                    }
                    )

                @JvmStatic
                public val fd: FunctionDescriptor = FunctionDescriptor.ofVoid(
                    `$RuntimeHelper`.POINTER,
                    `$RuntimeHelper`.POINTER,
                )
            }
        }

        public fun interface js_realloc {
            public fun invoke(
                s: Pointer<JSMallocState>,
                ptr: Pointer<Unit>,
                size: ULong,
            ): Pointer<Unit>

            public fun allocate(arena: Arena): MemorySegment =
                Linker.nativeLinker().upcallStub(invokeHandle.bindTo(this), fd, arena)

            public companion object {
                @JvmStatic
                public val invokeHandle: MethodHandle =
                    MethodHandles.lookup().unreflect(js_realloc::class.java.methods.find {
                        it.name == "invoke"
                    }
                    )

                @JvmStatic
                public val fd: FunctionDescriptor = FunctionDescriptor.of(
                    `$RuntimeHelper`.POINTER,
                    `$RuntimeHelper`.POINTER,
                    `$RuntimeHelper`.POINTER,
                    ValueLayout.JAVA_LONG,
                )
            }
        }

        public fun interface js_malloc_usable_size {
            public fun invoke(ptr: Pointer<Unit>): ULong

            public fun allocate(arena: Arena): MemorySegment =
                Linker.nativeLinker().upcallStub(invokeHandle.bindTo(this), fd, arena)

            public companion object {
                @JvmStatic
                public val invokeHandle: MethodHandle =
                    MethodHandles.lookup().unreflect(js_malloc_usable_size::class.java.methods.find {
                        it.name == "invoke"
                    }
                    )

                @JvmStatic
                public val fd: FunctionDescriptor = FunctionDescriptor.of(
                    ValueLayout.JAVA_LONG,
                    `$RuntimeHelper`.POINTER,
                )
            }
        }
    }
}
