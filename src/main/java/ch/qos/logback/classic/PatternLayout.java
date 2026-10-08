package ch.qos.logback.classic;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.classic.pattern.ClassOfCallerConverter;
import ch.qos.logback.classic.pattern.ContextNameConverter;
import ch.qos.logback.classic.pattern.DateConverter;
import ch.qos.logback.classic.pattern.EnsureExceptionHandling;
import ch.qos.logback.classic.pattern.ExtendedThrowableProxyConverter;
import ch.qos.logback.classic.pattern.FileOfCallerConverter;
import ch.qos.logback.classic.pattern.KeyValuePairConverter;
import ch.qos.logback.classic.pattern.LevelConverter;
import ch.qos.logback.classic.pattern.LineOfCallerConverter;
import ch.qos.logback.classic.pattern.LineSeparatorConverter;
import ch.qos.logback.classic.pattern.LocalSequenceNumberConverter;
import ch.qos.logback.classic.pattern.LoggerConverter;
import ch.qos.logback.classic.pattern.MDCConverter;
import ch.qos.logback.classic.pattern.MarkerConverter;
import ch.qos.logback.classic.pattern.MessageConverter;
import ch.qos.logback.classic.pattern.MethodOfCallerConverter;
import ch.qos.logback.classic.pattern.MicrosecondConverter;
import ch.qos.logback.classic.pattern.NopThrowableInformationConverter;
import ch.qos.logback.classic.pattern.PrefixCompositeConverter;
import ch.qos.logback.classic.pattern.PropertyConverter;
import ch.qos.logback.classic.pattern.RelativeTimeConverter;
import ch.qos.logback.classic.pattern.RootCauseFirstThrowableProxyConverter;
import ch.qos.logback.classic.pattern.SequenceNumberConverter;
import ch.qos.logback.classic.pattern.ThreadConverter;
import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import ch.qos.logback.classic.pattern.color.HighlightingCompositeConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.pattern.PatternLayoutBase;
import ch.qos.logback.core.pattern.color.BlackCompositeConverter;
import ch.qos.logback.core.pattern.color.BlueCompositeConverter;
import ch.qos.logback.core.pattern.color.BoldBlueCompositeConverter;
import ch.qos.logback.core.pattern.color.BoldCyanCompositeConverter;
import ch.qos.logback.core.pattern.color.BoldGreenCompositeConverter;
import ch.qos.logback.core.pattern.color.BoldMagentaCompositeConverter;
import ch.qos.logback.core.pattern.color.BoldRedCompositeConverter;
import ch.qos.logback.core.pattern.color.BoldWhiteCompositeConverter;
import ch.qos.logback.core.pattern.color.BoldYellowCompositeConverter;
import ch.qos.logback.core.pattern.color.CyanCompositeConverter;
import ch.qos.logback.core.pattern.color.GrayCompositeConverter;
import ch.qos.logback.core.pattern.color.GreenCompositeConverter;
import ch.qos.logback.core.pattern.color.MagentaCompositeConverter;
import ch.qos.logback.core.pattern.color.RedCompositeConverter;
import ch.qos.logback.core.pattern.color.WhiteCompositeConverter;
import ch.qos.logback.core.pattern.color.YellowCompositeConverter;
import ch.qos.logback.core.pattern.parser.Parser;
import f.T6;
import java.util.HashMap;
import java.util.Map;

public class PatternLayout extends PatternLayoutBase<ILoggingEvent> {
   public static final Map DEFAULT_CONVERTER_MAP;
   public static final Map CONVERTER_CLASS_TO_KEY_MAP;
   /** @deprecated */
   public static final Map defaultConverterMap;
   public static final String HEADER_PREFIX = "#logback.classic pattern: ";

   public PatternLayout() {

      super();
      EnsureExceptionHandling var1;
      var1 = new EnsureExceptionHandling();
      this.postCompileProcessor = var1;
   }

