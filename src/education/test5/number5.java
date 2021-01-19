package education.test5;

import java.util.Scanner;

public class number5 {
    private static final Scanner scanner = new Scanner(System.in);

    static void runInterface(){
        int N;
        System.out.println("Enter the N value. You'll get palindromes for the range [0, N]. " +
                "N can't be greater than 100");
        try {
            N = scanner.nextInt();
            System.out.println(PalindromeFinder.getPalindromeUntil(N));
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Wrong input, please, try again.");
        }

        System.out.println();
    }
    public static void main(String[] args) {
        while (true)
            runInterface();
    }
}