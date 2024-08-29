package otherFolder;

import chapter4.MethodsLesson;
import chapter4.VarArgsLesson;

public class OtherClass2 extends MethodsLesson{
    static public void main(String[] args) {
        MethodsLesson ml = new MethodsLesson();
        OtherClass2 oc2 = new OtherClass2();
        ml.publicMethod();
        //ml.protectedMethod();
        oc2.protectedMethod();
        // oc2.defaultMethod();
        // ml.privateMethod();
        
    }
}
class OtherClass3 extends VarArgsLesson{
    public static void main(String[] args) {
       
        OtherClass3 oc3 = new OtherClass3();
        // System.out.println(val.prodPrice);
        System.out.println(oc3.amount);
        // System.out.println(val.prodName);
        System.out.println(oc3.isOnSale);
        System.out.println(new OtherClass3().isOnSale);
    }
}