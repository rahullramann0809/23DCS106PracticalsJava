class Rectangle {
    int length,breadth;

    Rectangle(int length,int breadth)
    {
        this.breadth=breadth;
        this.length=length;
    }

    void area()
    {
      System.out.println("The Area of the Rectangle is:"+(length*breadth));
    }

    void perimeter()
    {
        System.out.println("The Perimeter of the Rectangle is:"+(2*(length+breadth)));
    }

}

class Sqaure extends Rectangle
{
  Sqaure(int s)
  {
    super(s,s);
    
  }

  void area()
  {
    System.out.println("The area of sqaure is:"+(length*length));
  }

  void perimeter()
  {
    System.out.println("The Perimeter of Square is:"+(4*length));
  }
   public static void main(String[] args)
  {
       Rectangle rect = new Rectangle(5, 4);
       Sqaure squa = new Sqaure(9);
       rect.area();
       rect.perimeter();
       squa.area();
       squa.perimeter();   
  }
}
