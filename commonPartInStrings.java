


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		for(int i=1;i<s2.length();i++)
		{
		    if(!s1.contains(s2.substring(0,i+1)))
		    {
		        System.out.print(s2.substring(0,i));
		        System.exit(0);
		    }
		}
        System.out.print(s2);
	}
}
