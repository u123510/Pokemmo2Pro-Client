package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import ch.qos.logback.core.pattern.util.RestrictedEscapeUtil;
import ch.qos.logback.core.spi.ScanException;
import java.util.ArrayList;
import java.util.List;

class TokenStream {
   enum TokenizerState {
      LITERAL_STATE, FORMAT_MODIFIER_STATE, KEYWORD_STATE, OPTION_STATE, RIGHT_PARENTHESIS_STATE;
   }

   final String pattern;
   final int patternLength;
   final IEscapeUtil escapeUtil;
   final IEscapeUtil optionEscapeUtil;
   TokenizerState state;
   int pointer;

   public TokenStream(String var1) {
      this(var1, new RegularEscapeUtil());
   }

   public TokenStream(String var1, IEscapeUtil var2) {
      this.optionEscapeUtil = new RestrictedEscapeUtil();
      this.state = TokenizerState.LITERAL_STATE;
      this.pointer = 0;
      if (var1 != null && var1.length() != 0) {
         this.pattern = var1;
         this.patternLength = var1.length();
         this.escapeUtil = var2;
      } else {
         throw new IllegalArgumentException("null or empty pattern string not allowed");
      }
   }

   private void handleRightParenthesisState(char var1, List var2, StringBuffer var3) {
      var2.add(Token.RIGHT_PARENTHESIS_TOKEN);
      if (var1 != ')') {
         if (var1 != '\\') {
            if (var1 != '{') {
               var3.append(var1);
               this.state = TokenizerState.LITERAL_STATE;
            } else {
               this.state = TokenizerState.OPTION_STATE;
            }
         } else {
            this.escape("%{}", var3);
            this.state = TokenizerState.LITERAL_STATE;
         }
      }

   }

   private void processOption(char var1, List var2, StringBuffer var3) throws ScanException {
      (new OptionTokenizer(this)).tokenize(var1, var2);
   }

   private void handleFormatModifierState(char var1, List var2, StringBuffer var3) {
      if (var1 == '(') {
         this.addValuedToken(1002, var3, var2);
         var2.add(Token.BARE_COMPOSITE_KEYWORD_TOKEN);
         this.state = TokenizerState.LITERAL_STATE;
      } else if (Character.isJavaIdentifierStart(var1)) {
         this.addValuedToken(1002, var3, var2);
         this.state = TokenizerState.KEYWORD_STATE;
         var3.append(var1);
      } else {
         var3.append(var1);
      }

   }

   private void handleLiteralState(char var1, List var2, StringBuffer var3) {
      if (var1 != '%') {
         if (var1 != ')') {
            if (var1 != '\\') {
               var3.append(var1);
            } else {
               this.escape("%()", var3);
            }
         } else {
            this.addValuedToken(1000, var3, var2);
            this.state = TokenizerState.RIGHT_PARENTHESIS_STATE;
         }
      } else {
         this.addValuedToken(1000, var3, var2);
         var2.add(Token.PERCENT_TOKEN);
         this.state = TokenizerState.FORMAT_MODIFIER_STATE;
      }

   }

   private void handleKeywordState(char var1, List var2, StringBuffer var3) {
      if (Character.isJavaIdentifierPart(var1)) {
         var3.append(var1);
      } else if (var1 == 123) {
         this.addValuedToken(1004, var3, var2);
         this.state = TokenizerState.OPTION_STATE;
      } else if (var1 == 40) {
         this.addValuedToken(1005, var3, var2);
         this.state = TokenizerState.LITERAL_STATE;
      } else if (var1 == 37) {
         this.addValuedToken(1004, var3, var2);
         var2.add(Token.PERCENT_TOKEN);
         this.state = TokenizerState.FORMAT_MODIFIER_STATE;
      } else if (var1 == 41) {
         this.addValuedToken(1004, var3, var2);
         this.state = TokenizerState.RIGHT_PARENTHESIS_STATE;
      } else {
         this.addValuedToken(1004, var3, var2);
         if (var1 == 92) {
            if (this.pointer < this.patternLength) {
               char var5 = this.pattern.charAt(this.pointer);
               this.pointer++;
               this.escapeUtil.escape("%()", var3, var5, this.pointer);
            }
         } else {
            var3.append(var1);
         }

         this.state = TokenizerState.LITERAL_STATE;
      }

   }

   private void addValuedToken(int var1, StringBuffer var2, List var3) {
      if (var2.length() > 0) {
         Token var4 = new Token(var1, var2.toString());
         var3.add(var4);
         var2.setLength(0);
      }

   }

   public List tokenize() throws ScanException {
      ArrayList var1 = new ArrayList();
      StringBuffer var2 = new StringBuffer();

      while(this.pointer < this.patternLength) {
         char var3 = this.pattern.charAt(this.pointer);
         this.pointer++;
         switch (this.state.ordinal()) {
            case 0:
               this.handleLiteralState(var3, var1, var2);
               break;
            case 1:
               this.handleFormatModifierState(var3, var1, var2);
               break;
            case 2:
               this.handleKeywordState(var3, var1, var2);
               break;
            case 3:
               this.processOption(var3, var1, var2);
               break;
            case 4:
               this.handleRightParenthesisState(var3, var1, var2);
         }
      }

      switch (this.state.ordinal()) {
         case 0:
            this.addValuedToken(1000, var2, var1);
            break;
         case 1:
         case 3:
            throw new ScanException("Unexpected end of pattern string");
         case 2:
            Token var4 = new Token(1004, var2.toString());
            var1.add(var4);
            break;
         case 4:
            var1.add(Token.RIGHT_PARENTHESIS_TOKEN);
      }

      return var1;
   }

   public void escape(String var1, StringBuffer var2) {
      if (this.pointer < this.patternLength) {
         char var3 = this.pattern.charAt(this.pointer);
         this.pointer++;
         this.escapeUtil.escape(var1, var2, var3, this.pointer);
      }

   }

   public void optionEscape(String var1, StringBuffer var2) {
      if (this.pointer < this.patternLength) {
         char var3 = this.pattern.charAt(this.pointer);
         this.pointer++;
         this.optionEscapeUtil.escape(var1, var2, var3, this.pointer);
      }

   }
}
