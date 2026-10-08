package cn.pokemmo.battle;

import f.*;


/**
 * 现代化重构类 - 原始混淆类: f.AI
 */
public class Modern_Battle_Ai  {

   public final TE sz0;

   public Modern_Battle_Ai() {
      this(new TE());
   }

   public Modern_Battle_Ai(TE var1) {
      this.sz0 = var1;
   }

   static {
      Cq0.E1(AI.class);
   }

   public final boolean kp(short var1) {
      synchronized(this.sz0) {
         return this.sz0.f5(var1) != 0;
      }
   }

   public final boolean qq(short[] var1) {
      if (var1.length == 0) {
         return false;
      } else {
         synchronized(this.sz0) {
            for(int var2 = 0; var2 < var1.length; ++var2) {
               if (this.sz0.f5(var1[var2]) == 0) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public final short jA0(short var1) {
      synchronized(this.sz0) {
         return this.sz0.f5(var1);
      }
   }

   public final boolean lpt5(short var1, short var2) {
      synchronized(this.sz0) {
         if (var2 == 0) {
            return this.wK(var1);
         } else {
            return this.sz0.Dc0(var1, var2) != var2;
         }
      }
   }

   public final boolean wK(short var1) {
      synchronized(this.sz0) {
         return this.sz0.Eh0(var1) != 0;
      }
   }
}

