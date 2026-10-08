package com.badlogic.gdx.graphics.g2d.freetype;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.BufferUtils;
import f.DF0;
import f.Dn0;
import f.J7;
import f.Jf;
import f.KT;
import f.ea0_1;
import f.fy0_0;
import f.i4_0;
import f.ix0_0;
import f.nf_1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;

public class FreeType {
    public FreeType() {
    }

    public static native int getLastErrorCode();

    public static Library JM() {
        (new ea0_1()).h9("gdx-freetype");
        long handle = initFreeTypeJni();
        if (handle != 0L) {
            return new Library(handle);
        }
        throw new nf_1("Couldn't initialize FreeType library, FreeType error code: " + getLastErrorCode());
    }

    private static native long initFreeTypeJni();

    public static int gA0(int value) {
        return (value + 63 & -64) >> 6;
    }

    public static class Library extends Jf implements fy0_0 {
        public final J7 SC0 = new J7();

        public Library(long handle) {
            super(handle);
        }

        private static native void doneFreeType(long handle);

        private static native long newMemoryFace(long library, ByteBuffer data, int size, int faceIndex);

        private static native long strokerNew(long library);

        public final void dispose() {
            doneFreeType(this.bx);
            for (Object object : this.SC0) {
                if (object instanceof ByteBuffer) {
                    ByteBuffer buffer = (ByteBuffer)object;
                    if (BufferUtils.qL(buffer)) {
                        BufferUtils.t7(buffer);
                    }
                }
            }
        }

        public final Face kY(Dn0 file, int faceIndex) {
            ByteBuffer buffer = null;
            try {
                buffer = file.zs0(FileChannel.MapMode.READ_ONLY);
            } catch (nf_1 ignored) {
                buffer = null;
            }

            if (buffer == null) {
                InputStream input = null;
                try {
                    input = file.uf0();
                    int length = (int)file.Nm0();
                    if (length == 0) {
                        byte[] bytes = KT.Vc(input, 16384);
                        buffer = BufferUtils.qw0(bytes.length);
                        BufferUtils.n9(bytes, buffer, bytes.length);
                    } else {
                        buffer = BufferUtils.qw0(length);
                        byte[] temp = new byte[4096];
                        int start = ((Buffer)buffer).position();
                        int total = 0;
                        int read;
                        while ((read = input.read(temp)) != -1) {
                            BufferUtils.n9(temp, buffer, read);
                            total += read;
                            ((Buffer)buffer).position(start + total);
                        }
                        ((Buffer)buffer).position(start);
                    }
                } catch (IOException ex) {
                    throw new nf_1(ex);
                } finally {
                    KT.E1(input);
                }
            }

            long face = newMemoryFace(this.bx, buffer, ((Buffer)buffer).remaining(), faceIndex);
            if (face == 0L) {
                if (BufferUtils.qL(buffer)) {
                    BufferUtils.t7(buffer);
                }
                throw new nf_1("Couldn't load font, FreeType error code: " + getLastErrorCode());
            }
            this.SC0.cw(face, buffer);
            return new Face(face, this);
        }

        public final Stroker sy0() {
            long stroker = strokerNew(this.bx);
            if (stroker != 0L) {
                return new Stroker(stroker);
            }
            throw new nf_1("Couldn't create FreeType stroker, FreeType error code: " + getLastErrorCode());
        }
    }

    public static class Face extends Jf implements fy0_0 {
        public final Library Vu0;

        public Face(long handle, Library library) {
            super(handle);
            this.Vu0 = library;
        }

        private static native void doneFace(long handle);
        private static native int getFaceFlags(long handle);
        private static native int getNumGlyphs(long handle);
        private static native int getMaxAdvanceWidth(long handle);
        private static native boolean setPixelSizes(long handle, int width, int height);
        private static native boolean loadChar(long handle, int codepoint, int flags);
        private static native long getGlyph(long handle);
        private static native long getSize(long handle);
        private static native boolean hasKerning(long handle);
        private static native int getKerning(long handle, int leftGlyph, int rightGlyph, int mode);
        private static native int getCharIndex(long handle, int codepoint);

