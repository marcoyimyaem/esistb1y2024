package chapter3;

public class StringLesson {
    public static void main(String[] args) {
        String name = "Fluffy";
        String name2 = new String("Fluffy");
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name==name2);
        String s = "1";
        s += "2";
        s += 3;
        System.out.println(s);
        String firstName = "boy";
        firstName = "marco";
        System.out.println(firstName);
        System.out.println(firstName.length());
        String city = "mississippi";
        System.out.println(city.indexOf('i',19));
        System.out.println(city.substring(3));
        System.out.println(city.substring(3,8));
        System.out.println(city.length());
        System.out.println(city.substring(3, 11));
        System.out.println(city.contains("miss"));
        System.out.println(city.replace('i', 'a'));
        System.out.println(city);
        String Brgy = " ! m a \tr c o  ";
        System.out.println(Brgy.trim());
        
    }
}
