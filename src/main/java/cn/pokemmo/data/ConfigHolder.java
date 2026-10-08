package cn.pokemmo.data;

import f.K5;

public interface ConfigHolder {
    K5 getConfig();

    void setConfig(K5 config);

    default K5 Ft0() {
        return getConfig();
    }

    default void UR(K5 var1) {
        setConfig(var1);
    }
}
