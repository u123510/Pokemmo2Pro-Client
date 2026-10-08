/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.ai.evaluator;

import f.*;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.battle.ai.evaluator.BaseBattleAiEvaluator;

public class MoveEffectivenessEvaluator extends BaseBattleAiEvaluator {
    public MoveEffectivenessEvaluator(Aj aj) {
        super(aj);
    }

    @Override
    public final String Tz() {
        MoveEffectivenessEvaluator tM = this;
        int n = tM.eB0;
        V v = tM.ga;
        if (v != null) {
            this.wG0 = v.vu0();
        }
        if (n <= this.wG0) {
            return sm0_0.c0(1220);
        }
        return super.Tz();
    }
}

