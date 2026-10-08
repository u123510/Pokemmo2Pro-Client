package cn.pokemmo.world.map;

import f.*;
import java.util.HashMap;

public class MapElevationHeightmapTile {
    public final HashMap j1;
    public short Rz0;
    public short fP;
    public byte rE0;
    public byte wb0;
    public byte aw0;
    public byte ei0;
    public int vD0;
    public int id0;
    public boolean LPt4;
    public boolean Oa;
    public byte Jy0;
    public byte tw;
    public byte CT;
    public byte bB0;
    public byte Wn0;
    public byte COm5;
    public byte cU;
    public byte kI0;
    public boolean Eo;
    public boolean wu0;
    public boolean HT;

    public MapElevationHeightmapTile() {
        this.j1 = new HashMap();
        this.Jy0 = 0;
        this.tw = 0;
        this.CT = 0;
        this.bB0 = 0;
        this.Wn0 = 0;
        this.COm5 = 0;
        this.cU = 0;
        this.kI0 = 0;
    }

    public final byte Px0(fq_2 key) {
        if (!this.j1.containsKey(key)) {
            return 0;
        }
        return ((iu_2)this.j1.get(key)).dn0;
    }

    public final void Ka0(fq_2 key, byte value) {
        if (value < 1) {
            this.j1.remove(key);
            return;
        }
        ((iu_2)this.j1.computeIfAbsent(key, k -> new iu_2((fq_2)k))).dn0 = value;
    }
}
