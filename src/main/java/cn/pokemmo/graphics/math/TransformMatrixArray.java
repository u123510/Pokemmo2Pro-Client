package cn.pokemmo.graphics.math;

import f.*;

public class TransformMatrixArray implements tx_2 {
    public final es_1 he0 = new es_1();
    public lt_2 qK0;
    public lt_2 Xx;
    public lt_2 db0;

    public TransformMatrixArray() { }
    public TransformMatrixArray(lt_2... values) { this.T6(values); }
    public TransformMatrixArray(lt_2[] values, int offset, int count) { this.Go(values, offset, count); }
    public TransformMatrixArray(es_1 values, int offset, int count) { this.LJ(values, offset, count); }

    public final void T6(lt_2... values) { this.Go(values, 0, values.length); }

    public final L90 Go(lt_2[] values, int offset, int count) {
        if (count < 2 || count > 4) throw new nf_1("Only first, second and third degree Bezier curves are supported.");
        if (this.qK0 == null) this.qK0 = values[0].f10();
        if (this.Xx == null) this.Xx = values[0].f10();
        if (this.db0 == null) this.db0 = values[0].f10();
        this.he0.clear();
        this.he0.G6(values, offset, count);
        return (L90) this;
    }

    public final void LJ(es_1 values, int offset, int count) {
        if (count < 2 || count > 4) throw new nf_1("Only first, second and third degree Bezier curves are supported.");
        if (this.qK0 == null) this.qK0 = ((lt_2)values.get(0)).f10();
        if (this.Xx == null) this.Xx = ((lt_2)values.get(0)).f10();
        if (this.db0 == null) this.db0 = ((lt_2)values.get(0)).f10();
        this.he0.clear();
        this.he0.uL(values, offset, count);
    }

    public final lt_2 DA0(float t, C8 output) {
        int count = this.he0.KB;
        if (count == 2) {
            lt_2 p0 = (lt_2)this.he0.get(0);
            lt_2 p1 = (lt_2)this.he0.get(1);
            output.lY(p0).G7(1.0f - t).Xg0(this.qK0.lY(p1).G7(t));
        } else if (count == 3) {
            lt_2 p0 = (lt_2)this.he0.get(0);
            lt_2 p1 = (lt_2)this.he0.get(1);
            lt_2 p2 = (lt_2)this.he0.get(2);
            float inverse = 1.0f - t;
            output.lY(p0).G7(inverse * inverse).Xg0(this.qK0.lY(p1).G7(inverse * 2.0f * t)).Xg0(this.qK0.lY(p2).G7(t * t));
        } else if (count == 4) {
            lt_2 p0 = (lt_2)this.he0.get(0);
            lt_2 p1 = (lt_2)this.he0.get(1);
            lt_2 p2 = (lt_2)this.he0.get(2);
            lt_2 p3 = (lt_2)this.he0.get(3);
            float inverse = 1.0f - t;
            float inverseSquared = inverse * inverse;
            float tSquared = t * t;
            output.lY(p0).G7(inverseSquared * inverse).Xg0(this.qK0.lY(p1).G7(inverseSquared * 3.0f * t)).Xg0(this.qK0.lY(p2).G7(inverse * 3.0f * tSquared)).Xg0(this.qK0.lY(p3).G7(tSquared * t));
        }
        return output;
    }
}
