package chapter4;

import chapter1.Plant;

public class OverLoadingMethodsLesson {
    static void walk(){
        System.out.println("the player is not moving");
    }
    public static String walk(int steps){
        return "the player moved "+ steps+" steps";
    }
    static void walk(String obj){
        System.out.println("the player walk by "+anCheck(obj.charAt(0))+obj);
    }
    static String anCheck(char c){
        String result="";
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                result = "an ";
                break;
        
            default:
                result = "a ";
                break;
        }
        return result;
    }
    public void fly(int numMiles) { System.out.println("int"); } 
    public void fly(short numFeet) { System.out.println("short"); }
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) {System.out.println("int,short"); }
    public void fly(short numFeet, int numMiles) {System.out.println("short,int"); }
    public void fly(String s) { System.out.println("string "); }
    public void fly(Object o) { System.out.println("object "); }
    // public void fly(double o) { System.out.println("double "); }
    public static void main(String[] args) {
        OverLoadingMethodsLesson olm1 = new OverLoadingMethodsLesson();
        walk();
        System.out.println(walk(5));
        System.out.print(walk(5));
        System.out.println();
        // System.out.print();
        walk("egg");
        int x = 21;
        short y = 11;
        System.out.println(olm1.fly());
        olm1.fly(x);
        olm1.fly(x,y);
        olm1.fly(y,x);
        olm1.fly(300,(short) 400);
        olm1.fly("agfased");
        olm1.fly(5.5);
        olm1.fly(new Plant());

        
    }
    
}
