package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackCa implements Runnable  {
   public final P1 rF;
   public final int L3;

   public TaskCallbackCa(P1 var1, int var2) {
      this.rF = var1;
      this.L3 = var2;
   }

   @Override
   public final void run() {
      P1 var3 = this.rF;
      th_0 var1;
      if ((var1 = (th_0)var3.tj.get(this.L3)) != null) {
         BR var4 = tw0_0.rl;
         CH0 var5 = var3.ee.WN;
         CH0 var2 = var1.xF;
         var4.fk0.uQ(new dl0_0(var5, var2));
      }
   }
}
