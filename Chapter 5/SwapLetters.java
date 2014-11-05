import java.util.Scanner;
import java.util.Random;

public class SwapLetters
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.print("Enter a word that is at least two letters: ");
Random gen = new Random();

String word = in.next();
int swap1 = 0;
int swap2 = 0;
System.out.println("");
for (int index = 0; index < word.length(); index++)
{
swap1 = gen.nextInt(word.length() - 1);
swap2 = gen.nextInt(word.length());
while (swap2 <= swap1)
{
swap2 = gen.nextInt(word.length());
}
String i = word.substring(swap1, swap1 + 1);
String j = word.substring(swap2, swap2 + 1);
word = word.substring(0, swap1) + j + word.substring(swap1 + 1, swap2) + i + word.substring(swap2 + 1, word.length());
}
System.out.println(word);
}
}