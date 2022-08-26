/*
 * Count of Concatenated and Multiples
 * To print the count of pairs in the array concatenation of 
 * two integers in the pair is a multiple of x.
 * 
 * I/p:
 * 5 11
 * 45 1 10 12 11
 * 
 * O/P:
 * 7
 * 
*/
import java.util.Scanner;

public class countOfConcatInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		sc.nextLine();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++) a[i] = sc.nextInt();
		
		int pairCount = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				String s = Integer.toString(a[i])+Integer.toString(a[j]);
				if(i!=j && Integer.parseInt(s)%x==0)
					pairCount++;
			}
		}
		System.out.print(pairCount);
	}
}
