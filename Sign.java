interface Shape
{
    String getcolour();

    void displayshape();
}

class Circle implements Shape
{
    int radius;
    String colour;
    public Circle(int radius,String colour)
     {
        this.radius=radius;
        this.colour=colour;
     }

     public int getRadius()
     {
        return radius;
     }

     public String getcolour()
     {
        return colour;
     }

     public void displayshape()
     {
       System.out.println("The Circle is having Radius "+radius+" and the colour is "+colour);
     }
}

class Rectangle implements Shape
{
    int length,width;
    String colour;

    Rectangle(int length, int width, String colour)
    {
        this.length=length;
        this.width=width;
        this.colour=colour;
    }
    public int getLength()
    {
        return length;
    }

    public int getWidth()
    {
        return width;
    }

    public String getcolour()
    {
       return colour;
    }

    public void displayshape()
    {
        System.out.println("The Rectangle is having length "+length+" the width is "+width+" and the colour is"+colour );
    }
}

class Sign
{
    private Shape shape;
    private String text;

    Sign(Shape shape,String text)
    {
        this.shape=shape;
        this.text=text;
    }

    void displaySign()
    {
        shape.displayshape();
        System.out.println("The text is"+text);
    }

    public static void main(String[] args)
    {
        Circle A = new Circle(6, "Blue");
        A.displayshape();
    
    }
}