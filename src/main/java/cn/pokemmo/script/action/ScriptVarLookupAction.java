package cn.pokemmo.script.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class ScriptVarLookupAction extends BaseScriptAction {
   public final i00_0 iz;

   public ScriptVarLookupAction() {
      super();
      this.iz = new i00_0();
   }

   public final void set(Wm0 var1, int var2, W00 var3, wh_0 var4) {
      var1.set(var2, this.iz.T4(var3.eo0).aM().Se0());
   }
}
