package cn.pokemmo.ui.widget.tournament;

import f.*;

import java.util.List;

public class TournamentMatchPairingWidget {
    public final lq0[] v60;
    public final av_1 QL0;
    public final av_1 B90;
    public final W9 jg0;
    public final W9 Ce0;
    public final cn_0 Py0;
    public final cn_0 Gr;
    public final X6 kr0;
    public final Kw0[] UZ;
    public final Yl Tk0;
    public boolean q70;
    public final boolean Sw0;

    public TournamentMatchPairingWidget(Yl owner, av_1 first, av_1 second, lq0[] entries, List options) {
        this.Py0 = new cn_0("");
        this.Gr = new cn_0("");
        this.UZ = new Kw0[6];
        this.q70 = false;
        this.Tk0 = owner;
        this.QL0 = first;
        this.B90 = second;
        this.v60 = entries;

        byte current = tw0_0.rl.hz().go0();
        this.Sw0 = current >= second.aE0();

        W9 firstControl = new W9();
        this.jg0 = firstControl;
        firstControl.pw0(first.s90());
        firstControl.k50(tw0_0.rl.U1(first.SG()));
        firstControl.RR(() -> this.yp(first));
        if (current < first.aE0()) {
            firstControl.k50(false);
            firstControl.pw0(false);
            if (first.aE0() == 9) {
                firstControl.Xr0(sm0_0.c0(5610));
            } else {
                firstControl.Xr0(sm0_0.wa0(5624, Integer.toString(first.aE0())));
            }
            firstControl.Bb(0);
        }

        this.Py0.Sk(sm0_0.c0(7100));
        this.Py0.uf("label-time");

        W9 secondControl = new W9();
        this.Ce0 = secondControl;
        secondControl.pw0(second.s90());
        secondControl.k50(tw0_0.rl.U1(second.SG()));
        secondControl.RR(new OK0((P30) this, second));
        if (current < second.aE0()) {
            secondControl.k50(false);
            secondControl.pw0(false);
            if (second.aE0() == 9) {
                secondControl.Xr0(sm0_0.c0(5610));
            } else {
                secondControl.Xr0(sm0_0.wa0(5624, Integer.toString(first.aE0())));
            }
            secondControl.Bb(0);
        }

        this.Gr.Sk(sm0_0.c0(7101));
        this.Gr.uf("label-time");

        pg0_2 model = new pg0_2(options);
        X6 selector = new X6(model);
        this.kr0 = selector;
        selector.uf("signup-combobox");
        if (options.size() <= 1) {
            selector.pw0(false);
        }

        int selectedIndex = tw0_0.rl.uh0(first.xB0());
        if (selectedIndex < 0 || selectedIndex >= model.ul0()) {
            selectedIndex = 0;
        }
        selector.Bd(selectedIndex);
        selector.Rm0(this::lq0);

        byte index = 0;
        while (true) {
            Kw0[] controls = this.UZ;
            if (index >= controls.length) {
                break;
            }
            controls[index] = new Kw0();
            index = (byte) (index + 1);
        }

        if (!first.kf() || !second.kf() || (!this.jg0.VZ() && !this.Ce0.VZ())) {
            this.kr0.Ll(false);
            index = 0;
            while (true) {
                Kw0[] controls = this.UZ;
                if (index >= controls.length) {
                    break;
                }
                controls[index].Ll(false);
                index = (byte) (index + 1);
            }
        }

        this.lq0();
    }

    public final void Xr0() {
        W9 firstControl = this.jg0;
        boolean firstVisible = this.Sw0 && !this.q70 && this.QL0.BB;
        firstControl.pw0(firstVisible);

        W9 secondControl = this.Ce0;
        boolean secondVisible = this.Sw0 && !this.q70 && this.B90.BB;
        secondControl.pw0(secondVisible);
    }

    public final void lq0() {
        int selectedIndex = 0;
        WJ0 selected = null;
        X6 selector = this.kr0;
        if (selector != null) {
            selected = (WJ0) selector.Vh0();
            if (selected != null) {
                selectedIndex = selected.DZ;
            }
        }

        BR connection = tw0_0.rl;
        int accountId = this.QL0.Lq;
        connection.N40.Y6(accountId, selectedIndex);
        lpt2__0.Ig(connection.N40);

        this.Tk0.F8(selected, this.UZ, this.v60, this.QL0.A10);
        this.Xr0();
    }

    public final void yp(av_1 value) {
        boolean showDetails = value.com2
                && (this.jg0.ER.U20() || this.Ce0.ER.U20());

        byte index = 0;
        if (showDetails) {
            this.kr0.Ll(true);
            while (true) {
                Kw0[] controls = this.UZ;
                if (index >= controls.length) {
                    break;
                }
                controls[index].Ll(true);
                index = (byte) (index + 1);
            }
        } else {
            this.kr0.Ll(false);
            while (true) {
                Kw0[] controls = this.UZ;
                if (index >= controls.length) {
                    break;
                }
                controls[index].Ll(false);
                index = (byte) (index + 1);
            }
        }

        BR connection = tw0_0.rl;
        byte key = value.NR;
        boolean selected = this.jg0.ER.U20();
        connection.Mr.Y6(key, selected ? 1 : 0);
        lpt2__0.pW(connection.Mr);
    }
}
