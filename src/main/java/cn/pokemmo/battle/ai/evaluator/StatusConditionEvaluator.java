package cn.pokemmo.battle.ai.evaluator;

import f.*;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.battle.ai.evaluator.BaseBattleAiEvaluator;

public class StatusConditionEvaluator extends BaseBattleAiEvaluator {
    public StatusConditionEvaluator(Aj value) {
        super(value);
    }

    @Override
    public final String Tz() {
        return fp0_0.uD(new StringBuilder(), this.eB0, "x");
    }

    @Override
    public final boolean AZ(String value) {
        try {
            int parsed = Integer.parseInt(value.replaceAll("x", ""));
            parsed = (int) Math.round(Math.sqrt(parsed));
            this.case$(parsed);
            return true;
        } catch (NumberFormatException ignored) {
            return false;
        }
    }

    @Override
    public final String XF0(String value) {
        return super.XF0(value.replaceAll("x", ""));
    }
}
