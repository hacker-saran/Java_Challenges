/* 
Ip:
5
1 3 2 1 2

Op:
2

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		int N = sc.nextInt();
		int count = 0;
		
		int[] arr = new int[N];
		
		for(int i=0;i<N;i++)
		{
		    arr[i] = sc.nextInt();
		    if(map.containsKey(arr[i]))
		    {
		        map.put(arr[i],map.get(arr[i])+1);
		        count++;
		    }
		    else
		    {
		        map.put(arr[i],1);
		    }
		}
		
		System.out.print(count);		

	}
}
