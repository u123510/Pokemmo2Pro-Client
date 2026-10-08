# PokeMMO2 客户端自定义模块化架构规范 (README)

本目录（`src/main/java/pro/pokemmo2/`）为 PokeMMO 客户端自定义功能与扩展界面的**专属根目录**。  
所有自定义 UI、玩法逻辑、扩展服务与聊天命令**必须存放在此软件包下**，严禁与混淆的 `f` 软件包交叉混杂。

---

## 一、 当前架构目录概览

```
pro.pokemmo2/
│
├── README.md                           # 本规范说明文档
├── UIManager.java                      # 【全局外观调度中心】统一管理窗口生命周期与命令分发
│
├── core/                               # 【核心框架层】所有模块通用的基础类库
│   ├── BaseWindow.java                 # 封装底层的通用窗口基类 (提供拖拽、居中、皮肤、Table布局)
│   └── IModule.java                    # 自定义模块通用规范接口 (生命周期与命令自注册)
│
├── encounter/                          # 【遭遇记录仪模块】
│   ├── EncounterModel.java             # 数据实体定义 (种族记录 SpeciesRecord、闪光记录 ShinyRecord)
│   ├── EncounterService.java           # 遭遇计数、置顶排序、自动战斗监听服务
│   ├── EncounterRecorderWindow.java    # 遭遇记录仪主窗口 (资料页 / 历史页)
│   ├── EncounterHUDWidget.java         # 主界面微型悬浮挂件 (折叠 / 展开+号)
│   ├── ShinyDetailWindow.java          # 上次闪光捕获详情弹窗 (个体值绿色高亮、性格、通报、分享)
│   └── EncounterCommand.java           # 聊天指令 (/zy, /counter, /encounter)
│
├── redeem/                             # 【卡密/礼包码兑换模块】
│   ├── RedeemWindow.java               # 兑换弹窗 UI (输入框、即时回车与ESC监听)
│   ├── RedeemService.java              # 卡密验证业务逻辑与测试码库
│   └── RedeemCommand.java              # 聊天指令 (/redeem, /cdkey, /km)
│
├── shop/                               # 【NPC 商店模块】
│   ├── model/                          # 报价和出售条目模型
│   ├── protocol/                       # 0x23 扩展和 0xDC 控制协议
│   ├── state/                          # 连接级报价、序号和重放状态
│   ├── service/                        # 网络、买卖和资产刷新编排
│   └── ui/                             # 原版窗口适配说明（不创建新商店窗口）
│
└── sample/                             # 【开发样例模块】
    └── CustomSampleWindow.java         # 二次开发参考范例窗口
```

---

## 二、 后续新模块创建标准模型 (New Feature Module Blueprint)

当后续需要添加新功能（例如：`每日签到 signin`、`VIP特权 vip`、`传送面板 teleport`、`百宝箱 box` 等）时，**后续的大模型 (LLM) 或开发者必须严格遵守以下创建标准**：

### 1. 独立包路径规则
每个新功能必须在 `pro.pokemmo2` 下创建专属子包，包名使用全小写英文名词：
- 签到系统：`pro.pokemmo2.signin`
- 传送面板：`pro.pokemmo2.teleport`
- 个人特权：`pro.pokemmo2.vip`
- 随身百宝箱：`pro.pokemmo2.box`

### 2. 标准模块四要素（Window / Service / Command / Model）

| 角色 | 命名规范 | 继承/实现 | 职责说明 |
| :--- | :--- | :--- | :--- |
| **界面层 (UI Window)** | `XxxWindow.java` | 继承 `BaseWindow` | 负责界面排版布局、按钮事件绑定、用户交互反馈。 |
| **服务层 (Service)** | `XxxService.java` | 单例或静态工具 | 负责业务计算、数据校验、状态维护（优先纯内存态维护）。 |
| **指令层 (Command)** | `XxxCommand.java` | 继承 `f.prn__2` | 负责监听聊天栏 `/` 开头的指令，解析参数并唤出界面。 |
| **模型层 (Model)** | `XxxModel.java` (可选) | 纯 POJO 结构 | 当包含复杂数据结构（如表格行、多维记录）时定义实体模型。 |

