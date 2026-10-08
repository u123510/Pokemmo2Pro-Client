/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.map;

import f.*;

import f.F9;
import f.J4;
import f.bm0_1;
import f.nC;
import f.tw0_0;
import f.yn_0;

public class TownMapMovementStateManager {
    public static final TownMapMovementStateManager Kf0 = new TownMapMovementStateManager();
    public final F9 Og = yn_0.o8(new bm0_1(5));

    public static TownMapMovementStateManager A7() {
        return Kf0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final synchronized void OA0(byte by, byte by2, byte by3, short s, byte by4, boolean bl, short s2, short s3) {
        nC nC3 = new nC();
        nC3.LpT6 = by;
        nC3.YV = bl;
        nC3.kW = s;
        nC3.Bt = by4;
        nC3.qg = s2;
        nC3.jJ = s3;
        nC3.Lk0 = by2;
        nC3.x20 = by3;
        switch (by) {
            default: {
                break;
            }
            case 2: 
            case 3: 
            case 4: {
                if (!tw0_0.Ll0.cOM4(by)) break;
                nC3.DH = tw0_0.Ll0.AB(by).Sc0(J4.p5(by2, by3));
                break;
            }
            case 0: 
            case 1: {
                int n;
                switch (J4.iA0(by, by2, by3)) {
                    default: {
                        n = 0;
                        break;
                    }
                    case 7995648: {
                        n = -73;
                        break;
                    }
                    case 7930112: {
                        n = -74;
                        break;
                    }
                    case 7536896: 
                    case 7602432: 
                    case 7667968: 
                    case 7733504: 
                    case 0x770100: 
                    case 7864576: {
                        n = -76;
                        break;
                    }
                    case 7471360: {
                        n = -78;
                        break;
                    }
                    case 7209216: 
                    case 7274752: 
                    case 0x700100: 
                    case 0x710100: {
                        n = -79;
                        break;
                    }
                    case 7143680: {
                        n = -80;
                        break;
                    }
                    case 0x600100: 
                    case 0x610100: 
                    case 6422784: 
                    case 6488320: 
                    case 6553856: 
                    case 6619392: 
                    case 0x660100: 
                    case 6750464: 
                    case 6816000: 
                    case 6881536: 
                    case 6947072: 
                    case 7012608: 
                    case 7078144: {
                        n = -81;
                        break;
                    }
                    case 18945: 
                    case 84481: 
                    case 150017: 
                    case 215553: 
                    case 7031297: {
                        n = 63;
                        break;
                    }
                    case 6965761: {
                        n = -46;
                        break;
                    }
                    case 6834689: 
                    case 6900225: {
                        n = -51;
                        break;
                    }
                    case 6703617: 
                    case 6769153: {
                        n = -53;
                        break;
                    }
                    case 6638081: {
                        n = -52;
                        break;
                    }
                    case 6507009: 
                    case 6572545: {
                        n = -54;
                        break;
                    }
                    case 15105: 
                    case 78337: 
                    case 80641: 
                    case 146177: 
                    case 211713: 
                    case 277249: 
                    case 342785: 
                    case 408321: 
                    case 473857: 
                    case 539393: 
                    case 604929: 
                    case 670465: 
                    case 736001: 
                    case 801537: 
                    case 867073: 
                    case 6566401: {
                        n = 8;
                        break;
                    }
                    case 2304: 
                    case 67840: 
                    case 133376: 
                    case 198912: 
                    case 264448: 
                    case 328448: 
                    case 329984: 
                    case 395520: 
                    case 461056: 
                    case 6554368: {
                        n = 93;
                        break;
                    }
                    case 6441473: {
                        n = -47;
                        break;
                    }
                    case 6179329: 
                    case 6244865: 
                    case 6310401: 
                    case 6375937: {
                        n = -57;
                        break;
                    }
                    case 6226176: {
                        n = -114;
                        break;
                    }
                    case 5767424: 
                    case 5832960: 
                    case 5898496: 
                    case 5964032: 
                    case 6029568: 
                    case 6095104: 
                    case 6160640: {
                        n = -116;
                        break;
                    }
                    case 5655041: 
                    case 5720577: 
                    case 5786113: 
                    case 5851649: 
                    case 5917185: 
                    case 5982721: 
                    case 6048257: 
                    case 6113793: {
                        n = -58;
                        break;
                    }
                    case 3951617: 
                    case 4017153: 
                    case 4082689: 
                    case 4148225: 
                    case 4213761: 
                    case 4279297: 
                    case 5786625: {
                        n = -44;
                        break;
                    }
                    case 4344833: 
                    case 4410369: 
                    case 4475905: 
                    case 4541441: 
                    case 4606977: 
                    case 4672513: 
                    case 4738049: 
                    case 4803585: 
                    case 4869121: 
                    case 4934657: 
                    case 5000193: 
                    case 5065729: 
                    case 5131265: 
                    case 5196801: 
                    case 5262337: 
                    case 5327873: 
                    case 5393409: 
                    case 5458945: 
                    case 5524481: 
                    case 5590017: 
                    case 5655553: 
                    case 5721089: {
                        n = -45;
                        break;
                    }
                    case 5439744: 
                    case 5505280: 
                    case 0x550100: 
                    case 5636352: 
                    case 5701888: {
                        n = -117;
                        break;
                    }
                    case 5065217: 
                    case 5130753: 
                    case 5196289: 
                    case 5261825: 
                    case 5327361: 
                    case 5392897: 
                    case 5523969: 
                    case 5589505: {
                        n = 85;
                        break;
                    }
                    case 3033601: 
                    case 3099137: 
                    case 3164673: 
                    case 3230209: 
                    case 3295745: 
                    case 3361281: 
                    case 5458433: {
                        n = 67;
                        break;
                    }
                    case 0x510100: 
                    case 5374208: {
                        n = -118;
                        break;
                    }
                    case 4915456: 
                    case 4980992: 
                    case 5046528: 
                    case 5112064: 
                    case 5177600: 
                    case 0x500100: {
                        n = -119;
                        break;
                    }
                    case 1526273: 
                    case 1591809: 
                    case 1657345: 
                    case 4868609: 
                    case 4934145: 
                    case 4999681: {
                        n = -59;
                        break;
                    }
                    case 4718848: 
                    case 4784384: 
                    case 4849920: {
                        n = -115;
                        break;
                    }
                    case 4803073: {
                        n = 80;
                        break;
                    }
                    case 4672001: 
                    case 4737537: {
                        n = 78;
                        break;
                    }
                    case 4129024: 
                    case 0x400100: 
                    case 0x410100: 
                    case 4325632: 
                    case 4391168: 
                    case 0x440100: 
                    case 4522240: 
                    case 4587776: 
                    case 4653312: {
                        n = -120;
                        break;
                    }
                    case 4540929: 
                    case 4606465: {
                        n = 79;
                        break;
                    }
                    case 4475393: {
                        n = 83;
                        break;
                    }
                    case 4409857: {
                        n = 81;
                        break;
                    }
                    case 3557889: 
                    case 3623425: 
                    case 3688961: 
                    case 3754497: 
                    case 3820033: 
                    case 3885569: 
                    case 3951105: 
                    case 4016641: 
                    case 4082177: 
                    case 4147713: 
                    case 4213249: 
                    case 4278785: 
                    case 4344321: {
                        n = 61;
                        break;
                    }
                    case 4260608: {
                        n = -86;
                        break;
                    }
                    case 10752: 
                    case 0x400300: {
                        n = -87;
                        break;
                    }
                    case 0x3F0300: {
                        n = -88;
                        break;
                    }
                    case 0x3E0300: {
                        n = -89;
                        break;
                    }
                    case 3866880: 
                    case 3932416: 
                    case 3997952: 
                    case 4063488: {
                        n = -121;
                        break;
                    }
                    case 0x3D0300: {
                        n = -90;
                        break;
                    }
                    case 1592065: 
                    case 1657601: 
                    case 1723137: 
                    case 1788673: 
                    case 1854209: 
                    case 1919745: 
                    case 1985281: 
                    case 2050817: 
                    case 2116353: 
                    case 2181889: 
                    case 2247425: 
                    case 2312961: 
                    case 2378497: 
                    case 2444033: 
                    case 2509569: 
                    case 2575105: 
                    case 2706177: 
                    case 2771713: 
                    case 2837249: 
                    case 2902785: 
                    case 2968321: 
                    case 3033857: 
                    case 3099393: 
                    case 3164929: 
                    case 3230465: 
                    case 3296001: 
                    case 3361537: 
                    case 3427073: 
                    case 3492609: 
                    case 3558145: 
                    case 3623681: 
                    case 3689217: 
                    case 3754753: 
                    case 3820289: 
                    case 3885825: 
                    case 3951361: {
                        n = 87;
                        break;
                    }
                    case 10496: 
                    case 76032: 
                    case 0x3C0300: {
                        n = -91;
                        break;
                    }
                    case 3820545: 
                    case 3886081: {
                        n = -56;
                        break;
                    }
                    case 0x3B0300: {
                        n = -92;
                        break;
                    }
                    case 512: 
                    case 0x240200: 
                    case 0x250200: 
                    case 0x260200: 
                    case 0x270200: 
                    case 0x280200: 
                    case 0x290200: 
                    case 0x2A0200: 
                    case 0x2B0200: 
                    case 0x2C0200: 
                    case 0x2D0200: 
                    case 0x2E0200: 
                    case 0x2F0200: 
                    case 0x300200: 
                    case 3211776: 
                    case 0x320200: 
                    case 0x330200: 
                    case 3408384: 
                    case 3473920: 
                    case 3539456: 
                    case 3604992: 
                    case 3867136: {
                        n = -82;
                        break;
                    }
                    case 0x3A0300: {
                        n = -93;
                        break;
                    }
                    case 3670528: 
                    case 3801600: {
                        n = -69;
                        break;
                    }
                    case 3080448: 
                    case 0x300100: 
                    case 0x310100: 
                    case 3277056: 
                    case 0x330100: 
                    case 3408128: 
                    case 3473664: 
                    case 3539200: 
                    case 3604736: 
                    case 3670272: 
                    case 3735808: 
                    case 3801344: {
                        n = -122;
                        break;
                    }
                    case 3689473: 
                    case 3755009: {
                        n = -55;
                        break;
                    }
                    case 0x390300: {
                        n = -94;
                        break;
                    }
                    case 3736064: {
                        n = -61;
                        break;
                    }
                    case 3682817: {
                        n = -49;
                        break;
                    }
                    case 0x380300: {
                        n = -95;
                        break;
                    }
                    case 281601: 
                    case 347137: 
                    case 412673: 
                    case 478209: 
                    case 543745: 
                    case 936961: 
                    case 1002497: 
                    case 1068033: 
                    case 1133569: 
                    case 1199105: 
                    case 1264641: 
                    case 1330177: 
                    case 1395713: 
                    case 1461249: 
                    case 1526785: 
                    case 1592321: 
                    case 1657857: 
                    case 1723393: 
                    case 1788929: 
                    case 1854465: 
                    case 1920001: 
                    case 1985537: 
                    case 2051073: 
                    case 2116609: 
                    case 2182145: 
                    case 2247681: 
                    case 2313217: 
                    case 2378753: 
                    case 2444289: 
                    case 2509825: 
                    case 2575361: 
                    case 2640897: 
                    case 2706433: 
                    case 2771969: 
                    case 2837505: 
                    case 2903041: 
                    case 2968577: 
                    case 3034113: 
                    case 3099649: 
                    case 3165185: 
                    case 3230721: 
                    case 3296257: 
                    case 3361793: 
                    case 3427329: 
                    case 3492865: 
                    case 3558401: 
                    case 3623937: {
                        n = 58;
                        break;
                    }
                    case 3617281: {
                        n = -50;
                        break;
                    }
                    case 0x370300: {
                        n = -96;
                        break;
                    }
                    case 11008: 
                    case 76544: 
                    case 142080: 
                    case 207616: 
                    case 273152: 
                    case 338688: 
                    case 404224: 
                    case 469760: 
                    case 535296: 
                    case 600832: 
                    case 666368: 
                    case 731904: 
                    case 797440: 
                    case 862976: 
                    case 928512: 
                    case 994048: 
                    case 1059584: 
                    case 1125120: 
                    case 1190656: 
                    case 1256192: 
                    case 1321728: 
                    case 1387264: 
                    case 1452800: 
                    case 1518336: 
                    case 1583872: 
                    case 1649408: 
                    case 1714944: 
                    case 1780480: 
                    case 1846016: 
                    case 1911552: 
                    case 1977088: 
                    case 2042624: 
                    case 0x202B00: 
                    case 2173696: 
                    case 0x222B00: 
                    case 2304768: 
                    case 2370304: 
                    case 2435840: 
                    case 3551745: {
                        n = -48;
                        break;
                    }
                    case 9984: 
                    case 0x360300: {
                        n = -97;
                        break;
                    }
                    case 3426817: 
                    case 3492353: {
                        n = 62;
                        break;
                    }
                    case 3486209: {
                        n = 53;
                        break;
                    }
                    case 0x350300: {
                        n = -98;
                        break;
                    }
                    case 3420673: {
                        n = 52;
                        break;
                    }
                    case 0x340300: {
                        n = -99;
                        break;
                    }
                    case 3355137: {
                        n = 51;
                        break;
                    }
                    case 0x330300: {
                        n = -100;
                        break;
                    }
                    case 3289601: {
                        n = 50;
                        break;
                    }
                    case 0x320300: {
                        n = -101;
                        break;
                    }
                    case 3224065: {
                        n = 49;
                        break;
                    }
                    case 9728: 
                    case 0x310300: {
                        n = -102;
                        break;
                    }
                    case 3158529: {
                        n = 48;
                        break;
                    }
                    case 0x300300: {
                        n = -103;
                        break;
                    }
                    case 3092993: {
                        n = 47;
                        break;
                    }
                    case 10240: 
                    case 3080960: {
                        n = -104;
                        break;
                    }
                    case 3027457: {
                        n = 46;
                        break;
                    }
                    case 3015424: {
                        n = -105;
                        break;
                    }
                    case 2752768: 
                    case 2818304: 
                    case 2883840: 
                    case 2949376: 
                    case 3014912: {
                        n = -123;
                        break;
                    }
                    case 2836993: 
                    case 2902529: 
                    case 2968065: {
                        n = 70;
                        break;
                    }
                    case 2961921: {
                        n = 45;
                        break;
                    }
                    case 2949888: {
                        n = -106;
                        break;
                    }
                    case 2896385: {
                        n = 44;
                        break;
                    }
                    case 7680: 
                    case 2884352: {
                        n = 125;
                        break;
                    }
                    case 2830849: {
                        n = 43;
                        break;
                    }
                    case 2818816: {
                        n = 124;
                        break;
                    }
                    case 2443777: 
                    case 2509313: 
                    case 2574849: 
                    case 2640385: 
                    case 2705921: 
                    case 2771457: {
                        n = 72;
                        break;
                    }
                    case 2765313: {
                        n = 42;
                        break;
                    }
                    case 7424: 
                    case 2753280: {
                        n = 123;
                        break;
                    }
                    case 2699777: {
                        n = 41;
                        break;
                    }
                    case 7168: 
                    case 2687744: {
                        n = 122;
                        break;
                    }
                    case 2556160: 
                    case 2621696: 
                    case 2687232: {
                        n = -124;
                        break;
                    }
                    case 2640641: {
                        n = 84;
                        break;
                    }
                    case 2634241: {
                        n = 40;
                        break;
                    }
                    case 2556672: 
                    case 2622208: {
                        n = 121;
                        break;
                    }
                    case 21249: 
                    case 2568705: {
                        n = 39;
                        break;
                    }
                    case 20737: 
                    case 2503169: {
                        n = 38;
                        break;
                    }
                    case 2491136: {
                        n = 120;
                        break;
                    }
                    case 2359552: 
                    case 2425088: 
                    case 2490624: {
                        n = -125;
                        break;
                    }
                    case 2437633: {
                        n = 37;
                        break;
                    }
                    case 6912: 
                    case 2425600: {
                        n = 119;
                        break;
                    }
                    case 1788417: 
                    case 1853953: 
                    case 1919489: 
                    case 1985025: 
                    case 2050561: 
                    case 2116097: 
                    case 2181633: 
                    case 2247169: 
                    case 2312705: 
                    case 2378241: {
                        n = 68;
                        break;
                    }
                    case 18689: 
                    case 2372097: {
                        n = 36;
                        break;
                    }
                    case 6656: 
                    case 72192: 
                    case 2360064: {
                        n = 118;
                        break;
                    }
                    case 2306561: {
                        n = 35;
                        break;
                    }
                    case 0x230300: {
                        n = 117;
                        break;
                    }
                    case 0x230200: {
                        n = -70;
                        break;
                    }
                    case 0x210100: 
                    case 0x220100: 
                    case 2294016: {
                        n = -126;
                        break;
                    }
                    case 20993: 
                    case 86529: 
                    case 152065: 
                    case 2241025: {
                        n = 34;
                        break;
                    }
                    case 6400: 
                    case 71936: 
                    case 137472: 
                    case 0x220300: {
                        n = 116;
                        break;
                    }
                    case 0x220200: {
                        n = -71;
                        break;
                    }
                    case 2175489: {
                        n = 33;
                        break;
                    }
                    case 6144: 
                    case 71680: 
                    case 2163456: {
                        n = 115;
                        break;
                    }
                    case 0x210200: {
                        n = -62;
                        break;
                    }
                    case 18433: 
                    case 2109953: {
                        n = 32;
                        break;
                    }
                    case 0x200300: {
                        n = 114;
                        break;
                    }
                    case 0x200200: {
                        n = -63;
                        break;
                    }
                    case 0x1E0100: 
                    case 0x1F0100: 
                    case 0x200100: {
                        n = -127;
                        break;
                    }
                    case 18177: 
                    case 2044417: {
                        n = 31;
                        break;
                    }
                    case 2032384: {
                        n = 113;
                        break;
                    }
                    case 2032128: {
                        n = -64;
                        break;
                    }
                    case 1978881: {
                        n = 30;
                        break;
                    }
                    case 5888: 
                    case 71424: 
                    case 136960: 
                    case 1966848: {
                        n = 112;
                        break;
                    }
                    case 1966592: {
                        n = -65;
                        break;
                    }
                    case 17921: 
                    case 83457: 
                    case 148993: 
                    case 1913345: {
                        n = 29;
                        break;
                    }
                    case 5632: 
                    case 71168: 
                    case 1901312: {
                        n = 111;
                        break;
                    }
                    case 1901056: {
                        n = -66;
                        break;
                    }
                    case 262400: 
                    case 327936: 
                    case 393472: 
                    case 459008: 
                    case 524544: 
                    case 590080: 
                    case 655616: 
                    case 721152: 
                    case 786688: 
                    case 852224: 
                    case 917760: 
                    case 983296: 
                    case 0x100100: 
                    case 0x110100: 
                    case 0x120100: 
                    case 0x130100: 
                    case 0x140100: 
                    case 0x150100: 
                    case 0x160100: 
                    case 0x170100: 
                    case 0x180100: 
                    case 0x190100: 
                    case 0x1A0100: 
                    case 0x1B0100: 
                    case 0x1C0100: 
                    case 0x1D0100: {
                        n = -128;
                        break;
                    }
                    case 20481: 
                    case 1847809: {
                        n = 28;
                        break;
                    }
                    case 5376: 
                    case 70912: 
                    case 1835776: {
                        n = 110;
                        break;
                    }
                    case 1835520: {
                        n = -67;
                        break;
                    }
                    case 17665: 
                    case 1782273: {
                        n = 27;
                        break;
                    }
                    case 1770240: {
                        n = 109;
                        break;
                    }
                    case 1769984: {
                        n = -68;
                        break;
                    }
                    case 1722881: {
                        n = 69;
                        break;
                    }
                    case 17409: 
                    case 82945: 
                    case 1716737: {
                        n = 26;
                        break;
                    }
                    case 5120: 
                    case 1704704: {
                        n = 108;
                        break;
                    }
                    case 786944: 
                    case 852480: 
                    case 918016: 
                    case 983552: 
                    case 0x100200: 
                    case 0x110200: 
                    case 0x120200: 
                    case 1245696: 
                    case 1311232: 
                    case 1376768: 
                    case 1442304: 
                    case 1507840: 
                    case 1573376: 
                    case 1638912: 
                    case 1704448: {
                        n = -75;
                        break;
                    }
                    case 20225: 
                    case 85761: 
                    case 151297: 
                    case 216833: 
                    case 282369: 
                    case 347905: 
                    case 413441: 
                    case 478977: 
                    case 544513: 
                    case 610049: 
                    case 675585: 
                    case 741121: 
                    case 806657: 
                    case 1651201: {
                        n = 25;
                        break;
                    }
                    case 4864: 
                    case 1639168: {
                        n = 107;
                        break;
                    }
                    case 19969: 
                    case 1585665: {
                        n = 24;
                        break;
                    }
                    case 4608: 
                    case 70144: 
                    case 1573632: {
                        n = 106;
                        break;
                    }
                    case 19201: 
                    case 84737: 
                    case 150273: 
                    case 215809: 
                    case 281345: 
                    case 346881: 
                    case 412417: 
                    case 477953: 
                    case 543489: 
                    case 609025: 
                    case 674561: 
                    case 740097: 
                    case 805633: 
                    case 871169: 
                    case 936705: 
                    case 1002241: 
                    case 1067777: 
                    case 1133313: 
                    case 1198849: 
                    case 1264385: 
                    case 1329921: 
                    case 1395457: 
                    case 1460993: 
                    case 1526529: {
                        n = 86;
                        break;
                    }
                    case 1520129: {
                        n = 23;
                        break;
                    }
                    case 4352: 
                    case 69888: 
                    case 1508096: {
                        n = 105;
                        break;
                    }
                    case 1001985: 
                    case 1067521: 
                    case 1133057: 
                    case 1198593: 
                    case 1264129: 
                    case 1329665: 
                    case 1395201: 
                    case 1460737: {
                        n = 65;
                        break;
                    }
                    case 16129: 
                    case 81665: 
                    case 147201: 
                    case 212737: 
                    case 278273: 
                    case 340481: 
                    case 343809: 
                    case 409345: 
                    case 474881: 
                    case 540417: 
                    case 605953: 
                    case 671489: 
                    case 737025: 
                    case 802561: 
                    case 868097: 
                    case 933633: 
                    case 999169: 
                    case 1064705: 
                    case 1130241: 
                    case 1195777: 
                    case 1261313: 
                    case 1326849: 
                    case 1392385: 
                    case 1457921: {
                        n = 12;
                        break;
                    }
                    case 1454593: {
                        n = 22;
                        break;
                    }
                    case 4096: 
                    case 69632: 
                    case 1442560: {
                        n = 104;
                        break;
                    }
                    case 1389057: {
                        n = 21;
                        break;
                    }
                    case 1377024: {
                        n = 103;
                        break;
                    }
                    case 1323521: {
                        n = 20;
                        break;
                    }
                    case 3840: 
                    case 69376: 
                    case 134912: 
                    case 200448: 
                    case 1311488: {
                        n = 102;
                        break;
                    }
                    case 17153: 
                    case 19713: 
                    case 82689: 
                    case 85249: 
                    case 1257985: {
                        n = 19;
                        break;
                    }
                    case 2560: 
                    case 68096: 
                    case 133632: 
                    case 199168: 
                    case 264704: 
                    case 330240: 
                    case 393984: 
                    case 395776: 
                    case 461312: 
                    case 526848: 
                    case 592384: 
                    case 657920: 
                    case 723456: 
                    case 788992: 
                    case 854528: 
                    case 920064: 
                    case 985600: 
                    case 0x100A00: 
                    case 0x110A00: 
                    case 1182208: 
                    case 1247744: {
                        n = 94;
                        break;
                    }
                    case 0x130300: {
                        n = 101;
                        break;
                    }
                    case 1192449: {
                        n = 18;
                        break;
                    }
                    case 9472: 
                    case 75008: 
                    case 140544: 
                    case 206080: 
                    case 271616: 
                    case 1180416: {
                        n = -107;
                        break;
                    }
                    case 1126913: {
                        n = 17;
                        break;
                    }
                    case 7936: 
                    case 73472: 
                    case 139008: 
                    case 204544: 
                    case 270080: 
                    case 335616: 
                    case 401152: 
                    case 0x110300: {
                        n = -108;
                        break;
                    }
                    case 15617: 
                    case 81153: 
                    case 146689: 
                    case 209409: 
                    case 212225: 
                    case 277761: 
                    case 343297: 
                    case 408833: 
                    case 474369: 
                    case 539905: 
                    case 605441: 
                    case 670977: 
                    case 736513: 
                    case 802049: 
                    case 867585: 
                    case 933121: 
                    case 998657: 
                    case 1064193: {
                        n = 10;
                        break;
                    }
                    case 1061377: {
                        n = 16;
                        break;
                    }
                    case 9216: 
                    case 74752: 
                    case 140288: 
                    case 205824: 
                    case 271360: 
                    case 0x100300: {
                        n = -109;
                        break;
                    }
                    case 14593: 
                    case 80129: 
                    case 145665: 
                    case 211201: 
                    case 276737: 
                    case 342273: 
                    case 407809: 
                    case 995841: {
                        n = 6;
                        break;
                    }
                    case 8960: 
                    case 74496: 
                    case 140032: 
                    case 205568: 
                    case 271104: 
                    case 336640: 
                    case 402176: 
                    case 467712: 
                    case 983808: {
                        n = -110;
                        break;
                    }
                    case 936449: {
                        n = 74;
                        break;
                    }
                    case 16897: 
                    case 82433: 
                    case 147969: 
                    case 213505: 
                    case 279041: 
                    case 344577: 
                    case 410113: 
                    case 475649: 
                    case 537089: 
                    case 541185: 
                    case 606721: 
                    case 672257: 
                    case 737793: 
                    case 803329: 
                    case 868865: 
                    case 934401: {
                        n = 15;
                        break;
                    }
                    case 16641: 
                    case 82177: 
                    case 147713: 
                    case 213249: 
                    case 278785: 
                    case 344321: 
                    case 409857: 
                    case 471553: 
                    case 475393: 
                    case 540929: 
                    case 606465: 
                    case 672001: 
                    case 737537: 
                    case 803073: 
                    case 868609: 
                    case 934145: {
                        n = 14;
                        break;
                    }
                    case 14337: 
                    case 79873: 
                    case 145409: 
                    case 210945: 
                    case 276481: 
                    case 342017: 
                    case 407553: 
                    case 473089: 
                    case 538625: 
                    case 930305: {
                        n = 5;
                        break;
                    }
                    case 8704: 
                    case 74240: 
                    case 139776: 
                    case 205312: 
                    case 270848: 
                    case 336384: 
                    case 401920: 
                    case 467456: 
                    case 918272: {
                        n = -111;
                        break;
                    }
                    case 19457: 
                    case 84993: 
                    case 150529: 
                    case 216065: 
                    case 740353: 
                    case 805889: 
                    case 871425: {
                        n = 57;
                        break;
                    }
                    case 870913: {
                        n = 76;
                        break;
                    }
                    case 14081: 
                    case 79617: 
                    case 145153: 
                    case 210689: 
                    case 276225: 
                    case 341761: 
                    case 407297: 
                    case 472833: 
                    case 864769: {
                        n = 4;
                        break;
                    }
                    case 8448: 
                    case 73984: 
                    case 139520: 
                    case 205056: 
                    case 270592: 
                    case 852736: {
                        n = -112;
                        break;
                    }
                    case 83201: 
                    case 805377: {
                        n = 56;
                        break;
                    }
                    case 16385: 
                    case 81921: 
                    case 147457: 
                    case 212993: 
                    case 278529: 
                    case 344065: 
                    case 406017: 
                    case 409601: 
                    case 475137: 
                    case 540673: 
                    case 606209: 
                    case 671745: 
                    case 737281: 
                    case 802817: {
                        n = 13;
                        break;
                    }
                    case 13825: 
                    case 79361: 
                    case 144897: 
                    case 210433: 
                    case 275969: 
                    case 341505: 
                    case 407041: 
                    case 799233: {
                        n = 3;
                        break;
                    }
                    case 8192: 
                    case 73728: 
                    case 139264: 
                    case 204800: 
                    case 270336: 
                    case 787200: {
                        n = -113;
                        break;
                    }
                    case 739841: {
                        n = 59;
                        break;
                    }
                    case 13569: 
                    case 79105: 
                    case 144641: 
                    case 210177: 
                    case 275713: 
                    case 341249: 
                    case 733697: {
                        n = 2;
                        break;
                    }
                    case 3584: 
                    case 69120: 
                    case 134656: 
                    case 200192: 
                    case 265728: 
                    case 331264: 
                    case 396800: 
                    case 462336: 
                    case 527872: 
                    case 593408: 
                    case 656128: 
                    case 721664: {
                        n = 98;
                        break;
                    }
                    case 25344: 
                    case 66048: 
                    case 90880: 
                    case 131584: 
                    case 197120: 
                    case 262656: 
                    case 328192: 
                    case 393728: 
                    case 459264: 
                    case 524800: 
                    case 590336: 
                    case 615168: 
                    case 655872: 
                    case 721408: {
                        n = -77;
                        break;
                    }
                    case 609281: 
                    case 674817: {
                        n = 73;
                        break;
                    }
                    case 477697: 
                    case 543233: 
                    case 608769: 
                    case 674305: {
                        n = 55;
                        break;
                    }
                    case 13313: 
                    case 78849: 
                    case 144385: 
                    case 209921: 
                    case 275457: 
                    case 668161: {
                        n = 1;
                        break;
                    }
                    case 15873: 
                    case 81409: 
                    case 146945: 
                    case 212481: 
                    case 274945: 
                    case 278017: 
                    case 343553: 
                    case 409089: 
                    case 474625: 
                    case 540161: 
                    case 605697: {
                        n = 11;
                        break;
                    }
                    case 2816: 
                    case 68352: 
                    case 133888: 
                    case 199424: 
                    case 264960: 
                    case 330496: 
                    case 396032: 
                    case 459520: 
                    case 461568: 
                    case 527104: 
                    case 592640: {
                        n = 95;
                        break;
                    }
                    case 1792: 
                    case 67328: 
                    case 132864: 
                    case 197376: 
                    case 198400: 
                    case 263936: 
                    case 329472: 
                    case 395008: 
                    case 460544: 
                    case 526080: 
                    case 591616: {
                        n = 91;
                        break;
                    }
                    case 3328: 
                    case 68864: 
                    case 590592: {
                        n = 97;
                        break;
                    }
                    case 3072: 
                    case 68608: 
                    case 134144: 
                    case 199680: 
                    case 265216: 
                    case 330752: 
                    case 396288: 
                    case 461824: 
                    case 525056: {
                        n = 96;
                        break;
                    }
                    case 15361: 
                    case 80897: 
                    case 143873: 
                    case 146433: 
                    case 211969: 
                    case 277505: 
                    case 343041: 
                    case 408577: 
                    case 474113: {
                        n = 9;
                        break;
                    }
                    case 1536: 
                    case 67072: 
                    case 131840: 
                    case 132608: 
                    case 198144: 
                    case 263680: 
                    case 329216: 
                    case 394752: 
                    case 460288: {
                        n = 90;
                        break;
                    }
                    case 412161: {
                        n = 82;
                        break;
                    }
                    case 12801: 
                    case 14849: 
                    case 80385: 
                    case 145921: 
                    case 211457: 
                    case 276993: 
                    case 342529: 
                    case 408065: {
                        n = 7;
                        break;
                    }
                    case 346625: {
                        n = 54;
                        break;
                    }
                    case 2048: 
                    case 67584: 
                    case 133120: 
                    case 198656: 
                    case 262912: 
                    case 264192: 
                    case 329728: {
                        n = 92;
                        break;
                    }
                    case 1280: 
                    case 66304: 
                    case 66816: 
                    case 132352: 
                    case 197888: 
                    case 263424: 
                    case 328960: {
                        n = 89;
                        break;
                    }
                    case 281089: {
                        n = 60;
                        break;
                    }
                    case 0: 
                    case 65536: 
                    case 131072: 
                    case 196608: 
                    case 262144: {
                        n = -60;
                        break;
                    }
                    case 768: 
                    case 1024: 
                    case 66560: 
                    case 132096: 
                    case 197632: {
                        n = 88;
                        break;
                    }
                    case 65792: 
                    case 131328: 
                    case 196864: {
                        n = 127;
                        break;
                    }
                    case 256: {
                        n = 126;
                    }
                }
                by2 = (byte)n;
                nC3.an = by2;
            }
        }
        this.Og.gE0(by, nC3);
    }

    public final synchronized nC nUl(byte by) {
        return (nC)this.Og.BM(by);
    }
}

