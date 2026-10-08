package cn.pokemmo.util.logging;

import f.dl_1;

/**
 * 日志记录器提供者接口
 */
public interface LoggerFactoryProvider {
    dl_1 getLogger(String name);
}