---

## 三、 标准模板代码规范

### 1. 界面开发模板 (`XxxWindow.java`)
```java
package pro.pokemmo2.example;

import f.pa0_0;
import f.xe_1;
import pro.pokemmo2.core.BaseWindow;

public class ExampleWindow extends BaseWindow {

    public ExampleWindow() {
        super("功能标题");

        // 1. 设置窗口尺寸与默认行为
        this.setWindowSize(380, 240);
        this.setMovable(true);       // 允许通过标题栏拖拽移动
        this.setResizable(false);     // 固定大小，禁止拉伸边框

        // 2. 使用封装的高级便捷 API 构建组件
        this.addCenteredLabel("欢迎使用自定义模块！");

        // 3. 添加自定义按钮与事件
        xe_1 actionBtn = new xe_1("立即执行");
        actionBtn.qF0(pa0_0.CENTER);
        actionBtn.RR(this::onActionClicked);
        this.table.vx0(actionBtn).Pt(120.0f).im0();

        // 4. 居中显示
        this.center();
    }

    private void onActionClicked() {
        // 调用对应 Service
        ExampleService.getInstance().doWork();
    }
}
```

### 2. 指令开发模板 (`XxxCommand.java`)
```java
package pro.pokemmo2.example;

import f.lg_0;
import f.prn__2;
import f.tw0_0;
import f.zo_0;
import pro.pokemmo2.UIManager;

public class ExampleCommand extends prn__2 {

    public ExampleCommand(String commandName) {
        super(commandName, true);
    }

    @Override
    public void sr0(String[] args) {
        // 关键：必须投递到 UI 渲染主线程打开窗口，防止线程竞争
        if (lg_0.k != null) {
            lg_0.k.lPT5(UIManager::openExampleWindow);
        } else {
            UIManager.openExampleWindow();
        }

        // 聊天框反馈提示 (可选)
        if (tw0_0.rl != null) {
            tw0_0.rl.jC("已打开示例窗口", zo_0.rr0);
        }
    }
}
```

### 3. 外观中心注册 (`UIManager.java`)
新模块编写完毕后，仅需在 [`pro.pokemmo2.UIManager`](file:///C:/Users/z3407/Desktop/28887-obf-project/src/main/java/pro/pokemmo2/UIManager.java) 中追加两项：
1. **在 `registerCommandsToList` 中添加命令**：
   ```java
   list.add(new ExampleCommand("/example"));
   ```
2. **添加单例窗口调度方法**：
   ```java
   public static void openExampleWindow() {
       if (exampleWindow == null || exampleWindow.K20 == null) {
           exampleWindow = new ExampleWindow();
           exampleWindow.show();
       } else {
           exampleWindow.show();
       }
   }
   ```

---

## 四、 核心开发避坑指南 (AI Agent 必读)

1. **窗口可拖拽属性**：
   - 底层 `f.R90` 中，`bD(boolean)` 控制是否允许拖拽标题栏移动窗口（`movable`）。
   - 在 `BaseWindow` 中已默认开启 `this.bD(true)`，切勿在子窗口中调用 `bD(false)`，否则会导致窗口无法拖拽。
2. **挂载父容器**：
   - 游戏内的通用窗口必须挂载至 `f.BU.T50`（游戏主活动 HUD 容器）。`BaseWindow.show()` 已自动处理此逻辑，切勿挂载到 `LD0.wo`（调试不可见层）。
3. **文本居中与布局**：
   - 文本居中使用 `label.qF0(pa0_0.CENTER)`，靠左使用 `pa0_0.LEFT`，靠右使用 `pa0_0.RIGHT`。
   - 避免使用未混淆映射外的非常规枚举名。
4. **主线程调度**：
   - 任何由聊天指令、快捷键或异步回调触发的 UI 打开、关闭操作，必须通过 `f.lg_0.k.lPT5(Runnable)` 投递到 LibGDX 主循环执行。
5. **数据存储策略**：
   - 按照用户要求，默认优先使用**纯内存态单例维护**（如 `EncounterService`），除非用户明确要求落盘存储，否则不要强制向本地磁盘生成配置文件。
