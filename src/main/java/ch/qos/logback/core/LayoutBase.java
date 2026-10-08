package ch.qos.logback.core;

import ch.qos.logback.core.spi.ContextAwareBase;

public abstract class LayoutBase<E> extends ContextAwareBase implements Layout<E> {
    protected boolean started;
    String fileHeader;
    String fileFooter;
    String presentationHeader;
    String presentationFooter;

    public LayoutBase() {
        super();
    }

    public void setContext(Context context) { this.context = context; }
    public Context getContext() { return context; }
    public void start() { started = true; }
    public void stop() { started = false; }
    public boolean isStarted() { return started; }
    public String getFileHeader() { return fileHeader; }
    public String getPresentationHeader() { return presentationHeader; }
    public String getPresentationFooter() { return presentationFooter; }
    public String getFileFooter() { return fileFooter; }
    public String getContentType() { return "text/plain"; }
    public void setFileHeader(String value) { fileHeader = value; }
    public void setFileFooter(String value) { fileFooter = value; }
    public void setPresentationHeader(String value) { presentationHeader = value; }
    public void setPresentationFooter(String value) { presentationFooter = value; }
}
