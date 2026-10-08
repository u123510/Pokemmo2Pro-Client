package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public class BerryPlantingProgressComponent extends BaseComponent {
    public final fy_2 LF0;
    public final cg_0 rw;

    public BerryPlantingProgressComponent(VU creature) {
        this.uf("confirm-widget");
        fy_2 panel = new fy_2();
        this.LF0 = panel;
        panel.uf("confirm-panel");
        cn_0 prompt = new cn_0(sm0_0.wa0(1845, creature.k30()));
        cg_0 input = new cg_0();
        this.rw = input;
        input.I7();
        prompt.kl();
        input.ef0(16);
        input.LPt8("[a-zA-Z0-9 ,.!?\"'\\-~ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõöøùúûüýþÿ]");
        if (creature.RJ().Y1()) {
            input.mm(creature.RJ().eM());
        }
        xe_1 accept = new xe_1(sm0_0.c0(60));
        accept.RR(() -> this.ar(creature));
        xe_1 cancel = new xe_1(sm0_0.c0(nf0_0.Bq0));
        cancel.RR(this::xe0);
        panel.x40(panel.H10().Kn0(prompt).Kn0(input)
                .X20(panel.H10().LPt3(new le0_2[]{accept, cancel})).Ze0());
        panel.WQ(panel.lo0().Kn0(prompt).Kn0(input)
                .X20(panel.lo0().Kn0(accept).Kn0(cancel)));
        this.SL(panel);
    }

    public final void C(zk0_1 ignored) {
        lpt6__0.v90(this.rw);
    }

    @Override
    public final void K8() {
        this.LF0.lt0();
        this.lt0();
        this.nk0(pa0_0.Ol, 0);
    }

    public final void ar(VU creature) {
        this.xe0();
        CH0 id = creature.pu;
        String text = ((wn0_0)this.rw.dI0).YA.toString();
        tw0_0.rl.fk0.uQ(new j4_0(id, text));
    }
}
