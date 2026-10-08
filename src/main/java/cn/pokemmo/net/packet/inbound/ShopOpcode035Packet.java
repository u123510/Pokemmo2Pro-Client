package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import pro.pokemmo2.shop.model.OpenMmoShopQuote;
import pro.pokemmo2.shop.protocol.OpenMmoShopCodec;
import pro.pokemmo2.shop.service.ShopClient;

public class ShopOpcode035Packet extends GH {
    public final k20_0 connection;
    public byte rawFlags;
    public boolean g40;
    public int FJ;
    public CH0 oB;
    public lf0_2 aM0;
    public boolean ro0;
    public boolean lG0;
    public boolean Xk0;
    private OpenMmoShopQuote shopQuote;

    public ShopOpcode035Packet(k20_0 connection, ByteBuffer buffer) {
        super(connection, buffer);
        this.connection = connection;
        this.oB = CH0.j1;
    }

    @Override
    public final void Oj0() {
        byte typeCode = this.Rj.get();
        this.g40 = typeCode != -1;
        if (!this.g40) {
            return;
        }

        cr_0 type = cr_0.i10.dg(typeCode) ? (cr_0)cr_0.i10.BM(typeCode) : cr_0.u90;
        byte flags = this.Rj.get();
        this.rawFlags = flags;
        this.ro0 = (flags & 1) != 0;
        this.lG0 = (flags & 2) != 0;
        boolean hasAdditionalEntries = (flags & 4) != 0;
        this.Xk0 = hasAdditionalEntries;

        byte layoutCode = this.Rj.get();
        JJ0 layout = JJ0.y30.dg(layoutCode) ? (JJ0)JJ0.y30.BM(layoutCode) : JJ0.PQ;

        int firstValue = 0;
        int secondValue = 0;
        if ((flags & 32) != 0) {
            this.FJ = this.Rj.getInt();
        }
        if ((flags & 8) != 0) {
            firstValue = this.Rj.getInt();
        }
        if ((flags & 16) != 0) {
            secondValue = this.Rj.getInt();
        }
        if ((flags & 64) != 0) {
            this.oB = this.pE();
        }

        this.aM0 = new lf0_2(layout, type, firstValue, secondValue);
        int entryCount = this.Rj.getShort() & 65535;
        for (int index = 0; index < entryCount; ++index) {
            short id = this.Rj.getShort();
            short first = this.Rj.getShort();
            short second = this.Rj.getShort();
            lpt2__5 entry = this.aM0.u20(id, type, first, second);
            if (type == cr_0.Xz0) {
                int pairCount = this.Rj.get() & 255;
                for (int pairIndex = 0; pairIndex < pairCount; ++pairIndex) {
                    short pairFirst = this.Rj.getShort();
                    short pairSecond = this.Rj.getShort();
                    entry.Na0.add(new E5(pairFirst, pairSecond));
                }
            } else {
                entry.zB0 = this.Rj.getInt();
            }
        }

        if (type == cr_0.Xz0 && hasAdditionalEntries) {
            int additionalCount = this.Rj.getShort() & 65535;
            for (int index = 0; index < additionalCount; ++index) {
                short id = this.Rj.getShort();
                short first = this.Rj.getShort();
                short second = this.Rj.getShort();
                this.aM0.xe(id).qs.add(new E5(first, second));
            }
        }
        if ((this.rawFlags & 0x80) != 0) {
            this.shopQuote = OpenMmoShopCodec.readQuote(this.aM0,
                    this.rawFlags & 0xFF, this.Rj);
        }
    }

    @Override
    public final void os0() {
        BR client = (BR)this.sr0();
        if (this.g40 && (this.rawFlags & 0x80) != 0) {
            ShopClient.onNativeShopResponse(this.connection, this.aM0,
                    this.shopQuote);
        }
        if (!this.g40 && ShopClient.onNativeShopClosed(this.connection)) {
            return;
        }
        if (this.g40) {
            lf0_2 data = this.aM0;
            client.Gp = data;
            BU controller = client.lZ.zK0;
            if (controller == null) {
                return;
            }
            if (data == null) {
                controller.ig();
            } else {
                controller.yn(this.FJ, this.oB, this.Xk0, this.ro0, this.lG0);
                ShopClient.onNativeShopOpened(controller.W10);
            }
            return;
        }

        client.Gp = null;
        BU controller = client.lZ.zK0;
        if (controller != null) {
            controller.ig();
        }
    }
}
