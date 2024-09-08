package com.satc.cacaaotesouro.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun tela3(navController: NavController){
    var inputValue by remember { mutableStateOf("") }

    Column (
        Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(text = "Qual o animal que tem quatro patas, late e tem um rabo?")

        TextField(
            value = inputValue,
            onValueChange = { newValue ->
                inputValue = newValue
            },
            label = { Text("Digite sua resposta") },
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done
            ),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            if (inputValue == "cachorro" || inputValue == "Cachorro"){
                navController.navigate("tela4")
            }
        }) {
            Text(text = "Ir para a próxima pista")
        }

        Button(onClick = {
            navController.popBackStack()
        }) {
            Text(text = "Retornar para a página anterior")
        }

    }
}