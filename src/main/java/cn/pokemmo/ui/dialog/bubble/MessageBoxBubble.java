package cn.pokemmo.ui.dialog.bubble;

import com.badlogic.gdx.graphics.Color;
import f.*;
import cn.pokemmo.ui.dialog.base.AbstractMessageBox;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 核心 NPC 对话与交互气泡视窗 (Message Box Bubble)
 * 支持打字机逐字显示、多页文本翻页、多类型选项组布局（单选确认、是非判断、道具兑换、
 * 宝可梦选择、技能选择、多选菜单 ChoiceMenu 等），并处理键盘/手柄事件导航与确认取消。
 *
 * 原混淆类: f.Q7
 */
public class MessageBoxBubble extends iw_1 {

    public static final Color Jr0;
    public static final short[] Rj;
    public final ph_0 GF;
    public int pa0;
    public int Zx0;
    public boolean c20;
    public final LinkedList<String> aL;
    public final xe_1[][] EI0;
    public xe_1[] kg;
    public int ce0;
    public final Nr0 SW;
    public final Hm0 uq;
    public final I7 zo;
    public final fy_2 Ee0;
    public final lo0_0 mJ0;
    public final fg0_1 OQ;
    public final fg0_1 an0;
    public byte cr;
    public final long e30;
    public final ArrayList<xe_1> zF;
    public final byte e20;
    public final byte nl0;
    public int kc0;

