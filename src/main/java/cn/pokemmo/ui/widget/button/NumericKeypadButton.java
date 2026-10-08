package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

public class NumericKeypadButton extends BaseButton {
    public long wA;
    public int fJ0;
    public final int Z30;
    public final StringBuilder Tg;
    public final int Yj0;
    public final long e4;
    public boolean ME0;

    public NumericKeypadButton(int digits) {
        super();
        int width = 2;
        this.Z30 = 100;
        this.ME0 = false;
        this.Yj0 = 4;
        this.wA = System.nanoTime();
        this.Tg = new StringBuilder();
        this.Tg.setLength(Integer.signum(width) + 5);
        long scale = 1000000000L;
        for (int i = 0; i < width; i++) scale *= 10L;
        this.e4 = scale;
        E5(0);
    }

    public NumericKeypadButton() { this(0); }

    @Override
    public final String Ck() { return "fpscounter"; }

    public final void Z7(boolean enabled) { this.ME0 = enabled; }

    public final void FW(zk0_1 ignored) {
        int count = ++this.fJ0;
        if (count >= this.Z30) {
            long elapsed = System.nanoTime() - this.wA;
            this.wA = System.nanoTime();
            if (this.ME0) {
                E5(lg_0.S4.fs0 * 100);
            } else {
                E5((int) ((count * this.e4 + (elapsed >> 1)) / elapsed));
            }
            this.fJ0 = 0;
        }
        QD(this.M);
    }

    public final void E5(int value) {
        StringBuilder out = this.Tg;
        int end = out.length();
        int digit;
        do {
            int position = --end;
            out.setCharAt(position, (char) (value % 10 + '0'));
            digit = value / 10;
            if (this.Yj0 == position) {
                position = end = end - 2;
                out.setCharAt(position, '.');
            } else {
                end = position;
            }
            if (end <= 0 && digit > 0) {
                int length = out.length();
                do {
                    int p = --length;
                    out.setCharAt(p, '9');
                    if (this.Yj0 == p) length -= 2;
                    else length = p;
                } while (length > 0);
                break;
            }
            value = digit;
        } while (end > 0);
        B(out);
    }
}
