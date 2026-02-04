import java.util.ArrayList;
import java.util.Scanner;

public class CheckForEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("Enter integers please ");
        System.out.println("Enter 'e' as end of numbers");

        while(input.hasNextInt()){
            list.add(input.nextInt());
    
        }
        input.close();
        if(hasEvenNumber(list))
            System.out.println("Entered numbers has an even number");  
        else
            System.out.println("Entered numbers has no even numbers");  
            }
        
            private static boolean hasEvenNumber(ArrayList<Integer> list) {
                for(Integer i : list){
                    if(i%2 == 0){
                        return true;
                    }
                }
                return false;
            }
}
