package chapter1;
import chapter1.subfolder.ClassA;
public class PackageLesson {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        System.out.println(a.code);
        System.out.println(a.code2());
    }
    
}
