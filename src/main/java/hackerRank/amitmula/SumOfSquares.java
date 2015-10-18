package hackerRank.amitmula;

import java.io.InputStreamReader;
import java.lang.Math;import java.lang.String;import java.lang.System;import java.util.Scanner;

/**
 * Created by amitmula on 8/18/15.
 *
 * Minimum number of squares whose sum equals to given number n
 * ------------------------------------------------------------
 * A number can always be represented as a sum of squares of other numbers.
 * Note that 1 is a square and we can always break a number as (1*1 + 1*1 + 1*1 + …).
 * Given a number n, find the minimum number of squares that sum to X.
 *
 */

public class SumOfSquares {

    private int minSquares(int n) {
        int res =n;
        if(n < 3) return n;
        for(int i=1; i<n; i++) {
            if(i*i > n)
                break;
            else
                res = Math.min(res, 1+ minSquares(n-i*i));
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.print("Enter value for n :");
        int n = scanner.nextInt();
        SumOfSquares prob = new SumOfSquares();
        System.out.println(prob.minSquares(n));
    }
}
