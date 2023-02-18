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
		        k=max;
		        name=arr[0];
		    }
		}
		System.out.println(name);
	}
}
