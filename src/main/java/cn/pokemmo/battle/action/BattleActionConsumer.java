package cn.pokemmo.battle.action;

import f.EA0;

public abstract class BattleActionConsumer {
    public void consumeAction(cn.pokemmo.graphics.gdx.particle.GdxParticleEmitterNode action) {
        Gj0((EA0) action);
    }

    public abstract void Gj0(EA0 var1);
}
