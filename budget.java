import java.util.Scanner;
public class budget {
    public static void main(String[] args)
    {
        int[] exp = new int[30];
        int i,sum=0;
        Scanner sc= new Scanner(System.in);
        for(i=0;i<exp.length;i++)
        {
            System.out.print("Enter expense of day "+(i+1)+":");
            
            exp[i] = sc.nextInt();
            sc.close();
            
            
        }
           
        for(i=0;i<exp.length;i++)
        {
            sum = sum + exp[i];
        }
        
        System.out.print("The sum of expenses are: "+sum);

        
    }
}
