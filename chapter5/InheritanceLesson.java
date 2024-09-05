package chapter5;

public class InheritanceLesson{
    public static void main(String[] args) {
        WitchDog dog1 = new WitchDog("Dilaw",2,true,3,3);
    }

}
// final class Hayop{ final class cannot be extend
class Hayop {
    protected String name;
    protected int age;
    public Hayop(String name,int age){
        this.name = name;
        this.age = age;

    }
}

class Mammal extends Hayop{
    protected boolean hasHair;
    protected int numberOfFeet;

    public Mammal(String name,int age,boolean hasHair, int numberOfFeet) {
        super(name, age);
        this.hasHair = hasHair;
        this.numberOfFeet = numberOfFeet;
    }
     
    
}

class Dog extends Mammal{
    protected int weight;
    public Dog(String name,int age,boolean hasHair, int numberOfFeet,int weight) {
        super(name, age, hasHair, numberOfFeet);
        this.weight = weight;
    }
    
}
class Bird extends Mammal{

    public Bird(String name, int age, boolean hasHair, int numberOfFeet) {
        super(name, age, hasHair, numberOfFeet);
        
    }

}

class ShihTzu extends Dog{

    public ShihTzu(String name, int age, boolean hasHair, int numberOfFeet, int weight) {
        super(name, age, hasHair, numberOfFeet, weight);
        
    }

}
class WitchDog extends Dog{

    public WitchDog(String name, int age, boolean hasHair, int numberOfFeet, int weight) {
        super(name, age, hasHair, numberOfFeet, weight);
    }
    
}
class Doberman extends Dog{

    public Doberman(String name, int age, boolean hasHair, int numberOfFeet, int weight) {
        super(name, age, hasHair, numberOfFeet, weight);
        
    }
    
}
class LoveBird extends Bird{

    public LoveBird(String name, int age, boolean hasHair, int numberOfFeet) {
        super(name, age, hasHair, numberOfFeet);
        //TODO Auto-generated constructor stub
    }

}