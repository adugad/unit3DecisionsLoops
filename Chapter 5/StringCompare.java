public class StringCompare
{
    public static void main(String[] args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        String word3 = "aaa";
        int result = word1.compareTo(word2);
        int result1 = word1.compareTo(word3);
        String word4 = word1.substring(0,3);
        int result2 = word2.compareTo(word4);
        if(result1 == 0)
        {
            System.out.println("The two words are lexicographically equal");
        }
        else if(result1 < 0)
        {
            System.out.println("Word 1 is lexicographically less than word 3");
        }
        else
        {
            System.out.println("Word 1 is lexicographically greater than word 3");
        }
        
        if(result2 == 0)
        {
            System.out.println("The two words are lexicographically equal");
        }
        else if(result2 < 0)
        {
            System.out.println("Word 2 is lexicographically less than word 4");
        }
        else
        {
            System.out.println("Word 2 is lexicographically greater than word 4");
        }
        
        if(result == 0)
        {
            System.out.println("The two words are lexicographically equal");
        }
        else if(result < 0)
        {
            System.out.println("Word 1 is lexicographically less than word 2");
        }
        else
        {
            System.out.println("Word 1 is lexicographically greater than word 2");
        }
        
        if(word2.equals(word4))
        {
            System.out.println("Word 1 and word 2 have the same three-letter prefix");
        }
        else
        {
            System.out.println("Word 1 and word 2 do not have the same three-letter prefix");
        }
    }
}