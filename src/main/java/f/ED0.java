package f;

import cn.pokemmo.net.nio.NioReadWriteWorker;

/**
 * NIO 读写工作线程兼容垫片
 * 核心业务已重构迁移至 cn.pokemmo.net.nio.NioReadWriteWorker
 */
public final class ED0 extends NioReadWriteWorker {

    public ED0(String name, wz_1 configuration) {
        super(name, configuration);
    }
}
