/*
Minimum Distance Between Words [AMAZON]
A string S is passed as the input. Two words W1 and W2 which are present in the string S are also passed as the input. The program must find the minimum distance D between W1 and W2 in S (in forward or reverse order) and print D as the output.
Input Format:
The first line will contain S.
The second line will contain W1.
The third line will contain W2.
Output Format:
The first line will contain D - the minimum distance between W1 and W2 in S.
Boundary Conditions:
Length of S is from 5 to 200.
Example Input/Output 1:
Input:
the brown quick frog quick the
the
quick
Output:
1
Explanation:
quick and the are adjacent as the last two words. Hence distance between them is 1.
Example Input/Output 2:
Input:
the quick the brown quick brown the frog
quick
frog
Output:
3
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String[] s = sc.nextLine().split(" ");
		String s1 = sc.next().strip();
		String s2 = sc.next().strip();
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<s.length;i++) {
		    if(s[i].equals(s1)) {
		        for(int j=i+1;j<s.length;j++) {
		            if(s[j].equals(s2)) {
		                if(j-i<min) {
		                    min = j-i;
		                }
		            }
		        }
		    }
		    else if(s[i].equals(s2)) {
		        for(int j=i+1;j<s.length;j++) {
		            if(s[j].equals(s1)) {
		                if(j-i<min) {
		                    min=j-i;
		                }
		            }
		        }
		    }
		}
        System.out.print(min);
	}
}
