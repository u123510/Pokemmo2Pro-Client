/*
 * Reconstructed from bytecode (javap -c -p).
 * CFR 0.152 failed on this method ("Back jump on a try block").
 * Original bytecode also performs `getstatic f/_continue.Zc0; pop`
 * (a class-initialisation trigger); omitted here since Zc0 is a
 * compile-time constant and f/_continue is initialised elsewhere.
 */
package cn.pokemmo.net.compress;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public abstract class GzipPacketDecompressor {
    public static byte[] MH(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n2);
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray, n, n2);
             GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream)) {
            byte[] byArray2 = new byte[4096];
            int n3;
            while ((n3 = gZIPInputStream.read(byArray2)) != -1) {
                byteArrayOutputStream.write(byArray2, 0, n3);
            }
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }
}
