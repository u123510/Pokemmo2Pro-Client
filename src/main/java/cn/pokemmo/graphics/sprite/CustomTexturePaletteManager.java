package cn.pokemmo.graphics.sprite;

import f.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * 自定义纹理调色板管理器 (Custom Texture Palette Manager)
 * <p>
 * 负责从 {@code data/sprites/textures.pak} 读取自定义纹理调色板配置，
 * 支持按区域 (Region) 和调色板 ID 查询、替换与导出调色板映射。
 * <p>
 * 原始混淆类: {@code f.jj0_2}
 */
public abstract class CustomTexturePaletteManager {
    public static final byte[] Xe = new byte[]{3, 4};
    public static final dl_1 zx = Cq0.E1(CustomTexturePaletteManager.class);
    public static final cf_2 XL = new cf_2();
    public static boolean BD = false;

    public static boolean Yk() {
        VE ve = new VE("data/sprites/textures.pak", zv_1.tt0);
        try {
            for (byte b : Xe) {
                XL.n3(Byte.valueOf(b), new SL());
            }
            ByteBuffer order = ByteBuffer.wrap(ve.kI0()).order(ByteOrder.LITTLE_ENDIAN);
            order.position(order.position() + 8);
            int i = order.getInt();
            if (i != 3 && i != 2) {
                zx.error("Mismatched textures.pak version. Expected 3 got {}", Integer.valueOf(i));
                return false;
            }
            byte b2 = order.get();
            for (int i2 = 0; i2 < b2; i2++) {
                byte b3 = order.get();
                int i3 = order.getInt();
                cf_2 cf_2Var = ((SL) XL.vC(Byte.valueOf(b3), null)).Iz0;
                for (int i4 = 0; i4 < i3; i4++) {
                    yn0_0 yn0_0Var = new yn0_0(order, i);
                    cf_2Var.n3(Integer.valueOf(yn0_0Var.hashCode()), yn0_0Var);
                }
            }
            BD = true;
            return true;
        } catch (Exception e) {
            zx.error("Error loading data package", e);
            return false;
        }
    }

    public static void Hj0() {
        VE ve = new VE("data/sprites/textures.pak", zv_1.kE);
        ByteBuffer order = ByteBuffer.allocate(10485760).order(ByteOrder.LITTLE_ENDIAN);
        order.position(8);
        order.putInt(3);
        order.put((byte) 2);
        for (int i = 0; i < 2; i++) {
            byte b = Xe[i];
            cf_2 Jf = Jf(b);
            order.put(b);
            order.putInt(Jf.tb0);
            com7__4 K00 = Jf.K00();
            while (K00.hasNext()) {
                yn0_0 yn0_0Var = (yn0_0) K00.next();
                order.putInt(yn0_0Var.Xf0);
                order.putInt(yn0_0Var.SC0);
                order.put(yn0_0Var.dE);
                if ((yn0_0Var.dE & 1) != 0) {
                    yn0_0Var.ZC0(0, order);
                }
                if ((yn0_0Var.dE & 2) != 0) {
                    yn0_0Var.ZC0(1, order);
                }
                if ((yn0_0Var.dE & 4) != 0) {
                    yn0_0Var.ZC0(2, order);
                }
                if ((yn0_0Var.dE & 8) != 0) {
                    yn0_0Var.ZC0(3, order);
                }
            }
        }
        order.flip();
        byte[] bArr = new byte[order.limit()];
        order.get(bArr);
        ve.Al0(bArr);
    }

    public static cf_2 Jf(byte b) {
        if (!BD || (b != 3 && b != 4)) {
            return null;
        }
        return ((SL) XL.vC(Byte.valueOf(b), null)).Iz0;
    }

