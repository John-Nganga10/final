package com.example.wazitoecommerce.ui.theme.screens.control

import android.content.Intent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.MainActivity
import com.example.wazitoecommerce.navigation.BEDS_URL
import com.example.wazitoecommerce.navigation.CARS_URL
import com.example.wazitoecommerce.navigation.ELECTRONICS_URL
import com.example.wazitoecommerce.navigation.HOME_URL
import com.example.wazitoecommerce.navigation.LOGIN_URL
import com.example.wazitoecommerce.navigation.SOFA_URL
import com.example.wazitoecommerce.navigation.TABLES_URL




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Control(navController: NavHostController){
    Column (modifier = Modifier.fillMaxSize()){
        //TopAppBar
        TopAppBar(
            title = { Text(text = "", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {
                    navController.navigate(HOME_URL)
                }

                    ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrowback",
                        tint = Color.Black
                    )

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "share",
                        tint = Color.Black
                    )

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "settings",
                        tint = Color.Black
                    )

                }
            },
            )
        //End of TopAppBar
        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .padding(start = 5.dp)
        ) {
            Text(
                text = "Chairs",
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(
                text = "Tables",
                modifier = Modifier
                    .clickable {
                        navController.navigate(TABLES_URL)
                    },
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Gray,
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(
                text = "Sofa",
                modifier = Modifier
                    .clickable {
                        navController.navigate(SOFA_URL)
                    },
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Gray,
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(
                text = "Beds",
                modifier = Modifier
                    .clickable {
                        navController.navigate(BEDS_URL)
                    },
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Gray,
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(
                text = "Electronics",
                modifier = Modifier
                    .clickable {
                        navController.navigate(ELECTRONICS_URL)
                    },
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Gray,
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(
                text = "Vehicles",
                modifier = Modifier
                    .clickable {
                        navController.navigate(CARS_URL)
                    },
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Gray,
            )
            Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                Text(text = "Featured",
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    )
                
            }




        }
    }
}

@Preview(showBackground = true)
@Composable
fun ControlPreview() {
    Control(rememberNavController())
}