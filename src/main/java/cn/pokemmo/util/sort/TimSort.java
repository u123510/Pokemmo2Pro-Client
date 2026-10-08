package cn.pokemmo.util.sort;

import f.*;

import java.util.Comparator;

public class TimSort {
    public Object[] dd;
    public Comparator HD0;
    public int YM = 7;
    public Object[] MH = new Object[256];
    public int y70;
    public int nf0;
    public final int[] Y2 = new int[40];
    public final int[] BD0 = new int[40];

    public TimSort() {
    }

    public static void B9(Object[] a, int left, int right, int start, Comparator comparator) {
        if (start == left) {
            start++;
        }
        while (start < right) {
            Object value = a[start];
            int upper = start;
            int lower = left;
            while (lower < upper) {
                int middle = (lower + upper) >>> 1;
                if (comparator.compare(value, a[middle]) < 0) {
                    upper = middle;
                } else {
                    lower = middle + 1;
                }
            }
            int count = start - lower;
            if (count == 1) {
                a[lower + 1] = a[lower];
            } else if (count == 2) {
                a[lower + 2] = a[lower + 1];
                a[lower + 1] = a[lower];
            } else if (count > 2) {
                System.arraycopy(a, lower, a, lower + 1, count);
            }
            a[lower] = value;
            start++;
        }
    }

    public static int pn0(int start, int end, Comparator comparator, Object[] a) {
        int next = start + 1;
        if (next == end) {
            return 1;
        }
        Object value = a[next];
        if (comparator.compare(value, a[start]) < 0) {
            next = start + 2;
            while (next < end && comparator.compare(value = a[next], a[next - 1]) < 0) {
                next++;
            }
            int last = next - 1;
            int cursor = start;
            while (cursor < last) {
                Object saved = a[cursor];
                int nextCursor = cursor + 1;
                a[cursor] = a[last];
                a[last] = saved;
                last--;
                cursor = nextCursor;
            }
        } else {
            next = start + 2;
            while (next < end && comparator.compare(value = a[next], a[next - 1]) >= 0) {
                next++;
            }
        }
        return next - start;
    }

    public static int st0(Object value, Object[] a, int base, int length, int hint, Comparator comparator) {
        int lastOfs = 0;
        int ofs = 1;
        int hintIndex = base + hint;
        if (comparator.compare(value, a[hintIndex]) > 0) {
            int maxOfs = length - hint;
            while (ofs < maxOfs && comparator.compare(value, a[hintIndex + ofs]) > 0) {
                lastOfs = ofs;
                ofs = (ofs << 1) + 1;
                if (ofs <= 0) {
                    ofs = maxOfs;
                    break;
                }
            }
            if (ofs > maxOfs) {
                ofs = maxOfs;
            }
            lastOfs += hint;
            ofs += hint;
        } else {
            int maxOfs = hint + 1;
            while (ofs < maxOfs && comparator.compare(value, a[hintIndex - ofs]) <= 0) {
                lastOfs = ofs;
                ofs = (ofs << 1) + 1;
                if (ofs <= 0) {
                    ofs = maxOfs;
                    break;
                }
            }
            if (ofs > maxOfs) {
                ofs = maxOfs;
            }
            int temp = lastOfs;
            lastOfs = hint - ofs;
            ofs = hint - temp;
        }
        lastOfs++;
        while (lastOfs < ofs) {
            int middle = lastOfs + ((ofs - lastOfs) >>> 1);
            if (comparator.compare(value, a[base + middle]) > 0) {
                lastOfs = middle + 1;
            } else {
                ofs = middle;
            }
        }
        return ofs;
    }

    public static int s30(Object value, Object[] a, int base, int length, int hint, Comparator comparator) {
        int ofs = 1;
        int lastOfs = 0;
        int hintIndex = base + hint;
        if (comparator.compare(value, a[hintIndex]) < 0) {
            int maxOfs = hint + 1;
            while (ofs < maxOfs && comparator.compare(value, a[hintIndex - ofs]) < 0) {
                lastOfs = ofs;
                ofs = (ofs << 1) + 1;
                if (ofs <= 0) {
                    ofs = maxOfs;
                    break;
                }
            }
            if (ofs > maxOfs) {
                ofs = maxOfs;
            }
            int temp = lastOfs;
            lastOfs = hint - ofs;
            ofs = hint - temp;
        } else {
            int maxOfs = length - hint;
            while (ofs < maxOfs && comparator.compare(value, a[hintIndex + ofs]) >= 0) {
                lastOfs = ofs;
                ofs = (ofs << 1) + 1;
                if (ofs <= 0) {
                    ofs = maxOfs;
                    break;
                }
            }
            if (ofs > maxOfs) {
                ofs = maxOfs;
            }
            lastOfs += hint;
            ofs += hint;
        }
        lastOfs++;
        while (lastOfs < ofs) {
            int middle = lastOfs + ((ofs - lastOfs) >>> 1);
            if (comparator.compare(value, a[base + middle]) < 0) {
                ofs = middle;
            } else {
                lastOfs = middle + 1;
            }
        }
        return ofs;
    }

    public final void eL(int index) {
        int base1 = Y2[index];
        int length1 = BD0[index];
        int base2 = Y2[index + 1];
        int length2 = BD0[index + 1];
        BD0[index] = length1 + length2;
        if (index == nf0 - 3) {
            Y2[index + 1] = Y2[index + 2];
            BD0[index + 1] = BD0[index + 2];
        }
        nf0--;
        if (length1 == 0 || length2 == 0) {
            return;
        }
        Object[] array = this.dd;
        if (length1 <= length2) {
            Object[] buffer = PI(length1);
            System.arraycopy(array, base1, buffer, 0, length1);
            int left = 0;
            int right = base2;
            int dest = base1;
            int rightEnd = base2 + length2;
            while (left < length1 && right < rightEnd) {
                if (HD0.compare(buffer[left], array[right]) <= 0) {
                    array[dest++] = buffer[left++];
                } else {
                    array[dest++] = array[right++];
                }
            }
            if (left < length1) {
                System.arraycopy(buffer, left, array, dest, length1 - left);
            }
        } else {
            Object[] buffer = PI(length2);
            System.arraycopy(array, base2, buffer, 0, length2);
            int left = base1 + length1 - 1;
            int right = length2 - 1;
            int dest = base2 + length2 - 1;
            while (left >= base1 && right >= 0) {
                if (HD0.compare(array[left], buffer[right]) > 0) {
                    array[dest--] = array[left--];
                } else {
                    array[dest--] = buffer[right--];
                }
            }
            if (right >= 0) {
                System.arraycopy(buffer, 0, array, base1, right + 1);
            }
        }
    }

    public final Object[] PI(int size) {
        this.y70 = Math.max(this.y70, size);
        if (this.MH.length < size) {
            int value = size;
            value |= value >> 1;
            value |= value >> 2;
            value |= value >> 4;
            value |= value >> 8;
            value |= value >> 16;
            value++;
            if (value < 0) {
                value = size;
            } else {
                value = Math.min(value, this.dd.length >>> 1);
            }
            this.MH = new Object[value];
        }
        return this.MH;
    }
}
