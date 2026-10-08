package cn.pokemmo.audio.mp3;

import f.*;
public class MpegAudioFrameHeader {
    public static final int[][] FK0 = {{22050, 24000, 16000, 1}, {44100, 48000, 32000, 1}, {11025, 12000, 8000, 1}};
    public static final int[][][] JF0 = {
        {{0, 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000, 0},
         {0, 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 0},
         {0, 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 0}},
        {{0, 32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000, 0},
         {0, 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000, 0},
         {0, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 0}},
        {{0, 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000, 0},
         {0, 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 0},
         {0, 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 0}}
    };
    public static final String[][][] gF = stringTables();
    public int t90;
    public int Ul0;
    public int xc;
    public int z4;
    public int wn;
    public int fJ;
    public int gg0;
    public int yZ;
    public int zg0;
    public final double[] KL0 = {-1.0, 384.0, 1152.0, 1152.0};
    public boolean WG;
    public int N0;
    public int Gc0;
    public byte[] I2;
    public byte Kp;
    public AE0 cz;
    public short wA0;
    public int et0;
    public int import$;

    private static String[][][] stringTables() {
        String[][][] result = new String[3][3][16];
        for (int version = 0; version < result.length; version++) {
            for (int layer = 0; layer < result[version].length; layer++) {
                for (int index = 0; index < 16; index++) {
                    result[version][layer][index] = index == 0 ? "free format" : index == 15 ? "forbidden" : (JF0[version][layer][index] / 1000) + " kbit/s";
                }
            }
        }
        return result;
    }

    @Override
    public final String toString() {
        String layer = this.t90 == 1 ? "I" : this.t90 == 2 ? "II" : this.t90 == 3 ? "III" : null;
        String mode = this.fJ == 0 ? "Stereo" : this.fJ == 1 ? "Joint stereo" : this.fJ == 2 ? "Dual channel" : this.fJ == 3 ? "Single channel" : null;
        String version = this.wn == 0 ? "MPEG-2 LSF" : this.wn == 1 ? "MPEG-1" : this.wn == 2 ? "MPEG-2.5 LSF" : null;
        StringBuilder result = new StringBuilder(200).append("Layer ").append(layer).append(" frame ").append(mode).append(' ').append(version);
        if (this.Ul0 != 0) result.append(" no");
        result.append(" checksums ");
        int frequency = FK0[this.wn][this.gg0];
        result.append(frequency == 44100 ? "44.1 kHz" : frequency == 48000 ? "48 kHz" : frequency == 32000 ? "32 kHz" : frequency == 24000 ? "24 kHz" : frequency == 22050 ? "22.05 kHz" : frequency == 16000 ? "16 kHz" : frequency == 12000 ? "12 kHz" : frequency == 11025 ? "11.025 kHz" : "8 kHz");
        result.append(", ");
        if (this.WG) {
            int bitrate = this.Gc0 == 0 ? 0 : (int)((this.Gc0 * 8.0f) / ((float)(this.KL0[this.t90] / FK0[this.wn][this.gg0]) * (this.wn == 0 || this.wn == 2 ? 500.0f : 1000.0f) * this.N0));
            result.append(bitrate / 1000).append(" kb/s");
        } else {
            result.append(gF[this.wn][this.t90 - 1][this.xc]);
        }
        return result.toString();
    }

    public final void En(byte[] data) {
        byte[] word = new byte[4];
        int offset = this.wn == 1 ? (this.fJ == 3 ? 17 : 32) : (this.fJ == 3 ? 9 : 17);
        try {
            System.arraycopy(data, offset, word, 0, 4);
            if ("Xing".equals(new String(word))) {
                this.WG = true;
                this.N0 = -1;
                this.Gc0 = -1;
                this.I2 = new byte[100];
                byte[] flags = new byte[4];
                System.arraycopy(data, offset + 4, flags, 0, 4);
                int position = 8;
                if ((flags[3] & 1) != 0) {
                    this.N0 = readInt(data, offset + position);
                    position = 12;
                }
                if ((flags[3] & 2) != 0) {
                    this.Gc0 = readInt(data, offset + position);
                    position += 4;
                }
                if ((flags[3] & 4) != 0) {
                    System.arraycopy(data, offset + position, this.I2, 0, this.I2.length);
                }
                return;
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            throwUnchecked(new Go0("XingVBRHeader Corrupted", exception));
        }
        try {
            System.arraycopy(data, 32, word, 0, 4);
            if (!"VBRI".equals(new String(word))) return;
            this.WG = true;
            this.N0 = -1;
            this.Gc0 = -1;
            this.I2 = new byte[100];
            this.Gc0 = readInt(data, 42);
            this.N0 = readInt(data, 46);
        } catch (ArrayIndexOutOfBoundsException exception) {
            throwUnchecked(new Go0("VBRIVBRHeader Corrupted", exception));
        }
    }

    private static int readInt(byte[] values, int offset) {
        return values[offset] << 24 & 0xFF000000 | values[offset + 1] << 16 & 0xFF0000 | values[offset + 2] << 8 & 0xFF00 | values[offset + 3] & 0xFF;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwUnchecked(Throwable throwable) throws T {
        throw (T)throwable;
    }

    public final int TQ() { return this.wn; }
    public final int b20() { return this.gg0; }
    public final int ys0() { return this.fJ; }

    public final int sg() {
        if (this.gg0 == 2) return this.wn == 1 ? 32000 : this.wn == 0 ? 16000 : 8000;
        if (this.gg0 == 1) return this.wn == 1 ? 48000 : this.wn == 0 ? 24000 : 12000;
        if (this.gg0 == 0) return this.wn == 1 ? 44100 : this.wn == 0 ? 22050 : 11025;
        return 0;
    }
}
