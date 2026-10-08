package cn.pokemmo.ui.twl.control;

import f.rk_2;

/**
 * TWL 密码输入框字符掩码器 (EditField.PasswordMasker)
 * 原始混淆类: f.NG
 */
public class TwlPasswordMasker implements CharSequence {
    public final CharSequence targetText;
    public final char maskChar;

    // 混淆字段兼容别名
    public final CharSequence nt0;
    public final char Nz;

    public TwlPasswordMasker(rk_2 target, char maskChar) {
        this.targetText = target;
        this.maskChar = maskChar;

        this.nt0 = target;
        this.Nz = maskChar;
    }

    @Override
    public int length() {
        return this.targetText.length();
    }

    @Override
    public char charAt(int index) {
        return this.maskChar;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        throw new UnsupportedOperationException("Not supported.");
    }
}
