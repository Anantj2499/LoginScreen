package com.example.loginscreen

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.LogIn.route
    ){
        composable(
            route = Screen.LogIn.route
        ){
            LogIn(navController = navController)
        }
        composable(
            route = Screen.SignUp.route
        ){
            SignUp(navController = navController)
        }

    }
}