package cn.pokemmo.ui.widget.text.tag;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.text.tag.BaseTaggedLabelWidget;

public class BattleStatModTagLabel extends BaseTaggedLabelWidget {
    public final Br0 CC;

    public BattleStatModTagLabel(P80 v1, ap_0 v2, int i3) {
        super("", i3, i3);
        Br0 v3 = new Br0(this);
        this.CC = v3;
        uf("monsterdex-button");
        pw0(false);
        cq_0 v4 = mp_1.vf0().W50(v1.RI0()).Gr0();
        if (!v2.ID0((byte) 0, v1.RI0()) && (v4 == null || !v2.ID0((byte) 0, v4.Nm()))) {
            Xb((short) 0);
            sl().Gy0(sl().B6(), sl().Y10() + 6);
            Xr0("???");
            Bb(0);
            return;
        }

        String v2_str = String.valueOf(v1.gL0());
        switch (v1.UE0().ordinal()) {
            case 1:
                Xb((short) 5218);
                break;
            case 2:
            case 3:
                LPT6_ lpt6 = v1.UE0() == m_0.Ez0 ? fn_0.qz0().bc0() : fn_0.qz0().Lp();
                v3.r8(new LPT6_[] { lpt6 });
                Xb((short) 5218);
                v3.Gy0(20, 10);
                sl().Gy0(0, 6);
                break;
            case 4:
            case 14:
                Xb((short) 5050);
                SU(ig_0.u9(59, new StringBuilder(), " ").append(v1.gL0()).toString());
                break;
            case 5:
                Xb((short) 5437);
                break;
            case 6:
            case 8:
                Xb((short) v1.gL0());
                v2_str = gu0.Az0().lPT6((short) v1.gL0()).getName();
                break;
            case 7:
                Xb((short) 5437);
                short monId = (short) (v1.RI0() == 617 ? 588 : 616);
                v2_str = mp_1.vf0().W50(monId).zj();
                break;
            case 9:
                Xb((short) 5057);
                break;
            case 10:
                Xb((short) 5056);
                break;
            case 11:
                Xb((short) 5058);
                break;
            case 12:
            case 13:
            default:
                Xb((short) 0);
                break;
            case 15:
                Xb((short) 5004);
                break;
            case 16:
                Xb((short) 5261);
                break;
            case 17:
            case 18:
                byte b6 = (byte) (v1.UE0() == m_0.Q2 ? 0 : 1);
                v3.r8(new LPT6_[] { fn_0.qz0().Cn(b6) });
                v3.Gy0(28, 26);
                Xb((short) v1.gL0());
                v2_str = gu0.Az0().lPT6((short) v1.gL0()).getName();
                break;
            case 19:
            case 20:
                LPT6_ lpt = v1.UE0() == m_0.xR ? fn_0.qz0().bc0() : fn_0.qz0().Lp();
                v3.r8(new LPT6_[] { lpt });
                Xb((short) v1.gL0());
                v3.Gy0(20, 10);
                sl().Gy0(0, 6);
                v2_str = gu0.Az0().lPT6((short) v1.gL0()).getName();
                break;
            case 21:
                mc0_1 item = gu0.Az0().lPT6((short) 5332);
                v3.Nk(new Wr[] { gh_1.Jh0().Xj0(item) });
                v3.nq0(24, 24);
                Xb((short) 5050);
                v3.Gy0(20, 10);
                sl().Gy0(0, 6);
                v2_str = ec0_2.Sx().SX((short) v1.gL0()).CoM2();
                break;
            case 22:
                short monsterId = yh_0.Ed((byte) 0, (short) v1.gL0());
                v3.o60(yh_0.Dl0().qC0(monsterId, (byte) 0, false));
                Xb((short) 5050);
                v3.Gy0(16, 2);
                sl().Gy0(0, 6);
                v2_str = mp_1.vf0().W50((short) v1.gL0()).zj();
                break;
            case 23:
            case 24:
                SU(ig_0.u9(59, new StringBuilder(), " ").append(v1.gL0()).toString());
                byte i7 = (byte) (v1.UE0() == m_0.D50 ? 0 : 1);
                v3.r8(new LPT6_[] { fn_0.qz0().Cn(i7) });
                v3.Gy0(28, 4);
                Xb((short) 5050);
                break;
            case 25:
            case 26:
            case 27:
                Xb((short) 5442);
                break;
        }

        Xr0(sm0_0.wa0(v1.UE0().cv(), v2_str));
        Bb(0);
        if (tw0_0.kz0()) {
            sl().dA(2.0f);
            sl().Gy0(sl().B6() * 2, sl().Y10() * 2);
            v3.dA(2.0f);
            v3.Gy0(v3.B6() * 2, v3.Y10() * 2);
        }
        if (Oc0().equals("")) {
            sl().Gy0(sl().B6(), sl().Y10() + 6);
        }
    }

    @Override
    public final void Dw0(zk0_1 v1) {
        this.CC.t00();
        super.Dw0(v1);
    }

    public final void Xb(short i1) {
        mc0_1 item = gu0.l2.lPT6(i1);
        this.tp0.Nk(new Wr[] { gh_1.aH0.F10(item, false) });
        this.tp0.OA0 = true;
        this.tp0.IF = 24;
        this.tp0.gx0 = 24;
        this.tp0.gY = 10;
        this.tp0.a4 = 4;
    }
}
