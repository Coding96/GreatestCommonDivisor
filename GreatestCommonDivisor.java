
public class GreatestCommonDivisor
{

  public static void main(String[] args)
  {
    //print table header
    System.out.println("---------------------------------------------------------------");
    System.out.print("|---|");
    //preceding formatting
    //loop for outputting the numbers on the y axis
    for (int counter = 2; counter <= 20; counter++)
    {
          //format the numbers to use a constant distance
          System.out.printf("%2d", counter);
          System.out.print( "|");
    }
    System.out.println();
    System.out.println("---------------------------------------------------------------");
    //finish table header
    
    for (int yindex = 2; yindex <=20; yindex++)
    {
      //format numbers to take up a constant distance
      System.out.print("|");
      System.out.printf("%3d",yindex);
      System.out.print("|");

      //x and y index are the values needed for GCD
      for (int xindex = 2; xindex <= 20; xindex++)
      {
        if (gcd(xindex,yindex) == 1)
        {
          System.out.print("--N");
        }
        else
        {
          System.out.print("--"+ gcd(xindex,yindex));
        }
      }
      System.out.println();
    }
    System.out.println("---------------------------------------------------------------");
  }
  
  //generic gcd algorithim
  private static int gcd(int first, int second)
  {
    //until the two numbers are the same
    //minus the smaller from the larger
    while (first != second)
    {
      if (first > second)
      {
        first -= second;
      }
      else if (first < second)
      {
        second -= first;
      }
    }
    int gcd = first;
        return gcd;
  }
}
