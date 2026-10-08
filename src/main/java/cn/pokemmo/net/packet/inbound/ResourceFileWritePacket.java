/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.BR;
import f.BU;
import f.GH;
import f.i4_0;
import f.k20_0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public class ResourceFileWritePacket
extends GH {
    public static ByteArrayOutputStream qV;
    public byte VT;
    public byte ua0;
    public int gQ;
    public boolean xu0;
    public byte[] pU;

    public ResourceFileWritePacket(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.VT = this.Rj.get();
        if (this.VT == 2) {
            return;
        }
        ResourceFileWritePacket b82 = this;
        b82.ua0 = b82.Rj.get();
        b82.gQ = b82.Rj.get() & 0xFF;
        boolean bl = b82.Rj.get() == 1;
        this.xu0 = bl;
        byte[] byArray = new byte[this.Rj.getShort() & 0xFFFF];
        this.Rj.get(byArray);
        this.pU = byArray;
    }

    @Override
    public final void os0() {
        if (this.VT == 2) {
            BU bu = ((BR)this.sr0()).lZ.zK0;
            if (bu != null) {
                bu.m80();
            }
            return;
        }
        if (this.gQ == 0) {
            qV = new ByteArrayOutputStream();
        }
        ByteArrayOutputStream output = qV;
        if (output == null) {
            return;
        }
        try {
            output.write(this.pU);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        if (!this.xu0) {
            return;
        }
        byte[] data = qV.toByteArray();
        qV = null;
        i4_0 packet = new i4_0(data, 0, data.length);
        byte type = this.ua0;
        BU bu = ((BR)this.sr0()).lZ.zK0;
        if (bu != null) {
            bu.lI(packet, type);
        }
    }
}
