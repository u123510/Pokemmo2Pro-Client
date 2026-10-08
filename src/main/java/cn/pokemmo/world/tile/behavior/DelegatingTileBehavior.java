package cn.pokemmo.world.tile.behavior;

import f.LT;
import f.bi0_1;
import f.fm_0;
import f.hl0_1;
import f.pf_2;

/**
 * 地图图块交互行为委托器
 */
public class DelegatingTileBehavior extends pf_2 {
    public final fm_0 QI0;

    public DelegatingTileBehavior(fm_0 handler) {
        super((byte) 0);
        this.QI0 = handler;
    }

    @Override
    public void u00(LT lT, bi0_1 value, hl0_1 type, int i4, int i5, int i6, int i7) {
        this.QI0.u00(lT, value, type, i4, i5, i6, i7);
    }
}
