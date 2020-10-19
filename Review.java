package com.company;

public class Review {
    private String restaurant;
    private String mealConsumed;
    private String reviewText;
    private Float price;

    public Review(String restaurant, String mealConsumed, String reviewText){
        this.restaurant = restaurant;
        this.mealConsumed = mealConsumed;
        this.reviewText = reviewText;
    }

    public Review(String restaurant, String mealConsumed, String reviewText,float price){
        this(restaurant,mealConsumed,reviewText);
        this.price = price;
    }

    public String getRestaurant(){
        return restaurant;
    }

    public String getMealConsumed(){
        return mealConsumed;
    }

    public String getReviewText(){
        return reviewText;
    }

    public Float getPrice(){
        return price;
    }

}
