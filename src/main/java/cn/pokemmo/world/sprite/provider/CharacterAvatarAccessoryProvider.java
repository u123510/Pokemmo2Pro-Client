/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class CharacterAvatarAccessoryProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ vh_1 e00;
    public final /* synthetic */ int Uo0;

    public CharacterAvatarAccessoryProvider(FJ fJ, int n) {
        this.e00 = fJ;
        this.Uo0 = n;
    }

    @Override
    public final i4_0 KN() {
        Tt0 tt02 = new Tt0(this.e00.EG(this.Uo0 * 8 + 7));
        int n = this.Uo0;
        if (n != 37 && n != 38 && n != 40) {
            Gt0 gt02 = new Gt0(this.e00.EG(n * 8), true);
            int n2 = 80;
            n = 80;
            return new Rk0(this.e00.EG(this.Uo0 * 8 + 2), false).oQ(gt02, tt02, 0, n2, n, 0);
        }
        Gt0 gt0 = new Gt0(this.e00.EG(n * 8 + 1), true);
        int n3 = gt0.LA;
        i4_0 i4_02 = gt0.NK(tt02, n3, gt0.v4);
        ix0_0 ix0_02 = i4_02.rH0();
        i4_0 i4_03 = new i4_0(80, 80, ix0_02);
        int n4 = 0;
        n = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 80;
        int n8 = 80;
        i4_03.XF.bJ(i4_02.XF, n5, n6, n4, n, n7, n8);
        i4_02.dispose();
        return i4_03;
    }

}

