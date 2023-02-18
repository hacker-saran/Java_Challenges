/*
The runs scored by N batsmen of a cricket team is passed as the input to the program. The program must print the name of the batsman who scored the highest runs. (You can assume that no two batsmen will be the top scorers).
Input Format:
The first line denotes the value of N.
Next N lines will contain the name of the batsman and the runs score (both separated by a comma)
Output Format:
The first line contains the name of the batsman with the top score.
Boundary Conditions:
2 <= N <= 11
The length of the names will be from 3 to 100.
The value of the runs will be from 0 to 500.
Example Input/Output 1:
Input:
5
BatsmanA,45
BatsmanB,52
BatsmanC,12
BatsmanD,9
BatsmanE,78
Output:
BatsmanE
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String name="";
		int max=0;
		for(int i=0;i<n;i++)
		{
		    String s=sc.nextLine();
		    String[] arr=s.split(",");
		    int k = Integer.parseInt(arr[1]);
		    if(max<k)
		    {
		        max=k;
		        name=arr[0];
		    }
		}
		System.out.println(name);
	}
}
