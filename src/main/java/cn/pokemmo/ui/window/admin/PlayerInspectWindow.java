package cn.pokemmo.ui.window.admin;

import f.*;

import java.util.ArrayList;

/**
 * 玩家审查与在线巡查窗口
 *
 * 原混淆类: f.Ju0
 */
public class PlayerInspectWindow extends R90 {
    public final Ju0 asBridge() { return (Ju0) (Object) this; }

   public final ArrayList ts;
   public final ArrayList yq0;
   public final P1 Cs;

   public PlayerInspectWindow(
      xn0_0 player,
      e30_0 account,
      byte onlineState,
      byte botDetectionRatio,
      byte botZeroRatio,
      byte channel,
      String ipAddress,
      long macAddress,
      int clientRevision,
      String operatingSystem,
      String operatingSystemVersion,
      String openGlVendor,
      String accountName,
      om_1[] notes
   ) {
      ArrayList labels = new ArrayList();
      this.ts = labels;
      ArrayList values = new ArrayList();
      this.yq0 = values;
      fy_2 tabs = new fy_2();
      this.ff0(1);
      this.uf("adminframe");
      this.Hy("Player Inspect");
      this.Pb0(new CE0(asBridge(), player));
      labels.add("Player Name");
      values.add(account.uv0());
      labels.add("Online");
      values.add(onlineState == 0 ? "OFFLINE" : onlineState == 2 ? "DISCONNECTED" : "ONLINE");
      labels.add("Object Id");
      values.add(account.yE());
      labels.add("Account Id");
      values.add(account.cM());
      labels.add("Account Name");
      values.add(accountName);
      if (tw0_0.rl.yn() > 5) {
         labels.add("Money");
         values.add(account.bk0());
         labels.add("Coins");
         values.add(account.qu0());
         labels.add("Battle Points");
         values.add(account.JA());
      }

      labels.add("Safari Steps");
      values.add(account.nf0());
      int teleportRow = labels.size();
      labels.add("Location");
      values.add(account.Tg0() + "." + account.EN() + " " + account.PL() + " " + account.CZ());
      if (onlineState > 0) {
         labels.add("Channel:");
         values.add("Ch. " + (channel + 1));
      }

      if (tw0_0.rl.yn() > 5) {
         labels.add("Last Online MAC");
         values.add(tx_1.Hc0(account.d1()));
      }

      if (onlineState > 0) {
         if (tw0_0.rl.yn() > 5) {
            labels.add("Bot Detection Ratio");
            values.add(botDetectionRatio);
            labels.add("Bot Zero Ratio");
            values.add(botZeroRatio);
         }

         labels.add("IP Address");
         values.add(ipAddress);
         if (tw0_0.rl.yn() > 5) {
            labels.add("MAC Address");
            values.add(tx_1.Hc0(macAddress));
         }

         labels.add("Client Revision");
         values.add(clientRevision);
         if (tw0_0.rl.yn() > 5) {
            labels.add("OS");
            values.add(operatingSystem);
            labels.add("OS Version");
            values.add(operatingSystemVersion);
            labels.add("OpenGL Vendor");
            values.add(openGlVendor);
         }
      }

      xe_1[] rowActions = new xe_1[labels.size()];
      xe_1 accountAcp = new xe_1("Account ACP");
      rowActions[3] = accountAcp;
      accountAcp.RR(new con__4(account));
      xe_1 teleport = new xe_1("Teleport");
      rowActions[teleportRow] = teleport;
      if (onlineState > 0) {
         teleport.RR(new gy_2(account));
      } else {
         teleport.RR(new li0_0(account));
      }

      er_0 table = new er_0(new mh_0(asBridge(), rowActions));
      table.uf("/table");
      table.Vo0(xe_1.class, new qu_0());
      table.p5(true);
      table.Dp0();
      lo0_0 scroll = new lo0_0(table);
      tabs.x40(XZ.BC0(tabs.lo0(), new ya_1[]{tabs.C7(scroll)}, tabs).Xq(tabs.hb(scroll)));
      P8 pages = new P8();
      pages.Wq(tabs, "Informations");
      this.Cs = new P1(account);
      pages.Wq(this.Cs, "Notes");
      this.SL(pages);
      lg_0.k.lPT5(new nj_1(asBridge(), notes));
   }

   @Override
   public final void K8() {
      this.lt0();
      this.RY(840, 400);
      super.K8();
   }

   @Override
   public final boolean Of() {
      return this.Cs.Of() ? true : super.Of();
   }
}
