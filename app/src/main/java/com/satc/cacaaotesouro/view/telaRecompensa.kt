package com.satc.cacaaotesouro.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun telaRecompensa(navController: NavController){
    Column (
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(text = "Você chegou ao tesouro")

        Button(onClick = {
            navController.navigate("tela1"){
                popUpTo("tela1"){
                    inclusive = true
                }
            }
        }) {
            Text(text = "Retornar para a página inicial")
        }

    }
}