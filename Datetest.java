 class Datetest {

    public static void main(String[] args)
{
    Date display = new Date(4, 8, 2023);
    display.displayDate();
}
    
}

class Date
{
  int day;
  int month;
  int year;

  Date(int day,int month,int year)
  {
    this.day=day;
    this.month=month;
    this.year=year;
  }

  int getday()
  {
    return day;
  }
  void setday(int day)
  {
  this.day = day;
  }
  int getmonth()
  {
    return month;
  }
  void setmonth(int month)
  {
    this.month=month;
  }
  int getyear()
  {
    return year;
  }
  void setyear(int year)
  {
    this.year=year;
  }
  void displayDate()
  {
    System.out.println(""+day+"/"+month+"/"+year+"");
  }
}
