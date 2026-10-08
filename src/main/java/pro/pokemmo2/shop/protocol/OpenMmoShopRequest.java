package pro.pokemmo2.shop.protocol;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import f.RE;
import f.k20_0;

/**
 * PokeMMO2 商店扩展协议 v1 的客户端请求。
 *
 * <p>商店功能位于 {@code pro.pokemmo2.shop}，底层网络队列仍由混淆客户端的
 * {@link RE} 和 {@link k20_0} 提供。本类只编码商店 payload，不携带价格。</p>
 */
public final class OpenMmoShopRequest extends RE {
    public static final int BUY = 1;
    public static final int SELL = 2;
    public static final int CLOSE = 3;
    public static final int MAX_AMOUNT = 999;

    public final int action;
    public final long quoteId;
    public final int requestId;
    public final long targetId;
    public final int amount;

    private OpenMmoShopRequest(int action, long quoteId, int requestId,
                               long targetId, int amount) {
        super(0xDC);
        this.action = action;
        this.quoteId = quoteId;
        this.requestId = requestId;
        this.targetId = targetId;
        this.amount = amount;
    }

    /** 协商当前客户端是否支持 OpenMMO 商店扩展。 */
    public static OpenMmoShopRequest hello() {
        return new OpenMmoShopRequest(0, 0, 0, 0, 0);
    }

    /**
     * 创建购买或出售请求。
     *
     * @param action {@link #BUY} 或 {@link #SELL}
     * @param targetId BUY 使用 itemId，SELL 使用 ownedItemId
     */
    public static OpenMmoShopRequest trade(int action, long quoteId, int requestId,
                                           long targetId, int amount) {
        if ((action != BUY && action != SELL) || quoteId <= 0 || requestId <= 0
                || targetId <= 0 || (action == BUY && targetId > 0xFFFF)
                || amount < 1 || amount > MAX_AMOUNT) {
            throw new IllegalArgumentException("商店请求的操作、报价、序号、目标或数量无效");
        }
        return new OpenMmoShopRequest(action, quoteId, requestId, targetId, amount);
    }

    /** 请求关闭当前报价窗口。 */
    public static OpenMmoShopRequest close(long quoteId) {
        if (quoteId <= 0) {
            throw new IllegalArgumentException("商店报价编号无效");
        }
        return new OpenMmoShopRequest(CLOSE, quoteId, 0, 0, 0);
    }

    @Override
    public void ig0(k20_0 connection, ByteBuffer buffer) {
        ByteOrder previousOrder = buffer.order();
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        try {
            buffer.put((byte) OpenMmoShopCodec.MAGIC)
                    .put((byte) OpenMmoShopCodec.VERSION)
                    .put((byte) action);
            if (action == 0) {
                return;
            }
            buffer.putLong(quoteId);
            if (action == CLOSE) {
                return;
            }
            buffer.putInt(requestId);
            if (action == BUY) {
                buffer.putShort((short) targetId);
            } else {
                buffer.putLong(targetId);
            }
            buffer.putShort((short) amount);
        } finally {
            buffer.order(previousOrder);
        }
    }
}
