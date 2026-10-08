package f;

import cn.pokemmo.ui.easing.SlowFastSlowInterpolation;
import java.util.*;

/**
 * 垫片 - SlowFastSlowInterpolation
 * 职责: 动画缓动插值算法
 * 原始混淆类: f.H
 * 现代实现: cn.pokemmo.ui.easing.SlowFastSlowInterpolation
 */
public class H extends SlowFastSlowInterpolation {

    public H(float[] widths, float[] heights) {
        super(widths, heights);
    }
    public H(int bounces) {
        super(bounces);
    }
}
