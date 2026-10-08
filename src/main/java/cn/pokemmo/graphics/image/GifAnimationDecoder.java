package cn.pokemmo.graphics.image;

import f.*;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Vector;

public class GifAnimationDecoder extends CG {

    public InputStream J00;
    public int WB0;
    public int W30;
    public int Lw0;
    public boolean Xs0;
    public int Rp;
    public int[] tQ;
    public int[] Z90;
    public int MG;
    public int lI;
    public int Tg;
    public boolean lz0;
    public boolean b70;
    public int LpT2;
    public int Bj;
    public int rc;
    public int ts;
    public int yn0;
    public int HF;
    public int M1;
    public int hN;
    public at_1 Uo0;
    public at_1 Rf0;
    public final byte[] Ta0;
    public int t7;
    public int Ti0;
    public int lx;
    public boolean ph0;
    public int Lpt7;
    public int Wy;
    public short[] FD;
    public byte[] pD0;
    public byte[] ij0;
    public byte[] iL;
    public Vector No;
    public int kl0;
    public boolean La;

    public GifAnimationDecoder() {
        super();
        this.Ta0 = new byte[256];
        this.t7 = 0;
        this.Ti0 = 0;
        this.lx = 0;
        this.ph0 = false;
        this.Lpt7 = 0;
        this.La = false;
    }

    public final int HY() {
        return this.kl0;
    }

