package org.launchcode.java.studios.FunWithQuizzes;


import java.util.HashMap;
import java.util.Map;

public class MultipleChoice extends Question {

    private HashMap<Character, String> choices;

    public MultipleChoice(String question, HashMap<Character, String> choices, String correctAnswer, int pointForCorrectAnswer, String typeOfQuestion) {
        super(question, correctAnswer, pointForCorrectAnswer, typeOfQuestion);
        this.choices = choices;
    }
    //abstract method from Question
    @Override
    public void askQuestion() {
        System.out.println("Choose the correct answer \n" + this.getQuestion());
        for(Map.Entry<Character, String> entry:this.choices.entrySet()){
            System.out.println(entry.getKey() +". "+ entry.getValue());
            this.getCorrectAnswer();
        }

    }
}
