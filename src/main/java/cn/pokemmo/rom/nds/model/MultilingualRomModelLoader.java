package cn.pokemmo.rom.nds.model;

import f.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class MultilingualRomModelLoader {
    public static final dl_1 TS = Cq0.E1(MultilingualRomModelLoader.class);
    public boolean xe0;
    public boolean N20;
    public boolean hZ;
    public boolean K90;

    public MultilingualRomModelLoader() {
        this(0);
    }

    public MultilingualRomModelLoader(int n) {
    }

    public static void lb() {
        System.exit(1);
    }

    public static void yK(Throwable throwable) {
        Bw0.Sx0(Bw0.Cp(throwable), true);
        System.exit(1);
    }

    public static void YI() {
        System.exit(1);
    }

    public static void Ys() {
        System.exit(1);
    }

    public static void OM() {
        tw0_0.Ro0.qI0(true, new String[0]);
    }

    public static void S2() {
        System.exit(1);
    }

    public static boolean h0() {
        if (tw0_0.KW == null) {
            tw0_0.KW = new ru0_0();
        }
        ru0_0 manager = tw0_0.KW;
        I2 it = manager.yG0.ZD();
        while (it.hasNext()) {
            gf0_0 item = (gf0_0) it.next();
            if (item != null && !item.Ro0()) {
                return false;
            }
        }
        manager.yG0.clear();
        return true;
    }

    public static void COM8() {
        Object obj = tw0_0.Ll0.Qz0;
        if (obj != null) {
            ((l50_0) obj).fx = new Ze(tw0_0.Ll0.Qz0);
            nj0_0 pack = tw0_0.Ll0.Qz0;
            l50_0 base = pack;
            ra0_0.Kr = new ra0_0();
            ra0_0.Do = new FJ((Ae) base.fd0.dg.get("/a/1/2/2"));
            ra0_0.AI0 = new FJ((Ae) base.fd0.dg.get("/a/1/1/0"));
            ra0_0.Mn = new FJ((Ae) base.fd0.dg.get("/a/1/3/5"));
            ra0_0.ME0 = new FJ((Ae) base.fd0.dg.get("/a/1/0/7"));
            ra0_0.GU = new FJ((Ae) base.fd0.dg.get("/a/1/3/8"));
            ra0_0.kJ = new FJ((Ae) base.fd0.dg.get("/a/1/2/1"));
            ra0_0.xF0 = new FJ((Ae) base.fd0.dg.get("/a/1/5/3"));
            ra0_0.Uk0 = new FJ((Ae) base.fd0.dg.get("/a/1/6/2"));
            ra0_0.nv0 = new FJ((Ae) base.fd0.dg.get("/a/1/5/7"));

            Ae ae = (Ae) pack.fd0.dg.get("/a/1/5/0");
            Qd0.cV();
            String ignored = ae.kd;
            ByteBuffer buf = ae.h2.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            int magic = pf_0.LPt2(buf, ae.bM0);
            if (magic != 1129464142) {
                throw new RuntimeException(GQ.ti("Header magic mismatch = ", magic, " vs expected 1129464142"));
            }
            buf.position();
            buf.getInt();
            buf.getInt();
            int pos = ((Buffer) buf).position();
            ((Buffer) buf).position(buf.getInt() * 8 + pos);
            buf.getInt();
            buf.getInt();
            ((Buffer) buf).position();
        }
        obj = tw0_0.Ll0.nC0;
        if (obj != null) {
            ((l50_0) obj).fx = new Ze(tw0_0.Ll0.nC0);
        }
        obj = tw0_0.Ll0.t1;
        if (obj != null) {
            ((l50_0) obj).fx = new Ze(tw0_0.Ll0.t1);
        }
    }

    public static void kh() {
        if (tw0_0.Ll0.Qz0 != null) {
            tw0_0.LD0.Yx0.nI(tw0_0.Ll0.Qz0);
        }
    }

    public static boolean C80(nf_1 e) {
        String msg = e.getMessage();
        return "Error loading pixmap.".equalsIgnoreCase(msg)
                || tx_1.qp0(msg, "allocate memory for pixmap")
                || tx_1.qp0(msg, "out of memory");
    }

    public static void Yz() {
        tw0_0.uV.Ef0(sm0_0.c0(nf0_0.go), sm0_0.c0(nf0_0.cs0), UE.iC, Iu0::S2, true);
    }

    public static void j6() {
        wi0_0 lang = wi0_0.gm;
        String current = lang.pO();
        if (dw_2.m70) {
            current = dw_2.con;
        } else if (!current.equalsIgnoreCase(dw_2.con)) {
            dw_2.con = current;
            lang.CP(dw_2.con);
            TS.info("Switching interface language to match system: {}", dw_2.con);
            dw_2.Va = true;
        }
        String prefix = current.length() > 2 ? current.substring(0, 2) : current;
        if (!dw_2.S6 && "en".equals(dw_2.fP) && !current.equalsIgnoreCase(dw_2.fP) && G50.Rw(prefix) != null) {
            dw_2.fP = prefix;
            TS.info("Switching chat language to match system: {}", prefix);
            dw_2.Va = true;
        }
    }

    public final void Pc0() {
        lpt5__5 pool = lpt5__5.hL;
        pool.Com4.execute(this::k80);
        if (this.K90) {
            this.s2();
        }
    }

    public final void z4() {
        try {
            tw0_0.pv = new _native();
            if (!tw0_0.pv.Pk0()) {
                this.me0(new RuntimeException(), "Error loading addons.pak. The loaded file is corrupt.", true);
                return;
            }
            tr_0.bJ(Iu0::kh);
            tr_0.bJ(Iu0::COM8);
            tr_0.w9.add((Yk) Iu0::h0);
            tr_0.bJ(nf_0::zo0);
            tr_0.bJ(fn_0.qz0()::qp0);
            tr_0.bJ(xt_0::init);
            tr_0.w9.add((Yk) this::C80);
        } catch (Exception e) {
            if (this.EF0(e)) {
                return;
            }
            this.me0(e, sm0_0.c0(nf0_0.bu), true);
        }
    }

    public final boolean jM() {
        try {
            lg_0.I70.getClass();
            Dn0[] files = new VE("data/offsets/", zv_1.tt0).gH0(".dat");
            for (Dn0 file : files) {
                G1 data = new G1(file);
                if (!data.xo(false)) {
                    continue;
                }
                br_2 target = (br_2) fx_0.GN.get(data.ug + "-" + data.Vv);
                if (target != null) {
                    target.hG = data;
                }
            }
            return true;
        } catch (Exception e) {
            if (this.EF0(e)) {
                return false;
            }
            this.me0(e, sm0_0.c0(nf0_0.bu), true);
            return false;
        }
    }

    public final boolean cD() {
        try {
            aa0_2 packs = tw0_0.Ll0;
            qa0_1[] roms = packs.LK0;
            l50_0[] resources = packs.Yi;
            for (l50_0 resource : resources) {
                resource.jx();
            }
            for (qa0_1 rom : roms) {
                rom.TS();
            }
            return true;
        } catch (Exception e) {
            if (this.EF0(e)) {
                return false;
            }
            this.me0(e, sm0_0.c0(nf0_0.wj), false);
            dw_2.COm9 = "";
            dw_2.e8 = "";
            dw_2.zS = "";
            dw_2.cx0 = "";
            dw_2.b1 = "";
            dw_2.CY();
            return false;
        }
    }

    public final boolean EF0(Exception e) {
        if (!(e instanceof nf_1)) {
            return false;
        }
        if (Iu0.C80((nf_1) e)) {
            this.me0(e, "Memory Allocation Failure.\nPlease close another application and try again.", false);
            TS.error("Caught GdxRuntimeException (Memory)", e);
        } else {
            this.me0(e, "Gdx Runtime Exception.\nPlease close another application and try again.", false);
            TS.error("Caught GdxRuntimeException", e);
        }
        return true;
    }

    public final void me0(Throwable throwable, String message, boolean canRetry) {
        this.xe0 = true;
        TS.error("Init exception", throwable);
        if (canRetry) {
            d8_0 launcher = tw0_0.Ro0;
            if (launcher != null && launcher.yy0()) {
                String text = AN.nK0(message, "\n\n").append(sm0_0.c0(nf0_0.Sc)).toString();
                tw0_0.uV.Qu(sm0_0.c0(nf0_0.go), text, UE.iC,
                        Iu0::OM,
                        Iu0::Ys, true);
            } else {
                tw0_0.uV.Ef0(sm0_0.c0(nf0_0.go), message, UE.iC, Iu0::YI, true);
            }
        } else {
            String text = AN.nK0(message, "\n\n").append(sm0_0.c0(nf0_0.Y4)).toString();
            Throwable captured = throwable;
            tw0_0.uV.Qu(sm0_0.c0(nf0_0.go), text, UE.iC,
                    () -> Iu0.yK(captured),
                    Iu0::lb, true);
        }
    }

    public final void k80() {
        try {
            fx_0.gq0();
            if (!this.jM()) {
                return;
            }
            tw0_0.Ll0 = new aa0_2();
            lg_0.I70.getClass();
            zv_1 fs = zv_1.kE;
            tw0_0.Ll0.nx(new VE("roms", fs));
            lg_0.I70.getClass();
            VE importing = new VE("roms/importing.tmp", fs);
            if (importing.os0()) {
                importing.sf();
            }
            lg_0.I70.getClass();
            Arrays.stream(new VE("roms", fs).gH0("_import")).forEach(Dn0::sf);

            try {
                DI loader = DI.yt;
                loader.nL0();
                if (tw0_0.Ll0.zd) {
                    tw0_0.aB.qZ();
                } else {
                    loader.tK0();
                }
            } catch (Exception e) {
                if (!this.EF0(e)) {
                    this.me0(e, "Error loading/applying mod data.\nPlease delete invalid mods to continue.", false);
                }
                return;
            }

            if (!this.RI(true)) {
                return;
            }
            Iu0.j6();
            if (!this.je()) {
                return;
            }
            this.K90 = true;
            if (!this.L90()) {
                return;
            }
            if (!this.cD()) {
                return;
            }
            if (!this.Ev0()) {
                return;
            }
            Mw0.NR();
            xs_0.init();
            lpt5__5.hL.AH0(c8_0.JD0, 15000L);
            this.N20 = true;
        } catch (Exception e) {
            if (this.EF0(e)) {
                return;
            }
            this.me0(e, sm0_0.c0(nf0_0.bu), true);
        }
    }

    public final boolean RI(boolean loadFiles) {
        try {
            if (loadFiles) {
                wi0_0 strings = wi0_0.gm;
                strings.getClass();
                vs_2[] files = tw0_0.aB.r1("data/strings/").W0(".xml");
                for (vs_2 file : files) {
                    C30 container = new C30(file, 1, true);
                    if (container.NC0()) {
                        if (!container.NC0()) {
                            wi0_0.ME0.warn("Skipped string {} because it is invalid.", container.Wi.el());
                        } else if (1 > container.dg0) {
                            wi0_0.ME0.warn("Skipped string {} because it is outdated.", container.Wi.el());
                        } else {
                            strings.YI.add(container);
                        }
                    }
                }
            }
            wi0_0.gm.t2(loadFiles);
            Iterator it = wi0_0.gm.GF0().iterator();
            ws_0 found = null;
            while (it.hasNext()) {
                ws_0 ws = (ws_0) it.next();
                if (ws.ga) {
                    found = ws;
                    break;
                }
            }
            if (found != null) {
                return true;
            }
            throw new RuntimeException("Missing string container");
        } catch (Exception e) {
            if (this.EF0(e)) {
                return false;
            }
            this.me0(e, sm0_0.c0(nf0_0.bu), true);
            return false;
        }
    }

    public final boolean L90() {
        try {
            lg_0.I70.getClass();
            if (WH0.wQ(new VE("data/sprites/addons.pak", zv_1.tt0))) {
                return true;
            }
            throw new RuntimeException();
        } catch (Exception e) {
            if (this.EF0(e)) {
                return false;
            }
            this.me0(e, sm0_0.c0(nf0_0.bu), true);
            return false;
        }
    }

    public final boolean Ev0() {
        if (tw0_0.Ll0.zd) {
            return true;
        }
        try {
            b1.vK0();
            if (!uq0_0.ha0()) {
                this.me0(new RuntimeException(), sm0_0.c0(nf0_0.bu), true);
                return false;
            }
            if (!jj0_2.Yk()) {
                this.me0(new RuntimeException(), sm0_0.c0(nf0_0.bu), true);
                return false;
            }
            this.RI(false);
            sm0_0.Q();
            sm0_0.wb();
            bc0_0.U1();
            sm0_0.xn0();
            b1.rn0();
            qk_2.cR = new qk_2();
            return true;
        } catch (Exception e) {
            if (this.EF0(e)) {
                return false;
            }
            this.me0(e, sm0_0.c0(nf0_0.wj), false);
            return false;
        }
    }

    public final boolean je() {
        vs_2 themes = tw0_0.aB.r1("data/themes/");
        if (!themes.os0()) {
            this.me0(new RuntimeException(), "/data/themes folder does not exist.", true);
            return false;
        }
        if (!tw0_0.Xy0()) {
            OX def = new OX("default", themes.R1("default"), false, 3, null);
            if (!def.r()) {
                this.me0(new RuntimeException(), "default theme is not valid", true);
                return false;
            }
            dw_2.qx0.add(def);
        }
        OX android = new OX("android", themes.R1("android"), true, 3, null);
        if (!android.r()) {
            this.me0(new RuntimeException(), "android theme is not valid", true);
            return false;
        }
        dw_2.qx0.add(android);
        Collections.sort(dw_2.qx0);
        if (!dw_2.bW(dw_2.zs)) {
            dw_2.TS(dw_2.tG(tw0_0.Xy0() ? "android" : "default"));
        }
        lg_0.k.lPT5(this::s2);
        return true;
    }

    public final void s2() {
        try {
            tw0_0.LD0.ba0(dw_2.tG(dw_2.zs));
        } catch (Throwable throwable) {
            TS.error("Failed to load theme {}", dw_2.zs, throwable);
            this.me0(throwable, sm0_0.c0(nf0_0.sK), true);
        }
    }

    public final boolean C80() {
        if (!this.N20 && !this.xe0 && !tw0_0.Ll0.zd) {
            return false;
        }
        synchronized (this) {
            if (this.hZ) {
                return true;
            }
            if (!this.xe0 && !tw0_0.Ll0.zd) {
                this.hZ = true;
                return true;
            }
            return true;
        }
    }
}
