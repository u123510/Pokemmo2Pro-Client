package cn.pokemmo.battle.entity.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.EA0;
import f.rg0_1;


public class EntityRunnableModifier
extends BaseBattleModifier {
    public final  Runnable ur0;

    public EntityRunnableModifier(Runnable runnable) {
        this.ur0 = runnable;
    }

    @Override
    public final void Gj0(EA0 eA0) {
        this.ur0.run();
    }
}
