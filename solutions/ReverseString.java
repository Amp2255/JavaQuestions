import java.util.Scanner;
import org.xml.sax.InputSource;
import java.util.logging.*;

public class ReverseString {
    private static Logger logger = Logger.getLogger(ReverseString.class.getName());
    public static void main(String[] args) {
        logger.info("Enter the string to reverse:");
        Scanner inputString = new Scanner(System.in);
        String str = inputString.nextLine();
        try{
            String rev = reverse(str);
            logger.info("String in reverse:");
            logger.info(rev);
        }
        catch(Exception e){
            logger.warning("String reverse failed with exception "+ e);
        }
        finally{
            inputString.close();
        }
    
    }
        
            private static String reverse(String str) {
                if(str==null){
                    logger.info("null string");
                }
                if(str.isEmpty()){
                       throw new NullPointerException("String is empty");}
                
                StringBuilder strBuilder = new StringBuilder();
                
                char [] out = str.toCharArray();
                for(int i=out.length-1;i>=0;i--){

                   strBuilder= strBuilder.append(out[i]);

                }
                return strBuilder.toString();
               }
}


