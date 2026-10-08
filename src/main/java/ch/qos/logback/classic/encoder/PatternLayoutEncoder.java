package ch.qos.logback.classic.encoder;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.pattern.PatternLayoutBase;
import ch.qos.logback.core.pattern.PatternLayoutEncoderBase;

public class PatternLayoutEncoder extends PatternLayoutEncoderBase {
   public void start() {
      PatternLayout var1;
      PatternLayout var10002 = var1 = new PatternLayout();
      ((LayoutBase)var1).setContext(super.context);
      ((PatternLayoutBase)var1).setPattern(((PatternLayoutEncoderBase)this).getPattern());
      ((PatternLayoutBase)var10002).setOutputPatternAsHeader(super.outputPatternAsHeader);
      ((PatternLayoutBase)var10002).start();
      super.layout = var10002;
      super.start();
   }
}
