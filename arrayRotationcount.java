
/*
 * Print rotation count to form the original sorted array 
 * in Anti-Clockwise direction from rotated sorted array
 * 
 * Sample Input : 
 * 6
 * 50 60 10 20 30 40
 * Sample Output :
 * 2
*/
import java.util.Scanner;

public class arrayRotationcount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(); 
		int[] a = new int[n]; 
		for(int i=0;i<n;i++)a[i] = sc.nextInt() ; 
		int min=a[0],ind=0;
		for(int i=1;i<n;i++)
		{
			if(a[i]<min) 
			{
				min=a[i];
				ind=i;
			}
		}
		System.out.print(ind);
	}
}


