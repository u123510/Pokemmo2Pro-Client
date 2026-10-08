package cn.pokemmo.ui.widget.component;

import f.*;

public class StyledComboBoxPopup extends G00 {
    public final Bp0 extends$;
    public Bp0 MD;
    public final Bp0 sk0;
    public Bp0 t5;

    public StyledComboBoxPopup(jk_0 sprite, Bp0 start, Bp0 end) {
        super(sprite, (int) start.x, (int) start.y);
        this.extends$ = start.Jp0();
        this.MD = start;
        this.sk0 = end;
        int steps = (int) Math.floor(Math.abs(end.ut(start)) / 4.0F);
        this.t5 = new Bp0((end.x - start.x) / steps, (end.y - start.y) / steps);
    }

    @Override
    public final void Fu() {
        if (!this.Dk0()) {
            return;
        }
        if (this.sd0 % 3 != 0) {
            return;
        }
        if (this.MD.ut(this.sk0) >= 1.0F) {
            this.MD.x += this.t5.x;
            this.MD.y += this.t5.y;
            super.Fu();
            return;
        }
        if (this.QD0) {
            this.MD = new Bp0(this.extends$);
        }
        super.Fu();
    }

    @Override
    public final int hC() {
        return (int) this.MD.x;
    }

    @Override
    public final int lt0() {
        return (int) this.MD.y;
    }
}
