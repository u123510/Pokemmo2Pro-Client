package f;

import cn.pokemmo.data.ConfigHolder;
import f.K5;

public interface dn0_0 extends ConfigHolder {
    @Override
    K5 Ft0();

    @Override
    void UR(K5 var1);

    @Override
    default K5 getConfig() {
        return Ft0();
    }

    @Override
    default void setConfig(K5 config) {
        UR(config);
    }
}
