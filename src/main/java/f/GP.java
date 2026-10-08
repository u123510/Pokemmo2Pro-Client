package f;

import cn.pokemmo.battle.calc.MultiHitDamageCalculator;
import java.nio.ByteBuffer;

public class GP extends MultiHitDamageCalculator {
    public GP(ByteBuffer byteBuffer, Ry ry, int n) {
        super(byteBuffer, ry, n);
    }
}
