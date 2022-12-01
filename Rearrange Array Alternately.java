
/*

Rearrange Array Alternatly

Input:
n = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3

Time Complexity: O(N)
Auxiliary Space: O(1)

*/

class Solution{
    
 
    public static void rearrange(long arr[], int n){
        
        int maxind=n-1, minind=0;
        long max=arr[n-1]+1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                arr[i]+=(arr[maxind--]%max)*max;
            }
            else
            {
                arr[i]+=(arr[minind++]%max)*max;
            }
        }
        for(int i=0;i<n;i++)
        {
            arr[i]/=max;
        }
    }
    
}
