package cn.pokemmo.net.packet.protocol;

import f.Dx0;
import f.KM;
import f.Mg;
import f.PB0;
import f.Px0;
import f.QL;
import f.QL0;
import f.TA0;
import f.W;
import f.af0_2;
import f.b5_0;
import f.bd0_0;
import f.bx_0;
import f.com7__1;
import f.db_1;
import f.dh_1;
import f.gc_2;
import f.hc0_1;
import f.ht_2;
import f.kg0_0;
import f.lt0_0;
import f.nn_1;
import f.op_1;
import f.so_0;
import f.vb_1;
import f.vi_0;
import f.vq_2;
import f.w7_0;
import f.yp0_0;
import f.z30_0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/**
 * 网络/对战封包流解析器 (Network / Battle Protocol Packet Stream Decoder)
 * <p>
 * 原始混淆类: {@code f.v40_0}
 */
public abstract class NetworkPacketStreamDecoder {
    public static final w7_0 pD0 = new w7_0();

    public static ArrayList<Mg> nc(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte b = wrap.get();
        ArrayList<Mg> arrayList = new ArrayList<>(b);
        ArrayList<lt0_0> arrayList2 = new ArrayList<>(12);
        Mg mg = null;
        byte b2 = -1;
        for (int i2 = 0; i2 < b; i2++) {
            short s = (short) (wrap.getShort() & 32767);
            if (s == 23) {
                if (mg == null || i < mg.ha()) {
                    mg = new TA0((byte) 10, i);
                }
                wrap.get();
            } else if (s == 19) {
                b2 = wrap.get();
            } else {
                op_1 op_1Var = (op_1) pD0.f5(s);
                if (op_1Var == null) {
                    throw new IllegalArgumentException(String.valueOf((int) s));
                }
                Mg yl = op_1Var.yl(wrap);
                byte b3 = yl.mG;
                if (b3 == 10) {
                    if (mg == null || mg.ha() > yl.ha()) {
                        mg = yl;
                    }
                } else if (b3 == 5 || b3 == 6) {
                    arrayList2.add((lt0_0) yl);
                } else {
                    arrayList.add(yl);
                }
            }
        }
        if (mg != null) {
            arrayList.add(mg);
        }
        if (b2 != -1) {
            int i3 = 0;
            int i4 = 0;
            Iterator<lt0_0> it = arrayList2.iterator();
            while (it.hasNext()) {
                lt0_0 next = it.next();
                int i5 = 1 << next.Oe0.v10;
                int i6 = i3 ^ i5;
                if (next.mG == 6) {
                    i4 ^= i5;
                }
                i3 = i6;
            }
            for (gc_2 gc_2Var : gc_2.fe0) {
                if (!gc_2Var.j8) {
                    int i7 = 1 << gc_2Var.v10;
                    if ((i3 & i7) != 0) {
                        if ((i4 & i7) == 0) {
                            arrayList2.add(new lt0_0((byte) 6, gc_2Var, (short) 31));
                        } else {
                            arrayList2.add(new lt0_0((byte) 5, gc_2Var, (short) 0));
                        }
                    }
                }
            }
            arrayList.add(new vb_1(arrayList2.toArray(new lt0_0[0]), b2));
        } else {
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public static byte lo0(bx_0 bx_0Var, vi_0 vi_0Var) {
        byte b = -1;
        for (byte b2 = 0; b2 < 127; b2 = (byte) (b2 + 1)) {
            if (((bx_0) vi_0Var.za.BM(b2)) == bx_0Var) {
                b = b2;
                break;
            }
        }
        return b;
    }

    public static Mg KY(Byte b) {
        return new dh_1();
    }

    public static Mg HK0(Byte b) {
        return new kg0_0();
    }

    public static Mg ju0(Byte b) {
        return new af0_2();
    }

    public static Mg dK0(Long l) {
        return new nn_1((int) (l.longValue() >> 32), (int) (l.longValue() & 4294967295L));
    }

    public static Mg OW(Byte b) {
        return new yp0_0(QL.Q8(b.byteValue()));
    }

    public static Mg CC(Integer num) {
        return new TA0((byte) 10, num.intValue());
    }

    public static Mg iJ(Integer num) {
        return new TA0((byte) 9, num.intValue());
    }

    public static Mg dt(gc_2 gc_2Var, Short sh) {
        return new lt0_0((byte) 18, gc_2Var, sh.shortValue());
    }

    public static Mg zk(gc_2 gc_2Var, Short sh) {
        return new lt0_0((byte) 17, gc_2Var, sh.shortValue());
    }

    public static Mg r40(gc_2 gc_2Var, Short sh) {
        return new lt0_0((byte) 6, gc_2Var, sh.shortValue());
    }

    public static Mg px(gc_2 gc_2Var, Short sh) {
        return new lt0_0((byte) 5, gc_2Var, sh.shortValue());
    }

    static {
        pD0.coM4((short) 1, new op_1((Function<Byte, Mg>) com7__1::new, (Function<ByteBuffer, Byte>) ByteBuffer::get));
        pD0.coM4((short) 2, new op_1((Function<Byte, Mg>) db_1::new, (Function<ByteBuffer, Byte>) ByteBuffer::get));
        pD0.coM4((short) 3, new op_1((Function<Byte, Mg>) W::new, (Function<ByteBuffer, Byte>) ByteBuffer::get));
        pD0.coM4((short) 4, new op_1((Function<Byte, Mg>) Dx0::new, (Function<ByteBuffer, Byte>) ByteBuffer::get));

        for (gc_2 gc_2Var : gc_2.fe0) {
            if (!gc_2Var.j8) {
                pD0.coM4((short) (gc_2Var.v10 | 1280), new op_1((Function<Short, Mg>) sh -> px(gc_2Var, sh), (Function<ByteBuffer, Short>) ByteBuffer::getShort));
                pD0.coM4((short) (gc_2Var.v10 | 1536), new op_1((Function<Short, Mg>) sh -> r40(gc_2Var, sh), (Function<ByteBuffer, Short>) ByteBuffer::getShort));
                pD0.coM4((short) (gc_2Var.v10 | 4352), new op_1((Function<Short, Mg>) sh -> zk(gc_2Var, sh), (Function<ByteBuffer, Short>) ByteBuffer::getShort));
                pD0.coM4((short) (gc_2Var.v10 | 4608), new op_1((Function<Short, Mg>) sh -> dt(gc_2Var, sh), (Function<ByteBuffer, Short>) ByteBuffer::getShort));
            }
        }

        pD0.coM4((short) 7, new op_1((Function<Byte, Mg>) PB0::new, (Function<ByteBuffer, Byte>) ByteBuffer::get));
        pD0.coM4((short) 8, new op_1((Function<Byte, Mg>) so_0::new, (Function<ByteBuffer, Byte>) ByteBuffer::get));
        pD0.coM4((short) 9, new op_1((Function<Integer, Mg>) NetworkPacketStreamDecoder::iJ, (Function<ByteBuffer, Integer>) ByteBuffer::getInt));
        pD0.coM4((short) 10, new op_1((Function<Integer, Mg>) NetworkPacketStreamDecoder::CC, (Function<ByteBuffer, Integer>) ByteBuffer::getInt));
        pD0.coM4((short) 11, new op_1((Function<Byte, Mg>) bd0_0::new, (Function<ByteBuffer, Byte>) ByteBuffer::get));
        pD0.coM4((short) 12, new op_1((Function<Byte, Mg>) NetworkPacketStreamDecoder::OW, (Function<ByteBuffer, Byte>) ByteBuffer::get));
        pD0.coM4((short) 13, new op_1((Function<Byte, Mg>) z30_0::new, (Function<ByteBuffer, Byte>) ByteBuffer::get));
        pD0.coM4((short) 14, new op_1((Function<Byte, Mg>) hc0_1::new, (Function<ByteBuffer, Byte>) ByteBuffer::get));
        pD0.coM4((short) 15, new op_1((Function<Long, Mg>) NetworkPacketStreamDecoder::dK0, (Function<ByteBuffer, Long>) ByteBuffer::getLong));
        pD0.coM4((short) 16, new op_1((Function<Short, Mg>) KM::new, (Function<ByteBuffer, Short>) ByteBuffer::getShort));
        pD0.coM4((short) 20, new op_1((Function<Short, Mg>) b5_0::new, (Function<ByteBuffer, Short>) ByteBuffer::getShort));
        pD0.coM4((short) 21, new op_1((Function<Byte, Mg>) NetworkPacketStreamDecoder::ju0, (Function<ByteBuffer, Byte>) ByteBuffer::get));
        pD0.coM4((short) 22, new op_1((Function<Byte, Mg>) NetworkPacketStreamDecoder::HK0, (Function<ByteBuffer, Byte>) ByteBuffer::get));
        pD0.coM4((short) 24, new op_1((Function<Byte, Mg>) NetworkPacketStreamDecoder::KY, (Function<ByteBuffer, Byte>) ByteBuffer::get));
        pD0.coM4((short) 32, new op_1((Function<Byte, Mg>) QL0::new, (Function<ByteBuffer, Byte>) ByteBuffer::get));
        pD0.coM4((short) 33, new op_1((Function<Byte, Mg>) ht_2::new, (Function<ByteBuffer, Byte>) ByteBuffer::get));
        pD0.coM4((short) 0, new op_1((Function<Short, Mg>) vq_2::new, (Function<ByteBuffer, Short>) ByteBuffer::getShort));
        pD0.coM4((short) 34, new op_1((Function<Byte, Mg>) Px0::new, (Function<ByteBuffer, Byte>) ByteBuffer::get));
    }
}
