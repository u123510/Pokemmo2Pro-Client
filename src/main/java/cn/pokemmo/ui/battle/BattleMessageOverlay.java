package cn.pokemmo.ui.battle;

import f.*;

/**
 * 对战消息浮层与解说播报抽象基类 (Battle Message Overlay)
 * 在对战主画面底部承载文字轮播 (ZJ)、富文本格式化并向聊天频道同步播报。
 *
 * 原混淆类: f.I30
 */
public abstract class BattleMessageOverlay extends le0_2 {
    public I30 asBridge() {
        return (I30) (Object) this;
    }

    public final ZJ El0;
    public final fy_2 ZW;

    public BattleMessageOverlay() {
        super();
        this.uf("battlegui");
        this.El0 = new ZJ();
        this.El0.uf("battle-text");
        this.ZW = new fy_2();
        this.ZW.uf("/battle-panel");
        this.SL(this.ZW);
        this.SL(this.El0);
    }

    @Override
    public boolean nd0(i70_0 value) {
        return super.nd0(value);
    }

    @Override
    public final void a80(Jn0 value) {
        this.ZW.oY(tw0_0.LD0.ew0(), 240);
    }

    public abstract void K8();

    public final void is0(String value) {
        this.El0.dr.add(new dc0_1(value));
        if (!value.isEmpty() && tw0_0.rl != null) {
            tw0_0.rl.jC(value, zo_0.n4);
        }
    }
}
