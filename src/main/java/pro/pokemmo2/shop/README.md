# NPC 商店模块

本模块位于 `pro.pokemmo2.shop`。商店业务、报价协议和连接状态放在这里；可见商店窗口
始终复用客户端原版 `f.Uo`，不创建新的商店 UI。

## 目录

```text
shop/
├── model/
│   └── OpenMmoShopQuote.java
├── protocol/
│   ├── OpenMmoShopCodec.java
│   ├── OpenMmoShopControl.java
│   └── OpenMmoShopRequest.java
├── service/
│   └── ShopClient.java
└── state/
    └── OpenMmoShopState.java
```

## 运行链路

```text
f.k20_0.jt0()
  -> ShopClient.onGameConnectionReady()
  -> C2S 0xDC: 7e 01 00
  -> S2C 0xDC: 7e 01 00

S2C 0x23
  -> f.EL 在解码阶段读取原生商品和报价扩展
  -> ShopClient 安装报价关联
  -> f.BU.yn(...) 创建原版 f.Uo
  -> f.Uo 原版买入/出售界面

f.Uo 原版确认按钮
  -> ShopClient.onNativeBuy/onNativeSell()
  -> OpenMmoShopRequest
  -> S2C 0x40 背包刷新 + 0x0C 金钱刷新 + 0xDC 结果
```

## 原版 UI 边界

- 原版 `f.Uo` 负责主题、布局、商品图标、买入/出售页签、数量控件、确认框和关闭流程。
- 原版买入商品直接使用服务端下发的原生价格。
- 原版出售列表仍由 `f.Uo.XH0()` 生成；有扩展报价时只筛选当前店铺允许回收的道具。
- `f.ie0_2` 的兼容构造路径只覆盖当前窗口的回收单价，不修改全局道具价格。
- `ShopClient` 不创建窗口、不绘制控件、不进行本地扣款，只维护报价、请求序号和网络动作。

## 协议安全

商店控制报文使用 opcode `0xDC`，payload 必须以 `magic=0x7E`、`version=1` 开头，
因为原客户端 `0xDC` 已存在 `f.HJ` 处理器。购买目标使用 `itemId`，出售目标使用
背包条目的 `ownedItemId`；数量限制为 `1..999`，一次报价只允许一个待处理请求。

## 混淆类桥接

- `f.k20_0`：连接建立、断开通知。
- `f.ho_1`：识别 `0xDC` 自定义 payload，并保留旧 `f.HJ` 路径。
- `f.EL`：完整解码 `0x23` 扩展报价，然后继续原版 `BU.yn(...)` 开窗。
- `f.Uo`：筛选当前报价的出售物品并显示本店价格。
- `f.oj0_0`：把原版确认动作转发到 `ShopClient`。
- `f.BU`：原版窗口关闭时发送自定义 CLOSE。

## 维护

服务端店铺配置位于：

```text
C:\Users\z3407\Desktop\28887-server-main\resource\shop
```

价格修改后服务端使用 `//reloadshops`。客户端协议字段变更必须同步本 README、
服务端 `docs/NPC_SHOP_PACKET.md`、`docs/NPC_SHOP_CLIENT_INTEGRATION.md` 和
`build/text/npc-shop-client-modification-*.txt`。

本模块的 Maven 编译、客户端启动、服务器联调和真实交易回放需要在测试环境执行。
