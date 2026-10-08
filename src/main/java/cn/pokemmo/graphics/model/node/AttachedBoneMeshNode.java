package cn.pokemmo.graphics.model.node;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.graphics.model.node.BaseSceneNodeModel;

public class AttachedBoneMeshNode extends BaseSceneNodeModel {
    public byte ad0;
    public final short[][] Xx0;
    public float iK0;
    public final C8 qq0;
    public final C8 lO;
    public bi0_1 ir;
    public final sh_1 yf0;

    public AttachedBoneMeshNode(sh_1 owner, Ou0 parent, byte index, short[][] positions) {
        super(parent);
        this.yf0 = owner;
        this.ad0 = index;
        this.Xx0 = positions;
        this.qq0 = new C8();
        this.lO = new C8();
        short[] position = positions[index];
        this.ho.m80(position[0] * 0.25f + 0.125f, position[2] * 2.5f, position[1] * 0.25f + 0.125f);
    }

    public final void Xm0() {
        this.ho.V1(this.qq0);
        this.lO.np(this.qq0);
    }

    public final boolean COm8(Tv0 value) {
        return this.ho.EW[13] <= this.iK0 && super.COm8(value);
    }

    public final void bo0(float time) {
        this.iK0 = time;
        bi0_1 state = this.ir;
        if (state == null || hk0_1.KG - state.il0.gd < 500L) {
            return;
        }
        this.ho.V1(this.qq0);
        float step = lg_0.S4.uL * 2.5f;
        if (!LW.LH0(this.qq0.y, this.lO.y)) {
            float next = advance(this.qq0.y, this.lO.y, step);
            boolean reached = (this.qq0.y < this.lO.y && next >= this.lO.y) || (this.qq0.y > this.lO.y && next <= this.lO.y);
            this.qq0.y = reached ? this.lO.y : next;
            if (reached) this.wJ0();
        }
        if (!LW.LH0(this.qq0.x, this.lO.x)) {
            float next = advance(this.qq0.x, this.lO.x, step);
            boolean reached = (this.qq0.x < this.lO.x && next >= this.lO.x) || (this.qq0.x > this.lO.x && next <= this.lO.x);
            this.qq0.x = reached ? this.lO.x : next;
            if (reached) this.wJ0();
        }
        if (!LW.LH0(this.qq0.z, this.lO.z)) {
            float next = advance(this.qq0.z, this.lO.z, step);
            boolean reached = (this.qq0.z < this.lO.z && next >= this.lO.z) || (this.qq0.z > this.lO.z && next <= this.lO.z);
            this.qq0.z = reached ? this.lO.z : next;
            if (reached) this.wJ0();
        }
        this.ho.Y1(this.qq0);
        this.rF0();
    }

    private static float advance(float current, float target, float step) {
        return current < target ? current + step : current - step;
    }

    public final void wJ0() {
        bi0_1 state = this.ir;
        if (state == null) {
            return;
        }
        short[] position = this.Xx0[this.ad0];
        state.ba0.PX(false, position[0], position[1], (byte) position[2], state.ba0.Y30);
        state.il0.f60(null, false, C8.Zero);
        this.ir = null;
    }
}
