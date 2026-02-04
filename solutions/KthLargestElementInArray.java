import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KthLargestElementInArray {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter integers please ");
        System.out.println("Enter 'e' as end of numbers");

        while(input.hasNextInt()){
            list.add(input.nextInt());
    
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        System.out.println(list.toString());
        System.out.print("Enter the Position to find ");
        Scanner input2 = new Scanner(System.in);
       
        int pos = input2.nextInt();
        System.out.println(pos-1);
        System.out.println(list.get(pos-1));
    }
}
