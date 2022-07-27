package demojava;

import java.util.Scanner;

public class reverseOfCharsWOnNum {
	public static void reverseOfChars(String str) {
		String output="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				output=output+str.charAt(i);
			}
			else if((str.charAt(i) >= 97 && str.charAt(i) <= 122)) {
				output=str.charAt(i)+output;
			}
			
		}
		System.out.println("Reverse of a string "+output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter sentence to print reverse");
		str1=s.nextLine();
		reverseOfChars(str1);
	}
}
