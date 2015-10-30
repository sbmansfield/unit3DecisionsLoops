// Write a program that reads a word and prints all substrings, sorted by length. For
// example, if the user provides the input "rum", the program prints
// r
// u
// m
// ru
// um
// rum

import java.util.Scanner;

public class Substring
{
    public static void printSubstring()
    {
        String word; 
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: "); 
        word = scan.next(); 
        
        int s = 1;
        for (int i = 0; 
                i < word.length(); 
                i++)
        {
            System.out.println(word.substring(i, s));
            s++;
        }
        
        
    }
}

