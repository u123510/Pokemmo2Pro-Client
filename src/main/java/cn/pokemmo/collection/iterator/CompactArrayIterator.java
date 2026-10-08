package cn.pokemmo.collection.iterator;

import f.CO;
import f.nf_1;
import f.y60_0;
import f.yr_1;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CompactArrayIterator implements Iterator, Iterable {
    public final y60_0 Vl0;
    public final boolean Tj;
    public int Mu;
    public boolean mo0 = true;

    public CompactArrayIterator(y60_0 var1) {
        this(var1, true);
    }

    public CompactArrayIterator(y60_0 var1, boolean var2) {
        this.Vl0 = var1;
        this.Tj = var2;
    }

    @Override
    public final boolean hasNext() {
        if (this.mo0) {
            return this.Mu < this.Vl0.IR;
        } else {
            throw new nf_1("#iterator() cannot be used nested.");
        }
    }

    @Override
    public Object next() {
        int var1 = this.Mu;
        y60_0 var2 = this.Vl0;
        if (this.Mu < this.Vl0.IR) {
            if (this.mo0) {
                this.Mu = var1 + 1;
                return var2.get(var1);
            } else {
                throw new nf_1("#iterator() cannot be used nested.");
            }
        } else {
            throw new NoSuchElementException(String.valueOf(this.Mu));
        }
    }

    @Override
    public void remove() {
        if (this.Tj) {
            int var1;
            int var10000 = var1 = this.Mu - 1;
            this.Mu = var1;
            y60_0 var5 = this.Vl0;
            if (var10000 >= 0) {
                if (var1 < var5.IR) {
                    Object[] var2 = var5.GD;
                    int var3 = var5.LD0;
                    int var6 = var5.VU;
                    int var4 = var1 + var3;
                    if (var5.LD0 < var6) {
                        Object var10007 = var2[var4];
                        var1 = var4 + 1;
                        var3 = var6 - var4;
                        System.arraycopy(var2, var1, var2, var4, var3);
                        var2[var6] = null;
                        var5.VU--;
                    } else if (var4 >= var2.length) {
                        Object var10004 = var2[var1 = var4 - var2.length];
                        var3 = var1 + 1;
                        var4 = var6 - var1;
                        System.arraycopy(var2, var3, var2, var1, var4);
                        var5.VU--;
                    } else {
                        Object var18 = var2[var4];
                        var1 = var3 + 1;
                        int var13 = var4 - var3;
                        System.arraycopy(var2, var3, var2, var1, var13);
                        var2[var3] = null;
                        var10000 = var1 = var5.LD0 + 1;
                        var5.LD0 = var1;
                        if (var10000 == var2.length) {
                            var5.LD0 = 0;
                        }
                    }

                    var5.IR--;
                } else {
                    throw new IndexOutOfBoundsException(CO.go("index can't be >= size: ", var1, " >= ").append(var5.IR).toString());
                }
            } else {
                var5.getClass();
                throw new IndexOutOfBoundsException(yr_1.pG("index can't be < 0: ", var1));
            }
        } else {
            throw new nf_1("Remove not allowed.");
        }
    }

    @Override
    public Iterator iterator() {
        return this;
    }
}
