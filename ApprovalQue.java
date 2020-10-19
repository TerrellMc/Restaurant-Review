package com.company;

import java.util.ArrayList;

public class ApprovalQue {

    ArrayList<UnverifiedReview> reviews = new ArrayList<>();

    public void addUnverifiedReview(UnverifiedReview review) {
        this.reviews.add(review);
    }

    public void removeReview(int uniqueId) {
        for (UnverifiedReview review : reviews) {
            if (review.uniqueId == uniqueId) {
                this.reviews.remove(review);
                return;
            }
        }
    }

    public void printReview() {
        for (UnverifiedReview unverifiedReview : reviews) {
            printReview(unverifiedReview);
        }
    }

    public void printReview(String email) {
        for (UnverifiedReview unverifiedReview : reviews) {
            if (email.equalsIgnoreCase(unverifiedReview.getEmail())) {
                printReview(unverifiedReview);
            }
        }
    }

    private void printReview(UnverifiedReview unverifiedReview) {
        System.out.println("Review: " + unverifiedReview.uniqueId);
        System.out.println("\tName: " + unverifiedReview.review.getRestaurant());
        System.out.println("\tMeal: " + unverifiedReview.review.getMealConsumed());
        System.out.println("\tText: " + unverifiedReview.review.getReviewText());

            System.out.println("\tPrice Paid: " + unverifiedReview.review.getPrice());

        System.out.println("\tSubmitted By: " + unverifiedReview.getEmail());
    }
}
