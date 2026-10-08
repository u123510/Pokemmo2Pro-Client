package cn.pokemmo.graphics.sprite;

import f.*;

/**
 * 坐骑精灵图与帧动画偏移量注册表 (Mount Sprite Offset & Animation Frame Registry)
 * <p>
 * 对应原始混淆类: f.Ot0
 * 职责:
 * 1. 从 "data/sprites/mounts/<id>.txt" 读取并缓存坐骑的 4 方向浮点坐标偏移矩阵；
 * 2. 从 "data/sprites/mounts/<id>-<i>.png" 装载并合成坐骑的精灵动画贴图帧 (Wr)。
 */
public class MountSpriteOffsetRegistry {
    public static final Ot0 SF0;
    public final w7_0 uD0;
    public final w7_0 lpT9;

    public MountSpriteOffsetRegistry() {
        this.uD0 = new w7_0();
        this.lpT9 = new w7_0();
    }

    static {
        SF0 = new Ot0();
    }

    /**
     * 获取坐骑的 4 方向偏移量 (yk0)
     */
    public final float[][] yk0(short id) {
        return getMountOffsets(id);
    }

    /**
     * 现代命名：获取坐骑偏移量
     */
    public final float[][] getMountOffsets(short id) {
        float[][] cached = (float[][]) this.uD0.f5(id);
        if (cached != null) {
            return cached;
        }
        lg_0.I70.getClass();
        String path = "data/sprites/mounts/" + id + ".txt";
        VE resource = new VE(path, zv_1.tt0);
        if (!resource.os0()) {
            float[][] fallback = new float[4][2];
            fallback[1][0] = 9.0f;
            fallback[1][1] = 11.0f;
            fallback[0][0] = 9.0f;
            fallback[0][1] = 11.0f;
            fallback[3][0] = 12.0f;
            fallback[3][1] = 11.0f;
            fallback[2][0] = 7.0f;
            fallback[2][1] = 11.0f;
            this.uD0.coM4(id, fallback);
            return fallback;
        }
        float[][] values = new float[4][2];
        String[] lines = resource.gd0("UTF-8").split("\\r?\\n");
        for (int i = 0; i < lines.length && i < 4; i++) {
            String[] parts = lines[i].split(",");
            if (parts.length == 2) {
                values[i][0] = Float.parseFloat(parts[0]);
                values[i][1] = Float.parseFloat(parts[1]);
            }
        }
        this.uD0.coM4(id, values);
        return values;
    }

    /**
     * 获取坐骑指定动作与方向的贴图帧 (Lq)
     */
    public final Wr Lq(int index, int cached, short id) {
        return getMountFrame(index, cached, id);
    }

    /**
     * 现代命名：获取坐骑贴图帧
     */
    public final Wr getMountFrame(int index, int cached, short id) {
        if (cached == 0) {
            AG0[] frames = SS.hG0.U(id, (byte) 0, false);
            if (frames == null) {
                return null;
            }
            return frames[index].f60;
        }
        Wr[] values = (Wr[]) this.lpT9.f5(id);
        if (values != null) {
            return values[index];
        }
        AG0[] frames = SS.hG0.U(id, (byte) 0, false);
        if (frames == null) {
            return null;
        }
        values = new Wr[frames.length];
        for (int i = 0; i < frames.length; i++) {
            lg_0.I70.getClass();
            String path = "data/sprites/mounts/" + id + "-" + i + ".png";
            VE resource = new VE(path, zv_1.tt0);
            if (resource.os0()) {
                values[i] = new Wr(new CN(frames[i].f60, resource));
            } else {
                values[i] = null;
            }
        }
        this.lpT9.coM4(id, values);
        return values[index];
    }
}
