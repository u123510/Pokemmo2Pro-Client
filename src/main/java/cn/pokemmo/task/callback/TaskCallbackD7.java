package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackD7 implements Runnable  {
   public final Dm0 COM1;
   public final gc_0 j80;
   public TaskCallbackD7(gc_0 var1, Dm0 var2) {
      this.j80 = var1;
      this.COM1 = var2;
   }

   @Override
   public final void run() {
      this.j80.fH0.pw0(false);
      this.j80.fH0.SU(sm0_0.c0(1956));
      tw0_0.rl.fk0.uQ(new ed0_1((byte)2));
      byte var1 = this.COM1.c80;
      this.COM1.u8[var1] = true;
      this.j80.Hr0();
   }
}
