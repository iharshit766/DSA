package Arrays;

public class sum {

	public static void main(String[] args) {
		int arr[]= {22,34,12,44,21,42};
		int count=0;
		
		for(int i=0;i<=(arr.length-1);i++) {
			count=arr[i]+count;
			}
		System.out.println(count);
		
				

	}

}
