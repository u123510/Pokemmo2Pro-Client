package cn.pokemmo.ui.widget.layout;

import f.*;
import java.util.*;

public class PagedViewContainerLayout extends BaseLayoutBox {
    public final xe_1 xg;
    public final G20[] qa;
    public int XU;

    public PagedViewContainerLayout(VU v1, short i2, Runnable v3) {
        super();
        this.XU = 0;
        cn_0 v4 = new cn_0(sm0_0.H5(lpt6__2.Q80, 157, 39));
        this.qa = new G20[5];
        for (byte b = 0; b < this.qa.length; b = (byte) (b + 1)) {
            this.qa[b] = new G20("", "");
            this.qa[b].qF0(pa0_0.up0);
        }
        boolean hasEmptySlot = false;
        byte b = 0;
        while (b < this.qa.length) {
            short moveId;
            if (b == 4) {
                moveId = i2;
            } else {
                moveId = v1.RJ().UD(b);
            }
            if (moveId == 0) {
                this.qa[b].SU("-");
                this.qa[b].Pc("");
                this.qa[b].pw0(false);
                this.qa[b].Gx().lo0();
                this.qa[b].Xr0(null);
                this.qa[b].ML0();
                if (!hasEmptySlot) {
                    hasEmptySlot = true;
                    this.qa[b].pw0(true);
                }
            } else {
                this.qa[b].pw0(true);
                vk0_1 moveInfo = ec0_2.Sx().SX(moveId);
                this.qa[b].Xr0(s2_0.tq0(moveInfo, v1));
                this.qa[b].Pc(lb0_2.fb0(moveInfo));
                this.qa[b].ML0();
                this.qa[b].Gx().r8(new LPT6_[]{fn_0.qz0().jJ0(moveInfo.yS(v1.RJ()).o6())});
                this.qa[b].Gx().Gy0(153, 10);
                this.qa[b].SU(moveInfo.CoM2());
                this.qa[b].ML0();
            }
            if (this.qa[b].uo()) {
                final byte slotIndex = b;
                this.qa[b].RR(() -> JG0(slotIndex, v3));
            }
            b = (byte) (b + 1);
        }
        this.qa[4].pw0(false);
        xe_1 cancelBtn = new xe_1(sm0_0.c0(nf0_0.Bq0));
        this.xg = cancelBtn;
        cancelBtn.uf("rbattle");
        cancelBtn.RR(() -> xe0());

        x40(H10().Xq(new ya_1[]{
            lo0().LPt3(new le0_2[]{this.qa[0], this.qa[1]}),
            lo0().LPt3(new le0_2[]{this.qa[2], this.qa[3]}),
            lo0().LPt3(new le0_2[]{this.qa[4], v4}),
            hb(new le0_2[]{cancelBtn})
        }).qd(240));

        WQ(H10().qd(80).Xq(new ya_1[]{
            lo0().LPt3(new le0_2[]{this.qa[0], this.qa[2], this.qa[4]}),
            lo0().LPt3(new le0_2[]{this.qa[1], this.qa[3]}).X20(C7(new le0_2[]{v4, cancelBtn}))
        }).qd(80));
    }

    @Override
    public final void K8() {
        for (int i = 0; i < this.qa.length; i++) {
            this.qa[i].RY(210, 48);
            this.qa[i].oY(210, 48);
            this.qa[i].g2(210, 48);
        }
        this.xg.lt0();
        this.xg.oY(50, 20);
        lt0();
        super.K8();
    }

    @Override
    public final void C(zk0_1 v1) {
        this.uc = false;
        lpt6__0.v90(this.qa[this.XU]);
    }

    public final void JG0(byte i1, Runnable v2) {
        this.XU = i1;
        v2.run();
        xe0();
    }
}
