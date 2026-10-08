package cn.pokemmo.ui.widget.text;

import f.*;
import java.util.*;

public class TitleHeadingLabel extends BaseLabel {
    public int Vi0;
    public int fN;

    public TitleHeadingLabel(String v1) {
        super(v1);
    }


    public TitleHeadingLabel(String v1, int i2, int i3) {
        super(v1);
        this.Vi0 = i2;
        this.fN = i3;
    }


    public final int R1() {
        return this.Vi0;
    }


    public final int Se() {
        return this.fN;
    }


    public final boolean nd0(i70_0 v1) {
        if (E00.ZU(v1.zu) && v1.finally$ == 66) {
            return false;
        }
        return super.nd0(v1);
    }


    public final void K8() {
        int i1 = this.Vi0;
        if (i1 > 0) {
            int i2 = this.fN;
            if (i2 > 0) {
                this.RY(i1, i2);
                this.g2(this.Vi0, this.fN);
                this.oY(this.Vi0, this.fN);
            }
        }
    }


    public final void iv(int i1, int i2) {
        this.Vi0 = i1;
        this.fN = i2;
    }


    public final void Dw0(zk0_1 v1) {
    }
}
