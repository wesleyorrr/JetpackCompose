package com.curvelo.jetinstagran.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.curvelo.jetinstagran.User
import com.curvelo.jetinstagran.profile.components.ProfileDescription
import com.curvelo.jetinstagran.profile.components.ProfileHeader
import com.curvelo.jetinstagran.profile.components.ProfileInformation

@Composable
fun ProfileScreen (){
    val user = User(
        username = "Wesley_Oliveira" ,
        profileImageUrl = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/5f4bd7a6-f763-4518-9b81-bdfd40ce3fc9/d26yer1-421bb5b8-9fc2-4d5a-b2d1-1e1f81b26b82.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzVmNGJkN2E2LWY3NjMtNDUxOC05YjgxLWJkZmQ0MGNlM2ZjOVwvZDI2eWVyMS00MjFiYjViOC05ZmMyLTRkNWEtYjJkMS0xZTFmODFiMjZiODIucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.p5vfqGmq9kIylfG3glHGa20CAPUtoWlAxKEGpIvGOi8",
        post = 15,
    followers = 388,
     following = 360,
     name = "Wesley",
     description = "Minhas descrições"

    )

    Column {
        ProfileHeader(
            backClick = { /*TODO*/ },
            notificationClick = { /*TODO*/ },
            username = user.username,
            optionClick = { /*TODO*/ })

        ProfileInformation(
            ImageUrl = user.profileImageUrl,
            post = user.post,
            followers = user.followers,
            following = user.following

        )
        ProfileDescription(
            name = user.name,
            description = user.description,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp,top = 4.dp, bottom = 4.dp))

     }
    }

@Preview(showBackground = true)
@Composable

fun ProfileScreenPre(){
ProfileScreen()
}