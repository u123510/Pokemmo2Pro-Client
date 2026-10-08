package cn.pokemmo.constant.enums;

import f.*;

public enum RenderPass {
   mv("x86"),
   I30("ARM"),
   VU("RISCV"),
   a4("LOONGARCH");

   public static final RenderPass[] on = values();

   RenderPass(String ignored) {
   }

    public f.cj_1 toLegacy() {
        return f.cj_1.valueOf(name());
    }
}