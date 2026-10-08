package cn.pokemmo.math;

/**
 * 浮点数滑动采样窗口缓冲器（移动平均与平滑滤波器）
 */
public class FloatSampleBuffer {
    public final float[] UF;
    public int ma0 = 0;
    public int aM0;
    public float hU = 0.0f;

    public FloatSampleBuffer(int n) {
        this.UF = new float[n];
    }

    public float[] getBuffer() {
        return this.UF;
    }

    public int getCount() {
        return this.ma0;
    }

    public float getAverage() {
        return this.hU;
    }
}
