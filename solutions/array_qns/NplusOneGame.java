import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int n = game.length;
        if(leap+1 >=n) return true;
        int i = 0;
        while ( i < n;) {
            if(i+leap >=n) return true
            if(i+leap<n){
                if(game[i+leap]==0){
                 i=i+leap;
                }
            }
            
        
            else if(i+1<n){
                if(game[i+1]==0){
                i=i+1;
            }
            }
            else if(i-1>0){
                if(game[i-1]==0){
                    if(i-1+leap >n) return true;
                    else return false;
                }
            }
            else return false;
            i++;
        }
        // for (int i = 0; i < n; i++) {
        //     if(game[i+1]==0){
        //         i=1+leap;
        //     }
        //     else return false;
        // }

        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}