        public final void dispose() {
            doneFace(this.bx);
            ByteBuffer buffer = (ByteBuffer)this.Vu0.SC0.Aw(this.bx);
            if (buffer != null) {
                this.Vu0.SC0.qa0(this.bx);
                if (BufferUtils.qL(buffer)) {
                    BufferUtils.t7(buffer);
                }
            }
        }

        public final int vE0() {
            return getFaceFlags(this.bx);
        }

        public final int xH0() {
            return getNumGlyphs(this.bx);
        }

        public final int Oh() {
            return getMaxAdvanceWidth(this.bx);
        }

        public final boolean VR(int codepoint, int flags) {
            return loadChar(this.bx, codepoint, flags);
        }

        public final GlyphSlot Bi() {
            return new GlyphSlot(getGlyph(this.bx));
        }

        public final Size Jw() {
            return new Size(getSize(this.bx));
        }

        public final boolean NE() {
            return hasKerning(this.bx);
        }

        public final int kf0(int codepoint) {
            return getCharIndex(this.bx, codepoint);
        }

        public final boolean Y8(int pixels) {
            return setPixelSizes(this.bx, 0, pixels);
        }

        public final int lI0(int leftGlyph, int rightGlyph) {
            return getKerning(this.bx, leftGlyph, rightGlyph, 0);
        }
    }

    public static class GlyphSlot extends Jf {
        public GlyphSlot(long handle) {
            super(handle);
        }

        private static native long getMetrics(long handle);
        private static native int getFormat(long handle);
        private static native long getGlyph(long handle);

        public final GlyphMetrics LA() {
            return new GlyphMetrics(getMetrics(this.bx));
        }

        public final int Aw() {
            return getFormat(this.bx);
        }

        public final Glyph wL() {
            long glyph = getGlyph(this.bx);
            if (glyph != 0L) {
                return new Glyph(glyph);
            }
            throw new nf_1("Couldn't get glyph, FreeType error code: " + getLastErrorCode());
        }
    }

    public static class GlyphMetrics extends Jf {
        public GlyphMetrics(long handle) {
            super(handle);
        }

        private static native int getHeight(long handle);
        private static native int getHoriAdvance(long handle);

        public final int dh0() {
            return getHeight(this.bx);
        }

        public final int YM() {
            return getHoriAdvance(this.bx);
        }
    }

    public static class Glyph extends Jf implements fy0_0 {
        public boolean Hm0;

        public Glyph(long handle) {
            super(handle);
        }

        private static native void done(long handle);
        private static native long strokeBorder(long glyph, long stroker, boolean inside);
        private static native long toBitmap(long glyph, int renderMode);
        private static native long getBitmap(long glyph);
        private static native int getLeft(long glyph);
        private static native int getTop(long glyph);

        public final void dispose() {
            done(this.bx);
        }

        public final void fu0(Stroker stroker) {
            this.bx = strokeBorder(this.bx, stroker.bx, false);
        }

        public final void L00(int renderMode) {
            long glyph = toBitmap(this.bx, renderMode);
            if (glyph != 0L) {
                this.bx = glyph;
                this.Hm0 = true;
                return;
            }
            throw new nf_1("Couldn't render glyph, FreeType error code: " + getLastErrorCode());
        }

        public final Bitmap Za0() {
            if (this.Hm0) {
                return new Bitmap(getBitmap(this.bx));
            }
            throw new nf_1("Glyph is not yet rendered");
        }

        public final int Bv0() {
            if (this.Hm0) {
                return getLeft(this.bx);
            }
            throw new nf_1("Glyph is not yet rendered");
        }

        public final int sd() {
            if (this.Hm0) {
                return getTop(this.bx);
            }
            throw new nf_1("Glyph is not yet rendered");
        }
    }

    public static class Bitmap extends Jf {
        public Bitmap(long handle) {
            super(handle);
        }

