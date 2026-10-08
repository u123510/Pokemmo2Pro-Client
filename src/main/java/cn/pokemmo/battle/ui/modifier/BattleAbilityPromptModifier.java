/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.ui.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.ML0;
import f.TC0;

/*
 * Renamed from f.Vd
 */
public class BattleAbilityPromptModifier
extends TC0 {
    public final String d70;

    public BattleAbilityPromptModifier(String string) {
        this.d70 = string;
    }

    @Override
    public final void QC(ML0 mL0) {
        mL0.wJ(this.d70, "", null);
    }
}

