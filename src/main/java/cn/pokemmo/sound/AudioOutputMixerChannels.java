package cn.pokemmo.sound;

import f.*;

public class AudioOutputMixerChannels {
    public bn_1 mO;
    public B7 b0;
    public B7 hP;
    public Pl0 VI;
    public r4_0 vC0;
    public id0_1 lc0;
    public boolean AB0;

    public AudioOutputMixerChannels() {
        super();
    }

    public final void D50(kk_1 reader, c50_0 format) {
        if (!this.AB0) {
            int count = format.fJ == 3 ? 1 : 2;
            if (this.mO == null) {
                throw new RuntimeException("Output buffer was not set.");
            }
            this.b0 = new B7(0);
            if (count == 2) {
                this.hP = new B7(1);
            }
            int[][] formatTable = c50_0.FK0;
            int ignoredFormat = formatTable[format.wn][format.gg0];
            this.AB0 = true;
        }
        MJ0 output = null;
        switch (format.t90) {
            case 1:
                if (this.lc0 == null) {
                    this.lc0 = new id0_1();
                    this.lc0.p4 = reader;
                    this.lc0.uR = format;
                    this.lc0.Rm = this.b0;
                    this.lc0.rc = this.hP;
                    this.lc0.o4 = this.mO;
                    this.lc0.A9 = 0;
                }
                output = this.lc0;
                break;
            case 2:
                if (this.vC0 == null) {
                    this.vC0 = new r4_0();
                    this.vC0.p4 = reader;
                    this.vC0.uR = format;
                    this.vC0.Rm = this.b0;
                    this.vC0.rc = this.hP;
                    this.vC0.o4 = this.mO;
                    this.vC0.A9 = 0;
                }
                output = this.vC0;
                break;
            case 3:
                if (this.VI == null) {
                    this.VI = new Pl0(reader, format, this.b0, this.hP, this.mO);
                }
                output = this.VI;
                break;
            default:
                break;
        }
        if (output != null) {
            output.a7();
            return;
        }
        AudioOutputMixerChannels.<RuntimeException>throwUnchecked(new dy_2(dy_2.vx0(513)));
    }

    public final void Du(bn_1 value) {
        this.mO = value;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwUnchecked(Throwable error) throws T {
        throw (T) error;
    }
}
