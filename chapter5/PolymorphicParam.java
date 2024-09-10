package chapter5;

public class PolymorphicParam {
    
}

class Reptile{
    public String getName(){
        return "Reptile";
    }
}

class Alligator extends Reptile{
    public String getName(){
        return "Alligator";
    }
}
class Crocodile extends Reptile{
    public String getName(){
        return "Crocodile";
    }
}

class ZooWorker{
    public static void feed(Reptile reptile) {
        System.out.println("Feeding reptile "+reptile.getName());
    }
    public static void main(String[] args) {
        feed(new Reptile());
        feed(new Alligator());
        feed(new Crocodile());
    }
}