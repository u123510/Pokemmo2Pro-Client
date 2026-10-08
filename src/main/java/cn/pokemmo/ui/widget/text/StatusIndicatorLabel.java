package cn.pokemmo.ui.widget.text;

import f.*;
import java.util.*;

public class StatusIndicatorLabel extends BaseLabel {
    public static final boolean Eg = !StatusIndicatorLabel.class.desiredAssertionStatus();
    public int COM1;
    public int a5;
    public boolean zX;
    public bb0_2 Rk;

    public StatusIndicatorLabel() {
        super();
    }

    public StatusIndicatorLabel(KG0 state) {
        super(state, 0);
    }

    @Override
    public final String Ck() {
        return "draggablebutton";
    }

    public final void Nl(bb0_2 listener) {
        this.Rk = listener;
    }

    @Override
    public final boolean nd0(i70_0 event) {
        int eventType = event.zu;
        if (E00.C10(eventType) && this.zX) {
            if (eventType == 6 && this.Rk != null) {
                this.Rk.Rw(event.f8 - this.COM1, event.AN - this.a5);
            }

            if (event.LI0()) {
                if (this.Rk != null) {
                    this.Rk.zR();
                }
                this.zX = false;
                this.ER.Mo0(false);
                this.ER.tF(false);
                this.ER.Ge0(this.yv0(event.f8, event.AN));
            }
            return true;
        }

        int mappedType = J90.Qj(eventType);
        if (mappedType == 5) {
            if (!Eg && this.zX) {
                throw new AssertionError();
            }
            this.zX = true;
            this.ER.Mo0(false);
            this.ER.tF(true);
            if (this.Rk != null) {
                this.Rk.oj();
            }
            return true;
        }

        if (mappedType == 2) {
            this.COM1 = event.f8;
            this.a5 = event.AN;
        }
        return super.nd0(event);
    }
}
