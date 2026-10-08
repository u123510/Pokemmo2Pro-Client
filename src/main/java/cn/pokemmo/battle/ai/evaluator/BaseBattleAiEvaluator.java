package cn.pokemmo.battle.ai.evaluator;

import f.Gh0;
import f.V;

/**
 * BaseBattleAiEvaluator - 对战 AI 决策与行为树评估器基类
 * 封装决策权重计算、招式效果评估、危险度量化以及行动决策逻辑。
 */
public abstract class BaseBattleAiEvaluator extends Gh0 {

    public BaseBattleAiEvaluator() {
        super();
    }

    public BaseBattleAiEvaluator(V value) {
        super(value);
    }
}
