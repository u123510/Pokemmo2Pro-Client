package cn.pokemmo.graphics;

import f.I2;
import f.es_1;
import f.fy0_0;
import f.un_0;
import f.yg0_1;

public class DisposableResourceContainer extends un_0 {
    public final yg0_1 Ri;
    public es_1 Lu0;

    public DisposableResourceContainer() {
        super();
        this.Ri = new yg0_1();
    }

    @Override
    public void dispose() {
        if (this.Lu0 != null) {
            I2 it = this.Lu0.ZD();
            while (it.hasNext()) {
                ((fy0_0) it.next()).dispose();
            }
        }
    }
}