    public static void case$(byte b, int i, int i2, int i3, byte b2, int i4) {
        cf_2 Jf = Jf(b);
        yn0_0 yn0_0Var = new yn0_0(i2, i3);
        Integer valueOf = Integer.valueOf(yn0_0Var.hashCode());
        if (Jf.Vd(valueOf)) {
            yn0_0Var = (yn0_0) Jf.vC(valueOf, null);
        } else {
            Jf.n3(valueOf, yn0_0Var);
        }
        if (i == 0) {
            if ((yn0_0Var.dE & 1) == 0) {
                yn0_0Var.dE = (byte) (yn0_0Var.dE | 1);
                yn0_0Var.qn0.n3(Integer.valueOf(i), new es_1());
            }
        } else if (i == 1) {
            if ((yn0_0Var.dE & 2) == 0) {
                yn0_0Var.dE = (byte) (yn0_0Var.dE | 2);
                yn0_0Var.qn0.n3(Integer.valueOf(i), new es_1());
            }
        } else if (i == 2) {
            if ((yn0_0Var.dE & 4) == 0) {
                yn0_0Var.dE = (byte) (yn0_0Var.dE | 4);
                yn0_0Var.qn0.n3(Integer.valueOf(i), new es_1());
            }
        } else if (i == 3) {
            if ((yn0_0Var.dE & 8) == 0) {
                yn0_0Var.dE = (byte) (yn0_0Var.dE | 8);
                yn0_0Var.qn0.n3(Integer.valueOf(i), new es_1());
            }
        }
        es_1 es_1Var = (es_1) yn0_0Var.qn0.vC(Integer.valueOf(i), null);
        I2 it = es_1Var.ZD();
        while (it.hasNext()) {
            VK0 vk0 = (VK0) it.next();
            if (vk0.Z7 == b2) {
                vk0.yh = i4;
                return;
            }
        }
        es_1Var.Ue0(new VK0(b2, i4));
    }

    public static void MY(byte b, int i, int i2, int i3) {
        cf_2 Jf = Jf(b);
        new cf_2(4);
        int i4 = (i2 * 1000000) + i3;
        Integer valueOf = Integer.valueOf(i4);
        if (Jf != null && Jf.Vd(valueOf)) {
            yn0_0 yn0_0Var = (yn0_0) Jf.vC(valueOf, null);
            yn0_0Var.qn0.qq0(Integer.valueOf(i));
            if (i == 0) {
                yn0_0Var.dE = (byte) (yn0_0Var.dE & -2);
            } else if (i == 1) {
                yn0_0Var.dE = (byte) (yn0_0Var.dE & -3);
            } else if (i == 2) {
                yn0_0Var.dE = (byte) (yn0_0Var.dE & -5);
            } else if (i == 3) {
                yn0_0Var.dE = (byte) (yn0_0Var.dE & -9);
            }
            if (yn0_0Var.dE == 0) {
                Jf.qq0(valueOf);
            }
        }
    }

    public static boolean cy(byte b, int i, int i2, int i3) {
        cf_2 Jf = Jf(b);
        if (i2 < 0 || Jf == null) {
            return false;
        }
        int i4 = (i2 * 1000000) + i3;
        Integer valueOf = Integer.valueOf(i4);
        if (!Jf.Vd(valueOf)) {
            return false;
        }
        yn0_0 yn0_0Var = (yn0_0) Jf.vC(valueOf, null);
        if (i == 0) {
            if ((yn0_0Var.dE & 1) != 0) {
                return true;
            }
        } else if (i == 1) {
            if ((yn0_0Var.dE & 2) != 0) {
                return true;
            }
        } else if (i == 2) {
            if ((yn0_0Var.dE & 4) != 0) {
                return true;
            }
        } else if (i == 3) {
            if ((yn0_0Var.dE & 8) != 0) {
                return true;
            }
        } else {
            yn0_0Var.getClass();
        }
        return false;
    }

    public static int[] SC0(byte b, am_2 am_2Var, int i, int i2, int i3, int i4) {
        cf_2 Jf = Jf(b);
        if (Jf == null) {
            return null;
        }
        int i5 = (i2 * 1000000) + i4;
        Integer valueOf = Integer.valueOf(i5);
        if (!Jf.Vd(valueOf)) {
            return null;
        }
        ol0_0 ol0_0Var = ((pv_0) am_2Var.ib0.Ks.get(i3)).bh0;
        be0_1 be0_1Var = null;
        I2 it = am_2Var.CoM5.Ks.ZD();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            be0_1 be0_1Var2 = (be0_1) it.next();
            if (be0_1Var2.a00 == i4) {
                be0_1Var = be0_1Var2;
                break;
            }
        }
        int[] yF0 = ((gb_0) be0_1Var).yF0(ol0_0Var);
        es_1 es_1Var = (es_1) ((yn0_0) Jf.vC(valueOf, null)).qn0.vC(Integer.valueOf(i), null);
        if (es_1Var == null) {
            return null;
        }
        I2 it2 = es_1Var.ZD();
        while (it2.hasNext()) {
            VK0 vk0 = (VK0) it2.next();
            yF0[vk0.Z7] = vk0.yh;
        }
        return yF0;
    }
}
