/*
Multiple of Each Digit of N
Ip : 235 
Op : 236 237 240

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int M = sc.nextInt();
        
        int N = M;
        
        while(N>0)
        {
            int k = M;
            
            int d = N%10;
            if(d==0) d=10;
            
            while(++k%d!=0);
            list.add(0,k);
            
            N/=10;
        }
        
        for(int i : list)
        {
            System.out.print(i+" ");
        }       
    }
}
