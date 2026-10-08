package cn.pokemmo.world.weather;

import f.*;

import java.io.InputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.function.Consumer;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public abstract class WeatherSimulationMath {
    public static final dl_1 Cv0 = Cq0.E1(QK.class);
    public static NodeList Lpt9;
    public static Element Kk;
    public static boolean yw0;
    public static final ArrayList Hm = new ArrayList();

    public static void Vb0(Runnable runnable) {
        synchronized (Hm) {
            if (Lpt9 != null) {
                lg_0.k.lPT5(runnable);
                return;
            }
            Hm.add(runnable);
            if (!yw0) {
                yw0 = true;
                lpt5__5.hL.Com4.execute(new nt_0());
            }
        }
    }

    public static void Xp() {
        Exception failure = null;
        byte[] data = null;
        String[] urls = new String[]{
            "https://raw.githubusercontent.com/LM5610/-/refs/heads/main/news_feed.txt",
        };

        for (String url : urls) {
            InputStream in = null;
            try {
                in = tx_1.d7(url, (Consumer<HttpURLConnection>)QK::re);
                data = tx_1.Nm0(in);
                break;
            } catch (Exception e) {
                failure = e;
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (Exception ignored) {
                    }
                }
            }
        }

        try {
            if (data != null) {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                try {
                    factory.setFeature("http://xml.org/sax/features/external-general-entities", false);
                    factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
                } catch (ParserConfigurationException ignored) {
                }
                String xml = new String(data, StandardCharsets.UTF_8);
                Document document = factory.newDocumentBuilder().parse(new InputSource(new StringReader(xml)));
                Lpt9 = document.getElementsByTagName("item");
                NodeList serverStatusList = document.getElementsByTagName("serverstatus");
                if (serverStatusList.getLength() > 0 && serverStatusList.item(0) instanceof Element) {
                    Kk = (Element)serverStatusList.item(0);
                }
            } else {
                Cv0.warn("Unable to load news feed", failure != null ? failure : new RuntimeException());
            }
        } catch (Exception e) {
            Cv0.warn("Unable to load news feed", e);
        } finally {
            synchronized (Hm) {
                yw0 = false;
                if (Lpt9 != null) {
                    for (Object object : Hm) {
                        lg_0.k.lPT5((Runnable)object);
                    }
                    Hm.clear();
                }
            }
        }
    }

    public static void re(HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(2000);
        httpURLConnection.setReadTimeout(2000);
    }
}
