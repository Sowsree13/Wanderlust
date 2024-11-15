package com.example.travelapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelApp(this)
        }
    }

    @Composable
    fun TravelApp(context: Context) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            // Title with new color and font style
            Text(
                text = "Wanderlust Travel",
                fontSize = 36.sp,
                color = Color(0xFF3E4EB8),
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 20.dp),
                textAlign = TextAlign.Center
            )

            // First Destination Card
            TravelCard(
                context = context,
                imageRes = R.drawable.bali,
                destination = stringResource(id = R.string.place_1),
                description = stringResource(id = R.string.description),
                plan = stringResource(id = R.string.plan),
                onClick = { context.startActivity(Intent(context, BaliActivity::class.java)) }
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Second Destination Card
            TravelCard(
                context = context,
                imageRes = R.drawable.paris,
                destination = stringResource(id = R.string.place_2),
                description = stringResource(id = R.string.description),
                plan = stringResource(id = R.string.plan),
                onClick = { context.startActivity(Intent(context, ParisActivity::class.java)) }
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Third Destination Card
            TravelCard(
                context = context,
                imageRes = R.drawable.singapore,
                destination = stringResource(id = R.string.place_3),
                description = stringResource(id = R.string.description),
                plan = stringResource(id = R.string.plan),
                onClick = { context.startActivity(Intent(context, SingaporeActivity::class.java)) }
            )

            Spacer(modifier = Modifier.height(20.dp))
        }
    }

    @Composable
    fun TravelCard(
        context: Context,
        imageRes: Int,
        destination: String,
        description: String,
        plan: String,
        onClick: () -> Unit
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .clickable(onClick = onClick),
            elevation = 8.dp,
            backgroundColor = Color(0xFFF9F9F9)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(8.dp)
            ) {
                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(140.dp)
                )

                Text(
                    text = destination,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF3E4EB8),
                    modifier = Modifier.padding(top = 8.dp)
                )

                Text(
                    text = description,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    color = Color(0xFF6C6C6C),
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
                )

                Text(
                    text = plan,
                    color = Color(0xFFB0B0B0),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Light,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(vertical = 4.dp)
                )
            }
        }
    }
}
