package cn.pokemmo.world.camera;

import java.nio.ByteBuffer;

/**
 * 世界地图/场景摄像机角度设置记录 (World Camera Angle Settings)
 * <p>
 * 原始混淆类: {@code f.w20_0}
 */
public class WorldCameraAngleSettings {
    public final short MV;
    public final short B60;
    public final short Aj0;
    public final short lD0;
    public final short Qz;
    public final short Gv;
    public final short pz;
    public final short j3;
    public final short LB0;
    public final short kx0;
    public final short cR;
    public final short Or;

    public WorldCameraAngleSettings(ByteBuffer byteBuffer) {
        this.MV = byteBuffer.getShort();
        byteBuffer.getShort();
        this.B60 = byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        this.Aj0 = byteBuffer.getShort();
        byteBuffer.getShort();
        this.lD0 = byteBuffer.getShort();
        byteBuffer.getShort();
        this.Qz = byteBuffer.getShort();
        this.Gv = byteBuffer.getShort();
        byteBuffer.getShort();
        this.pz = byteBuffer.getShort();
        this.j3 = byteBuffer.getShort();
        this.LB0 = byteBuffer.getShort();
        this.kx0 = byteBuffer.getShort();
        this.cR = byteBuffer.getShort();
        this.Or = byteBuffer.getShort();
    }

    public static float toDegrees(short s) {
        return -(((float) (s & 0xFFFF) / 65536.0f * 360.0f % 360.0f + 360.0f) % 360.0f);
    }

    public static float y0(short s) {
        return toDegrees(s);
    }
}
