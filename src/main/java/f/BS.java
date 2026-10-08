package f;

import cn.pokemmo.math.FloatSampleBuffer;

/**
 * 浮点数滑动采样窗口门面
 * @see cn.pokemmo.math.FloatSampleBuffer
 */
public final class BS extends FloatSampleBuffer {
    public BS(int n) {
        super(n);
    }
}
