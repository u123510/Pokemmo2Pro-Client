package cn.pokemmo.io.bundle;

import f.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.MissingResourceException;

public class I18NBundle {
    public static final Locale RB;
    public Locale pJ0;

    static {
        RB = new Locale("", "", "");
    }

    public I18NBundle() {
    }

    public static I18NBundle COm1(Dn0 dn0, String string, Locale locale) {
        if (dn0 == null || locale == null) {
            throw null;
        }
        I18NBundle vj_12 = null;
        Locale locale2 = locale;
        while (true) {
            String string2 = locale2.getLanguage();
            String string3 = locale2.getCountry();
            String string4 = locale2.getVariant();
            ArrayList<Locale> arrayList = new ArrayList<>(4);
            if (string4.length() > 0) {
                arrayList.add(locale2);
            }
            if (string3.length() > 0) {
                Locale locale3;
                if (arrayList.isEmpty()) {
                    locale3 = locale2;
                } else {
                    locale3 = new Locale(string2, string3);
                }
                arrayList.add(locale3);
            }
            if (string2.length() > 0) {
                Locale locale4;
                if (arrayList.isEmpty()) {
                    locale4 = locale2;
                } else {
                    locale4 = new Locale(string2);
                }
                arrayList.add(locale4);
            }
            Locale locale5 = RB;
            arrayList.add(locale5);
            I18NBundle vj_13 = T0(dn0, string, arrayList, 0, vj_12);
            if (vj_13 != null) {
                Locale locale6 = vj_13.pJ0;
                boolean bl = locale6.equals(locale5);
                if (!bl || locale6.equals(locale)) {
                    vj_12 = vj_13;
                    break;
                }
                if (arrayList.size() == 1 && locale6.equals(arrayList.get(0))) {
                    vj_12 = vj_13;
                    break;
                }
                if (bl && vj_12 == null) {
                    vj_12 = vj_13;
                }
            }
            Locale defaultLocale = Locale.getDefault();
            if (locale2.equals(defaultLocale)) {
                locale2 = null;
            } else {
                locale2 = defaultLocale;
            }
            if (locale2 == null) {
                break;
            }
        }
        if (vj_12 == null) {
            throw new MissingResourceException(
                "Can't find bundle for base file handle " + dn0.el() + ", locale " + locale,
                dn0 + "_" + locale,
                ""
            );
        }
        return vj_12;
    }

    public static I18NBundle T0(Dn0 dn0, String string, ArrayList<Locale> arrayList, int n, I18NBundle vj_12) {
        Locale locale = arrayList.get(n);
        I18NBundle vj_13 = null;
        if (n != arrayList.size() - 1) {
            vj_13 = T0(dn0, string, arrayList, n + 1, vj_12);
        } else if (vj_12 != null && locale.equals(RB)) {
            return vj_12;
        }

        Dn0 dn02 = null;
        InputStreamReader inputStreamReader = null;
        I18NBundle vj_14 = null;
        try {
            dn02 = nj(dn0, locale);
            try {
                dn02.uf0().close();
            } catch (Exception exception) {
                KT.E1(inputStreamReader);
                if (vj_14 != null) {
                    vj_14.pJ0 = locale;
                    new b3_0();
                    new MessageFormat("", locale);
                    return vj_14;
                }
                return vj_13;
            }
            vj_14 = new vj_1();
            inputStreamReader = dn02.IE0(string);
            vj_14.dI0(inputStreamReader);
        } catch (Exception iOException) {
            throw new nf_1(iOException);
        } finally {
            KT.E1(inputStreamReader);
        }

        if (vj_14 != null) {
            vj_14.pJ0 = locale;
            new b3_0();
            new MessageFormat("", locale);
        }

        if (vj_14 != null) {
            return vj_14;
        }
        return vj_13;
    }

    public static Dn0 nj(Dn0 dn0, Locale locale) {
        b3_0 b3_02 = new b3_0(dn0.o30());
        if (!locale.equals(RB)) {
            String string = locale.getLanguage();
            String string2 = locale.getCountry();
            String string3 = locale.getVariant();
            boolean bl = "".equals(string);
            boolean bl2 = "".equals(string2);
            boolean bl3 = "".equals(string3);
            if (!bl || !bl2 || !bl3) {
                b3_02.GC0('_');
                if (!bl3) {
                    b3_02.sV(string);
                    b3_02.GC0('_');
                    b3_02.sV(string2);
                    b3_02.GC0('_');
                    b3_02.sV(string3);
                } else if (!bl2) {
                    b3_02.sV(string);
                    b3_02.GC0('_');
                    b3_02.sV(string2);
                } else {
                    b3_02.sV(string);
                }
            }
        }
        b3_02.sV(".properties");
        return dn0.xt(b3_02.toString());
    }

