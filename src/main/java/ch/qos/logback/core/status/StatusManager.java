package ch.qos.logback.core.status;
import java.util.List;
public interface StatusManager {
    void add(Status status);
    List<Status> getCopyOfStatusList();
    int getCount();
    boolean add(StatusListener listener);
    void remove(StatusListener listener);
    void clear();
    List<StatusListener> getCopyOfStatusListenerList();
}
