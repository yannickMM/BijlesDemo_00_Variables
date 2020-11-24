package be.multimedi.softwaretesters.variables;

import java.time.LocalDate;

/**
 * @author Yannick Van Ham
 * created on Tuesday, 24/11/2020
 */
public class MainApp {
    public static void main(String[] args) {

        // 00.01. Variables
        display("I have a red car that goes 200 km/h");

        String colour = "blue";
        String vehicle = "motorbike";
        int topSpeed = 160;

        display("I have a " + colour + " " + vehicle + " that goes " + topSpeed + " km/h");

        // Declaring variables
        String firstName;

        // Initialising variables
        firstName = "Jack";
        String surname = "Sparrow";

        // Assigning values to variables
        firstName = "Elizabeth";
        surname = "Swann";
    }

    private static void display(Object object) {
        System.out.println((Object) object);
    }
}
