package ch.qos.logback.core.testUtil;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusListener;
import java.util.ArrayList;
import java.util.List;
public class TrivialStatusListener implements StatusListener, LifeCycle {
    public List list = new ArrayList();
    boolean start;
    public void addStatusEvent(Status status) { if (isStarted()) list.add(status); }
    public void start() { start = true; }
    public void stop() { start = false; }
    public boolean isStarted() { return start; }
}
