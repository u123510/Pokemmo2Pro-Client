package cn.pokemmo.rom.gba.offset;

import f.qa0_1;

/**
 * GBA ROM 固定物理偏移解析器
 * 
 * 职责:
 * 返回已知的静态固定偏移地址，无需动态解引用或模式扫描。
 * 
 * 原混淆类: f.K9
 */
public class GbaDirectOffsetResolver extends GbaRomOffsetResolver {
    public final int nq;

    public GbaDirectOffsetResolver(int offset) {
        this.nq = offset;
    }

    @Override
    public final int uO(qa0_1 rom) {
        return this.nq;
    }
}
