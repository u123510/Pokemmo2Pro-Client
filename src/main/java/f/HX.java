package f;

import java.util.ArrayList;
import java.util.Iterator;

import cn.pokemmo.ui.window.market.PrizeCornerWindow;

/**
 * 游戏厅代币奖品兑换角落窗口 兼容垫片
 * 核心实现已迁移至 cn.pokemmo.ui.window.market.PrizeCornerWindow
 */
public final class HX extends PrizeCornerWindow {
    public HX(BU controller, byte channel, ArrayList entries) {
        super(controller, channel, entries);
    }

}
