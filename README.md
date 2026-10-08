# 客户端 28887
**IntelliJ IDEA Maven 源码项目**。
> 当前版本**保留全部混淆命名**（类名 / 字段名 / 方法名均未还原），例如 `f/Ga0`、`f/tw0`。
## 目录结构
```
28887-all/
|-- pom.xml                  Maven 构建文件（IDEA 直接打开）
|-- run.ps1                  一键运行脚本（自动构建 + 启动客户端）
|-- build.ps1                一键构建脚本（javac / 可选 mvn）
|-- src/main/java            CFR 0.152 反编译 + 字节码修正后的 3931 个 .java
|-- src/main/resources       jar 中除 class 外的 178 个资源（dll / shader / logback.xml 等）
|-- libs/
|   |-- 28887.jar            原始混淆 jar（ProGuard）
|   `-- 28887-renamed.jar    修正后的 jar（Windows 大小写冲突 + 关键字重命名，
|                            作为编译 classpath 与少数无源码类的运行期回退）
|-- build/
    |-- compile-all.py       javac 全量编译脚本（UTF-8，输出 build/classes）
    |-- gen-from-individual.py  根据失败清单生成 pom.xml / compile-sources.txt
    |-- compile-sources.txt  本次实际参与编译的 3931 个源文件（= src 全量）
    |-- excluded-files.txt   需要排除的源文件（当前为空：全部源码均可编译）
    |-- failures-individual.txt  历史逐文件编译失败清单（当前 0 个在 src 中存在）
    |-- stub-files.txt       CFR 反编译失败、只剩运行期抛异常桩的 93 个文件
    |-- errors-final.log     最近一次全量编译日志（rc=0）
    `-- tools/               重命名 / 修复 / 检查工具及 ASM 9.4 库
```

## 如何构建

要求：JDK 17+（`java` / `javac` / `jar` 在 PATH 中）以及 Python 3。

- 用 IntelliJ IDEA `File -> Open` 选择本目录的 `pom.xml`，作为 Maven 项目导入即可。
- 命令行构建：

```
mvn -q -DskipTests clean compile     # Maven 全量编译（已验证 rc=0，3931 个源码全部参与）
.\build.ps1                          # 仅用 javac 编译到 build/classes
```

`build.ps1` 其它开关：

```
.\build.ps1 -Maven        # javac 编译后，再跑一遍 mvn compile
.\build.ps1 -Recalc       # 重新逐文件编译检查（较慢，几分钟）
.\build.ps1 -RebuildJar   # 从 libs/28887.jar 重建 28887-renamed.jar
```

## 如何运行

先编译（`mvn -q -DskipTests clean compile` 或 `.\build.ps1`），然后启动客户端：

```
.\run.ps1                          # 推荐：若未编译会自动先构建，再启动游戏
java -cp "target\classes;libs\28887-renamed.jar" com.pokeemu.client.Client
```

说明（已实测可启动，日志显示 `Starting PokeMMO Client. Client revision: 28887`）：

- `src/main/java` 的 **3931 个源码全部编译**进 `target\classes`；主类
  `com.pokeemu.client.Client`、`f/AI`、`f/Bm0`、`f/ry0_0` 等均来自源码编译产物。
- jar 回退仅用于**没有可重建源码**的类：约 75 个 CFR 桩类（如 `f/Cq0`、`f/Dt0`、
  `f/Iu0`、`org/xmlpull/*`、`org/lwjgl/*` 的少数类）以及 `META-INF/versions/*`
  多版本类。源码类会优先于 jar 生效。
- 运行时会**在项目目录下新建 `config\` 和 `log\`**（默认配置与日志，可随时删除）。
- 需要 JDK 17+，并且登录/联网功能依赖网络与 PokeMMO 官方服务器；
  个别由 jar 提供的类与反编译源码混跑，功能可能与官方客户端有差异。
- 本项目的目的是**可编译、可阅读、可启动**的混淆版源码工程；
  直接双击 `run.ps1` 或从 IDEA 的 Maven 面板运行均可。
