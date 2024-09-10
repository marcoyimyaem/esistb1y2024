package chapter5;

public class PolymorphismLesson {
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        System.out.println(lemur.isTailStripped());
        System.out.println(lemur.hasHair());

        Hastail hastail = lemur;
        System.out.println(hastail.isTailStripped());
        // System.out.println(hastail.age);
        // System.out.println(hastail.hasHair());

        Primate primate = lemur;
        System.out.println(primate.hasHair());
        // System.out.println(primate.age);
        // System.out.println(primate.isTailStripped());

        Object lemurAsObject = lemur;
        Lemur x = (Lemur) lemurAsObject;
        System.out.println(x.isTailStripped());
        
        Primate primate2 = new Lemur();
        // Lemur lemur2 = (Lemur) (new Primate());
        // Lemur lemur3 = new Bird(); //mismatch type

        Birds b1 = new Birds();
        b1.displayInfo();
        LoveBirds b2 = new LoveBirds();
        b2.displayInfo();

    }
    
}

class Primate{
    public boolean hasHair(){
        return true;
    }
}
class Birds{
    public String getName(){
        return "unknown";
    }
    public void displayInfo(){
         System.out.println("the bird name is:"+getName());
    }
}
class LoveBirds extends Birds{
    public String getName(){
        return "LoveBird";
    }
}

interface Hastail{
    public boolean isTailStripped();
}

class Lemur extends Primate implements Hastail{
    int age = 10;
    public boolean isTailStripped(){
        return false;
    }
    

}

