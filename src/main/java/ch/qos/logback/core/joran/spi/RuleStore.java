package ch.qos.logback.core.joran.spi;

import java.util.function.Supplier;

public interface RuleStore {
    void addRule(ElementSelector selector, String actionClassName);
    void addRule(ElementSelector selector, Supplier<?> supplier);
    Supplier<?> matchActions(ElementPath elementPath);
    void addTransparentPathPart(String part);
    void addPathPathMapping(String path, String mappedPath);
}
