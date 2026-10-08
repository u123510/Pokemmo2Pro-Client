package cn.pokemmo.battle.ai.evaluator;

import f.*;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.battle.ai.evaluator.BaseBattleAiEvaluator;

public class FieldConditionEvaluator extends BaseBattleAiEvaluator {
    public FieldConditionEvaluator(Aj value) {
        super(value);
    }

    public final void case$(int value) {
        super.case$(value);
        dw_2.kt0 = this.eB0;
        dw_2.Va = true;
    }

    public final void RY(int ignoredWidth, int ignoredHeight) {
        super.RY(320, 30);
    }
}
