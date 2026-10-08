package cn.pokemmo.io.buffer;

import f.*;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/**
 * 现代化重构类 - 原始类: f.wc_2
 */
public class MappedFileBufferResource implements fy0_0 {

    public static final dl_1 eg0;
    public final es_1 kl0;
    public final W70 ix0;
    public String x10;

    static {
        eg0 = Cq0.E1(MappedFileBufferResource.class);
        new C8();
    }

    public MappedFileBufferResource(W70 w70) {
        this.kl0 = new es_1();
        this.ix0 = w70;
    }

    @Override
    public final void dispose() {
        I2 i2 = this.kl0.ZD();
        while (i2.hasNext()) {
            pc0_0 pc0_02 = (pc0_0) i2.next();
            pc0_02.O4();
            I2 i22 = pc0_02.Gh.ZD();
            while (i22.hasNext()) {
                ((sf_1) i22.next()).dispose();
            }
        }
        this.kl0.clear();
        this.ix0.dispose();
    }

    public final boolean Con(VE vE, _else _else2) {
        this.dispose();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(vE.l00(), "r");
            FileChannel fileChannel = randomAccessFile.getChannel();
            ByteBuffer byteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile.length()).order(ByteOrder.nativeOrder());
            jk0_1 jk0_12 = new jk0_1(byteBuffer);
            randomAccessFile.close();

            int n = byteBuffer.getInt();
            if (n != 2) {
                throw new nf_1("Invalid version number: " + n);
            }

            byteBuffer.getInt();
            byteBuffer.getShort();
            gh_0.YC.BM(byteBuffer.get());
            this.x10 = jk0_12.TM();
            byteBuffer.getShort();
            byteBuffer.getShort();
            byteBuffer.getShort();
            byteBuffer.get();
            s4_0.Ai.BM(byteBuffer.get());
            tW.N8.BM(byteBuffer.get());

            short s = byteBuffer.getShort();
            eg0.info("Loading {} maps", Short.valueOf(s));

            for (short s2 = 0; s2 < s; s2 = (short) (s2 + 1)) {
                int n2 = byteBuffer.getInt();
                YM yM = null;
                wd_0 wd_02;
                if (_else2 == null) {
                    yM = new YM(vE);
                    wh0_2 wh0_22 = new wh0_2(byteBuffer);
                    if (wh0_22.ka == null) {
                        wh0_22.ka = wh0_22.LL(yM);
                        wh0_22.bp0 = yM;
                    }
                    wd_02 = wh0_22.ka;
                } else {
                    byteBuffer.position(byteBuffer.position() + n2);
                    wd_02 = new wd_0();
                    wd_02.Ku0 = this.x10;
                    wd_02.HE0 = new C8();
                    wd_02.lG = new C8();
                    wd_02.Xj = 1.0f;
                    wd_02.Wc0.Ue0(new Xz0());
                    wd_02.dispose();
                }

                float[] fArray = jk0_12.v();
                byte b = byteBuffer.get();
                short s3 = byteBuffer.getShort();
                short s4 = byteBuffer.getShort();
                m9[][][] m9Array = new m9[b][s3][s4];

                for (byte b2 = 0; b2 < b; b2 = (byte) (b2 + 1)) {
                    for (short s5 = 0; s5 < s3; s5 = (short) (s5 + 1)) {
                        for (short s6 = 0; s6 < s4; s6 = (short) (s6 + 1)) {
                            byte b3 = byteBuffer.get();
                            byte b4 = byteBuffer.get();
                            float f = byteBuffer.getFloat();
                            m9Array[b2][s5][s6] = new m9(_else2, b2, s5, s6, b3, b4, f);
                        }
                    }
                }

                int n3 = byteBuffer.getShort() & 0xFFFF;
                es_1 es_12 = new es_1(n3);
                pc0_0 pc0_02 = new pc0_0(wd_02, yM, m9Array, es_12);
                pc0_02.ho.Dd0(fArray);

                if (_else2 == null) {
                    for (int i = 0; i < n3; i++) {
                        byte b5 = byteBuffer.get();
                        byte b6 = byteBuffer.get();
                        MG0 mG0 = MG0.Xo0.dg(b6) ? (MG0) MG0.Xo0.BM(b6) : null;
                        byte b7 = byteBuffer.get();
                        int n4 = byteBuffer.get() & 0xFF;
                        sf_1 sf_12 = new sf_1(b5, mG0, b7, n4);
                        sf_12.u00 = this.ix0;
                        sf_12.Zw0 = pc0_02;
                        sf_12.Sy0();
                        jk0_12.MI(sf_12.oN);
                        if (jk0_12.bw0.get() == 4) {
                            sf_12.ZF0.m1 = jk0_12.bw0.getFloat();
                            sf_12.ZF0.ao0 = jk0_12.bw0.getFloat();
                            sf_12.ZF0.th = jk0_12.bw0.getFloat();
                            sf_12.ZF0.Au0 = jk0_12.bw0.getFloat();
                        }
                        jk0_12.MI(sf_12.MF0);
                        es_12.Ue0(sf_12);
                    }
                }

                this.kl0.Ue0(pc0_02);
            }
            return true;
        } catch (Exception exception) {
            eg0.error("Error loading map", exception);
            exception.getMessage();
            return false;
        }
    }
}
