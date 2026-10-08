package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

public abstract class DropdownMenuButton extends uk0_2 {
    public final le0_2 LI0;
    public final boolean VA0;
    public final boolean y5;

    public DropdownMenuButton(le0_2 owner) {
        super();
        this.VA0 = true;
        this.y5 = true;
        if (owner == null) {
            throw new NullPointerException("owner");
        }
        this.LI0 = owner;
    }

    @Override
    public String Ck() {
        return "popupwindow";
    }

    public boolean c3() {
        zk0_1 window = this.LI0.Em0;
        if (window == null) {
            return false;
        }
        this.LI0.Ll(true);
        this.LI0.pw0(true);
        window.Wh0((f.qj_0)(Object)this);
        this.LI0.BL();
        this.LI0.Uz(1, false);
        return this.LI0.K20 != null;
    }

    public void Md0() {
        zk0_1 window = this.LI0.Em0;
        if (window != null) {
            window.TD((f.qj_0)(Object)this);
            this.LI0.BL();
        }
    }

    @Override
    public final int m0() {
        le0_2 child = this.LI0.K20;
        int width = child == null ? 32767 : child.a3();
        return Math.min(width, super.m0());
    }

    @Override
    public final int rm0() {
        le0_2 child = this.LI0.K20;
        int height = child == null ? 32767 : child.k5();
        return Math.min(height, super.rm0());
    }

    @Override
    public final boolean nd0(i70_0 event) {
        if (this.jb0(event)) {
            return true;
        }
        if (event.zu == 5) {
            int y = event.f8;
            if (!this.LI0.yv0(event.AN, y)) {
                if (this.VA0) {
                    this.Md0();
                }
                return true;
            }
        }
        if (event.iT() && event.finally$ == 111) {
            this.LPt7();
            return true;
        }
        return true;
    }

    public boolean jb0(i70_0 event) {
        return super.nd0(event);
    }

    public final boolean no0(i70_0 event) {
        return true;
    }

    public void LPt7() {
        if (this.y5) {
            this.Md0();
        }
    }

    public final void ej(le0_2 child) {
        if (child instanceof zk0_1) {
            this.K20 = child;
            return;
        }
        throw new IllegalArgumentException("PopupWindow can't be used as child widget");
    }
}
