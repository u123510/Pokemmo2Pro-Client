package cn.pokemmo.util.logging;

import f.KV;
import f.Sm0;
import f.ZK0;

public interface LoggingServiceProvider {
    KV getLoggerFactory();

    ZK0 getMarkerFactory();

    Sm0 getMDCAdapter();

    String getRequestedApiVersion();

    void initialize();
}
