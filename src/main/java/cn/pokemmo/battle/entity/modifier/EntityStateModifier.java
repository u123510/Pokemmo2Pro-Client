package cn.pokemmo.battle.entity.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.EA0;
import f.rg0_1;


public class EntityStateModifier
extends BaseBattleModifier {
    public final byte eO;

    public EntityStateModifier(byte by) {
        this.eO = by;
    }

    @Override
    public final void Gj0(EA0 eA0) {
        eA0.qc0(this.eO);
    }
}
