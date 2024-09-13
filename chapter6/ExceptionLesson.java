package chapter6;

public class ExceptionLesson {

    public static void main(String[] args) throws MyprogramHandlerException  {
        // throw new Exception("Ow! I fell."); 
        throw new MyprogramHandlerException("Aray ko po!");
    }
    
}

class MyprogramHandlerException extends RuntimeException{
    public MyprogramHandlerException(String msg){
        super(msg);
        System.out.println("code: 5040603");
    }
}