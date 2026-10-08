/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.pattern;

import ch.qos.logback.core.Layout;
import ch.qos.logback.core.encoder.LayoutWrappingEncoder;

public class PatternLayoutEncoderBase
extends LayoutWrappingEncoder {
    String pattern;
    protected boolean outputPatternAsHeader = false;

    public String getPattern() {
        return this.pattern;
    }

    public void setPattern(String string) {
        this.pattern = string;
    }

    public boolean isOutputPatternAsHeader() {
        return this.outputPatternAsHeader;
    }

    public void setOutputPatternAsHeader(boolean bl) {
        this.outputPatternAsHeader = bl;
    }

    public boolean isOutputPatternAsPresentationHeader() {
        return this.outputPatternAsHeader;
    }

    public void setOutputPatternAsPresentationHeader(boolean bl) {
        this.addWarn("[outputPatternAsPresentationHeader] property is deprecated. Please use [outputPatternAsHeader] option instead.");
        this.outputPatternAsHeader = bl;
    }

    @Override
    public void setLayout(Layout layout) {
        throw new UnsupportedOperationException("one cannot set the layout of " + this.getClass().getName());
    }
}

