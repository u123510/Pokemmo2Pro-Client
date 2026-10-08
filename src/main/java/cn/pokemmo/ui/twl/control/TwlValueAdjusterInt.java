package cn.pokemmo.ui.twl.control;

import f.*;
import cn.pokemmo.ui.twl.core.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 * 整型数值调节微调器 (ValueAdjusterInt)
 */
public class TwlValueAdjusterInt extends Kq0 {
    public int eB0;
    public int wG0;
    public int Se0 = 100;
    public int Zf;
    public int tx = 1;
    public V ga;
    public yq_1 aD;
    public HashMap sA;
    public ArrayList UQ;

    public TwlValueAdjusterInt() {
        this.uf("valueadjuster");
        this.mH();
        this.Ly0.Bl(xw_1.Ww);
        this.tc();
    }

    public TwlValueAdjusterInt(V value) {
        this.uf("valueadjuster");
        this.yW(value);
        this.Ly0.Bl(xw_1.Ww);
        this.tc();
    }

    public final String Ck() {
        return "valueadjusterint";
    }

    public final void v10(int step) {
        this.tx = step;
    }

    public final void TK(int value, String label) {
        if (this.sA == null) {
            this.sA = new HashMap();
        }
        this.sA.put(Integer.valueOf(value), Objects.requireNonNull(label));
    }

    public void case$(int value) {
        V current = this.ga;
        if (current != null) {
            this.wG0 = current.vu0();
        }
        int minimum = this.wG0;
        current = this.ga;
        if (current != null) {
            this.Se0 = current.OD();
        }
        value = Math.max(minimum, Math.min(this.Se0, value));
        if (this.eB0 == value) {
            return;
        }

        this.eB0 = value;
        current = this.ga;
        if (current != null) {
            current.X90(value);
        }
        this.mH();
        if (this.UQ != null) {
            for (Object callback : this.UQ) {
                ((Runnable) callback).run();
            }
        }
    }

    public final void yW(V value) {
        V previous = this.ga;
        if (previous == value) {
            return;
        }
        if (previous != null && this.aD != null) {
            xp_1 observable = (xp_1) previous;
            observable.RD0 = (Runnable[]) a7_0.tp0(this.aD, observable.RD0);
        }

        this.ga = value;
        if (value == null) {
            return;
        }
        this.wG0 = value.vu0();
        this.Se0 = value.OD();
        if (this.ga != null && this.Em0 != null) {
            if (this.aD == null) {
                this.aD = new yq_1(this);
            }
            ((xp_1) this.ga).Kj(this.aD);
            this.UO();
        }
    }

    public String UG() {
        return this.Tz();
    }

    public boolean AZ(String value) {
        try {
            this.case$(Integer.parseInt(value));
            return true;
        } catch (NumberFormatException ignored) {
            return false;
        }
    }

    public String XF0(String value) {
        try {
            Integer.parseInt(value);
            return null;
        } catch (NumberFormatException exception) {
            return exception.toString();
        }
    }

    public final void q8() {
    }

    public final boolean kk(char value) {
        return value >= '0' && value <= '9' || value == '-';
    }

    public final void br() {
        this.Zf = this.eB0;
    }

    public final void qL0(int delta) {
        V current = this.ga;
        if (current != null) {
            this.Se0 = current.OD();
        }
        int maximum = this.Se0;
        current = this.ga;
        if (current != null) {
            this.wG0 = current.vu0();
        }
        int denominator = Math.max(1, Math.abs(maximum - this.wG0));
        this.case$(this.Zf + delta / Math.max(3, this.Mx / denominator));
    }

    public final void w50() {
        this.case$(this.Zf);
    }

    public final void aux() {
        int value = this.eB0 - this.tx;
        if (value < this.wG0) {
            value = this.wG0;
        }
        this.case$(value);
    }

    public final void yv0() {
        int value = this.eB0 + this.tx;
        if (value > this.Se0) {
            value = this.Se0;
        }
        this.case$(value);
    }

    public String Tz() {
        if (this.sA != null) {
            String label = (String) this.sA.get(Integer.valueOf(this.eB0));
            if (label != null) {
                return label;
            }
        }
        return Integer.toString(this.eB0);
    }

    public final void UO() {
        this.sS();
        this.wG0 = this.ga.vu0();
        this.Se0 = this.ga.OD();
        this.eB0 = this.ga.getValue();
        this.mH();
    }

    public final void C(zk0_1 context) {
        com8__3 editor = new com8__3(context);
        this.be = editor;
        editor.bm0 = this.Jc0;
        editor.ad0 = true;
        if (this.ga != null && this.Em0 != null) {
            if (this.aD == null) {
                this.aD = new yq_1(this);
            }
            ((xp_1) this.ga).Kj(this.aD);
            this.UO();
        }
    }

    public final void N00(zk0_1 context) {
        V value = this.ga;
        if (value != null && this.aD != null) {
            xp_1 observable = (xp_1) value;
            observable.RD0 = (Runnable[]) a7_0.tp0(this.aD, observable.RD0);
        }
        if (this.be != null) {
            this.be.wg0();
        }
        this.be = null;
    }

    public final void Da0(Runnable callback) {
        if (this.UQ == null) {
            this.UQ = new ArrayList();
        }
        this.UQ.add(callback);
    }

    public final void tc() {
        this.aB0.RR(this::aux);
        this.BA0.RR(this::yv0);
    }

    public final void ke(int maximum) {
        if (maximum < 1) {
            throw new IllegalArgumentException("maxValue < minValue");
        }
        this.wG0 = 1;
        this.Se0 = maximum;
        this.case$(this.eB0);
    }
}
