package f;

import cn.pokemmo.util.logging.Slf4jEventLoggerAdapter;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 兼容垫片 (Shim) - SLF4J 异步事件日志适配器 (SLF4J Event Logger Adapter)
 * 实际实现已迁移至 {@link Slf4jEventLoggerAdapter}
 */
public final class eb_0 extends Slf4jEventLoggerAdapter {
    public eb_0(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        super(str, linkedBlockingQueue, z);
    }
}
