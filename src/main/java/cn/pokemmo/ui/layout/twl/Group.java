package cn.pokemmo.ui.layout.twl;

import f.*;
import java.util.ArrayList;

public abstract class Group extends is0_0 {
    public final ArrayList U0;
    public boolean o4;
    public final DialogLayout p4;

    public Group(DialogLayout v1) {
        this.p4 = v1;
        this.U0 = new ArrayList();
    }

    @SuppressWarnings("unchecked")
    public final <T extends Group> T X20(ya_1 v1) {
        if (v1 == null) {
            return (T) this;
        }
        if (v1.p4 != this.p4) {
            throw new IllegalArgumentException("Can't add group from different layout");
        }
        if (v1.o4) {
            throw new IllegalArgumentException("Group already added to another group");
        }
        v1.o4 = true;
        Vv(v1);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public final <T extends Group> T Xq(ya_1... v1) {
        for (ya_1 group : v1) {
            X20(group);
        }
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public final <T extends Group> T Kn0(le0_2 v1) {
        if (v1 == null) {
            return (T) this;
        }
        if (v1.K20 != this.p4) {
            this.p4.F9(this.p4.fU(), v1);
        }
        zb0_1 spring = (zb0_1) this.p4.wG.get(v1);
        if (spring == null) {
            throw new IllegalStateException("WidgetSpring for Widget not found: " + v1);
        }
        Vv(spring);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public final <T extends Group> T k5(pa0_0 v1, le0_2 v2) {
        if (v2 == null) {
            return (T) this;
        }
        Kn0(v2);
        this.p4.Yg(v1, v2);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public final <T extends Group> T LPt3(le0_2... v1) {
        for (le0_2 widget : v1) {
            Kn0(widget);
        }
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public final <T extends Group> T VY(int min, int pref, int max) {
        Vv(new NH(this.p4, min, pref, max, false));
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public final <T extends Group> T qd(int size) {
        if (size < 1) {
            return (T) this;
        }
        Vv(new NH(this.p4, size, size, size, false));
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public final <T extends Group> T p70(int size) {
        Vv(new NH(this.p4, size, size, 32767, false));
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends Group> T Ze0() {
        Vv(new NH(this.p4, 0, 0, 32767, false));
        return (T) this;
    }

    public final void VE0() {
        int i = this.U0.size();
        while (i-- > 0) {
            is0_0 element = (is0_0) this.U0.get(i);
            if (element instanceof NH) {
                if (((NH) element).Te) {
                    this.U0.remove(i);
                }
            } else if (element instanceof ya_1) {
                ((ya_1) element).VE0();
            }
        }
    }

    public void u70() {
        for (int i = 0; i < this.U0.size(); i++) {
            is0_0 element = (is0_0) this.U0.get(i);
            if (element instanceof ya_1) {
                ((ya_1) element).u70();
            }
        }
    }

    public final void Ja0() {
        My();
        this.U0.clear();
        ya_1 pJ0 = this.p4.pJ0;
        if (pJ0 != null) {
            pJ0.L1();
        }
        ya_1 L4 = this.p4.L4;
        if (L4 != null) {
            L4.L1();
        }
        this.p4.GG0 = true;
        this.p4.rc();
    }

    public final void Vv(is0_0 v1) {
        this.U0.add(v1);
        this.p4.GG0 = true;
        this.p4.rc();
    }

    public final void L1() {
        int i = this.U0.size();
        while (i-- > 0) {
            is0_0 element = (is0_0) this.U0.get(i);
            if (element instanceof zb0_1) {
                if (!this.p4.wG.containsKey(((zb0_1) element).p40)) {
                    this.U0.remove(i);
                }
            } else if (element instanceof ya_1) {
                ((ya_1) element).L1();
            }
        }
    }

    public final void My() {
        int i = this.U0.size();
        while (i-- > 0) {
            is0_0 element = (is0_0) this.U0.get(i);
            if (element instanceof zb0_1) {
                this.p4.YY((zb0_1) element);
            } else if (element instanceof ya_1) {
                ((ya_1) element).My();
            }
        }
    }
}
