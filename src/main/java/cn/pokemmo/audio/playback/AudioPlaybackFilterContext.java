package cn.pokemmo.audio.playback;

import f.*;

import java.text.ParseException;
import java.util.ArrayList;

public abstract class AudioPlaybackFilterContext {
    public static final boolean sA0;
    public boolean Wi0;

    public static Oq zX(Eq0 expression) throws ParseException {
        ArrayList<Oq> parts = new ArrayList<>();
        char operator = ' ';
        int token = 32;
        while (expression.fC()) {
            char current = expression.An0.charAt(expression.Prn);
            boolean negated = current == '!';
            if (negated) {
                expression.Prn++;
                if (!expression.fC()) {
                    throw new ParseException("Unexpected end of expression", expression.Prn);
                }
                current = expression.An0.charAt(expression.Prn);
            }
            Oq part;
            if (Character.isJavaIdentifierStart(current)) {
                int start = expression.Prn;
                while (expression.fC()
                        && Character.isJavaIdentifierPart(expression.An0.charAt(expression.Prn))) {
                    expression.Prn++;
                }
                String name = expression.An0.substring(start, expression.Prn).intern();
                part = new yc0_0(MD0.cB(name));
            } else if (current == '(') {
                expression.Prn++;
                part = zX(expression);
                if (!expression.fC() || expression.An0.charAt(expression.Prn) != ')') {
                    String got = expression.Prn < expression.An0.length()
                            ? "'" + expression.An0.charAt(expression.Prn) + "' at " + (expression.Prn + 1)
                            : "end of expression";
                    throw new ParseException("Expected ')' got " + got, expression.Prn);
                }
                expression.Prn++;
            } else if (current == ')' || "|+^".indexOf(current) < 0) {
                String got = expression.Prn < expression.An0.length()
                        ? "'" + expression.An0.charAt(expression.Prn) + "' at " + (expression.Prn + 1)
                        : "end of expression";
                throw new ParseException("Unexpected " + got, expression.Prn);
            } else {
                String got = expression.Prn < expression.An0.length()
                        ? "'" + expression.An0.charAt(expression.Prn) + "' at " + (expression.Prn + 1)
                        : "end of expression";
                throw new ParseException("Unexpected " + got, expression.Prn);
            }
            part.Wi0 = negated;
            parts.add(part);
            if (!expression.fC()) {
                break;
            }
            token = expression.An0.charAt(expression.Prn);
            if ("|+^".indexOf(token) < 0) {
                if (token != ')') {
                    String got = expression.Prn < expression.An0.length()
                            ? "'" + expression.An0.charAt(expression.Prn) + "' at " + (expression.Prn + 1)
                            : "end of expression";
                    throw new ParseException("Unexpected " + got, expression.Prn);
                }
                break;
            }
            if (parts.size() == 1) {
                operator = (char) token;
            } else if (operator != (char) token) {
                String got = expression.Prn < expression.An0.length()
                        ? "'" + expression.An0.charAt(expression.Prn) + "' at " + (expression.Prn + 1)
                        : "end of expression";
                throw new ParseException("Expected '" + operator + "' got " + got, expression.Prn);
            }
            expression.Prn++;
        }
        if (parts.isEmpty()) {
            String got = expression.Prn < expression.An0.length()
                    ? "'" + expression.An0.charAt(expression.Prn) + "' at " + (expression.Prn + 1)
                    : "end of expression";
            throw new ParseException("Unexpected " + got, expression.Prn);
        }
        if (!sA0 && operator == ' ' && parts.size() != 1) {
            throw new AssertionError();
        }
        if (parts.size() == 1) {
            return parts.get(0);
        }
        return new i7_0(operator, parts.toArray(new Oq[0]));
    }

    public AudioPlaybackFilterContext() {
    }

    static {
        sA0 = !Oq.class.desiredAssertionStatus();
    }

    public abstract boolean mk0(rb_1 input);
}
