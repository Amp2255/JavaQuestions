package strings_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Find the first non-repeating character in a string
*/
public class NonRepeatingChar {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = scanner.nextLine();
        str.toLowerCase();
     

        if(!str.isEmpty()){
            int i=0;
            int j=0;
            int repNum = 0;
            while(i<str.length()){
                while(j<str.length()){
                    if(i!=j && str.charAt(i)==str.charAt(j))
                        repNum++;
                    j++;
                }
                if(repNum==0){
                    System.out.println("The first non repeating char in '"+str+"' is at position i="+i+". The char is '"+str.charAt(i)+"'");
                    return;
                }
                repNum=0;
                i++;
                j=0;
                }
                  
                
            }
        }
    }
