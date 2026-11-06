package com.example.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = TetherGreenLight,
    onPrimary = Color.Black,
    primaryContainer = TetherGreen.copy(alpha = 0.25f),
    onPrimaryContainer = TetherGreenNeon,
    secondary = AccentBlue,
    onSecondary = Color.Black,
    secondaryContainer = AccentBlue.copy(alpha = 0.2f),
    onSecondaryContainer = Color.White,
    tertiary = AccentGold,
    background = CryptoDarkBackground,
    onBackground = TextPrimary,
    surface = CryptoDarkSurface,
    onSurface = TextPrimary,
    surfaceVariant = CryptoDarkSurfaceVariant,
    onSurfaceVariant = TextSecondary,
    outline = CryptoDarkBorder,
    error = AccentRed,
    onError = Color.White
)

private val LightColorScheme = darkColorScheme(
    // Defaulting to the dark crypto theme creates the premier Web3 aesthetic
    primary = TetherGreenLight,
    onPrimary = Color.Black,
    primaryContainer = TetherGreen.copy(alpha = 0.25f),
    onPrimaryContainer = TetherGreenNeon,
    secondary = AccentBlue,
    onSecondary = Color.Black,
    background = CryptoDarkBackground,
    onBackground = TextPrimary,
    surface = CryptoDarkSurface,
    onSurface = TextPrimary,
    surfaceVariant = CryptoDarkSurfaceVariant,
    onSurfaceVariant = TextSecondary,
    outline = CryptoDarkBorder
)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false, // Keep consistent crypto styling
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography = Typography,
        content = content
    )
}
