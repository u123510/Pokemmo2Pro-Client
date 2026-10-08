package cn.pokemmo.io.xml;

import f.Ps0;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/**
 * XML Pull 解析器工厂单例提供者
 */
public abstract class XmlPullParserFactoryProvider {
    public static final XmlPullParserFactory qP;
    public static final XmlPullParserException PL;

    static {
        XmlPullParserFactory factory = null;
        XmlPullParserException error = null;
        try {
            factory = XmlPullParserFactory.newInstance();
            factory.setNamespaceAware(false);
            factory.setValidating(false);
        } catch (XmlPullParserException e) {
            Logger.getLogger(Ps0.class.getName()).log(Level.SEVERE, "Unable to construct XmlPullParserFactory", (Throwable) e);
            error = e;
        }
        qP = factory;
        PL = error;
    }
}
