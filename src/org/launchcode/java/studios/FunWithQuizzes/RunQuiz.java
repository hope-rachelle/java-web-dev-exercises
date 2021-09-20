package org.launchcode.java.studios.FunWithQuizzes;


import java.util.HashMap;
import java.util.Scanner;

public class RunQuiz {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        HashMap<Character, String> q1Choices = new HashMap<>();
        q1Choices.put('a', "Hamburger");
        q1Choices.put('b', "Sausage");
        q1Choices.put('c', "Pepperoni");
        q1Choices.put('d', "Mushrooms");
        MultipleChoice q1 = new MultipleChoice("What is the most popular pizza topping?", q1Choices, "c", 1, "Multiple Choice");

        TrueFalse q2 = new TrueFalse("Java is a fun language to learn", "True", 1, "True/False");


        quiz.addQuestion(q1);
        quiz.addQuestion(q2);
        quiz.runQuiz();


        }
    }