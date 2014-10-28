import java.util.Scanner;

public class FindFirstMatch
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        str = str.trim();
        boolean found = false;
        int index = 0;
        while(!found&&index<str.length())
        {
            char ch = str.charAt(index);
            if(ch == ' ')
            {
                found = true;
            }
            index++;
        }
        System.out.println("Index of first space: "+ index);
    }
}