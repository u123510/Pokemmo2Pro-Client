package f;

import cn.pokemmo.constant.enums.RenderPass;

public enum cj_1 {
   mv("x86"),
   I30("ARM"),
   VU("RISCV"),
   a4("LOONGARCH");

   public static final cj_1[] on = values();

   cj_1(String ignored) {
   }

    public RenderPass asModern() {
        return RenderPass.valueOf(name());
    }
}