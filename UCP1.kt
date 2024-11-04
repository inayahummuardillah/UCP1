package com.example.ucp1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text2.input.TextFieldCharSequence
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun UCP1(
    modifier: Modifier = Modifier
){
    var Email by remember { mutableStateOf("") }
    var NomorTelepon by remember { mutableStateOf("") }
    var Alamat by remember { mutableStateOf("") }

    var confEmail by remember { mutableStateOf("") }
    var confNomorTelepon by remember { mutableStateOf("") }
    var confAlamat by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().padding(5.dp),

    ){
        TextField(
            value = Email,
            onValueChange = {Email = it},
            label = {
                Text(text = "Email")
            },
            placeholder = {
                Text(text = "Isi Email Anda")
            },
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        TextField(
            value = NomorTelepon,
            onValueChange = {NomorTelepon = it},
            label = {
                Text(text = "NomorTelepon")
            },
            placeholder = {
                Text(text = "Isi NomorTelepon anda")
            },
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        TextField(
            value = Alamat,
            onValueChange = {Alamat = it},
            label = {
                Text(text = "Alamat")
            },
            placeholder = {
                Text(text = "Isi Alamat anda")
            },
            modifier = Modifier.fillMaxWidth().padding(5.dp)
        )
        Button(onClick = {
            confEmail = Email
            confNomorTelepon = NomorTelepon
            confAlamat = Alamat
        }) {
            Text(text = "Submit")
        }
    }
}

@Composable
fun HeaderSection2() {
    Box(
        modifier = Modifier
            .size(100.dp)
            .fillMaxWidth()
            .background(Color.Blue)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.me),
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape)
                        .background(Color.Blue) // Background color for the box.clip(CircleShape)
                )
                Column(
                    modifier = Modifier
                        .padding(14.dp)

                ) {
                    Text(text = "Halo,", color = Color.Black)
                    Text(text = "Inayah Ummu Ardillah", color = Color.Black)
                }
            }
        }
    }
}

@Composable
fun TampilData(
    param: String,
    argu: String
) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = param, modifier = Modifier.weight(0.8f), color = Color.Black)
            Text(text = ": ", modifier = Modifier.weight(0.2f), color = Color.Black)
            Text(text = argu, modifier = Modifier.weight(2f), color = Color.Black)
        }
    }
}

