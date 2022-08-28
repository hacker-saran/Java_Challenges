/*Consecutive 1's Count column wise 
I/P:
3 3 
0 0 1 
1 0 1 
1 0 1 

O/P:
2*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] a = new int[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        a[i][j] = sc.nextInt();
		    }
		}
		int count = 0;
		for(int j=0;j<c;j++)
		{
		    for(int i=0;i<r;i++)
		    {
		        if(i!=0 && a[i-1][j]==1 && a[i][j]==1 && (i==r-1 || a[i+1][j]!=1 ))
		            count++;
		    }
		    
		}
		System.out.print(count);
	}
}
