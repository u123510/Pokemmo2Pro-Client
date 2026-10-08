package cn.pokemmo.graphics.particle;

import f.*;

public class ParticleEmitterState extends bs0_0 {
    public final ae0_1 O30;
    public final cn_0 Jb0;
    public final qj_2 zR;
    public final tk0_0 Jl;
    public final in_2 bG = new in_2(100);

    public ParticleEmitterState() {
        this.uf("event-tracker");
        this.O30 = new ae0_1();
        this.Jl = new tk0_0();
        this.Jb0 = new cn_0("0/0");
        this.Jb0.Oq0(false);
        this.Jb0.fn0();
        this.Jl.gg0.vx0(this.O30).Yt();
        this.Jl.gg0.Rg();
        this.Jl.gg0.vx0(this.Jb0).ru();
        this.zR = new qj_2();
        TQ(this.zR.sl(), X50());
        this.zR.uf("button");
        this.zR.RR(this::hW);
        this.gg0.vx0(this.zR).Ha().Xs(5.0f);
        this.gg0.vx0(this.Jl).Pt(100.0f).Xs(5.0f);
        this.O30.uf("event-progressbar-cny-coop");
        this.O30.aE(0.0f);
    }

    public static short X50() {
        Fd0 event = tw0_0.rl.Ob0();
        if (event == null || event.o4 != 3) {
            return 0;
        }
        short eventType = event.bS[1].gd(0);
        if (eventType == -1) {
            return 1525;
        }
        if (eventType == -2) {
            return 1526;
        }
        lpt6__1 entry = (lpt6__1) lpt6__1.kx0.get(eventType);
        if (entry == null) {
            return 0;
        }
        return switch (BC0.kF[entry.nUl]) {
            case 1 -> 1433;
            case 2 -> 1434;
            case 3 -> 1435;
            case 4 -> 1436;
            case 5 -> 1437;
            case 6 -> 1438;
            case 7 -> 1439;
            case 8 -> 1440;
            case 9 -> 1441;
            case 10 -> 1442;
            case 11 -> 1443;
            case 12 -> 1444;
            default -> 0;
        };
    }

    public static void TQ(Br0 button, short textId) {
        button.Nk(new Wr[]{gh_1.aH0.zm(textId)});
        button.EJ0 = 2.0f;
        button.gY = -9;
        button.a4 = -6;
    }

    public final void X30(int offset) {
        if (!this.bG.ty0()) {
            return;
        }
        Fd0 event = tw0_0.rl.Ob0();
        if (event == null || event.o4 != 3) {
            return;
        }
        short progress = event.bS[0].gd(0);
        this.O30.aE((float) event.O50 / 100.0f);
        this.Jb0.Sk(sm0_0.wa0(16805046, String.valueOf(progress)));
        this.Jl.gg0.pz(this.Jb0).sn0 = new vl0_0((float) offset);
        this.Jl.COm3();
        TQ(this.zR.tp0, X50());
    }

    @Override
    public final boolean nd0(i70_0 input) {
        int keyCode = input.zu;
        if (E00.C10(keyCode)) {
            if (keyCode == 5) {
                this.hW();
            }
            return true;
        }
        return super.nd0(input);
    }

    public final void hW() {
        tw0_0.rl.fk0.uQ(new f50_0());
    }
}
