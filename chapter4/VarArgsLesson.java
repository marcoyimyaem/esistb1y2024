package chapter4;

public class VarArgsLesson {
    public int amount = 1;
    String prodName = "Mug";
    protected boolean isOnSale = true;
    private float prodPrice = 5.90f;
    static int counter = 1;
    final static double EARTHS_GRAVITY;
    static{
        EARTHS_GRAVITY = 9.8;
    }

    public void walk1(int... nums){
        System.out.println("walk1 there are "+nums.length+" steps");
    }
    public void walk2(int start,int mid,int... nums){
        System.out.println("walk2 there are "+nums.length+" steps");
    }
    static void getCounter(){
        System.out.println(counter);
    }
    public static void main(String... args) {
        VarArgsLesson val = new VarArgsLesson();
        VarArgsLesson val2 = new VarArgsLesson();
        int[] i = {1,2,3,4,5,6,7,8,9,10};
        val.walk1(i);
        val.walk1(new int[]{1,2,3,4,5,6,7,8,9,10});
        // val.walk1(1,2,3,4,5,6);
        val.walk2(1,2,3,4,5,6);
        System.out.println(val.prodPrice);
        System.out.println(counter);
        getCounter();
        val.amount =100;
        val2.amount=200;
        System.out.println(val.amount);
        System.out.println(val2.amount);
        val.counter =2;
        val2.counter = 3;
        counter=10;
        System.out.println(val.counter);
        System.out.println(val2.counter);
        System.out.println(counter);

        val = null;
        val2 = null;
        System.out.println(val.counter);
        System.out.println(val2.counter);
        System.out.println(counter);
        // EARTHS_GRAVITY++;
    }
}

class AB{
    public static void main(String[] args) {
        VarArgsLesson val = new VarArgsLesson();
        // System.out.println(val.prodPrice);
        System.out.println(val.amount);
        System.out.println(val.prodName);
        System.out.println(val.isOnSale);

    }
}
