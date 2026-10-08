package pro.pokemmo2.encounter;

import f.AG0;
import f.S70;
import f.Wr;
import f.gh_1;
import f.le0_2;
import f.yh_0;

/**
 * 遭遇记录仪 UI 辅助工具类。
 * 安全获取宝可梦精灵图、道具图标与常用 UI 元素。
 */
public class EncounterUIHelper {

    /**
     * 安全创建宝可梦图标组件 (基于 S70 / SpriteLabel，纯净无按钮底框)
     */
    public static le0_2 createPokemonIcon(short speciesId) {
        return createPokemonIcon(speciesId, false, 30, 24);
    }

    public static le0_2 createPokemonIcon(short speciesId, boolean shiny) {
        return createPokemonIcon(speciesId, shiny, 30, 24);
    }

    public static le0_2 createPokemonIcon(short speciesId, boolean shiny, int width, int height) {
        if (speciesId <= 0) {
            return null;
        }
        try {
            if (yh_0.Xm0 != null) {
                AG0[] sprites = yh_0.Xm0.qC0(speciesId, (byte) 0, shiny);
                if (sprites != null && sprites.length > 0 && sprites[0] != null) {
                    S70 icon = new S70(width, height);
                    icon.JH().o60(sprites);
                    icon.JH().df(); // 居中对齐
                    return icon;
                }
            }
        } catch (Throwable ignored) {
            // 忽略非运行时环境或资源未加载异常
        }
        return null;
    }

    /**
     * 安全创建道具图标组件 (基于 S70，如精灵球 itemId=4，未知 cube itemId=0)
     */
    public static le0_2 createItemIcon(short itemId) {
        try {
            if (gh_1.Jh0() != null) {
                Wr wr = gh_1.Jh0().Kd0(itemId);
                if (wr != null) {
                    S70 icon = new S70(22, 22);
                    icon.JH().r8(wr.coM8());
                    icon.JH().df(); // 居中对齐
                    return icon;
                }
            }
        } catch (Throwable ignored) {
            // 忽略非运行时环境或资源未加载异常
        }
        return null;
    }
}

