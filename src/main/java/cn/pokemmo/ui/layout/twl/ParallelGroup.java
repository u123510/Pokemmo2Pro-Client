package cn.pokemmo.ui.layout.twl;

import f.*;
import java.util.ArrayList;

import java.util.ArrayList;

public class ParallelGroup extends ya_1 {
   public final DialogLayout vq0;

   public ParallelGroup(DialogLayout owner) {
      super(owner);
      this.vq0 = owner;
   }

   @Override
   public final int zR(int value) {
      int result = 0;
      ArrayList children = this.U0;
      int size = children.size();
      for (int index = 0; index < size; index++) {
         is0_0 child = (is0_0)children.get(index);
         if (this.vq0.gI || child.D4()) {
            result = Math.max(result, child.zR(value));
         }
      }
      return result;
   }

   @Override
   public final int Kn(int value) {
      int result = 0;
      ArrayList children = this.U0;
      int size = children.size();
      for (int index = 0; index < size; index++) {
         is0_0 child = (is0_0)children.get(index);
         if (this.vq0.gI || child.D4()) {
            result = Math.max(result, child.Kn(value));
         }
      }
      return result;
   }

   @Override
   public final int e4(int value) {
      int result = 0;
      ArrayList children = this.U0;
      int size = children.size();
      for (int index = 0; index < size; index++) {
         is0_0 child = (is0_0)children.get(index);
         if (this.vq0.gI || child.D4()) {
            result = Math.max(result, child.e4(value));
         }
      }
      return result;
   }

   @Override
   public final void od(int x, int y, int value) {
      ArrayList children = this.U0;
      int size = children.size();
      for (int index = 0; index < size; index++) {
         is0_0 child = (is0_0)children.get(index);
         if (this.vq0.gI || child.D4()) {
            child.od(x, y, value);
         }
      }
   }

   @Override
   public final ya_1 Ze0() {
      java.util.logging.Logger.getLogger(fy_2.class.getName()).log(
            java.util.logging.Level.WARNING,
            "Useless call to addGap() on ParallelGroup",
            new Throwable());
      return this;
   }
}
