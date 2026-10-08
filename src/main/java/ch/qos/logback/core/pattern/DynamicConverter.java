/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.pattern;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.pattern.FormattingConverter;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.status.Status;
import java.util.List;

public abstract class DynamicConverter<E>
extends FormattingConverter<E>
implements LifeCycle,
ContextAware {
    ContextAwareBase cab;
    private List optionList;
    protected boolean started;

    public DynamicConverter() {
        this.cab = new ContextAwareBase(this);
        this.started = false;
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
    public boolean isStarted() {
        return this.started;
    }

    public void setOptionList(List list) {
        this.optionList = list;
    }

    public String getFirstOption() {
        List list = this.optionList;
        if (list != null && list.size() != 0) {
            return (String)this.optionList.get(0);
        }
        return null;
    }

    public List getOptionList() {
        return this.optionList;
    }

    @Override
    public void setContext(Context context) {
        this.cab.setContext(context);
    }

    @Override
    public Context getContext() {
        return this.cab.getContext();
    }

    @Override
    public void addStatus(Status status) {
        this.cab.addStatus(status);
    }

    @Override
    public void addInfo(String string) {
        this.cab.addInfo(string);
    }

    @Override
    public void addInfo(String string, Throwable throwable) {
        this.cab.addInfo(string, throwable);
    }

    @Override
    public void addWarn(String string) {
        this.cab.addWarn(string);
    }

    @Override
    public void addWarn(String string, Throwable throwable) {
        this.cab.addWarn(string, throwable);
    }

    @Override
    public void addError(String string) {
        this.cab.addError(string);
    }

    @Override
    public void addError(String string, Throwable throwable) {
        this.cab.addError(string, throwable);
    }
}
