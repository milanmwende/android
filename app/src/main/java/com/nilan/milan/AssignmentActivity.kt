package com.nilan.milan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.nilan.milan.ui.theme.MilanTheme

class AssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
Greeting3()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting3() {
   LazyColumn {
       item {
           Column(

               modifier = Modifier
                   .background(Color.LightGray)
                   .fillMaxSize()
                   .padding(8.dp),
               horizontalAlignment = Alignment.CenterHorizontally,

               )
           {

               Text(
                   text = "Current location",
                   color = Color.Gray,
               )

               Spacer(
                   modifier = Modifier
                       .height(20.dp)
               )

               Row(
                   modifier = Modifier
                       .fillMaxSize()
                       .background(Color.LightGray)
               ) {
                   Button(
                       onClick = {},
                       colors = ButtonDefaults.buttonColors(Color.White),
                       shape = RoundedCornerShape(15.dp),
                       modifier = Modifier
                           .height(45.dp)
                           .width(150.dp)


                   )
                   {androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.hotel), contentDescription = "")
                       Text(text = "Hotel", color = Color.Black)
                   }

                   Spacer(
                       modifier = Modifier
                           .width(10.dp)
                   )

                   Button(
                       onClick = { /*TODO*/ },
                       colors = ButtonDefaults.buttonColors(Color.White),
                       shape = RoundedCornerShape(15.dp),
                       modifier = Modifier
                           .height(45.dp)
                           .width(150.dp)

                   ) {androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.holiday), contentDescription = "")
                       Text(text = "Holiday", color = Color.Black)

                   }
               }


               Spacer(
                   modifier = Modifier
                       .height(10.dp)
               )
               Row(
                   modifier = Modifier
                       .fillMaxSize()
                       .background(Color.LightGray)
               ) {

    Button(

        onClick = {},
        colors = ButtonDefaults.buttonColors(Color.White),
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier
            .height(45.dp)
            .width(150.dp),


    ) {androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.taxi), contentDescription = "")
        Text(text = "Taxi", color = Color.Black)
    }
    Spacer(
        modifier = Modifier
            .width(10.dp)
    )

    Button(
            onClick = {},

        colors = ButtonDefaults.buttonColors(Color.White),
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier
            .height(45.dp)
            .width(150.dp)

    ) {androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.ticket), contentDescription = "")
        Text(text = "Ticket", color = Color.Black)
    }
}

                   Spacer(
                       modifier = Modifier
                           .height(10.dp)
                   )


                   Row(
                       modifier = Modifier
                           .fillMaxSize()
                           .background(Color.LightGray)
                   ) {

                       Button(
                           onClick = { /*TODO*/ },
                           colors = ButtonDefaults.buttonColors(Color.White),
                           shape = RoundedCornerShape(15.dp),
                           modifier = Modifier
                               .height(45.dp)
                               .width(150.dp)

                       ) {
                           androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.airplane), contentDescription = "")
                           Text(text = "Airplane", color = Color.Black)
                       }




                       Spacer(
                           modifier = Modifier
                               .width(10.dp)
                       )

                       Button(
                           onClick = { /*TODO*/ },
                           colors = ButtonDefaults.buttonColors(Color.White),
                           shape = RoundedCornerShape(15.dp),
                           modifier = Modifier
                               .height(45.dp)
                               .width(150.dp)

                       ) {  androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.harbour), contentDescription = "")
                           Text(text = "Harbour", color = Color.Black)
                       }
                   }


               }

           }

       }
   }