    public final int Qc(BufferedInputStream v1) {
        this.WB0 = 0;
        this.kl0 = 0;
        this.No = new Vector();
        this.tQ = null;
        if (v1 != null) {
            this.J00 = v1;
            String v2 = "";
            for (int i3 = 0; i3 < 6; i3++) {
                v2 = v2 + (char) Oi0();
            }
            if (!v2.startsWith("GIF")) {
                this.WB0 = 1;
            } else {
                this.W30 = Xl0();
                this.Lw0 = Xl0();
                int i2 = Oi0();
                this.Xs0 = (i2 & 128) != 0;
                this.Rp = 2 << (i2 & 7);
                this.MG = Oi0();
                Oi0();
                if (this.Xs0 && !Jb0()) {
                    this.tQ = ET(this.Rp);
                    this.lI = this.tQ[this.MG];
                }
            }

            if (!Jb0()) {
                boolean done = false;
                while (!done && !Jb0()) {
                    int i3 = Oi0();
                    if (i3 == 33) {
                        int ext = Oi0();
                        if (ext == 1) {
                            while (Ht() > 0 && !Jb0()) {
                            }
                        } else if (ext == 249) {
                            Oi0();
                            int flags = Oi0();
                            this.Ti0 = (flags & 28) >> 2;
                            if (this.Ti0 == 0) {
                                this.Ti0 = 1;
                            }
                            this.ph0 = (flags & 1) != 0;
                            this.Lpt7 = Xl0() * 10;
                            this.Wy = Oi0();
                            Oi0();
                        } else if (ext == 254) {
                            while (Ht() > 0 && !Jb0()) {
                            }
                        } else if (ext == 255) {
                            Ht();
                            String app = "";
                            for (int k = 0; k < 11; k++) {
                                app = app + (char) this.Ta0[k];
                            }
                            if ("NETSCAPE2.0".equals(app)) {
                                while (Ht() > 0 && !Jb0()) {
                                    if (this.Ta0[0] == 1) {
                                        byte b1 = this.Ta0[1];
                                        byte b2 = this.Ta0[2];
                                    }
                                }
                            } else {
                                while (Ht() > 0 && !Jb0()) {
                                }
                            }
                        } else {
                            while (Ht() > 0 && !Jb0()) {
                            }
                        }
                    } else if (i3 == 44) {
                        this.LpT2 = Xl0();
                        this.Bj = Xl0();
                        this.rc = Xl0();
                        this.ts = Xl0();
                        int flags = Oi0();
                        this.lz0 = (flags & 128) != 0;
                        int lctSize = (int) Math.pow(2.0, (double) ((flags & 7) + 1));
                        this.b70 = (flags & 64) != 0;
                        if (this.lz0) {
                            this.Z90 = ET(lctSize);
                        } else {
                            this.Z90 = this.tQ;
                            if (this.MG == this.Wy) {
                                this.lI = 0;
                            }
                        }
                        int saveTransCol = 0;
                        if (this.ph0) {
                            saveTransCol = this.Z90[this.Wy];
                            this.Z90[this.Wy] = 0;
                        }
                        if (this.Z90 == null) {
                            this.WB0 = 1;
                        }
                        if (!Jb0()) {
                            int i5_total = this.rc * this.ts;
                            if (this.iL == null || this.iL.length < i5_total) {
                                this.iL = new byte[i5_total];
                            }
                            if (this.FD == null) {
                                this.FD = new short[4096];
                            }
                            if (this.pD0 == null) {
                                this.pD0 = new byte[4096];
                            }
                            if (this.ij0 == null) {
                                this.ij0 = new byte[4097];
                            }
                            int dataSize = Oi0();
                            int clearCode = 1 << dataSize;
                            int endCode = clearCode + 1;
                            int available = clearCode + 2;
                            int codeSize = dataSize + 1;
                            int codeMask = (1 << codeSize) - 1;
                            for (int code = 0; code < clearCode; code++) {
                                this.FD[code] = 0;
                                this.pD0[code] = (byte) code;
                            }
                            int bi = 0;
                            int pi = 0;
                            int top = 0;
                            int first = 0;
                            int count = 0;
                            int bits = 0;
                            int datum = 0;
                            int oldCode = -1;
                            int code = 0;

                            for (int i = 0; i < i5_total; ) {
                                if (top == 0) {
                                    if (bits < codeSize) {
                                        if (count == 0) {
                                            count = Ht();
                                            if (count <= 0) {
                                                break;
                                            }
                                            bi = 0;
                                        }
                                        datum += (this.Ta0[bi] & 0xFF) << bits;
                                        bits += 8;
                                        bi++;
                                        count--;
                                        continue;
                                    }
                                    code = datum & codeMask;
                                    datum >>= codeSize;
                                    bits -= codeSize;
                                    if (code > available || code == endCode) {
                                        break;
                                    }
                                    if (code == clearCode) {
                                        codeSize = dataSize + 1;
                                        codeMask = (1 << codeSize) - 1;
                                        available = clearCode + 2;
                                        oldCode = -1;
                                        continue;
                                    }
                                    if (oldCode == -1) {
                                        this.ij0[top++] = this.pD0[code];
                                        oldCode = code;
                                        first = code;
                                        continue;
                                    }
                                    int inCode = code;
                                    if (code == available) {
                                        this.ij0[top++] = (byte) first;
                                        code = oldCode;
                                    }
                                    while (code > clearCode) {
                                        this.ij0[top++] = this.pD0[code];
                                        code = this.FD[code];
                                    }
                                    first = this.pD0[code] & 0xFF;
                                    if (available >= 4096) {
                                        break;
                                    }
                                    this.ij0[top++] = (byte) first;
                                    this.FD[available] = (short) oldCode;
                                    this.pD0[available] = (byte) first;
                                    available++;
                                    if ((available & codeMask) == 0 && available < 4096) {
                                        codeSize++;
                                        codeMask += available;
                                    }
                                    oldCode = inCode;
                                }
                                top--;
                                this.iL[pi++] = this.ij0[top];
                                i++;
                            }
                            for (int i = pi; i < i5_total; i++) {
                                this.iL[i] = 0;
                            }
                            while (Ht() > 0 && !Jb0()) {
                            }

                            if (!Jb0()) {
                                int frameIdx = this.kl0;
                                this.kl0 = frameIdx + 1;
                                int[] pixels = new int[this.W30 * this.Lw0];
                                int prevDisposal = this.lx;
                                if (prevDisposal > 0) {
                                    if (prevDisposal == 3) {
                                        int pIdx = frameIdx - 2;
                                        if (pIdx > 0) {
                                            this.Rf0 = ((dv_0) this.No.elementAt(pIdx % (frameIdx + 1))).hv;
                                        } else {
                                            this.Rf0 = null;
                                        }
                                    }
                                    if (this.Rf0 != null) {
                                        ByteBuffer bb = this.Rf0.Rh0();
                                        int srcW = this.W30;
                                        int srcH = this.Lw0;
                                        int d = 0;
                                        for (int y = 0; y < srcH; y++) {
                                            for (int x = 0; x < srcW; x++) {
                                                int val = bb.getInt((y * srcW + x) * 4);
                                                pixels[d++] = ((val >> 8) & 0x00FFFFFF) | ((val << 24) & 0xFF000000);
                                            }
                                        }
                                    }
                                    if (this.lx == 2) {
                                        int clearColor = this.ph0 ? 0 : this.Tg;
                                        for (int y = 0; y < this.hN; y++) {
                                            int lineStart = (this.HF + y) * this.W30 + this.yn0;
                                            int lineEnd = lineStart + this.M1;
                                            for (int p = lineStart; p < lineEnd; p++) {
                                                pixels[p] = clearColor;
                                            }
                                        }
                                    }
                                }

                                int pass = 1;
                                int inc = 8;
                                int iline = 0;
                                for (int i = 0; i < this.ts; i++) {
                                    int line = i;
                                    if (this.b70) {
                                        if (iline >= this.ts) {
                                            pass++;
                                            switch (pass) {
                                                case 2:
                                                    iline = 4;
                                                    break;
                                                case 3:
                                                    iline = 2;
                                                    inc = 4;
                                                    break;
                                                case 4:
                                                    iline = 1;
                                                    inc = 2;
                                                    break;
                                            }
                                        }
                                        line = iline;
                                        iline += inc;
                                    }
                                    line += this.Bj;
                                    if (line < this.Lw0) {
                                        int k = line * this.W30;
                                        int dx = k + this.LpT2;
                                        int dlim = dx + this.rc;
                                        if (k + this.W30 < dlim) {
                                            dlim = k + this.W30;
                                        }
                                        int sx = i * this.rc;
                                        while (dx < dlim) {
                                            int index = this.iL[sx++] & 0xFF;
                                            int c = this.Z90[index];
                                            if (c != 0) {
                                                pixels[dx] = c;
                                            }
                                            dx++;
                                        }
                                    }
                                }

                                at_1 frameImg = new at_1(pixels, this.W30, this.Lw0, ix0_0.Vw);
                                this.Uo0 = frameImg;
                                this.No.addElement(new dv_0(frameImg, this.Lpt7));
                                if (this.ph0) {
                                    this.Z90[this.Wy] = saveTransCol;
                                }
                                this.lx = this.Ti0;
                                this.yn0 = this.LpT2;
                                this.HF = this.Bj;
                                this.M1 = this.rc;
                                this.hN = this.ts;
                                this.Rf0 = this.Uo0;
                                this.Tg = this.lI;
                                this.Ti0 = 0;
                                this.ph0 = false;
                                this.Lpt7 = 0;
                            }
                        }
                    } else if (i3 == 59) {
                        done = true;
                    } else {
                        this.WB0 = 1;
                    }
                }
            }
            if (this.kl0 < 0) {
                this.WB0 = 1;
            }
        } else {
            this.WB0 = 2;
        }
        try {
            if (v1 != null) {
                v1.close();
            }
        } catch (Exception ignored) {
        }
        return this.WB0;
    }

