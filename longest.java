package hello;
import java.util.Scanner;
public class longeat {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String input_string = scanner.nextLine();
	        String [] words = input_string.split(" ");
	        String longest_word = "";
	        int longest_word_len = 0;
	        for(int i= 0; i < words.length;i++){
	            String word = words[i];
	            int len = word.length();
	            if(len > longest_word_len ){
	                longest_word = word;
	                longest_word_len = len;
	            }
	        }
	        System.out.println(longest_word);
	    }
	}


