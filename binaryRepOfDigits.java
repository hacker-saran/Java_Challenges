
/*
Binary Representation of Digits

Input:
4653
Output:
0100
0110
0101
0011
  

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		ArrayList<String> arr = new ArrayList<String>();
		while(N>0)
		{
		    String bin = Long.toBinaryString(N%10);
		    if(bin.length()<4)
		    {
		        bin = "0".repeat(4-bin.length())+bin;
		    }
		    arr.add(bin);
		    N/=10;
		}
		for(int i=arr.size()-1;i>=0;i--)
		{
		    System.out.println(arr.get(i));
		}
	}
}
