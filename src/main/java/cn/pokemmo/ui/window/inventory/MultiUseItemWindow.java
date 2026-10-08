package cn.pokemmo.ui.window.inventory;

import f.*;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * 批量使用道具/增减使用弹窗
 *
 * 原混淆类: f.VK
 */
public class MultiUseItemWindow extends cx_0 implements tr_1  {
    public final VK asBridge() {
        return (VK) (Object) this;
    }

    public static final DecimalFormat Cy = new DecimalFormat("#0.0");
    public final Gh0 sa;
    public final K5 K20;
    public final VU M8;
    public mc0_1 Bk0;
    public cn_0 ZD;
    public fy_2 wd;
    public boolean jH0;
    public xe_1[][] lq0;
    public int I;
    public int it0;
    public final byte kH0;
    public final vy_2 XL0;

    public MultiUseItemWindow(vy_2 parent, CH0 itemId, VU target, byte targetIndex) {
        super(false, false);
        this.jH0 = false;
        this.XL0 = parent;
        this.K20 = tw0_0.rl.Ju().zg(itemId);
        this.M8 = target;
        this.kH0 = targetIndex;
        this.Pb0(this::close);
        dg0_0 targetDisplay = new dg0_0();
        if (target != null) {
            targetDisplay.Db(target);
            targetDisplay.Mj0(false);
            targetDisplay.Xr0(lb0_2.FP(target));
        }
        f10_0 itemDisplay = new f10_0();
        this.sa = new Gh0();
        if (this.K20 == null) {
            this.close();
            Qy0.Sq().jE(sm0_0.c0(6003));
            return;
        }
        this.Bk0 = this.K20.LW();
        int maximumUses = this.d8();
        if (maximumUses < 1) {
            this.close();
            Qy0.Sq().jE(sm0_0.c0(6005));
            return;
        }
        short ownedCount = this.K20.I7();
        boolean requiresConfirmation = this.Bk0.AK() > 0
            && tw0_0.rl.hz().IL0(tw0_0.rl.ex().Hr()) != 100;
        if ((maximumUses == 1 || ownedCount == 1) && !requiresConfirmation) {
            this.sa.case$(1);
            this.Ef0(true);
            return;
        }
        if (tw0_0.kz0()) {
            this.uf("multi-use-item");
            this.sa.uf("mobile-valueadjuster-50");
        } else {
            this.uf("seed-plant-dialog");
            this.Hy(this.K20.Fh0());
        }
        itemDisplay.UR(this.K20);
        this.sa.ke(Math.min(ownedCount, maximumUses));
        this.ZD = new cn_0(this.Gc0());
        this.sa.Da0(() -> this.ZD.Sk(this.Gc0()));
        this.wd = new fy_2();
        xe_1 confirm = new xe_1(sm0_0.c0(1410));
        confirm.RR(() -> this.Ef0(false));
        xe_1 cancel = new xe_1(sm0_0.c0(nf0_0.Bq0));
        cancel.RR(this::close);
        xe_1 maximum = new xe_1(sm0_0.c0(8118));
        maximum.RR(() -> this.sa.case$(this.d8()));
        this.lq0 = new xe_1[][]{
            new xe_1[]{this.sa.aB0, confirm, cancel},
            new xe_1[]{this.sa.BA0, confirm, cancel},
            new xe_1[]{maximum, confirm, cancel}
        };
        this.I = 1;
        this.it0 = 1;
        if (target != null) {
            cn_0 heading = new cn_0(sm0_0.Bx(8045, new String[]{this.K20.Fh0(), target.na0()}));
            ya_1 flow = this.wd.H10().qd(15);
            flow = bo_0.ph0(this.wd.lo0(), new le0_2[]{targetDisplay, itemDisplay}, flow, 15);
            flow = bo_0.ph0(this.wd.lo0(), new le0_2[]{heading}, flow, 15);
            flow = bo_0.ph0(this.wd.lo0(), new le0_2[]{this.sa, maximum}, flow, 15);
            this.wd.x40(bo_0.ph0(this.wd.lo0(), new le0_2[]{this.ZD}, flow, 15)
                .X20(this.wd.H10().LPt3(new le0_2[]{confirm, cancel})).Ze0());
            this.wd.WQ(this.wd.lo0()
                .X20(this.wd.H10().Ze0().Kn0(targetDisplay).Ze0().Kn0(itemDisplay).Ze0())
                .X20(this.wd.H10().Ze0().LPt3(new le0_2[]{heading}).Ze0())
                .X20(this.wd.H10().Ze0().LPt3(new le0_2[]{this.sa, maximum}).Ze0())
                .X20(this.wd.H10().Ze0().LPt3(new le0_2[]{this.ZD}).Ze0())
                .X20(this.wd.lo0().Kn0(confirm).Kn0(cancel)));
        } else {
            cn_0 heading = new cn_0(sm0_0.wa0(8046, this.K20.Fh0()));
            ya_1 flow = this.wd.H10().qd(15);
            flow = bo_0.ph0(this.wd.lo0(), new le0_2[]{itemDisplay}, flow, 15);
            flow = bo_0.ph0(this.wd.lo0(), new le0_2[]{heading}, flow, 15);
            flow = bo_0.ph0(this.wd.lo0(), new le0_2[]{this.sa, maximum}, flow, 15);
            this.wd.x40(bo_0.ph0(this.wd.lo0(), new le0_2[]{this.ZD}, flow, 15)
                .X20(this.wd.H10().LPt3(new le0_2[]{confirm, cancel})).Ze0());
            this.wd.WQ(this.wd.lo0()
                .X20(this.wd.H10().Ze0().Kn0(itemDisplay).Ze0())
                .X20(this.wd.H10().Ze0().LPt3(new le0_2[]{heading}).Ze0())
                .X20(this.wd.H10().Ze0().LPt3(new le0_2[]{this.sa, maximum}).Ze0())
                .X20(this.wd.H10().Ze0().LPt3(new le0_2[]{this.ZD}).Ze0())
                .X20(this.wd.lo0().Kn0(confirm).Kn0(cancel)));
        }
        this.SL(this.wd);
        this.jH0 = true;
        lpt6__0.v90(this.wv());
    }

