package f;

import cn.pokemmo.ui.window.admin.PlayerInspectWindow;

/**
 * 玩家审查与在线巡查窗口 兼容垫片
 * 核心实现已迁移至 cn.pokemmo.ui.window.admin.PlayerInspectWindow
 */
public final class Ju0 extends PlayerInspectWindow {
    public Ju0(xn0_0 player,
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
      om_1[] notes) {
        super(player, account, onlineState, botDetectionRatio, botZeroRatio, channel, ipAddress, macAddress, clientRevision, operatingSystem, operatingSystemVersion, openGlVendor, accountName, notes);
    }

}
