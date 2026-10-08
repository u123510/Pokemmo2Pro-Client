/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.util.text;

import f.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from f.hX
 */
public abstract class WordWrapTextFormatter {
    public static final Matcher lp0 = Pattern.compile("\\p{L}").matcher("");
    public static final Matcher lE = Pattern.compile("(\\p{Zl}|\\s)").matcher("");

    public static String LPt2(int n, String string) {
        return WordWrapTextFormatter.oO(string, n, null, true, 0);
    }

    public static String w70(String string, int n) {
        return WordWrapTextFormatter.oO(string, n, null, false, 0);
    }

    public static String oO(String string, int n, String string2, boolean bl, int n2) {
        double d = 0.7;
        if (n >= 1 && string != null) {
            if (string2 == null) {
                string2 = "\n";
            }
            if (bl) {
                string = string.replaceAll(string2, " ");
            }
            if (string.length() < n) {
                return string;
            }
            StringBuilder stringBuilder3 = new StringBuilder(string.length() + 8);
            StringBuilder stringBuilder4 = new StringBuilder(string.length());
            int n3 = (int)((double)n * d);
            String[] stringArray = string.split(string2);
            int n4 = 0;
            block0: for (int j = 0; j < stringArray.length; ++j) {
                String string3 = stringArray[j];
                if (WordWrapTextFormatter.yk(string3)) {
                    if (n2 >= 1 && n4 >= n2) {
                        string3 = " ";
                    } else {
                        ++n4;
                        string3 = string2;
                    }
                } else {
                    string3 = string3.trim();
                }
                StringBuilder stringBuilder5 = stringBuilder4;
                stringBuilder5.setLength(0);
                stringBuilder5.append(string3);
                while (stringBuilder4.length() > 0) {
                    int n5;
                    int n6;
                    if (stringBuilder4.length() < n) {
                        string3 = stringBuilder4.toString();
                        boolean bl2 = WordWrapTextFormatter.yk(string3);
                        if (!bl2) {
                            string3 = string3.trim();
                        }
                        stringBuilder3.append(string3);
                        if (j == stringArray.length - 1 || bl2) continue block0;
                        if (n2 >= 1 && n4 >= n2) {
                            stringBuilder3.append(" ");
                            continue block0;
                        }
                        stringBuilder3.append(string2);
                        ++n4;
                        continue block0;
                    }
                    string3 = stringBuilder4.toString();
                    if (WordWrapTextFormatter.yk(string3)) {
                        n6 = string3.length();
                    } else {
                        int n7 = -1;
                        n5 = 0;
                        while (true) {
                            if (n5 >= string3.length() || n5 > n) {
                                n6 = n7;
                                break;
                            }
                            if (lE.reset(Character.toString(string3.charAt(n5))).matches()) {
                                n7 = n5;
                            }
                            ++n5;
                        }
                    }
                    if (n6 < 1 || n6 < n3) {
                        if (stringBuilder4.length() > n3) {
                            String string4 = stringBuilder4.substring(0, Math.min(n, stringBuilder4.length()));
                            for (n5 = string4.length() - 1; n5 >= 0; --n5) {
                                Matcher matcher = lp0;
                                matcher.reset(Character.toString(string4.charAt(n5)));
                                if (!matcher.matches()) continue;
                                n6 = n5;
                                break;
                            }
                        } else {
                            n6 = n;
                        }
                    }
                    int n8 = 1;
                    n5 = stringBuilder4.length();
                    if (n6 < n8) {
                        n6 = n8;
                    } else if (n6 > n5) {
                        n6 = n5;
                    }
                    StringBuilder stringBuilder6 = stringBuilder4;
                    String string5 = stringBuilder6.substring(0, n6).trim();
                    stringBuilder6.delete(0, n6);
                    if (string5.isEmpty()) continue;
                    stringBuilder3.append(string5);
                    if (n2 >= 1 && n4 >= n2) {
                        stringBuilder3.append(" ");
                        continue;
                    }
                    stringBuilder3.append(string2);
                    ++n4;
                }
            }
            return stringBuilder3.toString();
        }
        throw new IllegalArgumentException();
    }

    public static boolean yk(String string) {
        if (string.isEmpty()) {
            return true;
        }
        for (int j = 0; j < string.length(); ++j) {
            int n = string.codePointAt(j);
            if (n == 32 || n == 9 || Character.isWhitespace(n)) continue;
            return false;
        }
        return true;
    }
}

