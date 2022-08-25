/*
Matrix Side View 
if given Character is l or L print 1 st alphabet from left to right else from right to left

I/P:
4 6
e - y - r k 
- x i - - - 
- - - a t q 
- m - - p a 
L 

O/P:
exam

*/
import java.util.*;
public class Hello {


    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r,c;
		r=sc.nextInt();
		c=sc.nextInt();
		System.out.println(r+" "+c);
		sc.nextLine();
		String[][] a = new String[r][c];
		for(int i=0;i<r;i++) 
		{
		    a[i]=sc.nextLine().split(" ");
		}
        char ch = sc.next().charAt(0);
		if(Character.toLowerCase(ch)=='l')
		{
		    for(int i=0;i<r;i++)
		    {
		        for(int j=0;j<c;j++)
		        {
		            if(Character.isLetter(a[i][j].charAt(0)))
		            {
		                System.out.print(a[i][j]);
		                break;
		            }
		        }
		    }
		}
		else if(Character.toLowerCase(ch)=='r')
		{
		    for(int i=0;i<r;i++)
		    {
		        for(int j=c-1;j>=0;j--)
		        {
		            if(Character.isLetter(a[i][j].charAt(0)))
		            {
		                System.out.print(a[i][j]);
		                break;
		            }
		        }
		    }
		}
		
	}
}
