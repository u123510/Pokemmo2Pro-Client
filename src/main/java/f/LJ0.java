package f;

import cn.pokemmo.graphics.texture.PixmapPacker;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.LJ0
 * 核心逻辑已迁移至 cn.pokemmo.graphics.texture.PixmapPacker
 */
public class LJ0 extends PixmapPacker {

    public LJ0(int width, int height, ix0_0 format, int padding, boolean duplicateBorder) {
        super(width, height, format, padding, duplicateBorder);
    }

    public LJ0(int width, int height, ix0_0 format, int padding, boolean duplicateBorder, vq0_0 strategy) {
        super(width, height, format, padding, duplicateBorder, strategy);
    }

    public LJ0(int width, int height, ix0_0 format, int padding, boolean duplicateBorder,
            boolean stripWhitespaceX, boolean stripWhitespaceY, vq0_0 strategy) {
        super(width, height, format, padding, duplicateBorder, stripWhitespaceX, stripWhitespaceY, strategy);
    }

}
