package f;

import cn.pokemmo.util.concurrent.DefaultUncaughtExceptionHandler;

/**
 * 兼容垫片 (Shim) - 客户端主线程未捕获异常崩溃收集器 (Default Uncaught Exception Handler)
 * 实际实现已迁移至 {@link DefaultUncaughtExceptionHandler}
 */
public abstract class di_2 extends DefaultUncaughtExceptionHandler {
    public di_2() { super(); }
}
