package cn.pokemmo.rom.nds.base;

import f.gh_0;
import f.hb_1;
import f.km0;
import f.l50_0;
import f.sm0_0;
import java.nio.ByteBuffer;

/**
 * NDS 单张地图描述基类
 * 原混淆类: f.Z50
 */
public abstract class AbstractMapEntry implements Cloneable {
    public final l50_0 rom;
    public final l50_0 lU;

    public short mapId;
    public short matrixId;
    public short mapNameId;
    public short scriptId;
    public short eventId = (short) -1;
    public short initScriptId = (short) -1;
    public short parentMapId = (short) -1;
    public short bgmDay = (short) -1;
    public short qh0 = (short) -1;
    public short z1 = (short) -1;
    public short bgmNight;
    public short battleBgm;
    public byte weather;
    public byte cameraProfile;
    public byte battleTerrain;
    public short flags;
    public byte areaType;
    public short areaId;
    public int flag1;
    public int flag2;
    public int flag3;
    public km0 IJ;
    public hb_1 TC0;
    public final ByteBuffer buffer;

    // 兼容混淆字段别名
    public short O60;
    public short T70;
    public short Va0;
    public short Zd;
    public short Tq0 = (short) -1;
    public short hC0 = (short) -1;
    public short aV = (short) -1;
    public short xS = (short) -1;
    public short ES;
    public short i70;
    public byte tN;
    public byte Z60;
    public byte b9;
    public short mr0;
    public byte WH0;
    public short Ot0;
    public int zc0;
    public int rB0;
    public int Ph0;
    public final ByteBuffer Gs0;

    public AbstractMapEntry(short mapId, l50_0 rom, ByteBuffer buffer) {
        this.mapId = mapId;
        this.O60 = mapId;
        this.rom = rom;
        this.lU = rom;
        this.buffer = buffer;
        this.Gs0 = buffer;
        buffer.position();
        this.ib0();
    }

    public abstract void ib0();

    public abstract void KJ();

    public final String getName() {
        return sm0_0.hL0(this.rom.Tz() * 1000 + 140000 + (this.weather & 0xFF), "???");
    }

    public abstract String mn();

    public final boolean hk(short s) {
        return (this.mr0 & s) != 0;
    }

    public final km0 ac() {
        return this.IJ;
    }

    public final byte Qy() {
        return this.rom.Tz();
    }

    public gh_0 IU() {
        if (hk((short) 4096)) {
            return gh_0.fs0;
        }
        return gh_0.wZ;
    }

    public boolean c40() {
        return hk((short) 8192);
    }

    public boolean j2() {
        return hk((short) 4096);
    }

    public boolean Ap() {
        return false;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public AbstractMapEntry or() {
        try {
            return (AbstractMapEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
