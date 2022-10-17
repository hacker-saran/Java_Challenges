/*

Ip:
hackersaran 
5
Op:
hacknarasre

*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int N = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(str.substring(N-1,str.length()));
		
		sb.reverse();
		
		System.out.println(str.substring(0,N-1)+sb);

	}
}
