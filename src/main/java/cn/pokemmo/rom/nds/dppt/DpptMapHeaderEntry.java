package cn.pokemmo.rom.nds.dppt;

import f.VG;
import f.Z50;
import f.gh_0;
import f.l50_0;
import f.lpt6__2;
import f.sm0_0;
import java.nio.ByteBuffer;

/**
 * 第4世代 (DPPt / HGSS) 单张地图描述符
 * 原混淆类: f.Ao0
 */
public class DpptMapHeaderEntry extends Z50 {
    public gh_0 mapType;
    public gh_0 ii;

    public DpptMapHeaderEntry(short mapId, l50_0 rom, ByteBuffer buffer) {
        super(mapId, rom, buffer);
    }

    @Override
    public final void ib0() {
        if (this.lU.Tz() == 3) {
            // Sinnoh (Diamond/Pearl/Platinum)
            this.T70 = (short) this.Gs0.get();
            this.matrixId = this.T70;
            this.Gs0.get();
            this.Va0 = this.Gs0.getShort();
            this.mapNameId = this.Va0;
            this.Zd = this.Gs0.getShort();
            this.scriptId = this.Zd;
            this.Gs0.getShort();
            this.Gs0.getShort();
            this.qh0 = this.Gs0.getShort();
            this.z1 = this.Gs0.getShort();
            this.Gs0.getShort();
            this.ES = this.Gs0.getShort();
            this.bgmNight = this.ES;
            this.tN = this.Gs0.get();
            this.weather = this.tN;
            this.Gs0.get();
            this.Z60 = this.Gs0.get();
            this.b9 = this.Gs0.get();

            gh_0 type;
            this.mr0 = this.Gs0.getShort();
            this.flags = this.mr0;
            switch ((byte) (this.mr0 & 7)) {
                case 1:
                    type = gh_0.LF;
                    break;
                case 2:
                    type = gh_0.wZ;
                    break;
                case 3:
                case 6:
                    type = gh_0.fs0;
                    break;
                case 4:
                    type = gh_0.tA;
                    break;
                case 0:
                case 5:
                default:
                    type = gh_0.YR;
                    break;
            }
            this.mapType = type;
            this.ii = type;
        } else {
            // Johto / Kanto (HeartGold/SoulSilver)
            this.Gs0.get();
            this.T70 = (short) this.Gs0.get();
            this.matrixId = this.T70;
            this.Gs0.getShort();
            this.Va0 = this.Gs0.getShort();
            this.mapNameId = this.Va0;
            this.Zd = this.Gs0.getShort();
            this.scriptId = this.Zd;
            this.Gs0.getShort();
            this.Gs0.getShort();
            this.qh0 = this.Gs0.getShort();
            this.z1 = this.Gs0.getShort();
            this.ES = this.Gs0.getShort();
            this.bgmNight = this.ES;
            this.tN = this.Gs0.get();
            this.weather = this.tN;
            this.Gs0.get();
            this.Z60 = (byte) (((short) this.Gs0.get()) >> 1 & 255);

            short extra = this.Gs0.getShort();
            gh_0 type;
            switch ((byte) (extra & 7)) {
                case 1:
                    type = gh_0.LF;
                    break;
                case 2:
                    type = gh_0.wZ;
                    break;
                case 3:
                case 6:
                    type = gh_0.fs0;
                    break;
                case 4:
                    type = gh_0.tA;
                    break;
                case 0:
                case 5:
                default:
                    type = gh_0.YR;
                    break;
            }
            this.mapType = type;
            this.ii = type;
            this.b9 = (byte) (extra >> 4 & 63);
            this.mr0 = (short) this.Gs0.get();
            this.flags = this.mr0;
            if (this.O60 >= 343 && this.O60 <= 354) {
                this.qh0 = 1159;
                this.z1 = 1159;
            }
        }

        short matrix = this.T70;
        this.IJ = this.lU.gQ.UL0[matrix];
    }

    @Override
    public final void KJ() {
        this.IJ = this.lU.gQ.UL0[this.T70];
    }

    @Override
    public final String mn() {
        if (this.lU.Tz() == 4 && this.O60 >= 343 && this.O60 <= 354) {
            StringBuilder sb = new StringBuilder().append(getName()).append(" (");
            short var1 = (short) (this.O60 - 327);
            return VG.Mq(sb, sm0_0.Bw((byte) 4, lpt6__2.Q80, (short) 429, var1, sm0_0.zb0), ")");
        }
        return getName();
    }

    @Override
    public final gh_0 IU() {
        return this.mapType != null ? this.mapType : this.ii;
    }

    @Override
    public final boolean Ap() {
        if (this.lU.Tz() == 4) {
            switch (this.O60) {
                case 115:
                case 220:
                case 222:
                case 223:
                case 224:
                case 247:
                case 248:
                case 249:
                    return true;
                default:
                    gh_0 type = IU();
                    return type == gh_0.tA || type == gh_0.fs0;
            }
        } else {
            if (this.lU.Tz() == 3) {
                byte w = this.tN;
                if (w == 53) {
                    return true;
                }
                if (w == 56 || w == 117) {
                    return false;
                }
            }
            return IU() == gh_0.tA;
        }
    }

    public final boolean ts0() {
        if (this.lU.Tz() == 4) {
            switch (this.O60) {
                case 115:
                case 220:
                case 222:
                case 223:
                case 224:
                case 247:
                case 248:
                case 249:
                    return true;
            }
        } else {
            byte w = this.tN;
            if (this.lU.Tz() == 3 && (w == 117 || w == 56)) {
                return false;
            }
        }
        return IU() == gh_0.tA;
    }

    @Override
    public final boolean c40() {
        if (this.lU.Tz() == 3) {
            return hk((short) Short.MIN_VALUE);
        } else {
            return this.lU.Tz() == 4 && hk((short) 16);
        }
    }

    @Override
    public final boolean j2() {
        if (this.lU.Tz() == 3) {
            return hk((short) 16384);
        } else {
            return this.lU.Tz() == 4 && hk((short) 8);
        }
    }

    @Override
    public DpptMapHeaderEntry or() {
        return (DpptMapHeaderEntry) super.or();
    }
}
