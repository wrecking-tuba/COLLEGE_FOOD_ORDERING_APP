package com.example.college_food_ordering_application.cheffFoodPanel;

public class FoodDetails {

    public String Dish,Quantity,Price,Description,ImageURL,RandomUID,Chefid;
    // Alt+insert

    public FoodDetails(String dishes, String quantity, String price, String description, String imageURL, String randomUID, String chefid) {
        Dish = dishes;
        Quantity = quantity;
        Price = price;
        Description = description;
        ImageURL = imageURL;
        RandomUID = randomUID;
        Chefid = chefid;
    }
}
