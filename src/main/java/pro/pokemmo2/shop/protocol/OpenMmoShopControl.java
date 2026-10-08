package pro.pokemmo2.shop.protocol;

import java.nio.ByteBuffer;

import f.GH;
import f.HJ;
import f.k20_0;
import pro.pokemmo2.shop.service.ShopClient;

/** S2C 0xDC bridge; non-extension payloads are delegated to the original HJ handler. */
public final class OpenMmoShopControl extends GH {
    private final k20_0 connection;
    private HJ legacyPacket;
    private OpenMmoShopCodec.Control control;

    public OpenMmoShopControl(k20_0 connection, ByteBuffer buffer) {
        super(connection, buffer);
        this.connection = connection;
    }

    @Override
    public void Oj0() {
        if (this.Rj.remaining() >= 3
                && (this.Rj.get(this.Rj.position()) & 0xFF) == OpenMmoShopCodec.MAGIC) {
            control = OpenMmoShopCodec.readControl(this.Rj);
            return;
        }
        legacyPacket = new HJ(connection, this.Rj);
        legacyPacket.Oj0();
    }

    @Override
    public void os0() {
        if (legacyPacket != null) {
            legacyPacket.os0();
            return;
        }
        ShopClient.handleControl(connection, control);
    }
}
