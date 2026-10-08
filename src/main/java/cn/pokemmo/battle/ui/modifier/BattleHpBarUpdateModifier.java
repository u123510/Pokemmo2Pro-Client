package cn.pokemmo.battle.ui.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleHpBarUpdateModifier extends TC0 {
    public final kt_2 x40;
    public final byte rN;
    public final byte rT;

    public BattleHpBarUpdateModifier(kt_2 value, byte side, byte messageType) {
        this.x40 = value;
        this.rN = side;
        this.rT = messageType;
    }

    @Override
    public final void QC(ML0 battle) {
        boolean localized = N50.Fc(tw0_0.e60.Com4);
        int resource = tw0_0.e60.Com4 == 4 ? 197 : 368;
        int mode = (this.x40.iy == 7) ? 1 : (this.x40.iy == 6) ? 2 : (this.x40.iy == 8) ? 3 : 0;

        if (mode == 3) {
            String name = battle.yd0.Ce(this.rN, (byte) 0).nz0(true);
            String message;
            switch (this.rT) {
                case 0:
                    message = localized
                            ? sm0_0.fg0(tw0_0.e60.Com4, lpt6__2.Q80, resource, 842, new String[]{name})
                            : sm0_0.vs(200273, new byte[]{6}, new String[]{name});
                    break;
                case 1:
                    message = localized
                            ? sm0_0.fg0(tw0_0.e60.Com4, lpt6__2.Q80, resource, 855, new String[]{name})
                            : sm0_0.vs(200274, new byte[]{6}, new String[]{name});
                    break;
                case 2:
                    message = localized
                            ? sm0_0.fg0(tw0_0.e60.Com4, lpt6__2.Q80, resource, 852, new String[]{name})
                            : sm0_0.vs(200275, new byte[]{6}, new String[]{name});
                    break;
                case 3:
                    message = localized
                            ? sm0_0.fg0(tw0_0.e60.Com4, lpt6__2.Q80, resource, 469, new String[]{name})
                            : sm0_0.vs(200148, new byte[]{15}, new String[]{name});
                    break;
                default:
                    return;
            }
            battle.wJ(message, "", null);
            return;
        }

        if (mode == 1 || mode == 2) {
            String firstName = battle.yd0.mn(this.rN).M2();
            byte otherSide = (byte) (this.rN == 0 ? 1 : 0);
            String secondName = battle.yd0.Ce(otherSide, (byte) 0).nz0(true);
            int localizedId = mode == 1 ? 854 : 851;
            int fallbackId = mode == 1 ? 200271 : 200272;
            String message = localized
                    ? sm0_0.fg0(tw0_0.e60.Com4, lpt6__2.Q80, resource, localizedId,
                            new String[]{firstName, secondName})
                    : sm0_0.vs(fallbackId, new byte[]{35, 6}, new String[]{firstName, secondName});
            battle.wJ(message, "", null);
        }
    }
}
