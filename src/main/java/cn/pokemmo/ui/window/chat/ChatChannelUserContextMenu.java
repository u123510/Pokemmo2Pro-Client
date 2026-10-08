package cn.pokemmo.ui.window.chat;

import f.*;
import java.util.ArrayList;
import java.util.Queue;

public class ChatChannelUserContextMenu extends IS {
    private static final long serialVersionUID = -176083308134819629L;
    public final String lu0;
    public final eb_0 og;
    public final Queue eQ;

    public ChatChannelUserContextMenu(eb_0 logger, Queue queue) {
        super();
        this.og = logger;
        this.lu0 = logger.getName();
        this.eQ = queue;
    }

    public final String getName() {
        return this.lu0;
    }

    public final boolean isTraceEnabled() {
        return true;
    }

    public final boolean isDebugEnabled() {
        return true;
    }

    public final boolean isInfoEnabled() {
        return true;
    }

    public final boolean isWarnEnabled() {
        return true;
    }

    public final boolean isErrorEnabled() {
        return true;
    }

    public final void kA0(bj_2 level, HA0 marker, String message, Object[] arguments, Throwable throwable) {
        t4_0 event = new t4_0();
        event.fw0 = level;
        event.IC0 = this.og;
        if (this.og != null) {
            if (event.wj0 == null) {
                event.wj0 = new ArrayList(2);
            }
            event.wj0.add(marker);
        }
        event.XG = message;
        Thread.currentThread().getName();
        event.J5 = arguments;
        event.tM = throwable;
        this.eQ.add(event);
    }
}
