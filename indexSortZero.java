import java.util.Scanner;

public class indexSortZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c;
        r = sc.nextInt();
        c = sc.nextInt();
        int[][] arr = new int[r][c];
        int[] zcArr = new int[r];
        int[] index = new int[r];
        for(int i=0;i<r;i++)
        {
            int zeroCount=0;
            for(int j=0;j<c;j++)
            {
                arr[i][j] = sc.nextInt();
                if(arr[i][j]==0)zeroCount++;
            }
            zcArr[i]=zeroCount;
            index[i]=i;
        }
        for(int i=0;i<r;i++)
        {
            for(int j=i+1;j<r;j++)
            {
                if(zcArr[i]>zcArr[j])
                {
                    int t=zcArr[i];
                    zcArr[i]=zcArr[j];
                    zcArr[j]=t;
                    int x = index[i];
                    index[i]=index[j];
                    index[j]=x;
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            System.out.println(index[i]+"-"+zcArr[i]);
        }
    }
    
}
