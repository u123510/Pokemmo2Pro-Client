package cn.pokemmo.io.binary;

import f.*;
import cn.pokemmo.io.util.StreamIoUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.zip.InflaterInputStream;

public class BinaryDataReader {
    public static i4_0 readPixmap(Dn0 dn0) {
        DataInputStream dataInputStream = new DataInputStream(new InflaterInputStream(new BufferedInputStream(dn0.uf0())));
        try {
            int n = dataInputStream.readInt();
            int n2 = dataInputStream.readInt();
            ix0_0 ix0_02 = ix0_0.Xt(dataInputStream.readInt());
            i4_0 i4_02 = new i4_0(n, n2, ix0_02);
            ByteBuffer byteBuffer = i4_02.Rh0();
            byteBuffer.position(0);
            byteBuffer.limit(byteBuffer.capacity());
            synchronized (yo0_0.NUl) {
                int n3;
                while ((n3 = dataInputStream.read(yo0_0.NUl)) > 0) {
                    byteBuffer.put(yo0_0.NUl, 0, n3);
                }
            }
            byteBuffer.position(0);
            byteBuffer.limit(byteBuffer.capacity());
            StreamIoUtils.closeQuietly(dataInputStream);
            return i4_02;
        } catch (Exception exception) {
            throw new nf_1("Couldn't read Pixmap from file '" + dn0 + "'", exception);
        }
    }

    public static void writePng(Dn0 dn0, i4_0 i4_02) {
        try {
            kc_2 kc_22 = new kc_2((int) (i4_02.XF.SH * i4_02.XF.mB0 * 1.5f));
            try {
                kc_22.lx0 = false;
                kc_22.fr.setLevel(-1);
                OutputStream outputStream = dn0.OC0();
                try {
                    kc_22.bC(outputStream, i4_02);
                } finally {
                    StreamIoUtils.closeQuietly(outputStream);
                }
                kc_22.fr.end();
            } finally {
                kc_22.fr.end();
            }
        } catch (IOException iOException) {
            throw new nf_1("Error writing PNG: " + dn0, iOException);
        }
    }
}
