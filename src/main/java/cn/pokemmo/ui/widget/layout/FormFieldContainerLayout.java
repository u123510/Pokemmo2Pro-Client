package cn.pokemmo.ui.widget.layout;

import f.*;
import java.util.*;

import java.util.ArrayList;

public class FormFieldContainerLayout extends BaseLayoutBox {
    public final ArrayList tj;
    public xe_1[] wn0;
    public final er_0 VP;
    public final ga_1 Jn;
    public final cg_0 Bv;
    public final e30_0 ee;

    public FormFieldContainerLayout(e30_0 data) {
        super();
        this.tj = new ArrayList();
        this.uf("dialoglayout");
        this.ee = data;
        this.jB0();
        this.Jn = new ga_1((f.P1)(Object)this);
        this.VP = new er_0(this.Jn);
        this.VP.Vo0(xe_1.class, new H0());
        this.VP.p5(true);
        this.VP.Dp0();

        lo0_0 noteContainer = new lo0_0(this.VP);
        cn_0 noteLabel = new cn_0("Add Note: ");
        this.Bv = new cg_0();
        noteLabel.kl();
        this.Bv.c2();
        lo0_0 textScroll = new lo0_0(this.Bv);
        textScroll.uf("/text-scrollpane");
        this.Bv.mm("");

        fy_2 editor = new fy_2();
        xe_1 addButton = new xe_1("Add");
        addButton.RR(new aj0_2((f.P1)(Object)this, editor));
        xe_1 cancelButton = new xe_1("Cancel");
        cancelButton.RR(new cy_1((f.P1)(Object)this, editor));
        this.uf("/adminframe-dialog");

        editor.lo0().X20(editor.H10().LPt3(new le0_2[]{noteLabel}));
        editor.lo0().X20(editor.H10().Kn0(textScroll));
        editor.WQ(editor.H10().LPt3(new le0_2[]{addButton, cancelButton}));
        editor.lo0().X20(editor.lo0().LPt3(new le0_2[]{noteLabel}));
        editor.lo0().X20(editor.lo0().LPt3(new le0_2[]{textScroll}));
        editor.x40(editor.lo0().LPt3(new le0_2[]{addButton, cancelButton}));

        xe_1 dialogAdd = new xe_1("Add");
        dialogAdd.RR(new oy_0((f.P1)(Object)this, editor));
        editor.lo0().X20(editor.H10().Kn0(dialogAdd).qd(250));
        editor.H10().X20(editor.lo0().LPt3(new le0_2[]{dialogAdd}).qd(5));
        editor.x40(editor.lo0().LPt3(new le0_2[]{noteContainer}));
    }

    public final boolean nd0(i70_0 event) {
        return this.Bv.Of();
    }

    public final void K8() {
        this.VP.bM0(0, 90);
        this.VP.bM0(1, 165);
        this.VP.bM0(2, 425);
        this.VP.bM0(3, 60);
        this.VP.lt0();
        super.K8();
    }

    public final void jB0() {
        this.wn0 = new xe_1[this.tj.size()];
        for (int i = 0; i < this.tj.size(); i++) {
            this.wn0[i] = new xe_1("Delete");
            this.wn0[i].RR(new CA((f.P1)(Object)this, i));
        }
    }
}
