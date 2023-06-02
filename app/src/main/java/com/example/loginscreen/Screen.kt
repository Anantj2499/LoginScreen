package com.example.loginscreen

sealed class Screen(val route: String){
    object LogIn: Screen(route = "login")
    object SignUp: Screen(route = "signup")
}
