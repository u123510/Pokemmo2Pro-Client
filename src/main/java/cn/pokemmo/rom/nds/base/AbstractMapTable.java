package cn.pokemmo.rom.nds.base;

import f.Z50;

/**
 * NDS 地图表抽象基类
 * 原混淆类: f.S80
 */
public abstract class AbstractMapTable {
    public Z50[] entries;
    public Z50[] Sx0;

    public final Z50[] getEntries() {
        return this.entries != null ? this.entries : this.Sx0;
    }

    public final Z50[] nF() {
        return getEntries();
    }
}
