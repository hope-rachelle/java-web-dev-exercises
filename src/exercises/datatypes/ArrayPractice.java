package exercises.datatypes;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        ArrayPractice arrayValue = new ArrayPractice();
        arrayValue.printOddNumbers();

        ArrayPractice arraySplit = new ArrayPractice();
        arraySplit.splitToWords();

        ArrayPractice sentenceSplit = new ArrayPractice();
        sentenceSplit.splitToSentences();
    }
    public void printOddNumbers() {
        int[] numbers = { 1, 1, 2, 3, 5, 8};
        for(int i=0; i< numbers.length; i++){
            //System.out.println(numbers[i]);
            if(numbers[i]%2 != 0){
                System.out.println(numbers[i]);
            }
        }
    }
    public String[] splitToWords() {
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        return words;
    }

    public void splitToSentences(){
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentences = sentence.split(" \\. ");
        System.out.println(Arrays.toString(sentences));
    }
}
