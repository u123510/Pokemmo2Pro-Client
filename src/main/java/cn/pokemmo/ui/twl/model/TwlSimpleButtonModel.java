package cn.pokemmo.ui.twl.model;

import f.a7_0;

/**
 * TWL 按钮交互状态基础模型 (SimpleButtonModel)
 * 原始混淆类: f.WX
 */
public class TwlSimpleButtonModel {
    public static final int STATE_SELECTED = 1;
    public static final int STATE_PRESSED = 2;
    public static final int STATE_HOVER = 4;
    public static final int STATE_DISABLED = 8;

    public Runnable[] Fc0;
    public Runnable[] xv0;
    public int mu0;

    public boolean isSelected() {
        return (this.mu0 & STATE_SELECTED) != 0;
    }

    public boolean isPressed() {
        return (this.mu0 & STATE_PRESSED) != 0;
    }

    public boolean isHover() {
        return (this.mu0 & STATE_HOVER) != 0;
    }

    public boolean isDisabled() {
        return (this.mu0 & STATE_DISABLED) != 0;
    }

    public boolean U20() {
        return false;
    }

    public final boolean sx0() {
        return (this.mu0 & 4) != 0;
    }

    public void lK0(boolean bl) {
    }

    public final void setPressed(boolean pressed) {
        tF(pressed);
    }

    public final void tF(boolean pressed) {
        boolean wasPressed = (this.mu0 & 2) != 0;
        if (pressed != wasPressed) {
            boolean fireAction = !pressed && sx0() && (this.mu0 & 8) == 0;
            lv(2, pressed);
            a7_0.bH(this.xv0);
            if (fireAction) {
                bu();
            }
        }
    }

    public final void setHover(boolean hover) {
        Mo0(hover);
    }

    public final void Mo0(boolean hover) {
        if (hover != sx0()) {
            lv(4, hover);
            a7_0.bH(this.xv0);
        }
    }

    public final void setSelected(boolean selected) {
        Ge0(selected);
    }

    public final void Ge0(boolean selected) {
        boolean wasSelected = (this.mu0 & 1) != 0;
        if (selected != wasSelected) {
            lv(1, selected);
            a7_0.bH(this.xv0);
        }
    }

    public void fireAction() {
        bu();
    }

    public void bu() {
        a7_0.bH(this.Fc0);
    }

    public final void setStateFlag(int mask, boolean enabled) {
        lv(mask, enabled);
    }

    public final void lv(int mask, boolean enabled) {
        if (enabled) {
            this.mu0 |= mask;
        } else {
            this.mu0 &= ~mask;
        }
    }

    public final void aq0() {
        bu();
    }

    public final void addStateCallback(Runnable runnable) {
        l40(runnable);
    }

    public final void l40(Runnable runnable) {
        this.xv0 = (Runnable[]) a7_0.gE(this.xv0, runnable, Runnable.class);
    }

    public final void addActionCallback(Runnable runnable) {
        this.Fc0 = (Runnable[]) a7_0.gE(this.Fc0, runnable, Runnable.class);
    }

    protected void fireStateChanged() {
        a7_0.bH(this.xv0);
    }

    public void Rl0() {
    }

    public void ft() {
    }
}
