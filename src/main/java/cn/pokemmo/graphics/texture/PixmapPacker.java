package cn.pokemmo.graphics.texture;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import f.*;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 现代化重构类 - 原始类: f.LJ0
 */
public class PixmapPacker implements fy0_0 {

    public static final Pattern vz = Pattern.compile("(.+)_(\\d+)$");
    public boolean WJ;
    public boolean eb;
    public final int Tx;
    public final int NZ;
    public final ix0_0 Hs0;
    public final int Pp;
    public final boolean wp0;
    public final boolean COM7;
    public final boolean Od;
    public final Color jZ;
    public final es_1 b6;
    public final vq0_0 sN;
    public final Color Ub;

    public PixmapPacker(int width, int height, ix0_0 format, int padding, boolean duplicateBorder) {
        this(width, height, format, padding, duplicateBorder, false, false, new _return());
    }

    public PixmapPacker(int width, int height, ix0_0 format, int padding, boolean duplicateBorder, vq0_0 strategy) {
        this(width, height, format, padding, duplicateBorder, false, false, strategy);
    }

    public PixmapPacker(int width, int height, ix0_0 format, int padding, boolean duplicateBorder,
            boolean stripWhitespaceX, boolean stripWhitespaceY, vq0_0 strategy) {
        this.jZ = new Color(0.0f, 0.0f, 0.0f, 0.0f);
        this.b6 = new es_1();
        this.Ub = new Color();
        this.Tx = width;
        this.NZ = height;
        this.Hs0 = format;
        this.Pp = padding;
        this.wp0 = duplicateBorder;
        this.COM7 = stripWhitespaceX;
        this.Od = stripWhitespaceY;
        this.sN = strategy;
    }

    public final int ki(i4_0 raster, int startX, int startY, boolean startPoint, boolean xAxis) {
        int[] rgba = new int[4];
        int end = xAxis ? raster.XF.SH : raster.XF.mB0;
        int breakAlpha = startPoint ? 255 : 0;
        for (int next = xAxis ? startX : startY; next != end; next++) {
            if (xAxis) {
                startX = next;
            } else {
                startY = next;
            }
            this.Ub.set(raster.XF.iH0(startX, startY));
            rgba[0] = (int)(this.Ub.r * 255.0f);
            rgba[1] = (int)(this.Ub.g * 255.0f);
            rgba[2] = (int)(this.Ub.b * 255.0f);
            rgba[3] = (int)(this.Ub.a * 255.0f);
            if (rgba[3] == breakAlpha) {
                return next;
            }
            if (!startPoint && (rgba[0] != 0 || rgba[1] != 0 || rgba[2] != 0 || rgba[3] != 255)) {
                System.out.println(startX + "  " + startY + " " + rgba + " ");
            }
        }
        return 0;
    }

