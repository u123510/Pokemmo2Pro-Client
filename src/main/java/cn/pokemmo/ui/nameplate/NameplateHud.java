package cn.pokemmo.ui.nameplate;

import f.*;
import cn.pokemmo.world.entity.PlayerAvatarMovementController;
import java.util.Collection;
import java.util.HashMap;

/**
 * 玩家与 NPC 角色头顶名牌与状态 HUD (Nameplate HUD)
 * 渲染角色名称、公会标识、好友/队伍高亮、GM 管理员标志与发言气泡对齐锚点。
 *
 * 原混淆类: f.tj0_0
 */
public class NameplateHud extends le0_2 {
    public tj0_0 asBridge() {
        return (tj0_0) (Object) this;
    }

    public static final C8 bI0 = new C8();
    public final HashMap B1;
    public final HashMap k00;
    public final N1 coM3;
    public int qd0;

    public NameplateHud() {
        this.B1 = new HashMap();
        this.k00 = new HashMap();
        this.coM3 = new N1(this, new gn_0((byte) -1, (byte) -1, (byte) -1, (byte) -1));
        this.qd0 = 255;
        this.uf("nameplategui");
        this.LPT8(this.coM3);
        tw0_0.Tl0 = asBridge();
    }

    public static void MA0(g70_0 v0) {
        if (v0.r10 > 0) {
            String theme = "nameplate-staff";
            if (!v0.gW.equals(theme)) {
                v0.uf(theme);
                v0.yI();
            }
        } else {
            fa0_0 friendManager = tw0_0.rl.q50;
            if (friendManager.lx.containsKey(v0.OB0)) {
                String theme = "nameplate-friend";
                if (!v0.gW.equals(theme)) {
                    v0.uf(theme);
                    v0.yI();
                }
            } else {
                pk_0 teamManager = tw0_0.rl.xI0;
                if (teamManager != null && teamManager.MH0(v0.OB0)) {
                    if (!v0.OB0.equals(tw0_0.e60.dj0)) {
                        String theme = "nameplate-team";
                        if (!v0.gW.equals(theme)) {
                            v0.uf(theme);
                            v0.yI();
                        }
                    }
                } else {
                    String theme = "nameplate";
                    if (!v0.gW.equals(theme)) {
                        v0.uf(theme);
                        v0.yI();
                    }
                }
            }
        }
    }

    public final void Ov(bi0_1 v1, C8 v2) {
        jy_1 aj = tw0_0.LD0.aj;
        C8 bI0 = tj0_0.bI0;
        bI0.x = v2.x;
        bI0.y = v2.y;
        bI0.z = v2.z;
        if (tt0_0.C7()) {
            aj.v3.ZX(bI0, aj.df, aj.gS, aj.Ty, aj.Ja);
        } else {
            aj.v3.Lpt4(bI0, aj.df, aj.gS, aj.Ty, aj.Ja);
        }
        int screenX = (int) bI0.x;
        int screenY = (int) aj.eY - (int) bI0.y;
        if (tt0_0.C7()) {
            screenY = (int) bI0.y;
        }
        CH0 pu = v1.pu;
        int rank = 0;
        if (v1 instanceof E90) {
            rank = ((E90) v1).fH0;
        }
        g70_0 nameplate = (g70_0) this.B1.get(pu);
        if (nameplate == null) {
            nameplate = new g70_0(v1);
            this.B1.put(pu, nameplate);
            this.F9(this.fU(), nameplate);
            MA0(nameplate);
        }
        nameplate.Sk(v1.jh());
        nameplate.D70(v1.wq0);
        if (nameplate.r10 != rank) {
            if (nameplate.Ur == null) {
                le0_2 rankWidget = new le0_2((KG0) null, false);
                nameplate.Ur = rankWidget;
                nameplate.F9(nameplate.fU(), rankWidget);
            }
            if (nameplate.Ur.Mx < 10) {
                nameplate.Ur.lt0();
            }
            nameplate.r10 = rank;
            if (rank > 0) {
                String rankTheme = HS.k70(rank, nameplate.OB0);
                if (!nameplate.Ur.gW.equals(rankTheme)) {
                    nameplate.Ur.uf(rankTheme);
                    nameplate.Ur.yI();
                }
            }
            nameplate.Ur.lt0();
        }
        boolean visible;
        if (!(nameplate.Mq instanceof E90)) {
            visible = true;
        } else if (nameplate.Mq.Ou()) {
            visible = dw_2.jo;
        } else if (yt_1.l00.uI0() && !nameplate.OB0.equals(yt_1.l00)) {
            visible = false;
        } else {
            visible = dw_2.fx;
        }
        nameplate.Ll(visible);
        nameplate.E40(screenX - (nameplate.hr0() / 2) - 1, screenY);
        if (rank > 0 && this.Em0 != null && nameplate.K20 != null) {
            int idx = this.Dp(nameplate);
            int last = this.fU() - 1;
            if (idx < last) {
                this.ND0(idx, last);
            }
        }
        al0_0 bubble = (al0_0) this.k00.get(pu);
        if (bubble != null) {
            if (rank > 0 && this.Em0 != null && bubble.K20 != null) {
                int idx = this.Dp(bubble);
                int last = this.fU() - 1;
                if (idx < last) {
                    this.ND0(idx, last);
                }
            }
            int bubbleX = screenX - (((le0_2) bubble).Mx / 2);
            int bubbleY = screenY - ((le0_2) bubble).OB;
            if (!dw_2.jo && pu.equals(tw0_0.e60.jB0.pu)) {
                bubbleY += 16;
            }
            bubble.E40(bubbleX, bubbleY);
            bubble.Ll(true);
        }
    }

