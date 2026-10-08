package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleStatChangeDisplayTask extends N60 {
   public final ML0 Uc;
   public PF AT;
   public final PF kh;
   public final gc_2 i30;
   public final byte o80;
   public MU GU;
   public final boolean tV;

   public BattleStatChangeDisplayTask(ML0 var1, PF var2, PF var3, gc_2 var4, byte var5, boolean var6) {
      this.Uc = var1;
      this.AT = var2;
      this.kh = var3;
      this.i30 = var4;
      this.o80 = var5;
      this.tV = var6;
   }

   public final boolean lPt1() {
      Oz0 var1 = tw0_0.LD0.he0;
      var1.getClass();
      return var1 instanceof Uw0 || this.AT == null && this.kh == null || this.GU != null && this.GU.bL();
   }

   public final void ii() {
      if (this.AT == null) {
         this.AT = this.kh;
      }

      Oz0 var1 = tw0_0.LD0.he0;
      var1.getClass();
      if (var1 instanceof Uw0) {
         return;
      }

      if (this.tV) {
         this.GU = new WF0(this.Uc, this.AT).vv(this.kh).sJ0(this.i30, this.o80);
      } else {
         this.GU = new lpt2__3(this.kh, 0.0F, this::ft0).us();
      }

      tw0_0.LD0.he0.aY = this.GU;
   }

   public final NU gJ0() {
      return NU.Mp;
   }

   public final void ft0() {
      if (this.i30 != null) {
         lg_0.k.lPT5(this::TF0);
      }
   }

   public final void TF0() {
      this.kh.yK0(this.i30, this.o80);
      this.Uc.Hi(this.kh).XO();
   }
}
