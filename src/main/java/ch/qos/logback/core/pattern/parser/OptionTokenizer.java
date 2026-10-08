package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.util.AsIsEscapeUtil;
import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.spi.ScanException;
import java.util.ArrayList;
import java.util.List;

public class OptionTokenizer {
   private static final int EXPECTING_STATE = 0;
   private static final int RAW_COLLECTING_STATE = 1;
   private static final int QUOTED_COLLECTING_STATE = 2;
   final IEscapeUtil escapeUtil;
   final TokenStream tokenStream;
   final String pattern;
   final int patternLength;
   char quoteChar;
   int state;

   public OptionTokenizer(TokenStream tokenStream) {
      this(tokenStream, new AsIsEscapeUtil());
   }

   public OptionTokenizer(TokenStream tokenStream, IEscapeUtil escapeUtil) {
      this.state = 0;
      this.tokenStream = tokenStream;
      this.pattern = tokenStream.pattern;
      this.patternLength = tokenStream.patternLength;
      this.escapeUtil = escapeUtil;
   }

   public void tokenize(char firstChar, List tokenList) throws ScanException {
      StringBuffer buf = new StringBuffer();
      List<String> optionList = new ArrayList<String>();
      char c = firstChar;
      while (this.tokenStream.pointer < this.patternLength) {
         switch (this.state) {
            case EXPECTING_STATE:
               switch (c) {
                  case '\t':
                  case '\n':
                  case '\r':
                  case ' ':
                     break;
                  case '"':
                  case '\'':
                     this.state = QUOTED_COLLECTING_STATE;
                     this.quoteChar = c;
                     break;
                  case ',':
                     break;
                  case '}':
                     this.emitOptionToken(tokenList, optionList);
                     return;
                  default:
                     buf.append(c);
                     this.state = RAW_COLLECTING_STATE;
               }
               break;
            case RAW_COLLECTING_STATE:
               switch (c) {
                  case ',':
                     optionList.add(buf.toString().trim());
                     buf.setLength(0);
                     this.state = EXPECTING_STATE;
                     break;
                  case '}':
                     optionList.add(buf.toString().trim());
                     this.emitOptionToken(tokenList, optionList);
                     return;
                  default:
                     buf.append(c);
               }
               break;
            case QUOTED_COLLECTING_STATE:
               if (c == this.quoteChar) {
                  optionList.add(buf.toString());
                  buf.setLength(0);
                  this.state = EXPECTING_STATE;
               } else if (c == '\\') {
                  this.escape(String.valueOf(this.quoteChar), buf);
               } else {
                  buf.append(c);
               }
               break;
         }
         c = this.pattern.charAt(this.tokenStream.pointer);
         this.tokenStream.pointer++;
      }
      if (c != '}') {
         throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
      }
      switch (this.state) {
         case EXPECTING_STATE:
            this.emitOptionToken(tokenList, optionList);
            return;
         case RAW_COLLECTING_STATE:
            optionList.add(buf.toString().trim());
            this.emitOptionToken(tokenList, optionList);
            break;
         default:
            throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
      }
   }

   public void emitOptionToken(List tokenList, List optionList) {
      tokenList.add(new Token(1006, optionList));
      this.tokenStream.state = TokenStream.TokenizerState.LITERAL_STATE;
   }

   public void escape(String escapeChars, StringBuffer buf) {
      TokenStream ts = this.tokenStream;
      int p = ts.pointer;
      if (p < this.patternLength) {
         ts.pointer = p + 1;
         char c = this.pattern.charAt(p);
         int next = this.tokenStream.pointer;
         this.escapeUtil.escape(escapeChars, buf, c, next);
      }
   }
}
