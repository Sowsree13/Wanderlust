package com.example.travelapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Define new colors for the theme
val SkyBlue = Color(0xFF87CEEB)
val DarkSkyBlue = Color(0xFF4682B4)
val OceanBlue = Color(0xFF0077B6)
val SunsetOrange = Color(0xFFFF4500)
val SandYellow = Color(0xFFFFD700)
val EarthBrown = Color(0xFF8B4513)

// Updated Dark and Light palettes with travel-themed colors
private val DarkColorPalette = darkColors(
    primary = DarkSkyBlue,
    primaryVariant = OceanBlue,
    secondary = SunsetOrange,
    background = Color(0xFF1B1B1B),
    surface = Color(0xFF2C2C2C),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White
)

private val LightColorPalette = lightColors(
    primary = SkyBlue,
    primaryVariant = OceanBlue,
    secondary = SandYellow,
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.Black,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black
)

@Composable
fun TravelAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
