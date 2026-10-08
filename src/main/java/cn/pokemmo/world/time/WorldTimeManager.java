package cn.pokemmo.world.time;

import f.Pv0;
import f.c8_0;
import f.in_2;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.TimeZone;

/**
 * 大世界时间、昼夜光影与四季总管理器 (World Time & Environment Manager)
 * 
 * 职责:
 * 1. 维护游戏大世界虚拟时钟与真实 UTC 时间换算（以 4 倍速流逝的虚拟时间，一天对应现实 6 小时）；
 * 2. 判定并管理当前场景的昼夜光照阶段 (早晨、白天、黄昏、夜晚、深夜 Pv0)；
 * 3. 驱动合众地区 (Gen 5 BW) 春、夏、秋、冬四季地貌模型与贴图的切换逻辑；
 * 4. 支持客户端本地时间覆写 (/timeoverride) 与四季覆写 (/seasonoverride)；
 * 5. 维护时间光影和季节变更时的重绘监听通知队列 (Lpt8)。
 * 
 * 原混淆类: f.c8_0
 */
public class WorldTimeManager implements Runnable {

    public final in_2 vt0 = new in_2(30000);
    public final in_2 jD0 = new in_2(30000);
    public int qu;
    public int HY;
    public Pv0 S7 = Pv0.cY;
    public int Er0 = 0;
    public byte Tf = (byte) -1; // 强制时间覆写 (0-24, -1 禁用)
    public byte gT = (byte) -1; // 自然计算季节 (0:春, 1:夏, 2:秋, 3:冬)
    public byte Fd0 = (byte) -1; // 强制季节覆写 (0-3, -1 禁用)
    public final ArrayList hf0 = new ArrayList();
    public final ArrayList Tz0 = new ArrayList();

    public static WorldTimeManager getInstance() {
        return c8_0.JD0;
    }

    /**
     * 广播全局环境/光影刷新通知
     */
    public final void Lpt8() {
        synchronized (this.hf0) {
            Iterator iterator = this.hf0.iterator();
            while (iterator.hasNext()) {
                ((Runnable) iterator.next()).run();
            }
        }
    }

    /**
     * 获取大世界当前虚拟秒数 (0 - 86400+)
     */
    public final int ki0() {
        byte by = this.Tf;
        if (by > 0 && by < 25) {
            return by * 3600;
        }
        return ((int) (System.currentTimeMillis() / 1000L) - this.HY - this.qu) * 4;
    }

    /**
     * 获取当前季节 ID (0: 春, 1: 夏, 2: 秋, 3: 冬)
     */
    public final byte YG() {
        byte by = this.Fd0;
        if (by > -1) {
            return by;
        }
        if (this.gT > -1) {
            in_2 in_22 = this.jD0;
            in_22.getClass();
            if (System.currentTimeMillis() < in_22.ar) {
                return this.gT;
            }
        }
        this.jD0.ty0();
        this.gT = (byte) (new GregorianCalendar(TimeZone.getTimeZone("UTC")).get(2) % 4);
        return this.gT;
    }

    /**
     * 获取大世界当前虚拟小时 (0 - 23)
     */
    public final int d60() {
        byte by = this.Tf;
        if (by > 0 && by < 25) {
            return by;
        }
        return this.ki0() % 86400 / 3600;
    }

    /**
     * 获取当前生效的光影阶段
     */
    public final Pv0 sj0() {
        return this.S7;
    }

    /**
     * 根据当前时间小时计算自然光影阶段
     */
    public final Pv0 NA() {
        int n = this.d60();
        if (n < 6) {
            return Pv0.throws$;
        }
        if (n < 11) {
            return Pv0.o6;
        }
        if (n < 18) {
            return Pv0.cY;
        }
        if (n < 21) {
            return Pv0.P70;
        }
        return Pv0.Vd;
    }

    @Override
    public final void run() {
        int n = this.d60();
        Pv0 pv0 = n < 4 ? Pv0.throws$ : n < 11 ? Pv0.o6 : n < 18 ? Pv0.cY : n < 21 ? Pv0.P70 : Pv0.Vd;
        if (this.S7 != pv0) {
            this.S7 = pv0;
            this.Lpt8();
        }
        if (this.Er0 != this.ki0() % 604800 / 86400) {
            this.Er0 = this.ki0() % 604800 / 86400;
            this.Lpt8();
            synchronized (this.Tz0) {
                Iterator iterator = this.Tz0.iterator();
                while (iterator.hasNext()) {
                    ((Runnable) iterator.next()).run();
                }
            }
        }
        this.jD0.ty0();
        this.gT = (byte) (new GregorianCalendar(TimeZone.getTimeZone("UTC")).get(2) % 4);
    }

    public final Pv0 Yj() {
        int n = this.d60();
        if (n >= 6 && n < 17) {
            return Pv0.cY;
        }
        return Pv0.Vd;
    }

    /**
     * 设置季节覆写 (-1 为跟随自然，0-3 分别为春/夏/秋/冬)
     */
    public final void jH0(byte by) {
        if (by < -1 || by > 3) {
            by = (byte) -1;
        }
        boolean changed = this.YG() != by;
        this.Fd0 = by;
        if (changed) {
            this.Lpt8();
        }
    }
}
