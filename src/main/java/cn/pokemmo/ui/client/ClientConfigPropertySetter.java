package cn.pokemmo.ui.client;

import f.ix0_0;
import f.uj_2;
import f.wk0_1;

/**
 * 客户端配置回调设值器
 */
public class ClientConfigPropertySetter implements wk0_1 {
    public final String[] TO;

    public ClientConfigPropertySetter(String[] stringArray) {
        this.TO = stringArray;
    }

    @Override
    public void s2(Object object) {
        ((uj_2) object).jA0 = ix0_0.valueOf(this.TO[1]);
    }
}
