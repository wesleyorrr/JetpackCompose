package com.curvelo.jetinstagran.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.curvelo.jetinstagran.profile.components.ProfileHeader
import com.curvelo.jetinstagran.profile.components.ProfileInformation

@Composable
fun ProfileScreen (){
    Column() {
        ProfileHeader(
            backClick = { /*TODO*/ },
            notificationClick = { /*TODO*/ },
            optionClick = { /*TODO*/ })

        ProfileInformation()
     }
    }

@Preview(showBackground = true)
@Composable

fun ProfileScreenPre(){
ProfileScreen()
}