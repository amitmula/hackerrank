package hackerRank.amitmula.algorithms.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        DecimalFormat df = new DecimalFormat("0.000000");
        int pos = 0;
        int neg = 0;
        int zero = 0;
        //int arr[] = new int[n];
        for(int i=0; i < n; i++){
            int a = in.nextInt();
            if(a > 0) pos++;
            else if(a < 0) neg++;
            else zero++;
        }
        System.out.println(df.format((double)pos/n));
        System.out.println(df.format((double)neg/n));
        System.out.println(df.format((double)zero/n));
    }
}
