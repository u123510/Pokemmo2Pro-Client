package cn.pokemmo.world.map;

import f.*;

public class TileCollisionQuadTree {
    public final CH0 Vj;
    public String lt0;
    public String M1;
    public int Ym0;
    public String VB;
    public String[] j7;
    public short LPt9;
    public short QH0;
    public short fI0;
    public short eD;
    public short Db;
    public int hr;

    public TileCollisionQuadTree(CH0 id, String first, String second, int value, String name,
                int ignored, short lp, short qh, short fi, short ed, short db,
                int count, String[] values) {
        this.Vj = id;
        this.lt0 = first;
        this.M1 = second;
        this.Ym0 = value;
        this.VB = name;
        this.LPt9 = lp;
        this.QH0 = qh;
        this.fI0 = fi;
        this.eD = ed;
        this.Db = db;
        this.hr = count;
        this.j7 = values;
    }

    public final String gG0() {
        return this.VB;
    }

    public final boolean J50() {
        return this.hr > 0;
    }

    public final boolean vN(pg0_0 type, short mask) {
        switch (type.Com4) {
            case 5:
                return true;
            case 4:
                return (this.LPt9 | mask) == this.LPt9;
            case 3:
                return (this.QH0 | mask) == this.QH0;
            case 2:
                return (this.fI0 | mask) == this.fI0;
            case 1:
                return (this.eD | mask) == this.eD;
            default:
                return (this.Db | mask) == this.Db;
        }
    }
}
