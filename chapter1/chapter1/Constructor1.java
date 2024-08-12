package chapter1;

public class Constructor1 {
    public static void main(String[] args) {
        Soda s1 = new Soda();
        {System.out.println("Soda middle");}
        Soda s2 = new Soda();
        Soda s3;
        s2.name = "Sprite";
        System.out.println(s1.name);
        System.out.println(s2.name);
        {System.out.println("Soda middle2");}
        s2.Soda();
        System.out.println(s2.name);
        
        
    }
    
}

class Soda{
    { System.out.println("soda start");}
    String name;
    public Soda(){
        System.out.println("New Generated Soda");
        name = "RC";
    }
    public void Soda(){
        System.out.println("Soda");
        name = "Royal";
    }
    { System.out.println("soda end");}
}
