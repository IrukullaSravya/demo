package demojava;
import java.util.*;
public class reverseOfStringWONum {
	public static void reverseofstring(String s1) {
		String output="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i) >= 48 && s1.charAt(i) <= 57) {
				output=output+s1.charAt(i);
			}
			else if((s1.charAt(i) >= 97 && s1.charAt(i) <= 122)) {
				output=s1.charAt(i)+output;
			}
			else if((s1.charAt(i) >= 65 && s1.charAt(i) >= 90)) {
				output=s1.charAt(i)+output;
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
		reverseofstring(str1);
		
	}

}
