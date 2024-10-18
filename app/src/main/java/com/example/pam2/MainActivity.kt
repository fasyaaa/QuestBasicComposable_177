package com.example.pam2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pam2.ui.theme.PAM2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PAM2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        adifa = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// Buat munculin preview
@Preview(showBackground = true)
@Composable
fun BasicCompose(adifa: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

//        2 Cara Styling text
//        Cara 1
        Text(text ="Indonesia",
            modifier = adifa,
            fontSize = 70.sp,
            color = Color.Green,
            fontWeight = FontWeight.Bold
            )

//        Cara 2
        Text(text = "Versus",
            style = TextStyle(
                fontSize = 50.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Blue
                )
        )

//        Cara menampilkan gambar
        Image(painter = painterResource(id = R.drawable.pipa),
            contentDescription = null,
            modifier = adifa.size(200.dp))

//        Menambahkan karakter "nama"
        Text(text = "Nama",
            style = TextStyle(
                fontSize = 20.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Bold
                )
            )

//        Menambahkan karakter nama "Muhammad Adifa Firmansyah
        Text(text = "Muhammad Adifa Firmansyah",
            style = TextStyle(
                fontSize = 15.sp,
                color = Color.Red,
                fontWeight = FontWeight.SemiBold
            )
        )

//        Menambahkan karakter NIM "20220140177"
        Text(text = "20220140177",
            style = TextStyle(
                fontSize = 35.sp
            )
            )
    }

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
    PAM2Theme {
        Greeting("Android")
    }
}