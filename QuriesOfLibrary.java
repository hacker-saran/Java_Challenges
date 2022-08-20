/*
 * To print the user ID have the same most number of books in hand(descending order)
 * Sample Input : 
 *  7
 *  +45
 *  +23
 *  -23
 *  +56
 *  +45
 *  -45
 *  -45
 *  
 *  Sample Output :
 *  56
 *   
 */


import java.util.*;
public class QuriesOfLibrary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
		   arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==-arr[j]){
					arr[i]=0;
		            arr[j]=0;
		            break;
		         }
		    }
		}
		Map<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0)
			{
				if(hm.containsKey(arr[i]))
				{
					hm.put(arr[i],hm.get(arr[i])+1);
				}
		        else
		        {
		        	hm.put(arr[i],1);
		        }
			}
		 }
		 int m = Collections.max(hm.values());
		 ArrayList<Integer> keyElements = new ArrayList<Integer>();
		 for(Map.Entry<Integer,Integer> entry : hm.entrySet())
		 {
			 if(entry.getValue()==m)
		     keyElements.add(entry.getKey());
		 }
		 Collections.sort(keyElements,Collections.reverseOrder());
		 for(int i:keyElements) System.out.print(i+" ");
	}
}
