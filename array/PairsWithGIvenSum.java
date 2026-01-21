package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
//Find all pairs in an array whose sum equals a given number
public class PairsWithGIvenSum {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array.");
        int l= in.nextInt();
        int arr[]= new int[l];
   
        for(int i=0;i<l;i++){
            System.out.println("Enter the "+i+" element of array");
            arr[i]= in.nextInt();
        }
        System.out.println("Enter the sum value :");
        int sum= in.nextInt();
        System.out.println("Sum is:"+sum);
        Pair pair ;
        List<Pair> resuList = new ArrayList<>();
        
        for(int i=0;i<l;i++){
            int j=i+1;
                while(j<l){
                    if(arr[i]+arr[j]==sum){
                    System.out.println("numbers are:"+arr[i] +" "+ arr[j]);    
                    pair= new Pair(arr[i],arr[j]);
                    System.out.println("Pair added is:"+ pair.first+","+pair.second);
                    resuList.add(pair);
                }
                j++;
            }
            
            }
        System.out.println("The pairs with sum '"+sum+"' are :");    
            for (Pair pair2 : resuList) {
                System.out.println(pair2.first +","+pair2.second);
            }
        }

    }

   

 class Pair{
       int first;
       int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
       
    }