package cn.pokemmo.graphics.particle;

import f.*;

public class ParticleKeyframePropertyTrack extends _switch {
    public int Rj0;
    public int yb;
    public float KK0;
    public float xp;
    public float M40;
    public final int[] Lo0;
    public final float[] Ae0;
    public final float[] vq0;
    public final float[] nG;
    public final float[] sH0;

    public ParticleKeyframePropertyTrack(int id) {
        super(id);
        this.Lo0 = new int[]{0};
        this.Ae0 = new float[]{0.0F};
        this.nG = new float[]{0.0F};
        this.sH0 = new float[]{0.0F};
        this.vq0 = new float[3];
    }

    public final void uf0(kk_1 source, c50_0 target, AE0 values) {
        int index = this.I1(target);
        this.l7 = source.DA(index);
        this.Rj0 = source.DA(index);
        if (values != null) {
            values.pI(this.l7, index);
            values.pI(this.Rj0, index);
        }
    }

    public final void switch$(kk_1 source, AE0 values) {
        if (this.l7 != 0) {
            int value = source.DA(2);
            this.Iu0 = value;
            if (values != null) {
                values.pI(value, 2);
            }
        }
        if (this.Rj0 != 0) {
            int value = source.DA(2);
            this.yb = value;
            if (values != null) {
                values.pI(value, 2);
            }
        }
    }

    public final void zC0(kk_1 source, c50_0 target) {
        super.zC0(source, target);
        if (this.Rj0 == 0) {
            return;
        }
        switch (this.yb) {
            case 0: {
                float[] table = id0_1.YL0;
                this.KK0 = table[source.DA(6)];
                float value = table[source.DA(6)];
                this.xp = value;
                this.M40 = table[source.DA(6)];
                break;
            }
            case 1: {
                float[] table = id0_1.YL0;
                float value = table[source.DA(6)];
                this.xp = value;
                this.KK0 = value;
                this.M40 = table[source.DA(6)];
                break;
            }
            case 2: {
                float value = id0_1.YL0[source.DA(6)];
                this.M40 = value;
                this.xp = value;
                this.KK0 = value;
                break;
            }
            case 3: {
                float[] table = id0_1.YL0;
                this.KK0 = table[source.DA(6)];
                float value = table[source.DA(6)];
                this.M40 = value;
                this.xp = value;
                break;
            }
            default:
                break;
        }
        this.C40(target, this.Rj0, 1, this.Ae0, this.Lo0, this.nG, this.sH0);
    }

    public final boolean Rb(kk_1 source) {
        boolean result = super.Rb(source);
        if (this.Rj0 != 0) {
            if (this.LPT6[1] != null) {
                int index = source.DA(this.Lo0[0]) + ((this.CS - 1) << 1);
                float[] table = this.LPT6[1];
                this.vq0[0] = table[index];
                this.vq0[1] = table[index + 1];
                this.vq0[2] = table[index + 2];
            } else {
                float value = source.DA(this.Lo0[0]) * this.Ae0[0] - 1.0F;
                this.vq0[0] = value;
                this.vq0[1] = value;
                this.vq0[2] = value;
            }
        }
        return result;
    }

    public final boolean po0(int component, B7 first, B7 second) {
        boolean result = super.po0(component, first, second);
        if (this.Rj0 == 0 || component == 1) {
            return result;
        }
        float value = this.vq0[this.CS - 1];
        if (this.LPT6[1] == null) {
            value = (value + this.sH0[0]) * this.nG[0];
        }
        if (this.ue0 <= 4) {
            value *= this.KK0;
        } else if (this.ue0 <= 8) {
            value *= this.xp;
        } else {
            value *= this.M40;
        }
        if (component == 0) {
            second.RE[this.in0] = value;
        } else {
            first.RE[this.in0] = value;
        }
        return result;
    }
}
