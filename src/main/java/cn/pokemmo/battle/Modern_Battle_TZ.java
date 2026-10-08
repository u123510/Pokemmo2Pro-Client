package cn.pokemmo.battle;

import f.*;
import java.util.NoSuchElementException;

/**
 * 现代化重构类 - 原始混淆类: f.TZ
 */
public class Modern_Battle_TZ extends a60_0 {

   public final es_1 bR;

   public Modern_Battle_TZ(EI var1) {
      super(var1);
      this.bR = var1.Ub;
   }

   public final void NF0() {
      super.QX = -1;
      super.PL0 = 0;
      boolean flag;
      if (super.Xw0.Va0 > 0) {
         flag = true;
      } else {
         flag = false;
      }

      super.Fs = flag;
   }

   public final xn_1 K3() {
      if (super.Fs) {
         if (super.X10) {
            int i = super.PL0;
            super.QX = super.PL0;
            super.mi0.I20 = this.bR.get(i);
            super.mi0.kM = super.Xw0.Wk0(super.mi0.I20);
            int j = i = super.PL0 + 1;
            super.PL0 = i;
            boolean flag;
            if (j < super.Xw0.Va0) {
               flag = true;
            } else {
               flag = false;
            }

            super.Fs = flag;
            return super.mi0;
         } else {
            throw new nf_1("#iterator() cannot be used nested.");
         }
      } else {
         throw new NoSuchElementException();
      }
   }

   @Override
   public final xn_1 next() {
      return this.K3();
   }

   public final void remove() {
      if (super.QX >= 0) {
         super.Xw0.ns0(super.mi0.I20);
         super.PL0--;
         super.QX = -1;
      } else {
         throw new IllegalStateException("next must be called before remove.");
      }
   }
}

