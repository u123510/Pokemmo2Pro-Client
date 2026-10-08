package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackTp implements Runnable  {
   public final hw_0 eC0;

   public TaskCallbackTp(hw_0 var1) {
      this.eC0 = var1;
   }

   @Override
   public final void run() {
      Ge0 ge0 = this.eC0.sr0();
      boolean flag;
      if (flag = this.eC0.g90) {
         ge0.nI = true;
      }

      ge0.NA = flag;
      E90 e90;
      if (flag && (e90 = ge0.cJ0.jB0) != null) {
         EA0 ea0 = e90.il0;
         e90.il0.gd = 0L;
         ea0.fv = 0L;
      }
   }
}
