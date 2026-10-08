package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackJb implements Runnable  {
   public final BU Og;

   public TaskCallbackJb(BU var1) {
      this.Og = var1;
   }

   @Override
   public final void run() {
      wg0_0 var1 = this.Og.package$;
      var1.getClass();
      if (lpt6__0.v90(var1)) {
         var1.wm = true;
         var1.kn0(true);
      }
   }
}