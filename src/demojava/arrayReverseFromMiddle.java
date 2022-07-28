package demojava;

public class arrayReverseFromMiddle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=1;
		int arr[] = new int[6];
		for(int i = 0;i < 6;i++) {
			arr[i]=start+i;
		}
		
		arrayreversemiddle(arr);

	}
	public static void arrayreversemiddle(int array1[]) {
		int op[]=new int[array1.length];
		for (int i=0;i<array1.length/2;i++) {
			int temp=array1[i];
			array1[i]=array1[array1.length/2+i];
			array1[array1.length/2+i]=temp;
			
		}
		for(int j=0;j<array1.length;j++) {
			System.out.print(array1[j]);
		}
		
	}
	
}
