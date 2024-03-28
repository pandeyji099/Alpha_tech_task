package simple_java;

import java.util.Arrays;
import java.util.Scanner;

public class Q11 {
	public static int[] duplicateshow(int a[])
	{
		 int uniqueCount = 0;
	        for (int i = 0; i < a.length - 1; i++) {
	            if (a[i] != a[i + 1]) {
	                uniqueCount++;
	            }
	        }
	        uniqueCount++; 
	        
	      int[] outputArray = new int[uniqueCount];
	        outputArray[0] = a[0];
	        int index = 1;
	        
	        for (int i = 1; i < a.length; i++) {
	            if (a[i] != a[i - 1]) {
	                outputArray[index++] = a[i];
	            }
	        }
	        return outputArray;
	}
	
	public static void main(String[] args) {
		Q11 aa = new Q11();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array = ");
		int n = sc.nextInt();
		int[] arr = new int[n]; 
		System.out.println("Enter the element of the array = ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
			
		    System.out.print("Input : ");
	        System.out.println(Arrays.toString(arr));
	        System.out.print("Output: "); 
			System.out.println(Arrays.toString(aa.duplicateshow(arr)));
		
		
	}
}
