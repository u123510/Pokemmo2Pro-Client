package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackU2 implements Runnable  {
   public final byte Vi0;
   public final BU Dn0;

   public TaskCallbackU2(byte var1, BU var2) {
      this.Vi0 = var1;
      this.Dn0 = var2;
   }

   @Override
   public final void run() {
      tw0_0.rl.ze0(this.Vi0, (byte)0);
      TH var1;
      BU var2;
      if ((var1 = (var2 = this.Dn0).jg0) != null) {
         var1.xe0();
         var2.jg0 = null;
      }
   }
}
