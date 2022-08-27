/*
Consonants Roatated String 
rotate the Consonants of the string by n times 

I/P:
helloworld 5 
O/P:
ledhololwr

*/
import java.util.*;
public class Hello {
    public static boolean isConso(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
            return false;
        return true;
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		char[] strArr = str.toCharArray();
		char[] consonants = new char[str.length()];
		int  size= 0;
		for(int i=0;i<str.length();i++)
		{
		    if(isConso(strArr[i]))
		    {
		        consonants[size++]=strArr[i];
		    }
		}
	int x = n%size;
	for(int i=0;i<str.length();i++)
	{
	    if(isConso(strArr[i]))
	    {
	        System.out.print(consonants[x++]);
	        if(x==size)x=0;
	    }
	    else
	    {
	        System.out.print(strArr[i]);
	    }
	}
	}
}
