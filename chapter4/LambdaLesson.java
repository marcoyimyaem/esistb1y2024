package chapter4;
import java.util.*;
import java.util.function.Predicate;
public class LambdaLesson{
    static void printAnimal(List<Animal> animals, Predicate<Animal> checker){
        for(Animal animal:animals){
            if(checker.test(animal)){
                System.out.println(animal);
            }
            
        }
        
    }
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true,1));
        animals.add(new Animal("kangaroo", true, false,5));
        animals.add(new Animal("turtle", false, true,10));
        animals.add(new Animal("rabbit", true, false,2));
        animals.add(new Animal("frog", true, true,2));
        animals.add(new Animal("cow", false, false,2));
        System.out.println("Animals that can hop");
        // printAnimal(animals,new CheckIfHopper());
        printAnimal(animals, a -> a.canHop());
        System.out.println("Animals that can swim");
        // printAnimal(animals,new CheckIfSwimmer());
        printAnimal(animals, a -> a.canSwim());
        printAnimal(animals, a -> a.getAge()>3);
        printAnimal(animals, b -> b.canHop() && b.canSwim());
        printAnimal(animals, b -> !b.canHop() && !b.canSwim());
        
    }

}

class Animal {
    private String species;
    private boolean canHop;
    private int age;
    private boolean canSwim;
    public Animal(String speciesName, boolean hopper, boolean swimmer,int age) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
        this.age = age;
    }
    public boolean canHop() { return canHop; }
    public boolean canSwim() { return canSwim; }
    public String toString() { return "\tName: "+species+"\tAge: "+age+"\tCan Hop?: "+canHop+"\tCan Swim?: "+canSwim; } 
    public int getAge() { return age;}
}

interface CheckTrait {
    boolean test(Animal a); 
}
// class CheckIfHopper implements CheckTrait {
//     public boolean test(Animal a) {
//         return a.canHop(); } 
//     }
// class CheckIfSwimmer implements CheckTrait {
//         public boolean test(Animal a) {
//             return a.canSwim(); } 
//     }