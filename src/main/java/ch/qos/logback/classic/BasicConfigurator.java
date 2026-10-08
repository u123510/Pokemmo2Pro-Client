package ch.qos.logback.classic;

import ch.qos.logback.classic.layout.TTLLLayout;
import ch.qos.logback.classic.spi.Configurator;
import ch.qos.logback.classic.spi.ConfiguratorRank;
import ch.qos.logback.classic.spi.Configurator.ExecutionStatus;
import ch.qos.logback.core.ConsoleAppender;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.OutputStreamAppender;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import ch.qos.logback.core.encoder.LayoutWrappingEncoder;
import ch.qos.logback.core.spi.ContextAwareBase;

@ConfiguratorRank(-10)
public class BasicConfigurator extends ContextAwareBase implements Configurator {
   public Configurator.ExecutionStatus configure(LoggerContext var1) {
      LoggerContext var10000 = var1;
      ((ContextAwareBase)this).addInfo("Setting up default configuration.");
      ConsoleAppender var2;
      ConsoleAppender var10001 = var2 = new ConsoleAppender();
      ((ContextAwareBase)var10001).setContext(super.context);
      ((UnsynchronizedAppenderBase)var10001).setName("console");
      LayoutWrappingEncoder var10003 = new LayoutWrappingEncoder();
      ((ContextAwareBase)var10003).setContext(super.context);
      TTLLLayout var10005 = new TTLLLayout();
      ((LayoutBase)var10005).setContext(super.context);
      var10005.start();
      var10003.setLayout(var10005);
      ((OutputStreamAppender)var10001).setEncoder(var10003);
      var10001.start();
      var10000.getLogger("ROOT").addAppender(var2);
      return ExecutionStatus.NEUTRAL;
   }
}
