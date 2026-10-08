package pro.pokemmo2.shop.model;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 服务端为一次商店窗口生成的不可变报价。
 *
 * <p>买入价和回收价只属于当前窗口，不修改客户端全局道具元数据。
 * 购买使用 itemId出售使用背包中的 ownedItemId</p>
 */
public final class OpenMmoShopQuote {
    public static final int MAX_ITEMS = 1024;

    private final long quoteId;
    private final Map<Integer, Integer> buyPrices;
    private final Map<Integer, Integer> sellPrices;

    public OpenMmoShopQuote(long quoteId, Map<Integer, Integer> buyPrices,
                            Map<Integer, Integer> sellPrices) {
        if (quoteId <= 0) {
            throw new IllegalArgumentException("商店报价编号必须大于零");
        }
        this.quoteId = quoteId;
        this.buyPrices = copyPrices(buyPrices, "买入");
        this.sellPrices = copyPrices(sellPrices, "回收");
        if (this.buyPrices.isEmpty() && this.sellPrices.isEmpty()) {
            throw new IllegalArgumentException("商店报价至少需要一件买入或回收商品");
        }
    }

    public long getQuoteId() {
        return quoteId;
    }

    public Map<Integer, Integer> getBuyPrices() {
        return buyPrices;
    }

    public Map<Integer, Integer> getSellPrices() {
        return sellPrices;
    }

    public boolean canBuy(int itemId) {
        return buyPrices.containsKey(itemId);
    }

    public boolean canSell(int itemId) {
        return sellPrices.containsKey(itemId);
    }

    public int getBuyPrice(int itemId) {
        return buyPrices.getOrDefault(itemId, 0);
    }

    public int getSellPrice(int itemId) {
        return sellPrices.getOrDefault(itemId, 0);
    }

    private static Map<Integer, Integer> copyPrices(Map<Integer, Integer> prices, String direction) {
        Objects.requireNonNull(prices, direction + "价格表不能为空");
        if (prices.size() > MAX_ITEMS) {
            throw new IllegalArgumentException(direction + "商品数量不能超过 " + MAX_ITEMS);
        }
        Map<Integer, Integer> copy = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : prices.entrySet()) {
            Integer itemId = entry.getKey();
            Integer price = entry.getValue();
            if (itemId == null || itemId <= 0 || itemId > 0xFFFF
                    || price == null || price <= 0) {
                throw new IllegalArgumentException(direction + "商品编号或价格无效");
            }
            copy.put(itemId, price);
        }
        return Collections.unmodifiableMap(copy);
    }
}
