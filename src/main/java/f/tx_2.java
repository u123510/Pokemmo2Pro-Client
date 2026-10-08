package f;

import cn.pokemmo.graphics.camera.RaycastProvider;
import f.C8;
import f.lt_2;

public interface tx_2 extends RaycastProvider {
    @Override
    lt_2 DA0(float var1, C8 var2);

    @Override
    default lt_2 raycast(float distance, C8 direction) {
        return DA0(distance, direction);
    }
}
