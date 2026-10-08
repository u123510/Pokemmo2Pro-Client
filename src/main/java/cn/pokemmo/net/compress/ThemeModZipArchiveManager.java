package cn.pokemmo.net.compress;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ThemeModZipArchiveManager {
    public static final dl_1 BL0 = Cq0.E1(ThemeModZipArchiveManager.class);
    public static final dl_1 FL0 = Cq0.t00("mod");
    public static final DI yt = new DI();
    public final ArrayList T;
    public final ArrayList Xp0;

    public ThemeModZipArchiveManager() {
        this.T = new ArrayList();
        this.Xp0 = new ArrayList();
    }

    public final void nL0() {
        BL0.info("Client Theme Revision: {}", 3);
        FL0.info("Client Theme Revision: {}", 3);

        lg_0.I70.getClass();
        VE modsDir = new VE("data/mods/", zv_1.kE);
        es_1 roots = new es_1();

        lg_0.I70.getClass();
        VE resourcesZip = new VE("data/resources.zip", zv_1.tt0);
        if (!tw0_0.xj0() && resourcesZip.os0()) {
            roots.Ue0(resourcesZip);
        } else {
            lg_0.I70.getClass();
            roots.Ue0(new VE("data/resources/", zv_1.tt0));
        }

        I2 iterator = roots.ZD();
        while (iterator.hasNext()) {
            this.Dg((Dn0) iterator.next(), true);
        }

        if (!modsDir.os0()) {
            modsDir.A20();
        }
        if (!modsDir.os0()) {
            return;
        }

        roots.clear();
        Dn0[] locks = modsDir.gH0(".lock");
        for (Dn0 lock : locks) {
            lock.xt(lock.R20()).sf();
            lock.sf();
        }

        Dn0[] mods = modsDir.Ce0();
        roots.G6(mods, 0, mods.length);
        iterator = roots.ZD();
        while (iterator.hasNext()) {
            this.Dg((Dn0) iterator.next(), false);
        }
    }

    public final boolean Dg(Dn0 file, boolean builtIn) {
        String name = file.o30().toLowerCase(Locale.ENGLISH);
        if (!name.endsWith(".zip") && !name.endsWith(".mod") && !file.RL()) {
            return false;
        }

        ThemeModZipArchiveManager.BL0.info("Possible mod {}", file.o30());
        ThemeModZipArchiveManager.FL0.info("Possible mod {}", file.o30());
        lx_2 mod = new lx_2(file, builtIn);

        try {
            if (mod.lg0.RL()) {
                mod.ZV = mod.lg0;
                mod.go0 = new la0_1(mod.lg0.el() + File.pathSeparator);
            } else {
                byte[] header = new byte[4];
                mod.lg0.yM(header, 4);
                if (header[0] != 80 || header[1] != 75 || header[2] != 3 || header[3] != 4) {
                    return this.failMod(mod);
                }

                ZipFile zipFile = new ZipFile(mod.lg0.l00());
                mod.lP = zipFile;
                c80_0 root = new c80_0(zipFile, "");
                mod.ZV = root;
                Enumeration entries = root.rK.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry entry = (ZipEntry) entries.nextElement();
                    if (entry.isDirectory()) {
                        break;
                    }
                    if (entry.getName().contains("/")) {
                        lx_2.By.error("Mod {} has flattened zip structure, which is unsupported", mod.lg0.o30());
                        lx_2.JF0.error("Mod {} has flattened zip structure, which is unsupported", mod.lg0.o30());
                        return this.failMod(mod);
                    }
                }
                mod.go0 = new Ek0(mod.lP);
            }

            Dn0 info = mod.ZV.wp("info.xml");
            if (info.os0() && mod.yS(info.uf0())) {
                Dn0 icon = mod.ZV.wp("icon.png");
                if (icon.os0()) {
                    mod.Zt0 = new Wr(new H70(new ro_1(icon)));
                }
                if (mod.jv() && mod.GD0() && mod.com1() && mod.Fr) {
                    mod.uG = true;
                }
            }
        } catch (Exception ex) {
            lx_2.By.error("Error loading mod {}", mod.lg0.o30(), ex);
            lx_2.JF0.error("Error loading mod {}", mod.lg0.o30(), ex);
        }

        if (mod.uG) {
            ThemeModZipArchiveManager.BL0.info("Loaded available mod '{}'", mod.hQ);
            ThemeModZipArchiveManager.FL0.info("Loaded available mod '{}'", mod.hQ);
            this.T.add(mod);
            return true;
        }

        return this.failMod(mod);
    }

    private boolean failMod(lx_2 mod) {
        if (tw0_0.Xy0()) {
            KT.E1(mod.lP);
            mod.lP = null;
            if (mod.lg0.RL()) {
                mod.lg0.Jq();
            } else {
                mod.lg0.sf();
            }
        }
        return false;
    }

    public final void tK0() {
        tw0_0.aB.qZ();
        ArrayList enabledMods = dw_2.t9();

        for (Object value : this.T) {
            lx_2 mod = (lx_2) value;
            if (mod.T00) {
                mod.sE();
            } else if (!enabledMods.contains(mod.lg0.o30())) {
                FL0.info("{} is disabled, skipping.", mod.lg0.o30());
            }
        }

        this.Xp0.clear();
        ArrayList failed = new ArrayList();
        Iterator iterator = enabledMods.iterator();
        while (iterator.hasNext()) {
            String enabledName = (String) iterator.next();
            for (Object value : this.T) {
                lx_2 mod = (lx_2) value;
                if (!mod.lg0.o30().equals(enabledName) || !enabledMods.contains(mod.lg0.o30())) {
                    continue;
                }
                BL0.info("{} is enabled, applying.", mod.lg0.o30());
                FL0.info("{} is enabled, applying.", mod.lg0.o30());
                if (!mod.sE()) {
                    BL0.warn("{} failed to apply.", mod.lg0.o30());
                    FL0.warn("{} failed to apply.", mod.lg0.o30());
                    failed.add(mod.lg0.o30());
                    continue;
                }
                BL0.info("{} applied.", mod.lg0.o30());
                FL0.info("{} applied.", mod.lg0.o30());
                tw0_0.aB.j90.add(0, mod.ZV);
                this.Xp0.add(mod);
            }
        }

        if (!failed.isEmpty()) {
            enabledMods.removeAll((Collection) failed);
            StringBuilder builder = new StringBuilder();
            for (Object value : enabledMods) {
                if (builder.length() > 0) {
                    builder.append("/");
                }
                builder.append((String) value);
            }
            dw_2.xR = builder.toString();
            dw_2.Va = true;
        }
    }
}
