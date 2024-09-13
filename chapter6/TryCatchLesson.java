package chapter6;

public class TryCatchLesson {
    public static void main(String[] args) {
        int i = 0;
        try{
            System.out.println(args[0]);
            i = Integer.parseInt(args[0]);
            // System.exit(0);
            i=i/0;
        }catch(IndexOutOfBoundsException a){
            System.out.println("no value for args[0]: default value is");
            
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println("do not divide by zero");
        }
        finally{
            System.out.println("will always run");
        }
        System.out.println("End of program");
    }
}
