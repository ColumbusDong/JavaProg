public class Bleh
{
    public static void main(String args[])
    {
        String word = "ABRACADABRA";
        String newWord = "";
        
        for (int i = 0; i < word.length() - 1; i++)
        {
            System.out.println(newWord);
            if (word.charAt(i) == 'A' && word.charAt(i+1) != 'A')
            {
                newWord += word.toString().charAt(i+1) + word.toString().charAt(i);
                i += 2;
               
            }
            else
            {
                newWord += word.toString().charAt(i);
            }
        }
        
        System.out.println(newWord);
    }
}