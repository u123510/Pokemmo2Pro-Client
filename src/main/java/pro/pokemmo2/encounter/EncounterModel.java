package pro.pokemmo2.encounter;

/**
 * 遭遇记录仪数据模型。
 */
public class EncounterModel {

    /**
     * 单个宝可梦种族遭遇记录
     */
    public static class SpeciesRecord {
        public String name;        // 宝可梦名称，如 "单首龙"
        public String typeStr;     // 属性简写，如 "恶龙"
        public int count;          // 种族遭遇数量
        public boolean isPinned;   // 是否置顶
        public short speciesId;    // 宝可梦图鉴编号（可选，用于图标查找）

        public SpeciesRecord(String name, String typeStr, int count, boolean isPinned, short speciesId) {
            this.name = name;
            this.typeStr = typeStr;
            this.count = count;
            this.isPinned = isPinned;
            this.speciesId = speciesId;
        }

        /**
         * 完整展示名称，如 "单首龙'恶龙"
         */
        public String getDisplayName() {
            if (typeStr == null || typeStr.isEmpty()) {
                return name;
            }
            return name + "'" + typeStr;
        }
    }

    /**
     * 闪光宝可梦捕获历史记录
     */
    public static class ShinyRecord {
        public String speciesName;     // 宝可梦名称，如 "铁蚁"
        public String typeStr;         // 属性简写，如 "虫钢"
        public int totalAtCatch;       // 抓获时累计总遭遇数
        public int speciesAtCatch;     // 抓获时该种族遭遇数
        public String catchTime;       // 捕获时间格式串，如 "2026/1/20 17:40"
        public int[] ivs;              // 六维个体值 (HP, Atk, Def, SpA, SpD, Spe)
        public String natureStr;       // 性格，如 "乐天(Lax)"
        public String playerName;      // 捕获玩家，如 "Regretted"
        public boolean missed;         // 是否为逃跑/错过的闪光
        public short speciesId;        // 宝可梦图鉴编号

        public ShinyRecord(String speciesName, String typeStr, int totalAtCatch, int speciesAtCatch,
                           String catchTime, int[] ivs, String natureStr, String playerName, boolean missed) {
            this(speciesName, typeStr, totalAtCatch, speciesAtCatch, catchTime, ivs, natureStr, playerName, missed, (short) 0);
        }

        public ShinyRecord(String speciesName, String typeStr, int totalAtCatch, int speciesAtCatch,
                           String catchTime, int[] ivs, String natureStr, String playerName, boolean missed, short speciesId) {
            this.speciesName = speciesName;
            this.typeStr = typeStr;
            this.totalAtCatch = totalAtCatch;
            this.speciesAtCatch = speciesAtCatch;
            this.catchTime = catchTime;
            this.ivs = ivs != null ? ivs : new int[]{0, 0, 0, 0, 0, 0};
            this.natureStr = natureStr;
            this.playerName = playerName != null ? playerName : "玩家";
            this.missed = missed;
            this.speciesId = speciesId;
        }

        public String getDisplayName() {
            if (typeStr == null || typeStr.isEmpty()) {
                return speciesName;
            }
            return speciesName + "'" + typeStr;
        }

        /**
         * 生成个体值高亮文本 (31 使用绿色 [#33cc33] 标出)
         */
        public String getFormattedIVs() {
            if (ivs == null || ivs.length < 6) {
                return "0/0/0/0/0/0";
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                if (i > 0) sb.append("/");
                int iv = ivs[i];
                if (iv == 31) {
                    sb.append("[#6fb76f]31[]");
                } else {
                    sb.append(iv);
                }
            }
            return sb.toString();
        }
    }
}
