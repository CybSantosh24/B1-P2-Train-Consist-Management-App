package com.trainconsistapp;

import java.util.LinkedList;
import java.util.List;

/**
 * ================================================================
 * Train Consist Management App
 * Use Case 4: Maintain Ordered Bogie Consist
 * ================================================================
 *
 * Description:
 * This class models the physical chaining of train bogies
 * using LinkedList for ordered operations.
 *
 * At this stage, the application:
 * - Adds bogies
 * - Inserts bogies at specific positions
 * - Removes bogies from front and rear
 * - Displays ordered train structure
 *
 * @author Developer
 * @version 4.0
 */
public class UseCase4OrderedBogieConsist {

    public static void main(String[] args) {

        System.out.println("UC4 Maintain Ordered Bogie Consist");

        // Create LinkedList (maintains order)
        List<String> trainConsist = new LinkedList<>();

        // Add bogies (Initial structure)
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist);

        // Remove first and last bogie
        trainConsist.remove(0); // remove Engine
        trainConsist.remove(trainConsist.size() - 1); // remove Guard

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed...");
    }
}