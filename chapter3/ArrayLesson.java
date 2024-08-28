package chapter3;
import java.util.*;
public class ArrayLesson {
    public static void main(String... args) {
        int[] numbers1 = new int[3];
        System.out.println(numbers1);
        // int[] numbers2 = new int[] {42, 55, 99};
        int[] numbers2 = {42, 55, 99,};
        System.out.println(numbers2[2]);
        int[] numAnimals; 
        int [] numAnimals2;
        int numAnimals3[]; 
        int numAnimals4 [];

        int[] ids, types;
        ids = new int[3];
        types = new int[3];
        int ids2[], types2;
        ids2 = new int[3];
        types2 = 3;

        String [] bugs = { "cricket", "beetle", "ladybug" };
        String [] alias = bugs;
        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs.toString());
        System.out.println(alias.toString()); 
        String names[] = new String[2];
        // String namesL = new Stringbuilder("Yimyaem").toString();
        String namesL ="Yimyaem";
        Object object = namesL;
        StringBuilder namesF = new StringBuilder();
        object = namesF;
        System.out.println(bugs.length);
        for(String bug:bugs)
            System.out.print(bug+", ");
        System.out.println();
        int[] numbers3 = { 6, 9, 1 };
        Arrays.sort(numbers3);
        for(int number:numbers3)
            System.out.print(number+", ");
        System.out.println();
        String[] strings = { "10","a","!","B", "9", "100","1","12","45","66","12000","2000","90" };
        Arrays.sort(strings);
        for (String string : strings)
            System.out.print(string + " ");
        System.out.println(strings);
        String[] strings2 = { "10","a","!","B", "9", "100","1","12","45","66","12000","2000","90" };
        System.out.println(Arrays.binarySearch(strings2, "?"));
        System.out.println(Arrays.binarySearch(strings2, "A"));
        int[] codes = {1,3,5,7,9,10};
        System.out.println(Arrays.binarySearch(codes,5));
        System.out.println(Arrays.binarySearch(codes,10));
        System.out.println(Arrays.binarySearch(codes,2));
        System.out.println(Arrays.binarySearch(codes,8));
        System.out.println(Arrays.binarySearch(codes,-1000));
        int[][] differentSize = {{1, 4}, {3}, {9,8,7}};
        System.out.println(differentSize[1][0]);

    }
}
