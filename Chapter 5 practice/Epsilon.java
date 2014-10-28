import java.util.Scanner;

/**
 * Write a description of class Epsilon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Epsilon
{
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main(String[] args)
    {
        final double EPSILON = 1e-42;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        double num = in.nextDouble();
        
        String magnitude = "";
        if(Math.abs(num)<1.0)
        {
            magnitude = "small";
        }
        else if(Math.abs(num) > 1000000.0)
        {
            magnitude = "large";
        }
        if(Math.abs(num-0) < EPSILON)
        {
            System.out.println("Zero");
        }
        else if(num > 0)
        {
            System.out.println(magnitude +"Positive");
        }
        else
        {
            System.out.println(magnitude +"Negative");
        }
    }

}
