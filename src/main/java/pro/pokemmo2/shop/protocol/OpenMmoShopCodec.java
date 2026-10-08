package pro.pokemmo2.shop.protocol;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import java.util.Map;

import f.K5;
import f.lf0_2;
import f.lpt2__5;
import f.k20_0;
import pro.pokemmo2.shop.model.OpenMmoShopQuote;

/** Strict decoder for the OpenMMO shop extension and its native 0x23 tail. */
public final class OpenMmoShopCodec {
    public static final int MAGIC = 0x7E;
    public static final int VERSION = 1;
    public static final int MAX_ITEMS = 1024;
    private static final int MAX_MESSAGE_CHARS = 256;

    public record Control(int kind, long quoteId, int requestId,
                          int action, int status, String message) {
    }

    private OpenMmoShopCodec() {
    }

    public static OpenMmoShopQuote readQuote(k20_0 connection, lf0_2 nativeShop,
                                             int flags, ByteBuffer tail) {
        return readQuote(nativeShop, flags, tail);
    }

    public static OpenMmoShopQuote readQuote(lf0_2 nativeShop, int flags,
                                             ByteBuffer tail) {
        if ((flags & 0x80) == 0 || (flags & ~0x87) != 0) {
            throw new IllegalArgumentException("商店扩展标志无效");
        }
        ByteBuffer input = tail.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        require(input, 11);

        Map<Integer, Integer> buyPrices = readNativeBuyPrices(nativeShop, flags);
        int extensionVersion = input.get() & 0xFF;
        long quoteId = input.getLong();
        int sellCount = input.getShort() & 0xFFFF;
        checkCount(sellCount);
        if (extensionVersion != VERSION || quoteId <= 0
                || input.remaining() != sellCount * 6) {
            throw new IllegalArgumentException("商店报价版本、编号或回收列表长度无效");
        }

        Map<Integer, Integer> sellPrices = new LinkedHashMap<>();
        for (int index = 0; index < sellCount; index++) {
            putPrice(sellPrices, input.getShort() & 0xFFFF, input.getInt());
        }
        if ((flags & 1) != 0 != (buyPrices.size() > 0)
                || ((flags & 6) != 0) != (sellPrices.size() > 0)
                || buyPrices.isEmpty() && sellPrices.isEmpty()) {
            throw new IllegalArgumentException("商店买卖标志与报价列表不一致");
        }
        tail.position(input.position());
        return new OpenMmoShopQuote(quoteId, buyPrices, sellPrices);
    }

    private static Map<Integer, Integer> readNativeBuyPrices(lf0_2 nativeShop, int flags) {
        Map<Integer, Integer> prices = new LinkedHashMap<>();
        if ((flags & 1) == 0) {
            return prices;
        }
        if (nativeShop == null) {
            throw new IllegalArgumentException("商店买入列表缺失");
        }
        for (lpt2__5 entry : nativeShop.f90()) {
            int itemId = entry.FE() & 0xFFFF;
            putPrice(prices, itemId, entry.zB0);
        }
        checkCount(prices.size());
        return prices;
    }

    public static Control readControl(ByteBuffer buffer) {
        ByteBuffer input = buffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        require(input, 3);
        if ((input.get() & 0xFF) != MAGIC || (input.get() & 0xFF) != VERSION) {
            throw new IllegalArgumentException("商店控制包 magic 或版本无效");
        }
        int kind = input.get() & 0xFF;
        if (kind == 0) {
            if (input.hasRemaining()) {
                throw new IllegalArgumentException("商店能力确认包含多余数据");
            }
            buffer.position(input.position());
            return new Control(0, 0, 0, 0, 0, "");
        }
        if (kind != 1 && kind != 2) {
            throw new IllegalArgumentException("未知商店控制包类型");
        }
        require(input, 8);
        long quoteId = input.getLong();
        if (quoteId <= 0) {
            throw new IllegalArgumentException("商店控制包报价编号无效");
        }
        int requestId = 0;
        int action = 0;
        int status = 0;
        if (kind == 1) {
            require(input, 6);
            requestId = input.getInt();
            action = input.get() & 0xFF;
            status = input.get() & 0xFF;
            if (requestId <= 0 || (action != OpenMmoShopRequest.BUY
                    && action != OpenMmoShopRequest.SELL) || status > 2) {
                throw new IllegalArgumentException("商店回执字段无效");
            }
        }
        String message = readMessage(input);
        if (input.hasRemaining()) {
            throw new IllegalArgumentException("商店控制包包含多余数据");
        }
        buffer.position(input.position());
        return new Control(kind, quoteId, requestId, action, status, message);
    }

    private static String readMessage(ByteBuffer input) {
        StringBuilder message = new StringBuilder();
        while (input.remaining() >= 2) {
            char value = input.getChar();
            if (value == 0) {
                return message.toString();
            }
            if (message.length() >= MAX_MESSAGE_CHARS) {
                throw new IllegalArgumentException("商店反馈文本过长");
            }
            message.append(value);
        }
        throw new IllegalArgumentException("商店反馈文本缺少终止符");
    }

    private static void putPrice(Map<Integer, Integer> prices, int itemId, int price) {
        if (itemId <= 0 || itemId > 0xFFFF || price <= 0
                || prices.putIfAbsent(itemId, price) != null) {
            throw new IllegalArgumentException("商店道具编号、价格无效或重复");
        }
    }

    private static void checkCount(int count) {
        if (count < 0 || count > MAX_ITEMS) {
            throw new IllegalArgumentException("商店商品数量超过上限");
        }
    }

    private static void require(ByteBuffer input, int bytes) {
        if (input.remaining() < bytes) {
            throw new IllegalArgumentException("商店封包数据被截断");
        }
    }
}
