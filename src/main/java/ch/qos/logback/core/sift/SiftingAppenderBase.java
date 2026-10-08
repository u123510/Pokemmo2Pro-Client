package ch.qos.logback.core.sift;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.model.SiftModel;
import ch.qos.logback.core.util.Duration;
import java.util.Iterator;

public abstract class SiftingAppenderBase<E>
extends AppenderBase<E> {
    protected AppenderTracker appenderTracker;
    AppenderFactory appenderFactory;
    Duration timeout;
    int maxAppenderCount;
    SiftModel siftModel;
    Discriminator<E> discriminator;

    public SiftingAppenderBase() {
        this.timeout = new Duration(1800000L);
        this.maxAppenderCount = Integer.MAX_VALUE;
    }

    public Duration getTimeout() {
        return this.timeout;
    }

    public void setTimeout(Duration timeout) {
        this.timeout = timeout;
    }

    public SiftModel getSiftModel() {
        return this.siftModel;
    }

    public void setSiftModel(SiftModel siftModel) {
        this.siftModel = siftModel;
    }

    public int getMaxAppenderCount() {
        return this.maxAppenderCount;
    }

    public void setMaxAppenderCount(int maxAppenderCount) {
        this.maxAppenderCount = maxAppenderCount;
    }

    public void setAppenderFactory(AppenderFactory appenderFactory) {
        this.appenderFactory = appenderFactory;
    }

    @Override
    public void start() {
        int errorCount = 0;
        if (this.discriminator == null) {
            errorCount++;
            this.addError("Missing discriminator. Aborting");
        }
        if (this.discriminator != null && !this.discriminator.isStarted()) {
            errorCount++;
            this.addError("Discriminator has not started successfully. Aborting");
        }
        if (this.appenderFactory == null) {
            errorCount++;
            this.addError("AppenderFactory has not been set. Aborting");
        } else {
            AppenderTracker appenderTracker = new AppenderTracker(this.context, this.appenderFactory);
            appenderTracker.setMaxComponents(this.maxAppenderCount);
            appenderTracker.setTimeout(this.timeout.getMilliseconds());
            this.appenderTracker = appenderTracker;
        }
        if (errorCount == 0) {
            super.start();
        }
    }

    @Override
    public void stop() {
        if (this.isStarted()) {
            Iterator<Appender> iterator = this.appenderTracker.allComponents().iterator();
            while (iterator.hasNext()) {
                iterator.next().stop();
            }
        }
    }

    public abstract long getTimestamp(E event);

    @Override
    public void append(E event) {
        if (this.isStarted()) {
            String discriminatingValue = this.discriminator.getDiscriminatingValue(event);
            long timestamp = this.getTimestamp(event);
            Appender appender = (Appender) this.appenderTracker.getOrCreate(discriminatingValue, timestamp);
            if (this.eventMarksEndOfLife(event)) {
                this.appenderTracker.endOfLife(discriminatingValue);
            }
            this.appenderTracker.removeStaleComponents(timestamp);
            appender.doAppend(event);
        }
    }

    public abstract boolean eventMarksEndOfLife(E event);

    public Discriminator<E> getDiscriminator() {
        return this.discriminator;
    }

    public void setDiscriminator(Discriminator<E> discriminator) {
        this.discriminator = discriminator;
    }

    public AppenderTracker getAppenderTracker() {
        return this.appenderTracker;
    }

    public String getDiscriminatorKey() {
        Discriminator<E> discriminator = this.discriminator;
        return discriminator != null ? discriminator.getKey() : null;
    }
}
