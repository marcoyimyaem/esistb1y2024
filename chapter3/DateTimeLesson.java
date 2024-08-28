package chapter3;
import java.time.*;

public class DateTimeLesson {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        LocalDate date1 = LocalDate.of(2025, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2025, 9, 3);
        LocalTime time1 = LocalTime.of(22, 01);
        LocalTime time2 = LocalTime.of(0, 0,0);
        LocalTime time3 = LocalTime.of(0, 0,0,0);
        LocalDateTime ldt1 = LocalDateTime.of(2024,12,25,15,30);
        LocalDateTime ldt2 = LocalDateTime.of(date2,time2);
        // minus or plus - Days,Weeks,Months,Years
        System.out.println(date1.plusDays(20));
        // minus or plus - Hours, Minutes,Seconds,Nanos
        System.out.println(time1.plusHours(4));
        // minus or plus - Days,Weeks,Months,Years,Hours, Minutes,Seconds,Nanos
        System.out.println(ldt1.plusDays(20).plusHours(4).minusMinutes(15));
        System.out.println(date1);
    }    
}
