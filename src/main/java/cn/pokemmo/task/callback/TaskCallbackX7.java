package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackX7 implements Runnable  {
   public final ce0_0 ld;
   public final ab_1 rF0;

   public TaskCallbackX7(ab_1 var1, ce0_0 var2) {
      this.rF0 = var1;
      this.ld = var2;
   }

   @Override
   public final void run() {
      String var1 = sm0_0.wa0(2720, this.ld.GG0.DR);
      rw_1 var2 = new rw_1(this);
      Qy0.yI0.sr0(new lpt3__4(var1, var2, this.rF0));
   }
}
