package cn.pokemmo.world.entity;

import f.*;

public class WorldItemDropEntity extends FH0 {
    public final U10 Gf;

    public WorldItemDropEntity(U10 owner) {
        super();
        this.Gf = owner;
    }

    @Override
    public final void jj(float first, float second) {
        this.Gf.Jo();
        if (!this.Gf.bc0) {
            first = 0.0f;
        }
        if (!this.Gf.xU) {
            second = 0.0f;
        }
        this.Gf.t60 -= first;
        this.Gf.gQ += second;
        this.Gf.Yj();
        if (this.Gf.zS && (first != 0.0f || second != 0.0f) && this.Gf.uP != null) {
            this.Gf.uP.re0(this, this.Gf);
        }
    }

    @Override
    public final void Rv0(float first, float second) {
        if (Math.abs(first) <= 150.0f || !this.Gf.bc0) {
            first = 0.0f;
        }
        if (Math.abs(second) > 150.0f && this.Gf.xU) {
            second = -second;
        } else {
            second = 0.0f;
        }
        if (first == 0.0f && second == 0.0f) {
            return;
        }
        if (this.Gf.zS && this.Gf.uP != null) {
            this.Gf.uP.re0(this, this.Gf);
        }
        this.Gf.Po0 = this.Gf.k30;
        this.Gf.Sf = first;
        this.Gf.ZD = second;
    }

    @Override
    public final boolean my(mx0 value) {
        if (super.my(value)) {
            ni_1 event = (ni_1) value;
            if (event.wv == F00.Fq0) {
                this.Gf.Po0 = 0.0f;
            }
            return true;
        }
        if (value instanceof ni_1) {
            ni_1 event = (ni_1) value;
            if (event.hC0 == -2147483648.0f || event.Ki == -2147483648.0f) {
                this.Gf.FD = -1;
                this.Gf.A70 = false;
                this.Gf.qQ = false;
                this.Gf.D20.kJ0.rI0.ky0();
                this.Gf.D20.kJ0.t8 = true;
            }
        }
        return false;
    }
}
