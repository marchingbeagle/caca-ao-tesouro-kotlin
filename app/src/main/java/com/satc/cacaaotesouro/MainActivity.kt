package com.satc.cacaaotesouro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.satc.cacaaotesouro.ui.theme.CaçaAoTesouroTheme
import com.satc.cacaaotesouro.view.tela1
import com.satc.cacaaotesouro.view.tela2
import com.satc.cacaaotesouro.view.tela3
import com.satc.cacaaotesouro.view.tela4
import com.satc.cacaaotesouro.view.telaRecompensa

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CaçaAoTesouroTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "tela1" ){
                    composable(
                         route = "tela1"
                    ){
                        tela1(navController)
                    }

                    composable(
                        route = "tela2"
                    ){
                        tela2(navController)
                    }

                    composable(
                        route = "tela3"
                    ){
                        tela3(navController)
                    }

                    composable(
                        route = "tela4"
                    ){
                        tela4(navController)
                    }

                    composable(
                        route = "telaRecompensa"
                    ){
                        telaRecompensa(navController)
                    }
                }
            }
        }
    }
}
