# PokeMMO 客户端架构重构与反混淆规范文档

本目录 src/main/java/cn 包含了从原始混淆包 f.* 中解耦、反混淆并按现代面向对象分层架构重构的核心业务体系。

> **核心设计原则**：
> 1. **行为绝对等价**：所有类均严格基于 Recaf JASM 字节码逻辑重构，保持 100% 程序语义一致。
> 2. **零破坏性编译**：所有迁移类均在原 f.* 中保留同名兼容垫片（Shim），支持全工程无缝协同，保持 Maven 全量 0 错误编译。
> 3. **领域驱动划分**：彻底终结原 f.* 混乱平铺数千类的局面，按窗口、对战、网络、ROM、粒子、物品等业务领域清晰分包。

---

## 一、 架构模块总览

当前 cn 根包下共包含 **2,527** 个现代化 Java 类，划分为以下主要功能集群：

| 功能模块 | 所在包路径 | 包含类数 | 核心职责说明 |
| :--- | :--- | :---: | :--- |
| **GUI 窗口系统** | cn.pokemmo.ui.window.* | **109** | 全量客户端视窗：包含 GM 工具 (GmPanelWindow)、排位对战、地图、交易行、背包、电脑、社交、设置等 11 个细分子包 |
| **3D 粒子特效引擎** | cn.pokemmo.particle.* | **47** | 3D 技能攻击粒子、光效追踪、天气颗粒、35+ 种独立粒子质子特效 (Vanity Effects) 及渲染扩展 |
| **ROM 数据解析与驱动体系** | cn.pokemmo.rom.* | **100** | GBA / NDS 多平台 ROM 二进制解包、NitroFS、NARC 归档、动态寻址 (`gba.offset.*`)、GBA/NDS 地图图块集与动画 (`gba.tileset.*`)、野外环境精灵 (`gba.sprite.*`)、道具注册 (`gba.item.*`)、多语言注册表 (`GbaMultilingualRomRegistry`)、地形网格 (`nds.terrain.*`)、地图事件矩阵与碰撞 (`nds.event.*`, `nds.bw.*`)、白金城镇地图 (`nds.dppt.PlatinumTownMap`) 与加密文本库 (`nds.text.DpptTextBank`) |
| **NPC 对话与气泡视窗** | cn.pokemmo.ui.dialog.* | **14** | 对话框基类、打字机标签、核心交互气泡 (MessageBoxBubble)、招式/队伍选择气泡与全局管理器 |
| **网络通信与会话** | cn.pokemmo.net.* | **14** | 基于 Java NIO 的高性能网络会话 (GameSession/LoginSession/ShopSession)、连接状态枚举 (SessionState)、封包读写、Worker 线程模型 |
| **服务端入站协议数据包 (阶段 2A)** | cn.pokemmo.net.packet.inbound.* | **215** | 服务端到客户端全量 215 类网络入站数据包（角色生成/外观、位移同步、对话脚本、背包变动、对战行动解析、队伍状态等），对接 `PacketRouteDispatcher` 路由分发 |
| **客户端出站协议请求包 (阶段 2B)** | cn.pokemmo.net.packet.outbound.* | **136** | 客户端到服务端全量 136 类出站请求数据包（聊天文本 ChatMessageOutboundPacket、心跳 Ping、移动请求、目标交互、出招指令、邮件交易、角色创建等），完整实现 `ig0` 写入网络流 |
| **对战回合操作/事件包 (阶段 2C)** | cn.pokemmo.battle.action.* | **155** | 对战回合操作与事件全量 155 类数据包（多目标行动基类、伤害结算、濒死离场、能力升降、异常状态、天气生效、换人登场等），完整实现 `IE0` 对战时序逻辑 |
| **对战时序任务执行器 (阶段 4A)** | cn.pokemmo.battle.task.* | **46** | 对战协程/时序任务 (`extends N60`)，包含技能释放包装、HP平滑扣减、剧情对话、行动推进、镜头追踪、天气爆发、精灵出战同步等 |
| **对战场景UI修改器 (阶段 4B)** | cn.pokemmo.battle.ui.modifier.* | **24** | 对战 UI 场景修改器 (`extends TC0`)，包含宝可梦摘要同步、槽位动态布局、队伍状态刷新、图鉴捕捉点亮、出战槽激活等 |
| **大世界图块交互行为 (阶段 3A)** | cn.pokemmo.world.tile.behavior.* | **51** | 地图图块交互行为 (`extends BaseTileBehavior extends nt_1`)，包含草丛遇敌、跳跃台阶、冲浪水面、旋转地板、冰面滑行、传送门、落穴、攀瀑等 |
| **地图脚本变量动作器 (阶段 3B)** | cn.pokemmo.script.action.* | **51** | 地图脚本变量与操作执行器 (`extends BaseScriptAction extends oc0_0`)，包含脚本变量读写、徽章进度、标志位判断、NPC触发与机关同步 |
| **3D地图地形网格渲染 (阶段 3C)** | cn.pokemmo.world.render.mesh.* | **37** | 3D 地形与建筑网格动态渲染器 (`extends BaseMapMeshRenderer extends gr_2`)，包含地形网格批处理、水面着色、水车风车场景机关与水面倒影 |
| **精灵切片与行走图工厂 (阶段 3D)** | cn.pokemmo.world.sprite.provider.* | **97** | 精灵贴图纹理切片与行走图工厂 (`extends BaseSpriteFrameProvider extends au_2`)，包含NPC行走图切片、跟随宝可梦动画、地图物件帧提供 |
| **对战引擎与上下文** | cn.pokemmo.battle.* | **12** | 战斗上下文 (BattleContext)、环境、分级 (Tier)、天气、阵营与战斗参与者模型 |
| **宝可梦实体与招式** | cn.pokemmo.pokemon.* | **9** | 活跃宝可梦实体状态、属性性格、招式数据库 (MoveDatabase)、全国图鉴数据 |
| **物品与背包系统** | cn.pokemmo.item.* | **5** | 玩家背包 (PlayerBag)、物品分袋 (Pocket)、物品模板与物品数据注册表 |
| **脚本交互与多选菜单** | cn.pokemmo.script.menu.* | **3** | ROM 与脚本动态多选菜单条目 (OptionGroup)、选项映射注册表与全局多选菜单管理器 |
| **图形与底层纹理** | cn.pokemmo.graphics.* | **1** | KTX 纹理格式加载元数据与图形上下文管理 |
| **对战主控与战斗 HUD** | cn.pokemmo.ui.battle.* | **5** | 对战主控总面板 (BattleCombatLayout)、血条HUD、消息浮层、出战槽位与换人按钮 |
| **音频引擎系统** | cn.pokemmo.audio.* | **6** | 全局声音主管理器 (AudioManager)、BGM/MIDI 播放器、叫声数据库与音量声道配置 |
| **按键手柄输入系统** | cn.pokemmo.input.* | **4** | 键位动作绑定 (KeyBinding)、手柄设备管理 (GamepadManager) 与手柄映射配置 |
| **客户端全局配置** | cn.pokemmo.config.* | **4** | 客户端玩家全局设置 (ClientSettings)、网络调试配置、属性IO读写与配置注解 |
| **大世界地图与实体** | cn.pokemmo.world.* | **4** | 地图场景实体基类 (WorldEntity)、玩家主角实体 (PlayerActor)、大世界总管理器与虚拟时间四季引擎 (WorldTimeManager) |
| **技能动画执行器 (第一世代)** | cn.pokemmo.battle.animation.move.gen1.* | **165** | 第一世代全量 165 种宝可梦对战招式动画时序编排（拍击、十万伏特、日光束、破坏光线、地震、大字爆炎等），驱动 3D 粒子与音效 |
| **技能动画执行器 (第二世代)** | cn.pokemmo.battle.animation.move.gen2.* | **86** | 第二世代全量 86 种宝可梦对战招式动画时序编排（暗影球、神速、十字劈、气旋攻击、神圣之火、守住、咬碎等），驱动 3D 粒子与音效 |
| **技能动画执行器 (第三世代)** | cn.pokemmo.battle.animation.move.gen3.* | **103** | 第三世代全量 103 种宝可梦对战招式动画时序编排（伏特攻击、叶刃、龙之舞、喷火、彗星拳、击掌奇袭、绝对零度等），驱动 3D 粒子与音效 |
| **技能动画执行器 (第四世代)** | cn.pokemmo.battle.animation.move.gen4.* | **113** | 第四世代全量 113 种宝可梦对战招式动画时序编排（暗影潜袭、勇鸟猛攻、真气弹、波导弹、流星群、大地之力、尖石攻击等），驱动 3D 粒子与音效 |
| **技能动画执行器 (第五世代)** | cn.pokemmo.battle.animation.move.gen5.* | **92** | 第五世代全量 92 种宝可梦对战招式动画时序编排（交错闪电、交错火焰、Ｖ热炎、暗黑爆破、青焰、雷击、热水、破壳、伏特替换等），驱动 3D 粒子与音效 |
| **特殊/自制招式动画与战斗演出** | cn.pokemmo.battle.animation.special.* | **96** | 全部 96 种特殊自制招式 (Move ID > 559)、组合连携、天气爆发、状态生效、替身与对战演出动画时序编排 |
| **动画缓动插值引擎 (阶段 5A)** | cn.pokemmo.ui.easing.* | **29** | 客户端底层时间插值与弹性缓动引擎，包含线性、三次方、指数、回弹、正弦等全量曲线方程 |
| **UI 布局与容器控件 (阶段 5B)** | cn.pokemmo.ui.widget.layout.* | **21** | 界面几何布局、分栏切割、层叠网格与自适应容器组件 |
| **按钮与动作交互控件 (阶段 5C)** | cn.pokemmo.ui.widget.button.* | **31** | 按钮交互、复选单选框、滑块选择与开关触发控件 |
| **文本与输入组件 (阶段 5D)** | cn.pokemmo.ui.widget.text.* | **20** | 富文本标签、数字调节、输入框、文本渲染器与格式化展示组件 |
| **通用复合视图与面板组件 (阶段 5E)** | cn.pokemmo.ui.widget.component.* | **58** | 树状列表、悬浮弹窗、精灵盒子存储网格、进度条、天气浮层等核心复用面板 |
| **玩家聊天 Slash 命令体系 (阶段 6A)** | cn.pokemmo.command.slash.* | **29** | 聊天框 Slash 玩家命令系统（SlashCommandManager 总调度器、BaseSlashCommand 基类与 /time, /ping, /unstuck, /bgm, /block 等 28 个具体命令） |
| **控制台与调试指令体系 (阶段 6B)** | cn.pokemmo.command.console.* | **23** | 开发者/管理员控制台指令系统（ConsoleCommandManager 总调度器、BaseConsoleCommand 基类与 22 个具体内部控制台指令） |
| **3D 材质与光照环境属性 (阶段 7A)** | cn.pokemmo.graphics.material.attribute.* | **15** | 3D 材质属性与光照系统（BaseMaterialAttribute 基类与平行光、点光源、聚光灯、颜色、纹理、立方体天空盒、深度测试等 14 类属性） |
| **着色器 Uniform 参数控制器 (阶段 7B)** | cn.pokemmo.graphics.shader.uniform.* | **15** | 3D 着色器全局 Uniform 参数驱动器（BaseGlobalUniformSetter 基类与视图、投影、联合、逆矩阵、法线、视口范围、视点衰减等 14 类控制器） |
| **3D 场景图网格节点模型 (方案 1A)** | cn.pokemmo.graphics.model.node.* | **14** | 3D 场景图渲染节点（BaseSceneNodeModel 基类与网格挂载、粒子发射源、动态地块、分块瓦片等 13 类节点） |
| **高频对象内存复用池 (方案 1B)** | cn.pokemmo.util.pool.* | **12** | 客户端高性能对象池（BaseObjectPool 基类与 Vector2/3、Matrix4、Color、BoundingBox、RayTrace 等 11 类池） |
| **大世界地形贴花与混合器 (方案 1C)** | cn.pokemmo.world.render.blend.* | **11** | 地图多层贴花与图块渐变（BaseTerrainTileBlender 基类与动态水面、延迟渐变、双层Alpha等 10 类混合器） |
| **对战战术 AI 行为评估器 (方案 2A)** | cn.pokemmo.battle.ai.evaluator.* | **11** | 战斗决策与行为树评估（BaseBattleAiEvaluator 基类与先制度、换人预测、属性克制、危险度等 10 类评估器） |
| **战斗伤害公式与能力修正 (方案 2B)** | cn.pokemmo.battle.calc.* | **10** | 伤害结算与数值修正（BaseDamageCalculator 基类与多段攻击、暴击、天气、属性克制修正等 9 类计算器） |
| **战斗槽位与阵营站位模型 (方案 2C)** | cn.pokemmo.battle.slot.* | **10** | 战斗参与者槽位与场地（BaseBattleParticipantSlot 基类与单打/双打/三打/团队槽位等 9 类模型） |
| **空间碰撞几何与射线检测 (方案 3A)** | cn.pokemmo.world.collision.geometry.* | **10** | 物理碰撞与几何求交（BaseCollisionGeometry 基类与包围盒、球体、胶囊体、射线、视锥遮挡等 9 类几何体） |
| **客户端响应式数据状态模型 (方案 3B)** | cn.pokemmo.ui.widget.model.state.* | **10** | 响应式状态与数据绑定（BaseObservableStateModel 基类与对战会话、背包、个人档案、图鉴等 9 类状态模型） |
| **交互式列表与项选择面板 (方案 3C)** | cn.pokemmo.ui.widget.list.* | **8** | 列表滚动与项选择视图（BaseScrollListWidget 基类与招式选择、分页、过滤、多列网格等 7 类列表控件） |
| **网络通信加密安全与密钥协商 (网络 B1)** | cn.pokemmo.net.security.* | **9** | 客户端通信安全（Diffie-Hellman 密钥协商、AES 对称加密、HMAC 防篡改签名、Nonce 随机防重放等 9 类） |
| **NIO 异步调度与网络时钟同步 (网络 B2)** | cn.pokemmo.net.nio.worker.* | **8** | 网络异步引擎（NioReadWriteWorker、带宽吞吐监控、ScheduledTaskExecutor 调度器、SNTP 时间校准等 8 类） |
| **数据包分片重组与压缩解包 (网络 B3)** | cn.pokemmo.net.compress.* | **6** | 流量压缩与分片传输（Zlib/Gzip 解包器、Snappy 解压缩、Deflater 字节流适配器、Theme 归档管理等 6 类） |
| **底层系统协议包与会话控制 (网络 B4/2C)** | cn.pokemmo.net.packet.system.* | **14** | 核心协议流控制（BaseProtocolPacketWrapper 基类与握手、登录挑战、鉴权事件、心跳保活、断线通知等 14 类协议包） |
| **底层数据包二进制编解码器 (网络 2C-1)** | cn.pokemmo.net.codec.binary.* | **10** | 业务实体二进制序列化（GameDataPayloadReader 业务载荷解码器、BasePacketBinaryCodec 基类与聊天、位移、物品变动、战斗指令、交易、数值等 8 类编解码器） |
| **内存级网络字节流缓冲区 (网络 2C-2)** | cn.pokemmo.net.buffer.stream.* | **13** | 高性能网络缓冲流池（BaseNetworkByteBuffer 基类与定长/变长整数、Short/Long、浮点坐标等 12 类缓冲池） |
| **TCP数据分帧与通道多路复用 (网络 2C-3)** | cn.pokemmo.net.channel.* | **6** | 网络通道辅助（数据包分帧协议、Socket 连接辅助、NIO 字段选择器处理器等 6 类通道组件） |
| **网络压缩流与分块读取适配 (网络 2C-4)** | cn.pokemmo.net.compress.stream.* | **4** | 数据解压流控制（BaseStreamDecompressor 基类、分块数据读取器、Zip 归档句柄、Zlib 动态流适配器等 4 类） |
| **入站协议路由分发中枢 (第一梯队)** | cn.pokemmo.net.packet.router.* | **1** | 网络入站协议总调度中心 (PacketRouteDispatcher)，负责解压、Opcode识别、分会话状态路由分发全量 215 类入站包 |