    public synchronized ql_0 y9(String name, i4_0 image) {
        if (this.eb) {
            return null;
        }
        if (name != null && this.gu(name) != null) {
            throw new nf_1("Pixmap has already been packed with name: " + name);
        }

        tv_0 rect;
        i4_0 pixmapToDispose = null;
        if (name != null && name.endsWith(".9")) {
            rect = new tv_0(0, 0, image.XF.SH - 2, image.XF.mB0 - 2);
            pixmapToDispose = new i4_0(image.XF.SH - 2, image.XF.mB0 - 2, image.rH0());
            pixmapToDispose.Pa0(DF0.Ha0);
            rect.F70 = this.getSplits(image);
            rect.tf0 = this.getPads(image, rect.F70);
            pixmapToDispose.XF.bJ(image.XF, 1, 1, 0, 0, image.XF.SH - 1, image.XF.mB0 - 1);
            image = pixmapToDispose;
            name = name.split("\\.")[0];
        } else if (!this.COM7 && !this.Od) {
            rect = new tv_0(0, 0, image.XF.SH, image.XF.mB0);
        } else {
            int originalWidth = image.XF.SH;
            int originalHeight = image.XF.mB0;
            int top = 0;
            int bottom = originalHeight;
            if (this.Od) {
                outerTop:
                for (int y = 0; y < image.XF.mB0; y++) {
                    for (int x = 0; x < image.XF.SH; x++) {
                        if ((image.XF.iH0(x, y) & 255) > 0) {
                            break outerTop;
                        }
                    }
                    top++;
                }
                outerBottom:
                for (int y = image.XF.mB0; --y >= top;) {
                    for (int x = 0; x < image.XF.SH; x++) {
                        if ((image.XF.iH0(x, y) & 255) > 0) {
                            break outerBottom;
                        }
                    }
                    bottom--;
                }
            }

            int left = 0;
            int right = originalWidth;
            if (this.COM7) {
                outerLeft:
                for (int x = 0; x < image.XF.SH; x++) {
                    for (int y = top; y < bottom; y++) {
                        if ((image.XF.iH0(x, y) & 255) > 0) {
                            break outerLeft;
                        }
                    }
                    left++;
                }
                outerRight:
                for (int x = image.XF.SH; --x >= left;) {
                    for (int y = top; y < bottom; y++) {
                        if ((image.XF.iH0(x, y) & 255) > 0) {
                            break outerRight;
                        }
                    }
                    right--;
                }
            }

            int newWidth = right - left;
            int newHeight = bottom - top;
            pixmapToDispose = new i4_0(newWidth, newHeight, image.rH0());
            pixmapToDispose.Pa0(DF0.Ha0);
            pixmapToDispose.XF.bJ(image.XF, left, top, 0, 0, newWidth, newHeight);
            image = pixmapToDispose;
            rect = new tv_0(0, 0, newWidth, newHeight, left, top, originalWidth, originalHeight);
        }

        if (rect.IA > this.Tx || rect.Eu0 > this.NZ) {
            if (name == null) {
                throw new nf_1("Page size too small for pixmap.");
            }
            throw new nf_1("Page size too small for pixmap: " + name);
        }

        ZO page = this.sN.OC0((LJ0) this, rect);
        if (name != null) {
            page.Ep0.WK0(name, rect);
            page.ZV.Ue0(name);
        }

        int rectX = (int)rect.j80;
        int rectY = (int)rect.Wm0;
        int rectWidth = (int)rect.IA;
        int rectHeight = (int)rect.Eu0;
        if (this.WJ && !this.wp0 && page.q5 != null && !page.Rc0) {
            page.q5.bind();
            lg_0.OH0.glTexSubImage2D(page.q5.glTarget, 0, rectX, rectY, rectWidth, rectHeight,
                    image.Wc(), image.t30(), (Buffer)image.Rh0());
        } else {
            page.Rc0 = true;
        }
        page.WD0.NH0(image, rectX, rectY);

        if (this.wp0) {
            int imageWidth = image.XF.SH;
            int imageHeight = image.XF.mB0;
            page.WD0.XF.Cg(image.XF, 0, 0, 1, 1, rectX - 1, rectY - 1, 1, 1);
            page.WD0.XF.Cg(image.XF, imageWidth - 1, 0, 1, 1, rectX + rectWidth, rectY - 1, 1, 1);
            page.WD0.XF.Cg(image.XF, 0, imageHeight - 1, 1, 1, rectX - 1, rectY + rectHeight, 1, 1);
            page.WD0.XF.Cg(image.XF, imageWidth - 1, imageHeight - 1, 1, 1,
                    rectX + rectWidth, rectY + rectHeight, 1, 1);
            page.WD0.XF.Cg(image.XF, 0, 0, imageWidth, 1, rectX, rectY - 1, rectWidth, 1);
            page.WD0.XF.Cg(image.XF, 0, imageHeight - 1, imageWidth, 1,
                    rectX, rectY + rectHeight, rectWidth, 1);
            page.WD0.XF.Cg(image.XF, 0, 0, 1, imageHeight, rectX - 1, rectY, 1, rectHeight);
            page.WD0.XF.Cg(image.XF, imageWidth - 1, 0, 1, imageHeight,
                    rectX + rectWidth, rectY, 1, rectHeight);
        }

        if (pixmapToDispose != null) {
            pixmapToDispose.dispose();
        }
        return rect;
    }

    private int[] getSplits(i4_0 raster) {
        int startX = this.ki(raster, 1, 0, true, true);
        int endX = this.ki(raster, startX, 0, false, true);
        int startY = this.ki(raster, 0, 1, true, false);
        int endY = this.ki(raster, 0, startY, false, false);
        this.ki(raster, endX + 1, 0, true, true);
        this.ki(raster, 0, endY + 1, true, false);
        if (startX == 0 && endX == 0 && startY == 0 && endY == 0) {
            return null;
        }
        if (startX != 0) {
            startX--;
            endX = raster.XF.SH - 2 - (endX - 1);
        } else {
            endX = raster.XF.SH - 2;
        }
        if (startY != 0) {
            startY--;
            endY = raster.XF.mB0 - 2 - (endY - 1);
        } else {
            endY = raster.XF.mB0 - 2;
        }
        return new int[] {startX, endX, startY, endY};
    }

