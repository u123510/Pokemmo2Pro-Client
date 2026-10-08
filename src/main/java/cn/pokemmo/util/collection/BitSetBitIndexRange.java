package cn.pokemmo.util.collection;

import f.*;
import java.util.BitSet;

public class BitSetBitIndexRange extends ws_1 {
    public final BitSet COM9;
    public int Uh0;
    public int Xt0;

    public BitSetBitIndexRange() {
        this.COM9 = new BitSet();
        this.Uh0 = Integer.MAX_VALUE;
        this.Xt0 = Integer.MIN_VALUE;
    }

    @Override
    public final boolean iK0(int index) {
        return this.COM9.get(index);
    }

    @Override
    public final void cd() {
        if (this.Xt0 >= this.Uh0) {
            this.Uh0 = Integer.MAX_VALUE;
            this.Xt0 = Integer.MIN_VALUE;
            this.COM9.clear();
        }
    }

    @Override
    public final void J2(int first, int second) {
        this.rk = first;
        this.aW = second;
        this.Uh0 = Math.min(first, second);
        this.Xt0 = Math.max(first, second);
        this.COM9.clear();
        this.COM9.set(this.Uh0, this.Xt0 + 1);
    }

    @Override
    public final void fc0(int first, int second) {
        this.rk = first;
        this.aW = second;
        int from = Math.min(first, second);
        int to = Math.max(first, second);
        while (from <= to) {
            if (!this.COM9.get(from)) {
                this.COM9.set(from);
                if (from < this.Uh0) this.Uh0 = from;
                if (from > this.Xt0) this.Xt0 = from;
            }
            ++from;
        }
    }

    @Override
    public final void Ol(int first, int second) {
        this.rk = first;
        this.aW = second;
        int from = Math.min(first, second);
        int to = Math.max(first, second);
        while (from <= to) {
            if (this.COM9.get(from)) {
                this.WE(from);
            } else if (!this.COM9.get(from)) {
                this.COM9.set(from);
                if (from < this.Uh0) this.Uh0 = from;
                if (from > this.Xt0) this.Xt0 = from;
            }
            ++from;
        }
    }

    @Override
    public final void MM(int first, int second) {
        this.rk = second;
        this.aW = first;
        if (this.Xt0 >= this.Uh0) {
            int from = Math.min(first, second);
            int to = Math.max(first, second);
            while (from <= to) {
                this.WE(from);
                ++from;
            }
        }
    }

    @Override
    public final void ro(int start, int delta) {
        if (start <= this.Xt0) {
            for (int index = this.Xt0; index >= start; --index) {
                if (this.COM9.get(index)) {
                    this.COM9.set(index + delta);
                } else {
                    this.COM9.clear(index + delta);
                }
            }
            this.COM9.clear(start, start + delta);
            this.Xt0 += delta;
            if (this.Uh0 <= this.Xt0) {
                this.Uh0 += delta;
            }
        }
        if (this.aW >= start) this.aW += delta;
        if (this.rk >= start) this.rk += delta;
    }

    @Override
    public final void nE0(int start, int delta) {
        if (start <= this.Xt0) {
            for (int index = start; index <= this.Xt0; ++index) {
                if (this.COM9.get(index + delta)) {
                    this.COM9.set(index);
                } else {
                    this.COM9.clear(index);
                }
            }
            this.Uh0 = this.COM9.nextSetBit(0);
            if (this.Uh0 < 0) {
                this.Uh0 = Integer.MAX_VALUE;
                this.Xt0 = Integer.MIN_VALUE;
            } else {
                while (this.Xt0 >= this.Uh0 && !this.COM9.get(this.Xt0)) {
                    --this.Xt0;
                }
            }
        }
        if (this.aW >= start) this.aW = Math.max(start, this.aW - delta);
        if (this.rk >= start) this.rk = Math.max(start, this.rk - delta);
    }


    public final void WE(int index) {
        if (!this.COM9.get(index)) return;
        this.COM9.clear(index);
        if (index == this.Uh0) {
            this.Uh0 = this.COM9.nextSetBit(index + 1);
            if (this.Uh0 < 0) {
                this.Uh0 = Integer.MAX_VALUE;
                this.Xt0 = Integer.MIN_VALUE;
                return;
            }
        }
        if (index == this.Xt0) {
            int candidate = this.Xt0 - 1;
            while (candidate >= this.Uh0 && !this.COM9.get(candidate)) --candidate;
            this.Xt0 = candidate;
        }
    }
}
