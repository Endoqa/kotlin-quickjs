// this file is auto generated by endoqa kotlin ffi, modify it with caution
package lib.quickjs

import java.lang.foreign.MemorySegment

public fun JS_VALUE_GET_FLOAT64(v: JSValue): Double =
    `JS_VALUE_GET_FLOAT64$mh`.invokeExact(v.toLong()) as Double

public fun JS_VALUE_GET_NORM_TAG(v: JSValue): Int =
    `JS_VALUE_GET_NORM_TAG$mh`.invokeExact(v.toLong()) as Int

public fun JS_VALUE_IS_NAN(v: JSValue): Int = `JS_VALUE_IS_NAN$mh`.invokeExact(v.toLong()) as Int

public fun JSCFunction(
    ctx: Pointer<JSContext>,
    this_val: JSValue,
    argc: Int,
    argv: Pointer<JSValue>,
): JSValue = (`JSCFunction$mh`.invokeExact(ctx, this_val.toLong(), argc, argv) as Long).toULong()

public fun JSCFunctionMagic(
    ctx: Pointer<JSContext>,
    this_val: JSValue,
    argc: Int,
    argv: Pointer<JSValue>,
    magic: Int,
): JSValue = (`JSCFunctionMagic$mh`.invokeExact(ctx, this_val.toLong(), argc, argv, magic) as
        Long).toULong()

public fun JSCFunctionData(
    ctx: Pointer<JSContext>,
    this_val: JSValue,
    argc: Int,
    argv: Pointer<JSValue>,
    magic: Int,
    func_data: Pointer<JSValue>,
): JSValue = (`JSCFunctionData$mh`.invokeExact(ctx, this_val.toLong(), argc, argv, magic, func_data) as
        Long).toULong()

public fun JS_NewRuntime(): Pointer<JSRuntime> = `JS_NewRuntime$mh`.invokeExact() as MemorySegment

public fun JS_SetRuntimeInfo(rt: Pointer<JSRuntime>, info: Pointer<Byte>): Unit =
    `JS_SetRuntimeInfo$mh`.invokeExact(rt, info) as Unit

public fun JS_SetMemoryLimit(rt: Pointer<JSRuntime>, limit: ULong): Unit =
    `JS_SetMemoryLimit$mh`.invokeExact(rt, limit.toLong()) as Unit

public fun JS_SetGCThreshold(rt: Pointer<JSRuntime>, gc_threshold: ULong): Unit =
    `JS_SetGCThreshold$mh`.invokeExact(rt, gc_threshold.toLong()) as Unit

public fun JS_SetMaxStackSize(rt: Pointer<JSRuntime>, stack_size: ULong): Unit =
    `JS_SetMaxStackSize$mh`.invokeExact(rt, stack_size.toLong()) as Unit

public fun JS_UpdateStackTop(rt: Pointer<JSRuntime>): Unit = `JS_UpdateStackTop$mh`.invokeExact(rt)
        as Unit

public fun JS_NewRuntime2(mf: Pointer<JSMallocFunctions>, opaque: Pointer<Unit>): Pointer<JSRuntime> =
    `JS_NewRuntime2$mh`.invokeExact(mf, opaque) as MemorySegment

public fun JS_FreeRuntime(rt: Pointer<JSRuntime>): Unit = `JS_FreeRuntime$mh`.invokeExact(rt) as
        Unit

public fun JS_GetRuntimeOpaque(rt: Pointer<JSRuntime>): Pointer<Unit> =
    `JS_GetRuntimeOpaque$mh`.invokeExact(rt) as MemorySegment

public fun JS_SetRuntimeOpaque(rt: Pointer<JSRuntime>, opaque: Pointer<Unit>): Unit =
    `JS_SetRuntimeOpaque$mh`.invokeExact(rt, opaque) as Unit

public fun JS_MarkFunc(rt: Pointer<JSRuntime>, gp: Pointer<JSGCObjectHeader>): Unit =
    `JS_MarkFunc$mh`.invokeExact(rt, gp) as Unit

public fun JS_MarkValue(
    rt: Pointer<JSRuntime>,
    `val`: JSValue,
    mark_func: Pointer<JS_MarkFunc>,
): Unit = `JS_MarkValue$mh`.invokeExact(rt, `val`.toLong(), mark_func) as Unit

public fun JS_RunGC(rt: Pointer<JSRuntime>): Unit = `JS_RunGC$mh`.invokeExact(rt) as Unit

public fun JS_IsLiveObject(rt: Pointer<JSRuntime>, obj: JSValue): Int =
    `JS_IsLiveObject$mh`.invokeExact(rt, obj.toLong()) as Int

public fun JS_NewContext(rt: Pointer<JSRuntime>): Pointer<JSContext> =
    `JS_NewContext$mh`.invokeExact(rt) as MemorySegment

public fun JS_FreeContext(s: Pointer<JSContext>): Unit = `JS_FreeContext$mh`.invokeExact(s) as Unit

public fun JS_DupContext(ctx: Pointer<JSContext>): Pointer<JSContext> =
    `JS_DupContext$mh`.invokeExact(ctx) as MemorySegment

public fun JS_GetContextOpaque(ctx: Pointer<JSContext>): Pointer<Unit> =
    `JS_GetContextOpaque$mh`.invokeExact(ctx) as MemorySegment

public fun JS_SetContextOpaque(ctx: Pointer<JSContext>, opaque: Pointer<Unit>): Unit =
    `JS_SetContextOpaque$mh`.invokeExact(ctx, opaque) as Unit

public fun JS_GetRuntime(ctx: Pointer<JSContext>): Pointer<JSRuntime> =
    `JS_GetRuntime$mh`.invokeExact(ctx) as MemorySegment

public fun JS_SetClassProto(
    ctx: Pointer<JSContext>,
    class_id: JSClassID,
    obj: JSValue,
): Unit = `JS_SetClassProto$mh`.invokeExact(ctx, class_id.toInt(), obj.toLong()) as Unit

public fun JS_GetClassProto(ctx: Pointer<JSContext>, class_id: JSClassID): JSValue =
    (`JS_GetClassProto$mh`.invokeExact(ctx, class_id.toInt()) as Long).toULong()

public fun JS_NewContextRaw(rt: Pointer<JSRuntime>): Pointer<JSContext> =
    `JS_NewContextRaw$mh`.invokeExact(rt) as MemorySegment

public fun JS_AddIntrinsicBaseObjects(ctx: Pointer<JSContext>): Unit =
    `JS_AddIntrinsicBaseObjects$mh`.invokeExact(ctx) as Unit

public fun JS_AddIntrinsicDate(ctx: Pointer<JSContext>): Unit =
    `JS_AddIntrinsicDate$mh`.invokeExact(ctx) as Unit

