package cn.pokemmo.ui.animation;

import f.*;
import java.util.ArrayList;

/**
 * 动画时间轴节点模型 (Animation Timeline Node)
 * 基于 Universal Tween Engine 时间轴架构，用于编排串行 (Sequence) 与并行 (Parallel) 的补间动画、延时与生命周期控制。
 * 驱动 PokeMMO 客户端所有的 UI 视窗过渡、淡入淡出、平移缩放与战斗动作动画。
 *
 * 对应混淆类: f.pw_1
 */
public abstract class AnimationTimeline extends D2 {
    public static final r3_0 FD;
    public static final boolean vi;
    public final ArrayList pk0;
    public pw_1 pX;
    public pw_1 TG0;
    public int cQ;
    public boolean wG0;

    static {
        vi = !pw_1.class.desiredAssertionStatus();
        FD = new r3_0(new df0_1());
    }

    public static pw_1 xC() {
        pw_1 pw = (pw_1) FD.u9();
        pw.cQ = 1;
        pw.pX = pw;
        return pw;
    }

    public static pw_1 gb0() {
        pw_1 pw = (pw_1) FD.u9();
        pw.cQ = 2;
        pw.pX = pw;
        return pw;
    }

    public AnimationTimeline() {
        super();
        this.pk0 = new ArrayList(10);
        Jh();
    }

    public final void Jh() {
        this.NJ = -2;
        this.m70 = 0;
        this.Ug0 = false;
        this.vP = 0.0f;
        this.Gg = 0.0f;
        this.o80 = 0.0f;
        this.sS = 0.0f;
        this.Sq0 = 0.0f;
        this.w6 = false;
        this.Hn = false;
        this.vj0 = false;
        this.fb0 = false;
        this.xF0 = null;
        this.cOM8 = 8;
        this.G = true;
        this.ix = true;
        this.pk0.clear();
        this.TG0 = null;
        this.pX = null;
        this.wG0 = false;
    }

    public final pw_1 y80(ao_1 v1) {
        if (this.wG0) {
            throw new RuntimeException("You can't push anything to a timeline once it is started");
        }
        this.pX.pk0.add(v1);
        return (pw_1) (Object) this;
    }

    public final pw_1 xi0(pw_1 v1) {
        if (this.wG0) {
            throw new RuntimeException("You can't push anything to a timeline once it is started");
        }
        if (v1.pX != v1) {
            throw new RuntimeException("You forgot to call a few 'end()' statements in your pushed timeline");
        }
        v1.TG0 = this.pX;
        this.pX.pk0.add(v1);
        return (pw_1) (Object) this;
    }

    public final pw_1 p1(float f1) {
        if (this.wG0) {
            throw new RuntimeException("You can't push anything to a timeline once it is started");
        }
        ao_1 ao = (ao_1) ao_1.Sk0.u9();
        ao.r70(null, -1, 0.0f);
        ao.Sq0 += f1;
        this.pX.pk0.add(ao);
        return (pw_1) (Object) this;
    }

    public final pw_1 TD0() {
        if (this.wG0) {
            throw new RuntimeException("You can't push anything to a timeline once it is started");
        }
        pw_1 pw = (pw_1) FD.u9();
        pw.TG0 = this.pX;
        pw.cQ = 1;
        this.pX.pk0.add(pw);
        this.pX = pw;
        return (pw_1) (Object) this;
    }

    public final pw_1 Xf0() {
        if (this.wG0) {
            throw new RuntimeException("You can't push anything to a timeline once it is started");
        }
        pw_1 pw = (pw_1) FD.u9();
        pw.TG0 = this.pX;
        pw.cQ = 2;
        this.pX.pk0.add(pw);
        this.pX = pw;
        return (pw_1) (Object) this;
    }

    public final pw_1 mz0() {
        if (this.wG0) {
            throw new RuntimeException("You can't push anything to a timeline once it is started");
        }
        pw_1 px = this.pX;
        if (px == this) {
            throw new RuntimeException("Nothing to end...");
        }
        this.pX = px.TG0;
        return (pw_1) (Object) this;
    }

    @Override
    public final void bC0() {
        for (int i = this.pk0.size() - 1; i >= 0; i--) {
            ((D2) this.pk0.remove(i)).bC0();
        }
        r3_0 r3 = FD;
        if (!r3.HF.contains(this)) {
            if (r3.LPT8 != null) {
                r3.LPT8.eC(this);
            }
            r3.HF.add(this);
        }
    }

