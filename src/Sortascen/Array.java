package Sortascen;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array values ");

        int j;
        for(j = 0; j < 5; ++j) {
            a[j] = sc.nextInt();
        }

        Arrays.sort(a);
        System.out.println("The sorted array ");

        for(j = 0; j < 5; ++j) {
            System.out.println(a[j]);
        }

    }
}
