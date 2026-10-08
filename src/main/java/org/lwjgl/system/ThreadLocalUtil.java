/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.system;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Configuration;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Pointer;
import org.lwjgl.system.jni.JNINativeInterface;

public final class ThreadLocalUtil {
    private static final long JNI_NATIVE_INTERFACE = MemoryUtil.memGetAddress(ThreadLocalUtil.getThreadJNIEnv());
    private static final int CAPABILITIES_OFFSET = Pointer.POINTER_SIZE * 3;
    private static final long RESERVED_NULL = MemoryUtil.memGetAddress(JNI_NATIVE_INTERFACE + (long)CAPABILITIES_OFFSET);
    private static final int JNI_NATIVE_INTERFACE_FUNCTION_COUNT;
    private static final long FUNCTION_MISSING_ABORT;
    private static long FUNCTION_MISSING_ABORT_TABLE;

    private ThreadLocalUtil() {
    }

    private static native long getThreadJNIEnv();

    private static native long getFunctionMissingAbort();

    private static native long setupEnvData(int var0);

    public static void setCapabilities(long l) {
        long l2 = ThreadLocalUtil.getThreadJNIEnv();
        long l3 = MemoryUtil.memGetAddress(l2);
        if (l == 0L) {
            if (l3 != JNI_NATIVE_INTERFACE) {
                MemoryUtil.memPutAddress(l3 + (long)CAPABILITIES_OFFSET, FUNCTION_MISSING_ABORT_TABLE);
            }
        } else {
            if (l3 == JNI_NATIVE_INTERFACE) {
                ThreadLocalUtil.setupEnvData(JNI_NATIVE_INTERFACE_FUNCTION_COUNT);
                l3 = MemoryUtil.memGetAddress(l2);
            }
            MemoryUtil.memPutAddress(l3 + (long)CAPABILITIES_OFFSET, l);
        }
    }

    public static void setFunctionMissingAddresses(int n) {
        block10: {
            block9: {
                long l;
                long l2;
                long l3;
                block8: {
                    l3 = JNI_NATIVE_INTERFACE;
                    l2 = l3 + (long)CAPABILITIES_OFFSET;
                    l = MemoryUtil.memGetAddress(l2);
                    if (n != 0) break block8;
                    l3 = FUNCTION_MISSING_ABORT_TABLE;
                    if (l == l3 && l3 != 0L) {
                        FUNCTION_MISSING_ABORT_TABLE = 0L;
                        MemoryUtil.getAllocator().free(l);
                        MemoryUtil.memPutAddress(l2, RESERVED_NULL);
                    }
                    break block9;
                }
                long l4 = RESERVED_NULL;
                if (l != l4) break block10;
                if (l != 0L) {
                    if (MemoryUtil.memGetAddress(l3) == l4) {
                        return;
                    }
                    System.err.println("[LWJGL] [ThreadLocalUtil] Unsupported JVM detected, this may result in a crash. Please inform LWJGL developers.");
                }
                FUNCTION_MISSING_ABORT_TABLE = MemoryUtil.getAllocator().malloc(Integer.toUnsignedLong(n) * (long)Pointer.POINTER_SIZE);
                for (int j = 0; j < n; ++j) {
                    l = FUNCTION_MISSING_ABORT_TABLE;
                    MemoryUtil.memPutAddress(Integer.toUnsignedLong(j) * (long)Pointer.POINTER_SIZE + l, FUNCTION_MISSING_ABORT);
                }
                MemoryUtil.memPutAddress(l2, FUNCTION_MISSING_ABORT_TABLE);
            }
            return;
        }
        throw new IllegalStateException("setFunctionMissingAddresses has been called already");
    }

    public static PointerBuffer setupAddressBuffer(PointerBuffer pointerBuffer) {
        for (int j = pointerBuffer.position(); j < pointerBuffer.limit(); ++j) {
            if (pointerBuffer.get(j) != 0L) continue;
            long l = FUNCTION_MISSING_ABORT;
            pointerBuffer.put(j, l);
        }
        return pointerBuffer;
    }

    public static boolean areCapabilitiesDifferent(PointerBuffer pointerBuffer, PointerBuffer pointerBuffer2) {
        for (int j = 0; j < pointerBuffer.remaining(); ++j) {
            if (pointerBuffer.get(j) == pointerBuffer2.get(j) || pointerBuffer2.get(j) == 0L) continue;
            return true;
        }
        return false;
    }

    static {
        FUNCTION_MISSING_ABORT = ThreadLocalUtil.getFunctionMissingAbort();
        FUNCTION_MISSING_ABORT_TABLE = 0L;
        int n = JNINativeInterface.GetVersion();
        int n2 = n != 65537 ? 4 : 12;
        switch (n) {
            default: {
                n = 233;
                APIUtil.DEBUG_STREAM.println("[LWJGL] [ThreadLocalUtil] Unsupported JNI version detected, this may result in a crash. Please inform LWJGL developers.");
                break;
            }
            case 0x180000: {
                n = 233;
                break;
            }
            case 0x150000: {
                n = 232;
                break;
            }
            case 0x130000: 
            case 0x140000: {
                n = 231;
                break;
            }
            case 589824: 
            case 655360: {
                n = 230;
                break;
            }
            case 65542: 
            case 65544: {
                n = 229;
                break;
            }
            case 65540: {
                n = 228;
                break;
            }
            case 65538: {
                n = 225;
                break;
            }
            case 65537: {
                n = 208;
            }
        }
        JNI_NATIVE_INTERFACE_FUNCTION_COUNT = (Integer)Configuration.JNI_NATIVE_INTERFACE_FUNCTION_COUNT.get(n) + n2;
    }
}

