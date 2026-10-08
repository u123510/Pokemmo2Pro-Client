package cn.pokemmo.rom.nds.model;

import f.ZK0;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Nitro 3D 模型高并发内存缓存
 */
public class NitroModelConcurrentCache implements ZK0 {
    public final ConcurrentHashMap yc0;

    public NitroModelConcurrentCache() {
        this.yc0 = new ConcurrentHashMap();
    }
}
