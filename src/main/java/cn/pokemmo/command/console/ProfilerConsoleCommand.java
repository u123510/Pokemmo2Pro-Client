package cn.pokemmo.command.console;

import f.*;
import java.util.*;


public class ProfilerConsoleCommand extends BaseConsoleCommand {
   public ProfilerConsoleCommand() {
      super("profiler");
   }

   public void Hh(String[] var1) {
      Kr0 var3;
      boolean var4;
      if (var4 = (var3 = tw0_0.t30).t40) {
         if (var4) {
            ok0_0 var5;
            if ((var5 = var3.ax0) instanceof x6_0) {
               pt0_0 var2 = ((x6_0)var5).m2;
               ((k3_0)var3.Ry).MH = var2;
            }

            if (var5 instanceof yw0_0) {
               Aa var6 = ((yw0_0)var5).tK0;
               ((k3_0)var3.Ry).lv = var6;
            }

            if (var5 instanceof hs0_0) {
               lb0_1 var7 = ((hs0_0)var5).FJ0;
               ((k3_0)var3.Ry).COm2 = var7;
            }

            if (var5 instanceof rl0_2) {
               k3_0 var10000 = (k3_0)var3.Ry;
               var10000.Z7 = ((rl0_2)var10000.Z7).lQ;
            }

            k3_0 var10001 = (k3_0)var3.Ry;
            pt0_0 var10003 = var10001.MH;
            lg_0.MA = var10001.COm2;
            lg_0.OH0 = lg_0.Sf0 = var10001.Z7;
            var3.t40 = false;
         }

         lpt3__1.FQ = false;
         lpt3__1.Ha0 = true;
      } else {
         var3.yD0();
         lpt3__1.FQ = true;
         lpt3__1.Ha0 = true;
      }

   }

    @Override
    public void execute(String[] args) {
        this.Hh(args);
    }
}
