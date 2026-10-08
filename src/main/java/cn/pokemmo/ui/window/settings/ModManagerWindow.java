package cn.pokemmo.ui.window.settings;

import f.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * 客户端Mod模组管理窗口
 *
 * 原混淆类: f.mf_1
 */
public class ModManagerWindow extends cx_0 {
    public final mf_1 asBridge() {
        return (mf_1) (Object) this;
    }

    public static final dl_1 cK0 = Cq0.E1(mf_1.class);
    public final fy_2 aI;
    public final lo0_0 Ek0;
    public W9[] vz0;
    public lx_2[] CB0;
    public boolean rl;
    public final ArrayList oD;
    public final xe_1 Lm;
    public final W9 zx;
    public qj0_2 nq;
    public final in_2 CH0;
    public float O5;

    public ModManagerWindow() {
        super(tw0_0.kz0(), false);
        rl = false;
        oD = dw_2.t9();
        CH0 = new in_2(100);
        Pb0(this::close);
        bD(false);
        NR platform = tw0_0.lM;
        l6_0 permission = l6_0.F0;
        if (!platform.rs(permission)) {
            Qy0.Sq().dk(10000, tw0_0.lM.L60(permission));
        }
        aI = new fy_2();
        uf("mods-panel");
        Hy(sm0_0.c0(1190));
        Lm = new xe_1(sm0_0.c0(54));
        Lm.RR(this::MC);
        xe_1 browse = new xe_1(sm0_0.c0(1191));
        browse.RR(mf_1::Qo0);
        xe_1 folder = new xe_1(sm0_0.c0(1189));
        folder.RR(mf_1::AUx);
        if (tw0_0.Xy0()) {
            folder = new xe_1(sm0_0.c0(1154));
            folder.RR(mf_1::while$);
        }
        xe_1 importMod = new xe_1(sm0_0.c0(1225));
        importMod.RR(this::oW);
        Ek0 = new lo0_0();
        Ek0.uf("scrollpane");
        update();
        zx = new W9("    ");
        zx.Xr0(sm0_0.c0(1199));
        zx.Bb(150);
        zx.k50(dw_2.gV);
        cn_0 verbose = new cn_0(sm0_0.c0(1198));
        verbose.Xr0(sm0_0.c0(1199));
        verbose.Bb(150);
        verbose.coM8(zx);
        if (tw0_0.kz0()) {
            aI.x40(aI.C7(new le0_2[]{Ek0})
                    .X20(aI.hb(new le0_2[]{browse, importMod, folder, zx, verbose})));
            aI.WQ(aI.hb(new le0_2[]{Ek0})
                    .X20(aI.C7(new le0_2[]{browse, importMod, folder}).Ze0().Kn0(zx).Kn0(verbose)));
        } else {
            aI.x40(aI.C7(new le0_2[]{Ek0})
                    .X20(aI.hb(new le0_2[]{browse, importMod, folder, zx, verbose, Lm})).qd(5));
            aI.WQ(aI.hb(new le0_2[]{Ek0})
                    .X20(aI.C7(new le0_2[]{browse, importMod, folder}).Ze0()
                            .Kn0(zx).Kn0(verbose).Ze0().Kn0(Lm)));
        }
        SL(aI);
        if (tw0_0.kz0()) {
            Lm.uf("mobile-save-icon");
            Lm.SU("");
            SL(Lm);
        }
    }

    public static void rf() {
        Qy0.yI0.dk(-1, sm0_0.c0(1226));
    }

    public static void Yr0() {
        Qy0.yI0.dk(-1, sm0_0.c0(1226));
    }

    public static void t60() {
        Qy0.yI0.dk(-1, sm0_0.c0(1138));
    }

    public static void t1(W9 selected) {
        if (!selected.ER.U20()) selected.ER.lK0(true);
        Qy0.yI0.dk(-1, sm0_0.c0(1197));
    }

    public static void A10(lx_2 mod) {
        if (!mod.Fp.isEmpty() && (mod.Fp.startsWith("http://") | mod.Fp.startsWith("https://"))) {
            lg_0.lv0.Lf(mod.Fp);
            return;
        }
        Qy0.yI0.dk(-1, sm0_0.c0(1196));
    }

