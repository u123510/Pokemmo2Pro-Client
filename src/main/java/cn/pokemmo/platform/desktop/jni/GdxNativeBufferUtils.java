/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.platform.desktop.jni;

import f.*;


import com.badlogic.gdx.utils.BufferUtils;
import f.i4_0;
import f.ix0_0;
import f.lg_0;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/*
 * Renamed from f.kr
 */
public abstract class GdxNativeBufferUtils {
    public static i4_0 R4() {
        int n = 0;
        int n2 = 0;
        int n3 = lg_0.S4.cJ;
        int n4 = lg_0.S4.eP;
        lg_0.OH0.glPixelStorei(3333, 1);
        int n5 = n3 * n4 * 4;
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(n5);
        byteBuffer.order(ByteOrder.nativeOrder());
        lg_0.OH0.glReadPixels(n, n2, n3, n4, 6408, 5121, byteBuffer);
        byte[] byArray = new byte[n5];
        n2 = n3 * 4;
        for (n3 = 0; n3 < n4; ++n3) {
            ((Buffer)byteBuffer).position((n4 - n3 - 1) * n2);
            byteBuffer.get(byArray, n3 * n2, n2);
        }
        for (n2 = 0; n2 < n5; n2 += 4) {
            byArray[n2 + 3] = -1;
        }
        i4_0 i4_02 = new i4_0(lg_0.S4.cJ, lg_0.S4.eP, ix0_0.Vw);
        BufferUtils.n9(byArray, i4_02.Rh0(), n5);
        return i4_02;
    }
}

