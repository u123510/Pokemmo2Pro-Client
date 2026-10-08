package ch.qos.logback.core.testUtil;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.Layout;
import java.util.ArrayList;
import java.util.List;

public class StringListAppender extends AppenderBase {
    Layout layout;
    public List strList;

    public StringListAppender() {
        strList = new ArrayList();
    }

    @Override
    public void start() {
        strList.clear();
        if (layout == null || !layout.isStarted()) return;
        super.start();
    }

    @Override
    public void stop() { super.stop(); }

    @Override
    public void append(Object event) {
        strList.add(layout.doLayout(event));
    }

    public Layout getLayout() { return layout; }
    public void setLayout(Layout layout) { this.layout = layout; }
}
