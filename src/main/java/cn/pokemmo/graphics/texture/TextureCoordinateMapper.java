package cn.pokemmo.graphics.texture;

import f.LPT6_;

public class TextureCoordinateMapper {
    public final LPT6_ gq;

    public TextureCoordinateMapper(LPT6_ lpt6_, float[] fArr, short[] sArr) {
        this.gq = lpt6_;
        float[] arr = new float[fArr.length];
        float yQ = lpt6_.yQ;
        float y60 = lpt6_.Y60;
        float dx = lpt6_.Yo - yQ;
        float dy = lpt6_.Ll0 - y60;
        int bz = lpt6_.bz;
        int xZ = lpt6_.xZ;
        int len = arr.length;
        for (int i = 0; i < len; i += 2) {
            arr[i] = (fArr[i] / (float) bz) * dx + yQ;
            int next = i + 1;
            float f11 = fArr[next] / (float) xZ;
            arr[next] = (1.0f - f11) * dy + y60;
        }
    }
}
