package cn.pokemmo.ui.dialog.manager;

import f.*;

import java.util.HashMap;

/**
 * 全局对话与交互气泡管理器 (Message Box Manager)
 * 负责客户端所有 NPC 交互气泡、脚本菜单、队伍选择、招式学习等弹窗的队列调度、
 * 屏幕空间/世界坐标 HUD 锚点对齐计算、层级叠加与生命周期管理。
 *
 * 原混淆类: f.pk0_0
 */
public class MessageBoxManager extends C0 {
    public pk0_0 asBridge() {
        return (pk0_0) (Object) this;
    }

    public static final String[] e2;
    public static final CH0 AA0;
    public static final C8 gf0;
    public final Qy0 u4;
    public final es_1 lpT1;
    public final HashMap<CH0, iw_1> iE;
    public final SQ cOM9;
    public long KH;
    public Fo0 sl;

    public MessageBoxManager(Qy0 qy0) {
        super();
        this.lpT1 = new es_1();
        this.iE = new HashMap<>();
        this.cOM9 = new SQ();
        this.KH = 0L;
        this.u4 = qy0;
        this.uf("nameplategui");
        tw0_0.FL = asBridge();
    }

    static {
        e2 = new String[0];
        AA0 = CH0.Ab(-32767L);
        gf0 = new C8();
    }

    public static void K60(iw_1 v0, int i1, int i2) {
        if (!v0.hy0()) {
            return;
        }
        Q7 v3 = (Q7) v0;
        ph_0 v4 = v3.GF;
        int i5 = v4.Mx;
        int i6 = i1 - (i5 / 2);
        int i4 = i2 - 10 - v4.OB;
        if (i4 < 0) {
            i4 = 0;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        if (i6 + i5 > tw0_0.LD0.ew0()) {
            tw0_0.LD0.ew0();
            int dummy1 = v3.GF.Mx;
        }
        if (i4 + v3.GF.OB > tw0_0.LD0.Hv0()) {
            tw0_0.LD0.Hv0();
            int dummy2 = v3.GF.OB;
        }
        v0.Jh(i1, i2);
    }

    public void Ad(String v1) {
        this.iQ(new kt_0(v1, jm_1.hK, hg_2.BD, null));
    }

    public void iQ(kt_0 v1) {
        switch (f_0.Cu0[v1.cg0.an]) {
            case 1:
            case 2:
            case 3:
                iw_1 top = this.Py0();
                if (top != null && !top.L10) {
                    top.Vy(v1);
                } else {
                    tw0_0.rl.ze0(v1.jg0, (byte) 0);
                }
                return;
            case 4:
            case 5:
                iw_1 top2 = this.Py0();
                if (top2 != null) {
                    top2.wQ();
                }
                break;
            default:
                break;
        }

        CH0 v3 = v1.nf0;
        if (hg_2.bx.equals(v3)) {
            v3 = hg_2.bx;
        } else if (tw0_0.e60 != null) {
            bi0_1 v4 = tw0_0.e60.ax(v3);
            E90 v5 = tw0_0.e60.jB0;
            if (v5 != null && (!hg_2.BD.equals(v3) || v4 == null)) {
                v3 = v5.pu;
            }
        }

        iw_1 v4;
        switch (f_0.Cu0[v1.cg0.an]) {
            case 6:
                v4 = new y20_0(v1.jg0, v1.cg0, tw0_0.rl.r1(_volatile.BV), new short[]{0, 1, 2, 3, 4, 5});
                break;
            case 7:
                v4 = new y20_0(v1.jg0, v1.cg0, tw0_0.rl.r1(_volatile.JR), v1.FA);
                break;
            case 8:
                v4 = new y20_0(v1.jg0, v1.cg0, tw0_0.rl.r1(_volatile.CG0), v1.FA);
                break;
            case 9: {
                VU v2 = tw0_0.rl.r1(_volatile.BV).sF(v1.bf);
                if (v2 == null) {
                    tw0_0.rl.ze0(v1.jg0, (byte) -1);
                    return;
                }
                v4 = new jl_0(v1.jg0, v2);
                break;
            }
            case 10: {
                VU v2 = tw0_0.rl.r1(_volatile.BV).sF(v1.bf);
                if (v2 == null) {
                    tw0_0.rl.ze0(v1.jg0, (byte) -1);
                    return;
                }
                v4 = new dg_2(v1.jg0, v1.FA[0], v2);
                break;
            }
            case 11:
                v4 = new OU(v1.jg0, v1.hH());
                break;
            default: {
                String[] v2 = e2;
                if (v1.CoM5 != null) {
                    v2 = new String[v1.CoM5.length];
                    for (int i5 = 0; i5 < v1.CoM5.length; i5++) {
                        v2[i5] = v1.CoM5[i5].vj0();
                    }
                }
                v4 = new Q7(v1.jg0, v3, v1.cg0, v1.hH(), v1.FA, v1.yK0, v1.LPT2, v1.nE0, v1.iy, v1.Bf, v2);
                break;
            }
        }

        v4.G3 = v1.Lpt8;
        this.lpT1.Ue0(v4);
        if (!hg_2.BD.equals(v3) && v4.hy0()) {
            this.F9(this.fU(), v4);
            this.iE.put(v3, v4);
            ((iw_1) this.iE.get(v3)).E40(Integer.MIN_VALUE, Integer.MIN_VALUE);
            ((iw_1) this.iE.get(v3)).lt0();
            this.u4.Qw0(this);
            this.Qw0(v4);
        } else {
            this.u4.F9(this.u4.fU(), v4);
            this.u4.Qw0(v4);
        }
    }

    public boolean gi0() {
        return this.lpT1.KB != 0 || this.u4.yr0 != null;
    }

    public iw_1 Py0() {
        if (this.lpT1.KB == 0) {
            return null;
        }
        return (iw_1) this.lpT1.KI();
    }

    public void YK(CH0 v1, C8 v2) {
        iw_1 widget = (iw_1) this.iE.get(v1);
        if (widget == null) {
            return;
        }
        jy_1 aj = tw0_0.LD0.aj;
        C8 gf = gf0;
        gf.getClass();
        gf.x = v2.x;
        gf.y = v2.y;
        gf.z = v2.z;
        aj.v3.Lpt4(gf, (float) aj.df, (float) aj.gS, (float) aj.Ty, (float) aj.Ja);
        int x = (int) gf.x;
        int y = (int) aj.eY - (int) gf.y;
        int targetX = (int) ((float) x + 36.0f);
        int targetY = (int) ((float) y + 24.0f);
        if (widget.hy0()) {
            widget.Jh(targetX, targetY);
        } else {
            widget.Jh(tw0_0.LD0.Hv0() / 2 - widget.Mx / 2, tw0_0.LD0.Hv0() / 2 - widget.OB / 2);
        }
    }

    public void wF(short i1, byte i2, boolean i3) {
        lg_0.k.lPT5(() -> this.fM0(i1, i2, i3));
    }

    public void fM0(short i1, byte i2, boolean i3) {
        if (this.sl != null) {
            this.u3(this.sl);
            this.sl = null;
        }
        if (i1 > 0) {
            this.sl = new Fo0(i1, i2, i3);
            this.F9(this.fU(), this.sl);
        }
    }
}
