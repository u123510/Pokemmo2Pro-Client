package cn.pokemmo.battle.ui.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.ArrayList;
import java.util.Collection;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class BattleFaintSlotModifier extends TC0 {
    public static final dl_1 f70;
    public final CH0 jO;
    public final short DA;
    public final Collection<?> HS;
    public boolean Bz;
    public final byte oB;

    static {
        f70 = Cq0.E1(BattleFaintSlotModifier.class);
    }

    public BattleFaintSlotModifier(CH0 v1, short i2, byte i3, ArrayList<?> v4) {
        super();
        this.Bz = false;
        this.jO = v1;
        this.DA = i2;
        this.oB = i3;
        this.HS = v4;
    }

    public static final String Dz(a10_0 v0, short i1, int i2, PF v3) {
        if (i1 == 1) {
            lpt6__2 mode = lpt6__2.Q80;
            int value = v0.QX(213, v3);
            return sm0_0.fg0((byte) 2, mode, 14, value, new String[]{v3.A60()});
        }
        if (i1 == 2) {
            if (i2 == 1) {
                return sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, 81, sm0_0.zb0);
            }
            lpt6__2 mode = lpt6__2.Q80;
            int value = v0.QX(384, v3);
            return sm0_0.fg0((byte) 2, mode, 14, value, new String[]{v3.A60()});
        }
        if (i1 == 4) {
            return sm0_0.fg0((byte) 2, lpt6__2.Q80, 15, 71, new String[0]);
        }
        if (i1 == 8) {
            lpt6__2 mode = lpt6__2.Q80;
            int value = v0.QX(210, v3);
            return sm0_0.fg0((byte) 2, mode, 14, value, new String[]{v3.A60()});
        }
        if (i1 == 16) {
            if (i2 == 1) {
                return sm0_0.fg0((byte) 2, lpt6__2.Q80, 15, 79, new String[0]);
            }
            lpt6__2 mode = lpt6__2.Q80;
            int value = v0.QX(15, v3);
            return sm0_0.fg0((byte) 2, mode, 14, value, new String[]{v3.A60()});
        }
        if (i1 == 32) {
            if (i2 == 1) {
                return sm0_0.fg0((byte) 2, lpt6__2.Q80, 15, 78, new String[0]);
            }
            lpt6__2 mode = lpt6__2.Q80;
            int value = v0.QX(6, v3);
            return sm0_0.fg0((byte) 2, mode, 14, value, new String[]{v3.A60()});
        }
        if (i1 == 128) {
            lpt6__2 mode = lpt6__2.Q80;
            int value = v0.QX(517, v3);
            return sm0_0.fg0((byte) 2, mode, 14, value, new String[]{v3.A60()});
        }
        throw new IllegalArgumentException();
    }

    public static final String F80(a10_0 v0, short i1, PF[] v2) {
        if (i1 < 0) {
            i1 = (short) (i1 * -1);
        }
        if (i1 == 16) {
            if (v2.length <= 3) {
                return sm0_0.fg0((byte) 2, lpt6__2.Q80, 15, 79, new String[0]);
            }
            int textId = (v2.length - 1) * 3 + 15;
            int value = v0.QX(textId, v2[0]);
            String[] args = Stream.of(v2).map(BattleFaintSlotModifier::Zs).toArray(BattleFaintSlotModifier::pw0);
            return sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, value, args);
        }
        if (i1 == 32) {
            if (v2.length <= 3) {
                return sm0_0.fg0((byte) 2, lpt6__2.Q80, 15, 78, new String[0]);
            }
            int textId = (v2.length - 1) * 3 + 6;
            int value = v0.QX(textId, v2[0]);
            String[] args = Stream.of(v2).map(BattleFaintSlotModifier::Yd0).toArray(BattleFaintSlotModifier::Jn);
            return sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, value, args);
        }
        throw new IllegalArgumentException();
    }

    public static String[] Jn(int i0) {
        return new String[i0];
    }

    public static String Yd0(PF v0) {
        return v0.A60();
    }

    public static String[] pw0(int i0) {
        return new String[i0];
    }

    public static String Zs(PF v0) {
        return v0.A60();
    }

    public static boolean uG0(ML0 v0, a10_0 v1, short i2, java.util.List<?> v3) {
        PF[] values = v3.toArray(new PF[0]);
        v0.wJ(F80(v1, i2, values), "", null);
        return true;
    }

    public static void Gc(a10_0 v0, byte i1) {
        v0.mn(i1).zI.COm5 = (byte) 127;
        tw0_0.LD0.he0.Z8(i1, (short) 520);
    }

    public static void fG(a10_0 v0, byte i1) {
        v0.mn(i1).zI.cU = (byte) 127;
        tw0_0.LD0.he0.Z8(i1, (short) 518);
    }

    public static void xg0(a10_0 v0, byte i1) {
        v0.mn(i1).zI.Wn0 = (byte) 127;
        tw0_0.LD0.he0.Z8(i1, (short) 519);
    }
    public final void QC(ML0 battleGUI) {
         long startTime = System.currentTimeMillis();
         a10_0 battleState = battleGUI.yd0;
         PF attacker = battleState.nd0(this.jO);
         if (attacker == null) {
             battleGUI.wJ("Error has occured, could not find\n attacker with object id: " + this.jO, "", null);
             f70.error("Fatal playback error when processing skill {} : Attacker was null", Short.valueOf(this.DA));
             return;
         }
 
         if (this.DA >= 0) {
             attacker.qo0 = this.DA;
         }
 
         Collection<?> targets = this.HS;
         lR openingAction = null;
         Runnable followUp = null;
         HashMap<CH0, Nt> primaryEffects = new HashMap<>();
         hh_1 damagePercentages = new hh_1();
 
         for (Object targetEntry : targets) {
             qn_1 targetRecord = (qn_1) targetEntry;
             PF target = targetRecord.EO.Uz0() ? attacker : battleState.nd0(targetRecord.EO);
             if (target == null) {
                 battleGUI.wJ(sm0_0.wa0(5045, Long.toString(targetRecord.EO.Sa)), "", null);
                 f70.error("Fatal playback error when processing skill {} : Target was null", Short.valueOf(this.DA));
                 return;
             }
 
             for (Object effectEntry : targetRecord.XW) {
                 Nt effect = (Nt)effectEntry;
                 if (effect.Ja0((byte) 4)) {
                     effect.pj0 = (byte)(effect.pj0 | 16);
                     battleGUI.aa0(attacker, target, effect, false, false, this.DA, false, targetRecord);
                 }
 
                 if (effect.BL0() == 0 && !effect.Ja0((byte) 16)) {
                     CH0 effectTargetId = effect.Ja0((byte) 1) ? effect.fe0 : target.Zo0();
                     primaryEffects.put(effectTargetId, effect);
                     PF effectTarget = battleState.nd0(effectTargetId);
                     if (effectTarget != null) {
                         short effectValue = ((ka_0) effect).rA;
                         short currentValue = effectTarget.zi0.Sj;
                         double before = tx_1.uF(effectTarget.uk(), currentValue);
                         double after = tx_1.uF(effectValue, currentValue);
                         if (before != after) {
                              damagePercentages.N60(effectTarget, (before - after) * -1.0);
                 }
            }
            }
            }
 
            short skillId = this.DA;
             boolean repeatable = ((vk0_1)ec0_2.Sx().f4.f5(this.DA)).lr0();
             if (repeatable && this.Bz) {
                 continue;
             }
             if (targetRecord.nG0((short) -32627)) {
                 continue;
             }
 
             switch (skillId) {
                 case 191:
                 case 201:
                 case 240:
                 case 241:
                 case 258:
                 case 390:
                 case 446:
                     continue;
                 case 57:
                 case 507:
                 case 1017:
                 case 1018:
                 case 3057:
                 case 3507:
                     if (this.Bz) {
                         continue;
                     }
                     break;
                 default:
                     break;
             }
 
             boolean hasOpeningFlag = false;
             for (Object candidateEntry : this.HS) {
                if (((qn_1) candidateEntry).nG0((short) 64)) {
                     hasOpeningFlag = true;
                     break;
                 }
             }
             boolean openingVariant = hasOpeningFlag || targetRecord.nG0((short)2048);
             openingAction = new lR(attacker.cD0, attacker.Kj0, target.cD0, target.Kj0, this.DA, openingVariant);
             this.Bz = true;
         }
 
         String message = "";
         boolean hasOpeningMessage = false;
         for (Object targetEntry : this.HS) {
            if (((qn_1) targetEntry).nG0((short) 64)) {
                 hasOpeningMessage = true;
                 break;
             }
         }
 
         if (hasOpeningMessage) {
             switch (this.DA) {
                 case 13:
                     message = sm0_0.fg0(
                             (byte) 2,
                             lpt6__2.Q80,
                             14,
                             battleState.QX(547, attacker),
                             new String[]{attacker.A60()});
                     break;
                 case 19:
                     message = sm0_0.fg0(
                             (byte) 2,
                             lpt6__2.Q80,
                             14,
                             battleState.QX(529, attacker),
                             new String[]{attacker.A60()});
                     break;
                 case 76:
                     message = sm0_0.fg0(
                             (byte) 2,
                             lpt6__2.Q80,
                             14,
                             battleState.QX(553, attacker),
                             new String[]{attacker.A60()});
                     break;
                 case 91:
                     message = sm0_0.fg0(
                             (byte) 2,
                             lpt6__2.Q80,
                             14,
                             battleState.QX(538, attacker),
                             new String[]{attacker.A60()});
                     break;
                 case 117:
                     message = sm0_0.fg0(
                             (byte) 2,
                             lpt6__2.Q80,
                             14,
                             battleState.QX(745, attacker),
                             new String[]{attacker.A60()});
                     break;
                 case 130:
                     message = sm0_0.fg0(
                             (byte) 2,
                             lpt6__2.Q80,
                             14,
                             battleState.QX(556, attacker),
                             new String[]{attacker.A60()});
                     break;
                 case 143:
                     message = sm0_0.fg0(
                             (byte) 2,
                             lpt6__2.Q80,
                             14,
                             battleState.QX(550, attacker),
                             new String[]{attacker.A60()});
                     break;
                 case 264:
                     message = sm0_0.fg0(
                             (byte) 2,
                             lpt6__2.Q80,
                             14,
                             battleState.QX(616, attacker),
                             new String[]{attacker.A60()});
                     break;
                 case 291:
                     message = sm0_0.fg0(
                             (byte) 2,
                             lpt6__2.Q80,
                             14,
                             battleState.QX(535, attacker),
                             new String[]{attacker.A60()});
                     break;
                 case 340:
                 case 1019:
                 case 1020:
                 case 1021:
                 case 1022:
                 case 1023:
                 case 1024:
                     message = sm0_0.fg0(
                             (byte) 2,
                             lpt6__2.Q80,
                             14,
                             battleState.QX(544, attacker),
                             new String[]{attacker.A60()});
                     break;
                 case 467:
                 case 1003:
                 case 1006:
                     message = sm0_0.fg0(
                             (byte) 2,
                             lpt6__2.Q80,
                             14,
                             battleState.QX(541, attacker),
                             new String[]{attacker.A60()});
                     break;
                 case 507:
                 case 3507: {
                     PF other = attacker;
                     for (Object targetEntry : this.HS) {
                         qn_1 targetRecord = (qn_1) targetEntry;
                         other = targetRecord.EO.Uz0() ? attacker : battleState.nd0(targetRecord.EO);
                         if (other != attacker) {
                             break;
                         }
                     }
                     int textId = battleGUI.yd0.eH0(1118, attacker, other);
                     message = sm0_0.fg0((byte)2, lpt6__2.Q80, 14, textId, new String[]{attacker.A60(), other.A60()});
                     break;
                 }
                 case 1012:
                     message = sm0_0.wa0(200365, attacker.A60());
                     break;
                 case 1017:
                 case 1018:
                     if (attacker.Jo0 == 0) {
                         message = sm0_0.wa0(200428, attacker.A60());
                     } else if (attacker.Jo0 == 1) {
                         message = sm0_0.c0(200429);
                     } else if (attacker.Jo0 == 2) {
                         message = sm0_0.wa0(200430, attacker.A60());
                     }
                     break;
                 case 248:
                 case 353:
                 case 1041:
                 case 3248:
                 case 3353:
                     break;
                 default:
                     message = sm0_0.fg0(
                             (byte) 2,
                             lpt6__2.Q80,
                             14,
                             battleState.QX(664, attacker),
                             new String[]{attacker.A60()});
                     break;
             }
         } else if (this.DA > 0 && this.DA != 3353) {
             switch (this.DA) {
                 case 1056:
                     message = sm0_0.wa0(200525, attacker.Yp());
                     break;
                 case 1057:
                     message = sm0_0.wa0(16807052, attacker.Yp());
                     break;
                 case 1058:
                     message = sm0_0.wa0(200527, attacker.Yp());
                     break;
                 case 1059:
                     message = sm0_0.wa0(200530, attacker.Yp());
                     break;
                 case 1060:
                     message = sm0_0.wa0(200572, attacker.Yp());
                     break;
                 case 1061:
                     message = sm0_0.c0(200573);
                     break;
                 case 1062:
                     message = sm0_0.wa0(200588, attacker.Yp());
                     break;
                 case 1063:
                     message = sm0_0.wa0(200557, attacker.Yp());
                     break;
                 case 1064:
                     message = sm0_0.wa0(200559, attacker.Yp());
                     break;
                 case 1065: {
                     PF other = null;
                     for (Object targetEntry : this.HS) {
                         qn_1 targetRecord = (qn_1) targetEntry;
                         other = targetRecord.EO.Uz0() ? attacker : battleState.nd0(targetRecord.EO);
                         if (other != attacker) {
                             break;
                         }
                     }
                     message = sm0_0.wa0(200574, other == null ? "" : other.A60());
                     break;
                 }
                 case 1066:
                     message = sm0_0.wa0(200626, attacker.Yp());
                     break;
                 case 1069:
                     message = sm0_0.wa0(200604, attacker.Yp());
                     break;
                 case 1070:
                     message = sm0_0.wa0(200611, attacker.Yp());
                     break;
                 case 1071: {
                     byte side = attacker.cD0;
                     message = sm0_0.Bw((byte)2, lpt6__2.Q80, 15, battleState.Vs0(side, 164), sm0_0.zb0);
                     followUp = () -> BattleFaintSlotModifier.fG(battleState, side);
                     break;
                 }
                 case 1072:
                     message = sm0_0.wa0(200613, attacker.Yp());
                     break;
                 case 1073: {
                     byte side = a10_0.Vp0(attacker.cD0);
                     message = sm0_0.Bw((byte)2, lpt6__2.Q80, 15, battleState.Vs0(side, 168), sm0_0.zb0);
                     followUp = () -> BattleFaintSlotModifier.xg0(battleState, side);
                     break;
                 }
                 case 1074: {
                     byte side = a10_0.Vp0(attacker.cD0);
                     message = sm0_0.Bw((byte)2, lpt6__2.Q80, 15, battleState.Vs0(side, 172), sm0_0.zb0);
                     followUp = () -> BattleFaintSlotModifier.Gc(battleState, side);
                     break;
                 }
                 case 1075:
                     message = sm0_0.c0(battleState.Vs0(attacker.cD0, 200609));
                     break;
                 case 1076:
                     message = sm0_0.wa0(200621, attacker.Yp());
                     break;
                 case 1077:
                     message = sm0_0.fg0(
                             (byte) 2,
                             lpt6__2.Q80,
                             14,
                             battleGUI.yd0.QX(751, attacker),
                             new String[]{attacker.A60()});
                     break;
                 case 1078:
                     message = sm0_0.wa0(200623, attacker.Yp());
                     break;
                 case 1079:
                     message = sm0_0.wa0(200624, attacker.Yp());
                     break;
                 case 1080:
                     message = sm0_0.wa0(200625, attacker.Yp());
                     break;
                 default: {
                     String skillName = sm0_0.c0(((vk0_1) ec0_2.Sx().f4.f5(this.DA)).bt);
                     if (this.DA < 1000 && !sm0_0.n6.l90(this.DA + 110000)) {
                         String baseMessage = sm0_0.fg0(
                                 (byte) 2,
                                 lpt6__2.Q80,
                                 13,
                                 battleState.QX(this.DA * 3, attacker),
                                 new String[]{attacker.A60()});
                         int index = baseMessage.lastIndexOf(skillName);
                         if (index >= 0) {
                             message = new StringBuilder(baseMessage)
                                     .replace(
                                             index,
                                             index + skillName.length(),
                                             xq_1.pz0("[#ff8a00]", skillName, "[#]"))
                                     .toString();
                         } else {
                             message = baseMessage;
                         }
                     } else {
                         message = sm0_0.fg0((byte)2, lpt6__2.Q80, 8, 52, new String[]{attacker.A60(), skillName});
                     }
                     break;
                 }
             }
         }
 
         String details = "";
         int ignoredDisplayMode = dw_2.ff;
         int detailLevel = dw_2.zC0;
         boolean showDetails = battleState.m40 ? detailLevel >= 1 : detailLevel >= 2;
         if (showDetails && damagePercentages.Rv > 0) {
             StringBuilder builder = new StringBuilder("( ");
             jg0_2 iterator = new jg0_2(damagePercentages);
             while (iterator.RV()) {
                 iterator.zC0();
                 PF target = (PF) iterator.ns0.Yw[iterator.UE];
                 double value = iterator.ns0.us[iterator.UE];
                 builder.append(target.Yp()).append(" ");
                 if (value > 0.0) {
                     builder.append("+");
                 }
                 builder.append(NumberFormat.getInstance().format(value)).append("%");
                 if (iterator.RV()) {
                     builder.append(", ");
                 }
             }
             builder.append(" )");
             details = new StringBuilder().append(message).append(" ").append(builder.toString()).toString();
         }
 
         if (openingAction != null) {
             Runnable continuation = followUp;
             battleGUI.I1(message, details, () -> this.kb(attacker, continuation));
             battleGUI.lZ.add(new kw_0(new lpt2__3(attacker, 0.5f, null)));
             battleGUI.lZ.add(openingAction);
             if (continuation != null) {
                 battleGUI.lZ.add(new kw_0(new lpt2__3(attacker, 0.5f, continuation)));
             }
         } else if (!message.isEmpty()) {
             Runnable continuation = followUp;
             battleGUI.wJ(message, "", () -> this.vi0(attacker, continuation));
         }
 
         boolean matchmaking = battleState.nf == Cq.Jz0;
         int activeCount = 0;
         PF[] activeParty = battleState.wI0[battleState.eI()];
         for (PF partyMember : activeParty) {
             if (partyMember != null && !partyMember.zi0.hf0()) {
                 activeCount++;
             }
         }
 
         ArrayList<qn_1> multiTargetRecords = new ArrayList<>();
         ArrayList<PF> multiTargets = new ArrayList<>();
         w7_0 groupedTargets = new w7_0();
         re0_1 hitCounts = new re0_1();
         int groupMessageId = 1380;
 
         for (Object targetEntry : targets) {
             qn_1 targetRecord = (qn_1) targetEntry;
             if (groupMessageId <= 1380) {
                 if (targetRecord.nG0((short) 32)) {
                     groupMessageId = 1379;
                 } else if (targetRecord.nG0((short) 16)) {
                     groupMessageId = 1381;
                 }
             }
 
             PF target = targetRecord.EO.Uz0() ? attacker : battleState.nd0(targetRecord.EO);
             boolean sameSide = target.cD0 == battleState.eI();
             if (targetRecord.nG0((short) 256)) {
                 short group = 0;
                 if (targetRecord.nG0((short) 32)) {
                     group = (short)((sameSide ? 1 : -1) * 32);
                 } else if (targetRecord.nG0((short) 16)) {
                     group = (short)((sameSide ? 1 : -1) * 16);
                 }
                 if (group != 0) {
                     List<PF> groupMembers = (List<PF>) groupedTargets.f5(group);
                     if (groupMembers == null) {
                         groupMembers = new ArrayList<>();
                         groupedTargets.coM4(group, groupMembers);
                     }
                     groupMembers.add(target);
                 }
             }
 
             for (Object effectEntry : targetRecord.XW) {
                 Nt effect = (Nt)effectEntry;
                 if (effect.Ja0((byte) 8)) {
                     if (matchmaking && effect.BL0() == 0) {
                         if (((ka_0)effect).rA < 1
                                 && !target.zi0.hf0()
                                 && !multiTargetRecords.contains(targetRecord)
                                 && target != attacker) {
                             multiTargetRecords.add(targetRecord);
                             multiTargets.add(target);
                         }
                     } else if (!targetRecord.nG0((short)-32577)) {
                         battleGUI.aa0(attacker, target, effect, false, false, this.DA, false, targetRecord);
                         effect.pj0 = (byte)(effect.pj0 | 16);
                     }
                 }
 
                 if (effect.BL0() == 0) {
                     if (!effect.Ja0((byte) 1) || effect.jA0.equals(target.Zo0())) {
                         hitCounts.Iy(target.Zo0());
                     }
                 }
             }
         }
 
         N60 finalAction = null;
         if (multiTargets.size() > 1) {
             PF[] grouped = (PF[])multiTargets.toArray(new PF[0]);
             for (Object targetEntry : multiTargetRecords) {
                qn_1 targetRecord = (qn_1) targetEntry;
                 for (Object effectEntry : targetRecord.XW) {
                     Nt effect = (Nt)effectEntry;
                     if (effect.BL0() == 0) {
                         effect.pj0 = (byte)(effect.pj0 | 16);
                     }
                 }
             }
             finalAction = new qb_0(battleGUI, attacker, grouped);
         }
 
         if (groupedTargets.Rv > 0) {
             groupedTargets.eQ((key, value) -> BattleFaintSlotModifier.uG0(battleGUI, battleState, key, (List)value));
         }
 
         for (Object targetEntry : targets) {
            qn_1 targetRecord = (qn_1) targetEntry;
             PF target = targetRecord.EO.Uz0() ? attacker : battleState.nd0(targetRecord.EO);
             if (target == null) {
                 battleGUI.wJ(sm0_0.wa0(5045, Long.toString(targetRecord.EO.Sa)), "", null);
                 f70.error("Fatal playback error when processing skill {} : Target was null", Short.valueOf(this.DA));
                 return;
             }
 
             boolean showHitCount = true;
             if (targetRecord.nG0((short) 1)) {
                 showHitCount = false;
                 battleGUI.wJ(BattleFaintSlotModifier.Dz(battleState, (short)1, activeCount, target), "", null);
             } else if (targetRecord.nG0((short) 4)) {
                 showHitCount = false;
                 if (!targetRecord.nG0((short)4096)) {
                     battleGUI.wJ(BattleFaintSlotModifier.Dz(battleState, (short)4, activeCount, target), "", null);
                 }
             } else if (targetRecord.nG0((short) -32760)) {
                 showHitCount = false;
                 battleGUI.wJ(BattleFaintSlotModifier.Dz(battleState, (short)8, activeCount, target), "", null);
             } else if (targetRecord.nG0((short) 128)) {
                 showHitCount = false;
                 battleGUI.wJ(BattleFaintSlotModifier.Dz(battleState, (short)128, activeCount, target), "", null);
             } else {
                 if (!targetRecord.nG0((short)256)) {
                     if (targetRecord.nG0((short) 16)) {
                         battleGUI.wJ(BattleFaintSlotModifier.Dz(battleState, (short)16, activeCount, target), "", null);
                     } else if (targetRecord.nG0((short) 32)) {
                         battleGUI.wJ(BattleFaintSlotModifier.Dz(battleState, (short)32, activeCount, target), "", null);
                     }
                 }
             }
 
             if (targetRecord.nG0((short) 2)) {
                 battleGUI.wJ(BattleFaintSlotModifier.Dz(battleState, (short)2, activeCount, target), "", null);
             }
 
             int index = hitCounts.Dy0(targetRecord.EO);
             int hitCount = index < 0 ? hitCounts.gz : hitCounts.ju0[index];
             for (Object effectEntry : targetRecord.XW) {
                 Nt effect = (Nt)effectEntry;
                 if (effect.Ja0((byte) 16)) {
                     continue;
                 }
 
                 CH0 effectTargetId = effect.Ja0((byte) 1) ? effect.jA0 : target.Zo0();
                 boolean multipleHits = hitCount > 1;
                 boolean primaryEffect = multipleHits && primaryEffects.get(effectTargetId) == effect;
                 battleGUI.aa0(attacker, target, effect, multipleHits, primaryEffect, this.DA, false, targetRecord);
                 effect.pj0 = (byte)(effect.pj0 | 16);
             }
 
             if (showHitCount && hitCount > 1) {
                 String hitMessage = sm0_0.fg0(
                         (byte)2,
                         lpt6__2.Q80,
                         15,
                         32,
                         new String[]{Integer.toString(hitCount)});
                 battleGUI.wJ(hitMessage, "", null);
             }
         }
 
         if (finalAction != null) {
             battleGUI.lZ.add(finalAction);
         }
        if (lpt3__1.sk) {
            battleGUI.lZ.add(new Fc((NZ) this, startTime));
        }
    }

    public final void vi0(PF v1, Runnable v2) {
        byte value = this.oB;
        if (value > 0) {
            v1.WP(value);
        }
        if (v2 != null) {
            v2.run();
        }
    }

    public final void kb(PF v1, Runnable v2) {
        byte value = this.oB;
        if (value > 0) {
            v1.WP(value);
        }
        if (v2 != null) {
            v2.run();
        }
    }
}
