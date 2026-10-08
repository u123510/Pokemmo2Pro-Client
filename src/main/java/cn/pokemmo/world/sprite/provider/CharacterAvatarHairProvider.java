/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class CharacterAvatarHairProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ vh_1 yF;
    public final /* synthetic */ Rk0 H9;
    public final /* synthetic */ int Hr;

    public CharacterAvatarHairProvider(FJ fJ, Rk0 rk0, int n) {
        this.yF = fJ;
        this.H9 = rk0;
        this.Hr = n;
    }

    @Override
    public final i4_0 KN() {
        Tt0 tt02 = new Tt0(this.yF.EG(0));
        Gt0 gt02 = new Gt0(this.yF.EG(1), false);
        Bp0 bp03 = new Bp0();
        Bp0 bp04 = new Bp0();
        this.H9.DX(this.Hr, bp03, bp04);
        i4_0 i4_03 = new i4_0((int)bp03.x, (int)bp03.y, ix0_0.Vw);
        this.H9.Q60(this.Hr, gt02, tt02, i4_03, bp04, null);
        this.H9.Lpt8();
        return i4_03;
    }
}

