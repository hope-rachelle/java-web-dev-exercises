package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 6));
        Integer sum = ArrayListPractice.sumEven(numbers);
        System.out.println(sum);

        //get words from ArrayPractice file
        ArrayPractice arrayPractice = new ArrayPractice();
        String[] returnedWords = arrayPractice.splitToWords();

        ArrayList<String> words  = new ArrayList<>(Arrays.asList(returnedWords));
        System.out.println("What word length would you like to search for: ");
        Integer searchLength = ArrayListPractice.userWordInput();
        ArrayListPractice.printWords(words, searchLength);
    }
    public static Integer sumEven(ArrayList<Integer> arr) {
        Integer sum = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                sum += integer;
            }
        }
        return sum;
    }

    public static void  printWords(ArrayList<String> words, Integer searchLength){
        for (int i = 0; i< words.size(); i++){
            if(words.get(i).length() == searchLength)
            System.out.println(words.get(i));
        }
    }
    public static Integer userWordInput(){
        Scanner input = new Scanner(System.in);
        Integer wordLength = input.nextInt();
        input.close();
        return wordLength;
    }
}