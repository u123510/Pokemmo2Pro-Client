package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class SwitchTriggerTileBehavior extends BaseTileBehavior {
    public SwitchTriggerTileBehavior() {
        super();
    }

    public final boolean switch$() {
        if (tw0_0.rl != null && tw0_0.rl.lZ.zK0 != null) {
            tw0_0.rl.lZ.zK0.qD0(true);
        }
        return true;
    }
}
