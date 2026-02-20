package me.angienunez.tallergitgithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.angienunez.tallergitgithubapp.ui.theme.TallerGitGithubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrabajoEnClase()
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun TrabajoEnClase() {

    Column() {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val painter = painterResource(R.drawable.maxito)

            Image(
                painter = painter,
                contentDescription = "f1",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(width = 200.dp)
                    .height(200.dp)
                    .clip(CircleShape)
            )
            Text(
                text = "MAX VERSTAPPEN",

                fontSize = 17.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 30.dp,
                        bottom = 5.dp,
                        start = 30.dp,
                        end = 30.dp
                    ),

                textAlign = TextAlign.Center
            )
            Text(
                text = "Conductor formula 1",
                textAlign = TextAlign.Center,
                fontSize = 15.sp,
                color = Color.Blue
            )


        }
        Column() {
            Text(
                text = "EDAD",
                fontSize = 15.sp,
                color = Color.Gray
            )
            Text(
                text = "28 años",

                )
            Text(
                text = "CORRER",
                fontSize = 15.sp,
                color = Color.Gray

            )
        }

    }


}

