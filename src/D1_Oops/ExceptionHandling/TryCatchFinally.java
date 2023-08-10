package D1_Oops.ExceptionHandling;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println(excute());
    }

    private static int excute() {
        try{
//            int x = 10/0;
            int x1 = 10/2; // In both the case finally will execute always
            System.exit(0);
        }catch(ArithmeticException e){
            return 20;
        }finally {
            return 50;
        }
    }
}
