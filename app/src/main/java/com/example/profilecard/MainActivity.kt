package com.example.profilecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.profilecard.ui.theme.ProfileCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileCardTheme {
                  ProfileCard()

            }
        }
    }
}
@Composable
fun ProfileCard (){
    //Round brackets () -used to define remember
    var greeting by remember { mutableStateOf("Hello") }

    //Curly brackets {} - layout block
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), //Round brackets for padding value
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        // Curly brackets for Composable content
        Text(
            text = "$greeting, John Doe!",
        )
        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {

                // Curly brackets for onClick logic
                greeting = if (greeting == "Hello") "Welcome back" else "Hello"
            }

        ){
            Text("Toggle Greeting")
        }
    }
}
