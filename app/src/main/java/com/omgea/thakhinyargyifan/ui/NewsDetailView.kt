package com.omgea.thakhinyargyifan.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.omgea.thakhinyargyifan.R

@Composable
fun NewsDetailView (){

    Column(modifier = Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "profile_image",
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "text",
            modifier = Modifier
                .fillMaxWidth()
                .weight(weight = 1f)
                .padding(all = 8.dp),
            color = Color.White
        )
    }
}

@Composable
@Preview
fun NewsDetailPreview(){
    NewsDetailView()
}