---
| **对战回合行动指令集 (方案一 1A)** | cn.pokemmo.battle.action.* | **12** | 对战行动数据包拓展（ay0_0, C20, EJ, g1_0, KE, nb0_0, OK, o0_0, sl_0, t90_0, tz_2, xr_1），驱动招式释放、伤害同步与状态回执 |
| **客户端出站协议请求包 (方案一 1B)** | cn.pokemmo.net.packet.outbound.action.* | **6** | 客户端行动请求出站协议包 (`BaseOutboundActionPacket` 基类与 Action002/003/004/008/017 等 5 类出站数据包) |
| **对战实体行为与能力干预 (方案一 1C)** | cn.pokemmo.battle.entity.modifier.* | **6** | 战斗实体属性、行为、状态干预修改器 (`BaseBattleModifier` 基类与 Stat, Action, Runnable, State, Target 修改器) |
| **富文本图元与复合排版节点 (方案一 1D)** | cn.pokemmo.ui.richtext.* | **14** | 样式化文本 AST 节点体系 (`BaseStyledDocumentNode`, `BaseStyledContainerDocumentNode` 基类与 Text, Link, Param, Image, Table, Row 等 12 类节点) |
| **动力学缓动与高阶插值曲线 (方案二 2A)** | cn.pokemmo.math.interpolator.* | **12** | 动力学与插值数学引擎 (`BaseInterpolationCurve` 基类与 Constant, Bounce, Exp, Elastic, Cubic, Smoothstep 等 11 类曲线) |
| **多格式音频解码与缓冲器 (方案二 2B)** | cn.pokemmo.audio.stream.decoder.* | **7** | 音频流与解码器驱动 (`BaseAudioStreamDecoder` 基类与 Ogg, PcmWave, Midi, Buffered, Composite 等 6 类解码器) |
| **3D动画轨道与时钟序列 (方案二 2C)** | cn.pokemmo.graphics.animation.track.* | **14** | 骨骼/模型动画轨道与时间线序列 (`BaseAnimationTrack`, `BaseTimelineSequence` 基类与 Scale, Rot, Trans, Color, Linear, Timed 等 12 类轨道与序列) |
| **大世界贴花延迟混合器 (方案二 2D)** | cn.pokemmo.world.render.blend.deferred.* | **9** | 地形多重混合器延迟着色扩展（Indexed, MultiLayer, Texture, Quad, Directional, Typed, Model 等 9 类混合器） |
| **表格自适应度量单元 (方案三 3A)** | cn.pokemmo.ui.widget.layout.cell.* | **8** | 网格布局度量属性 (`BaseLayoutCellProperty` 基类与 Spacing, Width, Height, Weight, Alignment, Padding, Fill 属性) |
| **下拉选择与单选组件 (方案三 3B)** | cn.pokemmo.ui.widget.dropdown.* | **6** | 客户端 ComboBox 下拉组件 (`BaseDropdownWidget` 基类与 Theme, Language, Audio, DisplayMode, Resolution 下拉框) |
| **多标签分页容器面板 (方案三 3C)** | cn.pokemmo.ui.widget.tab.* | **6** | 选项卡复合容器 (`BaseTabbedPanel` 基类与 Simple, Configured, Paged, Named, Dynamic 等 5 类面板) |
| **滚动视口容器组件 (方案三 3D)** | cn.pokemmo.ui.widget.panel.scroll.* | **7** | 可滚动视图容器 (`BaseScrollablePanel` 基类与 Dual, Chat, Item, Inventory, Viewport, Paged 等 6 类滚动组件) |
| **状态进度条与仪表盘 (方案三 3E)** | cn.pokemmo.ui.widget.progress.* | **7** | 进度条控件套件 (`BaseProgressControlWidget` 基类与 Exp, Labeled, Hp, Cast, Smooth, Buffer 等 6 类仪表盘) |
| **响应式属性模型 (方案三 3F)** | cn.pokemmo.ui.widget.model.property.* | **8** | UI 观察者数据模型 (`BaseObservablePropertyModel` 基类与 Entity, Composite, Spacer, Text, Icon, Sprite, Value 等 7 类模型) |
| **ROM 解析、3D 渲染与世界地图引擎 (方案四及全量 ROM)** | cn.pokemmo.rom.*, cn.pokemmo.scene.*, cn.pokemmo.graphics.camera.*, cn.pokemmo.pokemon.* | **69** | GBA/NDS 多语言注册表、NARC虚拟文件树、瓦片集与动画渲染、文本加解密、城镇地图、宝可梦进化与成长模型、3D 枪之柱/过场场景、翻牌机、NSBMD 核心解析器、大世界地图总管与区域矩阵 |

## 二、 兼容垫片设计模式 (Shim / Bridge Pattern)

为了在重构过程中不破坏项目其他数千个类的编译与运行，系统采用了标准双向桥接模式：

```
 [遗留业务代码] -> 调用 f.ro_2 (垫片类) 
                      │
                      ▼ 继承 (extends)
         cn.pokemmo.ui.window.settings.RomManageWindow (现代重构核心)
                      │
                      ▼ asBridge() 强转回
                  f.ro_2 实例 (提供对遗留 API 的完全兼容)
```

- **垫片继承**：f.<ObfuscatedClass> extends cn.pokemmo.<Module>.<CleanName>。垫片类仅保留构造函数转发与遗留接口。
- **安全转型**：新类中通过 public final <ObfuscatedClass> asBridge() { return (<ObfuscatedClass>)(Object)this; }，消除与旧 API 交互时的类型障碍。
- **严禁擅删垫片**：未全部反混淆前，禁止直接删除 src/main/java/f 中的对应同名垫片文件，否则会导致其他依赖类出现符号缺失错误。

---

## 三、 各子模块详细说明

### 1. GUI 窗口系统 (cn.pokemmo.ui.window.*)
将原 f 包下所有分散的窗口控件进行了归类与分层：
- **base (3 类)**: GameWindow (受管窗口基类), FadeableWindow (淡入淡出支持), MinimizableGameWindow (可折叠收起窗口)。
- **admin (21 类)**: 完整的 GM 管理工具箱，包括数据库检索、Cry 音频调试、AI 行为树调试、动作序列、粒子调试与监控面板。
- **battle (6 类)**: PVP 对战排位赛、锦标赛大厅、天梯榜单、对战录像回放与模拟对战视窗。
- **dialog (17 类)**: 系统交互弹窗，覆盖验证码验证、断线通知、努力值分配确认、放生与改名提示框等。
- **inventory (4 类)**: 玩家背包主界面、培育屋蛋孵化、树果培育与多用途物品操作界面。
- **map (8 类)**: 城镇地图、城都/关都/丰缘多区域导航地图，以及树果种植、浇水与采摘窗口。
- **market (6 类)**: 全球交易行 (GTL)、游戏商城、礼品屋、游戏角奖品兑换中心。
- **pokemon (10 类)**: 宝可梦 PC 存储电脑系统 (PokemonStorageWindow)、出战队伍管理、状态值与雷达图概览。
- **settings (8 类)**: 客户端图形/声音设置、游戏操作设定、快捷键绑定面板与 Avatar 时装试衣间。
- **social (9 类)**: 综合聊天频道、聊天设置、邮件系统、公会社团、好友与黑名单管理。
- **misc (16 类)**: 底部技能/道具快捷栏 (HotkeyBar)、登录网页、更新日志、问题上报等辅助窗口。

### 2. 3D 粒子特效引擎 (cn.pokemmo.particle.*)
- **底层修复**：全面修复了 LibGDX 粒子通道在 3D Billboard 渲染下 scaleXY 的数组越界与全白色颗粒问题，恢复原版细腻的技能轨迹与天气氛围。
- **质子与光效 (35 类)**: 反混淆了包括万圣南瓜、蝙蝠群、黑洞、黑猫、闪电光芒、彩虹等全部质子特效控制器。

### 3. ROM 解析与底层数据 (cn.pokemmo.rom.*)
- **GBA 引擎**：支持直接读取与解包 GBA 火红/绿叶/绿宝石 ROM，提取文本字典、精灵数据与脚本多选菜单。
- **NDS 引擎**：完整实现 NitroFS 文件系统与 NARC 虚拟归档，准确解析黑白 (BW)、白金 (DPPT) 与心金魂银 (HGSS) 的地图头与世界坐标。

### 4. NPC 对话、交互与脚本气泡系统 (cn.pokemmo.ui.dialog.* 与 cn.pokemmo.script.menu.*)
- **电脑菜单 B 键取消 Bug 修复**：彻底修复了与 PC 电脑等设施交互时打开多选菜单（打开电脑/交易行/邮件/取消）无法按 B 键取消关闭的缺陷。在 `MessageBoxBubble` 动态多选菜单构建中自动将取消项登记至 `zF` 列表，并在手柄/键盘 B 键响应 (`p3`) 中增加了直接触发最后一条取消选项的容错机制。
- **打字机与富文本**：带打字机逐字播报动画与滚轮翻页支持的文本标签 (`BubbleTypewriterLabel`)、滚轮推进面板 (`BubblePopupLayout`)。
- **多场景交互气泡**：招式选择 (`MoveSelectionBubble`)、招式学习与替换 (`MoveLearningBubble`)、队伍宝可梦槽位选择 (`PokemonPartySelectionBubble`)、二选一确认弹窗 (`ConfirmRejectDialogBubble`) 与脚本多选气泡 (`ScriptChoiceDialogBubble`)。
- **全局管理与 HUD 锚点**：全局气泡管理器 (`MessageBoxManager`)，负责气泡生命周期、层级队列与 3D/2D 坐标对齐计算。

---

## 四、 完整类迁移映射对照表 (Class Mapping Directory)

以下按模块列出全部 **270** 个类的详细新旧对照：

### 3D 粒子特效引擎 (particle)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.ff_0 | cn.pokemmo.particle.ParticleManager | 全局粒子系统与特效管理器 (Particle System & Effect Manager) |
| f.TG0 | cn.pokemmo.particle.ParticleScaleExtUtils | 粒子扩展数值缩放计算工具类 (Particle Scale Ext Utils) |
| f.hk0_0 | cn.pokemmo.particle.ParticleScaleUtils | 粒子数值缩放计算工具类 (Particle Scale Utils) |

### 3D 粒子特效引擎 (particle.action)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.p1_0 | cn.pokemmo.particle.action.ParticleControllerStarterAction | 粒子控制器启动回调动作 (Particle Controller Starter Action) |

### 3D 粒子特效引擎 (particle.animation)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.Gv0 | cn.pokemmo.particle.animation.KeyframeAnimationTrack | 关键帧动画轨迹数据 (Keyframe Animation Track Data) |
| f.mw_0 | cn.pokemmo.particle.animation.TransformedKeyframeTrack | 动态变换与缩放的关键帧动画轨迹 (Transformed Keyframe Track) |

