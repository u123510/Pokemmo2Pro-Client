package ch.qos.logback.classic.sift;

import ch.qos.logback.classic.ClassicConstants;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.joran.spi.DefaultClass;
import ch.qos.logback.core.sift.Discriminator;
import ch.qos.logback.core.sift.SiftingAppenderBase;
import f.HA0;
import f.nf0_1;
import java.util.List;

public class SiftingAppender extends SiftingAppenderBase<ILoggingEvent> {
    @Override
    public long getTimestamp(ILoggingEvent event) {
        return event.getTimeStamp();
    }

    @Override
    @DefaultClass(MDCBasedDiscriminator.class)
    public void setDiscriminator(Discriminator<ILoggingEvent> discriminator) {
        super.setDiscriminator(discriminator);
    }

    @Override
    public boolean eventMarksEndOfLife(ILoggingEvent event) {
        List<HA0> markers = event.getMarkerList();
        if (markers == null) return false;
        for (HA0 marker : markers) {
            if (((nf0_1) marker).gJ(ClassicConstants.FINALIZE_SESSION_MARKER)) return true;
        }
        return false;
    }
}
