package cn.pokemmo.ui.window.misc;

import f.*;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import com.badlogic.gdx.utils.BufferUtils;

/**
 * 玩家HUD状态悬浮窗
 *
 * 原混淆类: f.gc0_1
 */
public class TrainerHudWindow extends R90 {
    public static final DecimalFormat BJ0;
    public final ka_1 AB;
    public final ka_1 super$;
    public String i80;
    public int u4;
    public int C6;
    public DayOfWeek yr0;
    public final cn_0[] Am0;
    public final ka_1 Do0;
    public final ka_1 bE0;
    public final ka_1 oq0;
    public final ka_1 Gn;
    public final fy_2 Qf;
    public final ka_1 Jg0;
    public final ka_1[] Ro0;
    public int Yu0;
    public long jX;

    static {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        BJ0 = new DecimalFormat("$###,###.###", decimalFormatSymbols);
    }

    public TrainerHudWindow() {
        super();
        this.Yu0 = 0;
        uf("trainer-hud");
        bD(false);
        Oq0(false);
        ff0(1);
        int i1 = 6;
        this.AB = new ka_1("$0");
        this.super$ = new ka_1("00:00");
        this.Am0 = new cn_0[6];
        for (int i2 = 0; i2 < this.Am0.length; i2++) {
            this.Am0[i2] = new ka_1("");
            this.Am0[i2].Bb(150);
        }
        this.Do0 = new ka_1("");
        this.bE0 = new ka_1("");
        this.oq0 = new ka_1("");
        this.Gn = new ka_1("");
        ka_1 labelMoney = new ka_1();
        labelMoney.uf("label-money");
        this.Jg0 = new ka_1();
        this.Jg0.uf("label-time");
        ka_1 labelLocation = new ka_1();
        labelLocation.uf("label-location");
        this.Ro0 = new ka_1[i1];
        for (int i3 = 0; i3 < this.Ro0.length; i3++) {
            this.Ro0[i3] = new ka_1();
            this.Ro0[i3].uf("label-repel");
        }
        Q0 labelPosition = new Q0();
        labelPosition.uf("label-position");
        ka_1 labelRam = new ka_1();
        labelRam.uf("label-ram");
        ka_1 labelUptime = new ka_1();
        labelUptime.uf("label-uptime");
        this.Qf = new fy_2();
        this.Qf.uf("content");
        this.Qf.Oq0(false);
        if (tw0_0.kz0()) {
            this.Qf.WQ(this.Qf.H10().Xq(new ya_1[] {
                this.Qf.hb(new le0_2[] { labelLocation, labelMoney, this.Jg0, this.Ro0[0] }),
                this.Qf.hb(new le0_2[] { this.Do0, this.AB, this.super$, this.Am0[0] }),
                this.Qf.hb(new le0_2[] { this.Ro0[1], this.Ro0[2], this.Ro0[3], this.Ro0[4] }),
                this.Qf.hb(new le0_2[] { this.Am0[1], this.Am0[2], this.Am0[3], this.Am0[4] })
            }));
            this.Qf.x40(this.Qf.H10().Xq(new ya_1[] {
                this.Qf.hb(new le0_2[] { labelLocation, this.Do0, this.Ro0[1], this.Am0[1] }),
                this.Qf.hb(new le0_2[] { labelMoney, this.AB, this.Ro0[2], this.Am0[2] }),
                this.Qf.hb(new le0_2[] { this.Jg0, this.super$, this.Ro0[3], this.Am0[3] }),
                this.Qf.hb(new le0_2[] { this.Ro0[0], this.Am0[0], this.Ro0[4], this.Am0[4] })
            }));
        } else if (tw0_0.ng()) {
            this.Qf.WQ(this.Qf.H10().Xq(new ya_1[] {
                this.Qf.hb(new le0_2[] {
                    labelLocation, labelMoney, this.Jg0,
                    this.Ro0[0], this.Ro0[1], this.Ro0[2], this.Ro0[3], this.Ro0[4], this.Ro0[5],
                    labelPosition, labelRam, labelUptime
                }),
                this.Qf.hb(new le0_2[] {
                    this.Do0, this.AB, this.super$,
                    this.Am0[0], this.Am0[1], this.Am0[2], this.Am0[3], this.Am0[4], this.Am0[5],
                    this.bE0, this.oq0, this.Gn
                })
            }));
            this.Qf.x40(this.Qf.H10().Xq(new ya_1[] {
                this.Qf.hb(new le0_2[] { labelLocation, this.Do0 }),
                this.Qf.hb(new le0_2[] { labelMoney, this.AB }),
                this.Qf.hb(new le0_2[] { this.Jg0, this.super$ }),
                this.Qf.hb(new le0_2[] { this.Ro0[0], this.Am0[0] }),
                this.Qf.hb(new le0_2[] { this.Ro0[1], this.Am0[1] }),
                this.Qf.hb(new le0_2[] { this.Ro0[2], this.Am0[2] }),
                this.Qf.hb(new le0_2[] { this.Ro0[3], this.Am0[3] }),
                this.Qf.hb(new le0_2[] { this.Ro0[4], this.Am0[4] }),
                this.Qf.hb(new le0_2[] { this.Ro0[5], this.Am0[5] }),
                this.Qf.hb(new le0_2[] { labelPosition, this.bE0 }),
                this.Qf.hb(new le0_2[] { labelRam, this.oq0 }),
                this.Qf.hb(new le0_2[] { labelUptime, this.Gn })
            }));
        } else {
            this.Qf.WQ(this.Qf.H10().Xq(new ya_1[] {
                this.Qf.hb(new le0_2[] {
                    labelLocation, labelMoney, this.Jg0,
                    this.Ro0[0], this.Ro0[1], this.Ro0[2], this.Ro0[3], this.Ro0[4], this.Ro0[5]
                }),
                this.Qf.hb(new le0_2[] {
                    this.Do0, this.AB, this.super$,
                    this.Am0[0], this.Am0[1], this.Am0[2], this.Am0[3], this.Am0[4], this.Am0[5]
                })
            }));
            this.Qf.x40(this.Qf.H10().Xq(new ya_1[] {
                this.Qf.hb(new le0_2[] { labelLocation, this.Do0 }),
                this.Qf.hb(new le0_2[] { labelMoney, this.AB }),
                this.Qf.hb(new le0_2[] { this.Jg0, this.super$ }),
                this.Qf.hb(new le0_2[] { this.Ro0[0], this.Am0[0] }),
                this.Qf.hb(new le0_2[] { this.Ro0[1], this.Am0[1] }),
                this.Qf.hb(new le0_2[] { this.Ro0[2], this.Am0[2] }),
                this.Qf.hb(new le0_2[] { this.Ro0[3], this.Am0[3] }),
                this.Qf.hb(new le0_2[] { this.Ro0[4], this.Am0[4] }),
                this.Qf.hb(new le0_2[] { this.Ro0[5], this.Am0[5] })
            }));
        }
        this.Qf.Ll(false);
        SL(this.Qf);
    }

