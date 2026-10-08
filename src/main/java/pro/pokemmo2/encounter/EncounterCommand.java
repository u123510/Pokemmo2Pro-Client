package pro.pokemmo2.encounter;

import f.lg_0;
import f.prn__2;
import f.tw0_0;
import f.zo_0;
import pro.pokemmo2.UIManager;

/**
 * 遭遇记录仪命令：支持聊天栏输入 /zy, /counter, /encounter 打开/切换遭遇记录仪。
 */
public class EncounterCommand extends prn__2 {

    public EncounterCommand() {
        this("/zy");
    }

    public EncounterCommand(String commandName) {
        super(commandName, true);
    }

    @Override
    public void sr0(String[] args) {
        System.out.println("[PokeMMO2] 收到遭遇记录仪指令: " + (args != null && args.length > 0 ? args[0] : "/zy"));

        if (lg_0.k != null) {
            lg_0.k.lPT5(UIManager::toggleEncounterRecorder);
        } else {
            UIManager.toggleEncounterRecorder();
        }

        if (tw0_0.rl != null) {
            tw0_0.rl.jC("已打开遭遇记录仪 (/zy)", zo_0.rr0);
        }
    }
}