    private int[] getPads(i4_0 raster, int[] splits) {
        int bottom = raster.XF.mB0 - 1;
        int right = raster.XF.SH - 1;
        int startX = this.ki(raster, 1, bottom, true, true);
        int startY = this.ki(raster, right, 1, true, false);
        int endX = startX == 0 ? 0 : this.ki(raster, startX + 1, bottom, false, true);
        int endY = startY == 0 ? 0 : this.ki(raster, right, startY + 1, false, false);
        this.ki(raster, endX + 1, bottom, true, true);
        this.ki(raster, right, endY + 1, true, false);
        if (startX == 0 && endX == 0 && startY == 0 && endY == 0) {
            return null;
        }
        if (startX == 0 && endX == 0) {
            startX = -1;
            endX = -1;
        } else if (startX > 0) {
            startX--;
            endX = raster.XF.SH - 2 - (endX - 1);
        } else {
            endX = raster.XF.SH - 2;
        }
        if (startY == 0 && endY == 0) {
            startY = -1;
            endY = -1;
        } else if (startY > 0) {
            startY--;
            endY = raster.XF.mB0 - 2 - (endY - 1);
        } else {
            endY = raster.XF.mB0 - 2;
        }
        int[] pads = new int[] {startX, endX, startY, endY};
        return splits != null && Arrays.equals(pads, splits) ? null : pads;
    }

    public final synchronized ql_0 gu(String name) {
        I2 iterator = this.b6.ZD();
        while (iterator.hasNext()) {
            ql_0 rect = (ql_0)((ZO)iterator.next()).Ep0.Wk0(name);
            if (rect != null) {
                return rect;
            }
        }
        return null;
    }

    public synchronized void dispose() {
        I2 iterator = this.b6.ZD();
        while (iterator.hasNext()) {
            ZO page = (ZO)iterator.next();
            if (page.q5 == null) {
                page.WD0.dispose();
            }
        }
        this.eb = true;
    }

    public final Color Te0() {
        return this.jZ;
    }

    public final synchronized void Z6(i4_0 image) {
        this.y9(null, image);
    }

    public final synchronized void DD(D30 atlas, eb0_1 minFilter, eb0_1 magFilter) {
        this.Va0(atlas, minFilter, magFilter);
    }

    public final synchronized void Va0(D30 atlas, eb0_1 minFilter, eb0_1 magFilter) {
        this.Oy0(minFilter, magFilter);
        I2 pageIterator = this.b6.ZD();
        while (pageIterator.hasNext()) {
            ZO page = (ZO)pageIterator.next();
            if (page.ZV.KB <= 0) {
                continue;
            }
            I2 nameIterator = page.ZV.ZD();
            while (nameIterator.hasNext()) {
                String name = (String)nameIterator.next();
                tv_0 rect = (tv_0)page.Ep0.Wk0(name);
                yo_2 region = new yo_2(page.q5, (int)rect.j80, (int)rect.Wm0, (int)rect.IA, (int)rect.Eu0);
                if (rect.F70 != null) {
                    region.EY = new String[] {"split", "pad"};
                    region.cM = new int[][] {rect.F70, rect.tf0};
                }
                int index = -1;
                Matcher matcher = vz.matcher(name);
                if (matcher.matches()) {
                    name = matcher.group(1);
                    index = Integer.parseInt(matcher.group(2));
                }
                region.oL = name;
                region.lw = index;
                region.Z0 = rect.Gl;
                region.JN = (int)((float)rect.pI0 - rect.Eu0 - (float)rect.OF);
                region.Xr0 = rect.RB;
                region.BF0 = rect.pI0;
                atlas.kE.Ue0(region);
            }
            page.ZV.clear();
            atlas.qh.MG0(page.q5);
        }
    }

    public final synchronized void Kr0(es_1 regions, eb0_1 minFilter, eb0_1 magFilter) {
        this.Oy0(minFilter, magFilter);
        while (regions.KB < this.b6.KB) {
            regions.Ue0(new LPT6_(((ZO)this.b6.get(regions.KB)).q5));
        }
    }

    public final synchronized void Oy0(eb0_1 minFilter, eb0_1 magFilter) {
        I2 iterator = this.b6.ZD();
        while (iterator.hasNext()) {
            ZO page = (ZO)iterator.next();
            Texture texture = page.q5;
            if (texture != null) {
                if (page.Rc0) {
                    texture.load(texture.getTextureData());
                }
            } else {
                texture = new h60_0(page, new S60(page.WD0, page.WD0.rH0(), false, false, true));
                page.q5 = texture;
                texture.setFilter(minFilter, magFilter);
            }
            page.Rc0 = false;
        }
    }
}
