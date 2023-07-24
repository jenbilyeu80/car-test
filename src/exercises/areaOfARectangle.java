package exercises;
import java.util.Scanner;
public class areaOfARectangle {
    public static void main(String[] args) {
        areaOfARectangle  areaOfARectangle= new areaOfARectangle();
        areaOfARectangle.calculateAreaOfRectangle();

    }
    public void calculateAreaOfRectangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        Double myRectanglength = scanner.nextDouble();

        System.out.println("What is the width of the rectangle?");
        Double myRectangleWidth = scanner.nextDouble();
        Double area = myRectanglength * myRectangleWidth;
        System.out.println("Your area is: " + area.toString());


    }
}
