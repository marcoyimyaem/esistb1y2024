package chapter4;

import chapter1.subfolder.Grass;

public class MethodsLesson {
    void emptyMethod(){}
    public void publicMethod(){
        System.out.println("this is a public method");
    }
    private void privateMethod(){
        System.out.println("this is a private method");
    }
    protected void protectedMethod(){
        System.out.println("this is a protected method");
    }
    void defaultMethod(){
        System.out.println("this is a default method");
    }
    int bonusPoints(){
        return 5;
    }
    boolean sampleBoolean(){
        return false;
    }
    int getBonusPointsTotal(){
        return bonusPoints()+100;
    }
    Grass getGrass(){
        return null;
    }
    void noReturn(){
        return;
    }
    String walk6(int a) {
        // if (a == 4) return "";
        // else
        //     return "none";
        String result = "";
        if (a == 4) result = "four";
        return result; 
        }
    int longs() {
        return (int) 9L; 
        }
    int addition(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Methods in java");
        MethodsLesson ml = new MethodsLesson();
        ml.publicMethod();
        ml.privateMethod();
        ml.protectedMethod();
        System.out.println(ml.bonusPoints()+100);
        if(ml.sampleBoolean()){

        }
        for(;ml.sampleBoolean();){System.out.println();}
        // new MethodsLesson().publicMethod();
        System.out.println(ml.getBonusPointsTotal());
        System.out.println(ml.addition(50, 50));
    }
}

class OtherClass1{
    public static void main(String[] args) {
        MethodsLesson ml = new MethodsLesson();
        ml.publicMethod();
        ml.protectedMethod();
        ml.defaultMethod();
        // ml.privateMethod();
    }
}