    public final void L60(bi0_1 v1, C8 v2) {
        jy_1 aj = tw0_0.LD0.aj;
        C8 bI0 = tj0_0.bI0;
        bI0.x = v2.x;
        bI0.y = v2.y;
        bI0.z = v2.z;
        jy_1 cam = tw0_0.LD0.aj;
        cam.v3.Lpt4(bI0, cam.df, cam.gS, cam.Ty, cam.Ja);
        int screenX = (int) bI0.x;
        int screenY = (int) cam.eY - (int) bI0.y - 48;
        CH0 pu = v1.pu;
        g70_0 nameplate = (g70_0) this.B1.get(pu);
        if (nameplate == null) {
            nameplate = new g70_0(v1);
            this.B1.put(pu, nameplate);
            this.F9(this.fU(), nameplate);
        }
        nameplate.E40(screenX, screenY);
        nameplate.D70(v1.wq0);
    }

    public final void nE0() {
        lg_0.k.lPT5(this::n20);
    }

    public final void qd0(int i1, CH0 v2, short i3) {
        g70_0 nameplate = (g70_0) this.B1.get(v2);
        if (nameplate != null) {
            if (nameplate.Gi0 != i1) {
                nameplate.Gi0 = i1;
                if (nameplate.Ng0 == null) {
                    le0_2 widget = new le0_2((KG0) null, false);
                    nameplate.Ng0 = widget;
                    nameplate.F9(nameplate.fU(), widget);
                }
                if (nameplate.Gi0 != -1) {
                    nameplate.Ng0.kx0("moisture-level" + i1);
                } else {
                    le0_2 widget = nameplate.Ng0;
                    if (!widget.gW.equals("widget")) {
                        widget.uf("widget");
                        widget.yI();
                    }
                }
                nameplate.Ng0.lt0();
            }
            if (nameplate.wJ0 != i3) {
                nameplate.wJ0 = i3;
                if (i3 > 0) {
                    nameplate.RL.Nk(new Wr[] { gh_1.aH0.Jg(i3, false) });
                    nameplate.RL.OA0 = true;
                    nameplate.RL.IF = 24;
                    nameplate.RL.gx0 = 24;
                } else {
                    nameplate.RL.lo0();
                }
            }
        }
    }

        public final void Ov(MO v1) {
        Ov((PlayerAvatarMovementController) v1);
    }