    public final void Dw0(zk0_1 v1) {
        if (this.jX + 1000000000L > System.nanoTime()) {
            return;
        }
        this.jX = System.nanoTime();
        yt_1 yt = tw0_0.e60;
        if (yt == null) {
            if (this.Qf.eE) {
                this.Qf.Ll(false);
            }
            return;
        }
        E90 e90 = yt.jB0;
        if (e90 == null) {
            return;
        }
        _else else_ = yt.N60();
        if (else_ == null) {
            return;
        }
        if (!this.Qf.eE) {
            this.Qf.Ll(true);
        }
        e30_0 k0 = tw0_0.rl.k0;
        if (k0 != null) {
            this.AB.Sk(BJ0.format((double) k0.il));
        }
        c8_0 c8 = c8_0.JD0;
        int i4 = c8.d60();
        int i5 = (c8.ki0() % 3600) / 60;
        DayOfWeek dayOfWeek;
        switch ((c8.ki0() % 604800) / 86400) {
            case 1:
                dayOfWeek = DayOfWeek.MONDAY;
                break;
            case 2:
                dayOfWeek = DayOfWeek.TUESDAY;
                break;
            case 3:
                dayOfWeek = DayOfWeek.WEDNESDAY;
                break;
            case 4:
                dayOfWeek = DayOfWeek.THURSDAY;
                break;
            case 5:
                dayOfWeek = DayOfWeek.FRIDAY;
                break;
            case 6:
                dayOfWeek = DayOfWeek.SATURDAY;
                break;
            default:
                dayOfWeek = DayOfWeek.SUNDAY;
                break;
        }
        if (i4 != this.C6 || i5 != this.u4 || dayOfWeek != this.yr0) {
            this.C6 = i4;
            this.u4 = i5;
            this.yr0 = dayOfWeek;
            b3_0 b3 = new b3_0();
            if (i4 < 10) {
                b3.sV("0");
            }
            b3.sV(String.valueOf(i4));
            b3.sV(":");
            if (i5 < 10) {
                b3.sV("0");
            }
            b3.sV(String.valueOf(i5));
            this.i80 = sm0_0.Bx(1155, new String[] {
                dayOfWeek.getDisplayName(TextStyle.FULL, wi0_0.gm.Fu),
                b3.toString()
            });
        }
        this.super$.Sk(this.i80);
        Pv0 s7 = c8.S7;
        int omIdx = s50_0.o5[s7.om];
        String timeLabel;
        if (omIdx == 1 || omIdx == 2) {
            timeLabel = "label-time-day";
        } else if (omIdx == 3) {
            timeLabel = "label-time-morning";
        } else {
            timeLabel = "label-time-night";
        }
        if (!this.Jg0.gW.equals(timeLabel)) {
            if (!this.Jg0.gW.equals(timeLabel)) {
                this.Jg0.uf(timeLabel);
                this.Jg0.yI();
            }
            this.Jg0.yI();
            this.Jg0.Xr0(sm0_0.c0(s7.eu));
            this.Jg0.GH0 = 50;
        }
        int i3 = 0;
        ZY cl = tw0_0.rl.Cl;
        if (cl != null && (long) cl.Lx0 > System.currentTimeMillis() / 1000L) {
            ka_1 repelLabel = this.Ro0[i3];
            if (!repelLabel.gW.equals("label-uptime")) {
                repelLabel.uf("label-uptime");
                repelLabel.yI();
            }
            this.Ro0[i3].Ll(true);
            this.Am0[i3].Ll(true);
            this.Am0[i3].Sk(sm0_0.c0(1150));
            this.Am0[i3].Xr0(tx_1.HU((int) ((long) tw0_0.rl.Cl.Lx0 - (System.currentTimeMillis() / 1000L)), 2) + " left.");
            this.Am0[i3].GH0 = 500;
            i3 = 1;
        }
        short kx = tw0_0.rl.k0.Kx;
        if (kx > 0) {
            ka_1 repelLabel = this.Ro0[i3];
            if (!repelLabel.gW.equals("label-repel")) {
                repelLabel.uf("label-repel");
                repelLabel.yI();
            }
            this.Ro0[i3].Ll(true);
            this.Am0[i3].Ll(true);
            this.Am0[i3].Xr0(null);
            this.Am0[i3].Sk(sm0_0.wa0(1151, "" + (int) kx));
            i3++;
        }
        short ey = tw0_0.rl.k0.ey;
        if (ey > 0) {
            int jrCase = s50_0.rJ[tw0_0.rl.k0.Uj.Jr];
            int repelMsgId;
            if (jrCase == 2) {
                repelMsgId = 16777253;
            } else if (jrCase == 3) {
                repelMsgId = 16777277;
            } else {
                repelMsgId = 16777251;
            }
            ka_1 repelLabel = this.Ro0[i3];
            if (!repelLabel.gW.equals("label-repel")) {
                repelLabel.uf("label-repel");
                repelLabel.yI();
            }
            this.Ro0[i3].Ll(true);
            this.Am0[i3].Ll(true);
            this.Am0[i3].Xr0(null);
            this.Am0[i3].Sk(sm0_0.wa0(repelMsgId, "" + (int) ey));
            i3++;
        }
        short sq0 = tw0_0.rl.k0.Sq0;
        if (sq0 > 0) {
            ka_1 repelLabel = this.Ro0[i3];
            if (!repelLabel.gW.equals("label-repel")) {
                repelLabel.uf("label-repel");
                repelLabel.yI();
            }
            this.Ro0[i3].Ll(true);
            this.Am0[i3].Ll(true);
            this.Am0[i3].Xr0(null);
            this.Am0[i3].Sk(sm0_0.wa0(1152, "" + (int) sq0));
            i3++;
        }
        short za = tw0_0.rl.zA;
        Mj mj = tw0_0.rl.r1(_volatile.BV);
        VU vu = null;
        for (short i6 = 0; i6 < mj.V2(); i6 = (short) (i6 + 1)) {
            VU vuCandidate = mj.Ry0(i6);
            if (vuCandidate != null && !vuCandidate.I8.vn() && vuCandidate.I8.VD >= 1) {
                vu = vuCandidate;
                break;
            }
        }
        if (za > 0 && vu != null) {
            ka_1 posLabel = this.Ro0[i3];
            if (!posLabel.gW.equals("label-position")) {
                posLabel.uf("label-position");
                posLabel.yI();
            }
            this.Ro0[i3].Ll(true);
            this.Am0[i3].Ll(true);
            String posTooltip;
            if (za == 559) {
                posTooltip = sm0_0.wa0(za + 211000, sm0_0.c0(vu.KD().j40 + 230000));
            } else {
                posTooltip = sm0_0.c0(za + 211000);
            }
            this.Am0[i3].Xr0(posTooltip);
            this.Am0[i3].Sk(sm0_0.c0(za + 210000));
            i3++;
        } else {
            this.Am0[i3].Xr0(null);
        }
        short sc0 = tw0_0.rl.Sc0;
        if (sc0 > 0) {
            ka_1 mailLabel = this.Ro0[i3];
            if (!mailLabel.gW.equals("label-mail")) {
                mailLabel.uf("label-mail");
                mailLabel.yI();
            }
            this.Ro0[i3].Ll(true);
            this.Am0[i3].Ll(true);
            if (this.Yu0 < sc0) {
                ka_1 mailBtn = this.Ro0[i3];
                mailBtn.xi = 500;
                if (mailBtn.JH0 == null) {
                    mailBtn.JH0 = new N1(new t5_0(mailBtn), new gn_0((byte) -1, (byte) -1, (byte) -1, (byte) -116));
                }
                mailBtn.ca = true;
                this.Ro0[i3].ow = 12;
                this.Ro0[i3].mV = 0;
                tw0_0.RE0.Hq0((byte) 2, (short) 1631);
                Qy0.yI0.dk(-1, sm0_0.c0(5817));
            }
            this.Yu0 = sc0;
            this.Am0[i3].Sk(sm0_0.wa0(5825, "" + (int) sc0));
            i3++;
        }
        while (i3 < this.Ro0.length) {
            this.Ro0[i3].Ll(false);
            this.Am0[i3].Ll(false);
            i3++;
        }
        if (tw0_0.Eu(1)) {
            this.Do0.Sk(else_.OE() + " / " + else_.lm0 + " Ch. " + (else_.A30 + 1));
            this.bE0.Sk(e90.ba0.Qs0());
            Runtime rt = Runtime.getRuntime();
            long usedMem = (rt.totalMemory() - rt.freeMemory()) / 1048576L;
            long maxMem = rt.maxMemory() / 1048576L;
            this.oq0.Sk("" + usedMem + " / " + maxMem + " MB (" + tx_1.QR((long) BufferUtils.Fd) + " Unsafe)");
            int hours = (int) Math.floor((double) tw0_0.LD0.Z1 / 3600.0);
            int minutes = (int) Math.floor(((double) (tw0_0.LD0.Z1 % 3600000.0f) / 1000.0) / 60.0);
            this.Gn.Sk(fp0_0.uD(new StringBuilder().append(hours).append(" h "), minutes, " m"));
        } else if (else_.A30 > -1) {
            this.Do0.Sk(else_.OE() + " Ch. " + (else_.A30 + 1));
        } else {
            this.Do0.Sk(else_.OE());
        }
    }
}
