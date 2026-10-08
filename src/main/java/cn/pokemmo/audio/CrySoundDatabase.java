package cn.pokemmo.audio;

import f.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 宝可梦叫声与缓存音效数据库 (Cry Sound Database)
 * 管理内存中活跃的叫声音轨，定时清理播放完成或过期的音频资源。
 *
 * 原混淆类: f.CB0
 */
public class CrySoundDatabase {
    public static final dl_1 xS = Cq0.E1(CrySoundDatabase.class);
    public static final int c40 = 15000;
    public long pz = hk0_1.lQ();
    public final List BE0 = Collections.synchronizedList(new ArrayList());

    public void jl() {
        long var1 = hk0_1.KG;
        if (hk0_1.KG >= this.pz + c40) {
            this.pz = var1;
            synchronized (this.BE0) {
                Iterator var3 = this.BE0.iterator();

                while (var3.hasNext()) {
                    if (((je0_1)var3.next()).i80()) {
                        var3.remove();
                    }
                }
            }
        }
    }
}