public fun JS_AddIntrinsicEval(ctx: Pointer<JSContext>): Unit =
    `JS_AddIntrinsicEval$mh`.invokeExact(ctx) as Unit

public fun JS_AddIntrinsicStringNormalize(ctx: Pointer<JSContext>): Unit =
    `JS_AddIntrinsicStringNormalize$mh`.invokeExact(ctx) as Unit

public fun JS_AddIntrinsicRegExpCompiler(ctx: Pointer<JSContext>): Unit =
    `JS_AddIntrinsicRegExpCompiler$mh`.invokeExact(ctx) as Unit

public fun JS_AddIntrinsicRegExp(ctx: Pointer<JSContext>): Unit =
    `JS_AddIntrinsicRegExp$mh`.invokeExact(ctx) as Unit

public fun JS_AddIntrinsicJSON(ctx: Pointer<JSContext>): Unit =
    `JS_AddIntrinsicJSON$mh`.invokeExact(ctx) as Unit

public fun JS_AddIntrinsicProxy(ctx: Pointer<JSContext>): Unit =
    `JS_AddIntrinsicProxy$mh`.invokeExact(ctx) as Unit

public fun JS_AddIntrinsicMapSet(ctx: Pointer<JSContext>): Unit =
    `JS_AddIntrinsicMapSet$mh`.invokeExact(ctx) as Unit

public fun JS_AddIntrinsicTypedArrays(ctx: Pointer<JSContext>): Unit =
    `JS_AddIntrinsicTypedArrays$mh`.invokeExact(ctx) as Unit

public fun JS_AddIntrinsicPromise(ctx: Pointer<JSContext>): Unit =
    `JS_AddIntrinsicPromise$mh`.invokeExact(ctx) as Unit

public fun JS_AddIntrinsicBigInt(ctx: Pointer<JSContext>): Unit =
    `JS_AddIntrinsicBigInt$mh`.invokeExact(ctx) as Unit

public fun JS_AddIntrinsicBigFloat(ctx: Pointer<JSContext>): Unit =
    `JS_AddIntrinsicBigFloat$mh`.invokeExact(ctx) as Unit

public fun JS_AddIntrinsicBigDecimal(ctx: Pointer<JSContext>): Unit =
    `JS_AddIntrinsicBigDecimal$mh`.invokeExact(ctx) as Unit

public fun JS_AddIntrinsicOperators(ctx: Pointer<JSContext>): Unit =
    `JS_AddIntrinsicOperators$mh`.invokeExact(ctx) as Unit

public fun JS_EnableBignumExt(ctx: Pointer<JSContext>, enable: Int): Unit =
    `JS_EnableBignumExt$mh`.invokeExact(ctx, enable) as Unit

public fun js_string_codePointRange(
    ctx: Pointer<JSContext>,
    this_val: JSValue,
    argc: Int,
    argv: Pointer<JSValue>,
): JSValue = (`js_string_codePointRange$mh`.invokeExact(ctx, this_val.toLong(), argc, argv) as
        Long).toULong()

public fun js_malloc_rt(rt: Pointer<JSRuntime>, size: ULong): Pointer<Unit> =
    `js_malloc_rt$mh`.invokeExact(rt, size.toLong()) as MemorySegment

public fun js_free_rt(rt: Pointer<JSRuntime>, ptr: Pointer<Unit>): Unit =
    `js_free_rt$mh`.invokeExact(rt, ptr) as Unit

public fun js_realloc_rt(
    rt: Pointer<JSRuntime>,
    ptr: Pointer<Unit>,
    size: ULong,
): Pointer<Unit> = `js_realloc_rt$mh`.invokeExact(rt, ptr, size.toLong()) as MemorySegment

public fun js_malloc_usable_size_rt(rt: Pointer<JSRuntime>, ptr: Pointer<Unit>): ULong =
    (`js_malloc_usable_size_rt$mh`.invokeExact(rt, ptr) as Long).toULong()

public fun js_mallocz_rt(rt: Pointer<JSRuntime>, size: ULong): Pointer<Unit> =
    `js_mallocz_rt$mh`.invokeExact(rt, size.toLong()) as MemorySegment

public fun js_malloc(ctx: Pointer<JSContext>, size: ULong): Pointer<Unit> =
    `js_malloc$mh`.invokeExact(ctx, size.toLong()) as MemorySegment

public fun js_free(ctx: Pointer<JSContext>, ptr: Pointer<Unit>): Unit =
    `js_free$mh`.invokeExact(ctx, ptr) as Unit

public fun js_realloc(
    ctx: Pointer<JSContext>,
    ptr: Pointer<Unit>,
    size: ULong,
): Pointer<Unit> = `js_realloc$mh`.invokeExact(ctx, ptr, size.toLong()) as MemorySegment

public fun js_malloc_usable_size(ctx: Pointer<JSContext>, ptr: Pointer<Unit>): ULong =
    (`js_malloc_usable_size$mh`.invokeExact(ctx, ptr) as Long).toULong()

public fun js_realloc2(
    ctx: Pointer<JSContext>,
    ptr: Pointer<Unit>,
    size: ULong,
    pslack: Pointer<ULong>,
): Pointer<Unit> = `js_realloc2$mh`.invokeExact(ctx, ptr, size.toLong(), pslack) as MemorySegment

public fun js_mallocz(ctx: Pointer<JSContext>, size: ULong): Pointer<Unit> =
    `js_mallocz$mh`.invokeExact(ctx, size.toLong()) as MemorySegment

public fun js_strdup(ctx: Pointer<JSContext>, str: Pointer<Byte>): Pointer<Byte> =
    `js_strdup$mh`.invokeExact(ctx, str) as MemorySegment

public fun js_strndup(
    ctx: Pointer<JSContext>,
    s: Pointer<Byte>,
    n: ULong,
): Pointer<Byte> = `js_strndup$mh`.invokeExact(ctx, s, n.toLong()) as MemorySegment

public fun JS_ComputeMemoryUsage(rt: Pointer<JSRuntime>, s: Pointer<JSMemoryUsage>): Unit =
    `JS_ComputeMemoryUsage$mh`.invokeExact(rt, s) as Unit

public fun JS_DumpMemoryUsage(
    fp: Pointer<Unit>,
    s: Pointer<JSMemoryUsage>,
    rt: Pointer<JSRuntime>,
): Unit = `JS_DumpMemoryUsage$mh`.invokeExact(fp, s, rt) as Unit

public fun JS_NewAtomLen(
    ctx: Pointer<JSContext>,
    str: Pointer<Byte>,
    len: ULong,
): JSAtom = (`JS_NewAtomLen$mh`.invokeExact(ctx, str, len.toLong()) as Int).toUInt()

