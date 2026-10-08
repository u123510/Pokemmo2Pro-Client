package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackAm0 implements Runnable  {
   // $FF: synthetic field
   public final al0_0 c;

   public TaskCallbackAm0(al0_0 var1) {
      this.c = var1;
   }

   public final void run() {
      tj0_0 var1;
      if ((var1 = tw0_0.Tl0) != null) {
         CH0 var2 = this.c.Mv;
         if (var1.k00.containsKey(var2)) {
            var1.k00.remove(var2);
         }
      }

      al0_0 var3;
      le0_2 var4;
      if ((var4 = (var3 = this.c).K20) != null) {
         var4.u3(var3);
      }

   }
}
