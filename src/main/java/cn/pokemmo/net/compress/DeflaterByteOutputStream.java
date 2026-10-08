package cn.pokemmo.net.compress;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class DeflaterByteOutputStream implements fy0_0 {
    public static final byte[] A0;
    public final P20 Kk0;
    public final Deflater fr;
    public XW D60;
    public XW ac;
    public XW f30;
    public boolean lx0;
    public int WD0;

    static {
        A0 = new byte[]{(byte) -119, 80, 78, 71, 13, 10, 26, 10};
    }

    public DeflaterByteOutputStream() {
        this(16384);
    }

    public DeflaterByteOutputStream(int i) {
        this.lx0 = true;
        this.Kk0 = new P20(i);
        this.fr = new Deflater();
    }

    public final void bC(OutputStream outputStream, i4_0 i4_0) throws IOException {
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(this.Kk0, this.fr);
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.write(A0);
        this.Kk0.writeInt(1229472850);
        this.Kk0.writeInt(i4_0.XF.SH);
        this.Kk0.writeInt(i4_0.XF.mB0);
        this.Kk0.writeByte(8);
        this.Kk0.writeByte(6);
        this.Kk0.writeByte(0);
        this.Kk0.writeByte(0);
        this.Kk0.writeByte(0);
        this.Kk0.pA0(dataOutputStream);
        this.Kk0.writeInt(1229209940);
        this.fr.reset();
        int lineLen = i4_0.XF.SH * 4;
        byte[] curLine;
        byte[] prevLine;
        byte[] priorLine;
        if (this.D60 == null) {
            XW xw = new XW(lineLen);
            this.D60 = xw;
            curLine = xw.Ld;
            XW xw2 = new XW(lineLen);
            this.ac = xw2;
            prevLine = xw2.Ld;
            XW xw3 = new XW(lineLen);
            this.f30 = xw3;
            priorLine = xw3.Ld;
        } else {
            curLine = this.D60.Ot0(lineLen);
            prevLine = this.ac.Ot0(lineLen);
            priorLine = this.f30.Ot0(lineLen);
            for (int i = 0; i < this.WD0; i++) {
                priorLine[i] = 0;
            }
        }
        this.WD0 = lineLen;
        ByteBuffer pixels = i4_0.Rh0();
        int oldPosition = pixels.position();
        boolean isRGBA8888 = i4_0.rH0() == ix0_0.Vw;
        int height = i4_0.XF.mB0;
        for (int y = 0; y < height; y++) {
            int py = this.lx0 ? (height - y - 1) : y;
            if (isRGBA8888) {
                pixels.position(py * lineLen);
                pixels.get(prevLine, 0, lineLen);
            } else {
                int width = i4_0.XF.SH;
                int xIndex = 0;
                for (int x = 0; x < width; x++) {
                    int pixel = i4_0.XF.iH0(x, py);
                    prevLine[xIndex++] = (byte) ((pixel >> 24) & 255);
                    prevLine[xIndex++] = (byte) ((pixel >> 16) & 255);
                    prevLine[xIndex++] = (byte) ((pixel >> 8) & 255);
                    prevLine[xIndex++] = (byte) (pixel & 255);
                }
            }
            curLine[0] = (byte) (prevLine[0] - priorLine[0]);
            curLine[1] = (byte) (prevLine[1] - priorLine[1]);
            curLine[2] = (byte) (prevLine[2] - priorLine[2]);
            curLine[3] = (byte) (prevLine[3] - priorLine[3]);
            for (int i = 4; i < lineLen; i++) {
                int a = prevLine[i - 4] & 255;
                int b = priorLine[i] & 255;
                int c = priorLine[i - 4] & 255;
                int p = (a + b) - c;
                int pa = p - a;
                if (pa < 0) {
                    pa = -pa;
                }
                int pb = p - b;
                if (pb < 0) {
                    pb = -pb;
                }
                int pc = p - c;
                if (pc < 0) {
                    pc = -pc;
                }
                int pr;
                if (pa <= pb && pa <= pc) {
                    pr = a;
                } else if (pb <= pc) {
                    pr = b;
                } else {
                    pr = c;
                }
                curLine[i] = (byte) (prevLine[i] - pr);
            }
            deflaterOutputStream.write(4);
            deflaterOutputStream.write(curLine, 0, lineLen);
            byte[] temp = prevLine;
            prevLine = priorLine;
            priorLine = temp;
        }
        pixels.position(oldPosition);
        deflaterOutputStream.finish();
        this.Kk0.pA0(dataOutputStream);
        this.Kk0.writeInt(1229278788);
        this.Kk0.pA0(dataOutputStream);
        outputStream.flush();
    }

    @Override
    public final void dispose() {
        this.fr.end();
    }
}
