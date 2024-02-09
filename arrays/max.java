package Arrays;

public class max {
	public static void main(String args[]) {
		
		int arr[]= {2,6,3,7,2,6,3,5,9,67,8,6,7};
		
		int max=arr[0];
		
		for(int i=0; i<=(arr.length-1);i++) {
			if(max<arr[i]) {
				max=arr[i];
				}
			}
		System.out.println(max);
		
	
	
	}
}
