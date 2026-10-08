package cn.pokemmo.graphics.camera;

import f.C8;
import f.lt_2;

public interface RaycastProvider {
    lt_2 raycast(float distance, C8 direction);

    default lt_2 DA0(float var1, C8 var2) {
        return raycast(var1, var2);
    }
}
