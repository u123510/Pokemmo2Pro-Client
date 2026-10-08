package cn.pokemmo.rom;

import f.*;
import cn.pokemmo.rom.gba.GbaRom;
import cn.pokemmo.rom.nds.base.AbstractNdsRom;
import cn.pokemmo.rom.nds.bw.BlackWhiteRom;
import cn.pokemmo.rom.nds.dppt.PlatinumRom;
import cn.pokemmo.rom.nds.hgss.HeartGoldSoulSilverRom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * 全局 ROM 总调度管理器
 * 负责扫描、识别、加载与管理 PokeMMO 的全部 5 款官方核心 ROM：
 * - 火红/叶绿 (GBA)
 * - 绿宝石 (GBA)
 * - 黑/白 (NDS BW)
 * - 白金 (NDS DPPt)
 * - 心金/魂银 (NDS HGSS)
 *
 * 原混淆类: f.aa0_2
 */
public class RomManager {
    public static final dl_1 LOGGER = Cq0.E1(RomManager.class);
    public static final dl_1 ga0 = LOGGER;

    // 核心卡带实例
    public qa0_1 YB0;
    public qa0_1 LPT2;
    public qa0_1[] LK0;
    public l50_0[] Yi;
    public UY t1;
    public Ts nC0;
    public nj0_0 Qz0;
    public boolean zd;
    public byte[] Nl0;

    public RomManager() {
        this.YB0 = null;
        this.LPT2 = null;
        this.LK0 = new qa0_1[0];
        this.Yi = new l50_0[0];
        this.t1 = null;
        this.nC0 = null;
        this.Qz0 = null;
        this.zd = false;
        this.Nl0 = new byte[0];
    }

    public final aa0_2 asBridge() {
        return ((Object) this) instanceof aa0_2 ? (aa0_2) (Object) this : null;
    }

    public final GbaRom getFireRedRom() {
        return this.YB0;
    }

    public final GbaRom getEmeraldRom() {
        return this.LPT2;
    }

    public final GbaRom[] getGbaRoms() {
        return this.LK0;
    }

    public final AbstractNdsRom[] getNdsRoms() {
        return this.Yi;
    }

    public final HeartGoldSoulSilverRom getHgssRom() {
        return this.t1;
    }

    public final PlatinumRom getPlatinumRom() {
        return this.nC0;
    }

    public final BlackWhiteRom getBlackWhiteRom() {
        return this.Qz0;
    }

    public final boolean hasMissingRequiredRom() {
        return this.zd;
    }

    public final byte[] getLoadedRegions() {
        return this.Nl0;
    }

    public final boolean isRegionLoaded(byte regionId) {
        return cOM4(regionId);
    }

    public final GbaRom getGbaRomByType(byte type) {
        return Pm0(type);
    }

    public final AbstractNdsRom getNdsRomByRegion(byte region) {
        return AB(region);
    }

    public static void ar(es_1 v0, Dn0 v1) {
        String path = v1.l00().getAbsolutePath().replaceAll("_import", "");
        if (v0.j4(path, false)) {
            v1.jE0(new Dn0(path));
        } else {
            v1.sf();
        }
    }

    public static Dn0 Ds(Dn0 v0) {
        return new Dn0(v0.l00().getAbsolutePath());
    }

    public static boolean lF(Exception e) {
        Throwable t = e;
        while (t != null) {
            if (OutOfMemoryError.class.isInstance(t)) {
                return true;
            }
            if ("Map failed".equalsIgnoreCase(t.getMessage())) {
                return true;
            }
            t = t.getCause();
        }
        return false;
    }

