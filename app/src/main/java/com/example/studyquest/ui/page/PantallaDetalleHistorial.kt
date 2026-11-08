package com.example.studyquest.ui.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.studyquest.R
import com.example.studyquest.ui.component.TarjetaItem
import com.example.studyquest.ui.component.TarjetaItemData
import kotlin.String


@Composable
fun PantallaDetalleHistorial(modifier: Modifier = Modifier) {
    //Columna que contiene toda la página
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        //Primer componenete - COlumna que contiene la información
        Column(
            modifier = modifier
                .fillMaxSize()
        ) {
            Row(

            ){
                Image(
                    painter = painterResource(id = R.drawable.baseline_code_24),
                    contentDescription = "Descripción de la imagen",
                    modifier = Modifier.size(50.dp) // Tamaño de la imagen
                )
                Column() {
                    Text(
                        text = "Nombre asignatura",
                        style = MaterialTheme.typography.titleMedium
                    )
                    Spacer(modifier = Modifier.height(4.dp))

                }
            }
        }
    }
}