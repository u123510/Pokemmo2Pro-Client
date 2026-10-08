/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.au_2;
import f.i4_0;
import f.ji0_0;
import f.qa0_1;
import java.nio.ByteOrder;

public class CharacterAvatarShadowProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 Pt0;
    public final /* synthetic */ int Vu0;
    public final /* synthetic */ int xX;
    public final /* synthetic */ int b50;
    public final /* synthetic */ int jR;

    public CharacterAvatarShadowProvider(qa0_1 qa0_12, int n, int n2, int n3) {
        this.Pt0 = qa0_12;
        this.Vu0 = n;
        this.xX = n2;
        this.b50 = n3;
        this.jR = 6;
    }

    @Override
    public final i4_0 KN() {
        CharacterAvatarShadowProvider u70 = this;
        int n = u70.Vu0;
        int[][] nArrayArray = new int[1][];
        int[][] nArrayArray2 = nArrayArray;
        int[] nArray = new int[1];
        int[] nArray2 = nArray;
        nArray[0] = this.xX;
        nArrayArray[0] = nArray2;
        int n2 = u70.b50;
        int n3 = u70.jR;
        return ji0_0.J60(this.Pt0.VL0.slice().order(ByteOrder.LITTLE_ENDIAN), n, nArrayArray2, n2, n3);
    }
}

