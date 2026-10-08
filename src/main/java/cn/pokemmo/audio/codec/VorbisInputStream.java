package cn.pokemmo.audio.codec;

import f.*;
import java.io.InputStream;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.lwjgl.BufferUtils;

public class VorbisInputStream extends InputStream {
    public int dv0;
    public final byte[] Da0;
    public final InputStream oH;
    public final i30_0 iJ;
    public boolean Y80;
    public final ld0_1 fi0;
    public final V50 r8;
    public final L20 Us;
    public final hj_0 jp0;
    public final CK0 Hn;
    public final Lz0 mf;
    public final w90_0 gI0;
    public int y00;
    public final boolean Zr0;
    public boolean rx;
    public boolean Yn;
    public int dk;
    public final ByteBuffer CF0;

    public VorbisInputStream(InputStream input) {
        this(input, null);
    }

    public VorbisInputStream(InputStream input, VorbisInputStream shared) {
        super();
        this.dv0 = 2048;
        this.iJ = new i30_0();
        this.fi0 = new ld0_1();
        this.r8 = new V50();
        this.Us = new L20();
        this.jp0 = new hj_0();
        this.Hn = new CK0();
        this.mf = new Lz0();
        this.gI0 = new w90_0(this.mf);
        this.y00 = 0;
        this.Zr0 = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
        this.rx = true;
        this.Yn = false;
        if (shared == null) {
            this.Da0 = new byte[this.dv0];
            this.CF0 = BufferUtils.createByteBuffer(2048000);
        } else {
            this.Da0 = shared.Da0;
            this.CF0 = shared.CF0;
        }
        this.oH = input;
        try {
            input.available();
        } catch (IOException ex) {
            throw new nf_1(ex);
        }
        this.kC();
    }

    public final int ql0() { return this.iJ.OF; }
    public final int oY() { return this.iJ.Ne0; }
    public final int available() { return this.Y80 ^ true ? 1 : 0; }

    public final int read() {
        if (this.dk >= this.CF0.position()) {
            this.CF0.clear();
            this.Eh0();
            this.dk = 0;
        }
        if (this.dk >= this.CF0.position()) return -1;
        int value = this.CF0.get(this.dk);
        if (value < 0) value += 256;
        ++this.dk;
        return value;
    }

    public final int read(byte[] buffer, int off, int len) {
        int index = 0;
        while (index < len) {
            int value = this.read();
            if (value < 0) return index == 0 ? -1 : index;
            buffer[index++] = (byte)value;
        }
        return len;
    }

    public final int read(byte[] buffer) { return this.read(buffer, 0, buffer.length); }
    public final void close() { KT.E1((Closeable)this.oH); }
    public final void kC() { this.fi0.getClass(); this.Eh0(); }

