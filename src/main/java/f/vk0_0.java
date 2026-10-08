package f;

import cn.pokemmo.graphics.gl.GlUniformBufferObject;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.vk0_0
 * 核心实现已迁移至 {@link cn.pokemmo.graphics.gl.GlUniformBufferObject}
 */
public final class vk0_0 extends GlUniformBufferObject {
    public static final vk0_0 dL0;
    public static final vk0_0 Pu;
    public static final bm0_1 zr0;

    public vk0_0() {
        super();
    }

    public vk0_0(byte type, int id) {
        super(type, id);
    }

    static {

        dL0 = new vk0_0();
        vk0_0 value1 = new vk0_0((byte) 1, 5600);
        vk0_0 value2 = new vk0_0((byte) 2, 5601);
        vk0_0 value3 = new vk0_0((byte) 3, 5602);
        vk0_0 value4 = new vk0_0((byte) 4, 5603);
        Pu = new vk0_0((byte) 5, 5604);
        vk0_0 value6 = new vk0_0((byte) 6, 5605);
        vk0_0 value7 = new vk0_0((byte) 7, 5606);
        vk0_0 value8 = new vk0_0((byte) 8, 5607);
        vk0_0 value9 = new vk0_0((byte) 9, 5608);
        vk0_0 value10 = new vk0_0((byte) 10, 5611);
        vk0_0 value11 = new vk0_0((byte) 11, 5609);
        vk0_0 value12 = new vk0_0((byte) 12, 5610);
        vk0_0 value13 = new vk0_0((byte) 13, 5611);
        vk0_0 value14 = new vk0_0((byte) 13, 5612);
        vk0_0 value15 = new vk0_0((byte) 13, 5608);
        vk0_0 value16 = new vk0_0((byte) 14, 5622);
        vk0_0 value17 = new vk0_0((byte) 15, 5624);
        vk0_0 value18 = new vk0_0((byte) 16, 5635);
        vk0_0[] values = {
                dL0, value1, value2, value3, value4, Pu, value6, value7,
                value8, value9, value10, value11, value12, value13, value14,
                value15, value16, value17, value18
        };
        zr0 = new bm0_1();
        for (vk0_0 value : values) {
            zr0.gE0(value.G0, value);
        }
    
        GlUniformBufferObject.dL0 = dL0;
        GlUniformBufferObject.Pu = Pu;
        GlUniformBufferObject.zr0 = zr0;
    }
}
