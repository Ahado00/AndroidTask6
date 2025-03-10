package com.example.menuapp

import androidx.annotation.DrawableRes

//MenuItem (id, name, price, description, category, imageUrl, isPopular)
data class MenuItem(
    val id: String,
    val name: String,
    val price: String,
    val description: String,
    @DrawableRes val imageUrl: Int,
    val isPopular : Boolean
){
    companion object{
        val item1 = MenuItem(
            id= "1",
            name= "Corn Soup",
            price= "40 SAR",
            description = "Sweet Corn Soup",
            imageUrl = R.drawable.cs,
            isPopular = true
        )

        val item2 = MenuItem(
            id= "2",
            name= "Caesar Salad",
            price= "25 SAR",
            description = "Romanian Lettuce Salad",
            imageUrl = R.drawable.salad,
            isPopular = false
        )

        val item3 = MenuItem(
            id= "3",
            name= "Orange Juice",
            price= "12 SAR",
            description = "Frech Orange Juice",
            imageUrl = R.drawable.oj,
            isPopular = false
        )

        val item4 = MenuItem(
            id= "4",
            name= "Sushi",
            price= "62 SAR",
            description = "Shrimp Tempura Roll",
            imageUrl = R.drawable.sushi,
            isPopular = true
        )

        val item5 = MenuItem(
            id= "5",
            name= "Blueberry Cheesecake",
            price= "24 SAR",
            description = "blueberry cheesecake with a blueberry sauce topping",
            imageUrl = R.drawable.bb,
            isPopular = true
        )
    }
}


