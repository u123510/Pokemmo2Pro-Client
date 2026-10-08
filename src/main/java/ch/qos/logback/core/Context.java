package ch.qos.logback.core;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

import ch.qos.logback.core.spi.ConfigurationEvent;
import ch.qos.logback.core.spi.ConfigurationEventListener;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.spi.PropertyContainer;
import ch.qos.logback.core.spi.SequenceNumberGenerator;
import ch.qos.logback.core.status.StatusManager;

public interface Context extends PropertyContainer {
    StatusManager getStatusManager();
    Object getObject(String key);
    void putObject(String key, Object value);
    String getProperty(String key);
    void putProperty(String key, String value);
    Map<String, String> getCopyOfPropertyMap();
    String getName();
    void setName(String name);
    long getBirthTime();
    Object getConfigurationLock();
    ScheduledExecutorService getScheduledExecutorService();
    ExecutorService getExecutorService();
    default ExecutorService getAlternateExecutorService() { return getExecutorService(); }
    void register(LifeCycle component);
    void addScheduledFuture(java.util.concurrent.ScheduledFuture<?> future);
    SequenceNumberGenerator getSequenceNumberGenerator();
    void setSequenceNumberGenerator(SequenceNumberGenerator generator);
    void addConfigurationEventListener(ConfigurationEventListener listener);
    void fireConfigurationEvent(ConfigurationEvent event);
}
