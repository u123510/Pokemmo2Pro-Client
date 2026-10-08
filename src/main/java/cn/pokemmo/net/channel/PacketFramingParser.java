package cn.pokemmo.net.channel;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Random;

public abstract class PacketFramingParser {
    public static final dl_1 uA = Cq0.E1(PacketFramingParser.class);

    public static boolean Ps() {
        z60_0 z60 = tw0_0.Wv0;
        if (z60 != null && z60.HO) {
            return true;
        }
        try {
            z60_0 newZ60 = new z60_0(lpt5__5.hL, new il_0[0]);
            tw0_0.Wv0 = newZ60;
            newZ60.bn0();
            return true;
        } catch (Error e) {
            tw0_0.Wv0 = null;
            return false;
        }
    }

    public static boolean Yh(uc_2 v0) {
        if (!Ps()) {
            return false;
        }
        try {
            int i1;
            if (!lpt3__1.Ja0.isEmpty() && (i1 = lpt3__1.Vj0) > 0) {
                return lPT2(i1, lpt3__1.Ja0, null, null, v0, null, false) != null;
            }
            return lPT2(lpt3__1.Nm0, lpt3__1.ll0, null, null, v0, null, false) != null;
        } catch (Exception e) {
            uA.error("failed {}", Integer.valueOf(lpt3__1.Nm0), e);
            return false;
        }
    }

    public static boolean WX(BR v0) {
        if (!Ps()) {
            return false;
        }
        try {
            int i1;
            if (!lpt3__1.e90.isEmpty() && (i1 = lpt3__1.WP) > 0) {
                return lPT2(i1, lpt3__1.e90, null, null, null, v0, false) != null;
            }
            np_0 np = v0.CA;
            return lPT2(np.Lq, np.YH, np.kF0, np.ub, null, v0, false) != null;
        } catch (Exception e) {
            uA.error("failed {}", Integer.valueOf(lpt3__1.WP), e);
            return false;
        }
    }

    public static boolean G5(Ge0 v0) {
        if (!Ps()) {
            return false;
        }
        try {
            int i1;
            if (!lpt3__1.bz0.isEmpty() && (i1 = lpt3__1.qG) > 0) {
                return lPT2(i1, lpt3__1.bz0, null, null, null, v0, true) != null;
            }
            return lPT2(0, null, null, v0.w0, null, v0, true) != null;
        } catch (Exception e) {
            uA.error("failed", (Throwable) e);
            return false;
        }
    }

    public static ky_2 lPT2(int i0, String v1, byte[] v2, lp_1[] v3, uc_2 v4, Ge0 v5, boolean i6) {
        boolean hasIpv6 = false;
        if (dw_2.RJ0) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface nif = networkInterfaces.nextElement();
                    for (InterfaceAddress ifAddr : nif.getInterfaceAddresses()) {
                        InetAddress addr = ifAddr.getAddress();
                        if (!addr.isLoopbackAddress() && !addr.isLinkLocalAddress() && !(addr instanceof Inet4Address)) {
                            hasIpv6 = true;
                            break;
                        }
                    }
                    if (hasIpv6) {
                        break;
                    }
                }
            } catch (SocketException e) {
                hasIpv6 = true;
            }
        }
        tw0_0.lM.getClass();
        ArrayList<SocketAddress> list = new ArrayList<>();
        if (v3 != null && v3.length > 0) {
            ArrayList<lp_1> sortedList = new ArrayList<>();
            ArrayList<lp_1> copyList = new ArrayList<>(Arrays.asList(v3));
            int targetSize = copyList.size();
            while (sortedList.size() < targetSize) {
                int totalWeight = 0;
                for (lp_1 lp : copyList) {
                    totalWeight += lp.nul;
                }
                int randomWeight = rg0_2.r4(totalWeight);
                int acc = 0;
                for (lp_1 candidate : copyList) {
                    acc += candidate.nul;
                    if (randomWeight < acc) {
                        sortedList.add(candidate);
                        copyList.remove(candidate);
                        break;
                    }
                }
            }
            for (lp_1 lp : sortedList) {
                if (!lp.wZ.YS()) {
                    list.add(new InetSocketAddress(lp.wZ.ZL0(), lp.MG0));
                }
                if (hasIpv6 && !lp.F00.YS()) {
                    list.add(new InetSocketAddress(lp.F00.ZL0(), lp.MG0));
                }
            }
        }
        if (v1 != null && !v1.isEmpty()) {
            try {
                InetAddress[] addresses = InetAddress.getAllByName(v1);
                Random rng = rg0_2.Ak0.MC0;
                if (rng != null) {
                    for (int len = addresses.length; len > 1; ) {
                        int r = rng.nextInt(len);
                        len--;
                        InetAddress tmp = addresses[len];
                        addresses[len] = addresses[r];
                        addresses[r] = tmp;
                    }
                }
                for (InetAddress addr : addresses) {
                    if (addr instanceof Inet4Address) {
                        list.add(new InetSocketAddress(addr, i0));
                    }
                }
                if (hasIpv6) {
                    for (InetAddress addr : addresses) {
                        if (addr instanceof Inet6Address) {
                            list.add(new InetSocketAddress(addr, i0));
                        }
                    }
                }
            } catch (UnknownHostException e) {
            }
        }
        if (list.isEmpty() && v2 != null) {
            try {
                list.add(new InetSocketAddress(InetAddress.getByAddress(v2), i0));
            } catch (UnknownHostException e) {
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        dx_1 dx = new dx_1(list.toArray(new SocketAddress[0]), v4, v5, i6);
        while (!dx.Ll()) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
            }
        }
        return dx.oy0;
    }
}
