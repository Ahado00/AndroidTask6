package com.example.menuapp

import androidx.annotation.DrawableRes

//FoodCategory (id, name, description, imageUrl)
data class FoodCategory(
    val id: String,
    val name: String,
    val description: String,
    @DrawableRes val imageUrl : Int,
) {
    companion object {
        val cat1 = FoodCategory(
            id= "1",
            name= "Main Dishes",
            description ="Main dishes section" ,
            imageUrl = R.drawable.mains
        )

        val cat2 = FoodCategory(
            id= "2",
            name= "Salads",
            description = "Salads section",
            imageUrl = R.drawable.salads
        )

        val cat3 = FoodCategory(
            id= "3",
            name= "Drinks",
            description = "Fresh drinks section",
            imageUrl = R.drawable.drinks
        )

        val cat4 = FoodCategory(
            id="4",
            name= "Sweets",
            description = "Sweets section",
            imageUrl = R.drawable.sweets
        )

    }

}