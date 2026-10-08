package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackKl0 implements Runnable  {
   public final K90 ww0;
   public final i1_0 by0;

   public TaskCallbackKl0(i1_0 var1, K90 var2) {
      this.by0 = var1;
      this.ww0 = var2;
   }

   @Override
   public final void run() {
      CH0 var2 = this.ww0.RR;
      byte var1 = 1;
      tw0_0.rl.fk0.uQ(new vc_1(var2, var1));
      this.by0.xe0();
   }
}