    public final void K8() {
        if (this.wd == null) {
            super.K8();
            return;
        }
        lpt6__0.v90(this.wd);
        if (tw0_0.kz0()) {
            this.kh0();
            this.wd.lt0();
            this.wd.vf(pa0_0.Ol);
        } else {
            super.K8();
        }
    }

    public final boolean nd0(i70_0 input) {
        if (E00.ZU(input.zu) && input.iT()) {
            int key = input.finally$;
            if (rp_0.I90 != null && rp_0.I90.Ov(key)) {
                this.moveSelection(this.it0 - 1, this.I);
                return true;
            }
            if (rp_0.Ni != null && rp_0.Ni.Ov(key)) {
                this.moveSelection(this.it0 + 1, this.I);
                return true;
            }
            if (rp_0.kC0 != null && rp_0.kC0.Ov(key)) {
                this.moveSelection(this.it0, this.I - 1);
                return true;
            }
            if (rp_0.synchronized$ != null && rp_0.synchronized$.Ov(key)) {
                this.moveSelection(this.it0, this.I + 1);
                return true;
            }
            if (rp_0.sJ0 != null && rp_0.sJ0.Ov(key)) {
                xe_1 selected = this.wv();
                if (selected != null) a7_0.bH(selected.ER.Fc0);
                return true;
            }
            if (rp_0.nK0 != null && rp_0.nK0.Ov(key)) {
                this.close();
                return true;
            }
        }
        return super.nd0(input);
    }

    private void moveSelection(int row, int column) {
        xe_1 selected = this.YW(row, column);
        if (selected != null) {
            this.it0 = row;
            this.I = column;
            lpt6__0.v90(selected);
        }
    }

    public final void close() {
        BU manager = BU.T50;
        VK dialog = manager.m2;
        if (dialog != null) {
            dialog.xe0();
            manager.m2 = null;
        }
        if (this.XL0 != null) this.XL0.ew0();
    }

    public final xe_1 wv() {
        return this.YW(this.it0, this.I);
    }

