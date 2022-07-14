package demojava;
import java.util.*;
public class swapwiththirdvar {
	static void swapwiththirdvariable(int a,int b) {
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("values after swaping: a="+ a + ",b=" + b);
	}
	public static void main(String args[]) {
		int num1,num2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Value for num1 :");
		  num1=s.nextInt();
		  System.out.println("Enter Value for num2 :");
		  num2=s.nextInt();
		  System.out.println("values before swaping a="+num1 + ",b=" +num2);
		  swapwiththirdvariable(num1,num2);
	}
}
