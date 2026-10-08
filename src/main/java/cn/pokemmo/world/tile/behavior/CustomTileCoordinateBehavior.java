package cn.pokemmo.world.tile.behavior;

import f.JY;
import f.LT;
import f.bi0_1;
import f.xm_2;

public class CustomTileCoordinateBehavior extends DefaultTileEventBehavior {
    public final JY wx;

    public CustomTileCoordinateBehavior(JY v1) {
        super();
        this.wx = v1;
    }

    @Override
    public boolean xB(LT v1, LT v2, bi0_1 v3, byte i4) {
        short[] row = this.wx.Xx0[this.wx.ad0];
        if (v1.Tz() == row[0] && v1.HR() == row[1] && v1.Es() == (byte) row[2]) {
            return super.xB(v1, v2, v3, i4);
        }
        return false;
    }

    public boolean aH(LT v1, bi0_1 v2, byte i3, byte i4) {
        short[] row = this.wx.Xx0[this.wx.ad0];
        if (v1.Tz() == row[0] && v1.HR() == row[1] && v1.Es() == (byte) row[2]) {
            return ((Object) this) instanceof xm_2;
        }
        return v1.Es() != 0;
    }
}
