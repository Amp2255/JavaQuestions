/*A Fibonacci sequence is one in which each number is the sum of the two previous numbers. 
The following example code shows how to use a for loop to print a 
Fibonacci sequence:*/
import java.util.Scanner;

public class PrintFibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the count :");

        int count = input.nextInt();

       
        if (count >= 1)
         printSeries(count);
                
            }
        
            private static void printSeries(int count) {
                int i=0;
                int a = 0;
                int b = 1;
                int sum =0;
                for( i=0;i<count;i++){
                    System.out.print(sum + ",");
                    sum = a+b ;  
                    a=b;
                    b=sum;       
                     
                }
            
                
            }
}
