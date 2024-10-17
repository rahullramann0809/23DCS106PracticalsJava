import java.util.Scanner;
 class Area {
    int length,breadth;

    Area(int length, int breadth)
    {
       this.length = length;
       this.breadth = breadth;
    }
    
    int returnArea()
    {
        
        return length*breadth;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the breath:");
        int breadth = sc.nextInt();
        sc.close();

        Area rectangle = new Area(length, breadth);
        int area;
        area = rectangle.returnArea();
        System.out.println("The Area of the Rectangle is: "+area);
        
    }
}
