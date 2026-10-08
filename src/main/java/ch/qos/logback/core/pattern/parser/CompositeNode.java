package ch.qos.logback.core.pattern.parser;

public class CompositeNode extends SimpleKeywordNode {
   Node childNode;

   public CompositeNode(String var1) {
      super(2, var1);
   }

   public Node getChildNode() {
      return this.childNode;
   }

   public void setChildNode(Node var1) {
      this.childNode = var1;
   }

   public boolean equals(Object var1) {
      if (!super.equals(var1)) {
         return false;
      } else if (!(var1 instanceof CompositeNode)) {
         return false;
      } else {
         CompositeNode var3 = (CompositeNode)var1;
         return (this.childNode != null) ? this.childNode.equals(var3.childNode) : (var3.childNode == null);
      }
   }

   public int hashCode() {
      return super.hashCode();
   }

   public String toString() {
      StringBuilder var1;
      var1 = new StringBuilder();
      Node var2;
      if ((var2 = this.childNode) != null) {
         var1.append("CompositeNode(" + String.valueOf(var2) + ")");
      } else {
         var1.append("CompositeNode(no child)");
      }

      var1.append(((Node)this).printNext());
      return var1.toString();
   }
}
