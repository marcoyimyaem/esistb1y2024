package chapter4;

public class ConstructorLesson {
    public static void main(String[] args) {
        Bunny b1 = new Bunny();
        Bunny b2 = new Bunny();
        b2.name = "victor";
        b2.age = 2;
        b2.color = "brown";
        Bunny b3 = new Bunny("Buggs",3,"gray");
        System.out.println();
        
    }
    
}
class Bunny { 
    String name;
    int age;
    String color;
    public Bunny() { 
        this("Cardo",1,"white");
        System.out.println("Bunny constructor called"); 

    }
    public Bunny(String name,int age, String color) { 
        this.name = name;
        this.age = age;
        this.color = color;
    }
    
    
 }
 class Mouse {
    private int numTeeth;
    private int numWhiskers;
    private int weight;
    
    public Mouse(int weight) {
    this(weight, 16); } // calls constructor with 2 parameters
    
    public Mouse(int weight, int numTeeth){ 
        this(weight, numTeeth, 6); } // calls constructor with 3 parameters
    
    public Mouse(int weight, int numTeeth, int numWhiskers) {
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers; }
    
    public void print() { 
        System.out.println(weight + " " + numTeeth + " " + numWhiskers); }
        public static void main(String[] args) {
        Mouse mouse = new Mouse(15);
        mouse.print(); 
        } 
    }
