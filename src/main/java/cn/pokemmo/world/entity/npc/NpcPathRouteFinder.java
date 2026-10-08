package cn.pokemmo.world.entity.npc;

import f.*;

import java.util.Arrays;

public class NpcPathRouteFinder {
    public final hd0_2 ko;
    public final cr_2 t0;
    public final u6_0 n;
    public final rv_0 K4;
    public final long F10;
    public volatile boolean Pb;
    public volatile boolean cJ0;
    public volatile es_1 q4;
    public volatile L3 dl;
    public volatile L3 GF;
    public volatile Object ry;
    public volatile boolean XJ;

    public NpcPathRouteFinder(hd0_2 hd0_2, cr_2 cr_2, u6_0 u6_0, rv_0 rv_0) {
        this.ko = hd0_2;
        this.t0 = cr_2;
        this.n = u6_0;
        this.K4 = rv_0;
        if (hd0_2.LPt4.iq0() == 3) {
            this.F10 = _private.lpt1();
        } else {
            this.F10 = 0L;
        }
    }

    public static void V20(es_1 es_1) {
        boolean z = es_1.yT;
        es_1.yT = true;
        for (int i = 0; i < es_1.KB; i++) {
            String str = ((cr_2) es_1.get(i)).RH0;
            Class cls = ((cr_2) es_1.get(i)).wj;
            for (int i2 = es_1.KB - 1; i2 > i; i2--) {
                if (cls == ((cr_2) es_1.get(i2)).wj && str.equals(((cr_2) es_1.get(i2)).RH0)) {
                    es_1.Tx0(i2);
                }
            }
        }
        es_1.yT = z;
    }

    public final boolean Uf0() {
        u6_0 u6_0 = this.n;
        if (u6_0 instanceof md_0) {
            md_0 md_0 = (md_0) u6_0;
            if (!this.cJ0) {
                this.cJ0 = true;
                cr_2 cr_2 = this.t0;
                String str = cr_2.RH0;
                if (cr_2.Ju == null) {
                    cr_2.Ju = this.n.resolve(str);
                }
                this.q4 = md_0.getDependencies(str, cr_2.Ju, this.t0.coM1);
                if (this.q4 == null) {
                    if (this.t0.Ju == null) {
                        this.t0.Ju = this.n.resolve(this.t0.RH0);
                    }
                    this.ry = md_0.mm(this.ko, this.t0.RH0, this.t0.Ju, this.t0.coM1);
                } else {
                    V20(this.q4);
                    hd0_2 hd0_2 = this.ko;
                    String str2 = this.t0.RH0;
                    es_1 es_1 = this.q4;
                    synchronized (hd0_2) {
                        af_1 af_1 = hd0_2.wn;
                        I2 it = es_1.ZD();
                        while (it.hasNext()) {
                            cr_2 cr_22 = (cr_2) it.next();
                            if (af_1.lpT8(cr_22.RH0) < 0) {
                                af_1.MG0(cr_22.RH0);
                                hd0_2.hs0(str2, cr_22);
                            }
                        }
                        int NK = af_1.NK(32, af_1.gr);
                        Object[] objArr = af_1.if$;
                        if (objArr.length <= NK) {
                            if (af_1.g1 != 0) {
                                af_1.g1 = 0;
                                Arrays.fill(objArr, (Object) null);
                            }
                        } else {
                            af_1.g1 = 0;
                            af_1.aO(NK);
                        }
                    }
                }
            } else {
                if (this.t0.Ju == null) {
                    this.t0.Ju = this.n.resolve(this.t0.RH0);
                }
                this.ry = md_0.mm(this.ko, this.t0.RH0, this.t0.Ju, this.t0.coM1);
            }
        } else {
            N00 n00 = (N00) u6_0;
            if (!this.cJ0) {
                if (this.dl == null) {
                    rv_0 rv_0 = this.K4;
                    if (!rv_0.pe0.isShutdown()) {
                        this.dl = new L3(rv_0.pe0.submit(new hk_2((sn_1) this)));
                    } else {
                        throw new nf_1("Cannot run tasks on an executor that has been shutdown (disposed)");
                    }
                } else if (this.dl.p1.isDone()) {
                    try {
                        this.dl.getClass();
                        try {
                            this.dl.p1.get();
                        } catch (InterruptedException unused) {
                        } catch (java.util.concurrent.ExecutionException e) {
                            throw new nf_1(e.getCause());
                        }
                        this.cJ0 = true;
                        if (this.Pb) {
                            if (this.t0.Ju == null) {
                                this.t0.Ju = this.n.resolve(this.t0.RH0);
                            }
                            this.ry = n00.loadSync(this.ko, this.t0.RH0, this.t0.Ju, this.t0.coM1);
                        }
                    } catch (Exception e2) {
                        throw new nf_1("Couldn't load dependencies of asset: " + this.t0.RH0, e2);
                    }
                }
            } else if (this.GF == null && !this.Pb) {
                rv_0 rv_02 = this.K4;
                if (!rv_02.pe0.isShutdown()) {
                    this.GF = new L3(rv_02.pe0.submit(new hk_2((sn_1) this)));
                } else {
                    throw new nf_1("Cannot run tasks on an executor that has been shutdown (disposed)");
                }
            } else if (this.Pb) {
                if (this.t0.Ju == null) {
                    this.t0.Ju = this.n.resolve(this.t0.RH0);
                }
                this.ry = n00.loadSync(this.ko, this.t0.RH0, this.t0.Ju, this.t0.coM1);
            } else if (this.GF.p1.isDone()) {
                try {
                    this.GF.getClass();
                    try {
                        this.GF.p1.get();
                    } catch (InterruptedException unused2) {
                    } catch (java.util.concurrent.ExecutionException e3) {
                        throw new nf_1(e3.getCause());
                    }
                    if (this.t0.Ju == null) {
                        this.t0.Ju = this.n.resolve(this.t0.RH0);
                    }
                    this.ry = n00.loadSync(this.ko, this.t0.RH0, this.t0.Ju, this.t0.coM1);
                } catch (Exception e4) {
                    throw new nf_1("Couldn't load asset: " + this.t0.RH0, e4);
                }
            }
        }
        return this.ry != null;
    }
}
