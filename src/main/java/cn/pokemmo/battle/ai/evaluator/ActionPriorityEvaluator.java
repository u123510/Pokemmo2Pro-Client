package cn.pokemmo.battle.ai.evaluator;

import f.*;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.battle.ai.evaluator.BaseBattleAiEvaluator;

public class ActionPriorityEvaluator extends BaseBattleAiEvaluator {
   public ActionPriorityEvaluator(Aj var1) {
      super(var1);
   }

   @Override
   public final String Tz() {
      return super.eB0 > 5 ? sm0_0.c0(1394) : fp0_0.uD(new StringBuilder(), super.eB0, "x");
   }

   @Override
   public final boolean AZ(String var1) {
      try {
         this.case$(Integer.parseInt(var1.replaceAll("x", "")));
         return true;
      } catch (NumberFormatException var2) {
         return false;
      }
   }

   @Override
   public final String XF0(String var1) {
      return super.XF0(var1.replaceAll("x", ""));
   }
}
