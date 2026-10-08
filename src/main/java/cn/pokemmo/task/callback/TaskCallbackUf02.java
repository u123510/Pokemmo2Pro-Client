package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackUf02 implements Runnable  {
    public final qr0_0 sI0;
    public final int mB;
    public final Bn0 eG0;

    public TaskCallbackUf02(Bn0 bn0, qr0_0 qr0_0Var, int i) {
        this.eG0 = bn0;
        this.sI0 = qr0_0Var;
        this.mB = i;
    }

    @Override
    public final void run() {
        Bn0 bn0 = this.eG0;
        qr0_0 qr0_0Var = this.sI0;
        int i = this.mB;
        if (i < 0) {
            bn0.getClass();
            return;
        }
        qr0_0[] qr0_0Arr;
        if (i <= (qr0_0Arr = bn0.u70).length) {
            qr0_0 qr0_0Var2 = qr0_0Arr[i];
            vk0_1 vk0_1Var = qr0_0Var2.Cm;
            bn0.PK.pw0(qr0_0Var2.A80);
            bn0.O00 = i;
            bn0.w60.Sk(sm0_0.c0(vk0_1Var.bt));
            bn0.vP.og.r8(new LPT6_[]{fn_0.qz0().jJ0(vk0_1Var.oG(null, null).j40)});
            bn0.ch.Sk(sm0_0.c0(vk0_1Var.D8).replaceAll("\\|br\\|", "\n"));
            if (vk0_1Var.X00 == 0) {
                bn0.zn0.Sk("--");
            } else {
                bn0.zn0.Sk(vk0_1Var.X00 + "");
            }
            int i2 = vk0_1Var.mt0;
            if (i2 != 0 && i2 != 101) {
                bn0.TK0.Sk(vk0_1Var.mt0 + "");
            } else {
                bn0.TK0.Sk("100");
            }
            bn0.v80.Sk(vk0_1Var.Gn(false) + "");
            if (bn0.sj != nl0_0.Sg) {
                kf0_0 kf0_0Var = (kf0_0) zm_2.gH0.YA0.f5(vk0_1Var.hC0);
                if (kf0_0Var == null) {
                    bn0.DG.Sk("???");
                    return;
                }
                nl0_0 nl0_0Var = bn0.sj;
                if (nl0_0Var == nl0_0.x8) {
                    if (kf0_0Var.jg > 0) {
                        bn0.DG.Sk(kf0_0Var.jg + " " + sm0_0.c0(121));
                    } else {
                        bn0.DG.Sk("??? " + sm0_0.c0(121));
                    }
                } else if (nl0_0Var == nl0_0.rB) {
                    mc0_1 lPT6 = gu0.l2.lPT6((short) 5086);
                    mc0_1 lPT62 = gu0.l2.lPT6((short) 5087);
                    int i3 = kf0_0Var.qK0;
                    bn0.DG.Sk(sm0_0.Bx(1934, new String[]{Integer.toString(i3 * 2), sm0_0.c0(lPT6.Nl), Integer.toString(i3), sm0_0.c0(lPT62.Nl)}));
                } else if (nl0_0Var == nl0_0.eu0) {
                    mc0_1 lPT63 = gu0.l2.lPT6((short) 5093);
                    bn0.DG.Sk(kf0_0Var.qK0 + "x " + sm0_0.c0(lPT63.Nl));
                } else {
                    xj0_1[] xj0_1Arr = kf0_0Var.Zs;
                    if (xj0_1Arr.length > 0) {
                        StringBuilder sb = new StringBuilder();
                        for (xj0_1 xj0_1Var : xj0_1Arr) {
                            mc0_1 lPT64 = gu0.l2.lPT6(xj0_1Var.Ij);
                            if (sb.length() > 0) {
                                sb.append("\n");
                            }
                            sb.append(xj0_1Var.sY + "x " + sm0_0.c0(lPT64.Nl));
                        }
                        bn0.DG.Sk(sb.toString());
                    }
                }
            }
            if (!bn0.eH[bn0.O00].Of()) {
                if (qr0_0Var != null) {
                    lpt6__0.v90(bn0.eH[qr0_0Var.zI0]);
                } else {
                    lpt6__0.v90(bn0.eH[0]);
                }
            }
        }
    }
}
