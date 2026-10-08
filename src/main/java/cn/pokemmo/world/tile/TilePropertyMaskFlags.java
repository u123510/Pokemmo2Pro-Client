package cn.pokemmo.world.tile;

import f.*;

public class TilePropertyMaskFlags {
    public final es_1 sa;
    public final es_1 ff;
    public int RC0;
    public final int QY;
    public final boolean Qo;
    public jg0_0 nK0;

    public TilePropertyMaskFlags() {
        super();
        this.sa = new es_1();
        this.ff = new es_1(1);
        this.QY = 1;
        this.Qo = true;
        this.RC0 = 1;
    }

    public TilePropertyMaskFlags(jg0_0... buttons) {
        super();
        this.sa = new es_1();
        this.ff = new es_1(1);
        this.QY = 1;
        this.Qo = true;
        this.RC0 = 0;
        this.F70(buttons);
        this.RC0 = 1;
    }

    public final void F70(jg0_0... buttons) {
        if (buttons == null) {
            throw new IllegalArgumentException("buttons cannot be null");
        }
        for (jg0_0 button : buttons) {
            if (button == null) {
                throw new IllegalArgumentException("button cannot be null.");
            }
            button.VP = null;
            boolean selected;
            if (button.Uo) {
                selected = true;
            } else if (this.sa.KB < this.RC0) {
                selected = true;
            } else {
                selected = false;
            }
            button.yH0(selected, false);
            button.VP = (ws_2) (Object) this;
            this.sa.Ue0(button);
            button.yH0(button.BI, false);
        }
    }
}
