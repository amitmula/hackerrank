package hackerRank.amitmula.algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int diag1Sum = 0;
        int diag2Sum = 0;
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                a[i][j] = in.nextInt();
                if(i==j) diag1Sum += a[i][j];
                if(i+j == n-1) diag2Sum += a[i][j];
            }
        }
        System.out.println(Math.abs(diag1Sum - diag2Sum));
    }
}
