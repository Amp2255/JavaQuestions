package leetcode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MergeSortedArray{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENter the number of elements in first array, m");
        int m = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("ENter the number of elements in second array, n");
        int n = scanner1.nextInt();
        System.out.println("ENter the first array 'nums1' elements :");
        int nums1[] = new int[m+n];
        int i=0;

        while(scanner.hasNext() && i<m){
            nums1[i]= scanner.nextInt();
            i++;
        } 
        i=0;
      
    
      
        int nums2[] = new int[n];
        System.out.println("ENter the array 'nums2' elements :");
        
       
        while(scanner1.hasNext() && i<n){
            nums2[i]= scanner1.nextInt();
            i++;
        } 
        // i=0;
        // for(int num : nums2){
        //     nums1[m+i]= num;
        //     i++;
        // }
        i =0;
        int newArr [] = new int[m+n];
        System.out.println("nums1 array :" + Arrays.toString(nums1));
        System.out.println("nums2 array :" + Arrays.toString(nums2));
        int p=0; 
        int q=0; 
            while(p<m && q<n ){
            if(nums2[i]<nums1[i]){
                newArr[i]= nums2[i];
                i++;
                p++;
                q++;
            }
            else{
                newArr[i]= nums1[i];
                i++;
                p++;
                q++;
                
            }
        }
        System.out.println("p :" + p + " and q :"+q  + " and i : "+i);
        if(p>=m-1){
            while(i<n){
                newArr[i]= nums2[i];
                i++;
            }
        }
        if(q>=n-1){
            System.out.println("69 i : "+i);
            while(i<m){
                System.out.println(" line 71 i : "+i);
                newArr[i]= nums1[i];
                i++;
            }
        }
        // int n2 = nums1.length;
        //    for (int p = 0; p < n2 - 1;p++) {
        //        for (int j = 0; j < n2 - p - 1; j++) {
        //            if (nums1[j] > nums1[j + 1]) {
        //                // Swap nums1[j] and nums1[j+1]
        //                int temp = nums1[j];
        //                nums1[j] = nums1[j + 1];
        //                nums1[j + 1] = temp;
        //            }
        //        }
        //    }
        // Arrays.sort(nums1);
         System.out.println("Final nums1 array :" + Arrays.toString(newArr));

    }
}