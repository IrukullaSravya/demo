package demojava;

import java.util.Scanner;

public class vowelsWithspecialsymbol {
	public static String vowelswithchars(String s1) {
		String result="";
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				result=result+'@';
			}
			else {
				result=result+s1.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str;
			Scanner s=new Scanner(System.in);
			System.out.println("enter string to replace vowels with special character:");
			str=s.nextLine();
	        str = str.toLowerCase();
	       String output = vowelswithchars(str);
	        System.out.println("answer is:"+output);
	}

}
