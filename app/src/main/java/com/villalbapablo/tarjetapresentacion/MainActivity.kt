package com.villalbapablo.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.villalbapablo.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Tarjeta()
                }
            }
        }
    }
}

@Composable
fun Tarjeta(modifier: Modifier = Modifier) {
    val androidLogo = painterResource(R.drawable.ic_launcher_foreground)

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xFFeb4034))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = androidLogo,
            contentDescription = "Android Logo",
            modifier = Modifier.size(100.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Pablo Daniel Villalba Medina",
            fontSize = 24.sp
        )
        Text(
            text = "Estudiante Informática",
            fontSize = 16.sp,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(32.dp))

        Column(horizontalAlignment = Alignment.Start) {
            ContactoItem(
                iconRes = painterResource(R.drawable.ic_phone),
                text = "+595 981 111 111"
            )
            ContactoItem(
                iconRes = painterResource(R.drawable.ic_web),
                text = "@AndroidDev"
            )
            ContactoItem(
                iconRes = painterResource(R.drawable.ic_mail),
                text = "pvillalba@uaa.edu.py")

        }
    }
}

@Composable
fun ContactoItem(iconRes: Painter, text: String, modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(8.dp)
    ) {
        Image(
            painter = iconRes,
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = text,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaPresentacionTheme {
        Tarjeta()
    }
}
