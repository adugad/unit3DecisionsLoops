import java.util.Scanner;
public class Diamond
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer greater than 0: ");
        int num = in.nextInt();
        
        String asterisk = "*";
        String space = " ";
        String diamond = "";
        for(int index=1;index <= num; index++)
        {
            
            for(int index1 =0; index1<index; index1++)
            {
                diamond = diamond+asterisk;
            }
            System.out.println(diamond);
        }
        
        for(int index=num;index >= 0; index=index-2)
        {
            
            for(int index1 =0; index1<index; index1++)
            {
                diamond = diamond.substring(0,index+1);
            }
            System.out.println(diamond);
           
        }
    }
}