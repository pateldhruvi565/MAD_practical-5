package com.example.mad_practical_5_22012021103
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mad_practical_5_22012021103.screenLogin
import com.example.mad_practical_5_22012021103.screenRegister

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        // Login screen
        @Composable("login") {
            Login(onSignUpClick = { navController.navigate("register") })
        }

        // Register screen
        @Composable("register") {
            Register(onLoginClick = { navController.navigate("login") })
        }
    }
}