        private static native int getRows(long handle);
        private static native int getWidth(long handle);
        private static native int getPitch(long handle);
        private static native ByteBuffer getBuffer(long handle);
        private static native int getPixelMode(long handle);

        public final int dl0() {
            return getRows(this.bx);
        }

        public final int m3() {
            return getWidth(this.bx);
        }

        public final int vK() {
            return getPitch(this.bx);
        }

        public final ByteBuffer C90() {
            if (getRows(this.bx) == 0) {
                return ByteBuffer.allocateDirect(1).order(ByteOrder.nativeOrder());
            }
            return getBuffer(this.bx);
        }

        public final i4_0 WI(ix0_0 format, Color color, float gamma) {
            int width = getWidth(this.bx);
            int rows = getRows(this.bx);
            ByteBuffer source = this.C90();
            int pixelMode = getPixelMode(this.bx);
            int pitch = Math.abs(getPitch(this.bx));
            i4_0 pixmap;

            if (color == Color.WHITE && pixelMode == 2 && pitch == width && gamma == 1.0F) {
                pixmap = new i4_0(width, rows, ix0_0.Vp0);
                BufferUtils.KJ(source, pixmap.Rh0(), ((Buffer)pixmap.Rh0()).capacity());
            } else {
                pixmap = new i4_0(width, rows, ix0_0.Vw);
                int rgba = Color.rgba8888(color);
                byte[] row = new byte[pitch];
                int[] pixels = new int[width];
                IntBuffer out = pixmap.Rh0().asIntBuffer();
                if (pixelMode == 1) {
                    for (int y = 0; y < rows; ++y) {
                        source.get(row);
                        int rowIndex = 0;
                        for (int x = 0; x < width; x += 8) {
                            int value = row[rowIndex++];
                            int bitCount = Math.min(8, width - x);
                            for (int bit = 0; bit < bitCount; ++bit) {
                                pixels[x + bit] = (value & (1 << (7 - bit))) != 0 ? rgba : 0;
                            }
                        }
                        out.put(pixels);
                    }
                } else {
                    int rgb = rgba & -256;
                    int alpha = rgba & 255;
                    for (int y = 0; y < rows; ++y) {
                        source.get(row);
                        for (int x = 0; x < width; ++x) {
                            int value = row[x] & 255;
                            if (value == 0) {
                                pixels[x] = rgb;
                            } else if (value == 255) {
                                pixels[x] = rgb | alpha;
                            } else {
                                pixels[x] = rgb | (int)(alpha * (float)Math.pow((float)value / 255.0F, gamma));
                            }
                        }
                        out.put(pixels);
                    }
                }
            }

            if (format != pixmap.rH0()) {
                i4_0 converted = new i4_0(pixmap.XF.SH, pixmap.XF.mB0, format);
                converted.Pa0(DF0.Ha0);
                converted.NH0(pixmap, 0, 0);
                converted.Pa0(DF0.Is);
                pixmap.dispose();
                pixmap = converted;
            }
            return pixmap;
        }
    }

    public static class Size extends Jf {
        public Size(long handle) {
            super(handle);
        }

        private static native long getMetrics(long handle);

        public final SizeMetrics uA0() {
            return new SizeMetrics(getMetrics(this.bx));
        }
    }

    public static class SizeMetrics extends Jf {
        public SizeMetrics(long handle) {
            super(handle);
        }

        private static native int getAscender(long handle);
        private static native int getDescender(long handle);
        private static native int getHeight(long handle);

        public final int CV() {
            return getAscender(this.bx);
        }

        public final int qM() {
            return getDescender(this.bx);
        }

        public final int d40() {
            return getHeight(this.bx);
        }
    }

    public static class Stroker extends Jf implements fy0_0 {
        public Stroker(long handle) {
            super(handle);
        }

        private static native void set(long stroker, int radius, int lineCap, int lineJoin, int miterLimit);
        private static native void done(long stroker);

        public final void Lpt1(int radius, int lineCap, int lineJoin) {
            set(this.bx, radius, lineCap, lineJoin, 0);
        }

        public final void dispose() {
            done(this.bx);
        }
    }
}
