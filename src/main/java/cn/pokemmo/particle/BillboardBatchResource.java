package cn.pokemmo.particle;

import f.Cq0;
import f.I2;
import f.dl_1;
import f.es_1;
import f.fy0_0;
import f.kz_0;
import f.sa_0;

/**
 * 看板娘与粒子批处理渲染资源
 * 原始类: f.Ww0
 */
public class BillboardBatchResource implements fy0_0 {
    public static final dl_1 rr;
    public final es_1 j60;

    static {
        rr = Cq0.E1(BillboardBatchResource.class);
        new sa_0(new kz_0[]{
                new kz_0(1, 3, "a_position"),
                new kz_0(16, 2, "a_texCoord0"),
                new kz_0(2, 4, "a_color"),
                new kz_0(512, 4, "a_sizeAndRotation")
        });
    }

    public BillboardBatchResource() {
        this.j60 = new es_1();
    }

    @Override
    public final void dispose() {
        I2 iterator = this.j60.ZD();
        while (iterator.hasNext()) {
            ((fy0_0) iterator.next()).dispose();
        }
        this.j60.clear();
    }
}
