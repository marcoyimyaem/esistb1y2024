package chapter4;

public class EncapLesson {
    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.setNumberEggs(-10);
        System.out.println(mother.getNumberEggs());
        
        
    }    
}

class Swan {
    private int numberEggs; // private
    public int getNumberEggs() { // getter
        return numberEggs;
    }
    public void setNumberEggs(int numberEggs) { // setter
        if (numberEggs >= 0) // guard condition
            this.numberEggs = numberEggs; 
    } 
} 