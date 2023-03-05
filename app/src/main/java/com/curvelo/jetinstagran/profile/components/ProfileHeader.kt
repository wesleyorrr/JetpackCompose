package com.curvelo.jetinstagran.profile.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ProfileHeader(){
    Row(modifier = Modifier.fillMaxWidth()) {
    IconButton(onClick = { /*TODO*/ }) {
        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "arrow back")
    }

Text(text = "Wesley_Oliveira")
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Default.Notifications, contentDescription = "notificacao")
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Default.MoreVert, contentDescription ="opicao" )
        }

    }
}
@Preview(showBackground = true)
@Composable
fun ProfileHeaderPreview(){
ProfileHeader()
}
