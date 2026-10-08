package cn.pokemmo.graphics.image;

import f.am_2;
import f.i4_0;
import f.pc_1;
import f.vt_0;

public class SpriteMirrorProcessor extends pc_1 {
    @Override
    public i4_0 Qw0(vt_0 source, am_2 metadata, int mode) {
        i4_0 image = super.Qw0(source, metadata, mode);
        if (mode == 0) {
            for (int y = 48; y < 64; ++y) {
                for (int x = 0; x < 16; ++x) {
                    image.XF.XS(x, y, image.XF.iH0(31 - x, y));
                }
            }
        }
        return image;
    }
}
