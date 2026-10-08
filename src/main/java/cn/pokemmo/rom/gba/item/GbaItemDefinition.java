package cn.pokemmo.rom.gba.item;

import f.*;

import java.nio.ByteBuffer;
import java.util.ArrayList;

public class GbaItemDefinition {
    public final byte ar;
    public final byte ds;
    public final byte v1;
    public final short Vk0;
    public final int rc;
    public final int R3;
    public final int fC0;
    public final String Ip;
    public final String hN;
    public final ArrayList Es0;

    public GbaItemDefinition(qa0_1 qa0_1Var, byte b, int i) {
        this.Es0 = new ArrayList();

        ByteBuffer byteBuffer = qa0_1Var.vy0();
        byteBuffer.position(i);
        this.ar = b;
        this.ds = qa0_1Var.rt0();
        byte b2 = byteBuffer.get();
        if (b2 == 4) {
            this.v1 = byteBuffer.get();
        } else {
            byteBuffer.get();
            this.v1 = -1;
        }

        this.Vk0 = byteBuffer.getShort();
        if (b2 == 2 || b2 == 5) {
            byteBuffer.getInt();
        }

        this.rc = G90.GF0(byteBuffer.getInt());
        if (b2 != 2) {
            this.R3 = G90.GF0(byteBuffer.getInt());
        } else {
            this.R3 = 0;
        }
        if (b2 != 3) {
            this.fC0 = G90.GF0(byteBuffer.getInt());
        } else {
            this.fC0 = 0;
        }

        this.Ip = mz_1.Xc(b20(), qa0_1Var.vy0());
        if (b2 == 2) {
            this.hN = wn_1.fj0().vi((byte) 1, (short) 519).gK0();
        } else {
            this.hN = mz_1.Xc(Od(), qa0_1Var.vy0());
        }

        int i2 = this.fC0;
        if (i2 > 0) {
            byteBuffer.position(i2);
            while (true) {
                int nextInt = byteBuffer.getInt();
                byteBuffer.getShort();
                byteBuffer.getShort();
                if (!G90.Uh0(nextInt)) {
                    break;
                }
                this.Es0.add(new uj_1(G90.GF0(nextInt), qa0_1Var));
            }
        }
    }

    public final byte Ys() {
        return this.ar;
    }

    public final byte yB() {
        return this.ds;
    }

    public final byte PS() {
        return this.v1;
    }

    public final short nQ() {
        return this.Vk0;
    }

    public final int b20() {
        return this.rc;
    }

    public final int Od() {
        return this.R3;
    }

    public final String xM() {
        return this.Ip;
    }

    public final String Pc() {
        if (this.hN.isEmpty() && P3() != null) {
            return P3().gK0();
        }
        return this.hN;
    }

    public final gn_2 P3() {
        wn_1 wn_1Var = wn_1.pn;
        byte b = this.ds;
        byte b2 = this.ar;
        short s;
        if (b2 == 4) {
            s = 519;
        } else if (b2 == 5) {
            s = 269;
        } else {
            switch (b2) {
                case 9:
                    s = 265;
                    break;
                case 10:
                    s = 266;
                    break;
                case 11:
                    s = 267;
                    break;
                case 12:
                    s = 268;
                    break;
                case 13:
                    s = 270;
                    break;
                case 14:
                    s = 271;
                    break;
                case 15:
                    s = 272;
                    break;
                case 16:
                    s = 261;
                    break;
                case 17:
                    s = 262;
                    break;
                case 18:
                    s = 263;
                    break;
                case 19:
                    s = 264;
                    break;
                case 20:
                    s = 335;
                    break;
                default:
                    s = -1;
                    break;
            }
        }
        return wn_1Var.vi(b, s);
    }
}
