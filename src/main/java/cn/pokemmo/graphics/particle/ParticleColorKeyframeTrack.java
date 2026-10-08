package cn.pokemmo.graphics.particle;

import f.*;

public class ParticleColorKeyframeTrack extends _switch {
    public int RL0;
    public float Yw;
    public float SF;
    public float kj;

    public ParticleColorKeyframeTrack(int id) {
        super(id);
    }

    public final void uf0(kk_1 source, c50_0 target, AE0 values) {
        int index = this.I1(target);
        int value = source.DA(index);
        this.l7 = value;
        if (values != null) {
            values.pI(value, index);
        }
    }

    public final void switch$(kk_1 source, AE0 values) {
        if (this.l7 != 0) {
            this.Iu0 = source.DA(2);
            this.RL0 = source.DA(2);
            if (values != null) {
                values.pI(this.Iu0, 2);
                values.pI(this.RL0, 2);
            }
        }
    }

    public final void zC0(kk_1 source, c50_0 target) {
        if (this.l7 == 0) {
            return;
        }
        super.zC0(source, target);
        switch (this.RL0) {
            case 0: {
                float[] table = id0_1.YL0;
                this.Yw = table[source.DA(6)];
                float value = table[source.DA(6)];
                this.kj = value;
                this.SF = value;
                break;
            }
            case 1: {
                float[] table = id0_1.YL0;
                float value = table[source.DA(6)];
                this.SF = value;
                this.Yw = value;
                this.kj = table[source.DA(6)];
                break;
            }
            case 2: {
                float[] table = id0_1.YL0;
                float value = table[source.DA(6)];
                this.kj = value;
                this.SF = value;
                this.Yw = value;
                break;
            }
            case 3: {
                float[] table = id0_1.YL0;
                this.Yw = table[source.DA(6)];
                this.SF = table[source.DA(6)];
                this.kj = table[source.DA(6)];
                break;
            }
            default:
                break;
        }
    }

    public final boolean Rb(kk_1 source) {
        return super.Rb(source);
    }

    public final boolean po0(int component, B7 first, B7 second) {
        if (this.l7 != 0) {
            float value = this.oS[this.CS];
            if (this.LPT6[0] == null) {
                value = (value + this.iu0[0]) * this.vu0[0];
            }
            if (component == 0) {
                float firstValue;
                if (this.ue0 <= 4) {
                    firstValue = value * this.aC0;
                    value *= this.Yw;
                } else if (this.ue0 <= 8) {
                    firstValue = value * this.o40;
                    value *= this.SF;
                } else {
                    firstValue = value * this.bi0;
                    value *= this.kj;
                }
                first.RE[this.in0] = firstValue;
                second.RE[this.in0] = value;
            } else {
                float result;
                if (component == 1) {
                    if (this.ue0 <= 4) {
                        result = value * this.aC0;
                    } else if (this.ue0 <= 8) {
                        result = value * this.o40;
                    } else {
                        result = value * this.bi0;
                    }
                } else if (this.ue0 <= 4) {
                    result = value * this.Yw;
                } else if (this.ue0 <= 8) {
                    result = value * this.SF;
                } else {
                    result = value * this.kj;
                }
                first.RE[this.in0] = result;
            }
        }
        this.CS++;
        return this.CS == 3;
    }
}