    public MessageBoxBubble(final byte b, final CH0 ye, final jm_1 jm_1, final String s,
                            short[] rj, short[] array, final byte e20, final byte nl0,
                            final byte cr, final long e21, final String... array2) {
        super(b, jm_1);
        final short[] array3 = rj;
        this.pa0 = -99999;
        this.Zx0 = -99999;
        this.aL = new LinkedList<>();
        this.zF = new ArrayList<>();
        this.kc0 = 0;
        super.Ye = ye;
        this.e20 = e20;
        this.nl0 = nl0;
        this.cr = cr;
        this.e30 = e21;
        if (array3 == null) {
            rj = MessageBoxBubble.Rj;
        }
        if (array == null || array.length < rj.length) {
            array = new short[rj.length];
        }
        (this.GF = new ph_0(this)).Oq0(true);
        String[] split;
        for (int length = (split = s.split("\n\n", -1)).length, i = 0; i < length; ++i) {
            String trim;
            if (!(trim = split[i]).isEmpty() || jm_1.pS()) {
                if (trim.endsWith("\n")) {
                    trim = trim.trim();
                }
                this.aL.add(trim);
            }
        }
        this.SW = new Nr0(this, (this.aL.size() > 1) ? 100 : ((jm_1 == jm_1.COM7) ? 775 : 200));
        this.SW.Oq0(true);
        if (tw0_0.kz0()) {
            this.uf("messagebox-mobile");
        } else {
            this.uf("messagebox-bubble");
        }
        this.GF.uf("npc-interaction-popup");
        if (jm_1 == jm_1.X1) {
            this.SW.uf("labelanimation-braille");
        } else {
            this.SW.uf("labelanimation");
        }
        this.EI0 = new xe_1[10][];
        this.Ee0 = new fy_2();
        this.uq = this.Ee0.lo0();
        this.zo = this.Ee0.H10();
        this.OQ = new fg0_1();
        this.OQ.uf("button-ok");
        this.OQ.RR(this::s2);
        this.uq.Kn0(this.OQ);
        this.zo.Kn0(this.OQ);
        (this.EI0[0] = new xe_1[1])[0] = this.OQ;
        final fg0_1 fg0_1 = new fg0_1(sm0_0.c0(nf0_0.uT));
        fg0_1.RR(this::m60);
        this.an0 = new fg0_1(sm0_0.c0(nf0_0.Yt));
        this.an0.RR(this::EG0);
        this.uq.LPt3(fg0_1, this.an0);
        this.zo.LPt3(fg0_1, this.an0);
        (this.mJ0 = new lo0_0()).Qs0(2);
        (this.EI0[1] = new xe_1[2])[0] = fg0_1;
        this.EI0[1][1] = this.an0;
        final fg0_1 fg0_2 = new fg0_1(sm0_0.c0(nf0_0.BA));
        fg0_2.RR(() -> this.m80((byte) 0));
        final fg0_1 fg0_3 = new fg0_1(sm0_0.c0(nf0_0.sK));
        fg0_3.RR(() -> this.m80((byte) 1));
        final fg0_1 fg0_4 = new fg0_1(sm0_0.c0(nf0_0.Dz0));
        fg0_4.RR(() -> this.m80((byte) 2));
        final fg0_1 fg0_5 = new fg0_1(sm0_0.c0(nf0_0.Y4));
        fg0_5.RR(() -> this.m80((byte) 3));
        final fg0_1 fg0_6 = new fg0_1(sm0_0.c0(nf0_0.OC));
        fg0_6.RR(() -> this.m80((byte) 4));
        final fg0_1 fg0_7 = new fg0_1(sm0_0.c0(nf0_0.Bq0));
        fg0_7.RR(() -> this.m80((byte) 5));
        this.uq.Kn0(fg0_2);
        this.zo.Kn0(fg0_2);
        this.uq.Kn0(fg0_3);
        this.zo.Kn0(fg0_3);
        this.uq.Kn0(fg0_4);
        this.zo.Kn0(fg0_4);
        this.uq.Kn0(fg0_5);
        this.zo.Kn0(fg0_5);
        this.uq.Kn0(fg0_6);
        this.zo.Kn0(fg0_6);
        this.uq.Kn0(fg0_7);
        this.zo.Kn0(fg0_7);
        (this.EI0[2] = new xe_1[6])[0] = fg0_2;
        this.EI0[2][1] = fg0_3;
        this.EI0[2][2] = fg0_4;
        this.EI0[2][3] = fg0_5;
        this.EI0[2][4] = fg0_6;
        this.EI0[2][5] = fg0_7;
        final fg0_1 fg0_8 = new fg0_1(sm0_0.c0(nf0_0.vz0));
        fg0_8.RR(() -> this.m80((byte) 0));
        final fg0_1 fg0_9 = new fg0_1(sm0_0.c0(nf0_0.Vj0));
        fg0_9.RR(() -> this.m80((byte) 1));
        final fg0_1 fg0_10 = new fg0_1(sm0_0.c0(nf0_0.i3));
        fg0_10.RR(() -> this.m80((byte) 2));
        final fg0_1 fg0_11 = new fg0_1(sm0_0.c0(nf0_0.go));
        fg0_11.RR(() -> this.m80((byte) 3));
        final fg0_1 fg0_12 = new fg0_1(sm0_0.c0(nf0_0.l1));
        fg0_12.RR(() -> this.m80((byte) 4));
        final fg0_1 fg0_13 = new fg0_1(sm0_0.c0(nf0_0.lPT6));
        fg0_13.RR(() -> this.m80((byte) 5));
        final fg0_1 fg0_14 = new fg0_1(sm0_0.c0(nf0_0.AI));
        fg0_14.RR(() -> this.m80((byte) 6));
        final fg0_1 fg0_15 = new fg0_1(sm0_0.c0(nf0_0.oc));
        fg0_15.RR(() -> this.m80((byte) 7));
        final fg0_1 fg0_16 = new fg0_1(sm0_0.c0(nf0_0.Cs0));
        fg0_16.RR(() -> this.m80((byte) 8));
        final fg0_1 fg0_17 = new fg0_1(sm0_0.c0(nf0_0.Ko0));
        fg0_17.RR(() -> this.m80((byte) 9));
        final fg0_1 fg0_18 = new fg0_1(sm0_0.c0(nf0_0.bu));
        fg0_18.RR(() -> this.m80((byte) 10));
        final fg0_1 fg0_19 = new fg0_1(sm0_0.c0(nf0_0.wj));
        fg0_19.RR(() -> this.m80((byte) 11));
        final fg0_1 fg0_20 = new fg0_1(sm0_0.c0(nf0_0.Ws));
        fg0_20.RR(() -> this.m80((byte) 12));
        final fg0_1 fg0_21 = new fg0_1(sm0_0.c0(nf0_0.SL));
        fg0_21.RR(() -> this.m80((byte) 13));
        final fg0_1 fg0_22 = new fg0_1(sm0_0.c0(nf0_0.gw));
        fg0_22.RR(() -> this.m80((byte) 14));
        final fg0_1 fg0_23 = new fg0_1(sm0_0.c0(nf0_0.sS));
        fg0_23.RR(() -> this.m80((byte) 15));
        final fg0_1 fg0_24 = new fg0_1(sm0_0.c0(nf0_0.Bq0));
        fg0_24.RR(() -> this.m80((byte) 16));
        this.uq.Kn0(fg0_8);
        this.zo.Kn0(fg0_8);
        this.uq.Kn0(fg0_9);
        this.zo.Kn0(fg0_9);
        this.uq.Kn0(fg0_10);
        this.zo.Kn0(fg0_10);
        this.uq.Kn0(fg0_11);
        this.zo.Kn0(fg0_11);
        this.uq.Kn0(fg0_12);
        this.zo.Kn0(fg0_12);
        this.uq.Kn0(fg0_13);
        this.zo.Kn0(fg0_13);
        this.uq.Kn0(fg0_14);
        this.zo.Kn0(fg0_14);
        this.uq.Kn0(fg0_15);
        this.zo.Kn0(fg0_15);
        this.uq.Kn0(fg0_16);
        this.zo.Kn0(fg0_16);
        this.uq.Kn0(fg0_17);
        this.zo.Kn0(fg0_17);
        this.uq.Kn0(fg0_18);
        this.zo.Kn0(fg0_18);
        this.uq.Kn0(fg0_19);
        this.zo.Kn0(fg0_19);
        this.uq.Kn0(fg0_20);
        this.zo.Kn0(fg0_20);
        this.uq.Kn0(fg0_21);
        this.zo.Kn0(fg0_21);
        this.uq.Kn0(fg0_22);
        this.zo.Kn0(fg0_22);
        this.uq.Kn0(fg0_23);
        this.zo.Kn0(fg0_23);
        this.uq.Kn0(fg0_24);
        this.zo.Kn0(fg0_24);
        (this.EI0[3] = new xe_1[17])[0] = fg0_8;
        this.EI0[3][1] = fg0_9;
        this.EI0[3][2] = fg0_10;
        this.EI0[3][3] = fg0_11;
        this.EI0[3][4] = fg0_12;
        this.EI0[3][5] = fg0_13;
        this.EI0[3][6] = fg0_14;
        this.EI0[3][7] = fg0_15;
        this.EI0[3][8] = fg0_16;
        this.EI0[3][9] = fg0_17;
        this.EI0[3][10] = fg0_18;
        this.EI0[3][11] = fg0_19;
        this.EI0[3][12] = fg0_20;
        this.EI0[3][13] = fg0_21;
        this.EI0[3][14] = fg0_22;
        this.EI0[3][15] = fg0_23;
        this.EI0[3][16] = fg0_24;
        this.EI0[4] = new xe_1[0];
        this.EI0[5] = new xe_1[rj.length + 1];
        byte b2;
        for (int j = 0; j < rj.length + 1; j = b2) {
            final int n2 = j;
            final short[] array4 = rj;
            this.EI0[5][j] = new fg0_1();
            if (n2 < array4.length) {
                final short s2;
                final cq_0 w50;
                if ((s2 = rj[j]) != 0 && (w50 = mp_1.vf0().W50(s2)) != null) {
                    final xe_1 xe_1 = this.EI0[5][j];
                    final StringBuilder append = new StringBuilder().append(w50.zj());
                    String ud;
                    if (jm_1 != jm_1.Bh0) {
                        final StringBuilder sb = new StringBuilder();
                        final StringBuilder sb2 = sb;
                        final short[] array5 = array;
                        final int n3 = j;
                        new StringBuilder(" - ");
                        ud = fp0_0.uD(sb, array5[n3], " COINS");
                    } else {
                        ud = "";
                    }
                    xe_1.SU(append.append(ud).toString());
                } else {
                    this.EI0[5][j].SU("???");
                }
            } else {
                this.EI0[5][j].SU(sm0_0.c0(nf0_0.Bq0));
                this.zF.add(this.EI0[5][j]);
            }
            b2 = (byte) (j + 1);
            this.EI0[5][j].RR(() -> this.m80((byte) n2));
            this.uq.Kn0(this.EI0[5][j]);
            this.zo.Kn0(this.EI0[5][j]);
        }
        this.EI0[6] = new xe_1[rj.length + 1];
        byte b3;
        for (int k = 0; k < rj.length + 1; k = b3) {
            final int n4 = k;
            final short[] array6 = rj;
            this.EI0[6][k] = new fg0_1();
            if (n4 < array6.length) {
                ZT or = null;
                if (jm_1 == jm_1.Xy0) {
                    or = Z0.Bm().or(rj[k]);
                }
                if (or == null) {
                    this.EI0[6][k].SU("??? - " + rj[k]);
                } else {
                    this.EI0[6][k].SU(or.Nw0());
                }
            } else {
                this.EI0[6][k].SU(sm0_0.c0(nf0_0.Bq0));
                this.zF.add(this.EI0[6][k]);
            }
            b3 = (byte) (k + 1);
            this.EI0[6][k].RR(() -> this.m80((byte) n4));
            this.uq.Kn0(this.EI0[6][k]);
            this.zo.Kn0(this.EI0[6][k]);
        }
        this.EI0[7] = new xe_1[6];
        xe_1[][] ei2;
        xe_1[] array14;
        byte b4;
        for (int l = 0; l < (array14 = (ei2 = this.EI0)[7]).length; l = b4) {
            final int n6 = l;
            array14[l] = new fg0_1();
            if (n6 != 5) {
                final int n7 = l;
                int n8 = 0;
                switch (n7 + 1) {
                    case 5: {
                        n8 = (short) (9999 - tw0_0.rl.ex().qu0());
                        break;
                    }
                    case 4: {
                        n8 = 500;
                        break;
                    }
                    case 3: {
                        n8 = 250;
                        break;
                    }
                    case 2: {
                        n8 = 100;
                        break;
                    }
                    case 1: {
                        n8 = 50;
                        break;
                    }
                }
                this.EI0[7][l].SU(NumberFormat.getInstance().format(n8) + " COINS - $" + NumberFormat.getInstance().format(n8 * 5));
            } else {
                this.EI0[7][l].SU(sm0_0.c0(nf0_0.Bq0));
                this.zF.add(this.EI0[7][l]);
            }
            b4 = (byte) (l + 1);
            this.EI0[7][l].RR(() -> this.m80((byte) n6));
            this.uq.Kn0(this.EI0[7][l]);
            this.zo.Kn0(this.EI0[7][l]);
        }
        ei2[8] = new xe_1[rj.length + 1];
        byte b5;
        for (int n9 = 0; n9 < rj.length + 1; n9 = b5) {
            final int n10 = n9;
            final short[] array15 = rj;
            this.EI0[8][n9] = new fg0_1();
            if (n10 < array15.length) {
                final int n11;
                if ((n11 = 0) == 1 || n11 == 2) {
                    final cq_0 w51;
                    if ((w51 = mp_1.vf0().W50(rj[n9])) == null) {
                        this.EI0[8][n9].SU("???");
                    } else {
                        final xe_1 xe_3 = this.EI0[8][n9];
                        final StringBuilder append = new StringBuilder().append(w51.zj());
                        String ud;
                        if (jm_1 != jm_1.Bh0) {
                            final StringBuilder sb5 = new StringBuilder();
                            final short[] array16 = array;
                            final int n12 = n9;
                            new StringBuilder(" - ");
                            ud = fp0_0.uD(sb5, array16[n12], " COINS");
                        } else {
                            ud = "";
                        }
                        xe_3.SU(append.append(ud).toString());
                    }
                }
            } else {
                this.EI0[8][n9].SU(sm0_0.c0(nf0_0.Bq0));
                this.zF.add(this.EI0[8][n9]);
            }
            b5 = (byte) (n9 + 1);
            this.EI0[8][n9].RR(() -> this.m80((byte) n10));
            this.uq.Kn0(this.EI0[8][n9]);
            this.zo.Kn0(this.EI0[8][n9]);
        }

        // EI0[9]: 动态多选菜单 (PC电脑菜单、商店、电梯、NPC选项等)
        final String[] cOm1 = _case.DX().COm1(e20, nl0, array2);
        this.EI0[9] = new xe_1[cOm1.length];
        for (int n13 = 0; n13 < this.EI0[9].length; ++n13) {
            final int n14 = n13;
            this.EI0[9][n13] = new fg0_1();
            this.EI0[9][n13].SU(cOm1[n13]);
            this.EI0[9][n13].RR(() -> this.m80((byte) (n14 + 1)));
            this.uq.Kn0(this.EI0[9][n13]);
            this.zo.Kn0(this.EI0[9][n13]);

            // ======================== B键取消关键修复 ========================
            // 检查多选菜单中的最后一项或取消项，将其加入 this.zF，确保按 B 键能执行取消
            if (cOm1.length > 1 && n13 == cOm1.length - 1) {
                String text = cOm1[n13];
                if (text != null) {
                    String cancelBq0 = sm0_0.c0(nf0_0.Bq0);
                    String noYt = sm0_0.c0(nf0_0.Yt);
                    if (text.equals(cancelBq0) || text.equals(noYt)
                            || text.contains("取消") || text.equalsIgnoreCase("Cancel")
                            || text.equalsIgnoreCase("Log Off") || text.equalsIgnoreCase("Exit")
                            || text.contains("关机") || text.contains("退出")) {
                        this.zF.add(this.EI0[9][n13]);
                    }
                }
            }
            // ===============================================================
        }

        this.Ee0.WQ(this.uq);
        this.Ee0.x40(this.zo);
        this.mJ0.AH0(this.Ee0);
        this.GF.Oq0(true);
        final ph_0 gf = this.GF;
        gf.WQ(gf.H10().Kn0(this.SW).qd(140));
        final ph_0 gf2 = this.GF;
        gf2.x40(gf2.lo0().Kn0(this.SW).X20(this.GF.lo0()));
        this.GF.Ll(false);
        this.mJ0.Ll(false);
        this.SL(this.GF);
        this.SL(this.mJ0);
        this.bk0();
        if (jm_1 == jm_1.PF || jm_1 == jm_1.Jz) {
            lpt5__5.I20().ZD(() -> lg_0.k.lPT5(() -> {
                if (!super.RP) {
                    this.m80((byte) 1);
                }
            }), 1000L);
        }
    }

