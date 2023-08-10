package D1_Oops.ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        try{
            int n = 10/0;
        }catch (ArithmeticException e){
            System.out.println("Please enter valid expression");
        }
    }
}
