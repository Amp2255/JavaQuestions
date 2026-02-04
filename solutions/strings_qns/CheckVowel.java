package strings_;
import java.util.Scanner;
import java.util.logging.Logger;

public class CheckVowel {
    private static Logger logger = Logger.getLogger(CheckVowel.class.getName());
    public static void main(String[] args) {

        logger.info("Enter the string:");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        input.close();
        Boolean hasVowel = checkContainsVowel(str.toLowerCase());
        if(hasVowel != null && hasVowel)
            logger.info("Entered string has vowel");
            
        else 
            logger.info("Entered string has no vowels");
            }
            private static boolean checkContainsVowel(String str) {
                return str.matches(".*[aeiou].*");
            }
    
}
