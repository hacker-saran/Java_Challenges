/*
Given an integer array nums and an array queries where queries[i] = [vali, indexi].
For each query i, first, apply nums[indexi] = nums[indexi] + vali, then print the sum of the even values of nums.
Return an integer array answer where answer[i] is the answer to the ith query.

Input: nums = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
Output: [8,6,2,4]

*/

class Solution {
    
    public int sumOfEvens(int[] arr)
    {
        int s=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                s+=arr[i];
            }
        }
        return s;
    }
    
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
        int[] ans = new int[nums.length];
        for(int i=0;i<queries.length;i++)
        {
            int ind = queries[i][1];
            int val = queries[i][0];
            nums[ind] = nums[ind]+val;
            
            ans[i]=sumOfEvens(nums);
        }
        return ans;
        
    }
}
