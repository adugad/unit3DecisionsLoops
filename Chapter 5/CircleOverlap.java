import java.util.Scanner;
public class CircleOverlap
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      double xcenter1 = 0;
      double ycenter1 = 0;
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      double xcenter2 = 40;
      double ycenter2 = 0;
      
      double value = radius1 + radius2;
      if(value == 40)
      {
          System.out.println("The circles both share one point");
      }
      else if(value < 40)
      {
          System.out.println("The circles are not in contact with each other");
      }
      else
      {
          System.out.println("The circles are overlapping");
      }
      if(radius1 >40)
      {
          if(radius2 < (radius1 - 40))
          {
              System.out.println("One circle is mutually contained within the other circle");
          }
          else if(radius2 == (radius1-40))
          {
              System.out.println("Both circles are sharing a point and one circle is mutually contained within the other circle");
            }
        }
      if(radius2 >40)
      {
          if(radius1 < (radius2 - 40))
          {
              System.out.println("One circle is mutually contained within the other circle");
          }
          else if(radius1 == (radius2-40))
          {
              System.out.println("Both circles are sharing a point and one circle is mutually contained within the other circle");
            }
        }
   }
}