package ch.qos.logback.core.read;

import ch.qos.logback.core.AppenderBase;
import java.util.ArrayList;
import java.util.List;

public class ListAppender extends AppenderBase {
    public List list;

    public ListAppender() {
        list = new ArrayList();
    }

    @Override
    public void append(Object event) {
        list.add(event);
    }
}
