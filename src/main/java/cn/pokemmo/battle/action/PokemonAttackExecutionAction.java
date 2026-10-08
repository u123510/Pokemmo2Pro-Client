package cn.pokemmo.battle.action;

import f.*;

public class PokemonAttackExecutionAction extends xv_0 implements ro0_0 {
    public boolean jj0;
    public final boolean Ca0;

    public PokemonAttackExecutionAction() {
        super();
        this.jj0 = true;
        this.Ca0 = true;
    }

    public PokemonAttackExecutionAction(te0_0... children) {
        super();
        this.jj0 = true;
        this.Ca0 = true;
        for (te0_0 child : children) {
            this.KD0(child);
        }
    }

    @Override
    public float Q70() {
        return this.uq0();
    }

    @Override
    public float n30() {
        return this.Tn0();
    }

    @Override
    public float uq0() {
        return 0.0F;
    }

    @Override
    public float Tn0() {
        return 0.0F;
    }

    @Override
    public final void Gu() {
    }

    @Override
    public final void Y00() {
    }

    @Override
    public final void PD0() {
        if (!this.Ca0) {
            return;
        }
        xv_0 parent = this.xO;
        if (!this.jj0) {
            return;
        }
        this.jj0 = false;
        this.Z50();
        if (this.jj0) {
            if (parent instanceof sj_1) {
                return;
            }
            int attempts = 0;
            while (attempts < 5) {
                this.jj0 = false;
                this.Z50();
                if (!this.jj0) {
                    break;
                }
                attempts++;
            }
        }
    }

    public void cx0() {
        this.jj0 = true;
    }

    @Override
    public final void KE0() {
        this.cx0();
        te0_0 parent = this.xO;
        if (parent instanceof ro0_0) {
            ((ro0_0) parent).KE0();
        }
    }

    @Override
    public final void E3() {
        this.KE0();
    }

    @Override
    public final void Ne0() {
        this.cx0();
    }

    public void Z50() {
    }

    @Override
    public te0_0 nX(float x, float y, boolean value) {
        this.PD0();
        return super.nX(x, y, value);
    }

    @Override
    public void BS(ui_1 ui, float value) {
        this.PD0();
        super.BS(ui, value);
    }
}
