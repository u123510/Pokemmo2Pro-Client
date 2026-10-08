package cn.pokemmo.pokemon.battle;

import cn.pokemmo.ui.widget.color.ColorArea1D;
import f.V7;

/**
 * @deprecated 历史误命名类。f.KC 实际语义为 TWL 界面一维颜色渐变选择器控件 (Theme: "colorarea1d")。
 * 现代规范实现请使用 {@link ColorArea1D}，向下兼容垫片请使用 {@link f.KC}。
 */
@Deprecated
public class BattleParticleEffect extends ColorArea1D {
    public BattleParticleEffect(int var1, V7 var2) {
        super(var1, var2);
    }
}
