package cn.pokemmo.ui.twl.model;

import f.Z6;
import f.a7_0;
import f.rk_2;
import java.util.HashMap;
import java.util.Map;

/**
 * 默认文本编辑框数据模型 (DefaultEditFieldModel)
 */
public class TwlDefaultEditFieldModel implements rk_2 {
    public final StringBuilder YA;
    public Z6[] v90;
    public final HashMap<String, String> L8;

    public TwlDefaultEditFieldModel() {
        this.L8 = new HashMap<>();
        this.YA = new StringBuilder();
    }

    public StringBuilder getText() {
        return this.YA;
    }

    @Override
    public int length() {
        return this.YA.length();
    }

    @Override
    public char charAt(int i) {
        return this.YA.charAt(i);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.YA.subSequence(start, end);
    }

    @Override
    public String toString() {
        return this.YA.toString();
    }

    public void addCallback(Z6 callback) {
        this.v90 = (Z6[]) a7_0.gE(this.v90, callback, Z6.class);
    }

    public final void qk0(Z6 callback) {
        addCallback(callback);
    }

    public int replace(int start, int length, String replacement) {
        int textLength = this.YA.length();
        if (start < 0 || start > textLength) {
            throw new StringIndexOutOfBoundsException(start);
        }
        if (length < 0 || length > textLength - start) {
            throw new StringIndexOutOfBoundsException();
        }

        int replacementLength = replacement.length();
        if (length > 0 || replacementLength > 0) {
            this.YA.replace(start, start + length, replacement);
            Z6[] cbList = this.v90;
            if (cbList != null) {
                for (Z6 cb : cbList) {
                    cb.AD0(start, length, replacementLength);
                }
            }
        }

        if (this.YA.length() < 1) {
            this.L8.clear();
        }
        return replacementLength;
    }

    public final int sb(int start, int length, String replacement) {
        return replace(start, length, replacement);
    }

    public void addPasswordMask(String from, String to) {
        if (from.length() == to.length()) {
            this.L8.putIfAbsent(from, to);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void b1(String from, String to) {
        addPasswordMask(from, to);
    }

    public int findPasswordMaskBoundary(int oldPos, int newPos) {
        if (this.L8.isEmpty()) {
            return newPos;
        }

        for (Map.Entry<String, String> entry : this.L8.entrySet()) {
            int index = 0;
            while (true) {
                index = this.YA.indexOf(entry.getKey(), index);
                if (index < 0) {
                    break;
                }

                int keyLen = entry.getKey().length();
                if (keyLen + index > newPos && index < newPos) {
                    if (oldPos > newPos) {
                        return index;
                    }
                    return keyLen + index;
                }
                index++;
            }
        }

        return newPos;
    }

    public final int Lu0(int oldPos, int newPos) {
        return findPasswordMaskBoundary(oldPos, newPos);
    }
}
