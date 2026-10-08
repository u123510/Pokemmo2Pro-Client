package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class BattleTeamLayoutPacket extends pd0_0 {
    public PF[][] IB;

    public BattleTeamLayoutPacket(k20_0 owner, ByteBuffer input) {
        super(owner, input);
    }

    public final void Oj0() {
        a10_0 party = tw0_0.PK0;
        if (party == null) return;
        byte partySize = (byte)party.wI0.length;
        this.IB = new PF[partySize][];
        for (byte partyIndex = 0; partyIndex < partySize; partyIndex = (byte)(partyIndex + 1)) {
            O8 inventory = party.mn(partyIndex);
            byte groupCount = this.Rj.get();
            for (byte group = 0; group < groupCount; group = (byte)(group + 1)) {
                byte entryCount = this.Rj.get();
                for (byte entry = 0; entry < entryCount; entry = (byte)(entry + 1)) {
                    this.cI0(party.mn(partyIndex), party.xy0, party.pH0);
                }
            }
            Cq capacity = party.nf;
            int slots = partyIndex > 0 ? capacity.Lw0 : capacity.e50;
            this.IB[partyIndex] = new PF[slots];
            for (byte slotIndex = 0; slotIndex < slots; slotIndex = (byte)(slotIndex + 1)) {
                this.IB[partyIndex][slotIndex] = this.ml(inventory, slotIndex, party.Sv);
            }
        }
    }

    public final void os0() {
        a10_0 party = tw0_0.PK0;
        Oz0 overlay = tw0_0.LD0.he0;
        if (overlay == null) return;
        ML0 state = overlay.N10;
        if (party == null || state == null || !party.j6.u) return;

        PF[][] priorSlots = party.wI0;
        if (priorSlots != null) {
            for (PF[] row : priorSlots) {
                for (PF slot : row) {
                    if (slot != null) slot.c20();
                }
            }
        }
        party.wI0 = this.IB;
        party.j6 = zg0_0.Bc0;
        dy_1 timer = party.rU;
        if (timer != null) {
            if (timer.K50) timer.K50 = false;
            party.rU = null;
        }
        party.H30();
        overlay.OE = ca_2.lg0;

        for (byte group = 0; group < state.Tb0.length; group = (byte)(group + 1)) {
            jd0_1[] entries = state.Tb0[group];
            for (byte index = 0; index < entries.length; index = (byte)(index + 1)) entries[index].Hm(false);
            tb0_1[] items = state.yd0.mn(group).zz();
            for (tb0_1 item : items) state.jg0(item);
        }
        state.m5();
        state.B7();
    }
}
