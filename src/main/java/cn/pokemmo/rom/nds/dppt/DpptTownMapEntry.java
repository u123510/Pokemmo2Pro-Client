package cn.pokemmo.rom.nds.dppt;

import f.RP;
import java.nio.ByteBuffer;

/**
 * 珍钻/白金/心金魂银（DPPT/HGSS）城镇地图条目
 */
public class DpptTownMapEntry extends RP {
    public short[] Yb;

    public DpptTownMapEntry(byte i1, ByteBuffer v2) {
        this.Yb = new short[7];
        this.eW = 2;
        this.ZD0 = i1;
        this.Yr0 = v2.getShort();
        v2.getShort();
        this.l40 = v2.getShort();
        this.fQ = v2.getShort();
        v2.getShort();
        v2.getShort();
        v2.getShort();
        v2.getShort();
        v2.getShort();
        v2.getShort();
        v2.getShort();
        this.At0 = v2.getShort();
        this.MF0 = (v2.getShort() == 1);
        v2.getShort();
        v2.getShort();
        this.Jx = v2.getShort();
        v2.getShort();
        for (int i = 0; i < this.Yb.length; i++) {
            this.Yb[i] = v2.getShort();
        }
        v2.getShort();
        v2.getShort();
        v2.getShort();
    }
}
