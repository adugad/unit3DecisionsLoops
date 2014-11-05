import java.util.Scanner;

public class Substring
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.print("Enter a word: ");
String word = in.next();


for (int index = 1; index <= word.length(); index++)
{
for (int num = 0; num <= word.length() - index; num++)
{
System.out.println(word.substring(num, num + index));
}
}
}
}