    public final void Ov(PlayerAvatarMovementController v1) {
        CH0 pu = v1.pu;
        g70_0 nameplate = (g70_0) this.B1.get(pu);
        if (nameplate != null) {
            cd0_2 transientVal = v1.transient$;
            if (nameplate.YB != transientVal) {
                nameplate.YB = transientVal;
                if (transientVal == null) {
                    if (nameplate.S00 != null) {
                        nameplate.S00.xe0();
                    }
                    nameplate.RL.lo0();
                } else {
                    if (nameplate.S00 == null) {
                        OT ot = new OT(48, 40, transientVal);
                        nameplate.S00 = ot;
                        if (!ot.gW.equals("misc-nameplate-nobg")) {
                            ot.uf("misc-nameplate-nobg");
                            ot.yI();
                        }
                        ot.J60.Ta = 2;
                        ot.lt0();
                        nameplate.S00.Te0(-33, -35);
                        nameplate.S00.E40(nameplate.A20 - 25, nameplate.SB0 + 45);
                        nameplate.F9(nameplate.fU(), nameplate.S00);
                    }
                }
            }
            short f8 = v1.f8;
            byte xq = v1.xq;
            if (nameplate.lw0 != f8) {
                nameplate.lw0 = f8;
                if (f8 == -1) {
                    if (nameplate.FL0 != null) {
                        nameplate.u3(nameplate.FL0);
                        nameplate.FL0.t5();
                        nameplate.FL0 = null;
                    }
                    nameplate.RL.lo0();
                } else {
                    if (nameplate.FL0 == null) {
                        S70 s70 = new S70(70, 50, 0);
                        nameplate.FL0 = s70;
                        if (!s70.gW.equals("misc-nameplate-nobg")) {
                            s70.uf("misc-nameplate-nobg");
                            s70.yI();
                        }
                        nameplate.FL0.lt0();
                        nameplate.FL0.E40(nameplate.A20 - 25, nameplate.SB0 + 45);
                        s70.og.OA0 = true;
                        s70.og.IF = 72;
                        s70.og.gx0 = 72;
                        s70.og.NE = 250;
                        s70.og.G1 = true;
                        s70.og.gY = -2;
                        s70.og.a4 = -20;
                        nameplate.F9(nameplate.fU(), s70);
                    }
                    nameplate.FL0.og.o60(yh_0.Xm0.qC0(f8, xq, false));
                }
            }
        }
    }

    public final void wM(CH0 v1, String v2) {
        if (!dw_2.Xa0) {
            return;
        }
        if (v2.contains("{") && v2.contains("}")) {
            StringBuilder sb = new StringBuilder();
            BU.T50.BK.aL0(null, v2, CH0.j1, sb, false, true, false);
            v2 = sb.toString();
        }
        if (v2.contains("%")) {
            StringBuilder sb = new StringBuilder();
            BU.T50.BK.aL0(null, v2, CH0.j1, sb, false, true, false);
            v2 = sb.toString();
        }
        if (v2.contains("[") && v2.contains("]")) {
            v2 = v2.replaceAll("\\[#(.*?)\\](.*?)\\[#(.*?)\\]", "$2");
        }
        int posX = -500;
        int posY = -500;
        g70_0 nameplate = (g70_0) this.B1.get(v1);
        if (nameplate != null) {
            posX = nameplate.A20;
            posY = nameplate.SB0;
            int defaultY = posY - 32;
            if (v1.equals(tw0_0.e60.jB0.pu)) {
                posY -= 16;
            } else {
                posY = defaultY;
            }
        }
        if (posX > 0 && posY > 0) {
            al0_0 bubble = (al0_0) this.k00.get(v1);
            if (bubble != null) {
                bubble.Lx = System.currentTimeMillis() + 5000L;
                bubble.S60.Eo("<div style=\"display: inline; word-wrap: break-word;\">" + wq_0.P60(v2) + "\n</div>");
            } else {
                bubble = new al0_0(v1, v2);
                bubble.uf("chat-bubble");
                this.F9(this.fU(), bubble);
                this.k00.put(v1, bubble);
            }
            bubble.E40(posX, posY);
            bubble.Ll(false);
            bubble.lt0();
        }
    }

    @Override
    public final void K8() {
    }

    @Override
    public final void HP(zk0_1 v1) {
        int alpha = 255 - nf_0.zo0().t8();
        if (this.qd0 != alpha) {
            this.qd0 = alpha;
            this.coM3.i10(new gn_0((byte) -1, (byte) -1, (byte) -1, (byte) this.qd0));
        }
        super.HP(v1);
    }

    public final void n20() {
        for (Object nameplate : this.B1.values()) {
            MA0((g70_0) nameplate);
        }
    }
}
