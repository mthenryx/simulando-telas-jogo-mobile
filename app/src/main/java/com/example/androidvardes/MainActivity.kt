package com.example.androidvardes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidvardes.ui.theme.AndroidVardesTheme
import com.example.androidvardes.ui.theme.OpenSans

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidVardesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    //Tela Jogo da nave
                    ComponetsGame(
                        modifier = Modifier.padding(innerPadding)
                    )

                    //Tela Game Over
                    //ComponentsGamerOver(
                        //modifier = Modifier.padding(innerPadding)
                    //)
                }
            }
        }
    }
}

//Tela Jogo nave
@Composable
fun ComponetsGame(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column () {
            HeaderComponents()

            FilaAndroidEnemy()
        }

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier.size(100.dp),
                painter = painterResource(R.drawable.nave),
                contentDescription = "Nave"
            )

            Button()
        }
    }
}

@Composable
fun HeaderComponents(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "SCORE: 0050",
            fontFamily = OpenSans,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color.White
        )

        Row() {
            Text(
                text = "LIVES:",
                fontFamily = OpenSans,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.White
            )

            AndroidEnemy(
                modifier = Modifier.size(30.dp),
                color = Color.Green
            )

            AndroidEnemy(
                modifier = Modifier.size(30.dp),
                color = Color.Green
            )

            AndroidEnemy(
                modifier = Modifier.size(30.dp),
                color = Color.Green
            )
        }
    }
}

@Composable
fun FilaAndroidEnemy(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
    ) {
        AndroidEnemy(
            modifier = Modifier.size(85.dp),
            color = Color.Green
        )

        AndroidEnemy(
            modifier = Modifier.size(85.dp),
            color = Color.Red
        )

        AndroidEnemy(
            modifier = Modifier.size(85.dp),
            color = Color.Blue
        )

        AndroidEnemy(
            modifier = Modifier.size(85.dp),
            color = Color.Yellow
        )

        AndroidEnemy(
            modifier = Modifier.size(85.dp),
            color = Color.Green
        )
    }
}

@Composable
fun Button(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.DarkGray)
    ) {
        Text(
            text = "PRESS START",
            fontFamily = OpenSans,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            color = Color.White,
            modifier = modifier.align(Alignment.Center)
                .padding(10.dp)
        )
    }
}

//Tela Game Over
/*
@Composable
fun ComponentsGamerOver(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxWidth()
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Row(
            modifier = Modifier.align(Alignment.Center)
        ) {
            AndroidEnemy(
                modifier = Modifier.size(100.dp),
                color = Color.Green
            )

            AndroidEnemy(
                modifier = Modifier.size(100.dp),
                color = Color.Red
            )

            AndroidEnemy(
                modifier = Modifier.size(100.dp),
                color = Color.Blue
            )

            AndroidEnemy(
                modifier = Modifier.size(100.dp),
                color = Color.Yellow
            )
        }

        Text(
            text = "GAME OVER",
            fontWeight = FontWeight.SemiBold,
            fontSize = 64.sp,
            color = Color.White,
            fontFamily = OpenSans,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}
*/

@Composable
fun AndroidEnemy(
    modifier: Modifier = Modifier,
    color: Color
){
    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.ic_launcher_foreground),
        colorFilter = ColorFilter.tint(color),
        contentDescription = "Android Enemy"
    )
}
