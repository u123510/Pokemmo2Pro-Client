package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.graphics.Color;
import java.util.Arrays;

public class CharacterAvatarBackpackProvider extends BaseSpriteFrameProvider {
    public final vh_1 Pw;
    public final int A7;
    public final int Xb;

    public CharacterAvatarBackpackProvider(FJ v1, int i2, int i3) {
        super();
        this.Pw = v1;
        this.A7 = i2;
        this.Xb = i3;
    }

    @Override
    public final i4_0 KN() {
        Tt0 ribbon;
        try {
            ribbon = new Tt0(Pw.EG(6));
        } catch (RuntimeException e) {
            ob0_0.fo0.warn("skipping ribbon", e);
            i4_0 result = new i4_0(32, 32, ix0_0.CON);
            result.Je0 = Color.rgba8888(1.0F, 1.0F, 1.0F, 1.0F);
            result.XF.Kk(result.Je0);
            return result;
        }
        Gt0 texture;
        try {
            texture = new Gt0(Pw.EG(A7 + 16), false);
        } catch (RuntimeException e) {
            ob0_0.fo0.warn("skipping ribbon", e);
            i4_0 result = new i4_0(32, 32, ix0_0.CON);
            result.Je0 = Color.rgba8888(1.0F, 1.0F, 1.0F, 1.0F);
            result.XF.Kk(result.Je0);
            return result;
        }

        if (Xb != 0) {
            LPT4_[] row = ribbon.dc0[0];
            int offset = Xb * 16;
            LPT4_[] first = Arrays.copyOfRange(row, 0, 16);
            LPT4_[] second = Arrays.copyOfRange(row, offset, offset + 16);
            for (int i = 1; i < 16; i++) row[i] = second[i];
            for (int i = 1; i < 16; i++) row[offset + i] = first[i];
            ribbon.dc0[0] = row;
        }
        texture.LA = 32;
        if ((texture.EC0 == in_1.J9 || texture.EC0 == in_1.bC0) && 32 < texture.eC0) {
            texture.LA = texture.eC0;
        }
        texture.YA0(32);
        i4_0 result = texture.NK(ribbon, texture.LA, texture.v4);
        result.Pa0(DF0.Ha0);
        for (int x = 0; x < 32; x++) {
            for (int y = 0; y < 32; y++) {
                if (result.XF.iH0(x, y) == -2004313857) {
                    result.XF.XS(x, y, -1061097472);
                }
            }
        }
        return result;
    }
}
