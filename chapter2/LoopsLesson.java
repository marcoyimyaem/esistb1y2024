package chapter2;

public class LoopsLesson {
    public static void main(String[] args) {
        int i=1;
        while (i<=10){
            System.out.println("while i  = "+ i); 
            i++;
        }
        do{
            System.out.println("do i  = "+ i--);
        }while(i>0);
            
        for(int y = 1;y<=10;System.out.println("y = "+ y++)){}
            
    }
}
