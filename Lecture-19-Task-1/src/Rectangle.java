
public class Rectangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;
    private final int sideD;

    public Rectangle(int sideA, int sideB, int sideC, int sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    public boolean isItSquare(){
        return this.sideA == this.sideB && this.sideA == this.sideC && this.sideA == this.sideD;
    }

    public boolean areValidArguments(){
        return (sideA == sideC) && (sideB == sideD);
    }
}
