package chapter2;

import chapter1.Plant;

public class OperatorsLesson {
    public static void main(String[] args) {
        int expression =  +10;
        boolean isRunning = false;
        expression++;
        System.out.println(--expression);
        System.out.println(!!isRunning); //!(!false) = !(true) = false
        System.out.println(5/3);
        System.out.println(5%3);
        System.out.println(8>>2);
        System.out.println(2<<2);
        // 0000
        // 8421
        // 0010
        System.out.println(5<9);
        System.out.println(5>9);
        System.out.println(1<=1);
        short p = 100;
        System.out.println(100 == p);
        System.out.println(p != 100);
        String valid = (isRunning) ? "the machine is able to operate" : "machine is broken"; 
        System.out.println(valid);
        System.out.println(5.0/3);
        short x = 10;
        short y = 3;
        short z =(short) (x * y);
        long a = 10;
        int b = 3;
        b*=a; // b =(type of b) b * a
        long c = 5;
        long d = (c=10+605*190);
        System.out.println(c);
        System.out.println(d);
        Plant p1 = new Plant();
        Plant p2 = new Plant();
        Plant p3 = (p1=p2);
        // logical ops
        System.out.println(false&&true);
        System.out.println(true||false);
        System.out.println(true^true);
        
    }
    
}
