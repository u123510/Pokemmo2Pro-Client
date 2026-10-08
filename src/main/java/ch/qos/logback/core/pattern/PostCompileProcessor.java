package ch.qos.logback.core.pattern;

public abstract interface PostCompileProcessor {
    public abstract void process(ch.qos.logback.core.Context arg0, ch.qos.logback.core.pattern.Converter arg1);
}

