package hackerRank.amitmula.algorithms.warmup;

import java.util.Scanner;

public class Staircase {
    public static void main(String args[] ) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        System.out.print("Enter height of staircase : ");
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        /*for(int i =0;i<height; i++) {
            int spaces = height-1-i;
            while(spaces > 0) {
                System.out.print(" ");
                spaces--;
            }
            int stairs = i;
            while(stairs >= 0) {
                System.out.print("#");
                stairs--;
            }
            System.out.println();
        }*/

        for(int i=0; i<height; i++) {
            int k = 0;
            for(int j=0; j<height; j++) {
                if(j < height-1-i)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            if(i<height-1) System.out.println();
        }
    }
}