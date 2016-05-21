import java.util.Scanner;

public class Test
{

    /**
     * Create a Magpie, give it user input, and print its replies.
     */
    public static void main(String[] args)
    {
        
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();
        String word = in.nextLine();
        
        while (!statement.equals("Bye"))
        {
            int position = statement.indexOf(word);
            System.out.println (" Position = " + position);
            
            String phrase = statement.trim();
		// The only change to incorporate the startPos is in
		// the line below
		int psn = phrase.toLowerCase().indexOf(
				word, position);

		// Refinement--make sure the goal isn't part of a
		// word
		while (psn >= 0)
		{
			// Find the string of length 1 before and after
			// the word
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn)
						.toLowerCase();
				System.out.println("Before: " + before);
        
			}
			if (psn + word.length() < phrase.length())
			{
				after = phrase.substring(
						psn + word.length(),
						psn + word.length() + 1)
						.toLowerCase();
						System.out.println("After: " + after);
			}

        }
        
        
    }

}
}