class p2 {
    double width;
    double height;
    double depth;

    p2()
    {
        this.width =0;
        this.height =0;
        this.depth=0;
    }

    p2(double width, double height, double depth)
    {
        this.width =width;
        this.height =height;
        this.depth=depth;
    }   
   void calvolume()
   {
    System.out.println("Volume: "+(width*depth*height));
   }
   double calvolume(double width,double height,double depth)
   {
    
    return width*height*depth;
   }
   
}

class Mymain{
    public static void main(String[] args)
    {
        p2 c =new p2(10,10,10);
        System.out.println(c.width);
        System.out.println(c.height);
        System.out.println(c.depth);
        c.calvolume();
        System.out.println(c.calvolume(20, 1, 1));
    }
}
