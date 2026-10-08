package cn.pokemmo.battle.model;

import f.CI;
import f.org.json.N7;
import f.SQ;
import f.ZA0;
import f.con__6;
import f.kt_2;
import f.org.json.yw_2;
import java.nio.ByteBuffer;
import java.util.LinkedList;

/**
 * 战斗模拟参与者配置档案 (Battle Simulation Participant Profile)
 * <p>
 * 原始混淆类: {@code f.on0_0}
 */
public class BattleSimulationParticipantProfile {
    public final SQ TB0;
    public final LinkedList ld;
    public con__6 vx0;

    public BattleSimulationParticipantProfile() {
        this.TB0 = new SQ();
        this.ld = new LinkedList();
        this.vx0 = con__6.Qs;
    }

    public BattleSimulationParticipantProfile(N7 n7) {
        this.TB0 = new SQ();
        this.ld = new LinkedList();
        con__6 c = con__6.Qs;
        this.vx0 = c;
        n7.gz0("pokemon").forEach(this::pV);
        n7.gz0("actions").forEach(this::uI);
        this.vx0 = con__6.i80((byte) n7.MT(c.d90(), "type"));
    }

    public static void writeAction(ByteBuffer byteBuffer, CI cI) {
        byteBuffer.put(cI.A5.Dg0);
        byteBuffer.putInt(cI.II0);
        byteBuffer.putInt(cI.ev);
        byteBuffer.put((byte) (cI.Mr0 ? 1 : 0));
    }

    public static void i10(ByteBuffer byteBuffer, CI cI) {
        writeAction(byteBuffer, cI);
    }

    public N7 ow() {
        N7 n7 = new N7();
        yw_2 yw_2 = new yw_2();
        int[] arr = this.TB0.Zw0();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int slotId = arr[i];
            ZA0 za0 = (ZA0) this.TB0.get(slotId);
            za0.getClass();
            N7 pkm = new N7();
            pkm.D50(Integer.valueOf(za0.nt0), "id");
            pkm.D50(Integer.valueOf(za0.CV), "ability");
            pkm.D50(Integer.valueOf(za0.Oi), "level");
            pkm.D50(Integer.valueOf(za0.Vq), "held_item");
            yw_2 skills = new yw_2();
            skills.cOM3(za0.tn.qE(), false);
            pkm.D50(skills, "skills");
            pkm.D50(Integer.valueOf(slotId), "slot_id");
            N7.IH0(pkm);
            yw_2.or.add(pkm);
        }
        n7.D50(yw_2, "pokemon");
        yw_2 actions = new yw_2();
        this.ld.stream().map(obj -> ((CI) obj).HE0()).forEach(actions::lC);
        n7.D50(actions, "actions");
        n7.D50(Integer.valueOf(this.vx0.gU), "type");
        return n7;
    }

    public void P5(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) this.TB0.Rv);
        int[] arr = this.TB0.Zw0();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int slotId = arr[i];
            byteBuffer.put((byte) slotId);
            ZA0 za0 = (ZA0) this.TB0.get(slotId);
            byteBuffer.putShort(za0.nt0);
            byteBuffer.putShort(za0.CV);
            byteBuffer.put(za0.Oi);
            byteBuffer.putShort(za0.Vq);
            byteBuffer.put((byte) za0.tn.Pf);
            short[] skills = za0.tn.qE();
            int skillLen = skills.length;
            for (int j = 0; j < skillLen; j++) {
                byteBuffer.putShort(skills[j]);
            }
        }
        byteBuffer.put((byte) this.ld.size());
        this.ld.forEach(cI -> writeAction(byteBuffer, (CI) cI));
        byteBuffer.put(this.vx0.gU);
    }

    public void uI(Object obj) {
        N7 n7 = (N7) obj;
        kt_2 type = kt_2.uF((byte) n7.pF("type"));
        int primary = n7.pF("primary_value");
        int secondary = n7.MT(0, "secondary_value");
        CI ci = new CI(type, primary, secondary);
        ci.Mr0 = n7.RD();
        this.ld.add(ci);
    }

    public void pV(Object obj) {
        N7 n7 = (N7) obj;
        this.TB0.uu0(n7.pF("slot_id"), new ZA0(n7));
    }
}
