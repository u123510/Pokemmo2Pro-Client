/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.rom.chunk;

import f.*;

import com.badlogic.gdx.math.Matrix4;
import f.C8;
import f.be0_1;
import f.es_1;
import f.i00_0;
import f.me0_2;
import f.px_1;
import java.nio.ByteBuffer;

public class MoveEffectRomChunk
extends BaseRomResourceChunk {
    public int zz;
    public float RM;
    public final C8 e9 = new C8();
    public float KA0;
    public final C8 Xi = new C8(1.0f, 1.0f, 1.0f);
    public final C8 Vt = new C8(1.0f, 1.0f, 1.0f);
    public final me0_2 COm7 = new me0_2().Rx0();
    public final Matrix4 Rc0 = new Matrix4();
    public final es_1 eB = new es_1();
    public final es_1 OA = new es_1();
    public Matrix4 go;

    static {
        new Matrix4();
    }

    @Override
    public final void pH(ByteBuffer byteBuffer, int ... nArray) {
        this.a00 = byteBuffer.getInt();
    }

    @Override
    public final void vD(ByteBuffer byteBuffer) {
        float f;
        float f2;
        this.zz = byteBuffer.getShort() & 0xFFFF;
        this.RM = px_1.dg(byteBuffer.getShort(), 3, 12);
        if ((this.zz & 1) == 0) {
            this.e9.x = px_1.Ei0(byteBuffer.getInt());
            this.e9.y = px_1.Ei0(byteBuffer.getInt());
            this.e9.z = px_1.Ei0(byteBuffer.getInt());
        }
        if ((this.zz & 2) == 0) {
            Matrix4 matrix4;
            this.go = matrix4 = new Matrix4().F();
            if ((this.zz & 8) != 0) {
                i00_0 i00_02;
                float[] fArray;
                this.KA0 = px_1.dg(byteBuffer.getShort(), 3, 12);
                float f3 = px_1.dg(byteBuffer.getShort(), 3, 12);
                int n = this.zz;
                int n2 = n >> 4 & 0xF;
                int n3 = n >> 8;
                int n4 = n3 & 0xF;
                float f4 = this.KA0;
                float f5 = (n3 & 1) == 0 ? 1.0f : -1.0f;
                float f6 = (n4 >> 1 & 1) == 0 ? f3 : -f3;
                float f7 = (n4 >> 2 & 1) == 0 ? f4 : -f4;
                switch (n2) {
                    default: {
                        float[] fArray2 = new float[9];
                        fArray = fArray2;
                        fArray2[0] = 0.0f;
                        fArray2[1] = 0.0f;
                        fArray2[2] = 0.0f;
                        fArray2[3] = 0.0f;
                        fArray2[4] = 0.0f;
                        fArray2[5] = 0.0f;
                        fArray2[6] = 0.0f;
                        fArray2[7] = 0.0f;
                        fArray2[8] = 0.0f;
                        break;
                    }
                    case 8: {
                        float[] fArray3 = new float[9];
                        float[] fArray4 = fArray3;
                        fArray3[0] = f4;
                        fArray3[1] = f3;
                        fArray3[2] = 0.0f;
                        fArray3[3] = f6;
                        fArray3[4] = f7;
                        fArray3[5] = 0.0f;
                        fArray3[6] = 0.0f;
                        fArray3[7] = 0.0f;
                        fArray3[8] = f5;
                        fArray = fArray4;
                        break;
                    }
                    case 7: {
                        float[] fArray5 = new float[9];
                        float[] fArray6 = fArray5;
                        fArray5[0] = f4;
                        fArray5[1] = 0.0f;
                        fArray5[2] = f3;
                        fArray5[3] = f6;
                        fArray5[4] = 0.0f;
                        fArray5[5] = f7;
                        fArray5[6] = 0.0f;
                        fArray5[7] = f5;
                        fArray5[8] = 0.0f;
                        fArray = fArray6;
                        break;
                    }
                    case 6: {
                        float[] fArray7 = new float[9];
                        float[] fArray8 = fArray7;
                        fArray7[0] = 0.0f;
                        fArray7[1] = f4;
                        fArray7[2] = f3;
                        fArray7[3] = 0.0f;
                        fArray7[4] = f6;
                        fArray7[5] = f7;
                        fArray7[6] = f5;
                        fArray7[7] = 0.0f;
                        fArray7[8] = 0.0f;
                        fArray = fArray8;
                        break;
                    }
                    case 5: {
                        float[] fArray9 = new float[9];
                        float[] fArray10 = fArray9;
                        fArray9[0] = f4;
                        fArray9[1] = f3;
                        fArray9[2] = 0.0f;
                        fArray9[3] = 0.0f;
                        fArray9[4] = 0.0f;
                        fArray9[5] = f5;
                        fArray9[6] = f6;
                        fArray9[7] = f7;
                        fArray9[8] = 0.0f;
                        fArray = fArray10;
                        break;
                    }
                    case 4: {
                        float[] fArray11 = new float[9];
                        float[] fArray12 = fArray11;
                        fArray11[0] = f4;
                        fArray11[1] = 0.0f;
                        fArray11[2] = f3;
                        fArray11[3] = 0.0f;
                        fArray11[4] = f5;
                        fArray11[5] = 0.0f;
                        fArray11[6] = f6;
                        fArray11[7] = 0.0f;
                        fArray11[8] = f7;
                        fArray = fArray12;
                        break;
                    }
                    case 3: {
                        float[] fArray13 = new float[9];
                        float[] fArray14 = fArray13;
                        fArray13[0] = 0.0f;
                        fArray13[1] = f4;
                        fArray13[2] = f3;
                        fArray13[3] = f5;
                        fArray13[4] = 0.0f;
                        fArray13[5] = 0.0f;
                        fArray13[6] = 0.0f;
                        fArray13[7] = f6;
                        fArray13[8] = f7;
                        fArray = fArray14;
                        break;
                    }
                    case 2: {
                        float[] fArray15 = new float[9];
                        float[] fArray16 = fArray15;
                        fArray15[0] = 0.0f;
                        fArray15[1] = 0.0f;
                        fArray15[2] = f5;
                        fArray15[3] = f4;
                        fArray15[4] = f3;
                        fArray15[5] = 0.0f;
                        fArray15[6] = f6;
                        fArray15[7] = f7;
                        fArray15[8] = 0.0f;
                        fArray = fArray16;
                        break;
                    }
                    case 1: {
                        float[] fArray17 = new float[9];
                        float[] fArray18 = fArray17;
                        fArray17[0] = 0.0f;
                        fArray17[1] = f5;
                        fArray17[2] = 0.0f;
                        fArray17[3] = f4;
                        fArray17[4] = 0.0f;
                        fArray17[5] = f3;
                        fArray17[6] = f6;
                        fArray17[7] = 0.0f;
                        fArray17[8] = f7;
                        fArray = fArray18;
                        break;
                    }
                    case 0: {
                        float[] fArray19 = new float[9];
                        float[] fArray20 = fArray19;
                        fArray19[0] = f5;
                        fArray19[1] = 0.0f;
                        fArray19[2] = 0.0f;
                        fArray19[3] = 0.0f;
                        fArray19[4] = f4;
                        fArray19[5] = f3;
                        fArray19[6] = 0.0f;
                        fArray19[7] = f6;
                        fArray19[8] = f7;
                        fArray = fArray20;
                    }
                }
                i00_0 i00_03 = new i00_0(fArray);
                me0_2 me0_22 = this.COm7;
                me0_22.getClass();
                boolean bl = false;
                f = i00_03.Z2[0];
                f7 = i00_03.Z2[3];
                f4 = i00_03.Z2[6];
                f5 = i00_03.Z2[1];
                f6 = i00_03.Z2[4];
                float f8 = i00_03.Z2[7];
                float f9 = i00_03.Z2[2];
                float f10 = i00_03.Z2[5];
                float f11 = i00_03.Z2[8];
                me0_22.WA0(bl, f, f7, f4, f5, f6, f8, f9, f10, f11);
            } else {
                matrix4.EW[0] = this.RM;
                matrix4.EW[1] = px_1.dg(byteBuffer.getShort(), 3, 12);
                this.go.EW[2] = px_1.dg(byteBuffer.getShort(), 3, 12);
                this.go.EW[4] = px_1.dg(byteBuffer.getShort(), 3, 12);
                this.go.EW[5] = px_1.dg(byteBuffer.getShort(), 3, 12);
                this.go.EW[6] = px_1.dg(byteBuffer.getShort(), 3, 12);
                this.go.EW[8] = px_1.dg(byteBuffer.getShort(), 3, 12);
                this.go.EW[9] = px_1.dg(byteBuffer.getShort(), 3, 12);
                this.go.EW[10] = px_1.dg(byteBuffer.getShort(), 3, 12);
                this.COm7.et0(false, this.go);
            }
        }
        if ((this.zz & 4) == 0) {
            this.Xi.x = px_1.Ei0(byteBuffer.getInt());
            this.Xi.y = px_1.Ei0(byteBuffer.getInt());
            this.Xi.z = px_1.Ei0(byteBuffer.getInt());
            this.Vt.x = px_1.Ei0(byteBuffer.getInt());
            this.Vt.y = px_1.Ei0(byteBuffer.getInt());
            this.Vt.z = px_1.Ei0(byteBuffer.getInt());
        }
        new Matrix4().F().oF0(this.e9, this.COm7, this.Xi);
    }
}

