package cn.pokemmo.battle.replay;

import f.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/**
 * 对战录像二进制回放器 (Battle Replay Player)
 * 解码 PokeMMO 专用战斗录像流 (POKEMMORP)，按时间戳调度回放动作包并驱动对战引擎。
 *
 * 原混淆类: f.xr_0
 */
public class BattleReplayPlayer implements Runnable {
    public static final byte[] Mr0 = new byte[] { 80, 79, 75, 69, 77, 77, 79, 82, 80, 10 };
    public final boolean M1;
    public final ByteBuffer b90;
    public ByteBuffer nc0;
    public int Lc0;
    public boolean KA = true;
    public long LPT2 = -2147483648L;
    public final long JB = System.currentTimeMillis();
    public boolean Dc0 = false;

    public BattleReplayPlayer(byte[] byArray) {
        this.M1 = dw_2.sk;
        this.b90 = ByteBuffer.wrap(byArray).order(ByteOrder.LITTLE_ENDIAN);
        Dc();
    }

    public final synchronized void run() {
        if (this.Dc0) {
            return;
        }
        try {
            if (this.LPT2 < 0L) {
                this.LPT2 = (long) this.nc0.getInt();
            }
            boolean bl = false;
            while (true) {
                if (!this.M1 && this.LPT2 >= (long) (int) (System.currentTimeMillis() - this.JB)) {
                    if (!this.M1) {
                        lpt5__5.hL.ZD(this, (this.LPT2 - (long) (int) (System.currentTimeMillis() - this.JB)) + 1L);
                    }
                    return;
                }
                if (tw0_0.PK0 == null || tw0_0.PK0.j6 != zg0_0.ef0) {
                    bl = true;
                }
                short s = this.nc0.getShort();
                byte[] byArray = new byte[s - 6];
                this.nc0.get(byArray);
                ByteBuffer byteBuffer = ByteBuffer.wrap(byArray).order(ByteOrder.LITTLE_ENDIAN);
                GH gH = ho_1.tS(byteBuffer, tw0_0.rl.fk0, true);
                if (gH != null && gH.iQ()) {
                    lg_0.k.lPT5(gH);
                }
                if (!this.nc0.hasRemaining()) {
                    this.Dc0 = true;
                    return;
                }
                long l = (long) this.nc0.getInt();
                this.LPT2 = l;
                if (bl) {
                    lpt5__5.hL.ZD(this, (l - (long) (int) (System.currentTimeMillis() - this.JB)) + 1L);
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            tw0_0.rl.qK(sm0_0.c0(5803));
            tw0_0.rl.wF();
        }
    }

    public final void Dc() {
        try {
            byte[] byArray = Mr0;
            byte[] byArray2 = new byte[10];
            this.b90.get(byArray2);
            if (!Arrays.equals(byArray, byArray2)) {
                this.KA = false;
                return;
            }
            this.Lc0 = this.b90.getInt();
            this.b90.getLong();
            int n = this.b90.getInt();
            ByteBuffer byteBuffer = this.b90.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.nc0 = byteBuffer;
            byteBuffer.limit(byteBuffer.position() + n);
            int n2 = this.Lc0;
            if (n2 > 26) {
                this.KA = false;
            }
            if (n2 < 26) {
                this.KA = false;
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.KA = false;
        }
    }
}
