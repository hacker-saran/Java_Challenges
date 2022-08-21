
/*
 * Nearest Multiple of 10 
 * 
 * Sample Input : 551
 * Sample Output : 550 
 * 
 *  Sample Input : 99999 
 *  Sample Output : 100000 
 * 
*/


import java.util.Scanner;
public class NearestMultipleOf10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int unit_digit = n%10;
		if(unit_digit>5)unit_digit-=10; 
		System.out.print(n-unit_digit);

	}
}
