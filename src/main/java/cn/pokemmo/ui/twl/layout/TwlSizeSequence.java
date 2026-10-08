package cn.pokemmo.ui.twl.layout;

import java.util.Arrays;

/**
 * 动态尺寸序列与索引树 (SizeSequence)
 */
public class TwlSizeSequence {
    public int[] p2;
    public int VQ;
    public int wB;

    public TwlSizeSequence() {
        this(64);
    }

    public TwlSizeSequence(int initialCapacity) {
        this.p2 = new int[initialCapacity];
    }

    public int getPosition(int index) {
        int low = 0;
        int high = this.VQ;
        int pos = 0;
        while (low < high) {
            int mid = low + high >>> 1;
            if (index <= mid) {
                high = mid;
                continue;
            }
            pos += this.p2[mid];
            low = mid + 1;
        }
        return pos;
    }

    public final int eC0(int index) {
        return getPosition(index);
    }

    public int getTotalSize() {
        int low = 0;
        int high = this.VQ;
        int total = 0;
        while (low < high) {
            int mid = low + high >>> 1;
            total += this.p2[mid];
            low = mid + 1;
        }
        return total;
    }

    public final int iE() {
        return getTotalSize();
    }

    public int getIndex(int pos) {
        int low = 0;
        int high = this.VQ;
        while (low < high) {
            int mid = low + high >>> 1;
            int size = this.p2[mid];
            if (pos < size) {
                high = mid;
                continue;
            }
            pos -= size;
            low = mid + 1;
        }
        return low;
    }

    public final int gC(int pos) {
        return getIndex(pos);
    }

    public boolean setSize(int index, int newSize) {
        int diff = newSize - (this.getPosition(index + 1) - this.getPosition(index));
        if (diff != 0) {
            int low = 0;
            int high = this.VQ;
            while (low < high) {
                int mid = low + high >>> 1;
                if (index <= mid) {
                    this.p2[mid] += diff;
                    high = mid;
                    continue;
                }
                low = mid + 1;
            }
            return true;
        }
        return false;
    }

    public final boolean IF(int index, int newSize) {
        return setSize(index, newSize);
    }

    public final int li(int start, int end, int[] array) {
        int acc = 0;
        while (start < end) {
            int mid = start + end >>> 1;
            int val = this.p2[mid];
            array[mid] = val - this.li(start, mid, array);
            acc += val;
            start = mid + 1;
        }
        return acc;
    }

    public final int iB0(int start, int end) {
        int acc = 0;
        while (start < end) {
            int mid = start + end >>> 1;
            int val = this.p2[mid];
            int subTotal = this.iB0(start, mid) + val;
            this.p2[mid] = subTotal;
            acc += subTotal;
            start = mid + 1;
        }
        return acc;
    }

    public void setDefault(int start, int count) {
        int end = start + count;
        Arrays.fill(this.p2, start, end, this.wB);
    }

    public void DE(int start, int count) {
        setDefault(start, count);
    }
}
