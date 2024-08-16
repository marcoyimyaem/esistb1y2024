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
        String[] colors = {"red","black","blue","pink","white","green","yellow"};
        for(String color: colors)
            System.out.println("this is color "+color);
        
ROW:        for(int x = 1;x<=10;x++){
COL:            for(int y=1;y<x;y++){
                    if(y==5)
                        break COL;
                    System.out.print("*");
            }
            System.out.println();
        }
ROW2:        for(int x = 1;x<=10;x++){
COL2:           for(int y=1;y<=10;y++){
                    if(y==7)
                        continue COL2;
                    System.out.print(y*x+"\t");
                    }
                System.out.println();
                }
    }
}