    public static void while$() {
        tw0_0.lM.n2(new File(Bw0.Ka0));
    }

    public static void AUx() {
        tw0_0.lM.n2(new File("data/mods/"));
    }

    public static void Qo0() {
        lg_0.lv0.Lf("https://forums.pokemmo.com/index.php?/forum/33-client-customization/");
    }

    public final void update() {
        fy_2 content = new fy_2();
        content.uf("settings-label-area");
        I7 vertical = new I7(content);
        Hm0 horizontal = new Hm0(content);
        DI mods = DI.yt;
        mods.getClass();
        ArrayList<lx_2> available = new ArrayList<>();
        for (Object entry : mods.T) {
            lx_2 mod = (lx_2) entry;
            if (!mod.T00) available.add(mod);
        }
        CB0 = available.toArray(new lx_2[0]);
        vz0 = new W9[CB0.length];
        Arrays.sort(CB0, this::Wx0);
        for (int i = 0; i < CB0.length; i++) {
            lx_2 mod = CB0[i];
            StringBuilder text = new StringBuilder();
            text.append(new StringBuilder().append(mod.hQ).append("\n").toString());
            text.append(sm0_0.wa0(1192, mod.zm));
            text.append("\n");
            text.append(sm0_0.wa0(1193, mod.Sk0));
            cn_0 title = new cn_0(null, 0);
            title.Sk(text.toString());
            title.uf("label-settings-title");
            S70 image = new S70(64, 64, 0);
            Wr icon = mod.Zt0;
            if (icon != null) {
                icon.H8().setFilter(eb0_1.jc0, eb0_1.jc0);
                image.og.Nk(new Wr[]{mod.Zt0});
            }
            image.og.OA0 = true;
            image.og.IF = 64;
            image.og.gx0 = 64;
            title.yj0 = mod.Pc0;
            title.yB0();
            title.GH0 = 250;
            image.yj0 = mod.Pc0;
            image.yB0();
            image.GH0 = 250;
            W9 selected = new W9();
            boolean enabled = oD.contains(mod.lg0.o30());
            selected.ER.lK0(enabled);
            vz0[i] = selected;
            selected.oY(80, 30);
            selected.RR(() -> iA0(mod, selected));
            xe_1 website = new xe_1(sm0_0.c0(1195));
            website.RR(() -> A10(mod));
            xe_1 remove = new xe_1(sm0_0.c0(1228));
            remove.pw0(!mod.T00);
            remove.RR(() -> o90(mod, remove));
            if (mod.T00) {
                selected.ER.lK0(true);
                selected.RR(() -> t1(selected));
            }
            fy_2 actions = new fy_2();
            actions.uf("label-settings-value-modbuttons");
            buttonRows(actions, new le0_2[]{selected, remove, website});
            fy_2 order = new fy_2();
            order.uf("label-settings-value-modbuttons");
            if (!CB0[i].T00 && enabled) {
                xe_1 up = new xe_1("\u2191");
                up.uf("button-symbol");
                xe_1 down = new xe_1("\u2193");
                down.uf("button-symbol");
                down.RR(() -> vL0(mod));
                up.RR(() -> mx(mod));
                int index = oD.indexOf(mod.lg0.o30());
                if (index == 0 && oD.size() > 1) up.Ll(false);
                if (index + 1 >= oD.size()) down.Ll(false);
                up.g2(10, 40);
                down.g2(10, 40);
                buttonRows(order, new le0_2[]{up, down});
            }
            fy_2 row = new fy_2();
            I7 rowVertical = new I7(row);
            Hm0 rowHorizontal = new Hm0(row);
            rowVertical.X20(new Hm0(row).k5(pa0_0.Ol, image)
                    .LPt3(new le0_2[]{title, actions, order}));
            rowHorizontal.X20(row.C7(new le0_2[]{image, title, actions, order}));
            row.x40(rowVertical);
            row.WQ(rowHorizontal);
            vertical.X20(content.hb(new le0_2[]{row}));
            horizontal.X20(content.C7(new le0_2[]{row}));
        }
        if (vz0.length == 0) {
            cn_0 empty = new cn_0(null, 0);
            empty.Sk(sm0_0.c0(1230));
            vertical.X20(new I7(content).Ze0().Kn0(empty).Ze0());
            horizontal.X20(new I7(content).Ze0().Kn0(empty).Ze0());
            Ek0.so();
        }
        content.x40(vertical);
        content.WQ(horizontal);
        Ek0.AH0(content);
    }

