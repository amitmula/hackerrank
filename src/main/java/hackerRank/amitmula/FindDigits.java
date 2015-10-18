package hackerRank.amitmula;

import java.lang.String;import java.lang.System;import java.util.Scanner;

/**
 * You are given an integer N. Find the digits in this
 * number that exactly divide N (division that leaves 0 as remainder)
 * and display their count.
 * https://www.hackerrank.com/challenges/find-digits
 */
public class FindDigits {
    public static void main(String...args) {
        Scanner scanner = new Scanner(System.in);
        int tn = scanner.nextInt();
        while(tn > 0 && tn <= 15) {
            int N = scanner.nextInt();
            int i = N;
            int count = 0;
            while(i != 0) {
                if(i%10 != 0){
                    if(N % (i%10) == 0)
                        count++;
                }
                i/=10;
            }
            System.out.println(count);
            tn--;
        }
    }
}
