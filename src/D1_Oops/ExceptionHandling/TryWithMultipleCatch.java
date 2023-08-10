package D1_Oops.ExceptionHandling;

public class TryWithMultipleCatch {
    public static void main(String[] args) {
        try{
            int n = 10/0;
            String s = null;
            System.out.println(s);
            System.out.println(s.charAt(0));
        }catch (ArithmeticException e){
            System.out.println("Invalid Expression");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
    }
}