public fun JS_NewAtom(ctx: Pointer<JSContext>, str: Pointer<Byte>): JSAtom =
    (`JS_NewAtom$mh`.invokeExact(ctx, str) as Int).toUInt()

public fun JS_NewAtomUInt32(ctx: Pointer<JSContext>, n: uint32_t): JSAtom =
    (`JS_NewAtomUInt32$mh`.invokeExact(ctx, n.toInt()) as Int).toUInt()

public fun JS_DupAtom(ctx: Pointer<JSContext>, v: JSAtom): JSAtom =
    (`JS_DupAtom$mh`.invokeExact(ctx, v.toInt()) as Int).toUInt()

public fun JS_FreeAtom(ctx: Pointer<JSContext>, v: JSAtom): Unit =
    `JS_FreeAtom$mh`.invokeExact(ctx, v.toInt()) as Unit

public fun JS_FreeAtomRT(rt: Pointer<JSRuntime>, v: JSAtom): Unit =
    `JS_FreeAtomRT$mh`.invokeExact(rt, v.toInt()) as Unit

public fun JS_AtomToValue(ctx: Pointer<JSContext>, atom: JSAtom): JSValue =
    (`JS_AtomToValue$mh`.invokeExact(ctx, atom.toInt()) as Long).toULong()

public fun JS_AtomToString(ctx: Pointer<JSContext>, atom: JSAtom): JSValue =
    (`JS_AtomToString$mh`.invokeExact(ctx, atom.toInt()) as Long).toULong()

public fun JS_AtomToCString(ctx: Pointer<JSContext>, atom: JSAtom): Pointer<Byte> =
    `JS_AtomToCString$mh`.invokeExact(ctx, atom.toInt()) as MemorySegment

public fun JS_ValueToAtom(ctx: Pointer<JSContext>, `val`: JSValue): JSAtom =
    (`JS_ValueToAtom$mh`.invokeExact(ctx, `val`.toLong()) as Int).toUInt()

public fun JSClassFinalizer(rt: Pointer<JSRuntime>, `val`: JSValue): Unit =
    `JSClassFinalizer$mh`.invokeExact(rt, `val`.toLong()) as Unit

public fun JSClassGCMark(
    rt: Pointer<JSRuntime>,
    `val`: JSValue,
    mark_func: Pointer<JS_MarkFunc>,
): Unit = `JSClassGCMark$mh`.invokeExact(rt, `val`.toLong(), mark_func) as Unit

public fun JSClassCall(
    ctx: Pointer<JSContext>,
    func_obj: JSValue,
    this_val: JSValue,
    argc: Int,
    argv: Pointer<JSValue>,
    flags: Int,
): JSValue = (`JSClassCall$mh`.invokeExact(ctx, func_obj.toLong(), this_val.toLong(), argc, argv, flags)
        as Long).toULong()

public fun JS_NewClassID(pclass_id: Pointer<JSClassID>): JSClassID =
    (`JS_NewClassID$mh`.invokeExact(pclass_id) as Int).toUInt()

public fun JS_NewClass(
    rt: Pointer<JSRuntime>,
    class_id: JSClassID,
    class_def: Pointer<JSClassDef>,
): Int = `JS_NewClass$mh`.invokeExact(rt, class_id.toInt(), class_def) as Int

public fun JS_IsRegisteredClass(rt: Pointer<JSRuntime>, class_id: JSClassID): Int =
    `JS_IsRegisteredClass$mh`.invokeExact(rt, class_id.toInt()) as Int

public fun JS_NewBool(ctx: Pointer<JSContext>, `val`: Int): JSValue =
    (`JS_NewBool$mh`.invokeExact(ctx, `val`) as Long).toULong()

public fun JS_NewInt32(ctx: Pointer<JSContext>, `val`: int32_t): JSValue =
    (`JS_NewInt32$mh`.invokeExact(ctx, `val`) as Long).toULong()

public fun JS_NewCatchOffset(ctx: Pointer<JSContext>, `val`: int32_t): JSValue =
    (`JS_NewCatchOffset$mh`.invokeExact(ctx, `val`) as Long).toULong()

public fun JS_NewInt64(ctx: Pointer<JSContext>, `val`: int64_t): JSValue =
    (`JS_NewInt64$mh`.invokeExact(ctx, `val`) as Long).toULong()

public fun JS_NewUint32(ctx: Pointer<JSContext>, `val`: uint32_t): JSValue =
    (`JS_NewUint32$mh`.invokeExact(ctx, `val`.toInt()) as Long).toULong()

public fun JS_NewBigInt64(ctx: Pointer<JSContext>, v: int64_t): JSValue =
    (`JS_NewBigInt64$mh`.invokeExact(ctx, v) as Long).toULong()

public fun JS_NewBigUint64(ctx: Pointer<JSContext>, v: uint64_t): JSValue =
    (`JS_NewBigUint64$mh`.invokeExact(ctx, v.toLong()) as Long).toULong()

public fun JS_NewFloat64(ctx: Pointer<JSContext>, d: Double): JSValue =
    (`JS_NewFloat64$mh`.invokeExact(ctx, d) as Long).toULong()

public fun JS_IsNumber(v: JSValue): Int = `JS_IsNumber$mh`.invokeExact(v.toLong()) as Int

public fun JS_IsBigInt(ctx: Pointer<JSContext>, v: JSValue): Int =
    `JS_IsBigInt$mh`.invokeExact(ctx, v.toLong()) as Int

public fun JS_IsBigFloat(v: JSValue): Int = `JS_IsBigFloat$mh`.invokeExact(v.toLong()) as Int

public fun JS_IsBigDecimal(v: JSValue): Int = `JS_IsBigDecimal$mh`.invokeExact(v.toLong()) as Int

public fun JS_IsBool(v: JSValue): Int = `JS_IsBool$mh`.invokeExact(v.toLong()) as Int

public fun JS_IsNull(v: JSValue): Int = `JS_IsNull$mh`.invokeExact(v.toLong()) as Int

public fun JS_IsUndefined(v: JSValue): Int = `JS_IsUndefined$mh`.invokeExact(v.toLong()) as Int

public fun JS_IsException(v: JSValue): Int = `JS_IsException$mh`.invokeExact(v.toLong()) as Int

public fun JS_IsUninitialized(v: JSValue): Int = `JS_IsUninitialized$mh`.invokeExact(v.toLong()) as
        Int

public fun JS_IsString(v: JSValue): Int = `JS_IsString$mh`.invokeExact(v.toLong()) as Int

public fun JS_IsSymbol(v: JSValue): Int = `JS_IsSymbol$mh`.invokeExact(v.toLong()) as Int

public fun JS_IsObject(v: JSValue): Int = `JS_IsObject$mh`.invokeExact(v.toLong()) as Int

