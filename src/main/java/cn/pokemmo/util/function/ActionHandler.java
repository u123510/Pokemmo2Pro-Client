package cn.pokemmo.util.function;

import f.ML0;

/**
 * 动作事件消费处理器基类
 */
public abstract class ActionHandler {
    public abstract void handle(ML0 event);

    public void QC(ML0 var1) {
        handle(var1);
    }
}
