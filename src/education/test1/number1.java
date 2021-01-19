package education.test1;

import java.util.Scanner;

public class number1 {
    public static void main(String[] args){

        System.out.println("Write number");
        Scanner scn = new Scanner(System.in);

        if (scn.hasNextInt()){
            if (scn.nextInt() % 2 == 0){
                System.out.println("Even number!");
            } else System.out.println("Even not a number!");
        } else System.out.println("You entered not an integer!");
    }

}
