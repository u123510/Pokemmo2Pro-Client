package cn.pokemmo.task.callback;

import f.*;

import java.util.ArrayList;
import java.util.Collections;

public class TaskCallbackOt00 implements Runnable  {
    public final LF0 MH0;

    public TaskCallbackOt00(LF0 lf0) {
        this.MH0 = lf0;
    }

    @Override
    public final void run() {
        int i1 = this.MH0.jB0.Bb();
        int i2;
        if (this.MH0.Oh0 != null) {
            i2 = this.MH0.Oh0.Bb();
        } else {
            i2 = 0;
        }
        if (this.MH0.Kl0 == null) {
            this.MH0.jB0.Wq(new le0_2(null, false), sm0_0.c0(nf0_0.EC0));
            tw0_0.rl.fk0.uQ(new F80());
            return;
        }
        this.MH0.Hn();
        this.MH0.jB0.Qf.em();
        this.MH0.jB0.ms0.em();
        this.MH0.jB0.g6.clear();
        this.MH0.jB0.bC = null;
        int i3 = 0;

        for (int i6 = 0; i6 < E10.pN.length; i6++) {
            E10 v7 = E10.pN[i6];
            if (this.MH0.Kl0[v7.zg].length < 1) {
                continue;
            }
            if (v7 == E10.tJ && !tw0_0.Ll0.cOM4((byte) 1)) {
                continue;
            }
            ArrayList<HV> v3 = new ArrayList<>();
            HV[] v8 = this.MH0.Kl0[v7.zg];
            for (int i10 = 0; i10 < v8.length; i10++) {
                v3.add(v8[i10]);
            }
            int i8 = this.MH0.Ko.mu0.Mw0;
            if (i8 == 0) {
                Collections.sort(v3, new ie0_0(v7 == E10.qb0));
            } else if (i8 == 1) {
                Collections.sort(v3, new ml_0());
            } else if (i8 == 2) {
                Collections.sort(v3, new ak_1());
            } else if (i8 == 3) {
                Collections.sort(v3, new S50());
            } else if (i8 == 4) {
                Collections.sort(v3, new tg_0());
            }
            int i8_flag = 1;
            fy_2 v9 = new fy_2();
            fy_2 v10 = new fy_2();
            I7 v11 = new I7(v10);
            Hm0 v12 = new Hm0(v10);
            int i13 = 2;
            if (v7 == E10.ug0) {
                this.MH0.Oh0 = new P8();
                for (int i16 = 0; i16 < q10_0.Pn0.length; i16++) {
                    q10_0 v17 = q10_0.Pn0[i16];
                    fy_2 v18 = new fy_2();
                    I7 v19 = new I7(v18);
                    Hm0 v20 = new Hm0(v18);
                    pn_2[] v21 = new pn_2[i13];
                    int i22 = 0;
                    int i23 = 0;
                    for (int i24 = 0; i24 < this.MH0.Kl0[v7.zg].length; i24++) {
                        HV v25 = v3.get(i24);
                        if (v25.Hc0() != null && v25.Hc0().SG == v17) {
                            int i26 = i22 + 1;
                            pn_2 v27 = new pn_2(v25, v7 == E10.qb0);
                            v21[i22] = v27;
                            i22++;
                            if ((i23 + 1) % i13 == 0) {
                                v18.hb(v21).qd(5).X20(v20);
                                v18.C7(v21).X20(v19);
                                v21 = new pn_2[i13];
                                i23 = i22;
                                i22 = 0;
                            } else {
                                i23 = i26;
                            }
                        }
                    }
                    Hm0 v22 = new Hm0(v18);
                    I7 v24 = new I7(v18);
                    int i25 = 0;
                    if (i22 > 0) {
                        for (int i26 = 0; i26 < i13; i26++) {
                            pn_2 v27 = v21[i26];
                            if (v27 != null) {
                                i25++;
                                v24.Kn0(v21[i26]);
                                v22.Kn0(v27);
                            }
                        }
                    }
                    if (i25 < 2) {
                        v24.Ze0();
                    }
                    v20.X20(v22);
                    v19.X20(v24);
                    v18.x40(v19);
                    v18.WQ(v20);
                    lo0_0 v19_lo = new lo0_0(v18);
                    v19_lo.Qs0(2);
                    v19_lo.uf("sp");
                    if (i23 > 0) {
                        this.MH0.Oh0.Wq(v19_lo, sm0_0.c0(v17.iL + 2871).replaceAll("\\n", " "));
                    }
                }
                fy_2 dummy = new fy_2();
                I7 v15_d = new I7(dummy);
                Hm0 v16_d = new Hm0(dummy);
                v15_d.Ze0();
                Hm0 v17_d = new Hm0(dummy);
                I7 v18_d = new I7(dummy);
                v17_d.X20(v18_d);
                v15_d.X20(v18_d);
                dummy.x40(v15_d);
                dummy.WQ(v16_d);
                lo0_0 lo_d = new lo0_0(dummy);
                lo_d.Qs0(2);
                lo_d.uf("sp");

                fy_2 v14 = new fy_2();
                I7 v15 = new I7(v14);
                Hm0 v16 = new Hm0(v14);
                un_1[] v17_arr = new un_1[i13];
                int i18 = 0;
                int i19 = 0;
                for (int i20 = 0; i20 < this.MH0.Kl0[v7.zg].length; i20++) {
                    HV v21 = v3.get(i20);
                    if (v21.YD == 5) {
                        int i22 = i18 + 1;
                        un_1 v18_un = new un_1(v21, false);
                        v17_arr[i18] = v18_un;
                        i18++;
                        if ((i19 + 1) % i13 == 0) {
                            v14.hb(v17_arr).qd(5).X20(v16);
                            v14.C7(v17_arr).X20(v15);
                            v17_arr = new un_1[i13];
                            i19 = i18;
                            i18 = 0;
                        } else {
                            i19 = i22;
                        }
                    }
                }
                Hm0 v3_hm = new Hm0(v14);
                I7 v18_i7 = new I7(v14);
                if (i18 > 0) {
                    for (int i20 = 0; i20 < i13; i20++) {
                        if (v17_arr[i20] == null) {
                            v17_arr[i20] = new un_1(null, false);
                        }
                        v18_i7.Kn0(v17_arr[i20]);
                        v3_hm.Kn0(v17_arr[i20]);
                    }
                }
                v16.X20(v3_hm);
                v15.X20(v18_i7);
                v14.x40(v15);
                v14.WQ(v16);
                lo0_0 v3_lo = new lo0_0(v14);
                v3_lo.Qs0(2);
                v3_lo.uf("sp");
                if (i19 > 0) {
                    this.MH0.Oh0.Wq(v3_lo, sm0_0.c0(3030));
                }

                v11.Kn0(this.MH0.Oh0);
                v12.Kn0(this.MH0.Oh0);
                v10.x40(v11);
                v10.WQ(v12);
                v9.WQ(v9.hb(new le0_2[]{v10}));
                v9.x40(v9.C7(new le0_2[]{v10}));
            } else {
                le0_2[] v14_arr = new le0_2[i13];
                int i15_idx = 0;
                for (int i16 = 0; i16 < this.MH0.Kl0[v7.zg].length; i16++) {
                    HV v17_item = v3.get(i16);
                    int i18 = i15_idx + 1;
                    le0_2 v19;
                    if (v17_item.Hc0() == null) {
                        v19 = new un_1(v17_item, false);
                    } else {
                        v19 = new pn_2(v17_item, v7 == E10.qb0);
                    }
                    v14_arr[i15_idx] = v19;
                    if (i18 % i13 == 0) {
                        v12.X20(v10.hb(v14_arr));
                        v11.X20(v10.C7(v14_arr));
                        v14_arr = new le0_2[i13];
                        i15_idx = 0;
                    } else {
                        i15_idx = i18;
                    }
                }
                Hm0 v3_hm = new Hm0(v10);
                I7 v15_i7 = new I7(v10);
                if (i15_idx > 0) {
                    for (int i16 = 0; i16 < i13; i16++) {
                        if (v14_arr[i16] == null) {
                            v14_arr[i16] = new un_1(null, false);
                        }
                        v15_i7.Kn0(v14_arr[i16]);
                        v3_hm.Kn0(v14_arr[i16]);
                    }
                }
                v12.X20(v3_hm);
                v11.X20(v15_i7);
                v10.x40(v11);
                v10.WQ(v12);
                lo0_0 v3_lo = new lo0_0(v10);
                v3_lo.Qs0(2);
                v3_lo.AH0(v10);
                v9.WQ(v9.hb(new le0_2[]{v3_lo}));
                v9.x40(v9.C7(new le0_2[]{v3_lo}));
            }
            this.MH0.jB0.Wq(v9, sm0_0.c0(v7.Vx0));
            i3 = i8_flag;
        }
        if (i3 == 0) {
            this.MH0.jB0.Wq(new fy_2(), sm0_0.c0(3004));
        }
        this.MH0.jB0.Zd(this.MH0.jB0.g6.get(i1));
        if (this.MH0.Oh0 != null) {
            this.MH0.Oh0.Zd(this.MH0.Oh0.g6.get(i2));
        }
    }
}
