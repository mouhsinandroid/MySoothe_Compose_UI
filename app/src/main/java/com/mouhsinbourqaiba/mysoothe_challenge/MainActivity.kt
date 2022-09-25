package com.mouhsinbourqaiba.mysoothe_challenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mouhsinbourqaiba.mysoothe_challenge.ui.theme.MySootheChallengeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MySootheChallengeTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "welcome" ) {
                    composable("welcome") {
                        WelcomeScreen(
                            loginButtonClicked = {
                                navController.navigate("login")
                            }
                        )
                    }

                    composable("login") {
                        LoginScreen(
                            loginButtonClicked = {
                                navController.navigate("home")
                            }
                        )
                    }

                    composable("home") {
                        HomeScreen()
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MySootheChallengeTheme {
        HomeScreen()
    }
}