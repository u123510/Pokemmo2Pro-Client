package cn.pokemmo.net.nio.worker;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class SntpTimeSyncClient {
    public static final dl_1 TU = Cq0.E1(SntpTimeSyncClient.class);
    public long jk;
    public long r60;

    public SntpTimeSyncClient() {
    }

    public static void lX(byte b, byte b2, int i, long j, long j2) throws nl0_1 {
        if (b == 3) {
            throw new nl0_1("unsynchronized server");
        }
        if (b2 != 4 && b2 != 5) {
            throw new nl0_1("untrusted mode: " + ((int) b2));
        }
        if (i == 0 || i > 15) {
            throw new nl0_1("untrusted stratum: " + i);
        }
        if (j == 0L) {
            throw new nl0_1("zero transmitTime");
        }
        if (j2 == 0L) {
            throw new nl0_1("zero reference timestamp");
        }
    }

    public static long tR(byte[] bArr, int i) {
        int b0 = bArr[i];
        int b1 = bArr[i + 1];
        int b2 = bArr[i + 2];
        int b3 = bArr[i + 3];
        if ((b0 & 128) == 128) {
            b0 = (b0 & 127) + 128;
        }
        if ((b1 & 128) == 128) {
            b1 = (b1 & 127) + 128;
        }
        if ((b2 & 128) == 128) {
            b2 = (b2 & 127) + 128;
        }
        if ((b3 & 128) == 128) {
            b3 = (b3 & 127) + 128;
        }
        return (((long) b0) << 24) + (((long) b1) << 16) + (((long) b2) << 8) + ((long) b3);
    }

    public static long m20(byte[] bArr, int i) {
        long seconds = tR(bArr, i);
        long fraction = tR(bArr, i + 4);
        if (seconds == 0L && fraction == 0L) {
            return 0L;
        }
        long ms = (seconds - 2208988800L) * 1000L;
        return ms + ((fraction * 1000L) / 4294967296L);
    }

    public static void goto$(byte[] bArr, long j) {
        if (j == 0L) {
            Arrays.fill(bArr, 40, 48, (byte) 0);
            return;
        }
        long j2 = j / 1000L;
        long j3 = j - (j2 * 1000L);
        long j4 = j2 + 2208988800L;
        bArr[40] = (byte) ((int) (j4 >> 24));
        bArr[41] = (byte) ((int) (j4 >> 16));
        bArr[42] = (byte) ((int) (j4 >> 8));
        bArr[43] = (byte) ((int) j4);
        long j5 = (j3 * 4294967296L) / 1000L;
        bArr[44] = (byte) ((int) (j5 >> 24));
        bArr[45] = (byte) ((int) (j5 >> 16));
        bArr[46] = (byte) ((int) (j5 >> 8));
        bArr[47] = (byte) ((int) (Math.random() * 255.0d));
    }

    public final boolean z8(InetAddress inetAddress) {
        DatagramSocket datagramSocket = null;
        try {
            datagramSocket = new DatagramSocket();
            datagramSocket.setSoTimeout(1000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, inetAddress, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long convert = TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
            goto$(bArr, convert);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long convert2 = TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
            long j = currentTimeMillis + (convert2 - convert);
            byte b = (byte) ((bArr[0] >> 6) & 3);
            byte b2 = (byte) (bArr[0] & 7);
            int i = bArr[1] & 255;
            long m20 = m20(bArr, 24);
            long m202 = m20(bArr, 32);
            long m203 = m20(bArr, 40);
            long m204 = m20(bArr, 16);
            lX(b, b2, i, m203, m204);
            long j2 = ((m202 - m20) + (m203 - j)) / 2;
            TU.getClass();
            this.jk = j + j2;
            this.r60 = convert2;
            return true;
        } catch (Exception e) {
            TU.getClass();
            String.valueOf(e);
            return false;
        } finally {
            if (datagramSocket != null) {
                datagramSocket.close();
            }
        }
    }
}
