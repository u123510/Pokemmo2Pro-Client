package ch.qos.logback.core.rolling;

public abstract interface TimeBasedFileNamingAndTriggeringPolicy extends ch.qos.logback.core.rolling.TriggeringPolicy, ch.qos.logback.core.spi.ContextAware {
    public void setTimeBasedRollingPolicy(ch.qos.logback.core.rolling.TimeBasedRollingPolicy arg0);

    public java.lang.String getElapsedPeriodsFileName();

    public java.lang.String getCurrentPeriodsFileNameWithoutCompressionSuffix();

    public ch.qos.logback.core.rolling.helper.ArchiveRemover getArchiveRemover();

    public long getCurrentTime();

    public void setCurrentTime(long arg0);

}

