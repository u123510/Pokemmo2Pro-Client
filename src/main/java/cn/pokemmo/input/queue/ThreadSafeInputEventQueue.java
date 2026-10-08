package cn.pokemmo.input.queue;

import f.*;

public class ThreadSafeInputEventQueue {
    public final Nn0 kr0;
    public final Nn0 ff;
    public long yo0;

    public ThreadSafeInputEventQueue() {
        this.kr0 = new Nn0();
        this.ff = new Nn0();
    }

    public final void bl(GG0 gg0) {
        synchronized (this) {
            if (gg0 == null) {
                this.kr0.Ml = 0;
                return;
            }
            Nn0 processing = this.ff;
            int[] queueItems = this.kr0.bR;
            int queueSize = this.kr0.Ml;
            int[] procItems = processing.bR;
            int needed = processing.Ml + queueSize;
            if (needed > procItems.length) {
                procItems = processing.Wn(Math.max(Math.max(8, needed), (int) (processing.Ml * 1.75f)));
            }
            System.arraycopy(queueItems, 0, procItems, processing.Ml, queueSize);
            processing.Ml += queueSize;
            this.kr0.Ml = 0;
        }
        int[] items = this.ff.bR;
        int i = 0;
        int size = this.ff.Ml;
        while (i < size) {
            int type = items[i++];
            long timeHigh = (long) items[i++];
            long timeLow = (long) items[i++] & 0xFFFFFFFFL;
            this.yo0 = (timeHigh << 32) | timeLow;
            switch (type) {
                case -1:
                    i += items[i];
                    break;
                case 0:
                    gg0.GH0(items[i++]);
                    break;
                case 1:
                    gg0.pH0(items[i++]);
                    break;
                case 2:
                    gg0.i00((char) items[i++]);
                    break;
                case 3:
                    gg0.R8(items[i++], items[i++], items[i++], items[i++]);
                    break;
                case 4:
                    gg0.kh(items[i++], items[i++], items[i++], items[i++]);
                    break;
                case 5:
                    gg0.Ao0(items[i++], items[i++], items[i++]);
                    break;
                case 6:
                    gg0.EA0(items[i++], items[i++]);
                    break;
                case 7:
                    gg0.gl0(Float.intBitsToFloat(items[i++]), Float.intBitsToFloat(items[i++]));
                    break;
                default:
                    throw new RuntimeException();
            }
        }
        this.ff.Ml = 0;
    }

    public final synchronized void Vd(int i, long j) {
        this.kr0.ja0(1);
        this.P20(j);
        this.kr0.ja0(i);
    }

    public final synchronized void I8(char c, long j) {
        this.kr0.ja0(2);
        this.P20(j);
        this.kr0.ja0(c);
    }

    public final synchronized void RF0(int i, int i2, int i3, long j) {
        this.kr0.ja0(4);
        this.P20(j);
        this.kr0.ja0(i);
        this.kr0.ja0(i2);
        this.kr0.ja0(0);
        this.kr0.ja0(i3);
    }

    public final synchronized void UK(int i, int i2, long j) {
        int idx = this.H30(6, 0);
        while (idx >= 0) {
            this.kr0.MJ(idx, -1);
            this.kr0.MJ(idx + 3, 2);
            idx = this.H30(6, idx + 5);
        }
        this.kr0.ja0(6);
        this.P20(j);
        this.kr0.ja0(i);
        this.kr0.ja0(i2);
    }

    public final synchronized int H30(int i, int i2) {
        int[] items = this.kr0.bR;
        int size = this.kr0.Ml;
        while (i2 < size) {
            int type = items[i2];
            if (type == i) {
                return i2;
            }
            int payloadIdx = i2 + 3;
            switch (type) {
                case -1:
                    i2 = payloadIdx + items[payloadIdx];
                    break;
                case 0:
                case 1:
                case 2:
                    i2 += 4;
                    break;
                case 3:
                case 4:
                    i2 += 7;
                    break;
                case 5:
                    i2 += 6;
                    break;
                case 6:
                case 7:
                    i2 += 5;
                    break;
                default:
                    throw new RuntimeException();
            }
        }
        return -1;
    }

    public final void P20(long j) {
        this.kr0.ja0((int) (j >> 32));
        this.kr0.ja0((int) j);
    }
}