public fun JS_Throw(ctx: Pointer<JSContext>, obj: JSValue): JSValue =
    (`JS_Throw$mh`.invokeExact(ctx, obj.toLong()) as Long).toULong()

public fun JS_GetException(ctx: Pointer<JSContext>): JSValue =
    (`JS_GetException$mh`.invokeExact(ctx) as Long).toULong()

public fun JS_IsError(ctx: Pointer<JSContext>, `val`: JSValue): Int =
    `JS_IsError$mh`.invokeExact(ctx, `val`.toLong()) as Int

public fun JS_ResetUncatchableError(ctx: Pointer<JSContext>): Unit =
    `JS_ResetUncatchableError$mh`.invokeExact(ctx) as Unit

public fun JS_NewError(ctx: Pointer<JSContext>): JSValue = (`JS_NewError$mh`.invokeExact(ctx) as
        Long).toULong()

public fun JS_ThrowSyntaxError(ctx: Pointer<JSContext>, fmt: Pointer<Byte>): JSValue =
    (`JS_ThrowSyntaxError$mh`.invokeExact(ctx, fmt) as Long).toULong()

public fun JS_ThrowTypeError(ctx: Pointer<JSContext>, fmt: Pointer<Byte>): JSValue =
    (`JS_ThrowTypeError$mh`.invokeExact(ctx, fmt) as Long).toULong()

public fun JS_ThrowReferenceError(ctx: Pointer<JSContext>, fmt: Pointer<Byte>): JSValue =
    (`JS_ThrowReferenceError$mh`.invokeExact(ctx, fmt) as Long).toULong()

public fun JS_ThrowRangeError(ctx: Pointer<JSContext>, fmt: Pointer<Byte>): JSValue =
    (`JS_ThrowRangeError$mh`.invokeExact(ctx, fmt) as Long).toULong()

public fun JS_ThrowInternalError(ctx: Pointer<JSContext>, fmt: Pointer<Byte>): JSValue =
    (`JS_ThrowInternalError$mh`.invokeExact(ctx, fmt) as Long).toULong()

public fun JS_ThrowOutOfMemory(ctx: Pointer<JSContext>): JSValue =
    (`JS_ThrowOutOfMemory$mh`.invokeExact(ctx) as Long).toULong()

public fun JS_FreeValue(ctx: Pointer<JSContext>, v: JSValue): Unit =
    `JS_FreeValue$mh`.invokeExact(ctx, v.toLong()) as Unit

public fun JS_FreeValueRT(rt: Pointer<JSRuntime>, v: JSValue): Unit =
    `JS_FreeValueRT$mh`.invokeExact(rt, v.toLong()) as Unit

public fun JS_DupValue(ctx: Pointer<JSContext>, v: JSValue): JSValue =
    (`JS_DupValue$mh`.invokeExact(ctx, v.toLong()) as Long).toULong()

public fun JS_DupValueRT(rt: Pointer<JSRuntime>, v: JSValue): JSValue =
    (`JS_DupValueRT$mh`.invokeExact(rt, v.toLong()) as Long).toULong()

public fun JS_ToBool(ctx: Pointer<JSContext>, `val`: JSValue): Int =
    `JS_ToBool$mh`.invokeExact(ctx, `val`.toLong()) as Int

public fun JS_ToInt32(
    ctx: Pointer<JSContext>,
    pres: Pointer<int32_t>,
    `val`: JSValue,
): Int = `JS_ToInt32$mh`.invokeExact(ctx, pres, `val`.toLong()) as Int

public fun JS_ToUint32(
    ctx: Pointer<JSContext>,
    pres: Pointer<uint32_t>,
    `val`: JSValue,
): Int = `JS_ToUint32$mh`.invokeExact(ctx, pres, `val`.toLong()) as Int

public fun JS_ToInt64(
    ctx: Pointer<JSContext>,
    pres: Pointer<int64_t>,
    `val`: JSValue,
): Int = `JS_ToInt64$mh`.invokeExact(ctx, pres, `val`.toLong()) as Int

public fun JS_ToIndex(
    ctx: Pointer<JSContext>,
    plen: Pointer<uint64_t>,
    `val`: JSValue,
): Int = `JS_ToIndex$mh`.invokeExact(ctx, plen, `val`.toLong()) as Int

public fun JS_ToFloat64(
    ctx: Pointer<JSContext>,
    pres: Pointer<Double>,
    `val`: JSValue,
): Int = `JS_ToFloat64$mh`.invokeExact(ctx, pres, `val`.toLong()) as Int

public fun JS_ToBigInt64(
    ctx: Pointer<JSContext>,
    pres: Pointer<int64_t>,
    `val`: JSValue,
): Int = `JS_ToBigInt64$mh`.invokeExact(ctx, pres, `val`.toLong()) as Int

public fun JS_ToInt64Ext(
    ctx: Pointer<JSContext>,
    pres: Pointer<int64_t>,
    `val`: JSValue,
): Int = `JS_ToInt64Ext$mh`.invokeExact(ctx, pres, `val`.toLong()) as Int

public fun JS_NewStringLen(
    ctx: Pointer<JSContext>,
    str1: Pointer<Byte>,
    len1: ULong,
): JSValue = (`JS_NewStringLen$mh`.invokeExact(ctx, str1, len1.toLong()) as Long).toULong()

public fun JS_NewString(ctx: Pointer<JSContext>, str: Pointer<Byte>): JSValue =
    (`JS_NewString$mh`.invokeExact(ctx, str) as Long).toULong()

public fun JS_NewAtomString(ctx: Pointer<JSContext>, str: Pointer<Byte>): JSValue =
    (`JS_NewAtomString$mh`.invokeExact(ctx, str) as Long).toULong()

public fun JS_ToString(ctx: Pointer<JSContext>, `val`: JSValue): JSValue =
    (`JS_ToString$mh`.invokeExact(ctx, `val`.toLong()) as Long).toULong()

public fun JS_ToPropertyKey(ctx: Pointer<JSContext>, `val`: JSValue): JSValue =
    (`JS_ToPropertyKey$mh`.invokeExact(ctx, `val`.toLong()) as Long).toULong()

public fun JS_ToCStringLen2(
    ctx: Pointer<JSContext>,
    plen: Pointer<ULong>,
    val1: JSValue,
    cesu8: Int,
): Pointer<Byte> = `JS_ToCStringLen2$mh`.invokeExact(ctx, plen, val1.toLong(), cesu8) as MemorySegment

public fun JS_ToCStringLen(
    ctx: Pointer<JSContext>,
    plen: Pointer<ULong>,
    val1: JSValue,
): Pointer<Byte> = `JS_ToCStringLen$mh`.invokeExact(ctx, plen, val1.toLong()) as MemorySegment

