package cn.pokemmo.data;

import f.K40;
import f.wk0_1;

/**
 * 字符串数组配置参数回调解析器
 */
public class ConfigStringArrayParser implements wk0_1 {
    public final String[] SX;

    public ConfigStringArrayParser(String[] stringArray) {
        this.SX = stringArray;
    }

    @Override
    public void s2(Object object) {
        K40 k40 = (K40) object;
        k40.gr = Integer.parseInt(this.SX[1]);
        k40.n = Integer.parseInt(this.SX[2]);
    }
}
