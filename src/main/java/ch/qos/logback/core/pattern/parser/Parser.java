package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.FormatInfo;
import ch.qos.logback.core.pattern.IdentityCompositeConverter;
import ch.qos.logback.core.pattern.ReplacingCompositeConverter;
import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.ScanException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parser extends ContextAwareBase {
   public static final String MISSING_RIGHT_PARENTHESIS = "http://logback.qos.ch/codes.html#missingRightParenthesis";
   public static final Map DEFAULT_COMPOSITE_CONVERTER_MAP;
   public static final String REPLACE_CONVERTER_WORD = "replace";
   final List tokenList;
   int pointer;

   public Parser(TokenStream var1) throws ScanException {
      this.pointer = 0;
      this.tokenList = var1.tokenize();
   }

   public Parser(String var1) throws ScanException {
      this(var1, new RegularEscapeUtil());
   }

   public Parser(String var1, IEscapeUtil var2) throws ScanException {
      super();
      this.pointer = 0;

      try {
         this.tokenList = (new TokenStream(var1, var2)).tokenize();
      } catch (IllegalArgumentException var3) {
         throw new ScanException("Failed to initialize Parser", var3);
      }
   }

   static {
      Map var0 = new HashMap();
      var0.put(Token.BARE_COMPOSITE_KEYWORD_TOKEN.getValue(), IdentityCompositeConverter.class.getName());
      var0.put("replace", ReplacingCompositeConverter.class.getName());
      DEFAULT_COMPOSITE_CONVERTER_MAP = var0;
   }

   public Converter compile(Node var1, Map var2) {
      Compiler var10000 = new Compiler(var1, var2);
      var10000.setContext(super.context);
      return var10000.compile();
   }

   public Node parse() throws ScanException {
      return this.E();
   }

   public Node E() throws ScanException {
      Node var1;
      if ((var1 = this.T()) == null) {
         return null;
      } else {
         Node var2;
         if ((var2 = this.Eopt()) != null) {
            var1.setNext(var2);
         }

         return var1;
      }
   }

   public Node Eopt() throws ScanException {
      return this.getCurentToken() == null ? null : this.E();
   }

   public Node T() throws ScanException {
      Token var1 = this.getCurentToken();
      this.expectNotNull(var1, "a LITERAL or '%'");
      int var2 = var1.getType();
      if (var2 != 37) {
         if (var2 != 1000) {
            return null;
         } else {
            this.advanceTokenPointer();
            return new Node(0, var1.getValue());
         }
      } else {
         this.advanceTokenPointer();
         var1 = this.getCurentToken();
         this.expectNotNull(var1, "a FORMAT_MODIFIER, SIMPLE_KEYWORD or COMPOUND_KEYWORD");
         FormattingNode var5;
         if (var1.getType() == 1002) {
            FormatInfo var3 = FormatInfo.valueOf(var1.getValue());
            this.advanceTokenPointer();
            var5 = this.C();
            var5.setFormatInfo(var3);
         } else {
            var5 = this.C();
         }

         return var5;
      }
   }

   public FormattingNode C() throws ScanException {
      Token var1 = this.getCurentToken();
      this.expectNotNull(var1, "a LEFT_PARENTHESIS or KEYWORD");
      int var2 = var1.getType();
      if (var2 != 1004) {
         if (var2 == 1005) {
            this.advanceTokenPointer();
            return this.COMPOSITE(var1.getValue().toString());
         } else {
            throw new IllegalStateException("Unexpected token " + String.valueOf(var1));
         }
      } else {
         return this.SINGLE();
      }
   }

   public FormattingNode SINGLE() {
      Token var1 = this.getNextToken();
      SimpleKeywordNode var2 = new SimpleKeywordNode(var1.getValue());
      if ((var1 = this.getCurentToken()) != null && var1.getType() == 1006) {
         var2.setOptions(var1.getOptionsList());
         this.advanceTokenPointer();
      }

      return var2;
   }

   public FormattingNode COMPOSITE(String var1) throws ScanException {
      CompositeNode var2 = new CompositeNode(var1);
      var2.setChildNode(this.E());
      Token var4;
      if ((var4 = this.getNextToken()) != null && var4.getType() == 41) {
         if ((var4 = this.getCurentToken()) != null && var4.getType() == 1006) {
            var2.setOptions(var4.getOptionsList());
            this.advanceTokenPointer();
         }

         return var2;
      } else {
         String var3 = "Expecting RIGHT_PARENTHESIS token but got " + String.valueOf(var4);
         this.addError(var3);
         this.addError("See also " + MISSING_RIGHT_PARENTHESIS);
         throw new ScanException(var3);
      }
   }

   public Token getNextToken() {
      if (this.pointer < this.tokenList.size()) {
         return (Token)this.tokenList.get(this.pointer++);
      } else {
         return null;
      }
   }

   public Token getCurentToken() {
      return this.pointer < this.tokenList.size() ? (Token)this.tokenList.get(this.pointer) : null;
   }

   public void advanceTokenPointer() {
      ++this.pointer;
   }

   public void expectNotNull(Token var1, String var2) {
      if (var1 == null) {
         throw new IllegalStateException("All tokens consumed but was expecting " + var2);
      }
   }
}
