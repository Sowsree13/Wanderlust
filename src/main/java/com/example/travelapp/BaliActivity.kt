package com.example.travelapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelapp.ui.theme.TravelAppTheme

class BaliActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PlaceOne()
                }
            }
        }
    }
}

@Composable
fun PlaceOne() {
    Column(
        modifier = Modifier
            .background(color = MaterialTheme.colors.background)
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        // Header Section
        Text(
            fontSize = 36.sp,
            color = MaterialTheme.colors.primary,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            text = stringResource(id = R.string.place_1),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            textAlign = TextAlign.Center
        )

        // Image Section
        Image(
            painter = painterResource(id = R.drawable.bali),
            contentDescription = null,
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
                .height(250.dp)
                .shadow(8.dp)
        )

        // Daily Itinerary Section
        Text(
            color = MaterialTheme.colors.onBackground,
            fontSize = 18.sp,
            text = "Day 1: Arrival and Relaxation",
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = "Arrive in Bali and check into your hotel or accommodation. Spend the day relaxing, getting acclimated, and exploring nearby areas.",
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            color = MaterialTheme.colors.onBackground,
            fontSize = 18.sp,
            text = "Day 2: Ubud Tour",
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = "Explore Ubud's cultural hubs, visit the Monkey Forest and Ubud Palace, tour the Tegalalang Rice Terrace, and enjoy a Balinese dance performance.",
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            color = MaterialTheme.colors.onBackground,
            fontSize = 18.sp,
            text = "Day 3: Temple Hopping",
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = "Discover iconic temples like Tanah Lot and Uluwatu with scenic ocean views, ending the day with a sunset dinner.",
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            color = MaterialTheme.colors.onBackground,
            fontSize = 18.sp,
            text = "Day 4: Waterfalls and Beaches",
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = "Visit Tegenungan or Gitgit waterfalls and enjoy Bali’s beaches like Seminyak or Nusa Dua.",
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            color = MaterialTheme.colors.onBackground,
            fontSize = 18.sp,
            text = "Day 5: Island Hopping",
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = "Take a day trip to nearby islands like Nusa Lembongan or Gili, enjoying snorkeling or relaxing on the beach.",
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            color = MaterialTheme.colors.onBackground,
            fontSize = 18.sp,
            text = "Day 6: Cultural Activities",
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = "Experience Balinese village life, learning about the island's rich culture.",
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            color = MaterialTheme.colors.onBackground,
            fontSize = 18.sp,
            text = "Day 7: Departure",
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = "Enjoy a final sunset view, have dinner at a local restaurant, and prepare for departure.",
            modifier = Modifier.padding(bottom = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PlaceOnePreview() {
    TravelAppTheme {
        PlaceOne()
    }
}
