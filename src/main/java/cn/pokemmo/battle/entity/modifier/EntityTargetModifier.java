package cn.pokemmo.battle.entity.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class EntityTargetModifier extends BaseBattleModifier {
    public final nk_0 jc0;
    public final boolean qk0;

    public EntityTargetModifier(nk_0 nk_0) {
        super();
        this.jc0 = nk_0;
        this.qk0 = true;
    }

    public EntityTargetModifier(nk_0 nk_0, int i) {
        super();
        this.jc0 = nk_0;
        this.qk0 = false;
    }

    @Override
    public final void Gj0(EA0 ea0) {
        ea0.fY(this.jc0, this.qk0);
    }
}
