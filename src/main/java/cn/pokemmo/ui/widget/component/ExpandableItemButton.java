package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.Arrays;
import java.util.Objects;

public class ExpandableItemButton extends jb0_0 {
    public final boolean po0;

    public ExpandableItemButton(short value, boolean expanded) {
        super(Objects.requireNonNull(tw0_0.rl.r1(_volatile.BV)), value);
        if (tw0_0.kz0()) {
            this.xf0(100, 100);
            this.sl().dA(2.0F);
            this.sl().Gy0(14, 8);
        } else {
            this.xf0(expanded ? 58 : 46, expanded ? 48 : 40);
        }
        this.po0 = expanded;
        if (expanded) {
            this.j10(false);
        }
    }

    public final void Ol0() {
        if (this.po0) {
            this.KO();
        } else {
            this.nA();
        }
    }

    public final void zl() {
        VU current = this.ol0();
        this.Hh.Ll(true);
        this.Q50.Ll(true);
        if (this.po0) {
            this.J90.Ll(true);
            this.W10.Ll(true);
            this.C5.Ll(true);
            this.Xt.Ll(true);
            this.Hh.Ll(true);
        } else if (current != null && !current.I8.vn() && !tw0_0.kz0()) {
            this.Lu0.Ll(true);
        }

        if (current == null) {
            return;
        }

        di0_1 team = BU.T50.vs0;
        if (team != null) {
            for (mi_0 member : Arrays.asList(team.FF[0], team.FF[2])) {
                VU other = member.AG;
                if (other != null && other.pu.equals(current.pu)) {
                    this.tp0.wx0(gn_0.BLACK);
                }
            }
        }
    }
}
