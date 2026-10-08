package cn.pokemmo.net.nio.worker;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.net.SocketAddress;

import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.nio.channels.SocketChannel;
import java.util.concurrent.TimeUnit;

public class ServerEndpointAddressResolver {
    public final SocketAddress[] R80;
    public int YJ0;
    public ky_2 oy0;
    public long TB;
    public final uc_2 Cx;
    public final Ge0 Oh0;
    public final boolean yB;
    public boolean p9;

    public ServerEndpointAddressResolver(SocketAddress[] socketAddressArr, uc_2 uc_22, Ge0 ge0, boolean z) {
        this.YJ0 = 0;
        this.oy0 = null;
        this.TB = 0L;
        this.p9 = false;
        this.R80 = socketAddressArr;
        this.Cx = uc_22;
        this.Oh0 = ge0;
        this.yB = z;
    }

    public static void Y6() {
        tw0_0.lM.getClass();
        qt_0 qt_02 = new qt_0();
        String str = "pool.ntp.org";
        long j = 0L;
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            int i = 0;
            while (true) {
                if (i >= allByName.length) {
                    qt_0.TU.getClass();
                    break;
                }
                if (qt_02.z8(allByName[i])) {
                    long j2 = qt_02.jk;
                    j = (TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS) + j2) - qt_02.r60;
                    break;
                }
                i++;
            }
        } catch (UnknownHostException unused) {
            qt_0.TU.warn("Unknown host: {}", str);
            qt_0.TU.getClass();
        }
        if (j != 0L && Math.abs(System.currentTimeMillis() - j) >= 86000000L) {
            lg_0.k.lPT5(ServerEndpointAddressResolver::nD0);
        }
    }

    public static void nD0() {
        tw0_0.uV.Ef0(sm0_0.c0(927), sm0_0.c0(928), UE.iC, null, false);
    }

    public final void ds0(d50_0 d50_02) {
        if (this.oy0 == d50_02) {
            this.oy0 = null;
        }
        if (!this.p9) {
            this.p9 = true;
            lpt5__5.hL.Com4.execute(ServerEndpointAddressResolver::Y6);
        }
    }

    public final boolean Ll() {
        int i = this.YJ0 / 2;
        SocketAddress[] socketAddressArr = this.R80;
        if (i / socketAddressArr.length > 1) {
            this.oy0 = null;
            return true;
        }
        ky_2 ky_22 = this.oy0;
        if (ky_22 == null) {
            if (i / socketAddressArr.length > 1) {
                this.oy0 = null;
                return false;
            }
            SocketAddress socketAddress = socketAddressArr[i % socketAddressArr.length];
            boolean z = i / socketAddressArr.length > 0;
            try {
                SocketChannel open = SocketChannel.open();
                Socket socket = open.socket();
                int i2 = z ? 30000 : 10000;
                socket.connect(socketAddress, i2);
                open.configureBlocking(false);
                this.YJ0++;
                if (this.Cx != null) {
                    fk_1 vW = tw0_0.Wv0.vW();
                    this.TB = System.currentTimeMillis();
                    Ry ry = new Ry(open, vW, this.Cx, (dx_1) this);
                    this.oy0 = ry;
                    this.Cx.cp0 = ry;
                    return false;
                }
                if (this.yB) {
                    fk_1 vW2 = tw0_0.Wv0.vW();
                    this.TB = System.currentTimeMillis();
                    TX tx = new TX(open, vW2, this.Oh0, (dx_1) this);
                    this.oy0 = tx;
                    this.Oh0.Wz = tx;
                    return false;
                }
                if (this.Oh0 != null) {
                    fk_1 vW3 = tw0_0.Wv0.vW();
                    this.TB = System.currentTimeMillis();
                    k20_0 k20_02 = new k20_0(open, vW3, this.Oh0, (dx_1) this);
                    this.oy0 = k20_02;
                    this.Oh0.fk0 = k20_02;
                    return false;
                }
                return false;
            } catch (Exception unused) {
                this.YJ0++;
                Ll();
                return false;
            }
        }
        if (ky_22 instanceof Ry) {
            switch (J90.Qj(((Ry) ky_22).gv0)) {
                case 1:
                case 2:
                case 3:
                    return true;
                case 0:
                    if (System.currentTimeMillis() - this.TB > 10000L) {
                        this.oy0.yK0();
                    }
                    return false;
                default:
                    break;
            }
        }
        ky_2 ky_23 = this.oy0;
        if (ky_23 instanceof k20_0) {
            int Qj = J90.Qj(((k20_0) ky_23).Co0);
            if (Qj != 0) {
                if (Qj == 1 || Qj == 2 || Qj == 4) {
                    return true;
                }
            } else {
                if (System.currentTimeMillis() - this.TB > 10000L) {
                    this.oy0.yK0();
                }
                return false;
            }
        }
        ky_2 ky_24 = this.oy0;
        if (ky_24 instanceof TX) {
            int Qj2 = J90.Qj(((TX) ky_24).nV);
            if (Qj2 != 0) {
                if (Qj2 == 1 || Qj2 == 2) {
                    return true;
                }
            } else {
                if (System.currentTimeMillis() - this.TB > 10000L) {
                    this.oy0.yK0();
                }
                return false;
            }
        }
        return false;
    }
}
