/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.util;

import ch.qos.logback.core.util.OptionHelper;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class JNDIUtil {
    static final String RESTRICTION_MSG = "JNDI name must start with java: but was ";

    public static Context getInitialContext() throws NamingException {
        return new InitialContext();
    }

    public static Context getInitialContext(Hashtable hashtable) throws NamingException {
        return new InitialContext(hashtable);
    }

    public static Object lookupObject(Context context, String string) throws NamingException {
        if (context == null) {
            return null;
        }
        if (OptionHelper.isNullOrEmptyOrAllSpaces(string)) {
            return null;
        }
        String string2 = string;
        JNDIUtil.jndiNameSecurityCheck(string2);
        return context.lookup(string2);
    }

    public static void jndiNameSecurityCheck(String string) throws NamingException {
        if (string.startsWith("java:")) {
            return;
        }
        throw new NamingException(RESTRICTION_MSG + string);
    }

    public static String lookupString(Context context, String string) throws NamingException {
        return (String)JNDIUtil.lookupObject(context, string);
    }
}

