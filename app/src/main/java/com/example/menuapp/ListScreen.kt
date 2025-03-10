package com.example.menuapp
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListScreen(
    modifier: Modifier,
    categories : List<FoodCategory>,
    items: List<MenuItem>
){

    Column (modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Restaurant Menu",
            fontWeight = FontWeight.SemiBold,
            color = Color.Black,
            fontSize = 28.sp,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.padding(vertical = 4.dp))

        //Horizontal Category List
        LazyRow (
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ){
            items(categories) { category ->
                CategoryItem(category = category)
            }


        }

        Spacer(modifier = Modifier.padding(vertical = 16.dp))


        //Vertical Menu Items List
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            items(items) { item ->
                MenuItem(itemData = item)
            }
            item {
                CircularProgressIndicator()
            }
        }

        }
    }
