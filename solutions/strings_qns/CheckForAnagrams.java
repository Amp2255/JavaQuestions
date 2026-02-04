package strings_qns;

import java.util.Scanner;

// Check whether two strings are anagrams (without using collections)
public class CheckForAnagrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first word");
        String word1 = in.next();
        System.out.println("enter the second word");
        String word2 = in.next();

        checkIfAnagram(word1,word2);

    }
public static void checkIfAnagram(String word1, String word2) {

    if (word1.length() != word2.length()) {
        System.out.println("Not an anagram");
        return;
    }

    char[] arr = word2.toCharArray();
    boolean[] used = new boolean[arr.length];

    for (int i = 0; i < word1.length(); i++) {
        char c = word1.charAt(i);
        boolean found = false;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == c && !used[j]) {
                used[j] = true;   // consume character
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not an anagram");
            return;
        }
    }

    System.out.println("They are anagrams");
}

    }
