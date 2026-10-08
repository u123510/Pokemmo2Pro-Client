package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.EI0
 */
public class Modern_Util_Ei0 implements By {

    public final NK j5;

    public Modern_Util_Ei0(NK owner) {
        this.j5 = owner;
    }

    @Override
    public final void py0(sg_2 source, i70_0 event) {
        NK owner = this.j5;
        if (owner.xm0) {
            owner.wn0(event.f8, event.AN);
        }
        owner.Sn0(source.y0(), event.f8, event.AN);
    }

    @Override
    public final void X70(sg_2 source, i70_0 event) {
        NK owner = this.j5;
        int x = event.f8;
        int y = event.AN;
        if (owner.xm0) {
            owner.DF(x, y);
        } else {
            owner.Br.fx0(x, y);
        }
    }

    @Override
    public final void Et0(sg_2 source, i70_0 event) {
        NK owner = this.j5;
        int x = event.f8;
        int y = event.AN;
        if (owner.xm0) {
            owner.wn0(x, y);
        } else {
            owner.Br.mf0(x, y);
        }
    }
}

