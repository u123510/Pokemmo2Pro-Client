package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ExpanderToggleButton extends BaseButton {
    public ExpanderToggleButton() {
        super();
        uf("server-status-info");
        Ll(false);
        QK.Vb0(new FM((f.dr_1)(Object)this));
    }

    public final void gW() {
        String str = null;
        Element element = QK.Kk;
        String str2 = "";
        if (element != null) {
            try {
                str = "info";
                if (element.hasAttribute("theme")) {
                    String attribute = QK.Kk.getAttribute("theme");
                    if ("success".equals(attribute) || "info".equals(attribute) || "warning".equals(attribute) || "danger".equals(attribute)) {
                        str = attribute;
                    }
                }
                String str3 = "";
                String str4 = "";
                NodeList elementsByTagName = QK.Kk.getElementsByTagName("string");
                for (int i = 0; i < elementsByTagName.getLength(); i++) {
                    Node item = elementsByTagName.item(i);
                    if (item instanceof Element) {
                        Element element2 = (Element) item;
                        if (!element2.hasAttribute("lang") || "en".equals(element2.getAttribute("lang"))) {
                            str3 = element2.getTextContent();
                        } else if (element2.getAttribute("lang").startsWith(dw_2.con)) {
                            str4 = element2.getTextContent();
                        }
                    }
                }
                if (!str4.isEmpty()) {
                    str3 = str4;
                }
                if (str3.isEmpty()) {
                    str2 = "";
                } else {
                    if (str3.contains("STRING")) {
                        str3 = sm0_0.dd(str3);
                    }
                    if (str3.contains("STRING")) {
                        str2 = "";
                    } else {
                        str2 = str3;
                    }
                }
            } catch (Exception e) {
                QK.Cv0.warn("Unable to get serverstatus values", e);
                str2 = "";
            }
        }
        if (!str2.isEmpty() && !str.isEmpty()) {
            if (this.j50.toString().equalsIgnoreCase(str2)) {
                return;
            }
            Sk(str2);
            kx0("server-status-" + str);
            Ll(true);
        }
    }
}
