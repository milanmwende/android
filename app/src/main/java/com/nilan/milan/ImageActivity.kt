package com.nilan.milan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImagePainter

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Img()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Img() {
        Column(

            modifier = Modifier
                .background(Color.Magenta)
                .fillMaxSize()

        ) {


            Image(painter = painterResource(id = R.drawable.milan) , contentDescription = "",
                modifier = Modifier)




        }


}


