package cn.pokemmo.rom.nds.event;

import f.KO;
import f.bH0;
import f.kk0_0;
import f.nul__1;

/**
 * NDS 地图区域事件抽象基类
 * 统一管理地图区域中的 NPC、传送点、脚本交互触发点、静态模型物件
 */
public abstract class AbstractNdsMapZoneEvents {
    public KO[] pJ0;
    public kk0_0[] K1;
    public bH0[] Ct0;
    public nul__1[] wn0;

    public AbstractNdsMapZoneEvents() {
        this.pJ0 = new KO[0];
        this.K1 = new kk0_0[0];
        this.Ct0 = new bH0[0];
        this.wn0 = new nul__1[0];
    }

    public final bH0 LC(boolean strict, short x, short y, byte kind, float depth) {
        for (bH0 entry : this.Ct0) {
            if (strict) {
                if (!entry.Zv
                        || x < entry.JI0
                        || x >= entry.JI0 + entry.uB0
                        || y < entry.G90
                        || y >= entry.G90 + entry.SO
                        || kind != entry.YI0) {
                    continue;
                }
                return entry;
            }

            if (entry.Zv
                    || x < entry.r30()
                    || x >= entry.r30() + entry.uB0
                    || y < entry.Ij()
                    || y >= entry.Ij() + entry.SO
                    || Math.abs(depth - entry.uc()) >= 2.0f) {
                continue;
            }
            return entry;
        }
        return null;
    }

    public final bH0 Ub0(short x, short y) {
        for (bH0 entry : this.Ct0) {
            if (x == entry.r30() && y == entry.Ij()) {
                return entry;
            }
        }
        return null;
    }

    public final bH0 Sq0(short index) {
        return index >= 0 && index < this.Ct0.length ? this.Ct0[index] : null;
    }

    public KO[] getNpcs() {
        return this.pJ0;
    }

    public kk0_0[] getWarps() {
        return this.K1;
    }

    public bH0[] getScriptTriggers() {
        return this.Ct0;
    }

    public nul__1[] getProps() {
        return this.wn0;
    }
}
