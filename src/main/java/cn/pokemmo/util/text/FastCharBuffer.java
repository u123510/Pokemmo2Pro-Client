/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.util.text;

import f.*;

import f.yr_1;
import java.util.Arrays;

/*
 * Renamed from f.b3
 */
public class FastCharBuffer
implements Appendable,
CharSequence {
    public static final char[] mK0 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public char[] ZB;
    public int hp0;

    public final void q6(int n) {
        char[] cArray = this.ZB;
        int n2 = (this.ZB.length >> 1) + cArray.length + 2;
        if (n <= n2) {
            n = n2;
        }
        char[] replacement = new char[n];
        n = this.hp0;
        System.arraycopy(cArray, 0, replacement, 0, n);
        this.ZB = replacement;
    }

    public final void nW(int n, int n2) {
        char[] cArray = this.ZB;
        int n3 = this.hp0;
        if (this.ZB.length - n3 >= n) {
            int n4 = n2 + n;
            n = n3 - n2;
            System.arraycopy(cArray, n2, cArray, n4, n);
            return;
        }
        int n5 = (cArray.length << 1) + 2;
        if ((n3 += n) <= n5) {
            n3 = n5;
        }
        char[] cArray2 = cArray;
        cArray = new char[n3];
        System.arraycopy(cArray2, 0, cArray, 0, n2);
        int n6 = n2 + n;
        n = this.hp0 - n2;
        System.arraycopy(this.ZB, n2, cArray, n6, n);
        this.ZB = cArray;
    }

    public final void w7() {
        int n = this.hp0 + 4;
        if (n > this.ZB.length) {
            this.q6(n);
        }
        char[] cArray = this.ZB;
        int n2 = this.hp0;
        int n3 = n2;
        char[] cArray2 = cArray;
        int n4 = n3;
        int n5 = n4 + 1;
        cArray2[n4] = 110;
        int n6 = n5;
        n5 = n3 + 2;
        cArray2[n6] = 117;
        cArray[n5] = 108;
        this.hp0 = n2 + 4;
        this.ZB[n3 += 3] = 108;
    }

    public final void so(char[] cArray, int n, int n2) {
        if (n <= cArray.length && n >= 0) {
            if (n2 >= 0 && cArray.length - n >= n2) {
                int n3 = this.hp0 + n2;
                if (n3 > this.ZB.length) {
                    this.q6(n3);
                }
                char[] target = this.ZB;
                int n4 = this.hp0;
                System.arraycopy(cArray, n, target, n4, n2);
                this.hp0 = n3;
                return;
            }
            throw new ArrayIndexOutOfBoundsException(yr_1.pG("Length out of bounds: ", n2));
        }
        throw new ArrayIndexOutOfBoundsException(yr_1.pG("Offset out of bounds: ", n));
    }

    public final void GC0(char c) {
        int n = this.hp0;
        if (n == this.ZB.length) {
            this.q6(n + 1);
        }
        int n2 = this.hp0;
        this.hp0 = n2 + 1;
        this.ZB[n2] = c;
    }

    public final void sV(String string) {
        if (string == null) {
            this.w7();
            return;
        }
        int n = string.length();
        int n2 = this.hp0 + n;
        if (n2 > this.ZB.length) {
            this.q6(n2);
        }
        char[] target = this.ZB;
        int n3 = this.hp0;
        string.getChars(0, n, target, n3);
        this.hp0 = n2;
    }

    @Override
    public final char charAt(int n) {
        if (n >= 0 && n < this.hp0) {
            return this.ZB[n];
        }
        throw new StringIndexOutOfBoundsException(n);
    }

    @Override
    public final int length() {
        return this.hp0;
    }

    public final void A2(int n) {
        if (n >= 0) {
            char[] cArray = this.ZB;
            if (n > this.ZB.length) {
                this.q6(n);
            } else {
                int n2 = this.hp0;
                if (n2 < n) {
                    Arrays.fill(cArray, n2, n, '\u0000');
                }
            }
            this.hp0 = n;
            return;
        }
        throw new StringIndexOutOfBoundsException(n);
    }

    @Override
    public final String toString() {
        int n = this.hp0;
        if (n == 0) {
            return "";
        }
        return new String(this.ZB, 0, n);
    }

    @Override
    public final CharSequence subSequence(int n, int n2) {
        if (n >= 0 && n <= n2 && n2 <= this.hp0) {
            if (n == n2) {
                return "";
            }
            return new String(this.ZB, n, n2 - n);
        }
        throw new StringIndexOutOfBoundsException();
    }

    public FastCharBuffer on(int n) {
        if (n == Integer.MIN_VALUE) {
            this.sV("-2147483648");
        } else {
            if (n < 0) {
                this.GC0('-');
                n = -n;
            }
            if (n >= 10000) {
                if (n >= 1000000000) {
                    this.GC0(mK0[(int)((long)n % 10000000000L / 1000000000L)]);
                }
                if (n >= 100000000) {
                    this.GC0(mK0[n % 1000000000 / 100000000]);
                }
                if (n >= 10000000) {
                    this.GC0(mK0[n % 100000000 / 10000000]);
                }
                if (n >= 1000000) {
                    this.GC0(mK0[n % 10000000 / 1000000]);
                }
                if (n >= 100000) {
                    this.GC0(mK0[n % 1000000 / 100000]);
                }
                this.GC0(mK0[n % 100000 / 10000]);
            }
            if (n >= 1000) {
                this.GC0(mK0[n % 10000 / 1000]);
            }
            if (n >= 100) {
                this.GC0(mK0[n % 1000 / 100]);
            }
            if (n >= 10) {
                this.GC0(mK0[n % 100 / 10]);
            }
            this.GC0(mK0[n % 10]);
        }
        return this;
    }

    @Override
    public final boolean isEmpty() {
        return this.hp0 == 0;
    }

    public final int hashCode() {
        int n = this.hp0 + 31;
        for (int j = 0; j < this.hp0; ++j) {
            n = n * 31 + this.ZB[j];
        }
        return n;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (FastCharBuffer.class != object.getClass()) {
            return false;
        }
        FastCharBuffer other = (FastCharBuffer)object;
        int n = this.hp0;
        if (n != other.hp0) {
            return false;
        }
        char[] left = this.ZB;
        char[] right = other.ZB;
        for (int j = 0; j < n; ++j) {
            if (left[j] == right[j]) continue;
            return false;
        }
        return true;
    }

    @Override
    public final Appendable append(char c) {
        FastCharBuffer b3_02 = this;
        b3_02.GC0(c);
        return b3_02;
    }

    @Override
    public final Appendable append(CharSequence charSequence, int n, int n2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        if (n >= 0 && n2 >= 0 && n <= n2 && n2 <= charSequence.length()) {
            FastCharBuffer b3_02 = this;
            b3_02.sV(charSequence.subSequence(n, n2).toString());
            return b3_02;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final Appendable append(CharSequence object) {
        if (object == null) {
            this.w7();
        } else if (object instanceof FastCharBuffer) {
            FastCharBuffer b3_02 = (FastCharBuffer)object;
            int n = b3_02.hp0;
            this.so(b3_02.ZB, 0, n);
        } else {
            this.sV(object.toString());
        }
        return this;
    }

    public FastCharBuffer u(String string, char c) {
        int n = string.length();
        int n2 = 0;
        while (true) {
            block10: {
                block11: {
                    block14: {
                        block13: {
                            int n3;
                            int n4;
                            block12: {
                                if (n2 == (n4 = this.hp0)) {
                                    return this;
                                }
                                if (this.ZB[n2] != c) break block10;
                                int n5 = n2;
                                n3 = n5 + 1;
                                if (n5 < 0) break block11;
                                if (n3 > n4) {
                                    n3 = n4;
                                }
                                if (n3 <= n2) break block12;
                                n4 = string.length();
                                int n6 = n3 - n2 - n4;
                                if (n6 > 0) {
                                    char[] cArray = this.ZB;
                                    int n7 = n3;
                                    int n8 = n2 + n4;
                                    n3 = this.hp0 - n3;
                                    System.arraycopy(this.ZB, n7, cArray, n8, n3);
                                } else if (n6 < 0) {
                                    this.nW(-n6, n3);
                                }
                                char[] cArray = this.ZB;
                                string.getChars(0, n4, cArray, n2);
                                this.hp0 -= n6;
                                break block13;
                            }
                            if (n2 != n3) break block11;
                            if (n2 < 0 || n2 > n4) break block14;
                            n4 = string.length();
                            if (n4 != 0) {
                                FastCharBuffer b3_02 = this;
                                b3_02.nW(n4, n2);
                                char[] cArray = b3_02.ZB;
                                string.getChars(0, n4, cArray, n2);
                                this.hp0 += n4;
                            }
                        }
                        n2 += n;
                        continue;
                    }
                    throw new StringIndexOutOfBoundsException(n2);
                }
                throw new StringIndexOutOfBoundsException();
            }
            ++n2;
        }
    }

    public final void Rs(Object object) {
        if (object == null) {
            this.w7();
        } else {
            this.sV(object.toString());
        }
    }

    public final void vK0(String string) {
        this.sV(string);
    }

    public FastCharBuffer() {
        this.ZB = new char[16];
    }

    public FastCharBuffer(int n) {
        if (n >= 0) {
            this.ZB = new char[n];
            return;
        }
        throw new NegativeArraySizeException();
    }

    public FastCharBuffer(CharSequence charSequence) {
        this(charSequence.toString());
    }

    public FastCharBuffer(b3_0 b3_02) {
        int n = b3_02.hp0;
        this.hp0 = n;
        char[] cArray = new char[n + 16];
        this.ZB = cArray;
        System.arraycopy(b3_02.ZB, 0, cArray, 0, n);
    }

    public FastCharBuffer(String string) {
        int n = string.length();
        this.hp0 = n;
        char[] cArray = new char[n + 16];
        this.ZB = cArray;
        string.getChars(0, n, cArray, 0);
    }
}
