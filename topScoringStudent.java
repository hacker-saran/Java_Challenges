/*
Names of N students and the marks scored by them in Maths, Physics and Chemistry are passed as the input. The program must print the name of the student who has scored the maximum marks in these three subjects. (Assume only one student will be the top scorer).
Input Format:
The first line denotes the value of N.
Next N lines will contain the name of the student and the marks in three subjects separated by colon.
Output Format:
The first line contains the name of the students with the highest marks.
Boundary Conditions:
2 <= N <= 50
The length of the names will be from 3 to 100.
The value of the marks will be from 0 to 100.
Example Input/Output 1:
Input:
4
Sasikumar:50:60:70
Arun:60:40:90
Manoj:50:50:60
Rekha:60:35:45
Output:
Arun
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int max = 0;
		String fname=" " ;
		for(int i=0;i<n;i++)
		{
		    String name = sc.nextLine();
		    String arr[] = name.split(":");
		    if(arr.length<3)break;
		    int x = Integer.parseInt(arr[1]);
		    int y = Integer.parseInt(arr[2]); 
		    int z = Integer.parseInt(arr[3]);
		    int sum = x+y+z;
		    if(sum>max)
		    {
		        max = sum;
		        fname = arr[0];
		    }
		}
		System.out.print(fname);
        

	}
}