public fun JS_ToCString(ctx: Pointer<JSContext>, val1: JSValue): Pointer<Byte> =
    `JS_ToCString$mh`.invokeExact(ctx, val1.toLong()) as MemorySegment

public fun JS_FreeCString(ctx: Pointer<JSContext>, ptr: Pointer<Byte>): Unit =
    `JS_FreeCString$mh`.invokeExact(ctx, ptr) as Unit

public fun JS_NewObjectProtoClass(
    ctx: Pointer<JSContext>,
    proto: JSValue,
    class_id: JSClassID,
): JSValue = (`JS_NewObjectProtoClass$mh`.invokeExact(ctx, proto.toLong(), class_id.toInt()) as
        Long).toULong()

public fun JS_NewObjectClass(ctx: Pointer<JSContext>, class_id: Int): JSValue =
    (`JS_NewObjectClass$mh`.invokeExact(ctx, class_id) as Long).toULong()

public fun JS_NewObjectProto(ctx: Pointer<JSContext>, proto: JSValue): JSValue =
    (`JS_NewObjectProto$mh`.invokeExact(ctx, proto.toLong()) as Long).toULong()

public fun JS_NewObject(ctx: Pointer<JSContext>): JSValue = (`JS_NewObject$mh`.invokeExact(ctx) as
        Long).toULong()

public fun JS_IsFunction(ctx: Pointer<JSContext>, `val`: JSValue): Int =
    `JS_IsFunction$mh`.invokeExact(ctx, `val`.toLong()) as Int

public fun JS_IsConstructor(ctx: Pointer<JSContext>, `val`: JSValue): Int =
    `JS_IsConstructor$mh`.invokeExact(ctx, `val`.toLong()) as Int

public fun JS_SetConstructorBit(
    ctx: Pointer<JSContext>,
    func_obj: JSValue,
    `val`: Int,
): Int = `JS_SetConstructorBit$mh`.invokeExact(ctx, func_obj.toLong(), `val`) as Int

public fun JS_NewArray(ctx: Pointer<JSContext>): JSValue = (`JS_NewArray$mh`.invokeExact(ctx) as
        Long).toULong()

public fun JS_IsArray(ctx: Pointer<JSContext>, `val`: JSValue): Int =
    `JS_IsArray$mh`.invokeExact(ctx, `val`.toLong()) as Int

public fun JS_GetPropertyInternal(
    ctx: Pointer<JSContext>,
    obj: JSValue,
    prop: JSAtom,
    `receiver`: JSValue,
    throw_ref_error: Int,
): JSValue =
    (`JS_GetPropertyInternal$mh`.invokeExact(ctx, obj.toLong(), prop.toInt(), `receiver`.toLong(), throw_ref_error)
            as Long).toULong()

public fun JS_GetProperty(
    ctx: Pointer<JSContext>,
    this_obj: JSValue,
    prop: JSAtom,
): JSValue = (`JS_GetProperty$mh`.invokeExact(ctx, this_obj.toLong(), prop.toInt()) as
        Long).toULong()

public fun JS_GetPropertyStr(
    ctx: Pointer<JSContext>,
    this_obj: JSValue,
    prop: Pointer<Byte>,
): JSValue = (`JS_GetPropertyStr$mh`.invokeExact(ctx, this_obj.toLong(), prop) as Long).toULong()

public fun JS_GetPropertyUint32(
    ctx: Pointer<JSContext>,
    this_obj: JSValue,
    idx: uint32_t,
): JSValue = (`JS_GetPropertyUint32$mh`.invokeExact(ctx, this_obj.toLong(), idx.toInt()) as
        Long).toULong()

public fun JS_SetPropertyInternal(
    ctx: Pointer<JSContext>,
    obj: JSValue,
    prop: JSAtom,
    `val`: JSValue,
    this_obj: JSValue,
    flags: Int,
): Int =
    `JS_SetPropertyInternal$mh`.invokeExact(ctx, obj.toLong(), prop.toInt(), `val`.toLong(), this_obj.toLong(), flags)
            as Int

public fun JS_SetProperty(
    ctx: Pointer<JSContext>,
    this_obj: JSValue,
    prop: JSAtom,
    `val`: JSValue,
): Int = `JS_SetProperty$mh`.invokeExact(ctx, this_obj.toLong(), prop.toInt(), `val`.toLong()) as Int

public fun JS_SetPropertyUint32(
    ctx: Pointer<JSContext>,
    this_obj: JSValue,
    idx: uint32_t,
    `val`: JSValue,
): Int = `JS_SetPropertyUint32$mh`.invokeExact(ctx, this_obj.toLong(), idx.toInt(), `val`.toLong()) as
        Int

public fun JS_SetPropertyInt64(
    ctx: Pointer<JSContext>,
    this_obj: JSValue,
    idx: int64_t,
    `val`: JSValue,
): Int = `JS_SetPropertyInt64$mh`.invokeExact(ctx, this_obj.toLong(), idx, `val`.toLong()) as Int

public fun JS_SetPropertyStr(
    ctx: Pointer<JSContext>,
    this_obj: JSValue,
    prop: Pointer<Byte>,
    `val`: JSValue,
): Int = `JS_SetPropertyStr$mh`.invokeExact(ctx, this_obj.toLong(), prop, `val`.toLong()) as Int

public fun JS_HasProperty(
    ctx: Pointer<JSContext>,
    this_obj: JSValue,
    prop: JSAtom,
): Int = `JS_HasProperty$mh`.invokeExact(ctx, this_obj.toLong(), prop.toInt()) as Int

public fun JS_IsExtensible(ctx: Pointer<JSContext>, obj: JSValue): Int =
    `JS_IsExtensible$mh`.invokeExact(ctx, obj.toLong()) as Int

public fun JS_PreventExtensions(ctx: Pointer<JSContext>, obj: JSValue): Int =
    `JS_PreventExtensions$mh`.invokeExact(ctx, obj.toLong()) as Int

public fun JS_DeleteProperty(
    ctx: Pointer<JSContext>,
    obj: JSValue,
    prop: JSAtom,
    flags: Int,
): Int = `JS_DeleteProperty$mh`.invokeExact(ctx, obj.toLong(), prop.toInt(), flags) as Int

public fun JS_SetPrototype(
    ctx: Pointer<JSContext>,
    obj: JSValue,
    proto_val: JSValue,
): Int = `JS_SetPrototype$mh`.invokeExact(ctx, obj.toLong(), proto_val.toLong()) as Int

public fun JS_GetPrototype(ctx: Pointer<JSContext>, `val`: JSValue): JSValue =
    (`JS_GetPrototype$mh`.invokeExact(ctx, `val`.toLong()) as Long).toULong()

