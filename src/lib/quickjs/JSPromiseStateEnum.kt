// this file is auto generated by endoqa kotlin ffi, modify it with caution
package lib.quickjs

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int

public enum class JSPromiseStateEnum(
    public val `value`: Int,
) {
    PROMISEPENDING(0),
    PROMISEFULFILLED(1),
    PROMISEREJECTED(2),
    ;

    public companion object {
        @JvmStatic
        public val fromInt: MethodHandle = MethodHandles.lookup().findStatic(
            JSPromiseStateEnum::class.java,
            "fromInt",
            MethodType.methodType(JSPromiseStateEnum::class.java, Int::class.java)
        )

        @JvmStatic
        public val toInt: MethodHandle = MethodHandles.lookup().findGetter(
            JSPromiseStateEnum::class.java,
            "value",
            Int::class.java
        )

        @JvmStatic
        public fun fromInt(`value`: Int): JSPromiseStateEnum = when (value) {
            PROMISEPENDING.value -> PROMISEPENDING
            PROMISEFULFILLED.value -> PROMISEFULFILLED
            PROMISEREJECTED.value -> PROMISEREJECTED
            else -> error("enum not found")
        }
    }
}
