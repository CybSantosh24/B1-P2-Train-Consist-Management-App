package com.trainconsistapp;

import java.util.ArrayList;
import java.util.List;

/**
 * ================================================================
 * Train Consist Management App
 * Use Case 1: Initialize Train and Display Consist Summary
 * ================================================================
 *
 * Description:
 * This class represents the entry point of the Train Consist
 * Management Application. It initializes an empty train consist
 * and displays its current state.
 *
 * @author Developer
 * @version 1.0
 */
public class UseCase1TrainConsistApp {

    /**
     * Application entry point
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Display welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist using ArrayList
        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully...");

        // Display initial bogie count
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Display current consist
        System.out.println("Current Train Consist: " + trainConsist);

        System.out.println("System ready for operations...");
    }
}