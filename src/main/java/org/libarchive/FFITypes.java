/*
 * Decompiled with CFR 0.152.
 */
package org.libarchive;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import f.co0;
import java.util.HashMap;

public abstract class FFITypes {
    public static /* synthetic */ int p20;

    private static native long getNativeType(int var0);

    static {
        HashMap<Integer, co0> hashMap2 = new HashMap<Integer, co0>();
        co0 co02 = CHandler.oz0(FFITypes.getNativeType(-2), "void");
        hashMap2.put(-2, co02);
        co02 = CHandler.oz0(FFITypes.getNativeType(-1), "void*");
        hashMap2.put(-1, co02);
        co02 = CHandler.oz0(FFITypes.getNativeType(0), "char");
        hashMap2.put(0, co02);
        CHandler.He((co0)hashMap2.get(0));
        co02 = CHandler.oz0(FFITypes.getNativeType(1), "const char");
        hashMap2.put(1, co02);
        CHandler.He((co0)hashMap2.get(1));
        co02 = CHandler.oz0(FFITypes.getNativeType(2), "const unsigned char");
        hashMap2.put(2, co02);
        CHandler.He((co0)hashMap2.get(2));
        co02 = CHandler.oz0(FFITypes.getNativeType(3), "const wchar_t");
        hashMap2.put(3, co02);
        CHandler.He((co0)hashMap2.get(3));
        co02 = CHandler.oz0(FFITypes.getNativeType(4), "dev_t");
        hashMap2.put(4, co02);
        CHandler.He((co0)hashMap2.get(4));
        co02 = CHandler.oz0(FFITypes.getNativeType(5), "int");
        hashMap2.put(5, co02);
        CHandler.He((co0)hashMap2.get(5));
        co02 = CHandler.oz0(FFITypes.getNativeType(6), "la_int64_t");
        hashMap2.put(6, co02);
        CHandler.He((co0)hashMap2.get(6));
        co02 = CHandler.oz0(FFITypes.getNativeType(7), "la_ssize_t");
        hashMap2.put(7, co02);
        CHandler.He((co0)hashMap2.get(7));
        co02 = CHandler.oz0(FFITypes.getNativeType(8), "long");
        hashMap2.put(8, co02);
        CHandler.He((co0)hashMap2.get(8));
        co02 = CHandler.oz0(FFITypes.getNativeType(9), "mode_t");
        hashMap2.put(9, co02);
        CHandler.He((co0)hashMap2.get(9));
        co02 = CHandler.oz0(FFITypes.getNativeType(10), "size_t");
        hashMap2.put(10, co02);
        CHandler.He((co0)hashMap2.get(10));
        co02 = CHandler.oz0(FFITypes.getNativeType(11), "time_t");
        hashMap2.put(11, co02);
        CHandler.He((co0)hashMap2.get(11));
        co02 = CHandler.oz0(FFITypes.getNativeType(12), "unsigned int");
        hashMap2.put(12, co02);
        CHandler.He((co0)hashMap2.get(12));
        co02 = CHandler.oz0(FFITypes.getNativeType(13), "unsigned long");
        hashMap2.put(13, co02);
        CHandler.He((co0)hashMap2.get(13));
        co02 = CHandler.oz0(FFITypes.getNativeType(14), "wchar_t");
        hashMap2.put(14, co02);
        CHandler.He((co0)hashMap2.get(14));
        co02 = CHandler.Ts(FFITypes.getNativeType(15));
        hashMap2.put(15, co02);
        co02 = CHandler.Ts(FFITypes.getNativeType(16));
        hashMap2.put(16, co02);
        co02 = CHandler.Ts(FFITypes.getNativeType(17));
        hashMap2.put(17, co02);
        co02 = CHandler.Ts(FFITypes.getNativeType(18));
        hashMap2.put(18, co02);
    }
}