   static {
      HashMap var0;
      var0 = new HashMap();
      DEFAULT_CONVERTER_MAP = var0;
      Map var10000 = CONVERTER_CLASS_TO_KEY_MAP = new HashMap();
      defaultConverterMap = var0;
      var0.putAll(Parser.DEFAULT_COMPOSITE_CONVERTER_MAP);
      String var1 = DateConverter.class.getName();
      var0.put("d", var1);
      var1 = DateConverter.class.getName();
      var0.put("date", var1);
      CONVERTER_CLASS_TO_KEY_MAP.put(DateConverter.class.getName(), "date");
      var1 = MicrosecondConverter.class.getName();
      var0.put("ms", var1);
      var1 = MicrosecondConverter.class.getName();
      var0.put("micros", var1);
      CONVERTER_CLASS_TO_KEY_MAP.put(MicrosecondConverter.class.getName(), "micros");
      var1 = RelativeTimeConverter.class.getName();
      var0.put("r", var1);
      var1 = RelativeTimeConverter.class.getName();
      var0.put("relative", var1);
      CONVERTER_CLASS_TO_KEY_MAP.put(RelativeTimeConverter.class.getName(), "relative");
      var1 = LevelConverter.class.getName();
      var0.put("level", var1);
      var1 = LevelConverter.class.getName();
      var0.put("le", var1);
      var1 = LevelConverter.class.getName();
      var0.put("p", var1);
      CONVERTER_CLASS_TO_KEY_MAP.put(LevelConverter.class.getName(), "level");
      T6.m(ThreadConverter.class, var0, "t", ThreadConverter.class, "thread");
      CONVERTER_CLASS_TO_KEY_MAP.put(ThreadConverter.class.getName(), "thread");
      var1 = LoggerConverter.class.getName();
      var0.put("lo", var1);
      var1 = LoggerConverter.class.getName();
      var0.put("logger", var1);
      var1 = LoggerConverter.class.getName();
      var0.put("c", var1);
      CONVERTER_CLASS_TO_KEY_MAP.put(LoggerConverter.class.getName(), "logger");
      T6.m(MessageConverter.class, var0, "m", MessageConverter.class, "msg");
      var1 = MessageConverter.class.getName();
      var0.put("message", var1);
      CONVERTER_CLASS_TO_KEY_MAP.put(MessageConverter.class.getName(), "message");
      T6.m(ClassOfCallerConverter.class, var0, "C", ClassOfCallerConverter.class, "class");
      CONVERTER_CLASS_TO_KEY_MAP.put(ClassOfCallerConverter.class.getName(), "class");
      var1 = MethodOfCallerConverter.class.getName();
      var0.put("M", var1);
      var1 = MethodOfCallerConverter.class.getName();
      var0.put("method", var1);
      CONVERTER_CLASS_TO_KEY_MAP.put(MethodOfCallerConverter.class.getName(), "method");
      var1 = LineOfCallerConverter.class.getName();
      var0.put("L", var1);
      var1 = LineOfCallerConverter.class.getName();
      var0.put("line", var1);
      CONVERTER_CLASS_TO_KEY_MAP.put(LineOfCallerConverter.class.getName(), "line");
      var1 = FileOfCallerConverter.class.getName();
      var0.put("F", var1);
      var1 = FileOfCallerConverter.class.getName();
      var0.put("file", var1);
      CONVERTER_CLASS_TO_KEY_MAP.put(FileOfCallerConverter.class.getName(), "file");
      var1 = MDCConverter.class.getName();
      var0.put("X", var1);
      var1 = MDCConverter.class.getName();
      var0.put("mdc", var1);
      T6.m(ThrowableProxyConverter.class, var0, "ex", ThrowableProxyConverter.class, "exception");
      T6.m(RootCauseFirstThrowableProxyConverter.class, var0, "rEx", RootCauseFirstThrowableProxyConverter.class, "rootException");
      T6.m(ThrowableProxyConverter.class, var0, "throwable", ExtendedThrowableProxyConverter.class, "xEx");
      T6.m(ExtendedThrowableProxyConverter.class, var0, "xException", ExtendedThrowableProxyConverter.class, "xThrowable");
      T6.m(NopThrowableInformationConverter.class, var0, "nopex", NopThrowableInformationConverter.class, "nopexception");
      T6.m(ContextNameConverter.class, var0, "cn", ContextNameConverter.class, "contextName");
      CONVERTER_CLASS_TO_KEY_MAP.put(ContextNameConverter.class.getName(), "contextName");
      var1 = CallerDataConverter.class.getName();
      var0.put("caller", var1);
      CONVERTER_CLASS_TO_KEY_MAP.put(CallerDataConverter.class.getName(), "caller");
      var1 = MarkerConverter.class.getName();
      var0.put("marker", var1);
      CONVERTER_CLASS_TO_KEY_MAP.put(MarkerConverter.class.getName(), "marker");
      var1 = KeyValuePairConverter.class.getName();
      var0.put("kvp", var1);
      CONVERTER_CLASS_TO_KEY_MAP.put(KeyValuePairConverter.class.getName(), "kvp");
      var1 = PropertyConverter.class.getName();
      var0.put("property", var1);
      var1 = LineSeparatorConverter.class.getName();
      var0.put("n", var1);
      T6.m(BlackCompositeConverter.class, var0, "black", RedCompositeConverter.class, "red");
      T6.m(GreenCompositeConverter.class, var0, "green", YellowCompositeConverter.class, "yellow");
      T6.m(BlueCompositeConverter.class, var0, "blue", MagentaCompositeConverter.class, "magenta");
      T6.m(CyanCompositeConverter.class, var0, "cyan", WhiteCompositeConverter.class, "white");
      T6.m(GrayCompositeConverter.class, var0, "gray", BoldRedCompositeConverter.class, "boldRed");
      T6.m(BoldGreenCompositeConverter.class, var0, "boldGreen", BoldYellowCompositeConverter.class, "boldYellow");
      T6.m(BoldBlueCompositeConverter.class, var0, "boldBlue", BoldMagentaCompositeConverter.class, "boldMagenta");
      T6.m(BoldCyanCompositeConverter.class, var0, "boldCyan", BoldWhiteCompositeConverter.class, "boldWhite");
      T6.m(HighlightingCompositeConverter.class, var0, "highlight", LocalSequenceNumberConverter.class, "lsn");
      CONVERTER_CLASS_TO_KEY_MAP.put(LocalSequenceNumberConverter.class.getName(), "lsn");
      var1 = SequenceNumberConverter.class.getName();
      var0.put("sn", var1);
      var1 = SequenceNumberConverter.class.getName();
      var0.put("sequenceNumber", var1);
      CONVERTER_CLASS_TO_KEY_MAP.put(SequenceNumberConverter.class.getName(), "sequenceNumber");
      var1 = PrefixCompositeConverter.class.getName();
      var0.put("prefix", var1);
   }

   public Map getDefaultConverterMap() {
      return DEFAULT_CONVERTER_MAP;
   }

   public String doLayout(ILoggingEvent var1) {
      return !((LayoutBase)this).isStarted() ? "" : ((PatternLayoutBase)this).writeLoopOnConverters(var1);
   }

   public String getPresentationHeaderPrefix() {
      return "#logback.classic pattern: ";
   }
}
