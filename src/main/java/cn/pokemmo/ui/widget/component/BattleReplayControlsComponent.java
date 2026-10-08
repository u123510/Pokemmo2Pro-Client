package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

public class BattleReplayControlsComponent extends BaseComponent implements tr_1 {
    public final fy_2 mI0;
    public final byte UR;
    public int gk;
    public final ArrayList<xe_1> UM;

    public BattleReplayControlsComponent(byte b, boolean z, String[] arr1, CH0[] arr2) {
        this.gk = 0;
        this.UM = new ArrayList<>();
        this.UR = b;
        uf("channelwidget");
        fy_2 v1_fy = new fy_2();
        this.mI0 = v1_fy;
        I7 v1_I7 = v1_fy.H10();
        Hm0 v5_Hm0 = v1_fy.lo0();
        xe_1 btn;
        if (z) {
            btn = new xe_1(sm0_0.wa0(6751, tw0_0.e60.at().na0()));
        } else {
            btn = new xe_1(sm0_0.c0(6750));
        }
        btn.RR(new re0_0((f.ig0_2)(Object)this));
        this.UM.add(btn);
        AtomicInteger counter = new AtomicInteger(2);
        ArrayList<hj0_2> channelList = new ArrayList<>();
        for (int i = 0; i < arr1.length; ++i) {
            CH0 dummy = arr2[i];
            channelList.add(new hj0_2(arr1[i], (byte) counter.getAndIncrement()));
        }
        Collections.sort(channelList);
        for (hj0_2 entry : channelList) {
            xe_1 entryBtn = new xe_1(sm0_0.wa0(6751, hj0_2.uA(entry)));
            entryBtn.RR(new Bz0((f.ig0_2)(Object)this, entry));
            this.UM.add(entryBtn);
        }
        xe_1 cancelBtn = new xe_1(sm0_0.c0(nf0_0.Bq0));
        cancelBtn.RR(new tj_1((f.ig0_2)(Object)this));
        this.UM.add(cancelBtn);
        for (xe_1 button : this.UM) {
            v1_I7.Kn0(button);
            v5_Hm0.Kn0(button);
        }
        this.mI0.x40(v1_I7.Ze0());
        this.mI0.WQ(v5_Hm0);
        SL(this.mI0);
    }

    public final void C(zk0_1 v1) {
        if (Ok() != null) {
            lpt6__0.v90(Ok());
        }
    }

    public final void nD() {
        if (Ok() != null) {
            lpt6__0.v90(Ok());
        }
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (E00.ZU(v1.zu) && v1.iT()) {
            int i2 = v1.finally$;
            rp_0 rp = rp_0.kC0;
            int unused = dw_2.ff;
            if (rp != null && rp.Ov(i2)) {
                this.gk--;
                if (Ok() != null) {
                    lpt6__0.v90(Ok());
                }
                return true;
            }
            rp = rp_0.synchronized$;
            if (rp != null && rp.Ov(i2)) {
                this.gk++;
                if (Ok() != null) {
                    lpt6__0.v90(Ok());
                }
                return true;
            }
            rp = rp_0.sJ0;
            if (rp != null && rp.Ov(i2)) {
                a7_0.bH(Ok().ER.Fc0);
                return true;
            }
            rp = rp_0.nK0;
            if (rp != null && rp.Ov(i2)) {
                a7_0.bH(this.UM.get(this.UM.size() - 1).ER.Fc0);
                return true;
            }
        }
        return super.nd0(v1);
    }

    @Override
    public final void K8() {
        for (xe_1 button : this.UM) {
            button.RY(button.Mx, 25);
        }
        this.mI0.lt0();
        int x = kq_0.lpT2(this.K20.a3(), this.mI0.Mx, 2, this.K20.A20 + this.K20.e80);
        int y = kq_0.lpT2(this.K20.k5(), this.mI0.OB, 2, this.K20.SB0 + this.K20.y9);
        this.mI0.E40(x, y);
        this.mI0.oY(this.mI0.A20 + this.mI0.Mx, this.mI0.SB0 + this.mI0.OB);
    }

    public final xe_1 Ok() {
        if (this.gk >= this.UM.size()) {
            this.gk = this.UM.size() - 1;
        }
        if (this.gk < 0) {
            this.gk = 0;
        }
        if (this.gk >= this.UM.size()) {
            return null;
        }
        return this.UM.get(this.gk);
    }
}
