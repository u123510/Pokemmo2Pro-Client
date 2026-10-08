package cn.pokemmo.sound;

import f.*;

public class SoundEffectAssetHolder implements vq0_0 {
    public SoundEffectAssetHolder() {
    }

    public static vx_2 Yt0(vx_2 node, ql_0 wanted) {
        if (!node.FA0 && node.UK != null && node.Uj0 != null) {
            vx_2 result = Yt0(node.UK, wanted);
            if (result == null) {
                result = Yt0(node.Uj0, wanted);
            }
            return result;
        }
        if (node.FA0) {
            return null;
        }

        ql_0 bounds = node.K3;
        float width = bounds.IA;
        float wantedWidth = wanted.IA;
        if (width == wantedWidth && bounds.Eu0 == wanted.Eu0) {
            return node;
        }
        if (width < wantedWidth || bounds.Eu0 < wanted.Eu0) {
            return null;
        }

        node.UK = new vx_2();
        node.Uj0 = new vx_2();
        ql_0 first = node.UK.K3;
        ql_0 second = node.Uj0.K3;
        float originalHeight = bounds.Eu0;
        if ((int) width - (int) wantedWidth > (int) originalHeight - (int) wanted.Eu0) {
            first.j80 = bounds.j80;
            first.Wm0 = bounds.Wm0;
            first.IA = wantedWidth;
            first.Eu0 = originalHeight;

            second.j80 = bounds.j80 + wantedWidth;
            second.Wm0 = bounds.Wm0;
            second.IA = width - wantedWidth;
            second.Eu0 = originalHeight;
        } else {
            first.j80 = bounds.j80;
            first.Wm0 = bounds.Wm0;
            first.IA = width;
            first.Eu0 = wanted.Eu0;

            second.j80 = bounds.j80;
            second.Wm0 = bounds.Wm0 + wanted.Eu0;
            second.IA = width;
            second.Eu0 = originalHeight - wanted.Eu0;
        }
        return Yt0(node.UK, wanted);
    }

    @Override
    public final ZO OC0(LJ0 atlas, ql_0 rectangle) {
        Lpt8_ page;
        if (atlas.b6.KB == 0) {
            page = new Lpt8_(atlas);
            atlas.b6.Ue0(page);
        } else {
            page = (Lpt8_) atlas.b6.GH0();
        }
        int padding = atlas.Pp;
        float pad = (float) padding;
        rectangle.IA += pad;
        rectangle.Eu0 += pad;
        vx_2 result = Yt0(page.Ee, rectangle);
        if (result == null) {
            page = new Lpt8_(atlas);
            atlas.b6.Ue0(page);
            result = Yt0(page.Ee, rectangle);
        }
        result.FA0 = true;
        ql_0 bounds = result.K3;
        rectangle.j80 = bounds.j80;
        rectangle.Wm0 = bounds.Wm0;
        rectangle.IA = bounds.IA - pad;
        rectangle.Eu0 = bounds.Eu0 - pad;
        return page;
    }
}
