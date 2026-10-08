/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.rolling;

import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.rolling.RollingPolicy;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.spi.ContextAwareBase;

public abstract class RollingPolicyBase
extends ContextAwareBase
implements RollingPolicy {
    protected CompressionMode compressionMode = CompressionMode.NONE;
    FileNamePattern fileNamePattern;
    protected String fileNamePatternStr;
    private FileAppender parent;
    FileNamePattern zipEntryFileNamePattern;
    private boolean started;

    public void determineCompressionMode() {
        if (this.fileNamePatternStr.endsWith(".gz")) {
            this.addInfo("Will use gz compression");
            this.compressionMode = CompressionMode.GZ;
        } else if (this.fileNamePatternStr.endsWith(".zip")) {
            this.addInfo("Will use zip compression");
            this.compressionMode = CompressionMode.ZIP;
        } else {
            this.addInfo("No compression will be used");
            this.compressionMode = CompressionMode.NONE;
        }
    }

    public void setFileNamePattern(String string) {
        this.fileNamePatternStr = string;
    }

    public String getFileNamePattern() {
        return this.fileNamePatternStr;
    }

    @Override
    public CompressionMode getCompressionMode() {
        return this.compressionMode;
    }

    @Override
    public boolean isStarted() {
        return this.started;
    }

    @Override
    public void start() {
        this.started = true;
    }

    @Override
    public void stop() {
        this.started = false;
    }

    @Override
    public void setParent(FileAppender fileAppender) {
        this.parent = fileAppender;
    }

    public boolean isParentPrudent() {
        return this.parent.isPrudent();
    }

    public String getParentsRawFileProperty() {
        return this.parent.rawFileProperty();
    }
}

