package com.example.wazitoecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.ui.theme.screens.control.Control
import com.example.wazitoecommerce.ui.theme.screens.home.HomeScreen
import com.example.wazitoecommerce.ui.theme.screens.login.LoginScreen
import com.example.wazitoecommerce.ui.theme.screens.products.AddProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.signup.SignupScreen
import com.example.wazitoecommerce.ui.theme.screens.splash.Splash
import com.example.wazitoecommerce.ui.theme.screens.view.ViewProductsScreen
import com.google.common.collect.Tables

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = SPLASH_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
        composable(ADD_PRODUCTS_URL){
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL){
            ViewProductsScreen(navController = navController)
        }
        composable(SPLASH_URL){
            Splash(navController = navController)
        }
        composable(CHAIRS_URL){
            Chairs(navController = navController)
        }
        composable(TABLES_URL){
           Tables(navController = navController)
        }
        composable(SOFA_URL){
            Sofa(navController = navController)
        }
        composable(CONTROL_URL){
            Control(navController = navController)
        }
        composable(ELECTRONICS_URL){
            Control(navController = navController)
        }
        composable(UTENSILS_URL){
            Control(navController = navController)
        }
        composable(BEDS_URL){
            Control(navController = navController)
        }
        composable(CARS_URL){
            Control(navController = navController)
        }
    }
}

@Composable
fun Sofa(navController: NavHostController) {

}

@Composable
fun Chairs(navController: NavHostController) {

}
@Composable
fun Tables(navController: NavHostController) {
}








