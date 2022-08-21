
/*
 * Rotate given no of elements for given amount of rotations
 * Sample Input :
 * 10
 * 71 65 74 88 63 100 45 35 67 11
 * 4 1
 * Sample Output:
 * 65 74 88 71 100 45 35 63 11 67 
 * 
*/

import java.util.Scanner;
import java.util.ArrayList;

public class antiClockRotation {
	
	public static void rotate(ArrayList<Integer> list)
	{
		int first = list.get(0);
		for(int i=0;i<list.size()-1;i++)
		{
			list.set(i, list.get(i+1));
		}
		list.set(list.size()-1, first);
		
		for(int j:list)
			System.out.print(j+" ");
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		antiClockRotation obj = new antiClockRotation();
		int size = sc.nextInt();
		int[] arr = new int[1000];
		int noOfEle,rotations;
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
			
		noOfEle = sc.nextInt();
		rotations = sc.nextInt();
		
		
		for(int i=0;i<size;i+=noOfEle)
		{
			ArrayList<Integer> list = new ArrayList<>();
			for(int j=i;j<i+noOfEle;j++)
			{
				if(j>=size)break;
				list.add(arr[j]);
			}
			rotate(list);
		}
	}
}