public fun JS_GetOwnPropertyNames(
    ctx: Pointer<JSContext>,
    ptab: Pointer<Pointer<JSPropertyEnum>>,
    plen: Pointer<uint32_t>,
    obj: JSValue,
    flags: Int,
): Int = `JS_GetOwnPropertyNames$mh`.invokeExact(ctx, ptab, plen, obj.toLong(), flags) as Int

public fun JS_GetOwnProperty(
    ctx: Pointer<JSContext>,
    desc: Pointer<JSPropertyDescriptor>,
    obj: JSValue,
    prop: JSAtom,
): Int = `JS_GetOwnProperty$mh`.invokeExact(ctx, desc, obj.toLong(), prop.toInt()) as Int

public fun JS_Call(
    ctx: Pointer<JSContext>,
    func_obj: JSValue,
    this_obj: JSValue,
    argc: Int,
    argv: Pointer<JSValue>,
): JSValue = (`JS_Call$mh`.invokeExact(ctx, func_obj.toLong(), this_obj.toLong(), argc, argv) as
        Long).toULong()

public fun JS_Invoke(
    ctx: Pointer<JSContext>,
    this_val: JSValue,
    atom: JSAtom,
    argc: Int,
    argv: Pointer<JSValue>,
): JSValue = (`JS_Invoke$mh`.invokeExact(ctx, this_val.toLong(), atom.toInt(), argc, argv) as
        Long).toULong()

public fun JS_CallConstructor(
    ctx: Pointer<JSContext>,
    func_obj: JSValue,
    argc: Int,
    argv: Pointer<JSValue>,
): JSValue = (`JS_CallConstructor$mh`.invokeExact(ctx, func_obj.toLong(), argc, argv) as
        Long).toULong()

public fun JS_CallConstructor2(
    ctx: Pointer<JSContext>,
    func_obj: JSValue,
    new_target: JSValue,
    argc: Int,
    argv: Pointer<JSValue>,
): JSValue =
    (`JS_CallConstructor2$mh`.invokeExact(ctx, func_obj.toLong(), new_target.toLong(), argc, argv) as
            Long).toULong()

public fun JS_DetectModule(input: Pointer<Byte>, input_len: ULong): Int =
    `JS_DetectModule$mh`.invokeExact(input, input_len.toLong()) as Int

public fun JS_Eval(
    ctx: Pointer<JSContext>,
    input: Pointer<Byte>,
    input_len: ULong,
    filename: Pointer<Byte>,
    eval_flags: Int,
): JSValue = (`JS_Eval$mh`.invokeExact(ctx, input, input_len.toLong(), filename, eval_flags) as
        Long).toULong()

public fun JS_EvalThis(
    ctx: Pointer<JSContext>,
    this_obj: JSValue,
    input: Pointer<Byte>,
    input_len: ULong,
    filename: Pointer<Byte>,
    eval_flags: Int,
): JSValue =
    (`JS_EvalThis$mh`.invokeExact(ctx, this_obj.toLong(), input, input_len.toLong(), filename, eval_flags)
            as Long).toULong()

public fun JS_GetGlobalObject(ctx: Pointer<JSContext>): JSValue =
    (`JS_GetGlobalObject$mh`.invokeExact(ctx) as Long).toULong()

public fun JS_IsInstanceOf(
    ctx: Pointer<JSContext>,
    `val`: JSValue,
    obj: JSValue,
): Int = `JS_IsInstanceOf$mh`.invokeExact(ctx, `val`.toLong(), obj.toLong()) as Int

public fun JS_DefineProperty(
    ctx: Pointer<JSContext>,
    this_obj: JSValue,
    prop: JSAtom,
    `val`: JSValue,
    getter: JSValue,
    setter: JSValue,
    flags: Int,
): Int =
    `JS_DefineProperty$mh`.invokeExact(
        ctx,
        this_obj.toLong(),
        prop.toInt(),
        `val`.toLong(),
        getter.toLong(),
        setter.toLong(),
        flags,
    )
            as Int

public fun JS_DefinePropertyValue(
    ctx: Pointer<JSContext>,
    this_obj: JSValue,
    prop: JSAtom,
    `val`: JSValue,
    flags: Int,
): Int =
    `JS_DefinePropertyValue$mh`.invokeExact(ctx, this_obj.toLong(), prop.toInt(), `val`.toLong(), flags)
            as Int

public fun JS_DefinePropertyValueUint32(
    ctx: Pointer<JSContext>,
    this_obj: JSValue,
    idx: uint32_t,
    `val`: JSValue,
    flags: Int,
): Int =
    `JS_DefinePropertyValueUint32$mh`.invokeExact(ctx, this_obj.toLong(), idx.toInt(), `val`.toLong(), flags)
            as Int

public fun JS_DefinePropertyValueStr(
    ctx: Pointer<JSContext>,
    this_obj: JSValue,
    prop: Pointer<Byte>,
    `val`: JSValue,
    flags: Int,
): Int =
    `JS_DefinePropertyValueStr$mh`.invokeExact(ctx, this_obj.toLong(), prop, `val`.toLong(), flags) as
            Int

public fun JS_DefinePropertyGetSet(
    ctx: Pointer<JSContext>,
    this_obj: JSValue,
    prop: JSAtom,
    getter: JSValue,
    setter: JSValue,
    flags: Int,
): Int =
    `JS_DefinePropertyGetSet$mh`.invokeExact(
        ctx,
        this_obj.toLong(),
        prop.toInt(),
        getter.toLong(),
        setter.toLong(),
        flags,
    )
            as Int

public fun JS_SetOpaque(obj: JSValue, opaque: Pointer<Unit>): Unit =
    `JS_SetOpaque$mh`.invokeExact(obj.toLong(), opaque) as Unit

public fun JS_GetOpaque(obj: JSValue, class_id: JSClassID): Pointer<Unit> =
    `JS_GetOpaque$mh`.invokeExact(obj.toLong(), class_id.toInt()) as MemorySegment

public fun JS_GetOpaque2(
    ctx: Pointer<JSContext>,
    obj: JSValue,
    class_id: JSClassID,
): Pointer<Unit> = `JS_GetOpaque2$mh`.invokeExact(ctx, obj.toLong(), class_id.toInt()) as
        MemorySegment

public fun JS_ParseJSON(
    ctx: Pointer<JSContext>,
    buf: Pointer<Byte>,
    buf_len: ULong,
    filename: Pointer<Byte>,
): JSValue = (`JS_ParseJSON$mh`.invokeExact(ctx, buf, buf_len.toLong(), filename) as Long).toULong()

