package com.trainconsistapp;

 import java.util.ArrayList;
 import java.util.List;

 /**
  * ================================================================
  * Train Consist Management App
  * Use Case 2: Add Passenger Bogies to Train
  * ================================================================
  *
  * Description:
  * This class demonstrates how passenger bogies can be
  * dynamically managed using ArrayList operations.
  *
  * At this stage, the application:
  * - Adds bogies
  * - Removes bogies
  * - Checks existence
  * - Displays final consist
  *
  * @author Developer
  * @version 2.0
  */
 public class UseCase2PassengerBogies {

     public static void main(String[] args) {

         System.out.println("UC2 Add Passenger Bogies to Train");

         // Create ArrayList to store passenger bogies
         List<String> passengerBogies = new ArrayList<>();

         // CREATE (Add bogies)
         passengerBogies.add("Sleeper");
         passengerBogies.add("AC Chair");
         passengerBogies.add("First Class");

         System.out.println("\nAfter Adding Bogies:");
         System.out.println("Passenger Bogies: " + passengerBogies);

         // DELETE (Remove bogie)
         passengerBogies.remove("AC Chair");

         System.out.println("\nAfter Removing AC Chair:");
         System.out.println("Passenger Bogies: " + passengerBogies);

         // READ (Check existence)
         System.out.println("\nChecking if \"Sleeper\" exists:");
         boolean exists = passengerBogies.contains("Sleeper");
         System.out.println("Contains Sleeper? " + exists);

         // Final State
         System.out.println("\nFinal Train Passenger Consist: " + passengerBogies);

         System.out.println("UC2 operations completed successfully...");
     }
 }