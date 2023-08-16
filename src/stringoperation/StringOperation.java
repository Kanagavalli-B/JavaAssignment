package stringoperation;

import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string ");
        String word1 = sc.nextLine();
        System.out.println("enter the second string ");
        String word2 = sc.nextLine();
        System.out.println("the first string written in uppercase " + word1.toUpperCase());
        System.out.println("the second string written in lowercase " + word2.toLowerCase());
        System.out.println("the third position letter in first string " + word1.charAt(3));
        System.out.println("both strings are compared "+word1.compareTo(word2));
        System.out.println("both strings are joined together " +word1.concat(word2));

    }
}
