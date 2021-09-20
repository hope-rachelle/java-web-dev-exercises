package org.launchcode.java.studios.FunWithQuizzes;

public abstract class Question {
    private String question;
    private String correctAnswer;
    private int pointForCorrectAnswer;
    public String typeOfQuestion;

    public Question(String question,  String correctAnswer, int pointForCorrectAnswer, String typeOfQuestion) {
        this.question = question;

        this.correctAnswer = correctAnswer;
        this.pointForCorrectAnswer = pointForCorrectAnswer;
        this.typeOfQuestion = typeOfQuestion;
    }
    //getters

    public String getQuestion() {
        return question;
    }

    public int getPointForCorrectAnswer() {
        return pointForCorrectAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getTypeOfQuestion() {
        return typeOfQuestion;
    }
    //method to be Overridden with each type of Question
    public abstract void askQuestion();
}
