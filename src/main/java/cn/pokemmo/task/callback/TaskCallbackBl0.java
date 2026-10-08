package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackBl0 implements Runnable  {
   // $FF: synthetic field
   public final short pk;
   // $FF: synthetic field
   public final es_2 s1;

   public TaskCallbackBl0(es_2 var1, short var2) {
      this.s1 = var1;
      this.pk = var2;
   }

   public final void run() {
      BR var3 = tw0_0.rl;
      boolean var1 = false;
      short var2 = this.pk;
      var3.fk0.uQ(new Y8(var2, var1));
      this.s1.getClass();
      BU.T50.lo(false);
   }
}