    private static void buttonRows(fy_2 panel, le0_2[] widgets) {
        I7 vertical = new I7(panel);
        Hm0 horizontal = new Hm0(panel);
        vertical.X20(panel.C7(widgets.clone()));
        horizontal.X20(panel.hb(widgets.clone()));
        panel.x40(vertical);
        panel.WQ(horizontal);
    }

    public final void pK0() {
        String previous = dw_2.xR;
        boolean verbose = dw_2.gV;
        StringBuilder encoded = new StringBuilder();
        for (Object entry : oD) {
            String name = (String) entry;
            if (encoded.length() > 0) encoded.append("/");
            encoded.append(name);
        }
        dw_2.xR = encoded.toString();
        dw_2.Va = true;
        if (previous.equals(dw_2.xR) && verbose == zx.ER.U20()) {
            dw_2.Va = false;
            return;
        }
        rl = !previous.equals(dw_2.xR);
        dw_2.gV = zx.ER.U20();
        if (!dw_2.CY()) {
            Qy0 root = Qy0.yI0;
            if (root != null) root.dk(-1, sm0_0.c0(87));
        }
    }

    public final void Bn(Dn0 source) {
        try {
            lg_0.I70.getClass();
            zv_1 local = zv_1.kE;
            Dn0 destination = new VE("data/mods/", local).wp(source.o30());
            lg_0.I70.getClass();
            Dn0 lock = new VE("data/mods/", local).wp(new StringBuilder()
                    .append(source.o30()).append(".lock").toString());
            if (lock.os0()) {
                destination.sf();
                lock.sf();
            }
            if (destination.os0()) {
                Qy0.yI0.dk(-1, sm0_0.c0(1232));
                return;
            }
            dl_1 initialized = Qy0.Gl0;
            nq = new qj0_2(sm0_0.c0(1095));
            Qy0 root = Qy0.yI0;
            root.F9(root.fU(), nq);
            O5 = -1.0F;
            lx_2 mod = new lx_2(source, false);
            lpt5__5.hL.Com4.execute(() -> No(mod, destination, source, lock));
        } catch (Exception error) {
            cK0.info("Unable to load mod", error);
        }
    }

    public final void close() {
        if (rl) {
            NR platform = tw0_0.lM;
            platform.getClass();
            Qy0 root = Qy0.yI0;
            if (root == null) platform.Pd0();
            else root.e80(sm0_0.c0(1179), new Qu0(platform));
            return;
        }
        xe0();
    }

    public final void HP(zk0_1 context) {
        super.HP(context);
        if (nq != null && CH0.ty0()) nq.Rs0(O5);
    }

    public final void K8() {
        if (K20 == null) return;
        if (tw0_0.kz0()) {
            kh0();
        } else {
            aI.RY(510, 100);
            lt0();
            aI.lt0();
        }
        super.K8();
        if (tw0_0.kz0()) {
            Lm.lt0();
            Lm.A20(pa0_0.Mk, -68, 0);
        }
    }

