package D1_Oops.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        try{
            int x = sc.nextInt();
            if(x<0 || x>100){
                throw new InputMismatchException();
            }
            System.out.println(x);
        }catch (InputMismatchException e){
            System.out.println(e);
        }
    }
}
