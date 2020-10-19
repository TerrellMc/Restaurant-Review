package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Advanced {
    int uniqueId = 0;
    ApprovalQue approvalQue = new ApprovalQue();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String response = "";
        System.out.println("Restaurant Review");
        System.out.println("What would you like to do?");
        System.out.println("\tadd - To add a review");
        System.out.println("\tprint - To print reviews");
        System.out.println("\tremove - To remove a review");
        System.out.println("\tdone - To exit the system\n");

        while (!response.equalsIgnoreCase("done")) {


            System.out.print("\tEnter choice: ");
            response = scanner.nextLine();

            if (response.equalsIgnoreCase("add")) {
                addReview();
            } else if (response.equalsIgnoreCase("remove")) {
                System.out.print("Enter review number to remove: ");
                uniqueId = Integer.parseInt(scanner.nextLine());
                approvalQue.removeReview(uniqueId);
            } else if (response.equalsIgnoreCase("print")) {
                System.out.print("Enter email or 'all' to print all: ");
                String userResponse = scanner.nextLine();
                if (userResponse.equalsIgnoreCase("all")) {
                    approvalQue.printReview();
                } else {
                    approvalQue.printReview(userResponse);
                }
            }
        }
    }

    public void  addReview() {
            Review review = null;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Restaurant Name: ");
            String restaurantName = scanner.nextLine();
            System.out.print("Meal Consumed: ");
            String mealConsumed = scanner.nextLine();
            System.out.print("Review Text: ");
            String textReview = scanner.nextLine();
            System.out.print("Do you want to add a price? (yes|no): ");
            String priceOptional = scanner.nextLine();
            if (priceOptional.equalsIgnoreCase("yes")) {
                System.out.print("Enter Price: ");
                Float priceEntered = Float.parseFloat(scanner.nextLine());

                review = new Review(restaurantName, mealConsumed, textReview, priceEntered);

            } else if (priceOptional.equalsIgnoreCase("no")) {
                float priceEntered = 0.0f;
                review = new Review(restaurantName, mealConsumed, textReview, priceEntered);

            }
            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            UnverifiedReview unverifiedReview = new UnverifiedReview(email, review, uniqueId++);
            approvalQue.addUnverifiedReview(unverifiedReview);
        }

    }

