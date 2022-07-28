package demojava;

import java.util.Scanner;

public class firstLetterOfWord {
	public static String firstLetter(String s1) {
		String answer="";
		answer=answer+s1.charAt(0);
		for(int i=1 ; i < s1.length()-1 ; i++) {
			if(s1.charAt(i) == ' ') {
				answer = answer+s1.charAt(i+1);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str;
			Scanner s=new Scanner(System.in);
			System.out.println("enter string to find first letter of each word:");
			str=s.nextLine();
	        str = str.toLowerCase();
	       String output = firstLetter(str);
	        System.out.println("answer is:"+output);

	}

}
