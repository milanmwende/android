package com.nilan.milan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nilan.milan.ui.theme.MilanTheme

class InputActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        Input()

        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Input(){
  Box (modifier = Modifier
      .fillMaxSize()){
      androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.milan), contentDescription = "",
          modifier = Modifier
              .fillMaxSize(),
          contentScale = ContentScale.Crop)
  }
    Column (

        modifier = Modifier
            .fillMaxSize()


    ){
        var name by remember {
            mutableStateOf(TextFieldValue(""))
        }

        TextField(value = name,
            onValueChange = {name = it},
            label = { Text(text = "Your Name...")}
        )

        Spacer(modifier = Modifier.height(15.dp))


        var age by remember {
            mutableStateOf(TextFieldValue(""))
        }
//       TextField(value = age,
//           onValueChange = {age = it},
//label = { Text(text = "Your Age...")}


        OutlinedTextField(value = age,
            onValueChange = {age = it},
            label = {Text(text = "age")},
            textStyle = TextStyle(Color.Black),
            leadingIcon = { Icon(imageVector = Icons.Default.Edit, contentDescription = "")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                unfocusedBorderColor = Color.White,
                focusedBorderColor = Color.Black,
                unfocusedLabelColor = Color.White,
                focusedLabelColor = Color.Black,
                cursorColor = Color.Magenta,
            )


        )











    }

}

