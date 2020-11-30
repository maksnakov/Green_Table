package study;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");

        int n = in.nextInt();
        int k = in.nextInt();

        int[][] table = new int[n][n];
        int i, j;

        for (i = 0; i < table.length; i++) {
            for (j = 0; j < table.length; j++) {
                table[i][j]=(i + 1) * (j + 1);
                System.out.print(" " + (i + 1) * (j + 1) + " ");
            }
            System.out.println("\n");
        }
        int count = 0;
        for (int [] mus: table) {
            for (int x: mus) {
                if (x == k) count += 1;
            }
        }
        System.out.println(count);

    }

}



//  for ( k = 0; k < table.length; k++)
//                count += k;
//            System.out.println(count);