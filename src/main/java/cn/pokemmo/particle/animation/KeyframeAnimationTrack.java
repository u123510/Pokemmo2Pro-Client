package cn.pokemmo.particle.animation;

import f.Ae;
import java.nio.ByteBuffer;

/**
 * 关键帧动画轨迹数据 (Keyframe Animation Track Data)
 * 存储并按组件/采样帧解析二进制关键帧动画数据流 (顶点位移、通道曲线等)
 * 原混淆类: f.Gv0
 */
public class KeyframeAnimationTrack {
    /**
     * 关键帧二进制数据缓冲区
     */
    public final ByteBuffer CH;

    /**
     * 关键帧采样点总数 (Frame / Sample Count)
     */
    public final int ds;

    /**
     * 单帧步长字节数 (Stride Bytes, 12/24/36)
     */
    public final int nUL;

    public KeyframeAnimationTrack(Ae source) {
        ByteBuffer buffer = source.j90();
        this.CH = buffer;
        int count = buffer.getInt();
        this.ds = count;
        int format = buffer.getInt();
        if (format == 65792) {
            this.nUL = 24;
        } else if (format == 65793) {
            this.nUL = 36;
        } else if (format == 65536) {
            this.nUL = 12;
        } else {
            throw new RuntimeException("Unsupported animation format: " + format);
        }

        if (buffer.remaining() != count * this.nUL) {
            throw new RuntimeException("Invalid animation track data size");
        }
    }

    /**
     * 读取指定通道分量与帧索引处的浮点采样值
     *
     * @param component 通道分量序号 (如 X=0, Y=1, Z=2)
     * @param index     采样帧序号
     * @return 采样浮点数值
     */
    public float getSample(int component, int index) {
        if (index >= this.ds) {
            index = this.ds - 1;
        }
        int rowOffset = index * this.nUL + 8;
        return this.CH.getFloat(component * 4 + rowOffset);
    }

    public float Fx0(int component, int index) {
        return getSample(component, index);
    }

    public ByteBuffer getBuffer() {
        return this.CH;
    }

    public int getSampleCount() {
        return this.ds;
    }

    public int getStrideBytes() {
        return this.nUL;
    }
}
