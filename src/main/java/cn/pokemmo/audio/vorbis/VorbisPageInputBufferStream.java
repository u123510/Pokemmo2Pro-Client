/*
 * Reconstructed from bytecode (javap -c -p). CFR 0.152 failed: "Back jump on a try block".
 */
package cn.pokemmo.audio.vorbis;

import f.*;

public class VorbisPageInputBufferStream {
    public byte[] Du;
    public int Ox0;
    public int COm2;
    public int Z00;
    public int kf;
    public int R5;
    public int CE;
    public final L20 Bs0 = new L20();
    public final byte[] uz0 = new byte[4];

    public final int Qy() {
        int n;
        int n2 = 512;
        int n3 = this.Z00;
        if (n3 != 0) {
            this.COm2 = n = this.COm2 - n3;
            if (n > 0) {
                System.arraycopy(this.Du, n3, this.Du, 0, n);
            }
            this.Z00 = 0;
        }
        if (n2 > this.Ox0 - (n2 = this.COm2)) {
            n2 += 4608;
            byte[] byArray = this.Du;
            if (this.Du != null) {
                byArray = new byte[n2];
                n = this.Du.length;
                System.arraycopy(this.Du, 0, byArray, 0, n);
                this.Du = byArray;
            }
            else {
                this.Du = new byte[n2];
            }
            this.Ox0 = n2;
        }
        return this.COm2;
    }

    public final int jb(L20 l20) {
        while (true) {
            int n2 = this.Z00;
            int n3 = this.COm2 - n2;
            if (this.R5 == 0) {
                if (n3 < 27) {
                    return 0;
                }
                byte[] b = this.Du;
                if (b[n2] == 79 && b[n2 + 1] == 103 && b[n2 + 2] == 103 && b[n2 + 3] == 83) {
                    int n4 = n2 + 26;
                    int n5 = (b[n4] & 255) + 27;
                    if (n3 < n5) {
                        return 0;
                    }
                    for (int n6 = 0; n6 < (b[n4] & 255); n6++) {
                        this.CE += b[n2 + 27 + n6] & 255;
                    }
                    this.R5 = n5;
                }
                else {
                    this.R5 = 0;
                    this.CE = 0;
                    int n4 = 0;
                    for (int n5 = 0; n5 < n3 - 1; n5++) {
                        int n6 = n2 + 1 + n5;
                        if (this.Du[n6] == 79) {
                            n4 = n6;
                            break;
                        }
                    }
                    if (n4 == 0) {
                        n4 = this.COm2;
                    }
                    this.Z00 = n4;
                    n2 = -(n4 - n2);
                    if (n2 < 0) {
                        if (this.kf != 0) continue;
                        this.kf = 1;
                        return -1;
                    }
                    return n2 > 0 ? 1 : 0;
                }
            }
            if (this.CE + this.R5 > n3) {
                return 0;
            }
            synchronized (this.uz0) {
                byte[] b = this.Du;
                int n5 = n2 + 22;
                System.arraycopy(b, n5, this.uz0, 0, 4);
                b[n5] = 0;
                int n7 = n2 + 23;
                b[n7] = 0;
                int n8 = n2 + 24;
                b[n8] = 0;
                int n9 = n2 + 25;
                b[n9] = 0;
                L20 l20_ = this.Bs0;
                l20_.Lz0 = b;
                l20_.kf0 = n2;
                l20_.yu0 = this.R5;
                l20_.JD = b;
                l20_.GL0 = n2 + this.R5;
                l20_.iB0 = this.CE;
                l20_.Sk();
                byte[] uz = this.uz0;
                byte[] d = this.Du;
                if (uz[0] == d[n5] && uz[1] == d[n7] && uz[2] == d[n8] && uz[3] == d[n9]) {
                    n2 = this.Z00;
                    if (l20 != null) {
                        l20.Lz0 = d;
                        l20.kf0 = n2;
                        l20.yu0 = this.R5;
                        l20.JD = d;
                        l20.GL0 = n2 + this.R5;
                        l20.iB0 = this.CE;
                    }
                    this.kf = 0;
                    int r = this.R5 + this.CE;
                    this.Z00 = n2 + r;
                    this.R5 = 0;
                    this.CE = 0;
                    return 1;
                }
                System.arraycopy(uz, 0, d, n5, 4);
                this.R5 = 0;
                this.CE = 0;
                int n4 = 0;
                for (int n11 = 0; n11 < n3 - 1; n11++) {
                    int n12 = n2 + 1 + n11;
                    if (d[n12] == 79) {
                        n4 = n12;
                        break;
                    }
                }
                if (n4 == 0) {
                    n4 = this.COm2;
                }
                this.Z00 = n4;
                n2 = -(n4 - n2);
            }
            if (n2 < 0) {
                if (this.kf != 0) continue;
                this.kf = 1;
                return -1;
            }
            return n2 > 0 ? 1 : 0;
        }
    }
}
