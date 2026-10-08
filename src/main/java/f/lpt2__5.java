package f;

import cn.pokemmo.shop.ShopTradeListingEntry;

/**
 * 兼容垫片 (Shim) - NPC 商店与交易所商品条目 (Shop Trade Listing Entry)
 * 实际实现已迁移至 {@link ShopTradeListingEntry}
 */
public class lpt2__5 extends ShopTradeListingEntry {
    public lpt2__5(mc0_1 mc0_12, cr_0 cr_02, int i, short s, int i2, short s2) {
        super(mc0_12, cr_02, i, s, i2, s2);
    }
    public lpt2__5(cq_0 cq_02, cr_0 cr_02, int i, int i2) {
        super(cq_02, cr_02, i, i2);
    }
    public lpt2__5(yj_2 yj_22, cr_0 cr_02, short s, int i, short s2) {
        super(yj_22, cr_02, s, i, s2);
    }
}
