package cn.pokemmo.battle.calc;

import f.*;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.battle.calc.BaseDamageCalculator;

import java.nio.ByteBuffer;

public class TypeMatchupModifier extends BaseDamageCalculator {
   public byte xe;
   public String dN;

   public TypeMatchupModifier(Ry var1, ByteBuffer var2) {
      super(var2, var1, 8);
   }

   public final void Oj0() {
      this.xe = this.Rj.get();
      this.dN = this.q60();
   }

   public final void os0() {
      uc_2 var1 = ((Ry)this.uk).Al0;
      if (var1.RO == MC0.VC0) {
         var1.gp0 = this.xe;
         var1.DV = this.dN;
         var1.RO = MC0.EV;
      }
   }
}