    public final void Eh0() {
        int wrote = 0;
        for (;;) {
        if (this.rx) {
            int index = this.fi0.Qy();
            if (index == -1) {
                this.fi0.Du = null;
                this.Y80 = true;
                return;
            }
            byte[] data = this.fi0.Du;
            if (data == null) {
                this.Y80 = true;
                return;
            }
            try {
                this.y00 = this.oH.read(data, index, 512);
            } catch (Exception ex) {
                throw new nf_1("Failure reading Vorbis.", ex);
            }
            int end = this.fi0.COm2 + this.y00;
            if (end <= this.fi0.Ox0) this.fi0.COm2 = end;
            if (this.fi0.jb(this.Us) != 1) {
                if (this.y00 < 512) {
                    this.fi0.Du = null;
                    this.Y80 = true;
                    return;
                }
                throw new nf_1("Input does not appear to be an Ogg bitstream.");
            }
            int serial = this.Us.mK();
            if (this.r8.ej0 == null) {
                this.r8.Dl();
            } else {
                Arrays.fill(this.r8.ej0, (byte)0);
                Arrays.fill(this.r8.dq0, 0);
                Arrays.fill(this.r8.f1, 0L);
            }
            this.r8.oG0 = serial;
            this.iJ.Ne0 = 0;
            this.Hn.WK = null;
            this.Hn.b60 = 0;
            this.Hn.Dm = null;
            if (this.r8.k1(this.Us) < 0) {
                throw new nf_1("Error reading first page of Ogg bitstream.");
            }
            if (this.r8.CA0(this.jp0) != 1) {
                throw new nf_1("Error reading initial header packet.");
            }
            if (this.iJ.Ja(this.Hn, this.jp0) < 0) {
                throw new nf_1("Ogg bitstream does not contain Vorbis audio data.");
            }
            int headers = 0;
            for (;;) {
                if (headers >= 2) break;
                pageScan:
                for (;;) {
                    if (headers >= 2) break;
                    int result = this.fi0.jb(this.Us);
                    if (result == 0) break;
                    if (result != 1) continue;
                    this.r8.k1(this.Us);
                    while (headers < 2) {
                        int packet = this.r8.CA0(this.jp0);
                        if (packet == 0) continue pageScan;
                        if (packet == -1) throw new nf_1("Corrupt secondary header.");
                        this.iJ.Ja(this.Hn, this.jp0);
                        ++headers;
                    }
                }
                index = this.fi0.Qy();
                if (index == -1) {
                    this.fi0.Du = null;
                    this.Y80 = true;
                    return;
                }
                try {
                    this.y00 = this.oH.read(this.fi0.Du, index, 512);
                } catch (Exception ex) {
                    throw new nf_1("Failed to read Vorbis.", ex);
                }
                if (this.y00 == 0 && headers < 2) {
                    throw new nf_1("End of file before finding all Vorbis headers.");
                }
                end = this.fi0.COm2 + this.y00;
                if (end <= this.fi0.Ox0) this.fi0.COm2 = end;
            }
            this.dv0 = 512 / this.iJ.OF;
            {
                i30_0 info = this.iJ;
                Lz0 dsp = this.mf;
                dsp.sg = info;
                int modeValue = info.v9;
                int modeBits = 0;
                while (modeValue > 1) {
                    ++modeBits;
                    modeValue >>>= 1;
                }
                dsp.H0 = modeBits;
                dsp.dH[0] = new Object[1];
                dsp.dH[1] = new Object[1];
                on_2 shortTransform = new on_2();
                shortTransform.Gb0(info.u5[0]);
                dsp.dH[0][0] = shortTransform;
                on_2 longTransform = new on_2();
                longTransform.Gb0(info.u5[1]);
                dsp.dH[1][0] = longTransform;
                dsp.EF0[0][0][0] = new float[1][];
                dsp.EF0[0][0][1] = dsp.EF0[0][0][0];
                dsp.EF0[0][1][0] = dsp.EF0[0][0][0];
                dsp.EF0[0][1][1] = dsp.EF0[0][0][0];
                dsp.EF0[1][0][0] = new float[1][];
                dsp.EF0[1][0][1] = new float[1][];
                dsp.EF0[1][1][0] = new float[1][];
                dsp.EF0[1][1][1] = new float[1][];
                dsp.EF0[0][0][0][0] = Lz0.xE0(info.u5[0], info.u5[0] / 2, info.u5[0] / 2);
                dsp.EF0[1][0][0][0] = Lz0.xE0(info.u5[1], info.u5[0] / 2, info.u5[0] / 2);
                dsp.EF0[1][0][1][0] = Lz0.xE0(info.u5[1], info.u5[0] / 2, info.u5[1] / 2);
                dsp.EF0[1][1][0][0] = Lz0.xE0(info.u5[1], info.u5[1] / 2, info.u5[0] / 2);
                dsp.EF0[1][1][1][0] = Lz0.xE0(info.u5[1], info.u5[1] / 2, info.u5[1] / 2);
                dsp.xY = new DP[info.LT];
                for (int i = 0; i < info.LT; ++i) {
                    DP codebook = new DP();
                    dsp.xY[i] = codebook;
                    lu_0 book = info.lPt9[i];
                    codebook.SH = book;
                    codebook.hU = book.BY;
                    codebook.yJ0 = book.jA;
                    float[] codebookValues;
                    if (book.kf0 != 1 && book.kf0 != 2) {
                        codebookValues = null;
                    } else {
                        int minMantissa = book.Y0 & 2097151;
                        int minExponent = (book.Y0 & 2145386496) >>> 21;
                        if ((book.Y0 & Integer.MIN_VALUE) != 0) minMantissa = -minMantissa;
                        float min = (float)(minMantissa * Math.pow(2.0D, minExponent - 788));
                        int deltaMantissa = book.zi0 & 2097151;
                        int deltaExponent = (book.zi0 & 2145386496) >>> 21;
                        if ((book.zi0 & Integer.MIN_VALUE) != 0) deltaMantissa = -deltaMantissa;
                        float delta = (float)(deltaMantissa * Math.pow(2.0D, deltaExponent - 788));
                        codebookValues = new float[book.BY * book.jA];
                        if (book.kf0 == 2) {
                            for (int entry = 0; entry < book.BY; ++entry) {
                                float last = 0.0F;
                                for (int dimension = 0; dimension < book.jA; ++dimension) {
                                    float resultValue = Math.abs((float)book.rl[entry * book.jA + dimension]) * delta + min + last;
                                    codebookValues[entry * book.jA + dimension] = resultValue;
                                    if (book.Xg != 0) last = resultValue;
                                }
                            }
                        } else {
                            int quantvals = book.Em();
                            for (int entry = 0; entry < book.BY; ++entry) {
                                float last = 0.0F;
                                int indexDivisor = 1;
                                for (int dimension = 0; dimension < book.jA; ++dimension) {
                                    int quantizedIndex = entry / indexDivisor % quantvals;
                                    float resultValue = Math.abs((float)book.rl[quantizedIndex]) * delta + min + last;
                                    codebookValues[entry * book.jA + dimension] = resultValue;
                                    if (book.Xg != 0) last = resultValue;
                                    indexDivisor *= quantvals;
                                }
                            }
                        }
                    }
                    codebook.cd = codebookValues;
                    int entries = book.BY;
                    int[] ptr0 = new int[entries * 2];
                    int[] ptr1 = new int[entries * 2];
                    int[] marker = new int[33];
                    int[] words = new int[entries];
                    for (int entry = 0; entry < entries; ++entry) {
                        int length = book.Ky0[entry];
                        if (length <= 0) continue;
                        int code = marker[length];
                        if (length < 32 && (code >>> length) != 0) {
                            words = null;
                            break;
                        }
                        words[entry] = code;
                        for (int markerIndex = length; markerIndex > 0; --markerIndex) {
                            if ((marker[markerIndex] & 1) != 0) {
                                marker[markerIndex] = markerIndex == 1 ? marker[1] + 1 : marker[markerIndex - 1] << 1;
                                break;
                            }
                            marker[markerIndex] = marker[markerIndex] + 1;
                    }
                    for (int markerIndex = length + 1; markerIndex < 33; ++markerIndex) {
                        int markerValue = marker[markerIndex];
                        if ((markerValue >>> 1) != code) break;
                        marker[markerIndex] = marker[markerIndex - 1] << 1;
                        code = markerValue;
                    }
                    }
                    if (words != null) {
                        for (int entry = 0; entry < entries; ++entry) {
                            int reversed = 0;
                            for (int bit = 0; bit < book.Ky0[entry]; ++bit) {
                                reversed = reversed << 1 | (words[entry] >>> bit & 1);
                            }
                            words[entry] = reversed;
                        }
                        int top = 0;
                        for (int entry = 0; entry < entries; ++entry) {
                            int length = book.Ky0[entry];
                            if (length <= 0) continue;
                            int ptr = 0;
                            for (int bit = 0; bit < length - 1; ++bit) {
                                if ((words[entry] >>> bit & 1) == 0) {
                                    if (ptr0[ptr] == 0) ptr0[ptr] = ++top;
                                    ptr = ptr0[ptr];
                                } else {
                                    if (ptr1[ptr] == 0) ptr1[ptr] = ++top;
                                    ptr = ptr1[ptr];
                                }
                            }
                            if ((words[entry] >>> (length - 1) & 1) == 0) ptr0[ptr] = -entry;
                            else ptr1[ptr] = -entry;
                        }
                        Sj0 tree = new Sj0();
                        tree.Ob0 = MB.iY(entries) - 4;
                        if (tree.Ob0 < 5) tree.Ob0 = 5;
                        int treeSize = 1 << tree.Ob0;
                        tree.JL0 = new int[treeSize];
                        tree.mi0 = new int[treeSize];
                        for (int treeValue = 0; treeValue < treeSize; ++treeValue) {
                            int ptr = 0;
                            int bits = 0;
                            for (; bits < tree.Ob0 && (ptr > 0 || bits == 0); ++bits) {
                                ptr = (treeValue & (1 << bits)) != 0 ? ptr1[ptr] : ptr0[ptr];
                            }
                            tree.JL0[treeValue] = ptr;
                            tree.mi0[treeValue] = bits;
                        }
                        tree.Zc0 = ptr0;
                        tree.e60 = ptr1;
                        codebook.Ic = tree;
                    } else {
                        codebook.Ic = null;
                    }
                }
                dsp.Na = 8192;
                dsp.Us0 = new float[info.OF][];
                for (int i = 0; i < info.OF; ++i) dsp.Us0[i] = new float[dsp.Na];
                dsp.ux = 0;
                dsp.X5 = 0;
                int center = info.u5[1] / 2;
                dsp.M00 = center;
                dsp.Fu0 = center;
                dsp.TS = new Object[info.v9];
                for (int i = 0; i < info.v9; ++i) {
                    d4_0 mode = info.mE[i];
                    int mappingIndex = info.AA[mode.switch$];
                    Object[] modeMappings = dsp.TS;
                    Object mappingExtension = yl0_1.qF0[mappingIndex];
                    Object mappingBackend = info.HB0[mode.switch$];
                    ((Yn0)mappingExtension).getClass();
                    i30_0 modeInfo = dsp.sg;
                    az_0 mapping = new az_0();
                    vZ mappingInfo = (vZ)mappingBackend;
                    mapping.f90 = mappingInfo;
                    mapping.Zi = mode;
                    int count = mappingInfo.a7;
                    mapping.Hh0 = new Object[count];
                    mapping.cv0 = new Object[count];
                    mapping.GI = new Object[count];
                    mapping.Kl0 = new cu_1[count];
                    mapping.uD0 = new DY[count];
                    mapping.Lj0 = new Jd0[count];
                    for (int submap = 0; submap < count; ++submap) {
                        int time = mappingInfo.pM[submap];
                        cu_1[] mappingChannels = mapping.Kl0;
                        cu_1 mappingChannel = cu_1.HA[modeInfo.Gu0[time]];
                        mappingChannels[submap] = mappingChannel;
                        Object[] mappingHeaders = mapping.Hh0;
                        Object ignoredZone = modeInfo.ZC[time];
                        mappingChannel.getClass();
                        mappingHeaders[submap] = "";
                        int floor = mappingInfo.OE[submap];
                        DY[] floorProcessors = mapping.uD0;
                        DY floorProcessor = DY.ye0[modeInfo.DQ[floor]];
                        floorProcessors[submap] = floorProcessor;
                        Object[] floorStates = mapping.cv0;
                        Object[] floorConfigs = modeInfo.qF0;
                        Object floorConfig = floorConfigs[floor];
                        floorStates[submap] = floorProcessor.d9(dsp, mode, floorConfig);
                        int residue = mappingInfo.E10[submap];
                        Jd0[] residueProcessors = mapping.Lj0;
                        Jd0 residueProcessor = Jd0.Du[modeInfo.gt[residue]];
                        residueProcessors[submap] = residueProcessor;
                        Object[] residueStates = mapping.GI;
                        Object residueBackend = modeInfo.RJ[residue];
                        ((TA)residueProcessor).getClass();
                        SL0 sl = (SL0)residueBackend;
                        ia_1 look = new ia_1();
                        look.sw0 = sl;
                        look.qp0 = sl.Ig;
                        look.Zc0 = dsp.xY;
                        look.Cq0 = dsp.xY[sl.this$];
                        look.QA0 = new int[look.qp0][];
                        int offset = 0;
                        int max = 0;
                        for (int partition = 0; partition < look.qp0; ++partition) {
                            int cascade = sl.rG[partition];
                            int bits = MB.iY(cascade);
                            if (bits > max) max = bits;
                            look.QA0[partition] = new int[bits];
                            for (int bit = 0; bit < bits; ++bit) {
                                if ((cascade & (1 << bit)) != 0) look.QA0[partition][bit] = sl.gD0[offset++];
                            }
                        }
                        int dimensions = look.Cq0.yJ0;
                        look.WF = (int)Math.rint(Math.pow(look.qp0, dimensions));
                        look.Oq = max;
                        look.kh = new int[look.WF][];
                        for (int partition = 0; partition < look.WF; ++partition) {
                            look.kh[partition] = new int[dimensions];
                            int n = partition;
                            int multiplier = look.WF / look.qp0;
                            for (int dimension = 0; dimension < dimensions; ++dimension) {
                                int partitionValue = n / multiplier;
                                n -= partitionValue * multiplier;
                                look.kh[partition][dimension] = partitionValue;
                                multiplier /= look.qp0;
                            }
                        }
                        residueStates[submap] = look;
                    }
                    modeInfo.getClass();
                    modeMappings[i] = mapping;
                }
                dsp.db0 = dsp.M00;
                dsp.M00 -= info.u5[dsp.X5] / 4 + info.u5[dsp.ux] / 4;
                dsp.dz0 = -1L;
                dsp.Vg0 = -1L;
            }
            this.gI0.cq0 = this.mf;
            this.rx = false;
        }
        if (!this.Yn) {
            this.Yn = true;
            return;
        }

        float[][][] holder = new float[1][][];
        int[] pcmIndex = new int[this.iJ.OF];
        while (!this.rx) {
            int result = this.fi0.jb(this.Us);
            if (result == 0) {
                this.y00 = 0;
                int moreIndex = this.fi0.Qy();
                if (moreIndex >= 0) {
                    try {
                        this.y00 = this.oH.read(this.fi0.Du, moreIndex, 512);
                    } catch (Exception ex) {
                        throw new nf_1("Error during Vorbis decoding.", ex);
                    }
                }
                int moreEnd = this.fi0.COm2 + this.y00;
                if (moreEnd <= this.fi0.Ox0) this.fi0.COm2 = moreEnd;
                if (this.y00 == 0) this.rx = true;
                continue;
            }
            if (result == -1) {
                lg_0.k.k7("gdx-audio", "Error reading OGG: Corrupt or missing data in bitstream.");
                continue;
            }
            this.r8.k1(this.Us);
            while (!this.rx) {
                int packet = this.r8.CA0(this.jp0);
                if (packet == 0) {
                    if ((this.Us.Lz0[this.Us.kf0 + 5] & 4) != 0) this.rx = true;
                    if (this.rx || wrote == 0) break;
                    return;
                }
                if (packet == -1) continue;
                if (this.gI0.BH(this.jp0) != 0) {
                    Lz0 dsp = this.mf;
                    while (dsp.db0 < dsp.M00) {
                        int samples = dsp.M00 - dsp.db0;
                        if (samples > this.dv0) samples = this.dv0;
                        float[][] pcm = dsp.Us0;
                        for (int channel = 0; channel < this.iJ.OF; ++channel) {
                            int ptr = channel * 2;
                            for (int sample = 0; sample < samples; ++sample) {
                                int value = (int)(pcm[channel][dsp.db0 + sample] * 32767.0D);
                                if (value > 32767) value = 32767;
                                if (value < -32768) value = -32768;
                                if (value < 0) value |= 32768;
                                if (this.Zr0) {
                                    this.Da0[ptr] = (byte)(value >>> 8);
                                    this.Da0[ptr + 1] = (byte)value;
                                } else {
                                    this.Da0[ptr] = (byte)value;
                                    this.Da0[ptr + 1] = (byte)(value >>> 8);
                                }
                                ptr += this.iJ.OF * 2;
                            }
                        }
                        int bytes = this.iJ.OF * 2 * samples;
                        if (bytes > this.CF0.remaining()) {
                            throw new nf_1(CO.go("Ogg block too big to be buffered: ", bytes, " :: ")
                                    .append(this.CF0.remaining()).toString());
                        }
                        this.CF0.put(this.Da0, 0, bytes);
                        dsp.db0 += samples;
                        wrote = 1;
                    }
                    continue;
                }
                Lz0 dsp = this.mf;
                w90_0 decoder = this.gI0;
                int oldM00 = dsp.M00;
                int blockHalf = dsp.sg.u5[1] / 2;
                if (dsp.db0 > 8192 && oldM00 > blockHalf) {
                    int shift = Math.min(dsp.db0, oldM00 - blockHalf);
                    dsp.db0 -= shift;
                    dsp.M00 -= shift;
                    dsp.Fu0 -= shift;
                    if (shift != 0) {
                        for (int channel = 0; channel < dsp.sg.OF; ++channel) {
                            System.arraycopy(dsp.Us0[channel], shift, dsp.Us0[channel], 0, dsp.Fu0);
                        }
                    }
                }
                dsp.ux = dsp.X5;
                dsp.X5 = decoder.ki0;
                if (dsp.Vg0 + 1L != decoder.Hs) dsp.dz0 = -1L;
                dsp.Vg0 = decoder.Hs;
                int size = dsp.sg.u5[dsp.X5];
                int center = dsp.M00 + dsp.sg.u5[dsp.ux] / 4 + size / 4;
                int begin = center - size / 2;
                int endBlock = begin + size;
                if (endBlock > dsp.Na) {
                    dsp.Na = endBlock + dsp.sg.u5[1];
                    for (int channel = 0; channel < dsp.sg.OF; ++channel) {
                        float[] expanded = new float[dsp.Na];
                        System.arraycopy(dsp.Us0[channel], 0, expanded, 0, dsp.Us0[channel].length);
                        dsp.Us0[channel] = expanded;
                    }
                }
                int left = dsp.X5 == 0 ? 0 : dsp.sg.u5[1] / 4 - dsp.sg.u5[dsp.ux] / 4;
                int right = dsp.X5 == 0 ? dsp.sg.u5[0] / 2 : left + dsp.sg.u5[dsp.ux] / 2;
                for (int channel = 0; channel < dsp.sg.OF; ++channel) {
                    float[] out = dsp.Us0[channel];
                    float[] in = decoder.BV[channel];
                    int sample = 0;
                    for (sample = left; sample < right; ++sample) out[begin + sample] += in[sample];
                    for (; sample < size; ++sample) out[begin + sample] = in[sample];
                }
                if (dsp.dz0 == -1L) {
                    dsp.dz0 = decoder.O9;
                } else {
                    dsp.dz0 += center - dsp.M00;
                    if (decoder.O9 != -1L && dsp.dz0 != decoder.O9) {
                        if (dsp.dz0 > decoder.O9 && decoder.wA != 0) center -= (int)(dsp.dz0 - decoder.O9);
                        dsp.dz0 = decoder.O9;
                    }
                }
                dsp.M00 = center;
                dsp.Fu0 = endBlock;
                while (dsp.db0 < dsp.M00) {
                    int samples = dsp.M00 - dsp.db0;
                    if (samples > this.dv0) samples = this.dv0;
                    float[][] pcm = dsp.Us0;
                    for (int channel = 0; channel < this.iJ.OF; ++channel) {
                        int ptr = channel * 2;
                        for (int sample = 0; sample < samples; ++sample) {
                            int value = (int)(pcm[channel][dsp.db0 + sample] * 32767.0D);
                            if (value > 32767) value = 32767;
                            if (value < -32768) value = -32768;
                            if (value < 0) value |= 32768;
                            if (this.Zr0) {
                                this.Da0[ptr] = (byte)(value >>> 8);
                                this.Da0[ptr + 1] = (byte)value;
                            } else {
                                this.Da0[ptr] = (byte)value;
                                this.Da0[ptr + 1] = (byte)(value >>> 8);
                            }
                            ptr += this.iJ.OF * 2;
                        }
                    }
                    int bytes = this.iJ.OF * 2 * samples;
                    if (bytes > this.CF0.remaining()) {
                        throw new nf_1(CO.go("Ogg block too big to be buffered: ", bytes, " :: ")
                                .append(this.CF0.remaining()).toString());
                    }
                    this.CF0.put(this.Da0, 0, bytes);
                    dsp.db0 += samples;
                    wrote = 1;
                }
            }
        }
        this.r8.ej0 = null;
        this.r8.dq0 = null;
        this.r8.f1 = null;
        Lz0 ignoredDecoderState = this.gI0.cq0;
        this.mf.getClass();
        this.iJ.ac();
        this.rx = true;
        continue;
        }
    }

}
