package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.CompositeConverter;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.DynamicConverter;
import ch.qos.logback.core.pattern.FormattingConverter;
import ch.qos.logback.core.pattern.LiteralConverter;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Map;

class Compiler extends ContextAwareBase {
   Converter head;
   Converter tail;
   final Node top;
   final Map converterMap;

   public Compiler(Node var1, Map var2) {
      this.top = var1;
      this.converterMap = var2;
   }

   private void addToList(Converter var1) {
      if (this.head == null) {
         this.tail = var1;
         this.head = var1;
      } else {
         this.tail.setNext(var1);
         this.tail = var1;
      }

   }

   public Converter compile() {
      this.tail = null;
      this.head = null;

      for(Node var1 = this.top; var1 != null; var1 = var1.next) {
         int var2;
         if ((var2 = var1.type) != 0) {
            if (var2 != 1) {
               if (var2 == 2) {
                  CompositeConverter var3;
                  CompositeNode var4;
                  if ((var3 = this.createCompositeConverter(var4 = (CompositeNode)var1)) == null) {
                     this.addError("Failed to create converter for [%" + String.valueOf(((Node)var4).getValue()) + "] keyword");
                     this.addToList(new LiteralConverter("%PARSER_ERROR[" + String.valueOf(((Node)var4).getValue()) + "]"));
                  } else {
                     var3.setFormattingInfo(((FormattingNode)var4).getFormatInfo());
                     var3.setOptionList(((SimpleKeywordNode)var4).getOptions());
                     Node var5 = var4.getChildNode();
                     Compiler var10003 = new Compiler(var5, this.converterMap);
                     var10003.setContext(super.context);
                     var3.setChildConverter(var10003.compile());
                     this.addToList(var3);
                  }
               }
            } else {
               SimpleKeywordNode var6;
               DynamicConverter var7;
               if ((var7 = this.createConverter(var6 = (SimpleKeywordNode)var1)) != null) {
                  var7.setFormattingInfo(((FormattingNode)var6).getFormatInfo());
                  var7.setOptionList(var6.getOptions());
                  this.addToList(var7);
               } else {
                  LiteralConverter var8 = new LiteralConverter("%PARSER_ERROR[" + String.valueOf(((Node)var6).getValue()) + "]");
                  this.addStatus(new ErrorStatus("[" + String.valueOf(((Node)var6).getValue()) + "] is not a valid conversion word", this));
                  this.addToList(var8);
               }
            }
         } else {
            this.addToList(new LiteralConverter((String)var1.getValue()));
         }
      }

      return this.head;
   }

   public DynamicConverter createConverter(SimpleKeywordNode var1) {
      String var6 = (String)((Node)var1).getValue();
      String var2 = (String)this.converterMap.get(var6);
      if (var2 != null) {
         try {
            return (DynamicConverter)OptionHelper.instantiateByClassName(var2, DynamicConverter.class, this.context);
         } catch (Exception var7) {
            this.addError("Failed to instantiate converter class [" + var2 + "] for keyword [" + var6 + "]", var7);
            return null;
         }
      } else {
         this.addError("There is no conversion class registered for conversion word [" + var6 + "]");
         return null;
      }
   }

   public CompositeConverter createCompositeConverter(CompositeNode var1) {
      String var6 = (String)((Node)var1).getValue();
      String var2 = (String)this.converterMap.get(var6);
      if (var2 != null) {
         try {
            return (CompositeConverter)OptionHelper.instantiateByClassName(var2, CompositeConverter.class, this.context);
         } catch (Exception var7) {
            this.addError("Failed to instantiate converter class [" + var2 + "] as a composite converter for keyword [" + var6 + "]", var7);
            return null;
         }
      } else {
         this.addError("There is no conversion class registered for composite conversion word [" + var6 + "]");
         return null;
      }
   }
}
