package f;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeMap;

import cn.pokemmo.ui.window.battle.PvPMatchmakingWindow;

/**
 * PVP排位赛与锦标赛匹配主窗口 兼容垫片
 * 核心实现已迁移至 cn.pokemmo.ui.window.battle.PvPMatchmakingWindow
 */
public final class Yl extends PvPMatchmakingWindow {
    public Yl(BU owner, boolean tournament, zp0_0[] events, HZ[] restrictions, pz_2[] rewards, int limit) {
        super(owner, tournament, events, restrictions, rewards, limit);
    }

}
