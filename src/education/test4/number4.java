package education.test4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class number4 {
    public static void main(String[] args){
        int count = 0;

        System.out.println("enter text");
        Scanner scn = new Scanner(System.in);
        String someText = scn.nextLine();
        System.out.println("enter the word you want to count in the text");
        String word = scn.nextLine();

        List<String> words = Arrays.asList(someText.split(" "));
        for (String tmp : words) {
            if (word.toLowerCase().equals(tmp.toLowerCase()))
                count++;
        }
        System.out.println("the number of words \"" + word + "\" in the text: " + count);

    }
}
