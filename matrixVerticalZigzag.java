import java.util.Scanner;
public class matrixVerticalZigzag {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int x=1; 
		
		for(int i=0;i<n;i++) for(int j=0;j<n;j++) arr[i][j]=sc.nextInt();
		
		for(int j=0;j<n;j++)
		{
		    if(j%2==0)
		    {
		        for(int i=0;i<n;i++)
		        {
		            if(arr[i][j]!=x)
		            {
		                System.out.print("No");
		                System.exit(0);
		            }
		            x++;
		        }
		    }
		    else
		    {
		        for(int i=n-1;i>=0;i--)
		        {
		           if(arr[i][j]!=x)
		           {
		               System.out.print("No");
		               System.exit(0);
		           }
		           x++;
		        }
		    }
		}
		System.out.print("Yes");

	}

}
