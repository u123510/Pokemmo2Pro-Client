package com.badlogic.gdx.graphics.g2d;

import f.fy0_0;
import f.nf_1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class Gdx2DPixmap implements fy0_0 {
    public long qf;
    public int SH;
    public int mB0;
    public int cW;
    public ByteBuffer o2;
    public long[] hi = new long[4];

    public static int abstract$(int format) {
        switch (format) {
            case 1:
                return 6406;
            case 2:
                return 6410;
            case 3:
            case 5:
                return 6407;
            case 4:
            case 6:
                return 6408;
            default:
                throw new nf_1("unknown format: " + format);
        }
    }

    public Gdx2DPixmap(byte[] encodedData, int offset, int len, int requestedFormat) {
        this.o2 = load(this.hi, encodedData, offset, len);
        if (this.o2 == null) throw sneaky(new IOException("Error loading pixmap: " + getFailureReason()));
        readNativeData();
        if (requestedFormat != 0 && requestedFormat != this.cW) BF0(requestedFormat);
    }

    public Gdx2DPixmap(ByteBuffer encodedData, int offset, int len, int requestedFormat) {
        if (!encodedData.isDirect()) throw sneaky(new IOException("Couldn't load pixmap from non-direct ByteBuffer"));
        this.o2 = loadByteBuffer(this.hi, encodedData, offset, len);
        if (this.o2 == null) throw sneaky(new IOException("Error loading pixmap: " + getFailureReason()));
        readNativeData();
        if (requestedFormat != 0 && requestedFormat != this.cW) BF0(requestedFormat);
    }

    public Gdx2DPixmap(InputStream in, int requestedFormat) {
        try {
            ByteArrayOutputStream bytes = new ByteArrayOutputStream(1024);
            byte[] buffer = new byte[1024];
            int readBytes;
            while ((readBytes = in.read(buffer)) != -1) bytes.write(buffer, 0, readBytes);
            buffer = bytes.toByteArray();
            this.o2 = load(this.hi, buffer, 0, buffer.length);
            if (this.o2 == null) throw new IOException("Error loading pixmap: " + getFailureReason());
            readNativeData();
            if (requestedFormat != 0 && requestedFormat != this.cW) BF0(requestedFormat);
        } catch (IOException e) {
            throw sneaky(e);
        }
    }

    public Gdx2DPixmap(int width, int height, int format) {
        this.o2 = newPixmap(this.hi, width, height, format);
        if (this.o2 == null) throw new nf_1("Unable to allocate memory for pixmap: " + width + "x" + height + ", " + Tx0(format));
        readNativeData();
    }

    public Gdx2DPixmap(ByteBuffer pixelPtr, long[] nativeData) {
        this.o2 = pixelPtr;
        this.qf = nativeData[0];
        this.SH = (int)nativeData[1];
        this.mB0 = (int)nativeData[2];
        this.cW = (int)nativeData[3];
    }

    private void readNativeData() {
        this.qf = this.hi[0];
        this.SH = (int)this.hi[1];
        this.mB0 = (int)this.hi[2];
        this.cW = (int)this.hi[3];
    }

    public static String Tx0(int format) {
        switch (format) {
            case 1:
                return "alpha";
            case 2:
                return "luminance alpha";
            case 3:
                return "rgb888";
            case 4:
                return "rgba8888";
            case 5:
                return "rgb565";
            case 6:
                return "rgba4444";
            default:
                return "unknown";
        }
    }

    private static native ByteBuffer load(long[] nativeData, byte[] buffer, int offset, int len);
    private static native ByteBuffer loadByteBuffer(long[] nativeData, ByteBuffer buffer, int offset, int len);
    private static native ByteBuffer newPixmap(long[] nativeData, int width, int height, int format);
    private static native void free(long pixmap);
    private static native void clear(long pixmap, int color);
    private static native void setPixel(long pixmap, int x, int y, int color);
    private static native int getPixel(long pixmap, int x, int y);
    private static native void drawRect(long pixmap, int x, int y, int width, int height, int color);
    private static native void fillRect(long pixmap, int x, int y, int width, int height, int color);
    private static native void fillCircle(long pixmap, int x, int y, int radius, int color);
    private static native void drawPixmap(long src, long dst, int srcX, int srcY, int srcWidth, int srcHeight, int dstX, int dstY, int dstWidth, int dstHeight);
    private static native void setBlend(long pixmap, int blend);
    private static native void setScale(long pixmap, int scale);
    public static native String getFailureReason();

    public final void BF0(int requestedFormat) {
        Gdx2DPixmap pixmap = new Gdx2DPixmap(this.SH, this.mB0, requestedFormat);
        pixmap.Fj0(0);
        pixmap.bJ(this, 0, 0, 0, 0, this.SH, this.mB0);
        dispose();
        this.qf = pixmap.qf;
        this.cW = pixmap.cW;
        this.mB0 = pixmap.mB0;
        this.hi = pixmap.hi;
        this.o2 = pixmap.o2;
        this.SH = pixmap.SH;
    }

    @Override
    public final void dispose() {
        free(this.qf);
    }

    public final void Vd(int color) {
        clear(this.qf, color);
    }

    public final void XS(int x, int y, int color) {
        setPixel(this.qf, x, y, color);
    }

    public final int iH0(int x, int y) {
        return getPixel(this.qf, x, y);
    }

    public final void bJ(Gdx2DPixmap src, int srcX, int srcY, int dstX, int dstY, int width, int height) {
        drawPixmap(src.qf, this.qf, srcX, srcY, width, height, dstX, dstY, width, height);
    }

    public final void Cg(Gdx2DPixmap src, int srcX, int srcY, int srcWidth, int srcHeight, int dstX, int dstY, int dstWidth, int dstHeight) {
        drawPixmap(src.qf, this.qf, srcX, srcY, srcWidth, srcHeight, dstX, dstY, dstWidth, dstHeight);
    }

    public final void Fj0(int blend) {
        setBlend(this.qf, blend);
    }

    public final void ts0(int scale) {
        setScale(this.qf, scale);
    }

    public final void HI0(int x, int color) {
        drawRect(this.qf, x, 0, 32, 32, color);
    }

    public final void DP(int color) {
        fillRect(this.qf, 0, 0, 4, 4, color);
    }

    public final void Kk(int color) {
        fillCircle(this.qf, 16, 12, 8, color);
    }

    private static RuntimeException sneaky(Throwable t) {
        Gdx2DPixmap.<RuntimeException>sneakyThrow(t);
        return null;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void sneakyThrow(Throwable t) throws T {
        throw (T)t;
    }
}
