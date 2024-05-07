package com.example.wazitoecommerce.ui.theme.screens.sofa

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.MainActivity
import com.example.wazitoecommerce.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Sofa(navController: NavHostController){
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {
        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(
            title = { Text(text = "", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(
                        Intent(
                            mContext,
                            MainActivity::class.java
                        )
                    )
                }) {
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
                        imageVector = Icons.Default.Lock,
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
        Spacer(modifier = Modifier.height(15.dp))
        Row {
            Text(
                text = " 76 Products",
                fontSize = 15.sp,
            )

            Text(
                text = " Popular ",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 170.dp),
            )
            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = "ArrowDown",
                modifier = Modifier.padding(top = 5.dp)
            )
        }
        Column {
            Row(
                modifier = Modifier.padding(start = 10.dp)
            ) {
                //Column1
                Card(modifier = Modifier.padding(start = 5.dp)) {
                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(150.dp)
                                .padding(15.dp)

                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.soss),
                                    contentDescription = "chair1",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Amos Chair",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Premium",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.82000",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Serif,
                                color = Color.Black

                            )
                            Icon(
                                imageVector = Icons.Default.Call,
                                contentDescription = "lock",
                                tint = Color.Black,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                            Icon(
                                imageVector = Icons.Default.ShoppingCart,
                                contentDescription = "lock",
                                tint = Color.Black,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }


                    }
                }
                Spacer(modifier = Modifier.width(25.dp))
                Card {
                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(150.dp)
                                .padding(15.dp)

                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.boss),
                                    contentDescription = "chair2",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "GreenShick Sofa",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Unlocked",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.27000",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Serif,
                                color = Color.Black

                            )
                            Icon(
                                imageVector = Icons.Default.Call,
                                contentDescription = "lock",
                                tint = Color.Black,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                            Icon(
                                imageVector = Icons.Default.ShoppingCart,
                                contentDescription = "Cart",
                                tint = Color.Black,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }


                    }
                }


            }    }
        Spacer(modifier = Modifier.height(10.dp))
        Column {
            Row(
                modifier = Modifier.padding(start = 10.dp)
            ) {
                //Column1
                Card(modifier = Modifier.padding(start = 5.dp)) {
                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(150.dp)
                                .padding(15.dp)

                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.house),
                                    contentDescription = "chair1",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Amos Chair",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "For Decor",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.75000",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Serif,
                                color = Color.Black

                            )
                            Icon(
                                imageVector = Icons.Default.Call,
                                contentDescription = "lock",
                                tint = Color.Black,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                            Icon(
                                imageVector = Icons.Default.ShoppingCart,
                                contentDescription = "lock",
                                tint = Color.Black,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }


                    }
                }
                Spacer(modifier = Modifier.width(25.dp))
                Card {
                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(150.dp)
                                .padding(15.dp)

                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.com),
                                    contentDescription = "chair2",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "GreenShick Sofa",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Unlocked",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.40000",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Serif,
                                color = Color.Black

                            )
                            Icon(
                                imageVector = Icons.Default.Call,
                                contentDescription = "lock",
                                tint = Color.Black,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                            Icon(
                                imageVector = Icons.Default.ShoppingCart,
                                contentDescription = "Cart",
                                tint = Color.Black,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }


                    }
                }}        }
        Spacer(modifier = Modifier.height(10.dp))
        Column {
            Row(
                modifier = Modifier.padding(start = 10.dp)
            ) {
                //Column1
                Card(modifier = Modifier.padding(start = 5.dp)) {
                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(150.dp)
                                .padding(15.dp)

                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.nice),
                                    contentDescription = "chair1",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Amos Chair",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Premium",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.52000",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Serif,
                                color = Color.Black

                            )
                            Icon(
                                imageVector = Icons.Default.Call,
                                contentDescription = "lock",
                                tint = Color.Black,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                            Icon(
                                imageVector = Icons.Default.ShoppingCart,
                                contentDescription = "lock",
                                tint = Color.Black,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }


                    }
                }
                Spacer(modifier = Modifier.width(25.dp))
                Card {
                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(150.dp)
                                .padding(15.dp)

                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.grey),
                                    contentDescription = "chair2",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "GreenShick Sofa",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Unlocked",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.29000",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Serif,
                                color = Color.Black

                            )
                            Icon(
                                imageVector = Icons.Default.Call,
                                contentDescription = "lock",
                                tint = Color.Black,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                            Icon(
                                imageVector = Icons.Default.ShoppingCart,
                                contentDescription = "Cart",
                                tint = Color.Black,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }


                    }
                }}  }
    }
}



@Preview(showBackground = true)
@Composable
fun SofaPreview(){
    Sofa(rememberNavController())
}