package ch.qos.logback.core.pattern.parser;

import java.util.List;

public class SimpleKeywordNode extends FormattingNode {
   List optionList;

   public SimpleKeywordNode(Object var1) {
      super(1, var1);
   }

   public SimpleKeywordNode(int var1, Object var2) {
      super(var1, var2);
   }

   public List getOptions() {
      return this.optionList;
   }

   public void setOptions(List var1) {
      this.optionList = var1;
   }

   public boolean equals(Object var1) {
      if (!super.equals(var1)) {
         return false;
      } else if (!(var1 instanceof SimpleKeywordNode)) {
         return false;
      } else {
         SimpleKeywordNode var3 = (SimpleKeywordNode)var1;
         return (this.optionList != null) ? this.optionList.equals(var3.optionList) : (var3.optionList == null);
      }
   }

   public int hashCode() {
      return super.hashCode();
   }

   public String toString() {
      StringBuilder var1;
      var1 = new StringBuilder();
      if (this.optionList == null) {
         String var10001 = String.valueOf(super.value);
         var1.append("KeyWord(" + var10001 + "," + String.valueOf(super.formatInfo) + ")");
      } else {
         String var2 = String.valueOf(super.value);
         var1.append("KeyWord(" + var2 + ", " + String.valueOf(super.formatInfo) + "," + String.valueOf(this.optionList) + ")");
      }

      var1.append(((Node)this).printNext());
      return var1.toString();
   }
}
