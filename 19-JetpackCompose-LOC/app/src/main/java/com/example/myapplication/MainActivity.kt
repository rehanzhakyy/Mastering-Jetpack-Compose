package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Greeting("Raihan")
            Button(onClick = { println("Click")}, content = {
                Text(text = "Button")
            })
//            Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "launcher background", tint = Color.Green)
//            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "launcher image")
//            TextField(value = "", onValueChange = {})
//            Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "floating action button")
//            ExtendedFloatingActionButton(
//                text = {
//                    Text(text = "Add")
//                },
//                icon = {
//                    Icon(
//                        painter = painterResource(id = R.drawable.ic_launcher_foreground),
//                        contentDescription = "Description Image"
//                    )
//                },
//                modifier = Modifier.padding(100.dp),
//                containerColor = Color.White,
//                contentColor = Color.Green,
//                onClick = { println("Click") }
//            )
        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name", color = Color.Red, fontSize = 24.sp, fontWeight = FontWeight.Bold)
}
