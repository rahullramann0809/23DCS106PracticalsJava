import java.util.Scanner;
class p1{

   String color;
   String model;
   int year;

   p1()
   {
      this.color = null;
      this.model = null;
      this.year = 0;
   }
    
    void getdata(String color, String model, int year)
    {
        System.out.println(color);
        System.out.println(model);
        System.out.println(year);
    }

    void setdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter color:");
        color =sc.nextLine();
        System.out.println("enter model:");
        model= sc.nextLine();
        System.out.println("enter year:");
        year =sc.nextInt();
        sc.close();
        System.out.println(color);
        System.out.println(model);
        System.out.println(year);
    }

    public static void main(String[] args)
    {
        p1 r =new p1();
        r.getdata("blue", "buggati", 2023);
        r.setdata();
    }
}