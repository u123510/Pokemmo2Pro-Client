package cn.pokemmo.graphics.material.attribute;

import f.hf_1;

/**
 * 3D 材质与环境属性基类
 * 
 * 职责: 封装基于 64 位 Bitmask 材质/环境属性的唯一类型注册与属性拷贝契约。
 * 原混淆基类: f.hf_1
 */
public abstract class BaseMaterialAttribute extends hf_1 {

    public BaseMaterialAttribute(long type) {
        super(type);
    }

    /**
     * 获取材质属性对应的位掩码 (Bitmask)
     */
    public long getAttributeType() {
        return this.yO;
    }

    /**
     * 获取材质属性对应的位掩码索引 (Bit index)
     */
    public int getAttributeIndex() {
        return this.YF;
    }
}
