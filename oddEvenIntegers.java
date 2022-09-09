/*
Input - X,Y,Z
If X greater than Y then print odd integers from X to Y else print even integers from Y to X.
If Y greater than Z then print odd integers from Y to Z else print even integers from Z to Y.

I/P:
20 25 10 
O/P:
21 23 25 10 12 14 16 18 20 22 24
 
*/

import java.util.*;
public class Hello {

    static void printOddElements(int n,int m)
    {
        for(int i=n;i<=m;i++)
        {
            if(i%2==1)
            {
                System.out.print(i+" ");
            }
        }
    }
    
    static void printEvenElements(int n,int m)
    {
        for(int i=n;i<=m;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
        }
    }
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int a,b;
		if(x<y)
		    printOddElements(x,y);
		else
		    printEvenElements(y,x);
		    
		if(y<z)
		    printOddElements(y,z);
		else
		    printEvenElements(z,y);
		
	}
}
