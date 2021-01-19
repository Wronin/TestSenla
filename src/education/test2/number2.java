package education.test2;

import java.util.Scanner;

public class number2 {
    public static void main(String[] args){

        int firstNum, secondNum;

        System.out.println("Write 1st number");
        Scanner scn = new Scanner(System.in);

        if (scn.hasNextInt())
            firstNum = scn.nextInt();
        else {
            System.out.println("You entered not an integer!");
            return;
        }

        System.out.println("Write 2nd number");

        if (scn.hasNextInt())
            secondNum = scn.nextInt();
        else {
            System.out.println("You entered not an integer!");
            return;
        }

        System.out.println("NOD: " + NOD(firstNum, secondNum));
        System.out.println("NOK: " + NOK(firstNum, secondNum));
    }

    public static long NOD(long a, long b){
        return b == 0 ? a : NOD(b,a % b);
    }

    public static long NOK(long a,long b){
        return a / NOD(a,b) * b;
    }
}
