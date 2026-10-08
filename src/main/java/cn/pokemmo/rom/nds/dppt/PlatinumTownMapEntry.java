package cn.pokemmo.rom.nds.dppt;

import f.Lo0;
import f.RP;
import f.sm0_0;
import java.nio.ByteBuffer;

/**
 * 白金（Platinum）城镇地图网格条目
 */
public class PlatinumTownMapEntry extends RP {
    public final short p;
    public final Lo0 Cv;

    public PlatinumTownMapEntry(Lo0 owner, ByteBuffer blocks, ByteBuffer flags) {
        super();
        this.Cv = owner;
        byte[] rawFlags = new byte[4];
        this.eW = (byte) 3;
        this.l40 = blocks.getShort();
        this.fQ = blocks.getShort();
        blocks.getShort();
        blocks.getShort();
        int type = blocks.getShort();
        blocks.getShort();
        blocks.getShort();
        blocks.getShort();
        blocks.getShort();
        blocks.getShort();
        blocks.getShort();
        blocks.getShort();
        flags.get(rawFlags);
        int tile = owner.If.V10(0).l1[this.l40][this.fQ];
        if (tile > 0) {
            this.Yr0 = (short) tile;
            this.p = (short) owner.If.na(tile).tN;
        } else if (type == 120) {
            this.Yr0 = (short) 207;
            this.p = (short) owner.If.na(207).tN;
        } else if (type == 129) {
            this.Yr0 = (short) 560;
            this.p = (short) owner.If.na(560).tN;
        } else {
            this.p = 0;
        }
    }

    @Override
    public String zh0() {
        return sm0_0.hL0((this.p & 0xFF) + 143000, "???");
    }

    public short getPlaceId() {
        return this.p;
    }
}
