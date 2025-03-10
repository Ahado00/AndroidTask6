package com.example.menuapp
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight


@Composable
fun CategoryItem(
    modifier: Modifier = Modifier,
    category: FoodCategory,
    ){

    Column(
      modifier = modifier
          .background(
              color = Color(0xffe8c56b),
              shape = RoundedCornerShape(12.dp)
          )
          .padding(12.dp)
          .width(100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = category.imageUrl),
            contentDescription = "${category.name} Icon",
            modifier = Modifier
                .size(40.dp)
                .padding(bottom = 8.dp)
        )
        Text(
            text = category.name,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }
}


@Composable
fun MenuItem(
    modifier: Modifier = Modifier,
    itemData : MenuItem,
) {
    Column(
        modifier = modifier
            .background(
                color = Color.LightGray,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(vertical = 20.dp, horizontal = 10.dp)
            .fillMaxWidth(fraction = 0.8f),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Image(
            painter = painterResource(id = itemData.imageUrl),
            contentDescription = itemData.name,
            modifier = Modifier.size(100.dp)
        )

        Text(
            text = itemData.name,
            fontSize = 16.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = itemData.description,
            fontSize = 14.sp,
            color = Color.Black
        )
        Text(
            text = " Price: ${itemData.price} ",
            fontSize = 14.sp,
            color = Color.Black,
            fontWeight = FontWeight.SemiBold
        )

        if (itemData.isPopular){
            Text(
                text = "Popular!",
                fontSize = 14.sp,
                color = Color(0xffc78438),
                fontWeight = FontWeight.Bold
            )
        }



    }

}