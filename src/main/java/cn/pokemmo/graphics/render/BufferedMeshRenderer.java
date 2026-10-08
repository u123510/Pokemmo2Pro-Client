package cn.pokemmo.graphics.render;

import f.ER;
import f.FG;
import f.I2;
import f.Tv0;
import f.U5;
import f.XB;
import f.es_1;
import f.uh_1;

public class BufferedMeshRenderer extends ER {
    public final es_1 X60;
    public U5 Z00;

    public BufferedMeshRenderer(XB v1, FG v2) {
        super(v1, v2);
        this.X60 = new es_1();
    }

    @Override
    public void jK(Tv0 v1) {
        super.jK(v1);
        I2 it = this.X60.ZD();
        while (it.hasNext()) {
            uh_1 v2 = (uh_1) it.next();
            U5 u5 = this.Z00;
            if (u5 != null) {
                super.Lh0(v2, u5);
            } else {
                this.eo0(v2);
            }
        }
    }

    @Override
    public void end() {
        super.end();
        this.X60.clear();
    }

    @Override
    public void Lh0(uh_1 v1, U5 v2) {
        this.X60.Ue0(v1);
        this.Z00 = v2;
    }
}
