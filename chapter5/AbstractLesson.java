package chapter5;

public class AbstractLesson {
    public static void main(String[] args) {
        // Dog d1 = new Dog();
        // Animal a1 = new Animal();
    }
    
}
abstract class Animal {
    int age;
    String name;
    int getAge(){
        return age;
    }
    abstract String getName();
}
abstract class Dog extends Animal{ 
    abstract void method1();
    abstract void method2();
    abstract void method3();
}
class ShihTzu extends Dog implements CanBurrow, CanBurrow2{
    String getName() {
        return "ShihTzu name: "+name;
    }
    public int getMaximumDepth(){
        return 5;
    }
    public int getMaximumDepth2(){
        return 5;
    }

    @Override
    void method1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'method1'");
    }

    @Override
    void method2() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'method2'");
    }

    @Override
    void method3() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'method3'");
    }
   

    
}
abstract interface CanBurrow { // whole structure
    public static final int MINIMUM_DEPTH = 2;
    public abstract int getMaximumDepth();
   }

interface CanBurrow2 { // assumed structure
    int MINIMUM_DEPTH2 = 2;
    int getMaximumDepth2();
   }
interface HasTail {
    public int getTailLength();
   }
interface HasWhiskers {
    public int getNumberOfWhiskers();
   }
interface Seal extends HasTail, HasWhiskers {
   }

interface Herbivore {
    public void eatPlants();
    int MAX_FOOD_CAP = 1;
   }
interface Omnivore {
    int MAX_FOOD_CAP = 2;
    public void eatPlants();
    public void eatMeat();
    default int getMAX_FOOD_CAP(){
        return MAX_FOOD_CAP;
    }
    static int getMAX_FOOD_CAP3(){
        return MAX_FOOD_CAP+3;
    }
   }
class Bear implements Herbivore, Omnivore {
    public void eatMeat() {
        System.out.println("Eating meat");
    }
    public void eatPlants() {
        System.out.println("Eating plants");
    }
    // public int getMAX_FOOD_CAP(){
    //     return 5;
    // }
    public static void main(String[] args) {
        Bear Panda = new Bear();
        System.out.println(Panda.getMAX_FOOD_CAP());
        System.out.println(Omnivore.getMAX_FOOD_CAP3());
    }
}