public fun JS_ParseJSON2(
    ctx: Pointer<JSContext>,
    buf: Pointer<Byte>,
    buf_len: ULong,
    filename: Pointer<Byte>,
    flags: Int,
): JSValue = (`JS_ParseJSON2$mh`.invokeExact(ctx, buf, buf_len.toLong(), filename, flags) as
        Long).toULong()

public fun JS_JSONStringify(
    ctx: Pointer<JSContext>,
    obj: JSValue,
    replacer: JSValue,
    space0: JSValue,
): JSValue = (`JS_JSONStringify$mh`.invokeExact(ctx, obj.toLong(), replacer.toLong(), space0.toLong())
        as Long).toULong()

public fun JSFreeArrayBufferDataFunc(
    rt: Pointer<JSRuntime>,
    opaque: Pointer<Unit>,
    ptr: Pointer<Unit>,
): Unit = `JSFreeArrayBufferDataFunc$mh`.invokeExact(rt, opaque, ptr) as Unit

public fun JS_NewArrayBuffer(
    ctx: Pointer<JSContext>,
    buf: Pointer<uint8_t>,
    len: ULong,
    free_func: Pointer<JSFreeArrayBufferDataFunc>,
    opaque: Pointer<Unit>,
    is_shared: Int,
): JSValue = (`JS_NewArrayBuffer$mh`.invokeExact(ctx, buf, len.toLong(), free_func, opaque, is_shared)
        as Long).toULong()

public fun JS_NewArrayBufferCopy(
    ctx: Pointer<JSContext>,
    buf: Pointer<uint8_t>,
    len: ULong,
): JSValue = (`JS_NewArrayBufferCopy$mh`.invokeExact(ctx, buf, len.toLong()) as Long).toULong()

public fun JS_DetachArrayBuffer(ctx: Pointer<JSContext>, obj: JSValue): Unit =
    `JS_DetachArrayBuffer$mh`.invokeExact(ctx, obj.toLong()) as Unit

public fun JS_GetArrayBuffer(
    ctx: Pointer<JSContext>,
    psize: Pointer<ULong>,
    obj: JSValue,
): Pointer<uint8_t> = `JS_GetArrayBuffer$mh`.invokeExact(ctx, psize, obj.toLong()) as MemorySegment

public fun JS_GetTypedArrayBuffer(
    ctx: Pointer<JSContext>,
    obj: JSValue,
    pbyte_offset: Pointer<ULong>,
    pbyte_length: Pointer<ULong>,
    pbytes_per_element: Pointer<ULong>,
): JSValue =
    (`JS_GetTypedArrayBuffer$mh`.invokeExact(ctx, obj.toLong(), pbyte_offset, pbyte_length, pbytes_per_element)
            as Long).toULong()

public fun JS_SetSharedArrayBufferFunctions(
    rt: Pointer<JSRuntime>,
    sf: Pointer<JSSharedArrayBufferFunctions>
): Unit =
    `JS_SetSharedArrayBufferFunctions$mh`.invokeExact(rt, sf) as Unit

public fun JS_NewPromiseCapability(ctx: Pointer<JSContext>, resolving_funcs: Pointer<JSValue>):
        JSValue = (`JS_NewPromiseCapability$mh`.invokeExact(ctx, resolving_funcs) as Long).toULong()

public fun JS_PromiseState(ctx: Pointer<JSContext>, promise: JSValue): JSPromiseStateEnum =
    JSPromiseStateEnum.fromInt(`JS_PromiseState$mh`.invokeExact(ctx, promise.toLong()) as Int)

public fun JS_PromiseResult(ctx: Pointer<JSContext>, promise: JSValue): JSValue =
    (`JS_PromiseResult$mh`.invokeExact(ctx, promise.toLong()) as Long).toULong()

public fun JSHostPromiseRejectionTracker(
    ctx: Pointer<JSContext>,
    promise: JSValue,
    reason: JSValue,
    is_handled: Int,
    opaque: Pointer<Unit>,
): Unit =
    `JSHostPromiseRejectionTracker$mh`.invokeExact(ctx, promise.toLong(), reason.toLong(), is_handled, opaque)
            as Unit

public fun JS_SetHostPromiseRejectionTracker(
    rt: Pointer<JSRuntime>,
    cb: Pointer<JSHostPromiseRejectionTracker>,
    opaque: Pointer<Unit>,
): Unit = `JS_SetHostPromiseRejectionTracker$mh`.invokeExact(rt, cb, opaque) as Unit

public fun JSInterruptHandler(rt: Pointer<JSRuntime>, opaque: Pointer<Unit>): Int =
    `JSInterruptHandler$mh`.invokeExact(rt, opaque) as Int

public fun JS_SetInterruptHandler(
    rt: Pointer<JSRuntime>,
    cb: Pointer<JSInterruptHandler>,
    opaque: Pointer<Unit>,
): Unit = `JS_SetInterruptHandler$mh`.invokeExact(rt, cb, opaque) as Unit

public fun JS_SetCanBlock(rt: Pointer<JSRuntime>, can_block: Int): Unit =
    `JS_SetCanBlock$mh`.invokeExact(rt, can_block) as Unit

public fun JS_SetIsHTMLDDA(ctx: Pointer<JSContext>, obj: JSValue): Unit =
    `JS_SetIsHTMLDDA$mh`.invokeExact(ctx, obj.toLong()) as Unit

public fun JSModuleNormalizeFunc(
    ctx: Pointer<JSContext>,
    module_base_name: Pointer<Byte>,
    module_name: Pointer<Byte>,
    opaque: Pointer<Unit>,
): Pointer<Byte> = `JSModuleNormalizeFunc$mh`.invokeExact(ctx, module_base_name, module_name, opaque)
        as MemorySegment

public fun JSModuleLoaderFunc(
    ctx: Pointer<JSContext>,
    module_name: Pointer<Byte>,
    opaque: Pointer<Unit>,
): Pointer<JSModuleDef> = `JSModuleLoaderFunc$mh`.invokeExact(ctx, module_name, opaque) as
        MemorySegment

public fun JS_SetModuleLoaderFunc(
    rt: Pointer<JSRuntime>,
    module_normalize: Pointer<JSModuleNormalizeFunc>,
    module_loader: Pointer<JSModuleLoaderFunc>,
    opaque: Pointer<Unit>,
): Unit = `JS_SetModuleLoaderFunc$mh`.invokeExact(rt, module_normalize, module_loader, opaque) as Unit

public fun JS_GetImportMeta(ctx: Pointer<JSContext>, m: Pointer<JSModuleDef>): JSValue =
    (`JS_GetImportMeta$mh`.invokeExact(ctx, m) as Long).toULong()

public fun JS_GetModuleName(ctx: Pointer<JSContext>, m: Pointer<JSModuleDef>): JSAtom =
    (`JS_GetModuleName$mh`.invokeExact(ctx, m) as Int).toUInt()

