package Arrays;

public class greaterthanitself {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,4,9,4,6,9};
		
		maxcount(arr);

	}

	public static void maxcount(int arr[]) {
		int max=arr[0];
		
		for(int i=0;i<=arr.length-1;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			
			
		}
		
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==max) {
				
				count++;
				
			}
		
		}
		System.out.println(count);

	
		
	}
	
	
}
