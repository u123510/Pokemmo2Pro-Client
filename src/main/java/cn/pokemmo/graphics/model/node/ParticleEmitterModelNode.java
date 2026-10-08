/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.model.node;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.graphics.model.node.BaseSceneNodeModel;

import f.Ou0;
import f.Tv0;

public class ParticleEmitterModelNode extends BaseSceneNodeModel {
    public float ex0;

    public ParticleEmitterModelNode(Ou0 ou0) {
        super(ou0);
        this.eB(false);
    }

    @Override
    public final void bo0(float f) {
        this.ex0 = f;
    }

    @Override
    public final boolean COm8(Tv0 tv0) {
        if (this.ho.EW[13] > this.ex0) {
            return false;
        }
        return super.COm8(tv0);
    }
}