public fun JSJobFunc(
    ctx: Pointer<JSContext>,
    argc: Int,
    argv: Pointer<JSValue>,
): JSValue = (`JSJobFunc$mh`.invokeExact(ctx, argc, argv) as Long).toULong()

public fun JS_EnqueueJob(
    ctx: Pointer<JSContext>,
    job_func: Pointer<JSJobFunc>,
    argc: Int,
    argv: Pointer<JSValue>,
): Int = `JS_EnqueueJob$mh`.invokeExact(ctx, job_func, argc, argv) as Int

public fun JS_IsJobPending(rt: Pointer<JSRuntime>): Int = `JS_IsJobPending$mh`.invokeExact(rt) as
        Int

public fun JS_ExecutePendingJob(rt: Pointer<JSRuntime>, pctx: Pointer<Pointer<JSContext>>): Int =
    `JS_ExecutePendingJob$mh`.invokeExact(rt, pctx) as Int

public fun JS_WriteObject(
    ctx: Pointer<JSContext>,
    psize: Pointer<ULong>,
    obj: JSValue,
    flags: Int,
): Pointer<uint8_t> = `JS_WriteObject$mh`.invokeExact(ctx, psize, obj.toLong(), flags) as
        MemorySegment

public fun JS_WriteObject2(
    ctx: Pointer<JSContext>,
    psize: Pointer<ULong>,
    obj: JSValue,
    flags: Int,
    psab_tab: Pointer<Pointer<Pointer<uint8_t>>>,
    psab_tab_len: Pointer<ULong>,
): Pointer<uint8_t> =
    `JS_WriteObject2$mh`.invokeExact(ctx, psize, obj.toLong(), flags, psab_tab, psab_tab_len) as
            MemorySegment

public fun JS_ReadObject(
    ctx: Pointer<JSContext>,
    buf: Pointer<uint8_t>,
    buf_len: ULong,
    flags: Int,
): JSValue = (`JS_ReadObject$mh`.invokeExact(ctx, buf, buf_len.toLong(), flags) as Long).toULong()

public fun JS_EvalFunction(ctx: Pointer<JSContext>, fun_obj: JSValue): JSValue =
    (`JS_EvalFunction$mh`.invokeExact(ctx, fun_obj.toLong()) as Long).toULong()

public fun JS_ResolveModule(ctx: Pointer<JSContext>, obj: JSValue): Int =
    `JS_ResolveModule$mh`.invokeExact(ctx, obj.toLong()) as Int

public fun JS_GetScriptOrModuleName(ctx: Pointer<JSContext>, n_stack_levels: Int): JSAtom =
    (`JS_GetScriptOrModuleName$mh`.invokeExact(ctx, n_stack_levels) as Int).toUInt()

public fun JS_LoadModule(
    ctx: Pointer<JSContext>,
    basename: Pointer<Byte>,
    filename: Pointer<Byte>,
): JSValue = (`JS_LoadModule$mh`.invokeExact(ctx, basename, filename) as Long).toULong()

public fun JS_NewCFunction2(
    ctx: Pointer<JSContext>,
    func: Pointer<JSCFunction>,
    name: Pointer<Byte>,
    length: Int,
    cproto: JSCFunctionEnum,
    magic: Int,
): JSValue = (`JS_NewCFunction2$mh`.invokeExact(ctx, func, name, length, cproto.value, magic) as
        Long).toULong()

public fun JS_NewCFunctionData(
    ctx: Pointer<JSContext>,
    func: Pointer<JSCFunctionData>,
    length: Int,
    magic: Int,
    data_len: Int,
    `data`: Pointer<JSValue>,
): JSValue = (`JS_NewCFunctionData$mh`.invokeExact(ctx, func, length, magic, data_len, `data`) as
        Long).toULong()

public fun JS_NewCFunction(
    ctx: Pointer<JSContext>,
    func: Pointer<JSCFunction>,
    name: Pointer<Byte>,
    length: Int,
): JSValue = (`JS_NewCFunction$mh`.invokeExact(ctx, func, name, length) as Long).toULong()

public fun JS_NewCFunctionMagic(
    ctx: Pointer<JSContext>,
    func: Pointer<JSCFunctionMagic>,
    name: Pointer<Byte>,
    length: Int,
    cproto: JSCFunctionEnum,
    magic: Int,
): JSValue = (`JS_NewCFunctionMagic$mh`.invokeExact(ctx, func, name, length, cproto.value, magic) as
        Long).toULong()

public fun JS_SetConstructor(
    ctx: Pointer<JSContext>,
    func_obj: JSValue,
    proto: JSValue,
): Unit = `JS_SetConstructor$mh`.invokeExact(ctx, func_obj.toLong(), proto.toLong()) as Unit

public fun JS_SetPropertyFunctionList(
    ctx: Pointer<JSContext>,
    obj: JSValue,
    tab: Pointer<JSCFunctionListEntry>,
    len: Int,
): Unit = `JS_SetPropertyFunctionList$mh`.invokeExact(ctx, obj.toLong(), tab, len) as Unit

public fun JSModuleInitFunc(ctx: Pointer<JSContext>, m: Pointer<JSModuleDef>): Int =
    `JSModuleInitFunc$mh`.invokeExact(ctx, m) as Int

public fun JS_NewCModule(
    ctx: Pointer<JSContext>,
    name_str: Pointer<Byte>,
    func: Pointer<JSModuleInitFunc>,
): Pointer<JSModuleDef> = `JS_NewCModule$mh`.invokeExact(ctx, name_str, func) as MemorySegment

public fun JS_AddModuleExport(
    ctx: Pointer<JSContext>,
    m: Pointer<JSModuleDef>,
    name_str: Pointer<Byte>,
): Int = `JS_AddModuleExport$mh`.invokeExact(ctx, m, name_str) as Int

public fun JS_AddModuleExportList(
    ctx: Pointer<JSContext>,
    m: Pointer<JSModuleDef>,
    tab: Pointer<JSCFunctionListEntry>,
    len: Int,
): Int = `JS_AddModuleExportList$mh`.invokeExact(ctx, m, tab, len) as Int

public fun JS_SetModuleExport(
    ctx: Pointer<JSContext>,
    m: Pointer<JSModuleDef>,
    export_name: Pointer<Byte>,
    `val`: JSValue,
): Int = `JS_SetModuleExport$mh`.invokeExact(ctx, m, export_name, `val`.toLong()) as Int

public fun JS_SetModuleExportList(
    ctx: Pointer<JSContext>,
    m: Pointer<JSModuleDef>,
    tab: Pointer<JSCFunctionListEntry>,
    len: Int,
): Int = `JS_SetModuleExportList$mh`.invokeExact(ctx, m, tab, len) as Int
