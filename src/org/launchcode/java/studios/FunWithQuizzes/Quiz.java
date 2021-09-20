package org.launchcode.java.studios.FunWithQuizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<>();
    private int totalPoints;

    public Quiz(){}

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void addQuestion(Question q){
    this.questions.add(q);
    //this.totalPoints +=q.getPointForCorrectAnswer();
}

    public void runQuiz(){
        Scanner input = new Scanner(System.in);
        for(Question q : questions){
            q.askQuestion();
           //input.next().toLowerCase();
            if(input.next().equals(q.getCorrectAnswer())){
                totalPoints += q.getPointForCorrectAnswer();
                System.out.println("Correct Answers: " + totalPoints + "\nTotal Points: " + totalPoints);
            }
        }
    }
}
