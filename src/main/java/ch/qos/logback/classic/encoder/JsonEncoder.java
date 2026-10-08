package ch.qos.logback.classic.encoder;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.LoggerContextVO;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.encoder.EncoderBase;
import ch.qos.logback.core.encoder.JsonEscapeUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JsonEncoder extends EncoderBase {
   static final boolean DO_NOT_ADD_QUOTE_KEY = false;
   static final boolean ADD_QUOTE_KEY = true;
   static int DEFAULT_SIZE;
   static int DEFAULT_SIZE_WITH_THROWABLE = 1024 * 8;
   static byte[] EMPTY_BYTES = new byte[0];
   public static final String CONTEXT_ATTR_NAME = "context";
   public static final String NAME_ATTR_NAME = "name";
   public static final String BIRTHDATE_ATTR_NAME = "birthdate";
   public static final String CONTEXT_PROPERTIES_ATTR_NAME = "properties";
   public static final String TIMESTAMP_ATTR_NAME = "timestamp";
   public static final String NANOSECONDS_ATTR_NAME = "nanoseconds";
   public static final String SEQUENCE_NUMBER_ATTR_NAME = "sequenceNumber";
   public static final String LEVEL_ATTR_NAME = "level";
   public static final String MARKERS_ATTR_NAME = "markers";
   public static final String THREAD_NAME_ATTR_NAME = "threadName";
   public static final String MDC_ATTR_NAME = "mdc";
   public static final String LOGGER_ATTR_NAME = "loggerName";
   public static final String MESSAGE_ATTR_NAME = "message";
   public static final String FORMATTED_MESSAGE_ATTR_NAME = "formattedMessage";
   public static final String ARGUMENT_ARRAY_ATTR_NAME = "arguments";
   public static final String KEY_VALUE_PAIRS_ATTR_NAME = "kvpList";
   public static final String THROWABLE_ATTR_NAME = "throwable";
   private static final String CYCLIC_THROWABLE_ATTR_NAME = "cyclic";
   public static final String CAUSE_ATTR_NAME = "cause";
   public static final String SUPPRESSED_ATTR_NAME = "suppressed";
   public static final String COMMON_FRAMES_COUNT_ATTR_NAME = "commonFramesCount";
   public static final String CLASS_NAME_ATTR_NAME = "className";
   public static final String METHOD_NAME_ATTR_NAME = "methodName";
   private static final String FILE_NAME_ATTR_NAME = "fileName";
   private static final String LINE_NUMBER_ATTR_NAME = "lineNumber";
   public static final String STEP_ARRAY_NAME_ATTRIBUTE = "stepArray";
   private static final char OPEN_OBJ = '{';
   private static final char CLOSE_OBJ = '}';
   private static final char OPEN_ARRAY = '[';
   private static final char CLOSE_ARRAY = ']';
   private static final char QUOTE = '"';
   private static final char SP = ' ';
   private static final char ENTRY_SEPARATOR = ':';
   private static final String COL_SP = ": ";
   private static final String QUOTE_COL = "\":";
   private static final char VALUE_SEPARATOR = ',';
   private boolean withSequenceNumber = true;
   private boolean withTimestamp = true;
   private boolean withNanoseconds = true;
   private boolean withLevel = true;
   private boolean withThreadName = true;
   private boolean withLoggerName = true;
   private boolean withContext = true;
   private boolean withMarkers = true;
   private boolean withMDC = true;
   private boolean withKVPList = true;
   private boolean withMessage = true;
   private boolean withArguments = true;
   private boolean withThrowable = true;
   private boolean withFormattedMessage = false;

   public byte[] encode(Object var1) {
      return this.encode((ILoggingEvent)var1);
   }

   private void appendLoggerContext(StringBuilder var1, LoggerContextVO var2) {
      var1.append('"').append("context").append("\":");
      if (var2 == null) {
         var1.append("null");
      } else {
         var1.append('{');
         this.appenderMember(var1, "name", this.nullSafeStr(var2.getName()));
         var1.append(',');
         long var3 = var2.getBirthTime();
         this.appenderMemberWithLongValue(var1, "birthdate", var3);
         var1.append(',');
         this.appendMap(var1, "properties", var2.getPropertyMap());
         var1.append('}');
      }
   }

   private void appendMap(StringBuilder var1, String var2, Map var3) {
      var1.append('"').append(var2).append("\":");
      if (var3 == null) {
         var1.append("null");
      } else {
         var1.append('{');
         boolean var5 = false;
         Iterator var7 = var3.entrySet().iterator();

         while(var7.hasNext()) {
            boolean var10000 = var5;
            Map.Entry var6 = (Map.Entry)var7.next();
            if (var10000) {
               var1.append(',');
            }

            var5 = true;
            String var4 = this.jsonEscapedToString(var6.getKey());
            this.appenderMember(var1, var4, this.jsonEscapedToString(var6.getValue()));
         }

         var1.append('}');
      }
   }

   private void appendThrowableProxy(StringBuilder var1, String var2, IThrowableProxy var3) {
      if (var2 != null) {
         var1.append('"').append(var2).append("\":");
         if (var3 == null) {
            var1.append("null");
            return;
         }
      }

      var1.append('{');
      var2 = this.nullSafeStr(var3.getClassName());
      this.appenderMember(var1, "className", var2);
      var1.append(',');
      var2 = this.jsonEscape(var3.getMessage());
      this.appenderMember(var1, "message", var2);
      if (var3.isCyclic()) {
         var1.append(',');
         var2 = this.jsonEscape("true");
         this.appenderMember(var1, "cyclic", var2);
      }

      var1.append(',');
      StackTraceElementProxy[] var10 = var3.getStackTraceElementProxyArray();
      int var4 = var3.getCommonFrames();
      this.appendSTEPArray(var1, var10, var4);
      if (var3.getCommonFrames() != 0) {
         var1.append(',');
         int var11 = var3.getCommonFrames();
         this.appenderMemberWithIntValue(var1, "commonFramesCount", var11);
      }

      IThrowableProxy var12 = var3.getCause();
      if (var12 != null) {
         var1.append(',');
         this.appendThrowableProxy(var1, "cause", var12);
      }

      IThrowableProxy[] var13 = var3.getSuppressed();
      if (var13 != null && var13.length != 0) {
         var1.append(',');
         var1.append('"').append("suppressed").append("\":");
         var1.append('[');
         boolean var14 = true;

         for(IThrowableProxy var6 : var13) {
            if (var14) {
               var14 = false;
            } else {
               var1.append(',');
            }

            this.appendThrowableProxy(var1, (String)null, var6);
         }

         var1.append(']');
      }

      var1.append('}');
   }

   private void appendSTEPArray(StringBuilder var1, StackTraceElementProxy[] var2, int var3) {
      var1.append('"').append("stepArray").append("\":").append('[');
      int var4;
      if (var2 != null) {
         var4 = var2.length;
      } else {
         var4 = 0;
      }

      if (var3 >= var4) {
         var3 = 0;
      }

      for(int var5 = 0; var5 < var4 - var3; ++var5) {
         if (var5 != 0) {
            var1.append(',');
         }

         StackTraceElementProxy var10003 = var2[var5];
         var1.append('{');
         StackTraceElement var6 = var10003.getStackTraceElement();
         this.appenderMember(var1, "className", this.nullSafeStr(var6.getClassName()));
         var1.append(',');
         this.appenderMember(var1, "methodName", this.nullSafeStr(var6.getMethodName()));
         var1.append(',');
         this.appenderMember(var1, "fileName", this.nullSafeStr(var6.getFileName()));
         var1.append(',');
         this.appenderMemberWithIntValue(var1, "lineNumber", var6.getLineNumber());
         var1.append('}');
      }

      var1.append(']');
   }

   private void appenderMember(StringBuilder var1, String var2, String var3) {
      var1.append('"').append(var2).append("\":").append('"').append(var3).append('"');
   }

   private void appenderMemberWithIntValue(StringBuilder var1, String var2, int var3) {
      var1.append('"').append(var2).append("\":").append(var3);
   }

   private void appenderMemberWithLongValue(StringBuilder var1, String var2, long var3) {
      var1.append('"').append(var2).append("\":").append(var3);
   }

   private void appendKeyValuePairs(StringBuilder var1, ILoggingEvent var2) {
      List var3;
      if ((var3 = var2.getKeyValuePairs()) != null && !var3.isEmpty()) {
         var1.append('"').append("kvpList").append("\":").append(' ').append('[');
         int var4 = var3.size();
         int var5 = 0;
         if (var4 <= 0) {
            var1.append(']');
            var1.append(',');
         } else {
            for(var5 = 0; var5 < var4; ++var5) {
               if (var5 != 0) {
                  var1.append(',');
               }

               Object var6 = var3.get(var5);
               var1.append('{');
               this.appenderMember(var1, this.jsonEscapedToString(var6), this.jsonEscapedToString(var6));
               var1.append('}');
            }

            var1.append(']');
            var1.append(',');
         }
      }
   }

   private void appendArgumentArray(StringBuilder var1, ILoggingEvent var2) {
      Object[] var5;
      if ((var5 = var2.getArgumentArray()) != null) {
         var1.append('"').append("arguments").append("\":").append(' ').append('[');
         int var3 = var5.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            if (var4 != 0) {
               var1.append(',');
            }

            var1.append('"').append(this.jsonEscapedToString(var5[var4])).append('"');
         }

         var1.append(']');
         var1.append(',');
      }
   }

   private void appendMarkers(StringBuilder var1, ILoggingEvent var2) {
      List var5;
      if ((var5 = var2.getMarkerList()) != null) {
         var1.append('"').append("markers").append("\":").append(' ').append('[');
         int var3 = var5.size();

         for(int var4 = 0; var4 < var3; ++var4) {
            if (var4 != 0) {
               var1.append(',');
            }

            var1.append('"').append(this.jsonEscapedToString(var5.get(var4))).append('"');
         }

         var1.append(']');
         var1.append(',');
      }
   }

   private String jsonEscapedToString(Object var1) {
      return var1 == null ? "null" : JsonEscapeUtil.jsonEscapeString(var1.toString());
   }

   private String nullSafeStr(String var1) {
      return var1 == null ? "null" : var1;
   }

   private String jsonEscape(String var1) {
      return var1 == null ? "null" : JsonEscapeUtil.jsonEscapeString(var1);
   }

   private void appendMDC(StringBuilder var1, ILoggingEvent var2) {
      Map var5 = var2.getMDCPropertyMap();
      var1.append('"').append("mdc").append("\":").append(' ').append('{');
      if (this.isNotEmptyMap(var5)) {
         Iterator var6 = var5.entrySet().iterator();
         int var7 = 0;

         while(var6.hasNext()) {
            if (var7 != 0) {
               var1.append(',');
            }

            Map.Entry var4 = (Map.Entry)var6.next();
            String var8 = this.jsonEscapedToString(var4.getKey());
            this.appenderMember(var1, var8, this.jsonEscapedToString(var4.getValue()));
            ++var7;
         }
      }

      var1.append('}');
      var1.append(',');
   }

   public byte[] headerBytes() {
      return EMPTY_BYTES;
   }

   public byte[] encode(ILoggingEvent var1) {
      int var2;
      if (var1.getThrowableProxy() == null) {
         var2 = DEFAULT_SIZE;
      } else {
         var2 = DEFAULT_SIZE_WITH_THROWABLE;
      }

      StringBuilder var3;
      var3 = new StringBuilder(var2);
      var3.append('{');
      if (this.withSequenceNumber) {
         long var4 = var1.getSequenceNumber();
         this.appenderMemberWithLongValue(var3, "sequenceNumber", var4);
         var3.append(',');
      }

      if (this.withTimestamp) {
         long var13 = var1.getTimeStamp();
         this.appenderMemberWithLongValue(var3, "timestamp", var13);
         var3.append(',');
      }

      if (this.withNanoseconds) {
         long var14 = (long)var1.getNanoseconds();
         this.appenderMemberWithLongValue(var3, "nanoseconds", var14);
         var3.append(',');
      }

      if (this.withLevel) {
         String var7;
         if (var1.getLevel() != null) {
            var7 = var1.getLevel().levelStr;
         } else {
            var7 = "null";
         }

         this.appenderMember(var3, "level", var7);
         var3.append(',');
      }

      if (this.withThreadName) {
         String var8 = this.jsonEscape(var1.getThreadName());
         this.appenderMember(var3, "threadName", var8);
         var3.append(',');
      }

      if (this.withLoggerName) {
         String var9 = var1.getLoggerName();
         this.appenderMember(var3, "loggerName", var9);
         var3.append(',');
      }

      if (this.withContext) {
         LoggerContextVO var10 = var1.getLoggerContextVO();
         this.appendLoggerContext(var3, var10);
         var3.append(',');
      }

      if (this.withMarkers) {
         this.appendMarkers(var3, var1);
      }

      if (this.withMDC) {
         this.appendMDC(var3, var1);
      }

      if (this.withKVPList) {
         this.appendKeyValuePairs(var3, var1);
      }

      if (this.withMessage) {
         String var11 = this.jsonEscape(var1.getMessage());
         this.appenderMember(var3, "message", var11);
         var3.append(',');
      }

      if (this.withFormattedMessage) {
         String var12 = this.jsonEscape(var1.getFormattedMessage());
         this.appenderMember(var3, "formattedMessage", var12);
         var3.append(',');
      }

      if (this.withArguments) {
         this.appendArgumentArray(var3, var1);
      }

      if (this.withThrowable) {
         IThrowableProxy var6 = var1.getThrowableProxy();
         this.appendThrowableProxy(var3, "throwable", var6);
      }

      var3.append('}');
      var3.append('\n');
      return var3.toString().getBytes(CoreConstants.UTF_8_CHARSET);
   }

   public boolean isNotEmptyMap(Map var1) {
      return var1 == null ? false : var1.isEmpty() ^ true;
   }

   public byte[] footerBytes() {
      return EMPTY_BYTES;
   }

   public void setWithSequenceNumber(boolean var1) {
      this.withSequenceNumber = var1;
   }

   public void setWithTimestamp(boolean var1) {
      this.withTimestamp = var1;
   }

   public void setWithNanoseconds(boolean var1) {
      this.withNanoseconds = var1;
   }

   public void setWithLevel(boolean var1) {
      this.withLevel = var1;
   }

   public void setWithThreadName(boolean var1) {
      this.withThreadName = var1;
   }

   public void setWithLoggerName(boolean var1) {
      this.withLoggerName = var1;
   }

   public void setWithContext(boolean var1) {
      this.withContext = var1;
   }

   public void setWithMarkers(boolean var1) {
      this.withMarkers = var1;
   }

   public void setWithMDC(boolean var1) {
      this.withMDC = var1;
   }

   public void setWithKVPList(boolean var1) {
      this.withKVPList = var1;
   }

   public void setWithMessage(boolean var1) {
      this.withMessage = var1;
   }

   public void setWithArguments(boolean var1) {
      this.withArguments = var1;
   }

   public void setWithThrowable(boolean var1) {
      this.withThrowable = var1;
   }

   public void setWithFormattedMessage(boolean var1) {
      this.withFormattedMessage = var1;
   }
}
