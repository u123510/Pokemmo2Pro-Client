/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.rolling;

import ch.qos.logback.core.util.FileSize;

public class SizeAndTimeBasedRollingPolicy
extends TimeBasedRollingPolicy {
    FileSize maxFileSize;

    @Override
    public void start() {
        SizeAndTimeBasedFNATP sizeAndTimeBasedFNATP = new SizeAndTimeBasedFNATP(SizeAndTimeBasedFNATP.Usage.EMBEDDED);
        FileSize fileSize = this.maxFileSize;
        if (fileSize == null) {
            this.addError("maxFileSize property is mandatory.");
            return;
        }
        this.addInfo("Archive files will be limited to [" + String.valueOf(fileSize) + "] each.");
        sizeAndTimeBasedFNATP.setMaxFileSize(this.maxFileSize);
        this.timeBasedFileNamingAndTriggeringPolicy = sizeAndTimeBasedFNATP;
        if (!this.isUnboundedTotalSizeCap() && this.totalSizeCap.getSize() < this.maxFileSize.getSize()) {
            this.addError("totalSizeCap of [" + String.valueOf(this.totalSizeCap) + "] is smaller than maxFileSize [" + String.valueOf(this.maxFileSize) + "] which is non-sensical");
            return;
        }
        super.start();
    }

    public void setMaxFileSize(FileSize fileSize) {
        this.maxFileSize = fileSize;
    }

    @Override
    public String toString() {
        return "c.q.l.core.rolling.SizeAndTimeBasedRollingPolicy@" + this.hashCode();
    }
}