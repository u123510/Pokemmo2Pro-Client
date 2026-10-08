package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackKj implements Runnable  {
   public final e70_0 zW;

   public TaskCallbackKj(e70_0 var1) {
      this.zW = var1;
   }

   @Override
   public final void run() {
      String var1 = this.zW.zJ0;
      tw0_0.rl.fk0.uQ(new hp_1(var1));
      BB0 var4 = tw0_0.rl.a8;
      CH0 var2 = this.zW.w8;
      e70_0 var3;
      if ((var3 = (e70_0)tw0_0.rl.a8.qY.remove(var2)) != null) {
         var4.o7 = true;
         tw0_0.rl.jC(sm0_0.wa0(1670, var3.zJ0), zo_0.Dd);
      }
   }
}
