package cn.pokemmo.battle.animation.move.gen3;

import f.*;

/**
 * 宝可梦对战技能招式动画 - 秘密之力 (SecretPower)
 * 技能编号: 290
 * 原始类: f.jm_0
 */
public class SecretPowerAnimation extends MU {
    public MU az0;

    public SecretPowerAnimation(PF value) {
        super(value);
        this.az0 = null;
    }

    @Override
    public final MU us() {
        int kind;
        switch (tw0_0.PK0.tB0.t3) {
            case 7: kind = 1; break;
            case 8: kind = 2; break;
            case 6: kind = 3; break;
            case 4: kind = 4; break;
            case 5: kind = 5; break;
            case 3: kind = 6; break;
            case 0: kind = 7; break;
            case 1: kind = 8; break;
            case 12: kind = 9; break;
            case 2: kind = 10; break;
            default: kind = 0; break;
        }
        switch (kind) {
            case 1:
            case 2:
            case 3:
                this.az0 = new lg0_2(this.Vz0);
                break;
            case 4:
            case 5:
            case 6:
                this.az0 = new Y10(this.Vz0);
                break;
            case 7:
            case 8:
                this.az0 = new ml0_0(this.Vz0);
                break;
            case 9:
                this.az0 = new yh_1(this.Vz0);
                break;
            case 10:
                this.az0 = new ZL(this.Vz0);
                break;
            default:
                this.az0 = new yh_1(this.Vz0);
                break;
        }

        if (this.CoM9 != null) {
            this.az0.kA0((PF[]) this.CoM9.Mo0(PF.class));
        } else if (this.Xp != null) {
            this.az0.vv(this.Xp);
        } else if (this.ei0 != -1) {
            this.az0.ei0 = this.ei0;
            this.az0.Vc();
        }
        this.az0.us();
        this.Vc();
        return this.az0;
    }

    @Override
    public final boolean bL() {
        if (!this.az0.bL()) {
            return false;
        }
        return this.az0.nJ0;
    }

    @Override
    public final void ZS() {
        super.ZS();
        this.az0.ZS();
    }
}
