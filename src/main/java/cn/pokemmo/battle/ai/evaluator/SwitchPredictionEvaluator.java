package cn.pokemmo.battle.ai.evaluator;

import f.*;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.battle.ai.evaluator.BaseBattleAiEvaluator;

public class SwitchPredictionEvaluator extends BaseBattleAiEvaluator {
    public SwitchPredictionEvaluator(Aj owner) {
        super(owner);
    }

    public final void case$(int value) {
        super.case$(value);
        dw_2.c10 = this.eB0;
        ML0 window = Qy0.yI0.ZW;
        if (window != null) {
            window.K8();
        }
        I30 overlay = Qy0.yI0.ez0;
        if (overlay != null) {
            overlay.K8();
        }
        jn_0 application = tw0_0.LD0;
        application.getClass();
        int width = lg_0.S4.Kr0();
        int height = lg_0.S4.sD0();
        if (application.he0 != null) {
            application.he0.aQ();
        }
        if (application.hO != null) {
            application.hO.LPt6(width, height);
        }
        if (application.uc != null) {
            application.uc.LPt6(width, height);
        }
        if (application.qL0 != null) {
            application.qL0.LPt6(width, height);
        }
    }
}
