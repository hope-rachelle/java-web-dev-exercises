package exercises.datatypes;
import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String sentence;
        Scanner input;
        sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book " +
                "her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        input = new Scanner(System.in);
        System.out.println("Enter a word found in Alice in Wonderland:");
        String term = input.nextLine();
         if (sentence.toLowerCase(Locale.ROOT).contains(term.toLowerCase(Locale.ROOT))) {
             System.out.println("Alice in Wonderland contains the word " + term);
             System.out.println("index of " + term + ":" + sentence.indexOf(term));
             String newSentence =  sentence.substring (0, sentence.indexOf(term))+ "\n" + sentence.substring((sentence.indexOf(term) + term.length()+1));
             System.out.println(newSentence);
         } else {
             System.out.println(term + " is not found in Alice in Wonderland");
         }


    }
}
