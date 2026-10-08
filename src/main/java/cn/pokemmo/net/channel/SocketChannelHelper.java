/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.channel;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import f.AO;
import f.Sr0;
import f.T2;
import f.Vm0;
import f._default;
import f.con__5;
import f.fq0_0;
import f.fx_2;
import f.lc0_0;
import f.lo_0;
import f.qr_2;
import f.rx_0;
import f.sv_0;
import f.tq_1;
import f.vr_0;
import f.wi_2;
import f.xa_1;
import f.yq_0;
import f.zf0_1;
import java.io.File;
import java.net.InetAddress;
import java.time.Duration;
import java.util.regex.Pattern;

/*
 * Renamed from f.fr
 */
public abstract class SocketChannelHelper {
    public static rx_0 B40(Class clazz, Class clazz2) {
        if (clazz2 == rx_0.class) {
            clazz2 = null;
        }
        if (clazz2 != null) {
            try {
                return (rx_0)clazz2.newInstance();
            }
            catch (Exception exception) {
                throw new lc0_0("Can't instantiate property transformer", exception);
            }
        }
        if (clazz != Boolean.class && clazz != Boolean.TYPE) {
            if (clazz != Byte.class && clazz != Byte.TYPE) {
                if (clazz != Character.class && clazz != Character.TYPE) {
                    if (clazz != Double.class && clazz != Double.TYPE) {
                        if (clazz != Float.class && clazz != Float.TYPE) {
                            if (clazz != Integer.class && clazz != Integer.TYPE) {
                                if (clazz != Long.class && clazz != Long.TYPE) {
                                    if (clazz != Short.class && clazz != Short.TYPE) {
                                        if (clazz == String.class) {
                                            return yq_0.Pu0;
                                        }
                                        if (clazz.isEnum()) {
                                            return AO.ab0;
                                        }
                                        if (clazz == File.class) {
                                            return fq0_0.Fn0;
                                        }
                                        if (Vm0.Cd0(clazz)) {
                                            return T2.rZ;
                                        }
                                        if (clazz == InetAddress.class) {
                                            return Sr0.ZX;
                                        }
                                        if (clazz == Pattern.class) {
                                            return qr_2.Od;
                                        }
                                        if (clazz == Class.class) {
                                            return vr_0.aK;
                                        }
                                        if (clazz == Duration.class) {
                                            return wi_2.nG0;
                                        }
                                        throw new lc0_0("Transformer not found for class ".concat(clazz.getName()));
                                    }
                                    return _default.iP;
                                }
                                return lo_0.Vi;
                            }
                            return tq_1.M20;
                        }
                        return fx_2.ge;
                    }
                    return con__5.Kz;
                }
                return xa_1.Do;
            }
            return zf0_1.E50;
        }
        return sv_0.T00;
    }
}

