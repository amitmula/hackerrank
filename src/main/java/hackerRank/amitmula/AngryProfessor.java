package hackerRank.amitmula;

import java.util.Scanner;

/**
 * Angry Professor Problem
 * https://www.hackerrank.com/challenges/angry-professor

 * Created by mula03 on 10/18/15.
 */
public class AngryProfessor {

    public static void main(String...args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        for(int i =0; i < T; i++) {
            String NK = scanner.nextLine();
            int N = Integer.valueOf(NK.split(" ")[0]);
            int K = Integer.valueOf(NK.split(" ")[1]);
            String[] Na = scanner.nextLine().split(" ");
            int count = 0;
            for(String a : Na) {
                if(Integer.valueOf(a) <= 0) count+=1;
            }
            if(count < K)
                System.out.println("YES"); else System.out.println("NO");
        }
    }
}
