// 兼容垫片 (Shim) - 数据包序列化描述符
package f;

import cn.pokemmo.net.packet.PacketSerializationStream;

public final class zq_2 extends PacketSerializationStream {
    public static final zq_2 qz;
    public static final zq_2 XG0;
    public static final zq_2 n80;
    public static final zq_2 oH;
    public static final zq_2 de;
    public static final zq_2 Z5;
    public static final zq_2 yg;
    public static final zq_2 df;
    public static final zq_2 jL0;
    public static final zq_2 J2;
    public static final bm0_1 b0;
    public static final zq_2[] sc;

    public zq_2(int type, int value, int id) {
        super(type, value, id);
    }

    static {

        zq_2 v0 = new zq_2(0, 0, 0);
        qz = v0;
        zq_2 v1 = new zq_2(1, 1, 2000);
        XG0 = v1;
        zq_2 v2 = new zq_2(2, 2, 2001);
        zq_2 v3 = new zq_2(3, 3, 0);
        n80 = v3;
        zq_2 v4 = new zq_2(4, 6, 2002);
        zq_2 v5 = new zq_2(5, 7, 2003);
        oH = v5;
        zq_2 v6 = new zq_2(6, 8, 2004);
        zq_2 v7 = new zq_2(7, 9, 2005);
        zq_2 v8 = new zq_2(8, 16, 2006);
        zq_2 v9 = new zq_2(9, 22, 2013);
        de = v9;
        zq_2 v10 = new zq_2(10, 23, 2008);
        Z5 = v10;
        zq_2 v11 = new zq_2(11, 24, 2009);
        yg = v11;
        zq_2 v12 = new zq_2(12, 25, 2010);
        zq_2 v13 = new zq_2(13, 26, 2013);
        zq_2 v14 = new zq_2(14, 27, 2012);
        zq_2 v15 = new zq_2(15, 28, 2013);
        zq_2 v16 = new zq_2(16, 29, 2014);
        df = v16;
        zq_2 v17 = new zq_2(17, 30, 2015);
        zq_2 v18 = new zq_2(18, 31, 2016);
        jL0 = v18;
        zq_2 v19 = new zq_2(19, 32, 2017);
        J2 = v19;
        zq_2 v20 = new zq_2(20, 33, 2018);
        zq_2 v21 = new zq_2(21, 34, 6803);
        zq_2 v22 = new zq_2(22, 35, 2021);
        zq_2 v23 = new zq_2(23, 36, 2019);
        sc = new zq_2[]{v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11,
                v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23};
        b0 = new bm0_1();
        for (zq_2 value : sc.clone()) {
            b0.gE0(value.wz0, value);
        }
    
        PacketSerializationStream.qz = qz;
        PacketSerializationStream.XG0 = XG0;
        PacketSerializationStream.n80 = n80;
        PacketSerializationStream.oH = oH;
        PacketSerializationStream.de = de;
        PacketSerializationStream.Z5 = Z5;
        PacketSerializationStream.yg = yg;
        PacketSerializationStream.df = df;
        PacketSerializationStream.jL0 = jL0;
        PacketSerializationStream.J2 = J2;
        PacketSerializationStream.b0 = b0;
        PacketSerializationStream.sc = sc;
    }
}
