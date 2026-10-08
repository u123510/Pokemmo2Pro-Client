package cn.pokemmo.ui.easing;

import f.*;
import java.util.*;

public class SlowFastSlowInterpolation extends BaseInterpolation {
    public SlowFastSlowInterpolation(float[] widths, float[] heights) {
        super();
        if (widths.length != heights.length) {
            throw new IllegalArgumentException("Must be the same number of widths and heights.");
        }
    }

    public SlowFastSlowInterpolation(int bounces) {
        super();
        if (bounces < 2 || bounces > 5) {
            throw new IllegalArgumentException(yr_1.pG("bounces cannot be < 2 or > 5: ", bounces));
        }
        float[] widths = new float[bounces];
        float[] heights = new float[bounces];
        widths[0] = 1.0F;
        switch (bounces) {
            case 5:
                widths[0] = 0.3F;
                widths[1] = 0.3F;
                widths[2] = 0.2F;
                widths[3] = 0.1F;
                widths[4] = 0.1F;
                heights[1] = 0.45F;
                heights[2] = 0.3F;
                heights[3] = 0.15F;
                heights[4] = 0.06F;
                break;
            case 4:
                widths[0] = 0.34F;
                widths[1] = 0.34F;
                widths[2] = 0.2F;
                widths[3] = 0.15F;
                heights[1] = 0.26F;
                heights[2] = 0.11F;
                heights[3] = 0.03F;
                break;
            case 3:
                widths[0] = 0.4F;
                widths[1] = 0.4F;
                widths[2] = 0.2F;
                heights[1] = 0.33F;
                heights[2] = 0.1F;
                break;
            case 2:
                widths[0] = 0.6F;
                widths[1] = 0.4F;
                heights[1] = 0.33F;
                break;
            default:
                break;
        }
        widths[0] *= 2.0F;
    }
}
