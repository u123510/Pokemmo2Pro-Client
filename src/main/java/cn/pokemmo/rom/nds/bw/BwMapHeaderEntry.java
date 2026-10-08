package cn.pokemmo.rom.nds.bw;

import f.Z50;
import f.c8_0;
import f.gh_0;
import f.sm0_0;
import java.nio.ByteBuffer;

/**
 * 黑白 (Gen 5) 单张地图 48 字节头部描述符
 * 原混淆类: f.ug_0
 */
public class BwMapHeaderEntry extends Z50 {
    public BwMapHeaderEntry(short mapId, BlackWhiteRom rom, ByteBuffer buffer) {
        super(mapId, rom, buffer);
    }

    @Override
    public final void ib0() {
        this.WH0 = this.Gs0.get();
        this.areaType = this.WH0;
        this.Gs0.get(); // padding
        this.T70 = this.Gs0.getShort();
        this.matrixId = this.T70;
        this.Va0 = this.Gs0.getShort();
        this.mapNameId = this.Va0;
        this.Zd = this.Gs0.getShort();
        this.scriptId = this.Zd;
        this.Gs0.getShort();
        this.Gs0.getShort();
        this.Tq0 = this.Gs0.getShort();
        this.eventId = this.Tq0;
        this.hC0 = this.Gs0.getShort();
        this.aV = this.Gs0.getShort();
        this.xS = this.Gs0.getShort();
        this.bgmDay = this.xS;
        this.Gs0.getShort();
        this.ES = this.Gs0.getShort();
        this.bgmNight = this.ES;
        this.i70 = this.Gs0.getShort();
        this.battleBgm = this.i70;
        this.tN = this.Gs0.get();
        this.weather = this.tN;
        this.Gs0.get();
        this.Z60 = this.Gs0.get();
        this.b9 = this.Gs0.get();
        this.mr0 = this.Gs0.getShort();
        this.flags = this.mr0;
        this.Ot0 = this.Gs0.getShort();
        this.areaId = this.Ot0;
        this.Gs0.get();
        this.Gs0.get();
        this.zc0 = this.Gs0.getInt();
        this.flag1 = this.zc0;
        this.rB0 = this.Gs0.getInt();
        this.flag2 = this.rB0;
        this.Ph0 = this.Gs0.getInt();
        this.flag3 = this.Ph0;
        KJ();
    }

    @Override
    public final void KJ() {
        short s = this.T70;
        if (s >= 2 && s <= 206) {
            s = (short) (s + c8_0.JD0.YG());
        }
        this.IJ = this.lU.gQ.UL0[s];
        this.TC0 = ((BlackWhiteRom) this.lU).Oq0.Vo0[this.IJ.aw0];
    }

    @Override
    public final String mn() {
        if (this.Va0 == 175) {
            return getName() + " (" + sm0_0.c0(this.lU.Tz() * 1000 + 140069) + ")";
        }
        return getName();
    }

    @Override
    public final gh_0 IU() {
        if (hk((short) 4096)) {
            return gh_0.fs0;
        }
        return gh_0.wZ;
    }

    @Override
    public final boolean c40() {
        return hk((short) 8192);
    }

    @Override
    public final boolean j2() {
        return hk((short) 4096);
    }

    @Override
    public final boolean Ap() {
        return this.IJ.A == 0;
    }

    @Override
    public BwMapHeaderEntry or() {
        return (BwMapHeaderEntry) super.or();
    }
}
