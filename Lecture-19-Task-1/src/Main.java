/*
Write a Rectangle class that receives 4 sides and there should also be a check to see if it is a quadrilateral
 */

public class Main {
    public static void main(String[] args) {
    Rectangle rectangle1 = new Rectangle(3,3,3,3);
        System.out.println(rectangle1.areValidArguments());
        System.out.println(rectangle1.isItSquare());

    Rectangle rectangle2 = new Rectangle(2,5,7,9);
        System.out.println(rectangle2.areValidArguments());
        System.out.println(rectangle2.isItSquare());

        Rectangle rectangle3 = new Rectangle(5,7,5,7);
        System.out.println(rectangle3.areValidArguments());
        System.out.println(rectangle3.isItSquare());

    }
}