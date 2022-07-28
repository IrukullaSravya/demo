package demojava;
import java.io.*;
import java.util.Scanner;
public class Palindrome {
	 public static String isPalindrome(String str)
	    {
	        
	           String rev = "";
	 
	        String ans = "not a palindrome";
	 
	        for (int i = str.length() - 1; i >= 0; i--) {
	            rev = rev + str.charAt(i);
	        }
	 
	       	        if (str.equals(rev)) {
	            ans = "palindrome";
	        }
	        return ans;
	    }
	    public static void main(String[] args)
	    {
	        // Input string
	        //String str = "geeks";
	        String str;
			Scanner s=new Scanner(System.in);
			System.out.println("enter string to find palindrome or not:");
			str=s.nextLine();
	        str = str.toLowerCase();
	       String output = isPalindrome(str);
	        System.out.println(str + " is " +output);
	    }
	}


