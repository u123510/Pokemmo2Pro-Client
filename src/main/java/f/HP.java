package f;

import cn.pokemmo.world.tile.behavior.DelegatingTileBehavior;

/**
 * 图块行为委托门面
 * @see cn.pokemmo.world.tile.behavior.DelegatingTileBehavior
 */
public final class HP extends DelegatingTileBehavior {
    public HP(fm_0 handler) {
        super(handler);
    }
}