    public final void No(lx_2 mod, Dn0 destination, Dn0 source, Dn0 lock) {
        mod.getClass();
        boolean usable;
        try {
            ZipInputStream zip = new ZipInputStream(mod.lg0.LpT7(2048));
            boolean parsed = false;
            ZipEntry entry;
            while ((entry = zip.getNextEntry()) != null) {
                if (!entry.getName().equals("info.xml")) continue;
                byte[] data = KT.Vc(zip, (int) entry.getSize());
                parsed = mod.yS(new ByteArrayInputStream(data));
                break;
            }
            zip.close();
            if (parsed && mod.Fr) mod.uG = true;
            usable = mod.uG;
        } catch (IOException | IllegalArgumentException error) {
            lx_2.By.error("Error validating mod {}", mod.lg0.o30(), error);
            lx_2.JF0.error("Error validating mod {}", mod.lg0.o30(), error);
            lg_0.k.lPT5(this::Gg0);
            return;
        }
        if (!usable) {
            lg_0.k.lPT5(this::Gg0);
            return;
        }
        lg_0.k.lPT5(this::PD);
        destination.Br().A20();
        if (!source.os0()) return;
        InputStream input = null;
        OutputStream output = null;
        try {
            lock.Ex0("", null);
            input = source.uf0();
            output = destination.OC0();
            long length = source.Nm0();
            byte[] buffer = new byte[1024];
            long copied = 0L;
            int count;
            while ((count = input.read(buffer)) != -1) {
                copied += count;
                O5 = (float) copied / (float) length;
                output.write(buffer, 0, count);
            }
            input.close();
            output.close();
            lock.sf();
        } catch (Exception error) {
            cK0.error("", error);
            destination.sf();
            lock.sf();
            lg_0.k.lPT5(mf_1::t60);
            return;
        } finally {
            KT.E1(input);
            KT.E1(output);
        }
        lg_0.k.lPT5(() -> Ir(destination));
    }

    public final void Gg0() {
        qj0_2 progress = nq;
        le0_2 parent = progress.K20;
        if (parent != null) parent.u3(progress);
        nq = null;
        lg_0.k.lPT5(mf_1::rf);
    }

    public final void Ir(Dn0 destination) {
        qj0_2 progress = nq;
        le0_2 parent = progress.K20;
        if (parent != null) parent.u3(progress);
        nq = null;
        if (DI.yt.Dg(destination, false)) {
            oD.add(0, destination.o30());
            rl = true;
            pK0();
            lg_0.k.lPT5(this::HL);
        } else {
            destination.sf();
            lg_0.k.lPT5(mf_1::Yr0);
        }
    }

    public final void HL() {
        Qy0.yI0.dk(-1, sm0_0.c0(1227));
        update();
    }

    public final void PD() {
        nq.bz.Sk(sm0_0.c0(1139));
    }

    public final void mx(lx_2 mod) {
        int index = oD.indexOf(mod.lg0.o30());
        if (index > 0) Collections.swap(oD, index - 1, index);
        update();
    }

    public final void vL0(lx_2 mod) {
        int index = oD.indexOf(mod.lg0.o30());
        int next = index + 1;
        if (next < oD.size()) Collections.swap(oD, index, next);
        update();
    }

    public final void o90(lx_2 mod, xe_1 button) {
        Qy0.yI0.sr0(new lpt3__4(sm0_0.wa0(1229, mod.hQ), () -> Rq0(mod), button));
    }

    public final void Rq0(lx_2 mod) {
        DI.yt.T.remove(mod);
        KT.E1(mod.lP);
        mod.lP = null;
        if (mod.lg0.RL()) mod.lg0.Jq();
        else mod.lg0.sf();
        rl = true;
        update();
    }

    public final void iA0(lx_2 mod, W9 selected) {
        if (mod.T00) return;
        if (selected.ER.U20()) oD.add(0, mod.lg0.o30());
        else oD.remove(mod.lg0.o30());
        update();
    }

    public final int Wx0(lx_2 first, lx_2 second) {
        boolean firstBuiltIn = first.T00;
        boolean secondBuiltIn = second.T00;
        if (firstBuiltIn != secondBuiltIn) return (secondBuiltIn ? 1 : 0) - (firstBuiltIn ? 1 : 0);
        boolean firstEnabled = oD.contains(first.lg0.o30());
        boolean secondEnabled = oD.contains(second.lg0.o30());
        if (firstEnabled != secondEnabled) return (secondEnabled ? 1 : 0) - (firstEnabled ? 1 : 0);
        if (!firstEnabled) return second.lg0.o30().compareTo(first.lg0.o30());
        return oD.indexOf(first.lg0.o30()) - oD.indexOf(second.lg0.o30());
    }

    public final void oW() {
        tw0_0.lM.mJ(this::ye0, new String[]{"mod", "zip"});
    }

    public final boolean ye0(Dn0 file) {
        Bn(file);
        return false;
    }

    public final void MC() {
        pK0();
        close();
    }
}
