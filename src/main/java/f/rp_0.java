package f;

import cn.pokemmo.input.KeyBinding;
import java.util.function.IntSupplier;

/**
 * 兼容垫片 (Shim) - 游戏按键动作与手柄映射绑定
 * 核心实现已迁移至 cn.pokemmo.input.KeyBinding
 */
public final class rp_0 extends KeyBinding {

    public rp_0(int cd0, String yJ0, boolean Zt, int Bg0, int MM, IntSupplier lr, BO aA0) {
        super(cd0, yJ0, Zt, Bg0, MM, lr, aA0);
    }

    public rp_0(int cd0, String yJ0, String e10, int MM, IntSupplier lr, BO aA0) {
        super(cd0, yJ0, e10, MM, lr, aA0);
    }
}
