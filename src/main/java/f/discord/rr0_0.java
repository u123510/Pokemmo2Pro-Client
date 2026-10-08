package f.discord;

import f.Cq0;
import f.J90;
import f.QJ;
import f.dl_1;
import f.fi0_0;
import f.org.json.A70;
import f.org.json.N7;
import f.org.json.ic_1;
import java.io.Closeable;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.HashMap;

/**
 * Renamed from f.rr0_0 (IPCClient implementation)
 */
public class rr0_0 implements Closeable {
    public static final dl_1 t20 = Cq0.E1(rr0_0.class);
    public final long OD;
    public final HashMap sg;
    public volatile vs_0 C20;
    public DN Op;
    public Thread Du;

    public rr0_0() {
        this.sg = new HashMap();
        this.Op = null;
        this.Du = null;
        this.OD = 515852628178239489L;
    }

    public void AV(int... v1) throws Y40 {
        this.gt0(false);
        this.sg.clear();
        this.C20 = null;
        long j2 = this.OD;
        HashMap v4 = this.sg;
        if (v1.length == 0) {
            v1 = new int[] { 4 };
        }
        int i5 = J90.uY(4).length;
        vs_0[] v6 = new vs_0[i5];
        vs_0 v8 = null;
        for (int i7 = 0; i7 < 10; i7++) {
            try {
                if (false) throw new IOException();
                String pipe = vs_0.pA(i7);
                k8_0 k8 = vs_0.il0(this, v4, pipe);
                v8 = k8;
                N7 handshake = new N7();
                handshake.D50(1, "v");
                handshake.D50(Long.toString(j2), "client_id");
                k8.Rb0(1, handshake);
                Ho0 packet = k8.ZC();
                Object dataObj = packet.Tr.Xf0("data");
                if (!(dataObj instanceof N7)) {
                    throw N7.w3("JSONObject", "data", dataObj, null);
                }
                N7 data = (N7) dataObj;
                Object configObj = data.Xf0("config");
                if (!(configObj instanceof N7)) {
                    throw N7.w3("JSONObject", "config", configObj, null);
                }
                String endpoint = ((N7) configObj).By("api_endpoint");
                int[] modes = J90.uY(4);
                int foundMode = 4;
                for (int i13 = 0; i13 < modes.length; i13++) {
                    int m = modes[i13];
                    String ep = dQ.aE(m);
                    if (ep != null && ep.equals(endpoint)) {
                        foundMode = m;
                        break;
                    }
                }
                k8.qc0 = foundMode;
                int currentMode = k8.qc0;
                int preferred = v1[0];
                if (currentMode == preferred || (preferred == 4)) {
                    t20.info(String.format("Found preferred client: %s", dQ.ES(currentMode)));
                    break;
                }
                v6[J90.Qj(currentMode)] = v8;
                v6[3] = v8;
                v8.qc0 = 0;
            } catch (IOException | ic_1 ignored) {
            }
        }
        if (v8 == null) {
            for (int i2 = 1; i2 < v1.length; i2++) {
                int i3 = v1[i2];
                if (v6[J90.Qj(i3)] != null) {
                    v8 = v6[J90.Qj(i3)];
                    v6[J90.Qj(i3)] = null;
                    if (i3 == 4) {
                        for (int i1 = 0; i1 < i5; i1++) {
                            if (v6[i1] == v8) {
                                v8.qc0 = J90.uY(4)[i1];
                                v6[i1] = null;
                            }
                        }
                    } else {
                        v8.qc0 = i3;
                    }
                    t20.info(String.format("Found preferred client: %s", dQ.ES(v8.qc0)));
                    break;
                }
            }
            if (v8 == null) {
                throw new Y40();
            }
        }
        for (int i1 = 0; i1 < i5; i1++) {
            if (i1 == 3) {
                continue;
            }
            vs_0 v2 = v6[i1];
            if (v2 != null) {
                try {
                    k8_0 k8 = (k8_0) v2;
                    k8.Rb0(3, new N7());
                    k8.DE = 4;
                    k8.DG.close();
                } catch (IOException ignored) {
                }
            }
        }
        v8.DE = 3;
        this.C20 = v8;
        if (this.Op != null) {
            QJ qj = (QJ) this.Op;
            qj.xx.Lz = qj.KA;
            qj.xx.BO();
        }
        this.Ie();
    }

    public void Rx0(fa0_2 v1) {
        this.gt0(true);
        vs_0 client = this.C20;
        String mxName = ManagementFactory.getRuntimeMXBean().getName();
        int atIndex = mxName.indexOf('@');
        int pid = Integer.parseInt(mxName.substring(0, atIndex));
        N7 args = new N7().Hj(pid);
        args.D50(v1.Qk0(), "activity");
        N7 cmd = new N7();
        cmd.D50("SET_ACTIVITY", "cmd");
        cmd.D50(args, "args");
        client.Rb0(2, cmd);
    }

