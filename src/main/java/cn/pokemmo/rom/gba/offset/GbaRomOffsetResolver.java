package cn.pokemmo.rom.gba.offset;

import f.com7__5;
import f.qa0_1;

/**
 * GBA ROM 数据表偏移动态解析基类
 * 
 * 职责:
 * 为 PokeMMO 客户端读取各类改版/官方 GBA ROM 提供统一的表指针解引用与多态解析框架。
 * 
 * 原混淆类: f.coM7 / com7__5
 */
public abstract class GbaRomOffsetResolver extends com7__5 {

    /**
     * 解析给定 GBA ROM 卡带中的目标物理偏移
     */
    @Override
    public abstract int uO(qa0_1 rom);

    public final GbaRomOffsetResolver cloneResolver() {
        return (GbaRomOffsetResolver) lPt8();
    }
}
