package com.example.wazitoecommerce.ui.theme.screens.utensils

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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.MainActivity
import com.example.wazitoecommerce.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Electronics(navController: NavHostController){
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
                text = " 59 Products",
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
                                    painter = painterResource(id = R.drawable.brown),
                                    contentDescription = "console",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Kitchen Cutlery",
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
                                text = "Kshs.8099",
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
                                .width(170.dp)
                                .padding(15.dp)

                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.brrbrr),
                                    contentDescription = "screen",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Thermo cup",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "What you need",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.599",
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
                                    painter = painterResource(id = R.drawable.vintage),
                                    contentDescription = "vitron",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Vintage sufuria ",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Nostolgia",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.1500",
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
                                    painter = painterResource(id = R.drawable.cofi),
                                    contentDescription = "hi",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Home style coffee mug",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "for you",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.650",
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
            }        }
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
                                    painter = painterResource(id = R.drawable.pot),
                                    contentDescription = "hi",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Hotpot",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Premium for your taste",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.999",
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
                                .width(170.dp)
                                .padding(15.dp)

                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.last),
                                    contentDescription = "hi",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )


                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Kettle",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "for your style",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.699",
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

            }
        }
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
                                .width(160.dp)
                                .padding(15.dp)

                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.uji),
                                    contentDescription = "hi",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Plastic Cups",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "What you need",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.950",
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
                                .width(170.dp)
                                .padding(15.dp)

                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.msaha),
                                    contentDescription = "hi",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )


                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Plastic plates",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "New for you",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.599",
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

            }
        }
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
                                .width(160.dp)
                                .padding(15.dp)

                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.bert),
                                    contentDescription = "hi",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Coffee mug",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Premium for your taste",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.299",
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
                                .width(170.dp)
                                .padding(15.dp)

                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.mine),
                                    contentDescription = "hi",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )


                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Melmine Plates",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "for your style",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.799",
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

            }
        }
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
                                    painter = painterResource(id = R.drawable.cater),
                                    contentDescription = "hi",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )

                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Catering pot",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Hottest for you",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.5500",
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
                                    painter = painterResource(id = R.drawable.stfu),
                                    contentDescription = "hi",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )


                            }

                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Electric Kettle",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Ultra rare",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,

                            )

                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Text(
                                text = "Kshs.1599",
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

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun ElectronicsPreview(){
    Electronics(rememberNavController())
}