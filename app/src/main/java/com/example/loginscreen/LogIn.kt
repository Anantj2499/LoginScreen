package com.example.loginscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun LogIn(navController: NavController){
    val passwordFocusRequester = FocusRequester()
    val focusManager : FocusManager = LocalFocusManager.current
    Surface(color = Color.Black) {
        Column(
            Modifier
                .navigationBarsPadding()
                .padding(24.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp, alignment = Alignment.Bottom),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.vecteezy_aj_logo_monogram_design_template_16154241),
                contentDescription = null,
                Modifier.size(80.dp)
            )
            TextInput(InputType.Email, keyboardActions = KeyboardActions(onNext = {
                passwordFocusRequester.requestFocus()
            }))
            TextInput(InputType.Password, keyboardActions = KeyboardActions(onDone = {
                focusManager.clearFocus()
            }), focusRequester = passwordFocusRequester)
            Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                Text(text = "SIGN IN", Modifier.padding(vertical = 8.dp))
            }
            Divider(
                color = Color.White.copy(alpha = 0.3f),
                thickness = 1.dp,
                modifier = Modifier.padding(top = 48.dp)
            )
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "Don't have an Account?", color = Color.White)
                TextButton(onClick = {navController.navigate(route = Screen.SignUp.route)}) {
                    Text("Sign Up!")
                }
            }
        }
    }
}