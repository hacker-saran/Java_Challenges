/*
 FIBONACCI SERIES IN REVERSE ORDER

 Input  : 5 
 Output : 3 2 1 1 0
*/
import java.util.*;
public class javaTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0]=0;arr[1]=1;
        for(int i=2;i<n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        for(int j=n-1;j>=0;j--)
        {
            System.out.print(arr[j]+" ");
        }
        sc.close();
    }    
}


