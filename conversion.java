import java.util.Scanner;
 
public class conversion 
{
    static int conv(int a)
{
        int ans =a*100;
        System.out.println("The amount in rupees:"+ans);
        return 0;
}
    public static void main(String[] args)
    {    int pound , rupee;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount in pounds: ");
         pound = sc.nextInt();
         sc.close();
         rupee = pound*100;
         System.out.println("The amount in rupees: "+rupee);
         conv(5);

    }
    
}