    public final boolean Jb0() {
        return this.WB0 != 0;
    }

    public final int Oi0() {
        int i1 = 0;
        try {
            i1 = this.J00.read();
        } catch (Exception ignored) {
            this.WB0 = 1;
        }
        return i1;
    }

    public final int Ht() {
        this.t7 = Oi0();
        int i1 = 0;
        if (this.t7 > 0) {
            try {
                while (i1 < this.t7) {
                    int i3 = this.t7 - i1;
                    int i2 = this.J00.read(this.Ta0, i1, i3);
                    if (i2 == -1) {
                        break;
                    }
                    i1 += i2;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (i1 < this.t7) {
                this.WB0 = 1;
            }
        }
        return i1;
    }

    public final int[] ET(int i1) {
        int i2 = i1 * 3;
        int[] v3 = null;
        byte[] v4 = new byte[i2];
        int i5 = 0;
        try {
            i5 = this.J00.read(v4);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i5 < i2) {
            this.WB0 = 1;
        } else {
            v3 = new int[256];
            int i0 = 0;
            int idx = 0;
            while (i0 < i1) {
                int r = v4[idx++] & 0xFF;
                int g = v4[idx++] & 0xFF;
                int b = v4[idx++] & 0xFF;
                v3[i0++] = 0xFF000000 | (r << 16) | (g << 8) | b;
            }
        }
        return v3;
    }

    public final int Xl0() {
        return Oi0() | (Oi0() << 8);
    }

    @Override
    public final void ji0() {
        if (this.La) {
            return;
        }
        this.La = true;
        try {
            at_1 v1 = this.Uo0;
            if (v1 != null) {
                v1.dispose();
                this.Uo0 = null;
            }
        } catch (Exception ignored) {
        }
        try {
            at_1 v1 = this.Rf0;
            if (v1 != null) {
                v1.dispose();
                this.Rf0 = null;
            }
        } catch (Exception ignored) {
        }
        try {
            Iterator it = this.No.iterator();
            while (it.hasNext()) {
                ((dv_0) it.next()).hv.dispose();
            }
        } catch (Exception ignored) {
        }
        this.No.clear();
    }
}