    @SuppressWarnings("deprecation")
    public final void dI0(InputStreamReader inputStreamReader) throws IOException {
        nb_2 nb_22 = new nb_2();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        char[] cArray = new char[40];
        int n4 = 0;
        int n5 = -1;
        boolean bl = true;
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int n6;
        while ((n6 = bufferedReader.read()) != -1) {
                char c = (char) n6;
                if (n4 == cArray.length) {
                    char[] cArray2 = new char[cArray.length * 2];
                    System.arraycopy(cArray, 0, cArray2, 0, n4);
                    cArray = cArray2;
                }
                if (n == 2) {
                    int n7 = Character.digit(c, 16);
                    if (n7 >= 0) {
                        n2 = (n2 << 4) + n7;
                        if (++n3 < 4) {
                            continue;
                        }
                    } else if (n3 <= 4) {
                        throw new IllegalArgumentException("Invalid Unicode sequence: illegal character");
                    }
                    n = 0;
                    cArray[n4++] = (char) n2;
                    if (c != '\n') {
                        continue;
                    }
                }
                if (n == 1) {
                    n = 0;
                    if (c == '\n') {
                        n = 5;
                        continue;
                    }
                    if (c == '\r') {
                        n = 3;
                        continue;
                    }
                    if (c == 'b') {
                        c = '\b';
                    } else if (c == 'f') {
                        c = '\f';
                    } else if (c == 'n') {
                        c = '\n';
                    } else if (c == 'r') {
                        c = '\r';
                    } else if (c == 't') {
                        c = '\t';
                    } else if (c == 'u') {
                        n = 2;
                        n3 = 0;
                        n2 = 0;
                        continue;
                    }
                } else {
                    if (c == '\n') {
                        if (n == 3) {
                            n = 5;
                            continue;
                        }
                        n = 0;
                        bl = true;
                        if (n4 > 0 || (n4 == 0 && n5 == 0)) {
                            if (n5 == -1) {
                                n5 = n4;
                            }
                            String string = new String(cArray, 0, n4);
                            String string2 = string.substring(0, n5);
                            String string3 = string.substring(n5);
                            nb_22.WK0(string2, string3);
                        }
                        n5 = -1;
                        n4 = 0;
                        continue;
                    }
                    if (c == '\r') {
                        n = 0;
                        bl = true;
                        if (n4 > 0 || (n4 == 0 && n5 == 0)) {
                            if (n5 == -1) {
                                n5 = n4;
                            }
                            String string = new String(cArray, 0, n4);
                            String string2 = string.substring(0, n5);
                            String string3 = string.substring(n5);
                            nb_22.WK0(string2, string3);
                        }
                        n5 = -1;
                        n4 = 0;
                        continue;
                    }
                    if (c == '!' || c == '#') {
                        if (bl) {
                            int n8;
                            while ((n8 = bufferedReader.read()) != -1) {
                                char c2 = (char) n8;
                                if (c2 == '\r' || c2 == '\n') {
                                    break;
                                }
                            }
                            continue;
                        }
                    } else if (c == ':' || c == '=') {
                        if (n5 == -1) {
                            n = 0;
                            n5 = n4;
                            continue;
                        }
                    } else if (c == '\\') {
                        if (n == 4) {
                            n5 = n4;
                        }
                        n = 1;
                        continue;
                    }
                    if (Character.isSpace(c)) {
                        if (n == 3) {
                            n = 5;
                        }
                        if (n4 == 0 || n4 == n5 || n == 5) {
                            continue;
                        }
                        if (n5 == -1) {
                            n = 4;
                            continue;
                        }
                    }
                    if (n == 5 || n == 3) {
                        n = 0;
                    }
                }
                bl = false;
                if (n == 4) {
                    n = 0;
                    n5 = n4;
                }
                cArray[n4++] = c;
            }
            if (n == 2 && n3 <= 4) {
                throw new IllegalArgumentException("Invalid Unicode sequence: expected format \\uxxxx");
            }
            if (n5 == -1 && n4 > 0) {
                n5 = n4;
            }
            if (n5 >= 0) {
                String string = new String(cArray, 0, n4);
                String string4 = string.substring(0, n5);
                String string5 = string.substring(n5);
                if (n == 1) {
                    string5 = QA0.W0(string5, "\u0000");
                }
                nb_22.WK0(string4, string5);
            }
    }
}
