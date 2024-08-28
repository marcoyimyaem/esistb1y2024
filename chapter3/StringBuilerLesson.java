package chapter3;

public class StringBuilerLesson {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); // sb = start+middle
        StringBuilder same = sb.append("+end");
        System.out.println(sb+" - "+same);
        StringBuilder sb2 = new StringBuilder().append(1).append('c');
        sb2.append("-").append(true);
        System.out.println(sb2); // 1c-true
        StringBuilder sb3 = new StringBuilder("animals");
        sb3.insert(7, "-"); //animals-
        sb3.insert(0, "-"); //-animals-
        sb3.insert(4, "-"); // -ani-mals
        System.out.println(sb3);
        StringBuilder sb4 = new StringBuilder("abcdef");
        sb4.delete(1, 3); // sb = adef
        System.out.println(sb4);
        sb4.deleteCharAt(3); // throws an exception
        System.out.println(sb4);
        StringBuilder city2 = new StringBuilder("mississippi");
        System.out.println(city2.reverse());
        String city = city2.toString();
        String x = new String("Hello World");
        String y  = "Hello World";
        System.out.println(x==y);

    }
    
}
