package cn.pokemmo.command.console;

import f.*;
import java.util.*;


public class ExitConsoleCommand extends BaseConsoleCommand {
   public ExitConsoleCommand() {
      super("exit");
   }

   @Override
   public void Hh(String[] var1) {
      zy0_0 var2 = zy0_0.CF0;
      synchronized (var2) {
         var2.Xt("客户端正在退出...", "default");
      }
      lg_0.k.T0 = false;
   }

    @Override
    public void execute(String[] args) {
        this.Hh(args);
    }
}
