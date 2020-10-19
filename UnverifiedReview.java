package com.company;

public class UnverifiedReview {
    public Review review;
    private String email;
    int uniqueId;


    public UnverifiedReview(String email, Review review, int uniqueId){
        this.review = review;
        this.email = email;
        this.uniqueId = uniqueId;
    }

    public String getEmail(){
        return email;
    }

    public Review getReview(){
        return review;
    }

    public int getUniqueId(){
        return uniqueId;
    }





}
