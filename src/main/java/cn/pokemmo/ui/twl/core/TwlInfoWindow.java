package cn.pokemmo.ui.twl.core;

import f.le0_2;
import f.uk0_2;

/**
 * 悬浮信息提示窗口基类 (InfoWindow)
 */
public abstract class TwlInfoWindow extends uk0_2 {
    public final le0_2 owner;

    public TwlInfoWindow(le0_2 owner) {
        if (owner == null) {
            throw new NullPointerException("owner");
        }
        this.owner = owner;
    }

    public le0_2 getOwner() {
        return this.owner;
    }

    @Override
    public String Ck() {
        return "infowindow";
    }

    public abstract void openInfo();

    public void UU() {
    }
}
