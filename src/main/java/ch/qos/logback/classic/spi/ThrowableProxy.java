package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.util.OptionHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

public class ThrowableProxy implements IThrowableProxy {
    static final StackTraceElementProxy[] EMPTY_STEP;
    private static final ThrowableProxy[] NO_SUPPRESSED;
    private Throwable throwable;
    private String className;
    private String message;
    StackTraceElementProxy[] stackTraceElementProxyArray;
    int commonFrames;
    private ThrowableProxy cause;
    private ThrowableProxy[] suppressed;
    private transient PackagingDataCalculator packagingDataCalculator;
    private boolean calculatedPackageData;
    private boolean cyclic;

    public ThrowableProxy(Throwable throwable) {
        this(throwable, Collections.newSetFromMap(new IdentityHashMap<Throwable, Boolean>()));
    }

    private ThrowableProxy(Throwable throwable, boolean cyclic) {
        this.throwable = throwable;
        this.className = throwable.getClass().getName();
        this.message = throwable.getMessage();
        this.stackTraceElementProxyArray = EMPTY_STEP;
        this.cyclic = true;
        this.suppressed = NO_SUPPRESSED;
        this.calculatedPackageData = false;
    }

    public ThrowableProxy(Throwable throwable, Set<Throwable> alreadyVisited) {
        this.throwable = throwable;
        this.className = throwable.getClass().getName();
        this.message = throwable.getMessage();
        this.stackTraceElementProxyArray = ThrowableProxyUtil.steArrayToStepArray(throwable.getStackTrace());
        this.cyclic = false;
        this.suppressed = NO_SUPPRESSED;
        this.calculatedPackageData = false;
        alreadyVisited.add(throwable);

        Throwable cause = throwable.getCause();
        if (cause != null) {
            if (alreadyVisited.contains(cause)) {
                this.cause = new ThrowableProxy(cause, true);
            } else {
                this.cause = new ThrowableProxy(cause, alreadyVisited);
                this.commonFrames = ThrowableProxyUtil.findNumberOfCommonFrames(cause.getStackTrace(), this.stackTraceElementProxyArray);
            }
        }

        Throwable[] suppressedThrowables = throwable.getSuppressed();
        if (OptionHelper.isNotEmtpy(suppressedThrowables)) {
            ArrayList<ThrowableProxy> suppressedList = new ArrayList<>(suppressedThrowables.length);
            for (Throwable suppressedThrowable : suppressedThrowables) {
                if (alreadyVisited.contains(suppressedThrowable)) {
                    suppressedList.add(new ThrowableProxy(suppressedThrowable, true));
                } else {
                    ThrowableProxy suppressedProxy = new ThrowableProxy(suppressedThrowable, alreadyVisited);
                    suppressedProxy.commonFrames = ThrowableProxyUtil.findNumberOfCommonFrames(suppressedThrowable.getStackTrace(), this.stackTraceElementProxyArray);
                    suppressedList.add(suppressedProxy);
                }
            }
            this.suppressed = suppressedList.toArray(new ThrowableProxy[0]);
        }
    }

    static {
        EMPTY_STEP = new StackTraceElementProxy[0];
        NO_SUPPRESSED = new ThrowableProxy[0];
    }

    public Throwable getThrowable() {
        return throwable;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public StackTraceElementProxy[] getStackTraceElementProxyArray() {
        return stackTraceElementProxyArray;
    }

    @Override
    public boolean isCyclic() {
        return cyclic;
    }

    @Override
    public int getCommonFrames() {
        return commonFrames;
    }

    @Override
    public IThrowableProxy getCause() {
        return cause;
    }

    @Override
    public IThrowableProxy[] getSuppressed() {
        return suppressed;
    }

    public PackagingDataCalculator getPackagingDataCalculator() {
        if (throwable != null && packagingDataCalculator == null) {
            packagingDataCalculator = new PackagingDataCalculator();
        }
        return packagingDataCalculator;
    }

    public void calculatePackagingData() {
        if (calculatedPackageData) {
            return;
        }
        PackagingDataCalculator calculator = getPackagingDataCalculator();
        if (calculator != null) {
            calculatedPackageData = true;
            calculator.calculate(this);
        }
    }

    public void fullDump() {
        StringBuilder builder = new StringBuilder();
        for (StackTraceElementProxy step : stackTraceElementProxyArray) {
            builder.append('\t').append(step.toString());
            ThrowableProxyUtil.subjoinPackagingData(builder, step);
            builder.append(CoreConstants.LINE_SEPARATOR);
        }
        System.out.println(builder.toString());
    }
}
