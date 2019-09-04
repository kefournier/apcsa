/**
 * This program prompts the user to enter his or her
 * first name and last name and displays a greeting message.
 * Author: Maria Litvin
 */

import java.util.Scanner;

public class Greetings3 {
    public static void main(String[] args)
    {
        //Scanner kboard = new Scanner() is constructing the new Scanner object, named kboard
        Scanner kboard = new Scanner(System.in); //System.in permits program to read input from the user

        System.out.print("Enter your first name: ");
        String firstName = kboard.nextLine(); //the value of firstName will be whatever string the user types at the next line

        System.out.print("Enter your last name: ");
        String lastName = kboard.nextLine();

        System.out.println("Hello, " + firstName + " " + lastName); //To print variable values within strings you must use concatenation
        System.out.println("Welcome to Java!");

        System.out.print("Enter your age: ");
        int age = kboard.nextInt(); //the value of age will be whatever integer the user types at the next line

        System.out.print("Enter your GPA: ");
        double gpa = kboard.nextDouble(); //the value of gpa will be whatever decimal the user types at the next line

        System.out.println(firstName + " you are " + age + " and your GPA is " + gpa + ".");

        kboard.close(); //closes the Scanner object kboard
    }

}


