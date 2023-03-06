package com.curvelo.jetinstagran.profile.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import org.w3c.dom.Text

@Composable
fun ProfileInformation(
    modifier: Modifier = Modifier
){
    AsyncImage(
        model = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/5f4bd7a6-f763-4518-9b81-bdfd40ce3fc9/d26yer1-421bb5b8-9fc2-4d5a-b2d1-1e1f81b26b82.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzVmNGJkN2E2LWY3NjMtNDUxOC05YjgxLWJkZmQ0MGNlM2ZjOVwvZDI2eWVyMS00MjFiYjViOC05ZmMyLTRkNWEtYjJkMS0xZTFmODFiMjZiODIucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.p5vfqGmq9kIylfG3glHGa20CAPUtoWlAxKEGpIvGOi8",
        contentDescription ="profile image"
    )
  Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {  ProfileInformationItem(15,"Publicação")
      ProfileInformationItem(389,"Seguidores")
      ProfileInformationItem(360,"Seguidos")


  }
}

@Composable
private fun ProfileInformationItem(
    anount:Int,
    type:String,
    modifier:Modifier = Modifier

){
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = anount.toString(), fontWeight = FontWeight.Bold)
        Text(text = type)
        
    }

}
@Preview(showBackground = true)
@Composable
fun ProfileInformationPreview(){
    ProfileInformation()
}