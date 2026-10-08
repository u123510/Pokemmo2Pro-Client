package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public class BaseFloatingOverlayComponent extends BaseComponent {
    public BaseFloatingOverlayComponent() {
        super();
    }

    @Override
    public String Ck() {
        return "container";
    }

    @Override
    public final int R1() {
        int value = this.e80 + this.NV;
        value += ia0_1.Bb0(this);
        return Math.max(super.R1(), value);
    }

    @Override
    public final int Se() {
        int value = this.y9 + this.Cz;
        value += ia0_1.Pj(this);
        return Math.max(super.Se(), value);
    }

    public final int pi0() {
        return ia0_1.rg0(this);
    }

    public final int zs0() {
        return ia0_1.Lw0(this);
    }

    @Override
    public void K8() {
        KU children = this.t30;
        if (children == null) {
            return;
        }
        le0_2[] values = (le0_2[]) children.pa();
        for (int index = 0; index < children.KB; index++) {
            this.uM(values[index]);
        }
        children.Gj0();
    }
}
