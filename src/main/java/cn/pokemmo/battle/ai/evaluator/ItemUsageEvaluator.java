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

/*
 * Renamed from f.uw0
 */
public class ItemUsageEvaluator extends BaseBattleAiEvaluator {
    public ItemUsageEvaluator(Aj aj) {
        super(aj);
    }

    @Override
    public final String Tz() {
        ItemUsageEvaluator uw0_02 = this;
        int n = uw0_02.eB0;
        V v = uw0_02.ga;
        if (v != null) {
            this.wG0 = v.vu0();
        }
        if (n > this.wG0) {
            ItemUsageEvaluator uw0_03 = this;
            n = uw0_03.eB0;
            v = uw0_03.ga;
            if (v != null) {
                this.Se0 = v.OD();
            }
            if (n < this.Se0) {
                return super.Tz();
            }
        }
        return sm0_0.c0(1240);
    }
}

