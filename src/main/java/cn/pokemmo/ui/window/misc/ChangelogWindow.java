package cn.pokemmo.ui.window.misc;

import f.*;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * 版本更新公告与日志窗口
 *
 * 原混淆类: f.zx_0
 */
public class ChangelogWindow extends R90 {
    public final zx_0 asBridge() {
        return (zx_0) (Object) this;
    }

    public static final dl_1 LH = Cq0.E1(zx_0.class);
    public final LPt2_ VQ;
    public final fy_2 H;

    public ChangelogWindow(LPt2_ lPt2_) {
        super();
        this.VQ = lPt2_;
        LPT8(new N1(asBridge(), new gn_0((byte) -1, (byte) -1, (byte) -1, (byte) -1)));
        uf("changelog-frame");
        ff0(1);
        ZW zw = new ZW();
        zw.Od0(false);
        zw.uf("tabbedpane");
        fy_2 h = new fy_2();
        this.H = h;
        SL(h);
        Hy("");
        QK.Vb0(new la0_2(asBridge()));
    }

    public final void sP() {
        if (!this.h3.isEmpty()) {
            Hy(sm0_0.c0(1004));
        }
    }

    public final void q90() {
        try {
            NodeList nodeList = QK.Lpt9;
            if (nodeList == null || nodeList.getLength() < 1) {
                return;
            }
            if (this.Em0 == null) {
                return;
            }
            Hy(sm0_0.c0(1004));
            Hm0 vGroup = new Hm0(this.H);
            I7 hGroup = new I7(this.H);
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node item = nodeList.item(i);
                if (item.getNodeType() == 1) {
                    xe_1 btn = new xe_1((KG0) null, false, (tq_0) null);
                    try {
                        Element el = (Element) item;
                        String link = el.getElementsByTagName("link").item(0).getTextContent();
                        String title = el.getElementsByTagName("title").item(0).getTextContent();
                        if (title.length() > 50) {
                            title = title.substring(0, 50) + " ... ";
                            btn.yj0 = el.getElementsByTagName("title").item(0).getTextContent();
                            btn.yB0();
                            btn.GH0 = 0;
                        }
                        btn.SU(title);
                        btn.RR(new iv0_0(link));
                    } catch (Exception ignored) {
                        continue;
                    }
                    vGroup.Kn0(btn);
                    hGroup.Kn0(btn);
                }
            }
            this.H.WQ(vGroup);
            this.H.x40(hGroup);
            lt0();
            this.VQ.COm3();
            this.VQ.Iu();
        } catch (Exception e) {
            LH.error("", e);
        }
    }

    @Override
    public final void K8() {
        lt0();
        super.K8();
    }
}
