package chapter3;
import java.util.*;
public class ArrayListLesson {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        list2.add(32);
        list2.add(5.5);
        list2.add("Hello");
        list2.add('c');
        list2.add(true);     
        ArrayList list3 = new ArrayList(list2);
        list3.add(new Random());
        list2.set(0, 23);
        System.out.println();
        ArrayList<String> list5 = new ArrayList<>();
        list5.add("red");
        // list5.add(21); error

        System.out.println(list3);
        
        System.out.println(list3.get(0));
        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add(1, "robin"); // [hawk, robin]
        birds.add(0, "blue jay"); // [blue jay, hawk, robin]
        birds.add(3, "cardinal"); // [blue jay, cardinal, hawk, robin]
        System.out.println("we have "+ birds.size()+" birds");
        System.out.println(birds); // [blue jay, cardinal, hawk, robin]
        int a = 15;
        int b = 20;
        System.out.println(new Integer(a).compareTo(b));
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number that we will add 10");
        System.out.println(Integer.parseInt(input.nextLine())+10);
        // System.out.println(Integer.MAX_VALUE);
        List numbers = new ArrayList<>();
        numbers.add(1); numbers.add(2);
        numbers.remove(1);
        System.out.println(numbers);
        List<String> dogs = Arrays.asList("aspi", "collie","pitbull","bully");
        System.out.println(dogs);
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(99);
        numbers2.add(5);
        numbers2.add(81);
        Collections.sort(numbers2);
        System.out.println(numbers2); //[5, 81, 99]
        Collections.reverse(numbers2);
        System.out.println(numbers2);
        Collections.shuffle(numbers2);
        System.out.println(numbers2);
        // [0,1,2,3,4]
        // [0,1,2,3,4] = [1,4,2,3,0]
        // [0,1,2,3,4]
        
    }
}
