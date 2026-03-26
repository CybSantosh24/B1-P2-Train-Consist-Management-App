package com.trainconsistapp;

import java.util.HashSet;
import java.util.Set;

/**
 * ================================================================
 * Train Consist Management App
 * Use Case 3: Track Unique Bogie IDs
 * ================================================================
 *
 * Description:
 * This class ensures that duplicate bogie IDs are not added
 * to the train consist using a HashSet.
 *
 * At this stage, the application:
 * - Adds bogie IDs
 * - Prevents duplicates automatically
 * - Displays unique bogies
 *
 * @author Developer
 * @version 3.0
 */
public class UseCase3UniqueBogieIDs {

    public static void main(String[] args) {

        System.out.println("UC3 Track Unique Bogie IDs");

        // Create a HashSet to store unique bogie IDs
        Set<String> bogies = new HashSet<>();

        // Add bogie IDs
        bogies.add("B101");
        bogies.add("B102");
        bogies.add("B103");
        bogies.add("B104");

        // Add duplicate entries
        bogies.add("B101"); // duplicate
        bogies.add("B102"); // duplicate

        // Display bogie IDs
        System.out.println("\nBogie IDs After Insertion:");
        System.out.println(bogies);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("UC3 uniqueness validation completed...");
    }
}