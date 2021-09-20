package org.launchcode.java.studios.FunWithQuizzes;

public class TrueFalse extends Question{

    public TrueFalse(String question, String correctAnswer, int pointForCorrectAnswer, String typeOfQuestion) {
        super(question, correctAnswer, pointForCorrectAnswer, typeOfQuestion);
    }

    @Override
    public void askQuestion(){
        System.out.println("Enter True or False \n" + this.getQuestion());
    }

}
