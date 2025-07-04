import java.util.Scanner;

public class IdContainer {

    private final int id;
    private final String info;

    public IdContainer(int id, String info){
        this.id = id;
        this.info = info;
    }

    public void printInfo(){
        System.out.println("ID: " + id + "; Information: " + info);
    }
}
