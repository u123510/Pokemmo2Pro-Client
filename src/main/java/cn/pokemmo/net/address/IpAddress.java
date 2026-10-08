package cn.pokemmo.net.address;

import f.*;

import f.ineter.W30;
import f.ineter.pm_1;
import f.ineter.qb0_1;
import java.io.Serializable;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public interface IpAddress extends Serializable {
    static LY Fu0(InetAddress address) {
        if (address instanceof Inet6Address) {
            Inet6Address ipv6 = (Inet6Address) address;
            if (ipv6.getScopeId() == 0 && ipv6.getScopedInterface() == null) {
                byte[] bytes = ipv6.getAddress();
                bytes.getClass();
                if (bytes.length != 16) {
                    throw new IllegalArgumentException("The given array must be 16 bytes long");
                }
                return new qb0_1(xe0_1.mC(bytes, 0), xe0_1.mC(bytes, 8));
            }

            byte[] bytes = ipv6.getAddress();
            String scope = ipv6.getScopedInterface() != null
                    ? ipv6.getScopedInterface().getName()
                    : Integer.toString(ipv6.getScopeId());
            bytes.getClass();
            if (bytes.length != 16) {
                throw new IllegalArgumentException("The given array must be 16 bytes long");
            }
            return new W30(scope, xe0_1.mC(bytes, 0), xe0_1.mC(bytes, 8));
        }

        byte[] bytes = ((Inet4Address) address).getAddress();
        if (bytes == null) {
            throw new NullPointerException("The given array is null");
        }
        if (bytes.length != 4) {
            throw new IllegalArgumentException(String.format(
                    "The array has to be 4 bytes long, the given array is %d bytes long",
                    Integer.valueOf(bytes.length)));
        }
        return new pm_1((bytes[0] & 255) << 24 | (bytes[1] & 255) << 16
                | (bytes[2] & 255) << 8 | bytes[3] & 255);
    }

    default pm_1 nw0() {
        throw new UnsupportedOperationException();
    }

    default qb0_1 Hg() {
        throw new UnsupportedOperationException();
    }

    boolean YS();

    int pf0();

    byte[] Mm0();

    default InetAddress ZL0() {
        try {
            return InetAddress.getByAddress(this.Mm0());
        } catch (UnknownHostException exception) {
            throw new RuntimeException(exception);
        }
    }
}
