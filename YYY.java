package Alpha_tech_task;
import java.util.Scanner;
 class YYY {
	static void rotate(int arr[], int d, int n)
	{	
			int temp[] = new int[n];
			int k = 0;
			for (int i = d; i < n; i++)
			{
				temp[k] = arr[i];
				k++;
			}
			for (int i = 0; i < d; i++)
			{
				temp[k] = arr[i];
				k++;
			}
			for (int i = 0; i < n; i++)
			{
				arr[i] = temp[i];
			}
}
static void PrintTheArray(int arr[], int n)
		{
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i]+" ");
		}
}
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array = ");
		int n = sc.nextInt();
		int[] arr = new int[n]; 
		System.out.println("Enter the element of the array = ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter how time you rotate the Array =  ");
		int d=sc.nextInt();
		rotate(arr, d, arr.length);
		PrintTheArray(arr, arr.length);
        sc.close();
	}
}

