/*input1="the sun raises in the east";   
 output1=raises;   
 count no vowels in each word and print the word which has max    
no of vowels if two word has max no of vowel print the first one 
*/
import java.util.*;
public class Str29{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String word = "";
        String wordMostVowel = "";
        int temp = 0;
        int vowelCount = 0;
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch != ' ' && i != (s.length() - 1)) {
                word += ch;  
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++; 
                }
            } else { 
                if (vowelCount > temp) {
                    temp = vowelCount;
                    wordMostVowel = word;
                }
                word = "";
                vowelCount = 0;
            }    
        }
        System.out.println( wordMostVowel);
    }
}