package Arrays;

import java.util.Scanner;

public class array2dcolumnwise {
	
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
		
		
		for(int j=0;j<n;j++) {
			for(int i=0;i<m;i++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			}
		
		
		
	sc.close();	
	}

}
