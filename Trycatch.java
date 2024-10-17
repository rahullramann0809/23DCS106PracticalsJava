import java.util.InputMismatchException;
import java.util.Scanner;

public class Trycatch {
    
    public static void main(String []args)
    {

        try{
            int x,y;
            int ans;
            Scanner S = new Scanner(System.in);
            x= S.nextInt();
            y= S.nextInt();
            S.close();

            ans=x/y;
            System.out.println(ans);
        }

        catch(ArithmeticException e)
        {
              System.out.println("division by zero is not allowed");
        }

        catch(InputMismatchException e)
        {
            System.out.println("Both the values must be integers");
        }
    }
}