    public final xe_1 YW(int row, int column) {
        if (row < 0 || row >= this.lq0.length || column < 0 || column >= this.lq0[row].length) {
            return null;
        }
        return this.lq0[row][column];
    }

    public final void Ef0(boolean consumeSingle) {
        CH0 targetId = this.M8 == null ? CH0.j1 : this.M8.pu;
        tw0_0.rl.I3(this.K20.nn.wQ, this.K20.nn.Br, targetId, (short)this.sa.eB0,
            this.kH0, (byte)0, consumeSingle);
        this.close();
    }

    public final int d8() {
        mc0_1 item = this.K20.cL;
        int minimum = 0;
        short itemType = X4.gA0(item.Z8);
        gc_2 stat = item.dp0;
        short happiness = item.Yl;
        int experience = item.Ye0;
        byte ev = item.ia0;
        int result;
        if (stat != null) {
            short currentTotal = this.M8.I8.Vr(-1);
            short change = item.nn;
            short currentStat = this.M8.I8.ZY(stat);
            if (change > 0) {
                int toTotalCap = (int)Math.ceil((510 - currentTotal) / (double)change);
                if (toTotalCap > 0) minimum = toTotalCap;
                result = (int)Math.ceil((252 - currentStat) / (double)change);
                if (minimum <= result) return minimum;
            } else {
                result = (int)Math.ceil(currentStat / (double)(-change));
                if (result <= 0) return minimum;
            }
            return result;
        }
        if (happiness != 0) {
            byte value = this.M8.I8.wj;
            if (value >= 100) return 1;
            return (int)Math.ceil((100 - value) / (double)happiness);
        }
        if (experience != 0) {
            byte level = tw0_0.rl.yh0.IL0(tw0_0.rl.k0.kC);
            if (level < 0) level = 0;
            else if (level > 99) level = 99;
            return (int)Math.ceil((this.M8.f60.yw.Mu0(level + 1) - this.M8.I8.Lr0) / (double)experience);
        }
        if (itemType == 1194) {
            byte ppUps = tw0_0.rl.k0.hL0;
            return ppUps >= 8 ? 0 : 8 - ppUps;
        }
        if (itemType == 1120) {
            byte rareCandies = tw0_0.rl.k0.Ta;
            return rareCandies >= 20 ? 0 : 20 - rareCandies;
        }
        short hpChange = item.tX;
        if (hpChange > 0 || item.Zp != 0) {
            if (this.M8.I8.H1 != 0 && item.Zp != 0) minimum = 1;
            if (hpChange > 0) {
                if (item.CJ0) hpChange = (short)(this.M8.Ps.BL0(gc_2.RC) * hpChange / 100);
                int uses = (int)Math.ceil((this.M8.Ps.BL0(gc_2.RC) - this.M8.I8.VD) / (double)hpChange);
                if (uses >= minimum) minimum = Math.min(uses, 9999);
            }
            return (short)minimum;
        }
        if (ev > 0) {
            if (item.dB0(false) == JU.es) {
                for (int index = 0; index < this.M8.I8.Gu.length; index++) {
                    vk0_1 species = (vk0_1)ec0_2.Sx().f4.f5(this.M8.I8.Gu[index]);
                    int uses = (int)Math.ceil((this.M8.I8.Vd(species.Gn(false), index)
                        - this.M8.I8.TC0[index]) / (double)ev);
                    uses = Math.max(minimum, Math.min(uses, 9999));
                    if ((short)uses > minimum) minimum = (short)uses;
                }
                return minimum;
            }
            if (item.dB0(false) != JU.hD) return 1;
            vk0_1 species = (vk0_1)ec0_2.Sx().f4.f5(this.M8.I8.Gu[this.kH0]);
            int uses = (int)Math.ceil((this.M8.I8.Vd(species.Gn(false), this.kH0)
                - this.M8.I8.TC0[this.kH0]) / (double)ev);
            if (uses < 0) uses = minimum;
            else if (uses > 9999) uses = 9999;
            result = (short)uses;
            return result <= 0 ? minimum : result;
        }
        short friendshipChange = item.Yk0;
        if (friendshipChange == 0) return minimum;
        int currentFriendship = this.M8.I8.yb.Eq == item.sE0 ? this.M8.I8.bm : 255 - this.M8.I8.bm;
        result = (int)Math.ceil(currentFriendship / (double)friendshipChange);
        return result <= 0 ? minimum : result;
    }