    public final void nx(VE v1) {
        es_1 v2 = new es_1();
        v2.G6(new String[]{dw_2.e8, dw_2.COm9, dw_2.zS, dw_2.cx0, dw_2.b1}, 0, 5);
        Arrays.stream(v1.gH0("_import")).map(RomManager::Ds).forEach(dn -> ar(v2, dn));
        ArrayList potentialFiles = new ArrayList();
        if (!dw_2.COm9.isEmpty()) {
            potentialFiles.add(Zd.r70(dw_2.COm9));
        }
        if (!dw_2.e8.isEmpty()) {
            potentialFiles.add(Zd.r70(dw_2.e8));
        }
        if (!dw_2.zS.isEmpty()) {
            potentialFiles.add(Zd.r70(dw_2.zS));
        }
        if (!dw_2.cx0.isEmpty()) {
            potentialFiles.add(Zd.r70(dw_2.cx0));
        }
        if (!dw_2.b1.isEmpty()) {
            potentialFiles.add(Zd.r70(dw_2.b1));
        }
        if (!ea0_1.kF0) {
            if (!v1.os0()) {
                v1.A20();
            }
            if (v1.os0() && v1.RL()) {
                potentialFiles.addAll(Arrays.asList(v1.Ce0()));
            }
        }
        int initialCount = potentialFiles.size();
        potentialFiles.removeIf(Objects::isNull);
        ga0.info("Rom potential count {} ({})", potentialFiles.size(), initialCount - potentialFiles.size());
        for (Object obj : potentialFiles) {
            Dn0 file = (Dn0) obj;
            if (file == null || !file.os0() || file.RL() || file.l00() == null) {
                continue;
            }
            if ("importing.tmp".equals(file.o30())) {
                continue;
            }
            ga0.info("Possible rom {} (size: {} MB) {}", file.o30(), file.Nm0() / 1048576L, file.getClass());
            if (this.YB0 == null || this.LPT2 == null) {
                try {
                    if (Boolean.FALSE.booleanValue()) throw new IOException();
                    qa0_1 qa = new qa0_1(file);
                    if (qa.rt0() == 0) {
                        if (this.YB0 == null && qa.EZ != null) {
                            ga0.info("Loaded {} as gba rom.", qa.iq0 + " v1." + ((int) qa.I40));
                            this.YB0 = qa;
                            continue;
                        }
                    } else if (qa.rt0() == 1) {
                        if (this.LPT2 == null) {
                            ga0.info("Loaded {} as extended gba rom.", qa.iq0 + " v1." + ((int) qa.I40));
                            this.LPT2 = qa;
                            continue;
                        }
                    }
                } catch (xk0_1 ignored) {
                } catch (IOException e) {
                    ga0.warn("Could not load {} as a gba rom because: {}", file.el(), e.getMessage(), e);
                    if (lF(e)) {
                        this.zd = true;
                        Iu0.Yz();
                        return;
                    }
                } catch (Exception e) {
                    ga0.warn("Could not load {} as a gba rom because: {}", file.el(), e.getMessage(), e);
                }
            }
            if (file.Nm0() > 2048L) {
                try {
                    cp_0 cp = new cp_0(file);
                    if (this.Qz0 == null && Arrays.asList(nj0_0.tN).contains(cp.ie)) {
                        this.Qz0 = new nj0_0(file);
                    }
                    if (this.t1 == null && Arrays.asList(UY.qk0).contains(cp.ie)) {
                        this.t1 = new UY(file);
                    }
                    if (this.nC0 == null && Arrays.asList(Ts.yi).contains(cp.ie)) {
                        this.nC0 = new Ts(file);
                    }
                } catch (xk0_1 ignored) {
                } catch (Exception e) {
                    ga0.warn("Could not load {} as a nds rom because: {}", file.el(), e.getMessage(), e);
                    if (lF(e)) {
                        this.zd = true;
                        Iu0.Yz();
                        return;
                    }
                }
            }
        }
        if (this.Qz0 == null) {
            this.zd = true;
            return;
        }
        ArrayList gbaList = new ArrayList();
        if (this.YB0 != null) {
            gbaList.add(this.YB0);
        }
        if (this.LPT2 != null) {
            gbaList.add(this.LPT2);
        }
        this.LK0 = (qa0_1[]) gbaList.toArray(new qa0_1[0]);

        ArrayList ndsList = new ArrayList();
        if (this.Qz0 != null) {
            ndsList.add(this.Qz0);
        }
        if (this.nC0 != null) {
            ndsList.add(this.nC0);
        }
        if (this.t1 != null) {
            ndsList.add(this.t1);
        }
        this.Yi = (l50_0[]) ndsList.toArray(new l50_0[0]);

        Iq0 iq = new Iq0();
        for (qa0_1 qa : this.LK0) {
            iq.YE0(qa.rt0());
        }
        for (l50_0 nds : this.Yi) {
            iq.YE0(nds.Tz());
        }
        byte[] nl0 = new byte[iq.Rv];
        byte[] mo = iq.MO;
        byte[] ut = iq.Ut;
        int len = ut.length;
        int i5 = 0;
        while (true) {
            len--;
            if (len <= 0) {
                break;
            }
            if (ut[len] == 1) {
                nl0[i5++] = mo[len];
            }
        }
        this.Nl0 = nl0;
    }

    public final boolean cOM4(byte b) {
        if (b == 10) {
            return true;
        }
        switch (b) {
            case 0:
                return this.YB0 != null;
            case 1:
                return this.LPT2 != null;
            case 2:
                return this.Qz0 != null;
            case 3:
                return this.nC0 != null;
            case 4:
                return this.t1 != null;
            default:
                return false;
        }
    }

    public final qa0_1 Pm0(byte b) {
        qa0_1 yb = this.YB0;
        if (yb != null && yb.rt0() == b) {
            return this.YB0;
        }
        qa0_1 lpt = this.LPT2;
        if (lpt != null && lpt.rt0() == b) {
            return this.LPT2;
        }
        return null;
    }

    public final l50_0 AB(byte b) {
        if (this.Qz0 != null && b == 2) {
            return this.Qz0;
        }
        if (this.nC0 != null && b == 3) {
            return this.nC0;
        }
        if (this.t1 != null && b == 4) {
            return this.t1;
        }
        return null;
    }

    public final qa0_1[] PP() {
        return this.LK0;
    }

    public final l50_0[] SW() {
        return this.Yi;
    }
}
