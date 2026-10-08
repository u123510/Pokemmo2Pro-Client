package cn.pokemmo.battle.action;

import f.*;

public class BattleItemUseAction extends WX {
    public E7 jY;
    public u1_0 Pj0;
    public boolean Xe0;
    public boolean ue0;

    public BattleItemUseAction() {
        super();
    }

    public BattleItemUseAction(E7 value) {
        this(value, 0);
    }

    public BattleItemUseAction(E7 value, int ignored) {
        super();
        this.Hs(value);
    }

    public final boolean U20() {
        return (this.mu0 & 256) != 0;
    }

    public final void lK0(boolean value) {
        E7 bound = this.jY;
        if (bound != null) {
            bound.Dc0(value ^ this.Xe0);
        } else if (value != this.U20()) {
            this.lv(256, value);
            a7_0.bH(this.xv0);
        }
    }

    @Override
    public final void bu() {
        this.lK0(!this.U20());
        a7_0.bH(this.Fc0);
    }

    public final void Hs(E7 value) {
        this.Xe0 = false;
        E7 old = this.jY;
        if (old != value) {
            if (old != null && this.Pj0 != null) {
                old.j00(this.Pj0);
            }
            this.jY = value;
            if (value != null) {
                if (this.ue0) {
                    if (this.Pj0 == null) {
                        this.Pj0 = new u1_0((tq_0) (Object) this);
                    }
                    value.Kj(this.Pj0);
                }
                boolean changed = value.getValue() ^ this.Xe0;
                if (changed != this.U20()) {
                    this.lv(256, changed);
                    a7_0.bH(this.xv0);
                }
            }
        }
        if (value != null) {
            boolean changed = value.getValue() ^ this.Xe0;
            if (changed != this.U20()) {
                this.lv(256, changed);
                a7_0.bH(this.xv0);
            }
        }
    }

    @Override
    public final void Rl0() {
        this.ue0 = true;
        E7 value = this.jY;
        if (value != null) {
            if (this.Pj0 == null) {
                this.Pj0 = new u1_0((tq_0) (Object) this);
            }
            value.Kj(this.Pj0);
            boolean changed = value.getValue() ^ this.Xe0;
            if (changed != this.U20()) {
                this.lv(256, changed);
                a7_0.bH(this.xv0);
            }
        }
    }

    @Override
    public final void ft() {
        this.ue0 = false;
        E7 value = this.jY;
        if (value != null && this.Pj0 != null) {
            value.j00(this.Pj0);
        }
    }
}
