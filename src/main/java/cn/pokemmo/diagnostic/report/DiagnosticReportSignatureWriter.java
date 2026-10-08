package cn.pokemmo.diagnostic.report;

import f.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;

public class DiagnosticReportSignatureWriter {
    public static final byte[] Gl = new byte[]{81, -109, 63, -32, 82, 99, 116, -50};
    public final Ge0 P60;
    public final long Hd;
    public final int a2;
    public final byte[] kh0;
    public final ByteArrayOutputStream p7;
    public boolean fm;

    public DiagnosticReportSignatureWriter(Ge0 ge0, long j, int i, byte[] bArr) {
        this.P60 = ge0;
        this.Hd = j;
        this.a2 = i;
        this.kh0 = bArr;
        this.p7 = new ByteArrayOutputStream(i);
    }

    public static void finally$(byte[] bArr, byte[] bArr2) throws SignatureException {
        try {
            PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(TI0.Kd("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEfwgFTAtxSO1n4iYtfYHueIKLX6krGCFA1mJuuPJzppxS3hCrsYYfjJUBjfBXZqAH3+YFebbn47nCGnEKa40Nrw==")));
            Signature signature = Signature.getInstance("SHA256withECDSA");
            signature.initVerify(generatePublic);
            signature.update(bArr);
            if (!signature.verify(bArr2)) {
                throw new SignatureException("Verification Failed");
            }
        } catch (SignatureException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public final void td(byte[] bArr) {
        if (this.fm) {
            return;
        }
        try {
            this.p7.write(bArr);
            if (this.p7.size() >= this.a2) {
                lpt5__5.hL.Com4.execute(this::gS);
            }
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            byte[] bytes = stringWriter.toString().getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) (bytes[i] ^ Gl[i % 8]);
            }
            ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 1);
            allocate.put((byte) 1);
            allocate.put(bytes);
            allocate.position(0);
            allocate.position(0);
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                this.P60.fk0.uQ(new com1__1(this.Hd, allocate, i2));
                if (i3 * 8000 >= allocate.limit()) {
                    break;
                }
                i2 = i3;
            }
            this.fm = true;
            if (this.P60 != null) {
                this.P60.ZE0 = null;
            }
        }
    }

    public final void gS() {
        try {
            byte[] byteArray = this.p7.toByteArray();
            for (int i = 0; i < byteArray.length; i++) {
                byteArray[i] = (byte) (byteArray[i] ^ Gl[i % 8]);
            }
            byte[] MH = FI.MH(byteArray);
            finally$(MH, this.kh0);
            ByteBuffer byteBuffer = null;
            File file = null;
            String str = "";
            if (ea0_1.T9) {
                byteBuffer = ByteBuffer.allocateDirect(MH.length);
                byteBuffer.put(MH);
            } else {
                file = File.createTempFile("tmp", ".tmp");
                str = file.getAbsolutePath();
                new Dn0(file).Al0(MH);
            }
            ByteBuffer kc = Gf.kc(byteBuffer, MH.length, str, this.Hd);
            kc.position(0);
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                this.P60.fk0.uQ(new com1__1(this.Hd, kc, i2));
                if (i3 * 8000 >= kc.limit()) {
                    break;
                }
                i2 = i3;
            }
            if (file != null && file.exists()) {
                file.delete();
            }
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            byte[] bytes = stringWriter.toString().getBytes(StandardCharsets.UTF_8);
            for (int i4 = 0; i4 < bytes.length; i4++) {
                bytes[i4] = (byte) (bytes[i4] ^ Gl[i4 % 8]);
            }
            ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 1);
            allocate.put((byte) 1);
            allocate.put(bytes);
            allocate.position(0);
            allocate.position(0);
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                this.P60.fk0.uQ(new com1__1(this.Hd, allocate, i5));
                if (i6 * 8000 >= allocate.limit()) {
                    break;
                }
                i5 = i6;
            }
        } finally {
            this.fm = true;
            if (this.P60 != null) {
                this.P60.ZE0 = null;
            }
        }
    }
}
