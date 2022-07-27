package demojava;
import java.util.*;
public class countOfWords {
	public static void getCountOfWords(String str) {
		String newstring=str;
		int count=0;
		for(int i=0;i<newstring.length();i++) {
			if(newstring.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("count of words is:"+(count+1));
		System.out.println("Number of words by using split inbuilt method:"+newstring.split(" ").length);
		System.out.println("Number of characters in string is:"+(newstring.length()-count));
	}
	public static void main(String args[]) {
		String s1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter string to find count of words:");
		s1=s.nextLine();
		getCountOfWords(s1);
	}
}
