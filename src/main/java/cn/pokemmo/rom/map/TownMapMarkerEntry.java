package cn.pokemmo.rom.map;

import f.RP;

/**
 * 城镇地图标记点条目
 */
public class TownMapMarkerEntry extends RP {
    public int Lr0;
    public int pL;
    public int HE;
    public int RB;
    public int lpT9;
    public int By0;

    public TownMapMarkerEntry(int i1, int i2, int i3) {
        super();
        this.Yr0 = (short) i1;
        this.fQ = (short) i2;
        this.l40 = (short) i3;
        this.eW = 4;
        this.At0 = 1;
    }

    public static TownMapMarkerEntry createMarker(int i0, int i1, int i2, int i3, int i4, int i5, int i6) {
        TownMapMarkerEntry q = new TownMapMarkerEntry(0, 0, 0);
        q.At0 = 0;
        q.Jx = (short) i0;
        q.Lr0 = i1;
        q.pL = i2;
        q.HE = i3;
        q.RB = i4;
        q.lpT9 = i5;
        q.By0 = i6;
        return q;
    }

    public TownMapMarkerEntry wa0(int i1, int i2) {
        this.MF0 = true;
        this.ZD0 = (byte) i1;
        this.Jx = (short) i2;
        return this;
    }
}
