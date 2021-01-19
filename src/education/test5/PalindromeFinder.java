package education.test5;

import java.util.LinkedList;
import java.util.List;

public class PalindromeFinder {
    public static List<Integer> getPalindromeUntil(int n) throws Exception {

        if (n > 100 || n < 0)
            throw new Exception("N can't be greater than 100 or less than 0");

        List<Integer> palindromes = new LinkedList<>();
        int digitsCount, number = 0, i = 0, j; //i - счетчик выводимых палиндромов, j - номер символа в слове
        String tnum;

        while (i < n) {
            digitsCount = 0;
            j = 0;
            number++;
            tnum = String.valueOf(number);
            while (j < tnum.length() && tnum.charAt(j) == tnum.charAt(tnum.length() - j - 1)) { //приближаемся к центру строки, если символы по обе стороны равны, увеличиваем количество равных разрядов
                digitsCount++;
                j++;
            }
            if (digitsCount == tnum.length()) {  //если количество равных разрядов равно количеству разрядов числа, то число - палиндром
                i++;
                palindromes.add(number);
            }
        }

        return palindromes;
    }
}