package cn.pokemmo.rom.nds.bw;

import f.Ge;
import f.gn_2;
import f.lpt6__2;
import f.nj0_0;
import f.sm0_0;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * 黑白版训练家基础属性数据 (BW Trainer Data Entry)
 * <p>
 * 原始混淆类: {@code f.U20}
 */
public class BwTrainerDataEntry extends gn_2 {
    public final byte wE;
    public final byte Er0;
    public final Ge[] S30;
    public final short[] V1 = new short[4];

    public BwTrainerDataEntry(short var1, nj0_0 var2, ByteBuffer var3) {
        super((byte) 2, var1);
        if (var3.remaining() < 20) {
            this.wE = 0;
            this.Er0 = 0;
            this.S30 = new Ge[0];
        } else {
            this.wE = var3.get();
            this.Er0 = var3.get();
            byte var4;
            switch (var4 = var3.get()) {
                case 0:
                case 1:
                case 2:
                case 3:
                    this.S30 = new Ge[var3.get() & 255];
                    var4 = 0;
                    while (var4 < this.V1.length) {
                        this.V1[var4] = var3.getShort();
                        var4++;
                    }
                    var3.get();
                    ((Buffer) var3).position(var3.position() + 3);
                    var3.get();
                    var3.get();
                    var3.getShort();
                    break;
                default:
                    throw new RuntimeException(var4 + "");
            }
        }
    }

    @Override
    public String gK0() {
        lpt6__2 var4 = lpt6__2.Q80;
        short var1 = 190;
        short var2 = super.vn;
        String[] var3 = sm0_0.zb0;
        return sm0_0.Bw((byte) 2, var4, var1, var2, var3);
    }

    @Override
    public byte VK0() {
        return this.Er0;
    }

    @Override
    public short A5() {
        byte var1;
        if ((var1 = this.Er0) < 47) {
            return var1;
        }
        if (var1 == 47) {
            return 40;
        }
        if (var1 < 92) {
            return (short) (var1 - 1);
        }
        switch (var1) {
            case 92: return 71;
            case 93: return 4;
            case 94: return 70;
            case 95: return 74;
            case 96: return 75;
            case 97: return 69;
            case 98: return 42;
            case 99: return 41;
            case 100: return 91;
            case 101: return 40;
            case 102: return 92;
            case 103: return 93;
            case 104: return 94;
            default: return 0;
        }
    }

    public boolean uR() {
        return (this.wE & 1) != 0;
    }

    public boolean Vn() {
        return (this.wE & 2) != 0;
    }
}
