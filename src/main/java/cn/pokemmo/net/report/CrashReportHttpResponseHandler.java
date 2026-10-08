/*
 * Reconstructed from bytecode (javap -c -p). CFR 0.152 failed: "Back jump on a try block".
 */
package cn.pokemmo.net.report;

import f.*;

import java.io.IOException;
import java.io.InputStream;

public class CrashReportHttpResponseHandler {
    public final boolean tR;

    public CrashReportHttpResponseHandler(boolean bl) {
        this.tR = bl;
    }

    public final void lv0(ce0_2 ce0_22) {
        Bw0.iC.info("Error report status code: {}", Integer.valueOf(ce0_22.SU.vQ));
        Object object;
        try {
            object = ce0_22.E2.getInputStream();
        }
        catch (IOException iOException) {
            object = ce0_22.E2.getErrorStream();
        }
        if (object == null) {
            object = "";
        }
        else {
            InputStream stream = (InputStream)object;
            try {
                object = KT.MI0(stream, ce0_22.E2.getContentLength());
            }
            finally {
                KT.E1(stream);
            }
        }
        try {
            Bw0.iC.info("Raw Response: '{}'", object);
            if (ce0_22.SU.vQ == 200) {
                oe_0 oe_0_ = new Y1().Gu0(((String)object).toCharArray(), ((String)object).toCharArray().length);
                oe_0 oe_0_2 = oe_0_.Is("success");
                if (oe_0_2 == null) {
                    throw new IllegalArgumentException("Named value not found: success");
                }
                Bw0.iC.info("Response 'success': {}", Boolean.valueOf(oe_0_2.Xv0()));
                boolean hasId = oe_0_.UJ0("id");
                String idString = oe_0_.Nz0("id");
                Bw0.iC.info("Response 'id':  has {} string: {}", Boolean.valueOf(hasId), idString);
                oe_0_2 = oe_0_.Is("success");
                if (oe_0_2 == null) {
                    throw new IllegalArgumentException("Named value not found: success");
                }
                if (oe_0_2.Xv0() && oe_0_.UJ0("id")) {
                    Bw0.iC.info("Valid all, doing clipboard");
                    String id = oe_0_.Nz0("id");
                    NR nr = tw0_0.lM;
                    if (nr != null) {
                        nr.kA(id);
                    }
                    Bw0.iC.info("Valid all, showing notification");
                    int stringId = nf0_0.Vj0;
                    if (oe_0_.UJ0("string_id")) {
                        oe_0_2 = oe_0_.Is("string_id");
                        if (oe_0_2 == null) {
                            throw new IllegalArgumentException("Named value not found: string_id");
                        }
                        stringId = oe_0_2.coM4();
                    }
                    String regionOrMod = "";
                    if (oe_0_.UJ0("region_id")) {
                        oe_0_2 = oe_0_.Is("region_id");
                        if (oe_0_2 == null) {
                            throw new IllegalArgumentException("Named value not found: region_id");
                        }
                        regionOrMod = sm0_0.c0(oe_0_2.coM4() + 90);
                    }
                    else if (oe_0_.UJ0("mod_name")) {
                        regionOrMod = oe_0_.Nz0("mod_name");
                    }
                    String string = sm0_0.c0(nf0_0.oa);
                    String formatted = sm0_0.Bx(stringId, new String[]{id, regionOrMod});
                    tw0_0.uV.Ef0(string, formatted, UE.h1, new q30_0((rw0) this), true);
                    return;
                }
            }
            Bw0.iC.info("Error report response end, calling failure");
            this.hJ();
        }
        catch (Exception exception) {
            Bw0.iC.error("Error handling error report response", exception);
            Bw0.iC.info("Error report response end, calling failure");
            this.hJ();
        }
    }

    public final void hJ() {
        Bw0.iC.info("Error report submission failed");
        tw0_0.uV.Ef0(sm0_0.c0(nf0_0.go), sm0_0.c0(nf0_0.vz0), UE.iC, new WI((rw0) this), false);
    }
}
