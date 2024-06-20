package com.example.myjetpackcompose

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myjetpackcompose.ui.theme.MyJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyJetpackComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        BikinContohTeks()
                    }

                }
            }
        }
    }
}

@Composable
fun BikinContohTeks() {
    // Contoh memanggil text yg udah di set di folder values
    Text(
        text = stringResource(id = R.string.welcoming_text),
        modifier = Modifier.padding(top = 40.dp),
        color = Color.Red,
        fontSize = 29.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Monospace,
        letterSpacing = 10.sp,
        textDecoration = TextDecoration.Underline,
        textAlign = TextAlign.Center
    )
    // Contoh memanggil text yang langsung di set di editor
    Text(
        text = "Welcome to Jetpack Compose",
        modifier = Modifier.padding(top = 40.dp),
        color = Color.Blue,
        fontSize = 25.sp,
        fontWeight = FontWeight.Medium
    )
    Text(
        text = "Ini adalah teks ke tiga",
        modifier = Modifier.padding(top = 40.dp),
        color = Color.Green,
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold
    )
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyJetpackComposeTheme {
        Greeting("Android")
    }
}