package f.discord;

import f.org.json.N7;
import java.time.OffsetDateTime;

/**
 * Renamed from f.fa0_2 (RichPresence implementation)
 */
public class fa0_2 {
    public final String oX;
    public final String Tm0;
    public final OffsetDateTime m4;
    public final String Jc;
    public final String Com5;

    public fa0_2(String state, String details, OffsetDateTime start, String largeImage, String largeText) {
        this.oX = state;
        this.Tm0 = details;
        this.m4 = start;
        this.Jc = largeImage;
        this.Com5 = largeText;
    }

    public N7 Qk0() {
        N7 presence = new N7();
        presence.D50(this.oX, "state");
        presence.D50(this.Tm0, "details");

        N7 timestamps = new N7();
        Long start = this.m4 == null ? null : Long.valueOf(this.m4.toEpochSecond());
        timestamps.D50(start, "start");
        timestamps.D50(null, "end");
        presence.D50(timestamps, "timestamps");

        N7 assets = new N7();
        assets.D50(this.Jc, "large_image");
        assets.D50(this.Com5, "large_text");
        assets.D50(null, "small_image");
        assets.D50(null, "small_text");
        presence.D50(assets, "assets");

        N7 party = new N7();
        party.D50(null, "join");
        party.D50(null, "spectate");
        party.D50(null, "match");
        presence.D50(party, "secrets");
        presence.D50(Boolean.FALSE, "instance");
        return presence;
    }
}
