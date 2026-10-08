package cn.pokemmo.world.tile;

import f.*;
import java.util.ArrayList;
import java.util.Iterator;

public class StepTriggeredTileBehavior extends qj_0 {
    public final fy_2 pb;

    public StepTriggeredTileBehavior(COm8_ owner, ArrayList items) {
        super(owner);
        this.uf("wardrobe-picker");
        this.pb = new fy_2();
        Hm0 vertical = this.pb.lo0();
        I7 horizontal = this.pb.H10();
        ia0_1 row = new ia0_1();
        int index = 0;
        int stride = 5;
        Iterator iterator = items.iterator();
        while (iterator.hasNext()) {
            X90 item = (X90) iterator.next();
            if (item.ZD0() == q10_0.Ci) {
                stride = 3;
            }
            if (index++ % stride == 0) {
                row = new ia0_1();
                vertical.Kn0(row);
                horizontal.Kn0(row);
            }
            row.SL(new ic0_1(owner, (ly_1) (Object) this, item));
        }
        this.pb.x40(horizontal);
        this.pb.WQ(vertical);
        if (items.size() == 0) {
            this.uf("wardrobe-picker-empty");
            cn_0 label = new cn_0(sm0_0.c0(3205));
            label.uf("label");
            vertical.Kn0(label);
            horizontal.Kn0(label);
            this.SL(this.pb);
        } else {
            this.SL(new lo0_0(this.pb));
            this.lt0();
        }
    }

    @Override
    public final void K8() {
        super.K8();
        this.pb.lt0();
    }
}