    @Override
    public void close() {
        this.gt0(true);
        try {
            k8_0 k8 = (k8_0) this.C20;
            k8.Rb0(3, new N7());
            k8.DE = 4;
            k8.DG.close();
        } catch (IOException ignored) {
        }
    }

    public void gt0(boolean i1) {
        if (i1) {
            if (this.C20 == null || this.C20.DE != 3) {
                throw new IllegalStateException(String.format("IPCClient (ID: %d) is not connected!", this.OD));
            }
        } else {
            if (this.C20 != null && this.C20.DE == 3) {
                throw new IllegalStateException(String.format("IPCClient (ID: %d) is already connected!", this.OD));
            }
        }
    }

    public void Ie() {
        this.Du = new Thread(this::zq);
        this.Du.start();
    }

    public void zq() {
        while (true) {
            Ho0 packet;
            try {
                if (false) throw new IOException();
                packet = this.C20.ZC();
            } catch (IOException | ic_1 e) {
                if (e instanceof IOException) {
                    t20.error("Reading thread encountered an IOException", e);
                } else {
                    t20.error("Reading thread encountered an JSONException", e);
                }
                if (this.C20 != null) {
                    this.C20.DE = 5;
                }
                if (this.Op != null) {
                    ((QJ) this.Op).xx.Lz = null;
                }
                return;
            }

            if (packet.qB == 3) {
                if (this.C20 != null) {
                    this.C20.DE = 5;
                }
                return;
            }

            N7 payload = packet.Tr;
            Object evtObj = payload.Pt0.get("evt");
            String evtStr = null;
            if (evtObj != null && !N7.aD0.equals(evtObj)) {
                evtStr = evtObj.toString();
            }
            int evtType = 7;
            if (evtStr == null) {
                evtType = 1;
            } else {
                int[] evts = J90.uY(7);
                for (int i5 = 0; i5 < evts.length; i5++) {
                    int ev = evts[i5];
                    if (ev != 7 && fi0_0.i20(ev).equalsIgnoreCase(evtStr)) {
                        evtType = ev;
                        break;
                    }
                }
            }

            Object nonceObj = payload.Pt0.get("nonce");
            String nonceStr = null;
            if (nonceObj != null && !N7.aD0.equals(nonceObj)) {
                nonceStr = nonceObj.toString();
            }

            switch (J90.Qj(evtType)) {
                case 0:
                    if (nonceStr != null && this.sg.containsKey(nonceStr)) {
                        Object cb = this.sg.remove(nonceStr);
                        if (cb == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                    break;
                case 2:
                    if (nonceStr != null && this.sg.containsKey(nonceStr)) {
                        Object cb = this.sg.remove(nonceStr);
                        if (cb != null) {
                            throw new ClassCastException();
                        }
                        try {
                            Object data = payload.Xf0("data");
                            if (!(data instanceof N7)) {
                                throw N7.w3("JSONObject", "data", data, null);
                            }
                            Object msgObj = ((N7) data).Pt0.get("message");
                            if (msgObj != null && !N7.aD0.equals(msgObj)) {
                                msgObj.toString();
                            }
                        } catch (Exception ignored) {
                        }
                        throw null;
                    }
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                default:
                    break;
            }

            if (this.Op != null) {
                if (payload.Pt0.containsKey("cmd") && "DISPATCH".equals(payload.By("cmd"))) {
                    try {
                        Object dataObj = payload.Xf0("data");
                        if (!(dataObj instanceof N7)) {
                            throw N7.w3("JSONObject", "data", dataObj, null);
                        }
                        N7 data = (N7) dataObj;
                        String dispatchEvtStr = data.By("evt");
                        int[] evts = J90.uY(7);
                        int dispatchEvt = 7;
                        for (int i5 = 0; i5 < evts.length; i5++) {
                            int ev = evts[i5];
                            if (ev != 7 && fi0_0.i20(ev).equalsIgnoreCase(dispatchEvtStr)) {
                                dispatchEvt = ev;
                                break;
                            }
                        }
                        int qjEvt = J90.Qj(dispatchEvt);
                        if (qjEvt == 3) {
                            this.Op.getClass();
                            data.By("secret");
                        } else if (qjEvt == 4) {
                            this.Op.getClass();
                            data.By("secret");
                        } else if (qjEvt == 5) {
                            Object userObj = data.Xf0("user");
                            if (!(userObj instanceof N7)) {
                                throw N7.w3("JSONObject", "user", userObj, null);
                            }
                            N7 user = (N7) userObj;
                            user.By("username");
                            user.By("discriminator");
                            Long.parseLong(user.By("id"));
                            Object avatarObj = user.Pt0.get("avatar");
                            if (avatarObj != null && !N7.aD0.equals(avatarObj)) {
                                avatarObj.toString();
                            }
                            Object secretObj = data.Pt0.get("secret");
                            if (secretObj != null && !N7.aD0.equals(secretObj)) {
                                secretObj.toString();
                            }
                            this.Op.getClass();
                        }
                    } catch (Exception e) {
                        t20.error("Exception when handling event: ", e);
                    }
                }
            }
        }
    }
}
