 class str1   {
    public static String fronttimes(String s1, int n)
    {
        String front;
    if(s1.length()>3)
    {
         front = s1.substring(0, 3);
    }
    else{
        front =s1;
    }
    

    StringBuilder result = new StringBuilder();
    for(int i=0; i<n ; i++)
    {
        result.append(front);
    }
 
    return result.toString();

}
    

public static void main(String[] args)
{
    System.out.println(fronttimes("Chocolate", 2));  // Output: 'ChoCho'
    System.out.println(fronttimes("Chocolate", 3));  // Output: 'ChoChoCho'
    System.out.println(fronttimes("Abc", 3));        // Output: 'AbcAbcAbc'
    System.out.println(fronttimes("A", 4));          // Output: 'AAAA'
}
}
