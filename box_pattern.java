import java.util.Scanner;

public class box_pattern {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int x = sc.nextInt();
		 int y=(x*n)+(x-1),c;
		 for(int i=0;i<n;i++)
		 {
		    c=0;
		    for(int j=0;j<y;j++)
		    {
		      c+=1;
		      if(c==n+1)
		      {
		        System.out.print(" ");
		        c=0;
		        continue;
		      }
		      if((c>0) && (i==0 || i==n-1)) System.out.print("-");
		      else if((c==(n/2)+1 && i!=0 && i!=n-1) || (i==n/2)) System.out.print("*");
		      else if((c==1 || c==n) && i!=0 && i!=n-1) System.out.print("|");
		      else System.out.print(" ");
		    }
		    System.out.println();
		 }
	}
}
/*
Sample Input :
7
2
Sample Output :
------- -------
|  *  | |  *  |
|  *  | |  *  |
******* *******
|  *  | |  *  |
|  *  | |  *  |
------- -------
*/

