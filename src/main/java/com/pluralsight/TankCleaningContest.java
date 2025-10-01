package com.pluralsight;

import java.util.Scanner;

public class TankCleaningContest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Use scanner to read the users keyboard input

        /* Scenario: Two friends are competing to see who cleaned their fish tank faster.
        The program will ask the user to type a single line of input with their names and how many minutes
        spent cleaning. Then it will figure out who cleaned faster a.k.a. the winner and print who the
        winner is. If they spend the same amount of time cleaning then it is a tie.
        Input format :
        Maggie:Paola|35:50
         */

        // Ask the user to type the input in format: name1:name2|name1Minutes:name2Minutes
        System.out.println("Please enter tank cleaning data (Format: name1:name2|name1Minutes:name2Minutes): ");
        String cleaningData = scanner.nextLine(); // store what the user typed in a variable

        // now it's time to separate the string
        // Split the cleaning data into two parts: names and minutes

        String[] parts = cleaningData.split("\\|"); // use .split("\\|"); OR .split(Pattern.quote("|"));
        // parts[0] = names
        // parts[1] = minutes

        // Split the names
        String[] names = parts[0].split(":");
        String name1 = names[0]; // Maggie
        String name2 = names[1]; // Paola

        // Split the times
        String[] minutes = parts[1].split(":");
        int name1Time = Integer.parseInt(minutes[0]); // Maggie spent 35 minutes cleaning
        int name2Time = Integer.parseInt(minutes[1]); // Paola spent 50 minutes cleaning

        // Compare the times and Print the winner
        if (name1Time > name2Time) {
            System.out.println("The Winner is " + name1);
        } else if (name2Time > name1Time) {
            System.out.println("The Winner is " + name2);
        } else {
            System.out.println("It's a Tie! " + name1 + " and " + name2 + " are both winners!");
        }
        scanner.close(); // closing the scanner to make sure code is clean and finished scanning

    }
}
