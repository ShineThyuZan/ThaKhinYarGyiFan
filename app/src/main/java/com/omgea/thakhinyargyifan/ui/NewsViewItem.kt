package com.omgea.thakhinyargyifan.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.omgea.thakhinyargyifan.R

@Composable
fun NewsViewItem(
    onClickEvent : () -> Unit ,
    text : String = "Morning") {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 8.dp)
            .background(Color.Gray)
            .clickable {
                onClickEvent()
            },
        verticalAlignment = Alignment.CenterVertically
    ){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "profile_image"
        )
        Text(
            text = text,
            modifier = Modifier
                .fillMaxWidth()
                .weight(weight = 1f),
            color = Color.White
        )

    }
}

@Composable
@Preview
fun Preview(){
    NewsViewItem({

    })
}