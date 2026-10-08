package cn.pokemmo.graphics.gl;

import f.*;

public class GlUniformBufferObject {
    public static GlUniformBufferObject dL0;
    public static GlUniformBufferObject Pu;
    public static bm0_1 zr0;
    public final byte G0;
    public final int r2;

    public GlUniformBufferObject() {
        this.G0 = 0;
        this.r2 = 0;
    }

    public GlUniformBufferObject(byte type, int id) {
        this.G0 = type;
        this.r2 = id;
    }

    static {
        if (f.vk0_0.dL0 == null) {
            try {
                Class.forName(f.vk0_0.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
