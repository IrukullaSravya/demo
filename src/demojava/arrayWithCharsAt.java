package demojava;

public class arrayWithCharsAt {
	public static void arrayinsertchar(int array1[]) {
		String out="";
		for(int i=0;i<array1.length;i++) {
			if(array1[i]%3 == 0 && array1[i]%5 == 0) {
				out = out + "TF";
			}
			else if(array1[i]%3 == 0) {
				out = out + "T";
			}
			else if(array1[i]%5 == 0) {
				out = out + "F";
			}
			else {
				out = out + array1[i];
			}
		}
		System.out.println("String with chars at multiples of 3 and 5 are :"+out);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=1;
		int arr[] = new int[30];
		for(int i = 0;i < 30;i++) {
			arr[i]=start+i;
		}
		//int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		arrayinsertchar(arr);

	}

}
