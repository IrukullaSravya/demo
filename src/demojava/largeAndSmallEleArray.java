package demojava;

public class largeAndSmallEleArray {
	public static void largeandsmallelement(int a[]) {
		int large=0,small=0;

		for(int i=0;i<a.length;i++) {
					if(a[i] > large) {
				small=large;
				large=a[i];
			}
		}
		System.out.println("large and small elements in an array are "+"large: " +large+ " small: " +small);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 13, 1, 10, 34, 10};
		largeandsmallelement(arr);
	}

}
