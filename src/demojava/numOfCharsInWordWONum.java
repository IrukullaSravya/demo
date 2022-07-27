package demojava;

import java.util.Scanner;

public class numOfCharsInWordWONum {
	public static void countoflettersinword(String str) {
		String output=" ";
		int counter=0;
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i) >= 97 && str.charAt(i) <= 122)) {
				output = output+str.charAt(i);
				counter++;
			}
			else if(str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				output = output+str.charAt(i);
			}
			else if(str.charAt(i) == ' ') {
				output=output+counter;
				counter=0;
			}
		}
		System.out.println("count of letters are:"+output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter sentence to count letters in each word");
		str1=s.nextLine();
		countoflettersinword(str1);
	}

}
