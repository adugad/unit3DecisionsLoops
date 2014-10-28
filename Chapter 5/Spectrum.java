import java.util.Scanner;

public class Spectrum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a wavelength value: ");
        double lamda = in.nextDouble();
        if (lamda > 1e-1)
        {
            System.out.println("That is a radio wave");
        }
        else if(lamda < 1e-1 && lamda > 1e-3)
        {
            System.out.println("That is a microwave");
        }
         else if(lamda < 1e-3 && lamda > 7e-7)
        {
            System.out.println("That is an infrared ray");
        }
         else if(lamda < 7e-7 && lamda > 4e-7)
        {
            System.out.println("That is visible light");
        }
         else if(lamda < 4e-7 && lamda > 10e-8)
        {
            System.out.println("That is an ultraviolet ray");
        }
         else if(lamda < 10e-8 && lamda > 10e-11)
        {
            System.out.println("That is an X-ray");
        }
         else
        {
            System.out.println("That is a gamma ray");
        }
    }
}