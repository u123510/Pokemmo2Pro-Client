package f;

import cn.pokemmo.util.logging.LoggerFactoryProvider;
import f.dl_1;

/**
 * 日志工厂提供者门面
 * @see cn.pokemmo.util.logging.LoggerFactoryProvider
 */
public interface KV extends LoggerFactoryProvider {
    @Override
    dl_1 getLogger(String var1);
}
