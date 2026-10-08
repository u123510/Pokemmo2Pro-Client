package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class NpcInteractionMarkerProvider extends BaseSpriteFrameProvider {
    public final qa0_1 LpT1;

    public NpcInteractionMarkerProvider(qa0_1 source) {
        this.LpT1 = source;
    }

    public final i4_0 KN() {
        ByteBuffer data = this.LpT1.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        int dataOffset = this.LpT1.EZ.V(br_2.Co0);
        int columns = 2;
        int rows = 2;
        XG0 paletteType = XG0.hi0;
        data.position(dataOffset);

        byte[] pixels;
        if (tx_1.T30(data, kd_2.Gu0) > 0) {
            pixels = tx_1.Gi(dataOffset, data);
        } else {
            pixels = new byte[columns * rows * 32];
            data.get(pixels);
        }

        int paletteIndex = this.LpT1.EZ.V(br_2.yw);
        i8_0 palette = da_0.Ic.OY(paletteType, paletteIndex, this.LpT1);
        int imageCount = pixels.length / 2 * 8 / 16 / 8;
        i4_0[] images = new i4_0[imageCount];
        int imageSize = 8;
        int bytesPerImage = 64 / 2;

        for (int imageIndex = 0; imageIndex < imageCount; imageIndex++) {
            int[] paletteValues = palette.ax;
            int nextImage = imageIndex + 1;
            int paletteOffset = paletteValues.length >= palette.Vc.co0 * nextImage
                    ? paletteValues.length / imageCount * imageIndex : 0;

            images[imageIndex] = new i4_0(imageSize, imageSize, ix0_0.Vw);
            int x = 0;
            int y = 0;
            int firstByte = imageIndex * bytesPerImage;
            for (int byteIndex = firstByte;
                    byteIndex < firstByte + bytesPerImage && byteIndex < pixels.length;
                    byteIndex++) {
                int packed = pixels[byteIndex];
                int low = packed & 15;
                int high = packed >> 4 & 15;
                if (low > 0) {
                    images[imageIndex].XF.XS(x, y, palette.ax[low + paletteOffset]);
                }
                if (high > 0) {
                    images[imageIndex].XF.XS(x + 1, y, palette.ax[high + paletteOffset]);
                }

                x += 2;
                if (x % 8 == 0) {
                    int nextY = y + 1;
                    if (nextY % 8 == 0) {
                        nextY = y - 7;
                    } else {
                        x -= 8;
                    }
                    if (x == imageSize) {
                        y = nextY + 8;
                        x = 0;
                    } else {
                        y = nextY;
                    }
                }
            }
        }
        images[0].dispose();
        return images[1];
    }
}
