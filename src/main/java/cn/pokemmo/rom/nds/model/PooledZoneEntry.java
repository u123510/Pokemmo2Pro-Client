package cn.pokemmo.rom.nds.model;

import f.LJ0;
import f.ZO;
import f.es_1;

/**
 * NDS 地图区域条目对象池容器
 */
public class PooledZoneEntry extends ZO {
    public final es_1 CoN;

    public PooledZoneEntry(LJ0 lj0) {
        super(lj0);
        this.CoN = new es_1();
    }
}
