package cn.pokemmo.world.terrain.animation;

import f.*;

public class ByteArrayStateTileAnimation extends BaseTerrainTileAnimation {
    public ByteArrayStateTileAnimation(byte by, byte... byArray) {
        super(by, byArray[0], new nk_0[0]);
        if (byArray.length == 2) {
            nk_0[] arr = new nk_0[byArray.length * 2];
            for (int i = 0; i < byArray.length; i++) {
                arr[i] = nk_0.Ha(byArray[i], t70_0.li);
            }
            for (int i = 0; i < byArray.length; i++) {
                arr[i + byArray.length] = nk_0.Ha(tx_1.Qf0(byArray[byArray.length - 1 - i]), t70_0.li);
            }
            this.instanceof$(arr);
            return;
        }
        throw new RuntimeException();
    }

    public final int oH0() {
        return 0;
    }

    public final nk_0 Gs(int n, int n2, int n3) {
        if (n2 < 1) {
            n2 = 1;
        }
        if (n3 < 1) {
            n3 = 1;
        }
        int total = 0;
        nk_0[] arr = this.mH0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            byte v = arr[i].ml0;
            if (v == 1 || v == 0) {
                total += n3;
            } else {
                total += n2;
            }
        }
        nk_0[] arr2 = new nk_0[total];
        int j = 0;
        for (int i = 0; i < this.mH0.length; i++) {
            nk_0 tile = this.mH0[i];
            byte v = tile.ml0;
            int count = (v == 1 || v == 0) ? n3 : n2;
            for (int k = 0; k < count; k++) {
                arr2[j++] = tile;
            }
        }
        return arr2[n % total];
    }

    public final boolean KR(short s, short s2, short s3, short s4, int n, int n2) {
        if (n < 1) {
            n = 1;
        }
        if (n2 < 1) {
            n2 = 1;
        }
        if (s == s3 && s2 == s4) {
            return true;
        }
        nk_0[] arr = this.mH0;
        for (int i = 0; i < this.mH0.length / 2; i++) {
            switch (arr[i].ml0) {
                case 0:
                    for (int j = 0; j < n2; j++) {
                        s4 = (short) (s4 + 1);
                        if (s == s3 && s2 == s4) {
                            return true;
                        }
                    }
                    break;
                case 1:
                    for (int j = 0; j < n2; j++) {
                        s4 = (short) (s4 - 1);
                        if (s == s3 && s2 == s4) {
                            return true;
                        }
                    }
                    break;
                case 2:
                    for (int j = 0; j < n; j++) {
                        s3 = (short) (s3 - 1);
                        if (s == s3 && s2 == s4) {
                            return true;
                        }
                    }
                    break;
                case 3:
                    for (int j = 0; j < n; j++) {
                        s3 = (short) (s3 + 1);
                        if (s == s3 && s2 == s4) {
                            return true;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        return false;
    }
}
