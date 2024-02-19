package Arrays;

import java.util.Scanner;

public class array2dzigzagorwave {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int m=sc.nextInt();
		System.out.println("Enter the number of columns");
		int n=sc.nextInt();
		
		
		int arr[][]= new int[m][n];
		
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
				
			}
		}
		
		
		for(int i=0;i<m;i++) {
			if(i%2==0) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			}
			else {
				for(int j=n-1;j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}
				
			}
		System.out.println();
		}
		
			
			
		
		
		
	sc.close();
	}
	
	
}
