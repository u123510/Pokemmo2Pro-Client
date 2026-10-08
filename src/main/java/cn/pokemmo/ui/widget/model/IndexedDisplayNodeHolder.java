package cn.pokemmo.ui.widget.model;

import f.Dn0;
import java.util.TreeMap;

public class IndexedDisplayNodeHolder {
    public final short Jb0;
    public final boolean gw;
    public final boolean dW;
    public final byte RY;
    public final TreeMap MW;

    public IndexedDisplayNodeHolder(byte i1, short i2, boolean i3, boolean i4) {
        this.MW = new TreeMap();
        this.Jb0 = i2;
        this.gw = i3;
        this.dW = i4;
        this.RY = i1;
    }

    public void IG(Dn0 v1, int i2) {
        this.MW.put(Integer.valueOf(i2), v1);
    }
}