### 3D 粒子特效引擎 (particle.effect)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.sw_0 | cn.pokemmo.particle.effect.BatParticleEffect | 蝙蝠登场质子粒子特效 (Bat Spawn Particle Effect) |
| f.db_0 | cn.pokemmo.particle.effect.BlackCatParticleEffect | 黑猫登场质子粒子特效 (Black Cat Spawn Particle Effect) |
| f.qv_1 | cn.pokemmo.particle.effect.BlackHoleParticleEffect | 黑洞吞噬登场质子粒子特效 (Black Hole Spawn Particle Effect) |
| f.dc_2 | cn.pokemmo.particle.effect.CakeParticleEffect | 周年庆蛋糕登场粒子特效 (Cake Spawn Particle Effect) |
| f.UC | cn.pokemmo.particle.effect.DarkCrystalParticleEffect | 暗黑水晶登场粒子特效 (Dark Crystal Spawn Particle Effect) |
| f.Bv0 | cn.pokemmo.particle.effect.DragonParticleEffect | 龙之波动 / 龙系技能 3D 粒子战斗特效 (Dragon Move 3D Particle Effect) |
| f.ac_0 | cn.pokemmo.particle.effect.EerieHowlParticleEffect | 阴森嚎叫登场质子粒子特效 (Eerie Howl Spawn Particle Effect) |
| f.Sh | cn.pokemmo.particle.effect.EyeParticleEffect | 魔眼登场质子粒子特效 (Eye Spawn Particle Effect) |
| f.Vf | cn.pokemmo.particle.effect.FallOfTheKingParticleEffect | 王权陨落登场质子粒子特效 (Fall of the King Spawn Particle Effect) |
| f.lx_0 | cn.pokemmo.particle.effect.FireworksParticleEffect | 烟花盛宴登场质子粒子特效 (Fireworks Spawn Particle Effect) |
| f.L6 | cn.pokemmo.particle.effect.GhostParticleEffect | 幽灵登场质子粒子特效 (Ghost Spawn Particle Effect) |
| f.q60_0 | cn.pokemmo.particle.effect.GraveyardParticleEffect | 墓地登场质子粒子特效 (Graveyard Spawn Particle Effect) |
| f.lpt5__0 | cn.pokemmo.particle.effect.HitodamaParticleEffect | 鬼火/人魂登场质子粒子特效 (Hitodama Spawn Particle Effect) |
| f.zh_0 | cn.pokemmo.particle.effect.LanternParticleEffect | 节庆灯笼登场质子粒子特效 (Lantern Spawn Particle Effect) |
| f.xo_0 | cn.pokemmo.particle.effect.LevelUpParticleEffect | 宝可梦战斗升级粒子特效 (Level Up Particle Effect) |
| f.mo0_0 | cn.pokemmo.particle.effect.MultiVectorPathParticleEffect | 多向量动力学路径与三段区域贴图粒子战斗特效 (Multi-Vector Path Particle Effect) |
| f.eo_2 | cn.pokemmo.particle.effect.PhantomParticleEffect | 幽灵/幻影系 3D 粒子战斗特效 (Phantom 3D Particle Effect) |
| f.lpt7__1 | cn.pokemmo.particle.effect.PresentParticleEffect | 礼盒登场质子粒子特效 (Present Spawn Particle Effect) |
| f.lg0_0 | cn.pokemmo.particle.effect.PumpcatParticleEffect | 南瓜猫登场质子粒子特效 (Pumpcat Spawn Particle Effect) |
| f.if_0 | cn.pokemmo.particle.effect.PumpkidsTreatParticleEffect | 幼南瓜款待登场质子粒子特效 (Pumpkid's Treat Spawn Particle Effect) |
| f.bm_0 | cn.pokemmo.particle.effect.PumpkingDelightParticleEffect | 南瓜王的欢愉登场质子粒子特效 (Pumpking's Delight Spawn Particle Effect) |
| f.PK0 | cn.pokemmo.particle.effect.PungentStenchParticleEffect | 恶臭弥漫登场质子粒子特效 (Pungent Stench Spawn Particle Effect) |
| f.AF | cn.pokemmo.particle.effect.RisingStarParticleEffect | 冉冉升起之星登场质子粒子特效 (Rising Star Spawn Particle Effect) |
| f.oj0_2 | cn.pokemmo.particle.effect.ScytheParticleEffect | 镰刀登场质子粒子特效 (Scythe Spawn Particle Effect) |
| f.Fq0 | cn.pokemmo.particle.effect.ShinyParticleEffect | 闪光与秘密闪光质子登场粒子特效 (Shiny & Secret Shiny Particle Effect) |
| f.ae0_2 | cn.pokemmo.particle.effect.SnowflakeParticleEffect | 雪花登场质子粒子特效 (Snowflake Spawn Particle Effect) |
| f.Hx0 | cn.pokemmo.particle.effect.SpiderParticleEffect | 幽暗蜘蛛登场质子粒子特效 (Spider Spawn Particle Effect) |
| f.IB | cn.pokemmo.particle.effect.SpiritOfSpringParticleEffect | 春之精灵登场质子粒子特效 (Spirit of Spring Spawn Particle Effect) |
| f.K50 | cn.pokemmo.particle.effect.SpiritombParticleEffect | 花岩怪 / 怨灵系 3D 粒子战斗特效 (Spiritomb / Menacing Spirit Particle Effect) |
| f.WF0 | cn.pokemmo.particle.effect.StatChangeParticleEffect | 战斗能力等级升降粒子特效 (Stat Change Particle Effect) |
| f.ye_1 | cn.pokemmo.particle.effect.WhiteCatParticleEffect | 白猫登场质子粒子特效 (White Cat Spawn Particle Effect) |
| f.F10 | cn.pokemmo.particle.effect.WitchsHazeParticleEffect | 女巫阴霾登场质子粒子特效 (Witch's Haze Spawn Particle Effect) |
| f.i50_0 | cn.pokemmo.particle.effect.XmasWiresParticleEffect | 圣诞彩灯电线登场粒子特效 (Xmas Wires Spawn Particle Effect) |
| f.ja0_1 | cn.pokemmo.particle.effect.ZodiacParticleEffect | 十二生肖/黄道十二宫登场质子粒子特效 (Zodiac Spawn Particle Effect) |
| f.D1 | cn.pokemmo.particle.effect.ZombieHandsParticleEffect | 僵尸之手登场质子粒子特效 (Zombie Hands Spawn Particle Effect) |

### 3D 粒子特效引擎 (particle.follower)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.Ts0 | cn.pokemmo.particle.follower.FloatingPumpkinParticleObject | 悬浮律动南瓜 3D 对象 (Floating Pumpkin Particle Object) |
| f.dx0_0 | cn.pokemmo.particle.follower.PumpkinParticleFollowerObject | 万圣节南瓜/南瓜王跟随者 3D 模型与粒子挂载对象 (Pumpkin Particle Follower Object) |

### 3D 粒子特效引擎 (particle.influencer)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.OG | cn.pokemmo.particle.influencer.AnimatedParticleRegionInfluencer | 序列帧动画粒子贴图影响器 (Animated Particle Region Influencer) |
| f.Dk0 | cn.pokemmo.particle.influencer.DragonAnimatedRegionInfluencer | 龙之波动/龙系技能帧动画粒子影响器 (Dragon Animated Region Influencer) |

### 3D 粒子特效引擎 (particle.modifier)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.E | cn.pokemmo.particle.modifier.ParticleVectorPathModifier | 粒子向量路径动力学修饰器 (Particle Vector Path Modifier) |

### 3D 粒子特效引擎 (particle.vanity)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.cg0_0 | cn.pokemmo.particle.vanity.BattleParticleVanityAction | 战斗质子入场特效触发动作 (Battle Particle Vanity Spawn Action) |
| f.al_0 | cn.pokemmo.particle.vanity.ParticleVanityMapping | 质子特效类型映射表与特效工厂 (Particle Vanity Mapping & Factory) |

### ROM 数据解析 (rom)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.aa0_2 | cn.pokemmo.rom.RomManager | 全局 ROM 总调度管理器 |

### ROM 数据解析 (rom.gba)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.qa0_1 | cn.pokemmo.rom.gba.GbaRom | GbaRom |
| f.br_2 | cn.pokemmo.rom.gba.GbaRomConfig | GBA ROM 偏移与数据结构描述符 |
| f.fx_0 | cn.pokemmo.rom.gba.GbaRomRegistry | GbaRomRegistry |
| f.O2 | cn.pokemmo.rom.gba.GbaRomTable | GBA 卡带类型注册条目 |

### ROM 数据解析 (rom.nds.base)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.Z50 | cn.pokemmo.rom.nds.base.AbstractMapEntry | NDS 单张地图描述基类 |
| f.S80 | cn.pokemmo.rom.nds.base.AbstractMapTable | NDS 地图表抽象基类 |
| f.l50_0 | cn.pokemmo.rom.nds.base.AbstractNdsRom | AbstractNdsRom |

### ROM 数据解析 (rom.nds.bw)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.nj0_0 | cn.pokemmo.rom.nds.bw.BlackWhiteRom | BlackWhiteRom |
| f.ug_0 | cn.pokemmo.rom.nds.bw.BwMapHeaderEntry | 黑白 (Gen 5) 单张地图 48 字节头部描述符 |
| f.tp_1 | cn.pokemmo.rom.nds.bw.BwMapHeaderTable | 黑白 (Gen 5) 地图头数据表 |

### ROM 数据解析 (rom.nds.dppt)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.Ao0 | cn.pokemmo.rom.nds.dppt.DpptMapHeaderEntry | 第4世代 (DPPt / HGSS) 单张地图描述符 |
| f.f1_0 | cn.pokemmo.rom.nds.dppt.DpptMapHeaderTable | 第4世代 (DPPt / HGSS) 地图头数据表 |
| f.Ts | cn.pokemmo.rom.nds.dppt.PlatinumRom | PlatinumRom |

### ROM 数据解析 (rom.nds.fs)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.Ae | cn.pokemmo.rom.nds.fs.NitroFileEntry | NitroFS 虚拟文件条目句柄 |
| f.no0_0 | cn.pokemmo.rom.nds.fs.NitroFileSystem | NitroFS 虚拟文件系统 |

### ROM 数据解析 (rom.nds.header)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.cp_0 | cn.pokemmo.rom.nds.header.NdsRomHeader | NDS ROM Header 解析器 |

### ROM 数据解析 (rom.nds.hgss)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.UY | cn.pokemmo.rom.nds.hgss.HeartGoldSoulSilverRom | HeartGoldSoulSilverRom |

### ROM 数据解析 (rom.nds.narc)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.lo_2 | cn.pokemmo.rom.nds.narc.NarcAllocTable | NARC BTAF 子文件分配表解析器 |
| f.FJ | cn.pokemmo.rom.nds.narc.NarcArchive | NARC (Nitro ARChive) 归档解析器 |
| f.Rz0 | cn.pokemmo.rom.nds.narc.NarcHeader | NARC 归档头部校验器 |

### UI 窗口系统 (admin)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.Lt0 | cn.pokemmo.ui.window.admin.AdminDatabaseSearchWindow | 后台道具/技能/地图/文本全库搜索窗口 |
| f.xj_1 | cn.pokemmo.ui.window.admin.AdminPromptWindow | 管理员必填提示弹窗 |
| f.lpt9__0 | cn.pokemmo.ui.window.admin.BulkCommandsWindow | 批量GM指令执行窗口 |
| f.n6_0 | cn.pokemmo.ui.window.admin.CryDebuggerWindow | 宝可梦叫声调试器窗口 |
| f.H50 | cn.pokemmo.ui.window.admin.GmMenuWindow | GM在线管理与频道控制主菜单 |
| f.qg_0 | cn.pokemmo.ui.window.admin.GraphicsDebuggerWindow | 图形压缩与配置调试器窗口 |
| f.Ft0 | cn.pokemmo.ui.window.admin.GuiDebuggerWindow | Shu GUI全局界面调试器窗口 |
| f.UV | cn.pokemmo.ui.window.admin.MapDebuggerWindow | 地图图块与网格调试器窗口 |
| f.xb0_1 | cn.pokemmo.ui.window.admin.MountOffsetsDebuggerWindow | 坐骑精灵帧偏移量调试器窗口 |
| f.la_2 | cn.pokemmo.ui.window.admin.NpcInteractionWindow | NPC交互事件调试窗口 |
| f.Ax0 | cn.pokemmo.ui.window.admin.NpcSpriteDebuggerWindow | NPC精灵图集与动画帧调试器 |
| f.uk_0 | cn.pokemmo.ui.window.admin.NpcToolWindow | NPC编辑器与自定义生成工具窗口 |
| f.sk0_2 | cn.pokemmo.ui.window.admin.PlayerActionsWindow | 玩家快捷惩罚与操作面板 |
| f.Ju0 | cn.pokemmo.ui.window.admin.PlayerInspectWindow | 玩家审查与在线巡查窗口 |
| f.my0 | cn.pokemmo.ui.window.admin.PlayerSearchWindow | 管理员玩家搜索窗口 (Admin Player Search Window) |
| f.ek0_0 | cn.pokemmo.ui.window.admin.ProgressBarWindow | 倒计时进度条窗口 |
| f.t6_0 | cn.pokemmo.ui.window.admin.ResourceDumpDialogWindow | 客户端资源转储对话框 |
| f.f90_0 | cn.pokemmo.ui.window.admin.SoundDebuggerWindow | BGM与游戏音效调试器窗口 |
| f.o40_0 | cn.pokemmo.ui.window.admin.TeleportDirectionWindow | 传送方向选择浮窗 |
| f.do_0 | cn.pokemmo.ui.window.admin.TeleportMenuWindow | GM传送与热点传送菜单窗口 |
| f.vp0_0 | cn.pokemmo.ui.window.admin.VectorColorWindow | 向量与颜色调试窗口 |

### UI 窗口系统 (base)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.yz_1 | cn.pokemmo.ui.window.base.FadeableWindow | 具有淡入淡出动画与 ESC 快捷关闭支持的窗口基类 (Fadeable Window) |
| f.cx_0 | cn.pokemmo.ui.window.base.GameWindow | 游戏受管窗口基类 (Managed Game Window) |
| f.nx_2 | cn.pokemmo.ui.window.base.MinimizableGameWindow | 可折叠/最小化的游戏窗口基类 (Minimizable Game Window) |

### UI 窗口系统 (battle)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.kl0_0 | cn.pokemmo.ui.window.battle.BattleSimulationWindow | BattleSimulationWindow |
| f.m1_0 | cn.pokemmo.ui.window.battle.InstanceMatchmakingWindow | 副本/活动匹配窗口 |
| f.Yl | cn.pokemmo.ui.window.battle.PvPMatchmakingWindow | PVP排位赛与锦标赛匹配主窗口 |
| f.kf0_2 | cn.pokemmo.ui.window.battle.PvPStatsWindow | 匹配与排位战绩统计窗口 |
| f.xy0_0 | cn.pokemmo.ui.window.battle.RankedLeaderboardWindow | 天梯排行榜与高分天梯榜窗口 |
| f.ic_0 | cn.pokemmo.ui.window.battle.TournamentScoreboardWindow | 官方锦标赛计分板窗口 |

### UI 窗口系统 (dialog)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.lpt3__4 | cn.pokemmo.ui.window.dialog.ActionConfirmDialogWindow | 操作二次确认弹窗 |
| f.AC | cn.pokemmo.ui.window.dialog.CaptchaDialogWindow | Could not load the following classes: |
| f.x3_0 | cn.pokemmo.ui.window.dialog.DeleteConfirmDialogWindow | 删除/放生危险确认弹窗 |
| f.K6 | cn.pokemmo.ui.window.dialog.DisconnectionDialogWindow | 断开连接与反作弊提示弹窗 |
| f.Z70 | cn.pokemmo.ui.window.dialog.EvConfirmDialogWindow | 努力值分配确认弹窗 |
| f.oz_2 | cn.pokemmo.ui.window.dialog.ExactMatchConfirmDialogWindow | 文本精确匹配确认弹窗 |
| f.md0_0 | cn.pokemmo.ui.window.dialog.GenericConfirmDialogWindow | 通用询问弹窗 |
| f.ox_1 | cn.pokemmo.ui.window.dialog.InputConfirmDialogWindow | 带输入框确认对话框基类 |
| f.IZ | cn.pokemmo.ui.window.dialog.ItemAmountDialogWindow | 道具数量选择确认弹窗 |
| f.jy0 | cn.pokemmo.ui.window.dialog.NoticeDialogWindow | 系统公告通知弹窗 |
| f.qj0_2 | cn.pokemmo.ui.window.dialog.PaymentConfirmDialogWindow | 付费确认弹窗 |
| f.ok_1 | cn.pokemmo.ui.window.dialog.PriceAdjustDialogWindow | 价格调整确认弹窗 |
| f.bg_1 | cn.pokemmo.ui.window.dialog.QuantityConfirmDialogWindow | 数量确认输入弹窗 |
| f.oi0_0 | cn.pokemmo.ui.window.dialog.RulesDialogWindow | 玩家行为守则对话框 |
| f.bu0_0 | cn.pokemmo.ui.window.dialog.SimpleConfirmDialogWindow | SimpleConfirmDialogWindow |
| f.mt_1 | cn.pokemmo.ui.window.dialog.TimedConfirmDialogWindow | 带倒计时确认弹窗 |
| f.uf0_0 | cn.pokemmo.ui.window.dialog.WarningDialogWindow | 警告提示对话框 |

### UI 窗口系统 (inventory)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.di0_1 | cn.pokemmo.ui.window.inventory.BreedingWindow | 培育屋孵蛋与携带道具窗口 |
| f.jc_2 | cn.pokemmo.ui.window.inventory.InventoryWindow | 玩家背包物品栏大窗口 |
| f.qv0_0 | cn.pokemmo.ui.window.inventory.ItemSlotDetailWindow | 物品槽位详情展示小窗 |
| f.VK | cn.pokemmo.ui.window.inventory.MultiUseItemWindow | 批量使用道具/增减使用弹窗 |

### UI 窗口系统 (map)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.VL | cn.pokemmo.ui.window.map.BerryCrushWindow | 树果粉碎调和窗口 |
| f.qf0_1 | cn.pokemmo.ui.window.map.BerryFertilizeWindow | 树果施肥弹窗 |
| f.n4_0 | cn.pokemmo.ui.window.map.BerryHarvestWindow | 树果采摘弹窗 |
| f.ur_1 | cn.pokemmo.ui.window.map.BerryItemWindow | 树果物品小窗 |
| f.j8_0 | cn.pokemmo.ui.window.map.BerryWaterWindow | 树果浇水管理弹窗 |
| f.kt_1 | cn.pokemmo.ui.window.map.MysteriousGemWindow | 神秘宝石插槽窗口 |
| f.ef_0 | cn.pokemmo.ui.window.map.SeedPlantWindow | 树果种子种植弹窗 |
| f.lf0_0 | cn.pokemmo.ui.window.map.TownMapWindow | 地区全景城镇地图窗口 |

### UI 窗口系统 (market)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.in0_0 | cn.pokemmo.ui.window.market.DonationWindow | 赞助与捐赠链接对话框 |
| f.LF0 | cn.pokemmo.ui.window.market.GiftShopWindow | 礼品点数商城窗口 |
| f.lr_0 | cn.pokemmo.ui.window.market.GlobalTradeMarketWindow | 全球交易行主大厅/拍卖购买窗口 |
| f.Uo | cn.pokemmo.ui.window.market.ItemShopWindow | 友好商店NPC道具商店窗口 |
| f.HX | cn.pokemmo.ui.window.market.PrizeCornerWindow | 游戏厅代币奖品兑换角落窗口 |
| f.gc_0 | cn.pokemmo.ui.window.market.TradeWindow | 玩家面对面交易主窗口 |

### UI 窗口系统 (misc)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.ur_2 | cn.pokemmo.ui.window.misc.BasePaddingWindow | 边距辅助容器窗口 |
| f.zx_0 | cn.pokemmo.ui.window.misc.ChangelogWindow | 版本更新公告与日志窗口 |
| f.IA | cn.pokemmo.ui.window.misc.HotkeyBarWindow | 快捷键技能道具栏悬浮窗 |
| f.wr0 | cn.pokemmo.ui.window.misc.InstanceInfoWindow | 副本地图信息悬浮窗 |
| f.y4_0 | cn.pokemmo.ui.window.misc.LoginWebWindow | 登录Web网页集成窗口 |
| f.JV | cn.pokemmo.ui.window.misc.MapPreviewWindow | 地图缩略图小窗 |
| f.Bn0 | cn.pokemmo.ui.window.misc.MoveTutorWindow | 招式教学狂学习技能窗口 |
| f.ox_0 | cn.pokemmo.ui.window.misc.NotificationWindow | 游戏内悬浮通知弹窗 |
| f.nm0_0 | cn.pokemmo.ui.window.misc.PartyQuickWindow | 队伍快速状态浮窗 |
| f.qh_1 | cn.pokemmo.ui.window.misc.PlayerEffectsWindow | 玩家光环特效选择窗口 |
| f.sr_0 | cn.pokemmo.ui.window.misc.PuzzleMiniGameWindow | 遗迹石板拼图小游戏窗口 |
| f.pe0_2 | cn.pokemmo.ui.window.misc.SecretBaseDecorateWindow | 秘密基地家具装饰布置窗口 |
| f.ba0_2 | cn.pokemmo.ui.window.misc.SharedMinimizedWindow | 通用最小化悬浮窗 |
| f.s_0 | cn.pokemmo.ui.window.misc.SubPartyWindow | 副队伍状态悬浮窗 |
| f.ju_2 | cn.pokemmo.ui.window.misc.TimerMinimizedWindow | 倒计时最小化悬浮窗 |
| f.gc0_1 | cn.pokemmo.ui.window.misc.TrainerHudWindow | 玩家HUD状态悬浮窗 |

### UI 窗口系统 (pokemon)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.WG0 | cn.pokemmo.ui.window.pokemon.BattleStatsWindow | 战斗数值/属性统计对比窗口 |
| f.tl_2 | cn.pokemmo.ui.window.pokemon.BoxSlotPreviewWindow | 箱子槽位与规则合规性悬浮预览窗口 |
| f.Rs0 | cn.pokemmo.ui.window.pokemon.MobilePokemonStatusWindow | 移动端宝可梦状态槽位悬浮窗 |
| f.wg0_0 | cn.pokemmo.ui.window.pokemon.PartyManagementWindow | 队伍排列与电脑互移窗口 |
| f.b40_0 | cn.pokemmo.ui.window.pokemon.PartyStatsWindow | PartyStatsWindow |
| f.cb0_1 | cn.pokemmo.ui.window.pokemon.PlayerStatsWindow | 玩家训练家全局数据统计窗口 |
| f.fd0_0 | cn.pokemmo.ui.window.pokemon.PokedexWindow | 全国宝可梦图鉴主窗口 |
| f.QT | cn.pokemmo.ui.window.pokemon.PokemonStorageWindow | PokemonStorageWindow |
| f.ng_2 | cn.pokemmo.ui.window.pokemon.PokemonSummaryWindow | PokemonSummaryWindow |
| f.TH | cn.pokemmo.ui.window.pokemon.RentalPokemonWindow | 租赁宝可梦窗口 |

### UI 窗口系统 (settings)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.j20 | cn.pokemmo.ui.window.settings.AvatarCustomizationWindow | 角色时装与外观自定义窗口 |
| f.pj0_2 | cn.pokemmo.ui.window.settings.ClientSettingsWindow | 控制键位、视频与ROM导入设置窗口 |
| f.wt_0 | cn.pokemmo.ui.window.settings.ColorPickerWindow | UI主题色与地图四季调色盘窗口 |
| f.s90_0 | cn.pokemmo.ui.window.settings.FaqHelpWindow | 帮助中心与常见问题FAQ窗口 |
| f.QC | cn.pokemmo.ui.window.settings.GameSettingsWindow | 游戏系统主设置窗口 |
| f.mf_1 | cn.pokemmo.ui.window.settings.ModManagerWindow | 客户端Mod模组管理窗口 |
| f.ro_2 | cn.pokemmo.ui.window.settings.RomManageWindow | ROM管理与校验设置窗口 |
| f.COm8_ | cn.pokemmo.ui.window.settings.WardrobeWindow | 个人衣橱与时装搭配窗口 |

### UI 窗口系统 (social)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.XH | cn.pokemmo.ui.window.social.ChatDetailWindow | 聊天历史与玩家快捷交互详情面板 |
| f.vx_1 | cn.pokemmo.ui.window.social.ChatSettingsWindow | 聊天透明度与频道标签配置窗口 |
| f.es_2 | cn.pokemmo.ui.window.social.ChatWindow | 聊天频道与社交聊天主窗口 |
| f.ab_1 | cn.pokemmo.ui.window.social.GuildWindow | 公会主面板与日志窗口 |
| f.qu_2 | cn.pokemmo.ui.window.social.MailWindow | 游戏内邮件阅读与书写发送窗口 |
| f.nq_1 | cn.pokemmo.ui.window.social.PrivateMessageWindow | 好友私聊弹窗 |
| f.vl_0 | cn.pokemmo.ui.window.social.SocialSearchWindow | 社交好友/玩家搜索窗口 |
| f.jf_0 | cn.pokemmo.ui.window.social.TrainerCardWindow | 训练家档案卡片窗口 |
| f.zs_2 | cn.pokemmo.ui.window.social.WordPingWindow | 聊天关键字提示配置窗口 |

### 基础图形与工具 (graphics.texture)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.gv0 | cn.pokemmo.graphics.texture.KtxLoaderInfo | KTX 纹理异步加载信息承载类 (KTX Texture Loader Info) |

### 宝可梦数据与招式 (pokemon)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.VU | cn.pokemmo.pokemon.ActivePokemon | 运行时活跃宝可梦包装器 (Active Pokemon Model) |
| f.CE | cn.pokemmo.pokemon.PokemonData | 宝可梦核心实例数据模型 (Pokemon Data Model) |
| f.rz_0 | cn.pokemmo.pokemon.PokemonNature | 宝可梦性格定义 (Pokemon Nature) |

### 宝可梦数据与招式 (pokemon.move)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.yw_0 | cn.pokemmo.pokemon.move.MoveDamageCategory | 招式伤害分类 (Move Damage Category) |
| f.ec0_2 | cn.pokemmo.pokemon.move.MoveDatabase | 技能数据库管理类 (Move Database) |
| f.vk0_1 | cn.pokemmo.pokemon.move.PokemonMove | 宝可梦技能定义 (Pokemon Move Definition) |

### 宝可梦数据与招式 (pokemon.pokedex)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.mp_1 | cn.pokemmo.pokemon.pokedex.PokedexDatabase | 全国宝可梦图鉴数据库单例 (Pokédex Database) |
| f.cq_0 | cn.pokemmo.pokemon.pokedex.PokedexEntry | 宝可梦图鉴基础种族条目 (Pokédex Entry) |

### 宝可梦数据与招式 (pokemon.type)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.i40_0 | cn.pokemmo.pokemon.type.PokemonType | 宝可梦属性体系与属性相克矩阵 (Pokemon Type & Effectiveness Matrix) |

### 对战系统 (battle)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.Dm0 | cn.pokemmo.battle.BattleContext | 对战上下文与战斗状态机 (Battle Context) |
| f.Vz0 | cn.pokemmo.battle.BattleEndReason | 战斗结束原因/对战结果类型 (Battle End Reason) |
| f.zg0_0 | cn.pokemmo.battle.BattleEnvironment | 战场环境与场地类型 (Battle Environment / Terrain) |
| f.Cq | cn.pokemmo.battle.BattleFormat | 对战赛制/模式枚举 (Battle Format) |
| f.CH0 | cn.pokemmo.battle.BattleParticipantId | 对战参与者唯一标识 (Battle Participant ID) |
| f.VF0 | cn.pokemmo.battle.BattlePokemonSummary | 对战中宝可梦出场概况 (Battle Pokemon Summary) |
| f.xh_0 | cn.pokemmo.battle.BattleSideContainer | 战斗单侧战场容器 (Battle Side Container) |
| f.gc_2 | cn.pokemmo.battle.BattleStat | 宝可梦战斗属性枚举 (Battle Stat) |
| f.Mj | cn.pokemmo.battle.PokemonFieldContainer | 战场宝可梦槽位容器 (Pokemon Field Container) |

### 对战系统 (battle.tier)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.av_1 | cn.pokemmo.battle.tier.BattleTier | 对战分级/分档枚举 (Battle Tier) |
| f.N2 | cn.pokemmo.battle.tier.TierCategory | 对战分级大类/层级 (Tier Category) |

### 对战系统 (battle.weather)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.d70_0 | cn.pokemmo.battle.weather.BattleWeather | 对战天气状态 (Battle Weather) |

### 物品与背包 (item)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.l5_0 | cn.pokemmo.item.BagPocket | 背包口袋分类枚举 (Bag Pocket Category) |
| f.gu0 | cn.pokemmo.item.ItemDatabase | 全局物品数据库单例 (Item Database) |
| f.K5 | cn.pokemmo.item.ItemStack | 背包单格堆叠物品对象 (Item Stack) |
| f.mc0_1 | cn.pokemmo.item.ItemTemplate | 物品原型/模板核心数据模型 (Item Template) |
| f.RJ0 | cn.pokemmo.item.PlayerBag | 玩家背包与库存容器 (Player Bag / Inventory) |

### 网络通信层 (net)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.z60_0 | cn.pokemmo.net.NetworkManager | 网络通信管理器 (Network Manager) |

### 网络通信层 (net.connection)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.d50_0 | cn.pokemmo.net.connection.NetworkConnection | 物理网络连接抽象基类 (Network Connection) |

### 网络通信层 (net.nio)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.fk_1 | cn.pokemmo.net.nio.AbstractNioWorker | NIO 事件循环工作线程抽象基类 (Abstract NIO Worker) |
| f.ED0 | cn.pokemmo.net.nio.NioReadWriteWorker | NIO 读写事件循环工作线程 (Read/Write Worker Thread) |

### 网络通信层 (net.packet)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.ZF0 | cn.pokemmo.net.packet.AbstractPayloadPacket | 载荷编码出站数据包抽象基类 (Payload Outbound Packet) |
| f.gl0_2 | cn.pokemmo.net.packet.InboundPacket | 客户端入站数据包抽象基类 (Clientbound Inbound Packet) |
| f.bo_1 | cn.pokemmo.net.packet.OutboundPacket | 出站数据包抽象基类 (Serverbound Outbound Packet) |
| f.JM | cn.pokemmo.net.packet.Packet | 数据包顶级抽象基类 (Base Packet) |
| f.Mu0 | cn.pokemmo.net.packet.PacketDirection | 数据包传输方向 (Packet Direction) |

### 网络通信层 (net.session)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.TX | cn.pokemmo.net.session.GameSession | 游戏世界主网络会话 (Main Game Session) |
| f.Ry | cn.pokemmo.net.session.LoginSession | 登录认证网络会话 (Login Authentication Session) |
| f.ky_2 | cn.pokemmo.net.session.ProtocolSession | 加密网络协议会话抽象基类 (Encrypted Protocol Session) |
| f.k20_0 | cn.pokemmo.net.session.ShopSession | 商城与增值服务网络会话 (Shop Service Session) |

### 脚本交互与多选菜单 (script.menu)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.LG0 | cn.pokemmo.script.menu.ScriptMenuOptionGroup | 单组多选菜单条目（包含选项 ID、文本列表与字串 ID 列表） |
| f.a20 | cn.pokemmo.script.menu.ScriptMenuRegistry | ROM 与脚本动态多选菜单注册映射表 |
| f._case | cn.pokemmo.script.menu.ScriptChoiceMenuManager | 多选菜单全局管理器，根据索引与类型提供选项字符串数组 |

### 对话交互基础与类型 (ui.dialog.base)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.S0 | cn.pokemmo.ui.dialog.base.MessageBoxCallback | 对话框交互完成选择回调函数接口 |
| f.jm_1 | cn.pokemmo.ui.dialog.base.MessageBoxType | 对话气泡样式、交互模式与排版标志枚举 |
| f.iw_1 | cn.pokemmo.ui.dialog.base.AbstractMessageBox | 所有对话框与交互气泡视窗的抽象基类 |

### 对话气泡专用组件 (ui.dialog.component)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.fg0_1 | cn.pokemmo.ui.dialog.component.BubbleOptionButton | 气泡选项专用按钮控件（适配 Enter/Space 触发与事件冒泡） |
| f.Nr0 | cn.pokemmo.ui.dialog.component.BubbleTypewriterLabel | 带打字机逐字播报动画与滚轮翻页支持的对话文本标签 |
| f.ph_0 | cn.pokemmo.ui.dialog.component.BubblePopupLayout | NPC 对话交互气泡底层面板与滚轮推进事件监听器 |

### 对话交互气泡视窗 (ui.dialog.bubble)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.Q7 | cn.pokemmo.ui.dialog.bubble.MessageBoxBubble | 核心通用 NPC 交互与文字/选项气泡（内置电脑菜单 B 键取消修复） |
| f.C | cn.pokemmo.ui.dialog.bubble.ScriptChoiceDialogBubble | 脚本多选交互派生气泡，拦截按键 B 触发 127 取消响应 |
| f.og0_1 | cn.pokemmo.ui.dialog.bubble.FixedPositionMessageBoxBubble | 固定在指定坐标/世界坐标的 NPC 提示与交互气泡 |
| f.OU | cn.pokemmo.ui.dialog.bubble.ConfirmRejectDialogBubble | 带确认/拒绝两个按钮的标准二选一交互弹窗 |
| f.jl_0 | cn.pokemmo.ui.dialog.bubble.MoveSelectionBubble | NPC 交互中的 4 个宝可梦招式选择气泡 |
| f.dg_2 | cn.pokemmo.ui.dialog.bubble.MoveLearningBubble | 宝可梦学习新招式时的招式遗忘与替换选择气泡 |
| f.y20_0 | cn.pokemmo.ui.dialog.bubble.PokemonPartySelectionBubble | 队伍中 6 只宝可梦槽位选择气泡（培育屋/对战点数/同行检查） |

### 对话气泡全局管理器 (ui.dialog.manager)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.pk0_0 | cn.pokemmo.ui.dialog.manager.MessageBoxManager | 全局气泡管理器，负责网络封包分发、层级堆叠与 HUD 坐标对齐 |

---

## 五、 开发与维护准则

1. **新增重构类规范**：
   - 新类统一放置在 cn.pokemmo.<业务模块> 包下，使用语义明确的大驼峰命名。
   - 必须在原 src/main/java/f/ 目录下保留同名垫片类，继承该重构类。
   - 新类中必须保留 sBridge() 方法以便与老代码交互。
2. **编译验证**：
   - 每次重构或修改后，务必执行 mvn compiler:compile -DskipTests，必须保证 0 错误通过。
3. **文档同步**：
   - 任何新增迁移的类，必须及时更新本 README.md 的对照表，方便团队其他开发者随时查阅。


### 对战主控与战斗 HUD (ui.battle)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.I30 | cn.pokemmo.ui.battle.BattleMessageOverlay | 对战消息浮层与解说播报抽象基类 (Battle Message Overlay) |
| f.eg_1 | cn.pokemmo.ui.battle.BattleSwitchReturnButton | 对战精灵切换与道具使用返回按钮面板 (Battle Switch Return Button) |
| f.ak0_2 | cn.pokemmo.ui.battle.BattlePokemonSlotButton | 对战出战精灵/队伍槽位按钮控件 (Battle Pokemon Slot Button) |
| f.jd0_1 | cn.pokemmo.ui.battle.BattlePokemonHealthHud | 对战精灵血条与状态栏 HUD (Battle Pokemon Health HUD) |
| f.ML0 | cn.pokemmo.ui.battle.BattleCombatLayout | 对战主控与战斗 HUD 界面面板 (Battle Combat Layout) |

### 音频引擎系统 (audio)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.ff0_0 | cn.pokemmo.audio.AudioChannel | 音频声道与音量配置枚举/通道类 (Audio Channel Profile) |
| f.OE0 | cn.pokemmo.audio.AudioPlayer | 音频播放器核心接口 (Audio Player) |
| f.Xu0 | cn.pokemmo.audio.MidiMusicPlayer | MIDI音乐/空音频播放器实现 (Midi Music Player) |
| f.CB0 | cn.pokemmo.audio.CrySoundDatabase | 宝可梦叫声与缓存音效数据库 (Cry Sound Database) |
| f.x30 | cn.pokemmo.audio.SoundEffectPlayer | 音效频次限制与节流控制器 (Sound Effect Player / Throttle) |
| f.bu_0 | cn.pokemmo.audio.AudioManager | 音频主引擎与全局声音管理器 (Audio Manager) |

### 按键手柄输入系统 (input)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.BO | cn.pokemmo.input.KeyBindingActionCallback | 按键动作触发回调接口 (Key Binding Action Callback) |
| f.rp_0 | cn.pokemmo.input.KeyBinding | 游戏按键动作与手柄映射绑定 (Key Binding) |
| f.eo_0 | cn.pokemmo.input.GamepadManager | 手柄设备检测与生命周期管理器 (Gamepad Controller Manager) |
| f.gc0_0 | cn.pokemmo.input.ControllerConfiguration | 手柄按键与轴向映射配置管理器 (Controller Configuration) |

### 客户端全局配置 (config)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f._interface | cn.pokemmo.config.ConfigField | 客户端配置项元数据注解 (Client Config Field Annotation) |
| f.s8_0 | cn.pokemmo.config.PropertiesFileIO | 客户端配置属性文件序列化读写器 (Properties File IO) |
| f.lpt3__1 | cn.pokemmo.config.ClientInternalConfig | 客户端内部与网络调试配置 (Client Internal Config) |
| f.dw_2 | cn.pokemmo.config.ClientSettings | 客户端玩家全局设置 (Client Settings) |

### 大世界地图与实体系统 (world)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.bi0_1 | cn.pokemmo.world.entity.WorldEntity | 大世界地图场景实体基类 (World Entity Base) |
| f.E90 | cn.pokemmo.world.entity.PlayerActor | 玩家主角与同屏玩家角色实体 (Player Actor) |
| f.yt_1 | cn.pokemmo.world.WorldManager | 大世界地图场景与实体总管理器 (World Manager) |


### 大世界外围与视口控制 (world.camera & world.weather)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.ru0_0 | cn.pokemmo.world.camera.CameraController | 3D/2D 摄像机控制器与多区域视口追踪 (Camera Controller) |
| f.s4_0 | cn.pokemmo.world.weather.MapWeatherType | 大世界地图天气环境类型枚举 (Map Weather Type) |

### 社交聊天与富文本引擎 (chat)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.zo_0 | cn.pokemmo.chat.ChatChannel | 游戏综合聊天频道枚举 (Chat Channel) |
| f.dc0_1 | cn.pokemmo.chat.ChatMessageToken | 聊天富文本消息行段模型 (Chat Message Token) |
| f.ZJ | cn.pokemmo.chat.RichTextBuffer | 打字机效果富文本滚动标签与渲染缓存 (Rich Text Buffer) |

### 角色名牌与系统弹窗 (ui.nameplate & ui.dialog.base)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.tj0_0 | cn.pokemmo.ui.nameplate.NameplateHud | 玩家与 NPC 角色头顶名牌与状态 HUD (Nameplate HUD) |
| f.ss_2 | cn.pokemmo.ui.dialog.base.SystemAlertHandler | 系统模态警报与确认弹窗抽象处理器 (System Alert Handler) |

### 图形状态、字体与纹理模式 (graphics & graphics.font)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.Kr0 | cn.pokemmo.graphics.GraphicsStateManager | OpenGL 图形渲染上下文与着色器状态管理器 (Graphics State Manager) |
| f.Jw | cn.pokemmo.graphics.font.GlyphBitmapData | 字体字形位图原始像素数据 (Glyph Bitmap Data) |
| f.q8_0 | cn.pokemmo.graphics.TextureWrapMode | 纹理贴图环绕与裁剪模式枚举 (Texture Wrap Mode) |

### 对战录像与 HUD 动作事件 (battle.replay & battle.animation)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.xr_0 | cn.pokemmo.battle.replay.BattleReplayPlayer | 对战录像二进制回放器 (Battle Replay Player) |
| f.lpt2__4 | cn.pokemmo.battle.animation.BattleHudAction | 对战精灵入场与 HUD 界面动作事件 (Battle HUD Action) |

### 配置指令与服务器特性开关 (config & command.admin)

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.h50_0 | cn.pokemmo.config.ServerFeatureFlags | 服务器特性开关与数值上限配置 (Server Feature Flags) |
| f.B80 | cn.pokemmo.command.admin.SetClientConfigCommand | 客户端配置项修改指令 (Set Client Config Command) |


### 8. 宝可梦对战招式动画执行器 (cn.pokemmo.battle.animation.move.gen1.*)

包含全国图鉴第一世代（Generation 1，技能编号 Move ID 1 ~ 165）全部 165 个招式动画执行器。所有类均继承自 .MU，负责编排 3D 粒子特效 (ParticleEffectExt)、音效 (AudioManager)、相机震动与精灵模型位移：
- **经典物理招式**: PoundAnimation (拍击), KarateChopAnimation (空手劈), DoubleSlapAnimation (连环巴掌), CometPunchAnimation (连续拳), MegaPunchAnimation (百万吨重拳), FirePunchAnimation (火焰拳), IcePunchAnimation (冷冻拳), ThunderPunchAnimation (雷电拳), ScratchAnimation (抓), GuillotineAnimation (断头钳), CutAnimation (居合斩), FlyAnimation (飞翔), DoubleKickAnimation (双踢), TackleAnimation (撞击), BodySlamAnimation (泰山压顶), TakeDownAnimation (猛撞), DoubleEdgeAnimation (舍身冲撞), BiteAnimation (咬住), HyperFangAnimation (必杀门牙), SuperFangAnimation (愤怒门牙), SlashAnimation (劈开) 等。
- **特殊属性招式**: EmberAnimation (火花), FlamethrowerAnimation (喷射火焰), FireBlastAnimation (大字爆炎), WaterGunAnimation (水枪), HydroPumpAnimation (水炮), SurfAnimation (冲浪), IceBeamAnimation (冰冻光束), BlizzardAnimation (暴风雪), ThunderShockAnimation (电击), ThunderboltAnimation (十万伏特), ThunderAnimation (打雷), EarthquakeAnimation (地震), FissureAnimation (地裂), PsychicAnimation (精神强念), NightShadeAnimation (黑夜魔影), HyperBeamAnimation (破坏光线) 等。
- **蓄力双回合招式 (Kh())**: SolarBeamAnimation (日光束), SkullBashAnimation (火箭头锤), RazorWindAnimation (旋风刀), SkyAttackAnimation (神鸟猛击) 等。
- **变化与增益招式**: SwordsDanceAnimation (剑舞), SingAnimation (唱歌), SupersonicAnimation (超音波), DisableAnimation (定身法), MistAnimation (白雾), LeechSeedAnimation (寄生种子), GrowthAnimation (生长), ToxicAnimation (剧毒), HypnosisAnimation (催眠术), AgilityAnimation (高速移动), RecoverAnimation (自我再生), DoubleTeamAnimation (影子分身), ConfuseRayAnimation (奇异之光), MetronomeAnimation (挥指), TransformAnimation (变身), SubstituteAnimation (替身), StruggleAnimation (挣扎) 等。


### 9. 宝可梦对战招式动画执行器 (cn.pokemmo.battle.animation.move.gen2.*)

包含全国图鉴第二世代（Generation 2，技能编号 Move ID 166 ~ 251）全部 86 个招式动画执行器。所有类均继承自 .MU，全面编排第二世代引入的钢系、恶系及天气/场地等核心技能：
- **经典输出招式**: ShadowBallAnimation (暗影球), ExtremeSpeedAnimation (神速), CrossChopAnimation (十字劈), CrunchAnimation (咬碎), AeroblastAnimation (气旋攻击), SacredFireAnimation (神圣之火), DynamicPunchAnimation (爆裂拳), MegahornAnimation (超级角击), DragonBreathAnimation (龙息), IronTailAnimation (铁尾), MetalClawAnimation (金属爪), AncientPowerAnimation (原始之力), GigaDrainAnimation (终极吸取), SludgeBombAnimation (污泥炸弹), ZapCannonAnimation (电磁炮), IcyWindAnimation (冰冻之风), OutrageAnimation (逆鳞), RolloutAnimation (滚动), SparkAnimation (电光), SteelWingAnimation (钢翼), MachPunchAnimation (音速拳), FeintAttackAnimation (出奇一击), MudSlapAnimation (掷泥), OctazookaAnimation (章鱼桶炮), RockSmashAnimation (碎岩), WhirlpoolAnimation (潮旋), BeatUpAnimation (围攻) 等。
- **战术防守与变化招式**: ProtectAnimation (守住), DetectAnimation (看穿), EndureAnimation (挺住), DestinyBondAnimation (同命), PerishSongAnimation (灭亡之歌), SpikesAnimation (撒菱), CurseAnimation (诅咒), BellyDrumAnimation (腹鼓), BatonPassAnimation (接棒), EncoreAnimation (再来一次), PursuitAnimation (追打), RapidSpinAnimation (高速旋转), MirrorCoatAnimation (镜面反射), FutureSightAnimation (预知未来), PsychUpAnimation (自我暗示), PainSplitAnimation (分担痛楚), HealBellAnimation (治愈铃声), SafeguardAnimation (神秘守护), MilkDrinkAnimation (喝牛奶), SweetKissAnimation (天使之吻), CharmAnimation (撒娇), SwaggerAnimation (虚张声势), AttractAnimation (迷人), SleepTalkAnimation (梦话), ReturnAnimation (报恩), FrustrationAnimation (迁怒), PresentAnimation (礼物), FalseSwipeAnimation (点到为止) 等。
- **天气与时间招式**: RainDanceAnimation (求雨), SunnyDayAnimation (大晴天), SandstormAnimation (沙暴), MorningSunAnimation (晨光), SynthesisAnimation (光合作用), MoonlightAnimation (月光) 等。


### 10. 宝可梦对战招式动画执行器 (cn.pokemmo.battle.animation.move.gen3.*)

包含全国图鉴第三世代（Generation 3，技能编号 Move ID 252 ~ 354）全部 103 个招式动画执行器。所有类均继承自 .MU，全面编排第三世代丰缘地区引入的特性联动与爆发性大招：
- **经典强力输出招式**: VoltTackleAnimation (伏特攻击), LeafBladeAnimation (叶刃), MeteorMashAnimation (彗星拳), EruptionAnimation (喷火), WaterSpoutAnimation (喷水), HydroCannonAnimation (加农水炮), BlastBurnAnimation (爆炸烈焰), FrenzyPlantAnimation (疯狂植物), SuperpowerAnimation (蛮力), BrickBreakAnimation (劈瓦), OverheatAnimation (过热), BlazeKickAnimation (火焰踢), DragonClawAnimation (龙爪), SheerColdAnimation (绝对零度), DoomDesireAnimation (破灭之愿), PsychoBoostAnimation (精神突击), LusterPurgeAnimation (洁净光芒), MistBallAnimation (薄雾球), HeatWaveAnimation (热风), HyperVoiceAnimation (巨声), ShadowPunchAnimation (暗影拳), ExtrasensoryAnimation (神通力), SkyUppercutAnimation (冲天拳), MuddyWaterAnimation (浊流), AerialAceAnimation (燕返), ShockWaveAnimation (电击波), WaterPulseAnimation (水之波动) 等。
- **高战术价值与连击先制招式**: FakeOutAnimation (击掌奇袭), WillOWispAnimation (鬼火), DragonDanceAnimation (龙之舞), CalmMindAnimation (冥想), BulkUpAnimation (健美), TailGlowAnimation (萤火), IronDefenseAnimation (铁壁), CosmicPowerAnimation (宇宙力量), WishAnimation (祈愿), YawnAnimation (哈欠), KnockOffAnimation (拍落), EndeavorAnimation (蛮干), TauntAnimation (挑衅), TrickAnimation (戏法), FollowMeAnimation (看我嘛), HelpingHandAnimation (帮助), MagicCoatAnimation (魔法反射), RecycleAnimation (回收利用), SkillSwapAnimation (特性互换), ImprisonAnimation (封印), SnatchAnimation (抢夺), MementoAnimation (临别礼物), FacadeAnimation (硬撑), FocusPunchAnimation (真气拳), StockpileAnimation (蓄力), SpitUpAnimation (喷出), SwallowAnimation (吞下), SlackOffAnimation (偷懒), AromatherapyAnimation (芳香治疗), BounceAnimation (弹跳), DiveAnimation (潜水) 等。
- **环境与连续攻击招式**: HailAnimation (冰雹), RockTombAnimation (岩石封锁), SandTombAnimation (流沙地狱), BulletSeedAnimation (种子机关枪), IcicleSpearAnimation (冰锥), RockBlastAnimation (岩石爆击), NeedleArmAnimation (尖刺臂), MudShotAnimation (泥巴射击), WeatherBallAnimation (气象球) 等。


### 11. 宝可梦对战招式动画执行器 (cn.pokemmo.battle.animation.move.gen4.*)

包含全国图鉴第四世代（Generation 4，技能编号 Move ID 355 ~ 467）全部 113 个招式动画执行器。所有类均继承自 .MU，全面编排第四世代神奥神兽与物理特殊分家后的划时代核心技能：
- **经典强力输出与先制招式**: ShadowForceAnimation (暗影潜袭 - 骑拉帝纳专属双回合穿透大招), RoarOfTimeAnimation (时光咆哮 - 帝牙卢卡专属), SpacialRendAnimation (亚空裂斩 - 帕路奇亚专属), JudgmentAnimation (制裁光砾 - 阿尔宙斯专属), MagmaStormAnimation (熔岩风暴 - 席多蓝恩专属), SeedFlareAnimation (种子闪光 - 谢米专属), CrushGripAnimation (捏碎 - 雷吉奇卡斯专属), DracoMeteorAnimation (流星群), BraveBirdAnimation (勇鸟猛攻), CloseCombatAnimation (近身战), EarthPowerAnimation (大地之力), FocusBlastAnimation (真气弹), AuraSphereAnimation (波导弹), FlareBlitzAnimation (闪焰冲锋), StoneEdgeAnimation (尖石攻击), HeadSmashAnimation (双刃头锤), WoodHammerAnimation (木槌), GigaImpactAnimation (终极冲击), GunkShotAnimation (垃圾射击), IronHeadAnimation (铁头), AquaTailAnimation (水流尾), PowerWhipAnimation (强力鞭打), RockWreckerAnimation (岩石炮), LeafStormAnimation (飞叶风暴), EnergyBallAnimation (能量球), DarkPulseAnimation (恶之波动), DragonPulseAnimation (龙之波动), BugBuzzAnimation (虫鸣), AirSlashAnimation (空气斩), XScissorAnimation (十字剪), BulletPunchAnimation (子弹拳), IceShardAnimation (冰砾), AquaJetAnimation (水流喷射), ShadowSneakAnimation (影子偷袭), VacuumWaveAnimation (真空波), SuckerPunchAnimation (突袭), UTurnAnimation (急速折返) 等。
- **高战术价值环境与变化招式**: StealthRockAnimation (隐形岩 - 划时代钉子环境技), ToxicSpikesAnimation (毒菱), DefogAnimation (清除浓雾), TrickRoomAnimation (戏法空间 - 颠倒速度维度的空间技), TailwindAnimation (顺风), RoostAnimation (羽栖), NastyPlotAnimation (诡计), RockPolishAnimation (岩石打磨), DarkVoidAnimation (暗黑洞 - 达克莱伊全场催眠), HealingWishAnimation (治愈之愿), LunarDanceAnimation (新月舞), GrassKnotAnimation (打草结), SwitcherooAnimation (掉包), PsychoShiftAnimation (精神转移), MagnetRiseAnimation (电磁飘浮), AquaRingAnimation (水流环), HeartSwapAnimation (心灵互换) 等。
- **三牙与三拳补强招式**: ThunderFangAnimation (雷电牙), IceFangAnimation (冰冻牙), FireFangAnimation (火焰牙), DrainPunchAnimation (吸收拳), ShadowClawAnimation (暗影爪), NightSlashAnimation (暗袭要害), PoisonJabAnimation (毒击), CrossPoisonAnimation (十字毒刃), ZenHeadbuttAnimation (意念头锤), FlashCannonAnimation (加农光炮), DischargeAnimation (放电), LavaPlumeAnimation (喷烟) 等。


### 12. 宝可梦对战招式动画执行器 (cn.pokemmo.battle.animation.move.gen5.*)

包含全国图鉴第五世代（Generation 5，技能编号 Move ID 468 ~ 559）全部 92 个招式动画执行器。所有类均继承自 .MU，全面编排第五世代黑白合众神兽大招与对战环境核心技能：
- **经典强力输出与神兽专属招式**: VCreateAnimation (Ｖ热炎 - 比克提尼专属威力高达180最强火系大招), FusionBoltAnimation (交错闪电 - 捷克罗姆专属), FusionFlareAnimation (交错火焰 - 莱希拉姆专属), BoltStrikeAnimation (雷击 - 捷克罗姆雷霆大招), BlueFlareAnimation (青焰 - 莱希拉姆纯青烈焰), FreezeShockAnimation (冰封伏特 - 黑色酋雷姆专属), IceBurnAnimation (极寒冷焰 - 白色酋雷姆专属), GlaciateAnimation (冰封世界 - 酋雷姆专属), PsystrikeAnimation (精神击破 - 超梦/合众专属), SecretSwordAnimation (神秘之剑 - 凯路迪欧专属), RelicSongAnimation (古老之歌 - 美洛耶塔专属变身), TechnoBlastAnimation (高科技光炮 - 盖诺赛克特专属), NightDazeAnimation (暗黑爆破 - 索罗亚克专属), FieryDanceAnimation (火之舞 - 火神蛾专属), SacredSwordAnimation (圣剑 - 圣剑士专属穿透防御), HeadChargeAnimation (爆炸头突击 - 爆炸头水牛专属), ScaldAnimation (热水 - 兼具输出与30%灼伤的水系核心神技), VoltSwitchAnimation (伏特替换 - 电系游击换人神技), AcrobaticsAnimation (杂技 - 无道具时威力翻倍的飞行神技), DrillRunAnimation (直冲钻), WildChargeAnimation (疯狂伏特), DualChopAnimation (二连劈), HornLeechAnimation (木角), RazorShellAnimation (贝壳刃), HeatCrashAnimation (高温重压), HeavySlamAnimation (重磅冲撞), HurricaneAnimation (暴风), IcicleCrashAnimation (冰柱坠击), SnarlAnimation (大声咆哮), FoulPlayAnimation (欺诈 - 借对手攻击力反打), PsyshockAnimation (精神冲击 - 针对对手物防的特攻技), VenoshockAnimation (毒液冲击), SludgeWaveAnimation (污泥波), BulldozeAnimation (重踏), DragonTailAnimation (龙尾 - 强制击退对手换人) 等。
- **划时代强化与战术辅助招式**: ShellSmashAnimation (破壳 - 双防换取双攻双速暴涨的终极强化), QuiverDanceAnimation (蝶舞 - 特攻特防速度三项全能强化), CoilAnimation (盘蜷 - 物攻物防命中三向强化), ShiftGearAnimation (换档 - 速度提升两级物攻提升一级), CottonGuardAnimation (棉花防守 - 物防瞬间暴涨三级), AutotomizeAnimation (身体轻量化), WorkUpAnimation (自我激励), HoneClawsAnimation (磨爪), WideGuardAnimation (广域防守 - 双打保护全队免受范围AOE伤害), QuickGuardAnimation (快速防守 - 阻挡对手先制技能), RagePowderAnimation (愤怒粉 - 吸引对手单体技能保护队友), AllySwitchAnimation (交换场地 - 双打颠倒站位神技), ClearSmogAnimation (清除之烟 - 强制抹平对手全部能力等级强化), HealPulseAnimation (治愈波动 - 为队友恢复50%生命), TailwindAnimation (顺风), ElectrowebAnimation (电网), AcidSprayAnimation (酸液炸弹), SoakAnimation (浸水 - 强制将对手改变为纯水属性), EntrainmentAnimation (找伙伴), AfterYouAnimation (您先请), SimpleBeamAnimation (单纯光束), WonderRoomAnimation (奇妙空间 - 颠倒全场物防特防), MagicRoomAnimation (魔法空间 - 封印全场道具效果) 等。


### 13. 特殊/自制招式动画与战斗演出 (cn.pokemmo.battle.animation.special.*)

包含全部 96 个特殊招式动画与对战演出执行器。至此，全工程继承自 .MU 的全部 655 个动画类已 100% 彻底现代化迁移：
- **自定义/组合招式 (44 类)**: PokeMMO 自定义招式编号 (Move ID > 559，如 CustomMove1000Animation, CustomMove1027Animation, CustomMove3109Animation, CustomMove3525Animation 等)，涵盖特殊质子粒子打击、野外技能联动、节日活动专属攻击与团队对战连携技能。
- **状态与对战演出动画 (52 类)**: 
  - 替身召唤与打击判定演出 (BattleX00Animation, BattleFy1Animation)
  - 宝可梦倒地濒死与收回精灵球动画 (BattleKm0Animation, BattleA6Animation, BattleYl1Animation)
  - 属性克制视觉冲击波与全屏震荡 (BattleOk01Animation, BattleZaAnimation)
  - 特殊天气雷暴与暴雪环境覆盖演出 (BattleLpt23Animation, BattleLpt75Animation, BattleM900Animation)
  - 宝可梦进场威吓与气场爆发演出 (BattleBs1Animation, BattleBv00Animation)


### 14. 资产加载管线与异步任务引擎 (cn.pokemmo.assets.loader.* & cn.pokemmo.graphics.task.*)

本模块包含 PokeMMO 客户端底层 LibGDX 异步资源加载管线与 OpenGL 渲染主线程异步调度任务体系（共 41 类 + 3 基类），全面解耦重构为三个核心子系统：

#### 14.1 全量资产加载器体系 (cn.pokemmo.assets.loader.*，共 11 类 + 1 基类)
- **BaseAssetLoader**: 资产加载器统一抽象基类（继承原 N00），封装多线程异步预加载 (loadAsync)、OpenGL 主线程同步创建 (loadSync) 与资源依赖卸载 (unloadAsync) 标准流水线。

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.assets.loader.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.FV | cn.pokemmo.assets.loader.ModelMeshAssetLoader | 3D 模型网格数据与顶点材质加载器 |
| f.PF0 | cn.pokemmo.assets.loader.SoundAssetLoader | 短音效 (WAV/OGG) 音频资源加载器 |
| f.ed0_2 | cn.pokemmo.assets.loader.BitmapFontAssetLoader | 位图字体与字模定义文件加载器 |
| f.hk_1 | cn.pokemmo.assets.loader.I18NBundleAssetLoader | 国际化多语言属性包与编码字符集加载器 |
| f.ir_1 | cn.pokemmo.assets.loader.TextureAssetLoader | 2D 纹理贴图主内存异步解码与显存加载器 |
| f.rh0_2 | cn.pokemmo.assets.loader.CubemapAssetLoader | 立方体天空盒与全景反射贴图加载器 |
| f.tg_1 | cn.pokemmo.assets.loader.ParticleEffectAssetLoader | 2D/3D 粒子特效发射器与贴图配置加载器 |
| f.uo_0 | cn.pokemmo.assets.loader.ShaderProgramAssetLoader | GLSL 顶点着色器与片段着色器编译加载器 |
| f.uv0_0 | cn.pokemmo.assets.loader.TextureAtlasAssetLoader | 纹理图集切片与大图拆分加载器 |
| f.vd_1 | cn.pokemmo.assets.loader.ObjModelAssetLoader | Wavefront OBJ 3D 模型与 MTL 材质加载器 |
| f.zt_0 | cn.pokemmo.assets.loader.MusicStreamAssetLoader | 流式长音频与背景 BGM 音乐流加载器 |

#### 14.2 资产加载参数模型体系 (cn.pokemmo.assets.loader.parameter.*，共 14 类 + 1 基类)
- **BaseAssetLoaderParameters**: 资产加载参数统一抽象基类（继承原 in_0），封装异步加载完成回调契约 (LoadedCallback)。

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.assets.loader.parameter.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.AM | cn.pokemmo.assets.loader.parameter.I18NBundleParameter | 国际化语言包参数 (Locale、编码字符集) |
| f.Aw0 | cn.pokemmo.assets.loader.parameter.SoundParameter | 音效加载配置参数 |
| f.Em0 | cn.pokemmo.assets.loader.parameter.TextureParameter | 纹理采样模式、环绕寻址与 Mipmap 参数 |
| f.KK | cn.pokemmo.assets.loader.parameter.MusicParameter | 背景音乐流式播放与异步缓冲参数 |
| f.SH0 | cn.pokemmo.assets.loader.parameter.TextureAtlasParameter | 纹理图集切片与子贴图参数模型 |
| f.U0 | cn.pokemmo.assets.loader.parameter.SkinParameter | UI 界面样式表与皮肤加载参数 |
| f.aw_1 | cn.pokemmo.assets.loader.parameter.BitmapFontParameter | 位图字体翻转、缩放与图集引用参数 |
| f.ee_0 | cn.pokemmo.assets.loader.parameter.ModelParameter | 3D 骨骼动画与模型材质解析参数 |
| f.hg0_1 | cn.pokemmo.assets.loader.parameter.ParticleEffectParameter | 粒子特效发射器纹理贴图参数 |
| f.il_1 | cn.pokemmo.assets.loader.parameter.PolygonRegionParameter | 多边形网格拓扑与区域贴图参数 |
| f.jk0_2 | cn.pokemmo.assets.loader.parameter.ShaderProgramParameter | GLSL 着色器宏定义与预编译参数 |
| f.n8_0 | cn.pokemmo.assets.loader.parameter.SyncTaskParameter | 异步资源同步回调任务与扩展名过滤参数 |
| f.n_0 | cn.pokemmo.assets.loader.parameter.PixmapParameter | 原始像素图解码与位图格式参数 |
| f.u00_0 | cn.pokemmo.assets.loader.parameter.FreeTypeFontParameter | FreeType 矢量字体动态光栅化参数 |

#### 14.3 OpenGL 线程异步任务分发器体系 (cn.pokemmo.graphics.task.*，共 16 类 + 1 基类)
- **BaseGLTask**: OpenGL 线程异步调度任务统一基类（继承原 m0_0，实现 Runnable），提供主线程安全调度、执行时间获取与安全取消机制。

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.graphics.task.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.MR | cn.pokemmo.graphics.task.AudioPlayerGLTask | 音频播放器空间音频衰减与播放状态主线程更新 |
| f.MT | cn.pokemmo.graphics.task.SpriteAnimationGLTask | 精灵动作帧切片与渲染状态刷新 |
| f.MZ | cn.pokemmo.graphics.task.ModelMeshReloadGLTask | 3D 模型网格与顶点缓冲区热重载 |
| f.NP | cn.pokemmo.graphics.task.TextureUploadGLTask | 纹理像素数据从主内存向 GPU 显存异步上传 |
| f.O0 | cn.pokemmo.graphics.task.ReflectFieldUpdateGLTask | 渲染状态反射字段安全更新与网络同步派发 |
| f.Wd | cn.pokemmo.graphics.task.ShaderCompileGLTask | 着色器异步链接验证与主线程激活 |
| f.Wo0 | cn.pokemmo.graphics.task.ActorTaskGLTask | 场景 Actor 动作时序推进与动画状态机同步 |
| f.ZN | cn.pokemmo.graphics.task.ActorStateSyncGLTask | 双生实体坐标同步、朝向对齐与姿态同步 |
| f.ci0_0 | cn.pokemmo.graphics.task.WorldEntitySyncGLTask | 大世界实体坐标差值、外观状态与动作对齐 |
| f.g0_0 | cn.pokemmo.graphics.task.ActorMovementGLTask | 角色网格像素平滑插值移动与朝向切换 |
| f.ij0_1 | cn.pokemmo.graphics.task.WeatherEffectGLTask | 动态天气系统主循环推进与光影参数更新 |
| f.lpt8__2 | cn.pokemmo.graphics.task.CameraTrackingGLTask | 摄像机平滑跟随、视椎体裁剪与插值追踪 |
| f.mp_0 | cn.pokemmo.graphics.task.EntityFieldUpdateGLTask | 实体属性反射注入与战斗技能粒子挂载 |
| f.n0_0 | cn.pokemmo.graphics.task.ParticleEmitterGLTask | 粒子爆发位置重算与生命周期回收调度 |
| f.wf_2 | cn.pokemmo.graphics.task.WindowLayoutGLTask | UI 窗口几何尺寸异步重算与网络包回发 |
| f.ym0_0 | cn.pokemmo.graphics.task.FrameBufferSwapGLTask | 帧缓冲区双缓冲交换与离屏后处理调度 |


### 15. ROM 二进制资源块解析引擎 (cn.pokemmo.rom.chunk.*)

本模块包含 PokeMMO 客户端从 GBA (FireRed, Emerald) 与 NDS (Platinum, HeartGold, Black/White) ROM 二进制流中切片解析各种游戏核心资源的数据块解析器（共 15 类 + 1 基类）：

- **BaseRomResourceChunk**: 资源块解析统一抽象基类（继承原 be0_1），封装 chunkId、chunkName 与 pH(ByteBuffer, int...) 数据块切片解析与 D(ByteBuffer) 二进制校验标准流水线。

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.rom.chunk.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.AQ | cn.pokemmo.rom.chunk.PaletteRomChunk | GBA/NDS 调色板颜色索引表与 RGB 色彩数据解析 |
| f.Ar | cn.pokemmo.rom.chunk.SoundSampleRomChunk | 音频波形样本表与音轨指针解析 |
| f.B4 | cn.pokemmo.rom.chunk.SpriteFrameRomChunk | 角色与宝可梦精灵行走图切片、关键帧时序与渲染边界解析 |
| f.ew_1 | cn.pokemmo.rom.chunk.MapTilemapRomChunk | 游戏大世界瓦片图块网格、图层顺序与遮挡关系解析 |
| f.gb_0 | cn.pokemmo.rom.chunk.ScriptBytecodeRomChunk | 游戏内剧情对话、NPC 行为与事件触发字节码反序列化 |
| f.gr_1 | cn.pokemmo.rom.chunk.TextCharsetRomChunk | 文本字符集编码映射、对话字模索引与多语言转码表 |
| f.JO | cn.pokemmo.rom.chunk.MonsterStatsRomChunk | 宝可梦基础种族值 (HP/物攻/物防/特攻/特防/速度)、捕获率、努力值、特性与学习集 |
| f.lb_0 | cn.pokemmo.rom.chunk.WildEncounterRomChunk | 草丛、水面、垂钓等场景下野生宝可梦遭遇概率与等级区间 |
| f.lm0_0 | cn.pokemmo.rom.chunk.EvolutionChainRomChunk | 等级、道具、亲密度、通信等多种宝可梦进化分支与判定条件 |
| f.N40 | cn.pokemmo.rom.chunk.MoveEffectRomChunk | 对战招式附加特效、命中率、优先度与 3D 光影坐标参数 |
| f.ou0_0 | cn.pokemmo.rom.chunk.ItemPropertyRomChunk | 道具 ID、背包分类 (口袋)、买卖价格、使用限制与持有效果 |
| f.pv_0 | cn.pokemmo.rom.chunk.TrainerPartyRomChunk | 训练家队伍阵容、宝可梦等级配招与对战 AI 难度策略 |
| f.sq_2 | cn.pokemmo.rom.chunk.MapCollisionRomChunk | 地图阻挡、冲浪水域、单向跳跃台阶等碰撞通行网格属性解析 |
| f.vt_0 | cn.pokemmo.rom.chunk.AreaHeaderRomChunk | 第 4/5 世代 NDS 地图矩阵、天气属性与 3D 模型锚点头部信息解析 |
| f.zw_0 | cn.pokemmo.rom.chunk.AbilityStatusRomChunk | 宝可梦战斗特性联动、天气状态机与异常状态 (麻痹/中毒/冰冻等) 逻辑 |


### 16. 网络底层系统协议与子协议包体系 (cn.pokemmo.net.packet.protocol.*)

本模块包含 PokeMMO 客户端底层核心信道控制、系统认证、心跳保活与子协议命令分发数据包体系（共 24 个具体协议包 + 2 个基类，合计 26 类）：

- **BaseSystemProtocolPacket**: 系统主协议数据包统一基类（继承原 Mg），封装主 Opcode (mG)、二进制打包 (hG) 与会话处理 (Ev0)。
- **BaseSubProtocolPacket**: 子协议命令数据包统一基类（继承原 k1_0），封装双字节子命令 (主 Opcode + 子 Opcode: HU) 分发逻辑。

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.net.packet.protocol.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.KM | cn.pokemmo.net.packet.protocol.HeartbeatPingPacket | 心跳检测与 Ping 往返延迟计算包 (Opcode 16) |
| f.py_1 | cn.pokemmo.net.packet.protocol.SoundPlaybackPacket | 游戏音频与音效触发同步包 (Opcode 0) |
| f.vb_1 | cn.pokemmo.net.packet.protocol.BatchCommandPacket | 多动作原子批量聚合分发包 (Opcode 19) |
| f.lt0_0 | cn.pokemmo.net.packet.protocol.ActionDescriptorPacket | 指令动作描述与参数载荷包 |
| f.TA0 | cn.pokemmo.net.packet.protocol.KeepAlivePacket | 底层 Socket 长连接信道保活包 |
| f.vq_2 | cn.pokemmo.net.packet.protocol.ViewportUpdatePacket | 视口九宫格可见区域动态切换包 |
| f.af0_2 | cn.pokemmo.net.packet.protocol.AuthChallengePacket | 登录网关认证挑战与会话 Token 校验包 (Opcode 21) |
| f.b5_0 | cn.pokemmo.net.packet.protocol.HandshakeAckPacket | 网络协议版本握手确认包 (Opcode 20) |
| f.dh_1 | cn.pokemmo.net.packet.protocol.ServerCapabilityPacket | 游戏服务功能集与插件支持查询包 (Opcode 24) |
| f.kg0_0 | cn.pokemmo.net.packet.protocol.KeyExchangePacket | 对称加密会话密钥协商包 (Opcode 22) |
| f.nn_1 | cn.pokemmo.net.packet.protocol.SessionTerminatePacket | 正常登出与异常连接强制终止包 (Opcode 15) |
| f.W | cn.pokemmo.net.packet.protocol.WorldSyncSubPacket | 大世界实体坐标同步子协议命令包 (Opcode 3) |
| f.Px0 | cn.pokemmo.net.packet.protocol.EntityStateSubPacket | 角色外观与交互状态子协议命令包 (Opcode 34) |
| f.bd0_0 | cn.pokemmo.net.packet.protocol.ZoneTransitionSubPacket | 场景切换与地图传送子协议命令包 |
| f.com7__1 | cn.pokemmo.net.packet.protocol.ChatChannelSubPacket | 聊天频道加入与订阅子协议命令包 |
| f.db_1 | cn.pokemmo.net.packet.protocol.PlayerMotionSubPacket | 玩家移动按键与朝向同步子协议命令包 |
| f.Dx0 | cn.pokemmo.net.packet.protocol.InventoryActionSubPacket | 背包物品整理与槽位变动子协议命令包 |
| f.hc0_1 | cn.pokemmo.net.packet.protocol.TradeSessionSubPacket | 玩家面对面交易会话子协议命令包 |
| f.ht_2 | cn.pokemmo.net.packet.protocol.BattleStateSubPacket | 对战房间状态就绪与轮询子协议命令包 |
| f.PB0 | cn.pokemmo.net.packet.protocol.GuildProtocolSubPacket | 公会成员动态与权限更新子协议命令包 |
| f.QL0 | cn.pokemmo.net.packet.protocol.MatchmakingSubPacket | 排位赛匹配队列与对阵确认子协议命令包 |
| f.so_0 | cn.pokemmo.net.packet.protocol.TournamentSubPacket | 锦标赛赛程与积分晋级子协议命令包 |
| f.yp0_0 | cn.pokemmo.net.packet.protocol.ScriptEventSubPacket | NPC 剧情脚本与分支选择子协议命令包 |
| f.z30_0 | cn.pokemmo.net.packet.protocol.SystemNoticeSubPacket | 系统广播与活动公告推送子协议命令包 |

### 17. 大世界地形动画状态机体系 (cn.pokemmo.world.terrain.animation.*)

本模块包含 PokeMMO 客户端大世界动态地形网格、图块切片轮播与水体/草丛/熔岩等环境材质动画状态机体系（共 19 个图块动画类 + 2 个基类，合计 21 类）：

- **BaseTerrainTileAnimation**: 大世界地形网格与材质图块动画状态机统一基类（继承原 dd_1），封装状态标识 (eA)、帧切片序列 (mH0) 与帧获取 (Gs)。
- **BaseCyclicTileAnimation**: 循环周期切片地形动画基类（继承原 FP），提供按固定时间步长循环播放的数学取模帧计算契约。

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.world.terrain.animation.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.bo_2 | cn.pokemmo.world.terrain.animation.ByteArrayStateTileAnimation | 状态字节数组动态映射切片动画 |
| f.lj0_0 | cn.pokemmo.world.terrain.animation.DualStateTileAnimation | 开关门与昼夜灯光等双态切换地形动画 |
| f.pd_1 | cn.pokemmo.world.terrain.animation.CompositeTileAnimation | 多图层复合地形嵌套动画容器 |
| f.Sd0 | cn.pokemmo.world.terrain.animation.SequentialTileAnimation | 延时时序序列帧切片动画 |
| f.uf_1 | cn.pokemmo.world.terrain.animation.SingleFrameTileAnimation | 单帧静态地形贴图状态 |
| f.wm_0 | cn.pokemmo.world.terrain.animation.BitmaskStateTileAnimation | 8 向连接掩码自适应地形动画 |
| f.ci0_1 | cn.pokemmo.world.terrain.animation.WaterWaveTileAnimation | 水面微波涟漪动态流水动画 (State 123) |
| f.de_0 | cn.pokemmo.world.terrain.animation.WaterfallTileAnimation | 瀑布垂直跌水与飞溅动态动画 (State 100) |
| f.jl_1 | cn.pokemmo.world.terrain.animation.OceanCurrentTileAnimation | 深海急流与浪涌动态动画 (State 127) |
| f.KB0 | cn.pokemmo.world.terrain.animation.LavaBubbleTileAnimation | 火山岩浆冒泡与熔岩流淌动画 (State 121) |
| f.m8 | cn.pokemmo.world.terrain.animation.FlowerSwayTileAnimation | 节庆花草随风微动摇曳动画 (State 124) |
| f.O60 | cn.pokemmo.world.terrain.animation.GrassRustleTileAnimation | 草丛行走沙沙律动动画 (State 99) |
| f.pt_0 | cn.pokemmo.world.terrain.animation.WhirlpoolTileAnimation | 旋涡旋转吸卷动态水域动画 (State 126) |
| f.py_0 | cn.pokemmo.world.terrain.animation.FountainSprayTileAnimation | 城镇喷泉循环喷射水雾动画 (State 125) |
| f.qy_2 | cn.pokemmo.world.terrain.animation.SandFlowTileAnimation | 沙漠流沙滑移与沙尘动画 (State 97) |
| f.RG0 | cn.pokemmo.world.terrain.animation.ConveyorBeltTileAnimation | 传送带机械滑道传送动画 (State 96) |
| f.ue0_0 | cn.pokemmo.world.terrain.animation.GymSpinnerTileAnimation | 道馆地砖旋转箭头与滑冰机关动画 (State 122) |
| f.vt0_0 | cn.pokemmo.world.terrain.animation.PondReflectionTileAnimation | 倒影水池波光反光动画 (State 120) |
| f.vw0_0 | cn.pokemmo.world.terrain.animation.CaveMistTileAnimation | 幽暗洞穴雾气蒸腾动画 (State 98) |

### 18. Universal Tween Engine 缓动插值引擎体系 (cn.pokemmo.graphics.animation.tween.*)

涵盖客户端底层 2D/3D 数值、颜色、相机、场景节点、UI 视口与对战卡牌动画插值器（17 类 + 1 统一接口 BaseTweenAccessor，共 18 类）：

- **BaseTweenAccessor**: 缓动插值访问器顶层抽象接口（继承/实现原 f.BD，提供 getValues / setValues 现代抽象方法与友好默认实现）。

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.graphics.animation.tween.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.gu_0 | cn.pokemmo.graphics.animation.tween.Vector3TweenAccessor | 3D 向量 (C8) 坐标/旋转/缩放数值插值 |
| f.ih_0 | cn.pokemmo.graphics.animation.tween.Vector2TweenAccessor | 2D 向量 (Bp0) 平面坐标平滑插值 |
| f.P0 | cn.pokemmo.graphics.animation.tween.ColorTweenAccessor | Color 颜色 (RGBA) 渐变与透明度插值 |
| f.yc_1 | cn.pokemmo.graphics.animation.tween.CameraTweenAccessor | 3D 透视相机 (BJ0) 视点与目标平滑过渡 |
| f.LA0 | cn.pokemmo.graphics.animation.tween.OrthoCameraTweenAccessor | 正交 2D 相机 (qd0_0) 视口缩放与平移插值 |
| f.d20_0 | cn.pokemmo.graphics.animation.tween.WidgetTweenAccessor | UI 基础组件 (jk_0) 几何尺寸与位置插值 |
| f.z90_0 | cn.pokemmo.graphics.animation.tween.SpriteTweenAccessor | 2D 精灵切片 (te0_0) 旋转与缩放缓动 |
| f._final | cn.pokemmo.graphics.animation.tween.SceneNodeTweenAccessor | 3D 场景图节点 (Ou0) 局部矩阵过渡插值 |
| f.bq_1 | cn.pokemmo.graphics.animation.tween.SoundVolumeTweenAccessor | 音频声音源 (BM) 音量淡入淡出插值 |
| f.D50 | cn.pokemmo.graphics.animation.tween.TextLabelTweenAccessor | 文本标签 (ql_0) 字体颜色与淡出插值 |
| f.em_0 | cn.pokemmo.graphics.animation.tween.WindowDialogTweenAccessor | 弹窗对话框 (Br0) 弹性缩放展开插值 |
| f.of_1 | cn.pokemmo.graphics.animation.tween.ProgressBarTweenAccessor | 血条与经验条 (lc_0) 数值平滑滚动插值 |
| f.pv_1 | cn.pokemmo.graphics.animation.tween.ParticleTweenAccessor | 粒子发射器 (B5) 速率与生存期插值 |
| f.qh0_0 | cn.pokemmo.graphics.animation.tween.WorldEntityTweenAccessor | 大世界场景实体 (com3__3) 像素坐标插值 |
| f.wb0_2 | cn.pokemmo.graphics.animation.tween.ScrollPanelTweenAccessor | 滚动面板视口 (U10) 阻尼滚动位移插值 |
| f.yv_0 | cn.pokemmo.graphics.animation.tween.ActorAlphaTweenAccessor | 角色玩家对象 (le0_2) 透明度过渡插值 |
| f.com5__2 | cn.pokemmo.graphics.animation.tween.BattleCardTweenAccessor | 对战行动卡牌 (gn_0) 飞入飞出缓动插值 |

### 19. UI 复杂网格表格数据模型体系 (cn.pokemmo.ui.widget.table.model.*)

涵盖客户端各核心系统的数据网格模型（14 类 + 1 基类 BaseTableModel，共 15 类）：

- **BaseTableModel**: UI 复杂网格表格数据模型抽象基类（继承原 f.bb_2，封装 getRowCount, getColumnCount, getColumnName, getValueAt, getCellTooltip 及行增删通知）。

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.ui.widget.table.model.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.ca_1 | cn.pokemmo.ui.widget.table.model.AuctionHouseTableModel | 全球交易行拍卖物品列表数据表格模型 |
| f.GM | cn.pokemmo.ui.widget.table.model.ItemBagTableModel | 背包分类与制造需求数据表格模型 |
| f.PX | cn.pokemmo.ui.widget.table.model.FriendListTableModel | 好友列表与黑名单数据表格模型 |
| f.mh_0 | cn.pokemmo.ui.widget.table.model.GuildMemberTableModel | 公会成员名册与职务状态数据表格模型 |
| f.X50 | cn.pokemmo.ui.widget.table.model.BattleLogTableModel | 对战对局历史记录与战报数据表格模型 |
| f.ga_1 | cn.pokemmo.ui.widget.table.model.RankLadderTableModel | 天梯排位积分与胜率排行榜数据表格模型 |
| f.Cn0 | cn.pokemmo.ui.widget.table.model.MailboxTableModel | 玩家个人邮件与信件列表数据表格模型 |
| f.hb0_0 | cn.pokemmo.ui.widget.table.model.PokedexEntryTableModel | 图鉴遇敌、击败与捕获日志数据表格模型 |
| f.i2_0 | cn.pokemmo.ui.widget.table.model.TournamentTableModel | 锦标赛积分与淘汰战报数据表格模型 |
| f.E2 | cn.pokemmo.ui.widget.table.model.TradeHistoryTableModel | 玩家点对点交易流水历史数据表格模型 |
| f.ld_2 | cn.pokemmo.ui.widget.table.model.ChatChannelTableModel | 多频道聊天与系统消息数据表格模型 |
| f.ul_1 | cn.pokemmo.ui.widget.table.model.KeyBindingTableModel | 快捷键与手柄按钮映射数据表格模型 |
| f.vj0_0 | cn.pokemmo.ui.widget.table.model.QuestLogTableModel | 主支线任务追踪与日志数据表格模型 |
| f.YE0 | cn.pokemmo.ui.widget.table.model.CosmeticInventoryTableModel | 时装外观与衣橱记录数据表格模型 |

### 20. UI 物品装备交互槽位组件体系 (cn.pokemmo.ui.widget.slot.*)

涵盖客户端全量物品拖拽、装备穿戴、快捷栏与背包绑定的交互槽位组件（14 类 + 2 基类，共 16 类）：

- **BaseItemSlotWidget**: 基础物品与操作拖拽槽位抽象组件（继承原 f.lpt4__1，封装槽位尺寸、拖拽状态 Po/Kg/Wm、上下文关联与事件分发）。
- **BaseCompositeSlotWidget**: 复合交互槽位抽象组件（继承原 f.qr_0，增加双击与长按定时器及库存适配器 IA 绑定）。

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.ui.widget.slot.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.B3 | cn.pokemmo.ui.widget.slot.TradeExchangeSlotWidget | 面对面交易窗口物品交换槽位 |
| f.f10_0 | cn.pokemmo.ui.widget.slot.EquipmentQuickSlotWidget | 快捷栏装备与快捷道具槽位 |
| f.f80_0 | cn.pokemmo.ui.widget.slot.CraftingIngredientSlotWidget | 树果/药品合成制造材料槽位 |
| f.ga0_1 | cn.pokemmo.ui.widget.slot.HotkeyActionBarSlotWidget | 动作条技能与道具绑定热键槽位 |
| f.HK0 | cn.pokemmo.ui.widget.slot.BreedingDaycareSlotWidget | 培育屋日托所宝可梦与道具槽位 |
| f.lpt1__3 | cn.pokemmo.ui.widget.slot.MailAttachmentSlotWidget | 邮件附件道具放置与提取槽位 |
| f.qu_1 | cn.pokemmo.ui.widget.slot.ItemUpgradeRefineSlotWidget | 装备精炼、强化与属性打孔槽位 |
| f.Rn0 | cn.pokemmo.ui.widget.slot.AuctionBidSlotWidget | 拍卖行出价竞拍物品槽位 |
| f.si0_1 | cn.pokemmo.ui.widget.slot.StaticItemPreviewSlotWidget | 静态物品预览与数量拆分槽位 |
| f.SK0 | cn.pokemmo.ui.widget.slot.StorageBoxSlotWidget | 宝可梦 PC 存储电脑箱子道具槽位 |
| f.u70_0 | cn.pokemmo.ui.widget.slot.PartyPokemonSlotWidget | 队伍同行宝可梦携带道具槽位 |
| f.VM | cn.pokemmo.ui.widget.slot.ShopVendorItemSlotWidget | NPC 友好商店货架商品交互槽位 |
| f.vr0_0 | cn.pokemmo.ui.widget.slot.CosmeticDressSlotWidget | 试衣间个人外观与时装穿戴槽位 |
| f.m30_0 | cn.pokemmo.ui.widget.slot.BagInventoryItemSlotWidget | 玩家个人背包库存复合交互槽位 |

### 21. UI 动态富文本与数值排版标签体系 (cn.pokemmo.ui.widget.text.tag.*)

涵盖客户端各核心界面的动态色彩标签、头衔称号、数值排版与状态浮层（15 类 + 1 基类 BaseTaggedLabelWidget，共 16 类）：

- **BaseTaggedLabelWidget**: UI 动态富文本与数值排版标签抽象基类（继承原 f.qj_2，封装标签尺寸、几何微调、字体样式与交互高亮）。

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.ui.widget.text.tag.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.cb_2 | cn.pokemmo.ui.widget.text.tag.ChatChannelTagLabel | 聊天频道标识与私聊前缀彩色标签 |
| f.dg_1 | cn.pokemmo.ui.widget.text.tag.PlayerTitleTagLabel | 玩家头衔称号、成就有名标识标签 |
| f.fj0_0 | cn.pokemmo.ui.widget.text.tag.BattleStatModTagLabel | 战斗能力升降与数值等级浮动标签 |
| f.fq_1 | cn.pokemmo.ui.widget.text.tag.GuildRankTagLabel | 公会职务与职位身份彩色标签 |
| f.gp_2 | cn.pokemmo.ui.widget.text.tag.ItemQualityTagLabel | 道具品质与稀有度彩色动态标签 |
| f.hu_0 | cn.pokemmo.ui.widget.text.tag.PokedexStatusTagLabel | 图鉴收录/捕获/闪光状态标签 |
| f.i | cn.pokemmo.ui.widget.text.tag.MoveCategoryTagLabel | 招式物理/特殊/变化属性分类标签 |
| f.nc_0 | cn.pokemmo.ui.widget.text.tag.TrainerBadgeTagLabel | 训练家道馆徽章与成就指示标签 |
| f.OB | cn.pokemmo.ui.widget.text.tag.RankTierTagLabel | PVP 排位赛段位徽章与分数标签 |
| f.p70_0 | cn.pokemmo.ui.widget.text.tag.CombatTurnTagLabel | 对战回合时序与倒计时提醒标签 |
| f.sg_2 | cn.pokemmo.ui.widget.text.tag.ServerRegionTagLabel | 宝可梦箱子与队伍槽位信息展示卡片 |
| f.t00_0 | cn.pokemmo.ui.widget.text.tag.CooldownTimerTagLabel | 技能/道具冷却与使用倒计时数字标签 |
| f.TB | cn.pokemmo.ui.widget.text.tag.CurrencyValueTagLabel | 游戏金币/奖励点数/代币格式化标签 |
| f.u80_0 | cn.pokemmo.ui.widget.text.tag.WeatherConditionTagLabel | 战场与大世界动态天气环境指示标签 |
| f.Zy0 | cn.pokemmo.ui.widget.text.tag.StatusEffectTagLabel | 宝可梦异常状态（中毒/麻痹/灼伤/冰冻）标签 |

### 22. UI 弹出式下拉选择与场景右键菜单体系 (cn.pokemmo.ui.widget.menu.*)

涵盖客户端场景玩家、宝可梦槽位、聊天频道与背包道具的快捷弹出菜单（10 类 + 1 基类 BasePopupMenuWidget，共 11 类）：

- **BasePopupMenuWidget**: UI 弹出式下拉选择与场景右键菜单抽象基类（继承原 f.tk0_0，封装选项布局、键盘/手柄选择导航与回调事件通知）。

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.ui.widget.menu.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.bs0_0 | cn.pokemmo.ui.widget.menu.PlayerContextMenuWidget | 场景目标玩家右键快捷交互菜单 |
| f.C80 | cn.pokemmo.ui.widget.menu.PokemonActionMenuWidget | 队伍/箱子宝可梦槽位操作选项菜单 |
| f.EG0 | cn.pokemmo.ui.widget.menu.ChatFilterMenuWidget | 聊天框多频道过滤与显示筛选下拉菜单 |
| f.gk0_1 | cn.pokemmo.ui.widget.menu.ItemUseContextMenuWidget | 背包道具使用/装备/给予/丢弃快捷菜单 |
| f.gq_2 | cn.pokemmo.ui.widget.menu.TradeOptionMenuWidget | 玩家面对面交易操作选项菜单 |
| f.js_0 | cn.pokemmo.ui.widget.menu.GuildMemberActionMenuWidget | 公会名册成员提拔/转让/踢出操作菜单 |
| f.kS | cn.pokemmo.ui.widget.menu.ChannelSelectMenuWidget | 服务器分线与房间切换下拉选择菜单 |
| f.ng_1 | cn.pokemmo.ui.widget.menu.BattleTargetSelectMenuWidget | 对战招式释放目标多选交互菜单 |
| f.QH | cn.pokemmo.ui.widget.menu.InventorySortMenuWidget | 背包与仓库箱子分类排序规则菜单 |
| f.u8_0 | cn.pokemmo.ui.widget.menu.QuickSlotAssignMenuWidget | 快捷栏按键动作配置与技能注册菜单 |

### 23. UI 树状视图与层级列表模型体系 (cn.pokemmo.ui.widget.tree.*)

涵盖客户端多层级分类浏览模型（7 类 + 1 基类 BaseTreeModel，共 8 类）：

- **BaseTreeModel**: UI 树状视图与层级列表模型抽象基类（继承原 f.er_0，封装树节点展开折叠、选中项管理与数据绑定）。

| 原混淆类 (f.*) | 重构新类 (cn.pokemmo.ui.widget.tree.*) | 功能职责描述 |
| :--- | :--- | :--- |
| f.Au0 | cn.pokemmo.ui.widget.tree.AuctionCategoryTreeModel | 交易行多级商品分类目录树状模型 |
| f.F2 | cn.pokemmo.ui.widget.tree.PokedexRegionTreeModel | 全国图鉴地区与世代分层树状模型 |
| f.gz_0 | cn.pokemmo.ui.widget.tree.TradeItemTreeModel | 个人交易流水与物品分类树状模型 |
| f.we0_0 | cn.pokemmo.ui.widget.tree.AchievementGroupTreeModel | 游戏成就与徽章里程碑分类树状模型 |
| f.xk0_2 | cn.pokemmo.ui.widget.tree.ModFileListTreeModel | 模组 Mod 管理器目录与文件树状模型 |
| f.YJ0 | cn.pokemmo.ui.widget.tree.SettingsCategoryTreeModel | 系统设置多级分类导航树状模型 |
| f.yq_2 | cn.pokemmo.ui.widget.tree.SocialFriendGroupTreeModel | 社交好友分组与黑名单层级树状模型 |
