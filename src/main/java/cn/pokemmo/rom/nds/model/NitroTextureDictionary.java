package cn.pokemmo.rom.nds.model;

import f.Cq0;
import f.DF0;
import f.EI;
import f.TD0;
import f.aux__1;
import f.dl_1;
import f.gb_0;
import f.i4_0;
import f.ix0_0;
import f.ol0_0;
import f.pv_0;
import java.nio.ByteBuffer;
import java.util.Iterator;

/**
 * NDS Nitro 材质纹理与调色板字典 (Nitro Texture Dictionary)
 * <p>
 * 原始混淆类: {@code f.am_2}
 */
public class NitroTextureDictionary {
    public static final dl_1 I5 = Cq0.E1(NitroTextureDictionary.class);
    public final boolean qn0;
    public final aux__1 ib0;
    public final aux__1 CoM5;
    public final EI mw;
    public final EI J80;
    public int[] Xp0;

    public NitroTextureDictionary(boolean forceOpaque, ByteBuffer data) {
        boolean initialized = false;
        aux__1 textures = null;
        aux__1 palettes = null;
        EI textureNames = null;
        EI paletteNames = null;
        int start = data.position();
        if (data.getInt() != 811091284) {
            I5.error("Not a valid TEX0 file");
        } else {
            data.getInt(); data.getInt(); data.getShort(); data.getShort(); data.getInt();
            int textureOffset = data.getInt();
            data.getInt(); data.getShort(); data.getShort(); data.getInt();
            int textureInfoOffset = data.getInt();
            data.getInt(); data.getInt(); data.getInt(); data.getInt();
            int paletteOffset = data.getInt();
            textures = new aux__1(data, pv_0::new, start, new int[]{textureOffset, textureInfoOffset});
            palettes = new aux__1(data, gb_0::new, start, new int[]{paletteOffset});
            if (forceOpaque) {
                Iterator it = textures.iterator();
                while (it.hasNext()) ((pv_0) it.next()).Eq = 1;
            }
            textureNames = new EI(textures.size());
            paletteNames = new EI(palettes.size());
            for (int i = 0; i < textures.size(); i++) textureNames.WK0(((pv_0) textures.k00(i)).QW, Integer.valueOf(i));
            for (int i = 0; i < palettes.size(); i++) paletteNames.WK0(((gb_0) palettes.k00(i)).QW, Integer.valueOf(i));
            initialized = true;
        }
        this.qn0 = initialized;
        this.ib0 = textures;
        this.CoM5 = palettes;
        this.mw = textureNames;
        this.J80 = paletteNames;
    }

    public static i4_0 Rd(pv_0 texture, int[] palette) {
        byte[] pixels = texture.break$();
        i4_0 result = null;
        ol0_0 format = texture.bh0;
        switch (TD0.yp0[format.FH]) {
            case 5:
                result = new i4_0(texture.kK0, texture.bR, ix0_0.Vw);
                result.Pa0(DF0.Ha0);
                for (int y = 0; y < texture.bR; y++) {
                    for (int x = 0; x < texture.kK0; x++) {
                        byte packed = pixels[y * texture.kK0 + x];
                        int index = packed & 7;
                        int alpha5 = (packed >> 3) & 31;
                        int alpha8 = (alpha5 << 3) | (alpha5 >> 2);
                        int color = (alpha8 << 24) | (palette[index] & 16777215);
                        result.XF.XS(x, y, (color << 8) | (color >>> 24));
                    }
                }
                break;
            case 2:
            case 3:
            case 4:
                ix0_0 type = ix0_0.Tr;
                if (texture.Eq != 0) {
                    palette[0] = 0;
                    type = ix0_0.Vw;
                }
                result = new i4_0(texture.kK0, texture.bR, type);
                result.Pa0(DF0.Ha0);
                for (int y = 0; y < texture.bR; y++) {
                    for (int x = 0; x < texture.kK0; x++) {
                        int index = pixels[y * texture.kK0 + x] & 255;
                        if (index < palette.length) {
                            int color = palette[index];
                            result.XF.XS(x, y, (color << 8) | (color >>> 24));
                        }
                    }
                }
                break;
            case 1:
                result = new i4_0(texture.kK0, texture.bR, ix0_0.Vw);
                result.Pa0(DF0.Ha0);
                for (int y = 0; y < texture.bR; y++) {
                    for (int x = 0; x < texture.kK0; x++) {
                        byte packed = pixels[y * texture.kK0 + x];
                        int index = packed & 31;
                        int alpha3 = (packed >> 5) & 7;
                        int alpha5 = (alpha3 << 2) | (alpha3 >> 1);
                        int alpha8 = (alpha5 << 3) | (alpha5 >> 2);
                        int color = (alpha8 << 24) | (palette[index] & 16777215);
                        result.XF.XS(x, y, (color << 8) | (color >>> 24));
                    }
                }
                break;
            default:
                I5.info("Unsupported format: {}", Byte.valueOf(format.ei0));
        }
        return result;
    }

    public i4_0 Rt0(int textureIndex, int paletteIndex) {
        pv_0 texture = (pv_0) this.ib0.Ks.get(textureIndex);
        gb_0 paletteEntry = (gb_0) this.CoM5.Ks.get(paletteIndex);
        int[] palette = this.Xp0;
        if (palette == null) palette = paletteEntry.yF0(texture.bh0);
        return Rd(texture, palette);
    }
}
