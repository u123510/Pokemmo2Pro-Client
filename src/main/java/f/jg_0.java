package f;

import cn.pokemmo.rom.nds.graphics.NitroCharacterSpriteTable;

/**
 * 兼容垫片 (Shim) - NDS 精灵角色图块集合数据表 (Nitro Character Sprite Table)
 * 实际实现已迁移至 {@link NitroCharacterSpriteTable}
 */
public final class jg_0 extends NitroCharacterSpriteTable {
    public jg_0() { super(); }
    public static jg_0 vE0(Ae ae) {
        NitroCharacterSpriteTable t = NitroCharacterSpriteTable.vE0(ae);
        if (t == null) return null;
        jg_0 res = new jg_0();
        res.Ta = t.Ta;
        return res;
    }
}
