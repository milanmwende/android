package com.nilan.milan

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.nilan.milan.ui.theme.MilanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting() {
    Column(
modifier = Modifier
    .background(Color.Cyan)
//    .fillMaxWidth()
//    .fillMaxHeight()
    .fillMaxSize()
    .padding(50.dp)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center

    ) {

Row {
    Text(text = "Images")

    Spacer(modifier = Modifier
        .width(30.dp)
    )

    Text(text = "Videos")

    Spacer(modifier = Modifier
        .height(30.dp)
        .width(30.dp))

    Text(text = "Settings")

}
        Text(text = "First App", fontSize = 20.sp, fontFamily = FontFamily.Cursive,
            modifier = Modifier
                .background(Color.White)
        )
        Text(text = "First Step", color = Color.Gray )

        val inp = LocalContext.current
        Text(text = "Input",
            modifier = Modifier
                .clickable {
                    inp.startActivity(Intent(inp,InputActivity::class.java))
                })

        val about = LocalContext.current

        Button(onClick = {

            about.startActivity(Intent(about, AboutActivity::class.java))

        }) {
            Text(text = "About Us")

        }

        val img = LocalContext.current
        Text(text = "Imageinput",
            modifier = Modifier
                .clickable {
                    inp.startActivity(Intent(inp,ImageInputActivity::class.java))
                })

        val mg = LocalContext.current
        Text(text = "Image",
            modifier = Modifier
                .clickable {
                    inp.startActivity(Intent(inp,ImageActivity::class.java))
                })

        val web = LocalContext.current
        Text(text = "Visit website",
            modifier = Modifier
                .clickable {
                    inp.startActivity(Intent(inp,webviewActivity::class.java))
                })

        AsyncImage(
            model = "https://www.emobilis.ac.ke/images/logo.jpg",
            contentDescription = null,
        )










    }


}
