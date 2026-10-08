package f;

import cn.pokemmo.util.function.ActionHandler;
import f.ML0;

/**
 * 动作处理器门面
 * @see cn.pokemmo.util.function.ActionHandler
 */
public abstract class TC0 extends ActionHandler {
    @Override
    public void handle(ML0 event) {
        QC(event);
    }

    @Override
    public abstract void QC(ML0 var1);
}
