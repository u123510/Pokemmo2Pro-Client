/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.system;

/*
 * Multiple versions of this class in jar - see https://www.benf.org/other/cfr/multi-version-jar.html
 */
public final class CheckIntrinsics {
    private CheckIntrinsics() {
    }

    public static int checkIndex(int n, int n2) {
        if (n >= 0 && n2 > n) {
            return n;
        }
        throw new IndexOutOfBoundsException();
    }

    public static int checkFromToIndex(int n, int n2, int n3) {
        if (n >= 0 && n2 >= n && n3 >= n2) {
            return n;
        }
        throw new IndexOutOfBoundsException();
    }

    public static int checkFromIndexSize(int n, int n2, int n3) {
        if ((n3 | n | n2) >= 0 && n3 - n >= n2) {
            return n;
        }
        throw new IndexOutOfBoundsException();
    }
}

