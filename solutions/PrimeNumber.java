import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = input.nextInt();
        input.close();
        if(isPrime(a))
                    System.out.println(a +" is prime");
                else
                    System.out.println(a +" is not prime");
        
            }
        
            private static boolean isPrime(int a) {
                int i=2;
                if(a==0 || a==1){
                    return false;
                }
                if(a==2){
                    return true;
                }
                while(i<=a/2){
                    if(a%i == 0){
                        return false;
                    }
                    i++;
                }
                return true;
            }
}
