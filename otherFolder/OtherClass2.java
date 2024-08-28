package otherFolder;

import chapter4.MethodsLesson;

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