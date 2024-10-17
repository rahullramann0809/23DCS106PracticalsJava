import java.util.Scanner;

class speed {

    public static void main(String[] args)
    {
        System.out.print("Enter the distance in metres:");
        double metre,hour,min,sec,s1,s2,s3,ts,th;
        Scanner sc = new Scanner(System.in);
        metre= sc.nextDouble();
        System.out.print("Enter hours taken to reach distance: ");
        hour= sc.nextDouble();
        System.out.print("Enter minutes taken to reach distance: ");
        min= sc.nextDouble();
        System.out.print("Enter seconds taken to reaach distance:");
        sec=sc.nextInt();
        sc.close();
        ts= sec+( min * 60) + (hour* 3600);
        
        th= hour+ (min/60) + (sec/3600);
        s1= metre/ts;
        s2= (metre/1000) * th;
        s3= (metre/1609) * th;
        System.out.print("\nSpeed in metre per second is: "+s1);
        System.out.print("\nSpeed in kilometre per hours is:"+s2);
        System.out.print("\nSpeed in miles per hour is: "+s3);

        
    }
    
}
