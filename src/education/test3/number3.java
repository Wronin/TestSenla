package education.test3;

import java.util.*;

public class number3 {
    public static void main(String[] args){

        System.out.println("write a offer");
        Scanner scn = new Scanner(System.in);
        String someText = scn.nextLine();
        System.out.println("The number of words in the text: " + getCountWords(someText));

        List<String> words = Arrays.asList(someText.split(" "));
        Collections.sort(words);
        System.out.println("Sorted array " + words);

        for (String word : words) {
            word = word.substring(0, 1).toUpperCase() + word.substring(1);;
            System.out.print(word + " ");
        }
    }

    public static int getCountWords(String Text) {
        String[] words = Text.split(" ");
        return words.length;
    }
}
