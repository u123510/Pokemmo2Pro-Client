package cn.pokemmo.constant.enums;

import f.*;

import f.ineter.BI;

public enum IpAddressType {
    LOOPBACK(BI.kF("127.0.0.0/8")),
    UNSPECIFIED(BI.kF("0.0.0.0/8")),
    PRIVATE_10(BI.kF("10.0.0.0/8")),
    PRIVATE_172_16(BI.kF("172.16.0.0/12")),
    PRIVATE_192_168(BI.kF("192.168.0.0/16")),
    TESTING(BI.kF("198.18.0.0/15")),
    TRANSLATION_6_TO_4(BI.kF("192.88.99.0/24")),
    LINK_LOCAL(BI.kF("169.254.0.0/16")),
    SPECIAL_PURPOSE(BI.kF("192.0.0.0/24")),
    TEST_NET1(BI.kF("192.0.2.0/24")),
    TEST_NET2(BI.kF("198.51.100.0/24")),
    TEST_NET3(BI.kF("203.0.113.0/24")),
    MULTICAST(BI.kF("224.0.0.0/4")),
    CGNAT(BI.kF("100.64.0.0/10")),
    RESERVED_240(BI.kF("240.0.0.0/4")),
    BROADCAST(BI.kF("255.255.255.255/32"));

    public static final IpAddressType Aq0 = UNSPECIFIED;
    public final wv_0 Iv;

    IpAddressType(BI value) {
        this.Iv = value;
    }

    public f.r80 toLegacy() {
        return f.r80.valueOf(name());
    }
}