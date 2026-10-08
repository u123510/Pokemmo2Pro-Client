package cn.pokemmo.item;

import f.*;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 时装外观道具定义与槽位注册中心 (VanityItemDefinitionRegistry)
 *
 * <p>核心职责：
 * <ul>
 *   <li>向 ItemDatabase 批量注册时装/外观装扮道具动作描述符（vK0）；</li>
 *   <li>关联外观道具图标与物品槽位纹理（rn0）；</li>
 *   <li>校验时装图层装配规则（bu0）；</li>
 *   <li>计算玩家可用时装槽位剩余容量（mo0, W20）。</li>
 * </ul>
 *
 * <p>原始混淆类：{@link f.b1}
 */
public abstract class VanityItemDefinitionRegistry {
    protected static mc0_1 action(int id, int group, int texture, int region, int flags, l5_0 layer) {
        return new mc0_1((short)id, (short)group, texture, region, (short)flags, layer);
    }
    protected VanityItemDefinitionRegistry() {
    }


    /*
     * WARNING - void declaration
     */
    public static void vK0() {
        yj_2 yj_22;
        mc0_1 mc0_12;
        int n;
        short s;
        Object object;
        short s3;
        mc0_1 mc0_13;
        mc0_1 mc0_14;
        l5_0 l5_02;
        mc0_1 mc0_15;
        mc0_1 mc0_16;
        mc0_1 mc0_17;
        mc0_1 mc0_18;
        mc0_1 mc0_19;
        mc0_1 mc0_110;
        mc0_1 mc0_111;
        mc0_1 mc0_112;
        l5_0 l5_03 = l5_0.B9;
        gu0.Az0().on0(action(1000, 1000, 100000, 100001, 0, l5_03));
        gu0.Az0().on0(action(1040, 1040, 101652, 101653, 0, l5_03));
        gu0.Az0().on0(action(1001, 1001, 100002, 100003, 0, l5_03));
        gu0.Az0().on0(action(1003, 1003, 100009, 100010, 0, l5_03));
        gu0.Az0().on0(action(1004, 1001, 100011, 100012, 0, l5_03));
        gu0.Az0().on0(action(1190, 1190, 4010, 4011, 0, l5_03));
        gu0.Az0().on0(action(1191, 1191, 4012, 4013, 0, l5_03));
        gu0.Az0().on0(action(1192, 1192, 4014, 4015, 0, l5_03));
        gu0.Az0().on0(action(1025, 1025, 4000, 4001, 0, l5_03));
        gu0.Az0().on0(action(1026, 1026, 4002, 4003, 0, l5_03));
        gu0.Az0().on0(action(1027, 1027, 4004, 4005, 0, l5_03));
        gu0.Az0().on0(action(1103, 1103, 101106, 101107, 0, l5_03));
        mc0_1 object2 = action(1120, 1120, 4008, 4009, 0, l5_03);
        object2.nO(VanityItemDefinitionRegistry::W20, () -> String.valueOf(20));
        gu0.Az0().on0(object2);
        mc0_1 object4 = action(1194, 1194, 4016, 4017, 0, l5_03);
        object4.nO(VanityItemDefinitionRegistry::mo0, () -> String.valueOf(8));
        gu0.Az0().on0(object4);
        mc0_1 s2 = action(1041, 1041, 101654, 101655, 0, l5_03);
        j30_0 object3 = j30_0.Z;
        s2.mq0(object3);
        gu0.Az0().on0(s2);
        mc0_1 mc0_1Array2 = action(1042, 1042, 101656, 101657, 0, l5_03);
        mc0_1Array2.mq0(object3);
        gu0.Az0().on0(mc0_1Array2);
        mc0_1 by2 = action(1043, 1043, 101658, 101659, 0, l5_03);
        by2.mq0(object3);
        gu0.Az0().on0(by2);
        mc0_1 n19 = action(1044, 1044, 101660, 101661, 0, l5_03);
        object3 = j30_0.th0;
        n19.mq0(object3);
        gu0.Az0().on0(n19);
        mc0_1 n21 = action(1045, 1045, 101662, 101663, 0, l5_03);
        n21.mq0(object3);
        gu0.Az0().on0(n21);
        mc0_1 object7 = action(1046, 1046, 101664, 101665, 0, l5_03);
        object7.mq0(object3);
        gu0.Az0().on0(object7);
        int n2 = 1050;
        while (n2 <= 1065) {
            int n3 = n2;
            int n4 = n2;
            mc0_1 mc0_113 = action(n4, n2, n4 + 100000, 101049, -1, l5_0.B9);
            int n5 = (n2 - 1050) * 3;
            mc0_113.fA0((byte)n2, (byte)(n5 + 2));
            gu0.Az0().on0(mc0_113);
            n2 = (short)(n3 + 1);
        }
        n2 = 0;
        while (true) {
            short[] sArray = n70_0.NG;
            if (n2 >= 14) break;
            short s4 = sArray[n2];
            int n6 = n2 * 2;
            int n7 = n6 + 101300;
            int n8 = n6 + 101301;
            l5_02 = l5_0.B9;
            gu0.Az0().on0(action(s4, s4, n7, n8, 0, l5_02));
            ++n2;
        }
        l5_0 l5_04 = l5_0.B9;
        gu0.Az0().on0(action(1199, 1199, 101339, 101340, 0, l5_04));
        gu0.Az0().on0(action(1002, 1002, 100007, 100008, 0, l5_04));
        l5_0 l5_05 = l5_0.xC;
        gu0.Az0().on0(action(1018, 1018, 100031, 100032, 30000, l5_05));
        gu0.Az0().on0(action(1193, 1193, 101130, 101131, 1000, l5_04));
        gu0.Az0().on0(action(1270, 1270, 101114, 101115, 0, l5_04));
        gu0.Az0().on0(action(1100, 1100, 101099, 101101, 0, l5_04));
        gu0.Az0().on0(action(1272, 1309, 101136, 101137, 0, l5_04));
        gu0.Az0().on0(action(1273, 1309, 101138, 101139, 0, l5_04));
        gu0.Az0().on0(action(1274, 1100, 101100, 101101, 0, l5_04));
        gu0.Az0().on0(action(1275, 1309, 101140, 101141, 0, l5_04));
        gu0.Az0().on0(action(1293, 1293, 101164, 101167, 0, l5_04));
        gu0.Az0().on0(action(1294, 1294, 101165, 101167, 0, l5_04));
        gu0.Az0().on0(action(1295, 1295, 101166, 101167, 0, l5_04));
        gu0.Az0().on0(action(1296, 1296, 101168, 101169, 0, l5_04));
        gu0.Az0().on0(action(1422, 1422, 101176, 101177, 0, l5_04));
        gu0.Az0().on0(action(1474, 1474, 101707, 101708, 0, l5_04));
        gu0.Az0().on0(action(1482, 1482, 101724, 101725, 0, l5_04));
        gu0.Az0().on0(action(1499, 1499, 101756, 101757, 0, l5_04));
        gu0.Az0().on0(action(1483, 1483, 101726, 101727, 0, l5_04));
        gu0.Az0().on0(action(1484, 1003, 101728, 101729, 0, l5_04));
        gu0.Az0().on0(action(1488, 1488, 101734, 101735, 0, l5_04));
        gu0.Az0().on0(action(1489, 1489, 101736, 101737, 0, l5_04));
        gu0.Az0().on0(action(1490, 1490, 101738, 101739, 0, l5_04));
        gu0.Az0().on0(action(1571, 1571, 101760, 101761, 0, l5_04));
        gu0.Az0().on0(action(1570, 1570, 101758, 101759, 0, l5_04));
        gu0.Az0().on0(action(1497, 1497, 101752, 101753, 0, l5_04));
        gu0.Az0().on0(action(1572, 1572, 101762, 101763, 0, l5_04));
        gu0.Az0().on0(action(1573, 1573, 101764, 101765, 0, l5_04));
        mc0_1 mc0_115 = action(1475, 1475, 101709, 101710, 0, l5_04);
        mc0_115.mq0(j30_0.ee0);
        gu0.Az0().on0(mc0_115);
        mc0_1 mc0_116 = action(1423, 1423, 101178, 101179, 0, l5_04);
        mc0_116.gc((a, b) -> b1.bu0((vk0_1)a, (yw_0)b));
        gu0.Az0().on0(mc0_116);
        gu0.Az0().on0(action(1426, 1426, 101180, 101181, 0, l5_04));
        gu0.Az0().on0(action(1506, 1506, 101192, 101193, 0, l5_04));
        gu0.Az0().on0(action(1507, 1507, 101194, 101195, 0, l5_04));
        gu0.Az0().on0(action(1508, 1508, 101196, 101197, 0, l5_04));
        gu0.Az0().on0(action(1509, 1509, 101198, 101199, 0, l5_04));
        gu0.Az0().on0(action(1510, 1510, 101226, 101227, 0, l5_04));
        gu0.Az0().on0(action(1511, 1511, 101228, 101229, 0, l5_04));
        gu0.Az0().on0(action(1512, 1512, 101230, 101231, 0, l5_04));
        gu0.Az0().on0(action(1513, 1513, 101232, 101233, 0, l5_04));
        gu0.Az0().on0(action(1514, 1514, 101234, 101235, 0, l5_04));
        gu0.Az0().on0(action(1515, 1515, 101236, 101237, 0, l5_04));
        gu0.Az0().on0(action(1516, 1516, 101238, 101239, 0, l5_04));
        gu0.Az0().on0(action(1517, 1517, 101240, 101241, 0, l5_04));
        gu0.Az0().on0(action(1518, 1518, 101242, 101243, 0, l5_04));
        gu0.Az0().on0(action(1519, 1519, 101244, 101245, 0, l5_04));
        gu0.Az0().on0(action(1520, 1520, 101246, 101247, 0, l5_04));
        gu0.Az0().on0(action(1521, 1521, 101248, 101249, 0, l5_04));
        gu0.Az0().on0(action(1522, 1522, 101250, 101251, 0, l5_04));
        gu0.Az0().on0(action(1523, 1523, 101784, 101785, 0, l5_04));
        gu0.Az0().on0(action(1524, 1524, 101786, 101787, 0, l5_04));
        for (s3 = 1400; s3 <= 1414; s3 = (short)(s3 + 1)) {
            mc0_1 current = null;
            if (s3 >= 1412) {
                current = action(s3, 1412, s3 + 100000, 101129, 0, l5_0.B9);
            } else if (s3 >= 1409) {
                current = action(s3, 1409, s3 + 100000, 101127, 0, l5_0.B9);
            } else if (s3 >= 1406) {
                current = action(s3, 1406, s3 + 100000, 101125, 0, l5_0.B9);
            } else if (s3 >= 1403) {
                current = action(s3, 1403, s3 + 100000, 101123, 0, l5_0.B9);
            } else {
                current = action(s3, 1400, s3 + 100000, 101121, 0, l5_0.B9);
            }
            gu0.Az0().on0(current);
        }
        s3 = 1447;
        for (int index = 0; index < rz_0.lpT5.length; ++index) {
            short s5 = (short)(s3 + index);
            l5_0 l5_07 = l5_0.B9;
            gu0.Az0().on0(action(s5, s5, 0, 101706, 0, l5_07));
        }
        l5_0 l5_07 = l5_0.B9;
        gu0.Az0().on0(action(1415, 1415, 101415, 101420, 0, l5_07));
        gu0.Az0().on0(action(1416, 1416, 101416, 101420, 0, l5_07));
        gu0.Az0().on0(action(1417, 1417, 101417, 101420, 0, l5_07));
        gu0.Az0().on0(action(1418, 1418, 101418, 101420, 0, l5_07));
        gu0.Az0().on0(action(1419, 1419, 101419, 101420, 0, l5_07));
        for (int j = 0; j < 6; ++j) {
            short s6 = (short)(j + 1005);
            int n14 = j * 2;
            int n15 = n14 + 100015;
            int n16 = n14 + 100016;
            l5_02 = l5_0.B9;
            gu0.Az0().on0(action(s6, s6, n15, n16, 15000, l5_02));
        }
        Object object5 = gu0.Az0().lPT6((short)5017);
        mc0_1[] mc0_1Array = new mc0_1[3];
        mc0_1[] mc0_1Array3 = mc0_1Array;
        mc0_1Array[0] = gu0.Az0().lPT6((short)5026);
        mc0_1Array[1] = gu0.Az0().lPT6((short)5025);
        mc0_1Array[2] = gu0.Az0().lPT6((short)5024);
        gc_2[] categories = gc_2.ME;
        int n17 = categories.length;
        for (int j = 0; j < n17; ++j) {
            gc_2 gc_22 = categories[j];
            if (gc_22.Yt0()) continue;
            short s7 = (short)(gc_22.FZ() + 5045);
            if (gc_22 == gc_2.lL0) {
                s7 = (short)(s7 + 2);
            }
            for (int k = 0; k < 3; ++k) {
                short s8 = (short)(gc_22.FZ() * 3 + 1250 + k);
                mc0_1 mc0_127 = gu0.Az0().lPT6(s7);
                mc0_1 mc0_128 = mc0_127.dm(s8);
                mc0_128.gd0(s8 + 240000);
                gu0.Az0().on0(mc0_128);
                sm0_0.kE0(mc0_128.GL0(), mc0_1Array3[k].getName().replaceAll("(?i)" + Pattern.quote(((mc0_1)object5).getName()), Matcher.quoteReplacement(mc0_127.getName())));
            }
        }
        object5 = l5_0.oj0;
        gu0.Az0().on0(action(1119, 5034, 101112, 101113, 0, (l5_0)((Object)object5)));
        gu0.Az0().on0(action(1028, 1028, 100045, 100046, 0, (l5_0)((Object)object5)));
        gu0.Az0().on0(action(1029, 1029, 100047, 100048, 0, (l5_0)((Object)object5)));
        for (short s7 = 1030; s7 <= 1039; s7 = (short)(s7 + 1)) {
            int n18 = s7 - 1030;
            int n20 = n18 * 2;
            int n22 = n20 + 100049;
            n17 = n20 + 100050;
            l5_0 l5_08 = l5_0.oj0;
            mc0_1 mc0_129 = action(s7, s7, n22, n17, 0, l5_08);
            byte by = (byte)(n18 / 2);
            n17 = (byte)(n18 % 2 == 0 ? 5 : 10);
            mc0_129.ga(by, (byte)n17);
            gu0.Az0().on0(mc0_129);
        }
        aa0_2 aa0_22 = tw0_0.Ll0;
        if (aa0_22 != null && aa0_22.cOM4((byte)1)) {
            s = 1106;
            while (s <= 1118) {
                short s10 = s;
                int n23 = s10 - 1106;
                int n24 = n23 * 2;
                int n25 = n24 + 101200;
                n17 = n24 + 101201;
                l5_0 l5_09 = l5_0.oj0;
                mc0_1 mc0_130 = action(s, s, n25, n17, 0, l5_09);
                gu0.Az0().on0(mc0_130);
                s = (short)(s10 + 1);
            }
        } else {
            for (s = 1106; s <= 1118; s = (short)(s + 1)) {
                l5_0 l5_010;
                mc0_1 mc0_131 = gu0.Az0().lPT6(s);
                mc0_131.Yt0 = l5_010 = l5_0.oj0;
                mc0_131.Yw = l5_010.EF;
            }
        }
        q10_0[] groups = q10_0.Pn0;
        int n26 = groups.length;
        for (n = 0; n < n26; ++n) {
            Iterator iterator = groups[n].Lu().To().iterator();
            while (iterator.hasNext()) {
                mc0_1 mc0_132;
                X90 x90 = (X90)((V3)iterator).next();
                if (x90.KE0() < 1) continue;
                short s11 = -1;
                int n27 = x90.SG.iL * 1000 + 20000 + (x90.ax & 0xFFFF);
                l5_0 l5_010 = l5_0.Hj;
                mc0_132 = action(x90.KE0(), s11, n27, 19999, 0, l5_010);
                mc0_132.Zx0(x90);
                mc0_132.o90();
                gu0.Az0().on0(mc0_132);
            }
        }
        l5_0 object6 = l5_0.xC;
        gu0.Az0().on0(action(1019, 1019, 100033, 100034, 0, object6));
        object6 = l5_0.B9;
        gu0.Az0().on0(action(1021, 1019, 100037, 100038, 0, object6));
        gu0.Az0().on0(action(1129, 1129, 100080, 100081, 0, object6));
        gu0.Az0().on0(action(1236, 1236, 101603, 101608, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1237, 1237, 101604, 101609, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1238, 1238, 101605, 101610, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1239, 1239, 101606, 101611, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1240, 1240, 101607, 101612, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1491, 1491, 101740, 101741, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1492, 1492, 101742, 101743, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1020, 1020, 100069, 100036, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1122, 1020, 100077, 100070, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1127, 1020, 101600, 100078, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1128, 1128, 101602, 100078, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1234, 1020, 101629, 101601, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1235, 1128, 101630, 101601, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1276, 1020, 101638, 101631, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1277, 1128, 101639, 101631, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1285, 1020, 101649, 101640, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1286, 1128, 101650, 101640, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1424, 1020, 101711, 101651, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1425, 1128, 101712, 101651, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1476, 1020, 101766, 101713, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1477, 1128, 101767, 101713, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1574, 1020, 100035, 101768, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1575, 1128, 100079, 101768, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1493, 1493, 101744, 101745, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1494, 1494, 101746, 101747, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1495, 1495, 101748, 101749, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1496, 1496, 101750, 101751, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1124, 1124, 100073, 100074, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1023, 1023, 100041, 100042, 0, (l5_0)((Object)object6)));
        mc0_1 mc0_133 = action(1022, 1022, 100039, 100040, 0, object6);
        mc0_133.o90();
        gu0.Az0().on0(mc0_133);
        gu0.Az0().on0(action(1024, 1024, 100071, 100044, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1123, 1024, 100075, 100072, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1126, 1024, 100082, 100076, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1130, 1024, 101144, 100083, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1131, 1131, 101145, 100083, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1278, 1024, 101158, 101146, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1279, 1131, 101157, 101146, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1289, 1024, 101183, 101159, 0, (l5_0)((Object)object6)));
        gu0.Az0().on0(action(1290, 1131, 101184, 101159, 0, (l5_0)((Object)object6)));
        for (short s11 = 1500; s11 <= 1505; s11 = (short)(s11 + 1)) {
            mc0_1 current = (s11 % 2 == 0)
                    ? action(s11, 1500, s11 + 100000, 101117, 0, l5_0.B9)
                    : action(s11, 1501, s11 + 100000, 101119, 0, l5_0.B9);
            gu0.Az0().on0(current);
        }
        l5_0 l5_014 = l5_0.B9;
        gu0.Az0().on0(action(1287, 1287, 101641, 101642, 0, l5_014));
        gu0.Az0().on0(action(1288, 1288, 101643, 101644, 0, l5_014));
        gu0.Az0().on0(action(1534, 1534, 101645, 101646, 0, l5_014));
        gu0.Az0().on0(action(1535, 5533, 101647, 101648, 0, l5_014));
        gu0.Az0().on0(action(1536, 1501, 101666, 101667, 0, l5_014));
        gu0.Az0().on0(action(1431, 1024, 101253, 101182, 0, l5_014));
        gu0.Az0().on0(action(1432, 1131, 101254, 101182, 0, l5_014));
        gu0.Az0().on0(action(1427, 1427, 101668, 101669, 0, l5_014));
        gu0.Az0().on0(action(1428, 1428, 101672, 101673, 0, l5_014));
        gu0.Az0().on0(action(1429, 1429, 101674, 101675, 0, l5_014));
        gu0.Az0().on0(action(1430, 1430, 101676, 101677, 0, l5_014));
        gu0.Az0().on0(action(1478, 1427, 101714, 101715, 0, l5_014));
        gu0.Az0().on0(action(1479, 1428, 101716, 101717, 0, l5_014));
        gu0.Az0().on0(action(1480, 1429, 101718, 101719, 0, l5_014));
        gu0.Az0().on0(action(1481, 1430, 101720, 101721, 0, l5_014));
        gu0.Az0().on0(action(1485, 1485, 101783, 101731, 0, l5_014));
        gu0.Az0().on0(action(1498, 1498, 101754, 101755, 0, l5_014));
        gu0.Az0().on0(action(1576, 1427, 101769, 101770, 0, l5_014));
        gu0.Az0().on0(action(1577, 1428, 101771, 101772, 0, l5_014));
        gu0.Az0().on0(action(1578, 1429, 101773, 101774, 0, l5_014));
        gu0.Az0().on0(action(1584, 1485, 101730, 101782, 0, l5_014));
        gu0.Az0().on0(action(1579, 1579, 101776, 101777, 0, l5_014));
        gu0.Az0().on0(action(1581, 1581, 101780, 101781, 0, l5_014));
        gu0.Az0().on0(action(1580, 1580, 101778, 101779, 0, l5_014));
        gu0.Az0().on0(action(1582, 1024, 100043, 101252, 0, l5_014));
        gu0.Az0().on0(action(1583, 1131, 100084, 101252, 0, l5_014));
        l5_0 l5_013 = l5_0.Jy;
        gu0.Az0().on0(action(1540, 5465, 7, -1, 0, l5_013));
        gu0.Az0().on0(action(1541, 5465, 13, -1, 0, l5_013));
        gu0.Az0().on0(action(1537, 1124, 101670, 101671, 0, l5_014));
        gu0.Az0().on0(action(1538, 1538, 101722, 101723, 0, l5_014));
        gu0.Az0().on0(action(1539, 1539, 101732, 101733, 0, l5_014));
        yj_2 yj_23 = new yj_2((short)1000, true);
        yj_23.Lh0();
        yj_23.h4();
        yj_23.bz0();
        yj_23.N5();
        QO.YL0().kd(yj_23);
        gu0.Az0().on0(action(1225, 1225, 100085, 100086, 0, l5_014));
        gu0.Az0().on0(action(1226, 1226, 100087, 100088, 0, l5_014));
        gu0.Az0().on0(action(1227, 1227, 100089, 100093, 0, l5_014));
        gu0.Az0().on0(action(1228, 1228, 100090, 100093, 0, l5_014));
        gu0.Az0().on0(action(1229, 1229, 100091, 100093, 0, l5_014));
        gu0.Az0().on0(action(1230, 1230, 100092, 100093, 0, l5_014));
        gu0.Az0().on0(action(1231, 1231, 100094, 100095, 0, l5_014));
        gu0.Az0().on0(action(1232, 1232, 100096, 100097, 0, l5_014));
        gu0.Az0().on0(action(1233, 1233, 100098, 100099, 0, l5_014));
        gu0.Az0().on0(action(1241, 1225, 101153, 101133, 0, l5_014));
        gu0.Az0().on0(action(1242, 1226, 101155, 101135, 0, l5_014));
        gu0.Az0().on0(action(1283, 1225, 101160, 101154, 0, l5_014));
        gu0.Az0().on0(action(1284, 1226, 101162, 101156, 0, l5_014));
        gu0.Az0().on0(action(1291, 1225, 101185, 101161, 0, l5_014));
        gu0.Az0().on0(action(1292, 1226, 101186, 101163, 0, l5_014));
        gu0.Az0().on0(action(1472, 1225, 101188, 101187, 0, l5_014));
        gu0.Az0().on0(action(1473, 1226, 101190, 101187, 0, l5_014));
        gu0.Az0().on0(action(1486, 1225, 101255, 101189, 0, l5_014));
        gu0.Az0().on0(action(1487, 1226, 101257, 101191, 0, l5_014));
        gu0.Az0().on0(action(1585, 1225, 101132, 101256, 0, l5_014));
        gu0.Az0().on0(action(1586, 1226, 101134, 101258, 0, l5_014));
        gu0.Az0().on0(action(1243, 1243, 101613, 101614, 0, l5_014));
        gu0.Az0().on0(action(1244, 1244, 101615, 101616, 0, l5_014));
        gu0.Az0().on0(action(1245, 1245, 101617, 101618, 0, l5_014));
        gu0.Az0().on0(action(1246, 1246, 101619, 101620, 0, l5_014));
        gu0.Az0().on0(action(1247, 1247, 101621, 101622, 0, l5_014));
        gu0.Az0().on0(action(1248, 5050, 245050, 135050, 0, l5_014));
        gu0.Az0().on0(action(1280, 1280, 101632, 101633, 0, l5_014));
        gu0.Az0().on0(action(1282, 1282, 101634, 101635, 0, l5_014));
        gu0.Az0().on0(action(1433, 1433, 101678, 101679, 0, l5_014));
        gu0.Az0().on0(action(1434, 1434, 101680, 101681, 0, l5_014));
        gu0.Az0().on0(action(1435, 1435, 101682, 101683, 0, l5_014));
        gu0.Az0().on0(action(1436, 1436, 101684, 101685, 0, l5_014));
        gu0.Az0().on0(action(1437, 1437, 101686, 101687, 0, l5_014));
        gu0.Az0().on0(action(1438, 1438, 101688, 101689, 0, l5_014));
        gu0.Az0().on0(action(1439, 1439, 101690, 101691, 0, l5_014));
        gu0.Az0().on0(action(1440, 1440, 101692, 101693, 0, l5_014));
        gu0.Az0().on0(action(1441, 1441, 101694, 101695, 0, l5_014));
        gu0.Az0().on0(action(1442, 1442, 101696, 101697, 0, l5_014));
        gu0.Az0().on0(action(1443, 1443, 101698, 101699, 0, l5_014));
        gu0.Az0().on0(action(1444, 1444, 101700, 101701, 0, l5_014));
        gu0.Az0().on0(action(1445, 1445, 101702, 101703, 0, l5_014));
        gu0.Az0().on0(action(1446, 5466, 245466, 101704, 0, l5_014));
        gu0.Az0().on0(action(1525, 1525, 101788, 101789, 0, l5_014));
        gu0.Az0().on0(action(1526, 1526, 101790, 101791, 0, l5_014));
        gu0.Az0().on0(action(1249, 1249, 101625, 101626, 0, l5_013));
        gu0.Az0().on0(action(1271, 1271, 101627, 101628, 0, l5_013));
        gu0.Az0().on0(action(1299, 1299, 101170, 101171, 0, l5_014));
        gu0.Az0().on0(action(1420, 1420, 101172, 101173, 0, l5_014));
        gu0.Az0().on0(action(1421, 1421, 101174, 101175, 0, l5_014));
        gu0.Az0().on0(action(1297, ec0_2.Sx().SX((short)249).yS(null).mt(), 4016, 4017, 0, l5_014));
        gu0.Az0().on0(action(1298, ec0_2.Sx().SX((short)148).yS(null).mt(), 0, 0, 0, l5_014));
        gu0.Az0().on0(action(1281, 1281, 101636, 101637, 0, l5_014));
    }

    public static void rn0() {
        for (Object object : gu0.l2.Pd0.values()) {
            if (((mc0_1)object).wb0 <= 0 || ((mc0_1)object).nI()) continue;
            mc0_1 mc0_12 = (mc0_1)object;
            ec0_2 registry = ec0_2.Sx();
            mc0_12.qm = ((vk0_1)registry.f4.f5(mc0_12.wb0)).oG(null, null).mt();
        }
    }

    public static boolean bu0(vk0_1 vk0_12, yw_0 yw_02) {
        return yw_02 == yw_0.Jy && vk0_12.hC0 != 382;
    }

    public static String hD() {
        return String.valueOf(8);
    }

    public static String mo0() {
        int n = 8;
        BR bR = tw0_0.rl;
        byte by = bR == null ? (byte)0 : bR.k0.hL0;
        return String.valueOf(n - by);
    }

    public static String ZC() {
        return String.valueOf(20);
    }

    public static String W20() {
        int n = 20;
        BR bR = tw0_0.rl;
        byte by = bR == null ? (byte)0 : bR.k0.Ta;
        return String.valueOf(n - by);
    }
}
