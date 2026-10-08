package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackQ5 implements Runnable  {
   public final E90 D20;
   public final _strictfp t;

   public TaskCallbackQ5(_strictfp var1, E90 var2) {
      this.t = var1;
      this.D20 = var2;
   }

   @Override
   public final void run() {
      EA0 var10001 = this.D20.il0;
      Ou0 var2 = this.t.Mc0;
      boolean var1 = false;
      this.D20.il0.getClass();
      var10001.f60(var2, var1, C8.Zero);
      this.t.c70 = 4;
   }
}
