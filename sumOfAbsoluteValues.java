/*
The program must accept N integers as the input. The program must print the sum of absolute values of all the integers as the output.
Boundary Condition(s):
1 <= N <= 100
-10^5 <= Each integer value <= 10^5
Input Format:
The first line contains N.
The second line contains N integers separated by space.
Output Format:
The first line contains the sum of absolute values of all the integers.
Example Input/Output 1:
Input:
4
12 -54 89 -45
Output:
200
Explanation:
The sum of absolute values is 12 + 54 + 89 + 45 = 200
Example Input/Output 2:
Input:
5
57 5 -214 68 -77
Output:
421
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s=0;
		for(int i=0;i<n;i++)
		{
		    s+=Math.abs(sc.nextInt());
		}
		System.out.print(s);

	}
}
