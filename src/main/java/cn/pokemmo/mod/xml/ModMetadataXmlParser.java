package cn.pokemmo.mod.xml;

import f.*;

import java.io.InputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.security.PublicKey;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public abstract class ModMetadataXmlParser {
    public static final dl_1 gq0;
    public static String[] Z40;
    public static String[] h60;
    public static boolean Jf;
    public static boolean BA0;
    public static boolean OS;
    public static int IB0;
    public static boolean ww0;
    public static String[] kz;
    public static String ym;
    public static String ih;
    public static String yw0;
    public static sj_2 He0;
    public static sj_2 O90;
    public static sj_2 Fs0;
    public static boolean ah;
    public static String RV;
    public static boolean oh0;

    static {
        gq0 = Cq0.E1(ModMetadataXmlParser.class);
        Z40 = new String[] {
            "https://dl.pokemmo.com/live/current/feeds/main_feed.txt",
            "https://files.pokemmo.com/live/current/feeds/main_feed.txt",
            "https://dl.pokemmo.eu/live/current/feeds/main_feed.txt",
            "https://files.pokemmo.eu/live/current/feeds/main_feed.txt",
            "https://dl.pokemmo.download/live/current/feeds/main_feed.txt"
        };
        h60 = new String[] {
            "https://dl.pokemmo.com/live/current/feeds/main_feed.sig256",
            "https://files.pokemmo.com/live/current/feeds/main_feed.sig256",
            "https://dl.pokemmo.eu/live/current/feeds/main_feed.sig256",
            "https://files.pokemmo.eu/live/current/feeds/main_feed.sig256",
            "https://dl.pokemmo.download/live/current/feeds/main_feed.sig256"
        };
        Jf = false;
        BA0 = false;
        OS = false;
        IB0 = 0;
        ww0 = false;
        kz = new String[0];
        ym = "";
        ih = "";
        yw0 = "";
        He0 = null;
        O90 = null;
        Fs0 = null;
        ah = false;
        RV = "";
        oh0 = true;
    }

    public static void Rh0() {
        OS = true;
        if (!lpt3__1.coM5.isEmpty()) {
            Z40 = new String[] { lpt3__1.coM5 };
            h60 = new String[] { lpt3__1.R6 };
        }
        String algorithm = "SHA256withRSA";
        PublicKey publicKey = YB0.QG0(TI0.Kd("MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEAyfYQx1kSfIVGdGzcHmVVP7cbyLsMXGdLhwMnx2AD1MYgU170iFN5gHT+U248rH10L6D1UMlZK1LfCsbPkdQOir3C+8Do212NONyNm/7+ZGeIwbpy+jxEQH8Jfn4JYY7+Sn4qg249yW7DSY+XKvTOcphoXRNzSQp8u6IVj03mIw7zDA0SqMMFtnCXVP3NRmtjK1SuVVFLltFctz1Pp7f9uqgqnFlgD2l8/THnddTRM5IR6O9pbOXu7My0+Jli6+4zJgw5gQvgivYPCeess9gWRqpw66VTpMJERJYA6AIbVierAbjGmtRETRsHUOGAgo54G0oxtXXEaTWXF6n6mdgSE2Ra8q7P23stsSWU3mDNQjXO0XOhtAKQCZfvICxmsH3ed5hm8bEC5yga8z8m0vyZ71fWzP4Q3g6B+o6oDsMX1nWbV2GEHci/6nwFofgOJkLINaZfUTivAIRuxECVwjTTa7ruRNgFlA2ciGUIIke2Ev2cYzyBA4LLARky2FZiEM0VAgMBAAE="), "RSA");
        if (lpt3__1.Qm) {
            algorithm = "SHA256withRSA";
            publicKey = YB0.QG0(TI0.Kd("MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEAyNb7iGEOL8/7hBkzvSm0edntPPO6/oaXlsl+1/OKukUifNnLlx+ApInkJyPy7PK6ds6R5C8liCvEEBD6G4/TRi8riG/8pIOCFAe/bjyBoXodzSJ2NRvArW6xVxax6Dpl5/tpsIBOSQDYH/BUXVZZM+DbIAbJhgvxK3r1eth7vO+kj3VLBVzJTrYpzEUz+cW+SxukOsDzHWxuUcogCEC3tzY0M3f/jMv8yrO/xVlWTzn7orrZtg0JfBMOs59NLLPKOlfB2Dtxg517Pbg2knpnNliKYE8vXwcYEJDb1jxgicqV4sYTNwu7MPSBEnYsPpBqbwbDIRI4Nrigqr+9D6Q7LPZjbI8JUZIJ1+pyYtXkSNOnnpbBPyT5WCMrviNDgocct+/PpzlYnwGRjGusqbR+6OTY9U2rptNETyK+0kmmNqxWCxAH93MqgiJk+WonkIaA5zkRlhpstlhIBwrQiYZWY6XgOMRvrdUom8FYLYKRIwRvoTRQG92gI8+WCL8+sjCpAgMBAAE="), "RSA");
        }
        for (int i2 = 0; i2 < Z40.length; i2++) {
            boolean fastTimeout = (i2 == 0);
            try {
                String feedUrl = Z40[i2];
                if (!feedUrl.startsWith("http")) {
                    feedUrl = new String(TI0.Kd(feedUrl));
                }
                InputStream feedStream = tx_1.d7(feedUrl, conn -> ep(fastTimeout, (HttpURLConnection) conn));
                byte[] feedBytes = tx_1.Nm0(feedStream);
                feedStream.close();

                String sigUrl = h60[i2];
                if (!sigUrl.startsWith("http")) {
                    sigUrl = new String(TI0.Kd(sigUrl));
                }
                InputStream sigStream = tx_1.d7(sigUrl, conn -> l1(fastTimeout, (HttpURLConnection) conn));
                byte[] sigBytes = tx_1.Nm0(sigStream);
                sigStream.close();

                if (!YB0.Yd0(feedBytes, sigBytes, publicKey, algorithm)) {
                    gq0.error("Error verifying {} feed signature.", algorithm, new RuntimeException());
                    continue;
                }

                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                try {
                    factory.setFeature("http://xml.org/sax/features/external-general-entities", false);
                    factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
                } catch (ParserConfigurationException ignored) {
                }
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = builder.parse(new InputSource(new StringReader(new String(feedBytes))));
                Element mainFeed = (Element) doc.getElementsByTagName("main_feed").item(0);

                if (mainFeed.getElementsByTagName("ip").getLength() > 0) {
                    lpt3__1.ll0 = mainFeed.getElementsByTagName("ip").item(0).getTextContent();
                }
                if (mainFeed.getElementsByTagName("port").getLength() > 0) {
                    lpt3__1.Nm0 = Integer.parseInt(mainFeed.getElementsByTagName("port").item(0).getTextContent());
                }
                if (mainFeed.getElementsByTagName("ip_sea").getLength() > 0) {
                    if (Locale.getDefault().toString().toLowerCase(Locale.ENGLISH).startsWith("zh")) {
                        lpt3__1.ll0 = mainFeed.getElementsByTagName("ip_sea").item(0).getTextContent();
                    }
                }
                if (mainFeed.getElementsByTagName("min_revision").getLength() > 0) {
                    IB0 = Integer.parseInt(mainFeed.getElementsByTagName("min_revision").item(0).getTextContent());
                }
                tw0_0.Dc0();
                if (mainFeed.getElementsByTagName("min_desktop_revision").getLength() > 0) {
                    IB0 = Integer.parseInt(mainFeed.getElementsByTagName("min_desktop_revision").item(0).getTextContent());
                }
                if (tw0_0.xj0()) {
                    if (mainFeed.getElementsByTagName("min_apk_revision").getLength() > 0) {
                        IB0 = Integer.parseInt(mainFeed.getElementsByTagName("min_apk_revision").item(0).getTextContent());
                    }
                }
                lg_0.k.getClass();
                if (hb0_2.BN == hb0_2.XU) {
                    if (mainFeed.getElementsByTagName("min_ipa_revision").getLength() > 0) {
                        IB0 = Integer.parseInt(mainFeed.getElementsByTagName("min_ipa_revision").item(0).getTextContent());
                    }
                }
                if (mainFeed.getElementsByTagName("update_after_auth").getLength() > 0) {
                    ww0 = Integer.parseInt(mainFeed.getElementsByTagName("update_after_auth").item(0).getTextContent()) > 0;
                }
                if (mainFeed.getElementsByTagName("updater_location").getLength() > 0) {
                    NodeList updaterLocNodes = mainFeed.getElementsByTagName("updater_location");
                    kz = new String[updaterLocNodes.getLength()];
                    for (int i5 = 0; i5 < updaterLocNodes.getLength(); i5++) {
                        kz[i5] = mainFeed.getElementsByTagName("updater_location").item(i5).getTextContent();
                    }
                }
                if (mainFeed.getElementsByTagName("updater_auto_updates_disabled").getLength() > 0) {
                    ah = mainFeed.getElementsByTagName("updater_auto_updates_disabled").item(0).getTextContent().equals("true");
                }
                if (mainFeed.getElementsByTagName("updater_hash_sha256").getLength() > 0) {
                    ym = mainFeed.getElementsByTagName("updater_hash_sha256").item(0).getTextContent();
                }
                for (int i4 = 0; i4 < mainFeed.getElementsByTagName("updater_feed").getLength(); i4++) {
                    if (!ih.isEmpty()) {
                        ih = ih + ",";
                    }
                    ih = ih + mainFeed.getElementsByTagName("updater_feed").item(i4).getTextContent();
                }
                for (int i4 = 0; i4 < mainFeed.getElementsByTagName("updater_sig").getLength(); i4++) {
                    if (!yw0.isEmpty()) {
                        yw0 = yw0 + ",";
                    }
                    yw0 = yw0 + mainFeed.getElementsByTagName("updater_sig").item(i4).getTextContent();
                }
                if (mainFeed.getElementsByTagName("android_apk_location").getLength() > 0
                        && mainFeed.getElementsByTagName("android_apk_sha256").getLength() > 0
                        && mainFeed.getElementsByTagName("android_apk_size").getLength() > 0) {
                    NodeList apkLocNodes = mainFeed.getElementsByTagName("android_apk_location");
                    String[] apkLocs = new String[apkLocNodes.getLength()];
                    for (int i6 = 0; i6 < apkLocNodes.getLength(); i6++) {
                        apkLocs[i6] = mainFeed.getElementsByTagName("android_apk_location").item(i6).getTextContent();
                    }
                    mainFeed.getElementsByTagName("android_apk_sha256").item(0).getTextContent();
                    int apkSize = Integer.parseInt(mainFeed.getElementsByTagName("android_apk_size").item(0).getTextContent());
                    He0 = new sj_2(apkSize);
                }
                if (mainFeed.getElementsByTagName("android_patches").getLength() > 0) {
                    Element androidPatches = (Element) mainFeed.getElementsByTagName("android_patches").item(0);
                    NodeList baseLocNodes = androidPatches.getElementsByTagName("base_location");
                    NodeList patchNodes = androidPatches.getElementsByTagName("patch");
                    for (int i7 = 0; i7 < patchNodes.getLength(); i7++) {
                        Element patchEl = (Element) patchNodes.item(i7);
                        int r = Integer.parseInt(patchEl.getAttribute("r"));
                        int unused = x0_0.k40;
                        if (r == 28887) {
                            String[] baseLocations = new String[baseLocNodes.getLength()];
                            for (int i10 = 0; i10 < baseLocNodes.getLength(); i10++) {
                                baseLocations[i10] = baseLocNodes.item(i10).getTextContent() + patchEl.getAttribute("name");
                            }
                            patchEl.getAttribute("sha256");
                            int patchSize = Integer.parseInt(patchEl.getAttribute("size"));
                            O90 = new sj_2(patchSize);
                        }
                    }
                    NodeList patchBsdNodes = androidPatches.getElementsByTagName("patch_bsd");
                    for (int i6 = 0; i6 < patchBsdNodes.getLength(); i6++) {
                        Element patchBsdEl = (Element) patchBsdNodes.item(i6);
                        int r = Integer.parseInt(patchBsdEl.getAttribute("r"));
                        int unused = x0_0.k40;
                        if (r == 28887) {
                            String[] baseLocations = new String[baseLocNodes.getLength()];
                            for (int i9 = 0; i9 < baseLocNodes.getLength(); i9++) {
                                baseLocations[i9] = baseLocNodes.item(i9).getTextContent() + patchBsdEl.getAttribute("name");
                            }
                            patchBsdEl.getAttribute("sha256");
                            int patchSize = Integer.parseInt(patchBsdEl.getAttribute("size"));
                            Fs0 = new sj_2(patchSize);
                        }
                    }
                }
                if (tw0_0.xj0() && He0 == null) {
                    ah = true;
                }
                if (mainFeed.getElementsByTagName("min_android_sdk_action_install_package").getLength() > 0) {
                    Integer.parseInt(mainFeed.getElementsByTagName("min_android_sdk_action_install_package").item(0).getTextContent());
                }
                if (mainFeed.getElementsByTagName("max_android_sdk_action_install_package").getLength() > 0) {
                    Integer.parseInt(mainFeed.getElementsByTagName("max_android_sdk_action_install_package").item(0).getTextContent());
                }
                if (mainFeed.getElementsByTagName("restrict_wow64").getLength() > 0) {
                    oh0 = Boolean.parseBoolean(mainFeed.getElementsByTagName("restrict_wow64").item(0).getTextContent());
                }
                Jf = true;
                BA0 = true;
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (!Jf) {
            BA0 = true;
            gq0.error("Error loading main_feed", new RuntimeException());
        }
    }

    public static void l1(boolean z, HttpURLConnection httpURLConnection) {
        int timeout = z ? 2000 : 20000;
        httpURLConnection.setConnectTimeout(timeout);
        httpURLConnection.setReadTimeout(z ? 2000 : 20000);
    }

    public static void ep(boolean z, HttpURLConnection httpURLConnection) {
        int timeout = z ? 2000 : 20000;
        httpURLConnection.setConnectTimeout(timeout);
        httpURLConnection.setReadTimeout(z ? 2000 : 20000);
    }
}