    @Override
    public final void nA(boolean i1, int i2, int i3, float f4) {
        if (!i1 && i2 > i3) {
            if (!vi && f4 < 0.0f) {
                throw new AssertionError();
            }
            float delta = f4 + 1.0f;
            int size = this.pk0.size();
            for (int i = 0; i < size; i++) {
                ((D2) this.pk0.get(i)).mh(delta);
            }
            return;
        }
        if (!i1 && i2 < i3) {
            if (!vi && f4 > 0.0f) {
                throw new AssertionError();
            }
            float delta = f4 + 1.0f;
            for (int i = this.pk0.size() - 1; i >= 0; i--) {
                ((D2) this.pk0.get(i)).mh(delta);
            }
            return;
        }
        if (!vi && !i1) {
            throw new AssertionError();
        }
        if (i2 > i3) {
            YW();
            int size = this.pk0.size();
            for (int i = 0; i < size; i++) {
                ((D2) this.pk0.get(i)).mh(f4);
            }
        } else if (i2 < i3) {
            kQ();
            for (int i = this.pk0.size() - 1; i >= 0; i--) {
                ((D2) this.pk0.get(i)).mh(f4);
            }
        } else if (f4 >= 0.0f) {
            int size = this.pk0.size();
            for (int i = 0; i < size; i++) {
                ((D2) this.pk0.get(i)).mh(f4);
            }
        } else {
            for (int i = this.pk0.size() - 1; i >= 0; i--) {
                ((D2) this.pk0.get(i)).mh(f4);
            }
        }
    }

    @Override
    public final void YW() {
        for (int i = this.pk0.size() - 1; i >= 0; i--) {
            D2 d2 = (D2) this.pk0.get(i);
            d2.Gg = -d2.Sq0;
            d2.NJ = -1;
            d2.Ug0 = false;
            d2.YW();
        }
    }

    @Override
    public final void kQ() {
        int size = this.pk0.size();
        for (int i = 0; i < size; i++) {
            ((D2) this.pk0.get(i)).Ge(this.sS);
        }
    }

    @Override
    public final void t() {
        super.t();
        int size = this.pk0.size();
        for (int i = 0; i < size; i++) {
            ((D2) this.pk0.get(i)).t();
        }
    }

    @Override
    public final Object C20() {
        if (!this.wG0) {
            this.sS = 0.0f;
            int size = this.pk0.size();
            for (int i = 0; i < size; i++) {
                D2 d2 = (D2) this.pk0.get(i);
                if (d2.m70 < 0) {
                    throw new RuntimeException("You can't push an object with infinite repetitions in a timeline");
                }
                d2.C20();
                int mode = J90.Qj(this.cQ);
                if (mode == 0) {
                    float sS_old = this.sS;
                    this.sS = d2.oX() + sS_old;
                    d2.Sq0 += sS_old;
                } else if (mode == 1) {
                    this.sS = Math.max(this.sS, d2.oX());
                }
            }
            this.wG0 = true;
        }
        return this;
    }

    // ==========================================
    // 现代可读 API 封装 (Modern APIs)
    // ==========================================

    public static pw_1 createSequence() {
        return xC();
    }

    public static pw_1 createParallel() {
        return gb0();
    }

    public final pw_1 push(ao_1 tween) {
        return this.y80(tween);
    }

    public final pw_1 push(pw_1 childTimeline) {
        return this.xi0(childTimeline);
    }

    public final pw_1 pushPause(float duration) {
        return this.p1(duration);
    }

    public final pw_1 beginSequence() {
        return this.TD0();
    }

    public final pw_1 beginParallel() {
        return this.Xf0();
    }

    public final pw_1 end() {
        return this.mz0();
    }

    public final pw_1 build() {
        return (pw_1) this.C20();
    }

    public final void free() {
        this.bC0();
    }

    public final boolean isBuilt() {
        return this.wG0;
    }

    public final int getChildrenCount() {
        return this.pk0.size();
    }

    public final ArrayList getChildren() {
        return this.pk0;
    }

    public final pw_1 asBridge() {
        return ((Object) this) instanceof pw_1 ? (pw_1) (Object) this : null;
    }
}
