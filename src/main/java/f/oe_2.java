package f;

import cn.pokemmo.constant.enums.Ipv6AddressType;

import f.ineter.ny_1;

/** IPv6 prefix categories used by the network address matcher. */
public enum oe_2 {
    UNSPECIFIED("::/128"),
    LOOPBACK("::1/128"),
    DISCARD("100::/64"),
    ORCHID("2001:10::/28"),
    ORCHID_2("2001:20::/28"),
    DOCUMENTATION("2001:db8::/32"),
    IPV4_COMPATIBLE_IPV6_DEPRECATED("::/96"),
    IPV4_MAPPED_IPV6("::ffff:0:0/96"),
    IPV4_IPV6_TRANSLATION_WELL_KNOWN("64:ff9b::/96"),
    TRANSLATION_6_TO_4("2002::/16"),
    TEREDO("2001::/32"),
    ULA("fc00::/7"),
    MULTICAST("ff00::/8"),
    GLOBAL_MULTICAST("ff0e::/16"),
    SITE_LOCAL_MULTICAST("ff05::/16"),
    LINK_LOCAL_MULTICAST("ff02::/16"),
    INTERFACE_LOCAL_MULTICAST("ff01::/16"),
    GLOBAL_UNICAST("2000::/3"),
    LINK_LOCAL_UNICAST("fe80::/10"),
    SITE_LOCAL_UNICAST_DEPRECATED("fec::/10");

    /** Obfuscated alias of the first enum value retained by the original class. */
    public static final oe_2 Ie0 = UNSPECIFIED;
    public static final oe_2[] yW = values();
    public final zm0_0 RG0;

    oe_2(String prefix) {
        this.RG0 = ny_1.va(prefix);
    }

    public Ipv6AddressType asModern() {
        return Ipv6AddressType.valueOf(name());
    }
}