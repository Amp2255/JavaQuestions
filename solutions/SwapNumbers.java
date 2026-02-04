

//swap two numbers without temp 

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number a ");
        int a = input.nextInt();
        System.out.println("Enter second number b ");
        int b = input.nextInt();
        System.out.println("a is :"+ a + " and b is :" +b);

        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("After swapping, a is :"+ a + " and b is :" +b);
    }
    
    
    
}
