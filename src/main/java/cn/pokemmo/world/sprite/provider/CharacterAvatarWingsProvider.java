package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class CharacterAvatarWingsProvider extends BaseSpriteFrameProvider {
    public final ty0 X6;
    public final int Ad;
    public final boolean mK;

    public CharacterAvatarWingsProvider(ty0 value, int index, boolean applyColor) {
        super();
        this.X6 = value;
        this.Ad = index;
        this.mK = applyColor;
    }

    @Override
    public final i4_0 KN() {
        i4_0 result = ((vm_1)this.X6).UK0[this.Ad].By();
        if (this.mK) {
            yh_0.y60(result, yh_0.so0);
        }
        return result;
    }
}
