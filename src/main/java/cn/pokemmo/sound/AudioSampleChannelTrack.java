package cn.pokemmo.sound;

import f.*;

public class AudioSampleChannelTrack implements vq0_0 {
    public AudioSampleChannelTrack() {
    }

    @Override
    public final ZO OC0(LJ0 atlas, ql_0 rectangle) {
        int padding = atlas.Pp;
        int maxWidth = atlas.Tx - padding * 2;
        int maxHeight = atlas.NZ - padding * 2;
        int wantedWidth = (int) rectangle.IA + padding;
        int wantedHeight = (int) rectangle.Eu0 + padding;

        for (int pageIndex = 0; pageIndex < atlas.b6.KB; pageIndex++) {
            ul0_0 page = (ul0_0) atlas.b6.get(pageIndex);
            OB0 candidate = null;
            int slotCount = page.CoN.KB - 1;
            for (int slotIndex = 0; slotIndex < slotCount; slotIndex++) {
                OB0 slot = (OB0) page.CoN.get(slotIndex);
                if (slot.K4 + wantedWidth >= maxWidth) {
                    continue;
                }
                if (slot.wK + wantedHeight >= maxHeight) {
                    continue;
                }
                int bottom = slot.hi0;
                if (wantedHeight > bottom) {
                    continue;
                }
                if (candidate != null && bottom >= candidate.hi0) {
                    continue;
                }
                candidate = slot;
            }

            if (candidate == null) {
                OB0 last = (OB0) page.CoN.GH0();
                int lastY = last.wK;
                if (lastY + wantedHeight >= maxHeight) {
                    continue;
                }
                if (last.K4 + wantedWidth < maxWidth) {
                    last.hi0 = Math.max(last.hi0, wantedHeight);
                    candidate = last;
                } else {
                    int splitY = lastY + last.hi0;
                    if (splitY + wantedHeight < maxHeight) {
                        candidate = new OB0();
                        candidate.wK = splitY;
                        candidate.hi0 = wantedHeight;
                        page.CoN.Ue0(candidate);
                    }
                }
            }

            if (candidate == null) {
                continue;
            }
            int x = candidate.K4;
            rectangle.j80 = x;
            rectangle.Wm0 = candidate.wK;
            candidate.K4 += wantedWidth;
            return page;
        }

        ul0_0 page = new ul0_0(atlas);
        atlas.b6.Ue0(page);
        OB0 slot = new OB0();
        slot.K4 = padding + wantedWidth;
        slot.wK = padding;
        slot.hi0 = wantedHeight;
        page.CoN.Ue0(slot);
        rectangle.j80 = padding;
        rectangle.Wm0 = padding;
        return page;
    }
}
