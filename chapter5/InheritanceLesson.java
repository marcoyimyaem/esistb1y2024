package chapter5;

public class InheritanceLesson{

    Dog getDog(){ //  covariant
        Doberman dbm1 = new Doberman(null, 0, false, 0, 0);
        return dbm1;
    }
    public static void main(String[] args) {
        WitchDog dog1 = new WitchDog("Dilaw",2,true,3,3);
        System.out.println(dog1.getWeight());
        System.out.println();
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
    private int weight = 10;
    public Dog(String name,int age,boolean hasHair, int numberOfFeet) {
        super(name, age, hasHair, numberOfFeet);
        
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
     static void print(){
        System.out.println("Dog");
    }
    
}
class Bird extends Mammal{

    public Bird(String name, int age, boolean hasHair, int numberOfFeet) {
        super(name, age, hasHair, numberOfFeet);
        
    }

}

class ShihTzu extends Dog{

    public ShihTzu(String name, int age, boolean hasHair, int numberOfFeet, int weight) {
        super(name, age, hasHair, numberOfFeet);
        
    }

}
class WitchDog extends Dog{

    public WitchDog(String name, int age, boolean hasHair, int numberOfFeet, int weight) {
        super(name, age, hasHair, numberOfFeet);
    }
    public int getWeight() {
        return super.getWeight()+10;
    }
    public static void print(){
        // super.print(); method hidding
        System.out.println("Witch Dog");
    }
    
}
class Doberman extends Dog{

    public Doberman(String name, int age, boolean hasHair, int numberOfFeet, int weight) {
        super(name, age, hasHair, numberOfFeet);
        
    }
    public int getWeight() {
        return super.getWeight()+20;
    }
    
}
class LoveBird extends Bird{
    
    public LoveBird(String name, int age, boolean hasHair, int numberOfFeet) {
        super(name, age, hasHair, numberOfFeet);
        //TODO Auto-generated constructor stub
    }

}