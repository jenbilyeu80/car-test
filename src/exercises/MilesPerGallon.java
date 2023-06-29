package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        MilesPerGallon milesPerGallon= new MilesPerGallon();
        milesPerGallon.numberOfMilesDriven();

    }
    public void numberOfMilesDriven(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Double numberOfMilesDriven = scanner.nextDouble();
        System.out.println("How many gallons of gas has your car consumed?");
        Double gallonsConsumed = scanner.nextDouble();
        Double milesPerGallon = numberOfMilesDriven/ gallonsConsumed;
        System.out.println(" Your miles per gallon is:" + milesPerGallon.toString());


    }

    }