    public final String Gc0() {
        StringBuilder result = new StringBuilder();
        int count = this.sa.eB0;
        mc0_1 item = this.K20.cL;
        gc_2 stat = this.Bk0.dp0;
        if (stat != null) {
            int statValue = this.M8.I8.ZY(stat);
            int change = 510 - this.M8.I8.Vr(-1);
            int requested = this.Bk0.nn * count;
            if (requested < -this.M8.I8.Vr(-1)) change = -this.M8.I8.Vr(-1);
            else if (requested <= change) change = requested;
            if (change > 0) statValue = 252 - statValue;
            change = Math.max(-statValue, Math.min(change, statValue));
            result.append("\n").append(sm0_0.c0(stat.CoM2 + 1817)).append(change > 0 ? " +" : " ").append(change);
        }
        int experience = this.Bk0.Ye0 * count;
        if (experience != 0) {
            q1_0 growth = this.M8.f60.yw;
            byte currentLevel = tw0_0.rl.yh0.IL0(tw0_0.rl.k0.kC);
            if (currentLevel < 0) currentLevel = 0;
            else if (currentLevel > 100) currentLevel = 100;
            int nextLevelExperience = growth.Mu0(currentLevel + 1);
            int currentExperience = this.M8.I8.Lr0;
            int remaining = nextLevelExperience - currentExperience;
            int granted = experience < 0 ? 0 : Math.min(experience, remaining);
            currentExperience += granted;
            int level = 100;
            while (level > 0 && growth.Mu0(level) > currentExperience) level--;
            if (level <= 0) level = 1;
            int levelsGained = level - this.M8.I8.wj;
            levelsGained = Math.max(0, Math.min(levelsGained, currentLevel - this.M8.I8.wj));
            result.append("\n").append(sm0_0.wa0(101422, NumberFormat.getInstance().format(granted)));
            if (levelsGained > 0) result.append("\n").append(sm0_0.wa0(101423, Integer.toString(levelsGained)));
            if (currentLevel < 100 && remaining < experience) result.append("\n").append(sm0_0.c0(101424));
        }
        short itemType = X4.gA0(this.Bk0.Z8);
        if (itemType == 1194) result.append("\n").append(sm0_0.wa0(4020, Integer.toString(count * 3)));
        else if (itemType == 1120) result.append("\n").append(sm0_0.wa0(4021, Integer.toString(count * 60)));
        short hpChange = item.tX;
        if (hpChange > 0 || item.Zp != 0) {
            if (hpChange > 0) {
                int maximum = this.M8.Ps.BL0(gc_2.RC);
                if (item.CJ0) hpChange = (short)(maximum * hpChange / 100);
                int healed = Math.max(0, Math.min(hpChange * count, maximum - this.M8.I8.VD));
                result.append(sm0_0.wa0(1426, "+" + healed));
            }
            if (this.M8.I8.H1 != 0 && item.Zp != 0) result.append("\n").append(sm0_0.c0(3523));
        }
        short friendshipChange = this.Bk0.Yk0;
        if (friendshipChange != 0) {
            CE target = this.M8.I8;
            if (target.yb.Eq == this.Bk0.sE0) friendshipChange = (short)-friendshipChange;
            int value = friendshipChange > 0 ? 255 - target.bm : target.bm;
            value = Math.max(-value, Math.min(friendshipChange * count, value));
            if (value < 1) value *= -1;
            result.append("\n").append(sm0_0.c0(1811)).append(friendshipChange > 0 ? " +" : " -")
                .append(Cy.format(value / 255.0 * 100.0)).append('%');
        }
        return result.toString();
    }

    public final void a2() {
        this.sa.case$(this.d8());
    }

    public final void N50() {
        this.Ef0(false);
    }

    public final void iZ() {
        this.ZD.Sk(this.Gc0());
    }
}
