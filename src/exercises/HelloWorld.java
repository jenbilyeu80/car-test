package exercises;

import java.util.Scanner;
public class HelloWorld {
    public static void main(String[]args) {
        HelloWorld hello = new HelloWorld();
        hello.askUserForName();
    }
    public void askUserForName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name:");
        String name = input.nextLine();
        System.out.println("Hello " + name);
        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.println("What is your favorite color");

        String color= input.nextLine();
        System.out.println("How many sisters do you have?");
        int sisters= input.nextInt();
        System.out.println("What is your favorite hobby?");
        String hobby=input.nextLine();

        System.out.println("It was nice to meet you," + name);
    }
}