    public final boolean bk0() {
        final String s;
        if ((s = this.aL.poll()) == null) {
            return false;
        }
        if (super.Qq0.qP && s.trim().isEmpty() && this.aL.isEmpty()) {
            this.jJ0();
            return true;
        }
        final jm_1 qq0;
        if ((qq0 = super.Qq0) != jm_1.PF && qq0 != jm_1.Jz && qq0 != jm_1.ga0) {
            this.SW.dr.add(new dc0_1(s));
        } else {
            this.SW.Sk(s);
        }
        this.jJ0();
        return true;
    }

    public final void lPt5(int ce0) {
        final xe_1[] kg;
        if ((kg = this.kg) != null && kg.length != 0) {
            if (ce0 >= kg.length) {
                ce0 = 0;
            }
            final xe_1[] array = kg;
            final int n = ce0;
            this.ce0 = ce0;
            lpt6__0.v90(array[n]);
            this.mJ0.Rn(this.kg[ce0]);
        }
    }

    @Override
    public boolean p3(int ce0) {
        final xe_1[] kg;
        if ((kg = this.kg) != null && kg[this.ce0] != null) {
            final rp_0 sj0 = rp_0.sJ0;
            if (sj0 != null && sj0.Ov(ce0)) {
                final jm_1 qq0;
                if ((qq0 = super.Qq0) != jm_1.PF && qq0 != jm_1.Jz) {
                    a7_0.bH(this.kg[this.ce0].ER.Fc0);
                    return true;
                }
                return true;
            }
            final rp_0 nk0;
            if ((nk0 = rp_0.nK0) != null && nk0.Ov(ce0)) {
                if (super.Qq0 == jm_1.PF) {
                    return true;
                }
                xe_1 targetBtn = null;
                xe_1[] kg2;
                for (int length = (kg2 = this.kg).length, i = 0; i < length; ++i) {
                    final xe_1 o;
                    if ((o = kg2[i]) == this.OQ || o == this.an0 || this.zF.contains(o)) {
                        targetBtn = o;
                    }
                }
                if (targetBtn != null) {
                    a7_0.bH(targetBtn.ER.Fc0);
                    return true;
                }
                // ======================== B键取消回退保护 ========================
                // 若处于多选菜单 (EI0[9]) 且包含两个及以上选项，按B键直接触发最后一个选项（取消/关机）
                if (this.kg == this.EI0[9] && this.kg != null && this.kg.length > 1) {
                    xe_1 lastBtn = this.kg[this.kg.length - 1];
                    if (lastBtn != null && lastBtn.ER != null && lastBtn.ER.Fc0 != null) {
                        a7_0.bH(lastBtn.ER.Fc0);
                        return true;
                    }
                }
                // ===============================================================
                final jm_1 qq2;
                if (((qq2 = super.Qq0) == jm_1.f40 || qq2 == jm_1.Xe0) && (this.cr & 0x2) != 0) {
                    this.m80((byte) 127);
                    return true;
                }
                return true;
            }
            final rp_0 kc0;
            if ((kc0 = rp_0.kC0) != null && kc0.Ov(ce0)) {
                if ((ce0 = this.ce0) > 0) {
                    this.lPt5(ce0 - 1);
                    return true;
                }
                return true;
            }
            final rp_0 synchronized$;
            if ((synchronized$ = rp_0.synchronized$) != null) {
                if (synchronized$.Ov(ce0) && (ce0 = this.ce0 + 1) < this.kg.length) {
                    this.lPt5(ce0);
                }
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean zn0() {
        if (!this.SW.Eg0()) {
            return false;
        }
        if (!this.bk0() && this.kc0 == 0) {
            this.m80((byte) 0);
            return true;
        }
        return false;
    }

    public final void s2() {
        if (!this.SW.Eg0()) {
            return;
        }
        if (!this.bk0()) {
            this.m80((byte) 0);
        }
    }

    @Override
    public void jJ0() {
        if (!this.SW.Eg0()) {
            this.uy0(-1);
            return;
        }
        if (!this.aL.isEmpty()) {
            this.uy0(0);
            return;
        }
        if (System.currentTimeMillis() < this.e30) {
            this.uy0(-1);
            return;
        }
        if (super.RP) {
            this.uy0(-1);
            return;
        }
        switch (ah0_0.Dh0[super.Qq0.an]) {
            case 1:
            case 2: {
                this.uy0(8);
                break;
            }
            case 3:
            case 4: {
                this.s2();
                break;
            }
            case 5:
            case 6:
            case 7: {
                this.uy0(1);
                break;
            }
            case 8:
            case 9:
            case 10:
            case 11: {
                this.uy0(5);
                break;
            }
            case 12: {
                this.uy0(6);
                break;
            }
            case 13: {
                this.uy0(7);
                break;
            }
            case 14:
            case 15:
            case 16: {
                this.uy0(9);
                break;
            }
            default: {
                this.uy0(0);
                break;
            }
        }
    }

    public final void uy0(int kc0) {
        final int n = kc0;
        this.uq.Ja0();
        this.zo.Ja0();
        xe_1[] kg;
        if (n < 0) {
            kg = null;
        } else {
            kg = this.EI0[kc0];
        }
        this.kg = kg;
        for (int i = 0; i < this.EI0.length; ++i) {
            xe_1[] array;
            for (int j = 0; j < (array = this.EI0[i]).length; ++j) {
                final int n2 = i;
                final xe_1 xe_1 = array[j];
                final boolean b = n2 == kc0;
                final int n3 = i;
                xe_1.Ll(b);
                if (n3 == kc0) {
                    this.uq.Kn0(this.EI0[i][j]);
                    this.zo.Kn0(this.EI0[i][j]);
                }
            }
        }
        final lo0_0 mj0 = this.mJ0;
        final boolean b2 = this.kg != null;
        final int n4 = kc0;
        mj0.Ll(b2);
        this.kc0 = kc0;
        Label_0242: {
            lo0_0 lo0_0;
            String s;
            if (n4 != 0 && !super.Ye.equals(hg_2.BD)) {
                lo0_0 = this.mJ0;
                if ((s = "scrollpane").equals(lo0_0.gW)) {
                    break Label_0242;
                }
            } else {
                lo0_0 = this.mJ0;
                if ((s = "scrollpane-transparent").equals(lo0_0.gW)) {
                    break Label_0242;
                }
            }
            final lo0_0 lo0_2 = lo0_0;
            lo0_2.uf(s);
            lo0_2.yI();
        }
        final jm_1 qq0;
        if ((qq0 = super.Qq0) == jm_1.Dq0) {
            this.lPt5(1);
        } else if (qq0 != jm_1.f40 && qq0 != jm_1.q10) {
            this.lPt5(0);
        } else {
            final _case p = _case.P0;
            kc0 = this.e20;
            final LG0 lg0;
            if ((lg0 = (LG0) p.vm0[kc0].cT.BM(this.nl0)) == null) {
                kc0 = 0;
            } else {
                kc0 = lg0.BQ;
            }
            this.lPt5(kc0);
        }
        if (tw0_0.iE.KK0(dw_2.JU)) {
            this.p3(dw_2.JU);
        } else if (tw0_0.iE.KK0(dw_2.RM)) {
            this.p3(dw_2.RM);
        }
        this.K8();
    }

    @Override
    public void HP(final zk0_1 zk0_1) {
        if (this.kg == null && this.SW.Eg0()) {
            this.jJ0();
        }
        this.GF.Ll(true);
        super.HP(zk0_1);
    }

    @Override
    public final boolean tE() {
        final yt_1 e60;
        final byte com4;
        if ((e60 = tw0_0.e60) == null || (com4 = e60.Com4) == 3 || com4 == 4) {
            return false;
        }
        final jn_0 ld0;
        if ((ld0 = tw0_0.LD0).no0 != null) {
            return false;
        }
        if (!this.c20) {
            final jn_0 jn_0 = ld0;
            final float x = ld0.ew0() / 2.0f + 120.0f - 20.0f;
            final float n = (float) (this.GF.SB0 + 15);
            final float x2 = tw0_0.LD0.ew0() / 2.0f + 20.0f + 120.0f;
            final float n2 = (float) (this.GF.SB0 + 15);
            final float x3 = this.pa0 - 32.0f;
            final float n3 = (float) this.Zx0;
            final Color jr0 = MessageBoxBubble.Jr0;
            final Bp0 ds0 = jn_0.ds0;
            final float y = n;
            ds0.x = x;
            ds0.y = y;
            final Bp0 ec0 = jn_0.EC0;
            final float y2 = n2;
            ec0.x = x2;
            ec0.y = y2;
            final Bp0 pd0 = jn_0.pd0;
            final float y3 = n3;
            pd0.x = x3;
            pd0.y = y3;
            jn_0.LpT8.set(jr0);
            return true;
        }
        return false;
    }

    @Override
    public final void a80(final Jn0 jn0) {
        this.GF.oY(tw0_0.LD0.ew0(), 240);
    }

    @Override
    public final void K8() {
        final int ew0 = tw0_0.LD0.ew0();
        final int hv0 = tw0_0.LD0.Hv0();
        this.oY(ew0, hv0);
        this.RY(ew0, hv0);
        this.g2(ew0, hv0);
        if (!this.c20) {
            final int hv2;
            int n;
            if ((hv2 = tw0_0.LD0.Hv0()) > 720) {
                n = (int) ((hv2 - 720) * 0.25);
            } else {
                n = 0;
            }
            this.GF.lt0();
            this.GF.oY(Math.max(600, Math.min(tw0_0.LD0.ew0() / 2, 900)), Math.max(this.GF.OB, 150));
            this.GF.A20(pa0_0.dC0, 0, n);
        } else {
            this.GF.lt0();
            final ph_0 gf;
            final ph_0 ph_0 = gf = this.GF;
            final Nr0 sw = this.SW;
            ph_0.oY(sw.Mx + gf.e80 + gf.NV, sw.OB + gf.y9 + gf.Cz);
            this.GF.E40(this.pa0, this.Zx0);
        }
        if (tw0_0.kz0()) {
            if (this.kc0 == 0) {
                this.mJ0.oY(50, 100);
                this.mJ0.vf(pa0_0.Mk);
            } else {
                this.mJ0.oY(400, 475);
                this.mJ0.vf(pa0_0.up0);
            }
        } else if (this.kc0 == 0) {
            this.mJ0.lt0();
            final ph_0 gf2;
            this.mJ0.E40((gf2 = this.GF).A20 + gf2.Mx - 60, gf2.SB0 + gf2.OB - 60);
            this.OQ.lt0();
        } else {
            this.mJ0.lt0();
            this.mJ0.A20(pa0_0.L00, 0, -200);
        }
        if (this.kc0 != 0) {
            xe_1[][] ei0;
            for (int length = (ei0 = this.EI0).length, i = 0; i < length; ++i) {
                xe_1[] array;
                for (int length2 = (array = ei0[i]).length, j = 0; j < length2; ++j) {
                    final xe_1 xe_1 = array[j];
                    xe_1.RY(240, 80);
                    xe_1.g2(240, 80);
                }
            }
        }
        this.SW.qF0(pa0_0.qQ);
    }

    @Override
    public final boolean hy0() {
        return true;
    }

    @Override
    public final void Vy(final kt_0 kt_0) {
        if (kt_0.cg0 == jm_1.Xe0) {
            this.cr = kt_0.iy;
            this.EI0[9] = new xe_1[kt_0.FA.length];
            xe_1[] array;
            int n;
            for (int i = 0; i < (array = this.EI0[9]).length; i = (byte) (n + 1)) {
                n = i;
                array[i] = new fg0_1();
                this.EI0[9][i].SU(sm0_0.YG(kt_0.LPT2, lpt6__2.YG0, kt_0.mR, kt_0.FA[i], kt_0.CoM5));
                this.EI0[9][i].RR(() -> this.m80((byte) 0));
                this.uq.Kn0(this.EI0[9][i]);
                this.zo.Kn0(this.EI0[9][i]);
            }
        }
        super.gB0 = kt_0.jg0;
        super.Qq0 = kt_0.cg0;
        super.RP = false;
        this.uy0(-1);
    }

    @Override
    public final void Jh(final int pa0, final int zx0) {
        this.pa0 = pa0;
        this.Zx0 = zx0;
    }

    public final void hz() {
        if (!super.RP) {
            this.m80((byte) 1);
        }
    }

    public final void cOn() {
        lg_0.k.lPT5(this::hz);
    }

    public final void EG0() {
        if (this.SW.Eg0()) {
            this.m80((byte) (this.Qq0 == jm_1.QH ? 1 : 0));
        }
    }

    public final void m60() {
        if (this.SW.Eg0()) {
            this.m80((byte) (this.Qq0 == jm_1.QH ? 0 : 1));
        }
    }

    static {
        Jr0 = new Color(-185273089);
        Rj = new short[0];
    }
}
