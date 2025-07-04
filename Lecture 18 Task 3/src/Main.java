/*
* Task 3
* Write a class for the lesson, there should be a lesson number and a flag - completed or not.
* */
public class Main {
    public static void main(String[] args) {
    Lessons lessons1 = new Lessons(5,true);
    Lessons lessons2 = new Lessons(2,false);
    Lessons lessons3 = new Lessons(6, true);


    lessons1.showLessonsStatus();
    lessons2.showLessonsStatus();
    lessons3.showLessonsStatus();
    }
}