package chapter2;

import java.time.LocalDate;
import java.time.Month;

public class IfLesson {
    public static void main(String[] args) {
        int timeNow = 5;
        if(timeNow>4)
            System.out.println("Good Morning");
        System.out.println("Welcome to Java nc III");
        
        if(timeNow>11)
            System.out.println("Good Afternoon");
        else
            System.out.println("Good Morning");

        if(timeNow>17)
            System.out.println("Good Eve");
        else if(timeNow==12)
            System.out.println("Lunch Break");
        else if(timeNow>11)
            System.out.println("Good Afternoon");
        else
            System.out.println("Good Morning");
        
        int dayNow = 99;
        switch (dayNow) {
            
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tues"); break;
            case 3: System.out.println("Wed"); break;
            default: System.out.println("Weekend"); break;
            case 4: System.out.println("Thur"); break;
            case 5: System.out.println("Fri"); break;
            

        }



    }
}
