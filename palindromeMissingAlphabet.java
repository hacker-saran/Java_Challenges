/*
Palindrome Missing Alphabet
String S which is a palindrome is passed as the input. But just one alphabet A is missing in S. The program must print the missing alphabet A.
Note: The FIRST alphabet of S will always be present.
Input Format:
The first line contains S.
Output Format:
The first line contains the missing alphabet A.
Boundary Conditions:
The length of the input string S is between 3 to 100.
The FIRST alphabet of S will always be present.
Example Input/Output 1:
Input:
malayaam
Output:
l
Example Input/Output 2:
Input:
abcddcb
Output:
a
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char[] s = a.toCharArray();
		int j=s.length-1;
		int i=0;
		while(i<=j)
		{
		    if(s[i]!=s[j])
		    {
		        if(s[i+1]==s[j])
		        {
	            	System.out.print(s[i]);
	            }
	            else if(s[i]==s[j-1])
	            {
	                System.out.print(s[j]);
	            }
	            break;
		    }
		    i++;
		    j--;
		}
	}
}
