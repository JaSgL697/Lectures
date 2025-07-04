/*
* Task 2
* Write a class to store some ID and a string with information.
* */
public class Main {
    public static void main(String[] args) {
    IdContainer person1 = new IdContainer(1, "Dima, 25 years, gamer.");
    IdContainer person2 = new IdContainer(2, "Roberto, 27 years, driver.");
    person2.printInfo();
    person1.printInfo();
    }
}