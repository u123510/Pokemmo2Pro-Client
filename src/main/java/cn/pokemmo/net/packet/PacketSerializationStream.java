package cn.pokemmo.net.packet;

import f.*;

public class PacketSerializationStream {
    public static PacketSerializationStream qz;
    public static PacketSerializationStream XG0;
    public static PacketSerializationStream n80;
    public static PacketSerializationStream oH;
    public static PacketSerializationStream de;
    public static PacketSerializationStream Z5;
    public static PacketSerializationStream yg;
    public static PacketSerializationStream df;
    public static PacketSerializationStream jL0;
    public static PacketSerializationStream J2;
    public static bm0_1 b0;
    public static PacketSerializationStream[] sc;
    public final byte wz0;
    public final int Vh;
    public final int vp0;

    public PacketSerializationStream(int type, int value, int id) {
        this.vp0 = id;
        this.wz0 = (byte) type;
        this.Vh = value;
    }

    static {
        if (f.zq_2.qz == null) {
            try {
                Class.forName(f.zq_2.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
