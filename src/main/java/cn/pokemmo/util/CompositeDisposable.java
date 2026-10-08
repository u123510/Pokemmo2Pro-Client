package cn.pokemmo.util;

import f.I2;
import f.es_1;
import f.fy0_0;

/**
 * 复合生命周期资源容器
 * 原始类: f.W70
 */
public class CompositeDisposable implements fy0_0 {
    public final es_1 vc0;

    public CompositeDisposable() {
        this.vc0 = new es_1();
    }

    @Override
    public final void dispose() {
        I2 iterator = this.vc0.ZD();
        while (iterator.hasNext()) {
            ((fy0_0) iterator.next()).dispose();
        }
        this.vc0.clear();
    }
}
