package cn.pokemmo.battle.ai.evaluator;

import f.*;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.battle.ai.evaluator.BaseBattleAiEvaluator;

public class TurnSequencingEvaluator extends BaseBattleAiEvaluator {
    public TurnSequencingEvaluator(Aj owner) {
        super(owner);
    }

    @Override
    public final String Tz() {
        if (this.eB0 < 1) {
            return sm0_0.c0(1265);
        }
        return fp0_0.uD(new StringBuilder(), (int) Math.pow(2.0, this.eB0), "x");
    }

    @Override
    public final boolean AZ(String value) {
        try {
            int parsed = Integer.parseInt(value.replaceAll("x", ""));
            parsed = (int) Math.round(Math.sqrt(parsed));
            this.case$(parsed);
            return true;
        } catch (NumberFormatException error) {
            return false;
        }
    }

    @Override
    public final String XF0(String value) {
        return super.XF0(value.replaceAll("x", ""));
    }
}
