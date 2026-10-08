package f;

import cn.pokemmo.rom.map.TownMapMarkerEntry;

/**
 * 城镇地图标记点条目垫片
 * 现代化实现: cn.pokemmo.rom.map.TownMapMarkerEntry
 */
public final class qg_1 extends TownMapMarkerEntry {
    public qg_1(int i1, int i2, int i3) {
        super(i1, i2, i3);
    }

    public static qg_1 xf(int i0, int i1, int i2, int i3, int i4, int i5, int i6) {
        qg_1 q = new qg_1(0, 0, 0);
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

    public final qg_1 wa0(int i1, int i2) {
        super.wa0(i1, i2);
        return this;
    }
}
