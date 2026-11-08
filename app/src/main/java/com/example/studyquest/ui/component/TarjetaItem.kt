package com.example.studyquest.ui.component

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material3.CardDefaults.cardElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.studyquest.R
import androidx.compose.foundation.Image
import androidx.compose.ui.tooling.preview.Preview
import kotlin.String

data class TarjetaItemData(
    val asignatura: String,
    val fecha: String,
    val hora: String,
    val minutos: String,
    val xp: String
)

@Composable
fun TarjetaItem(data: TarjetaItemData, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier.size(60.dp), // Tamaño de ejemplo para la caja
                contentAlignment = Alignment.CenterStart // Centra los elementos dentro del Box
            ) {
                // 2. Colocamos la imagen dentro del Box
                Image(
                    painter = painterResource(id = R.drawable.baseline_code_24),
                    contentDescription = "Descripción de la imagen",
                    modifier = Modifier.size(50.dp) // Tamaño de la imagen
                )
            }
            Column(

            ) {
                Row(

                ) {
                    Column(

                    ) {
                        Text(
                            text = data.asignatura,
                            style = MaterialTheme.typography.titleMedium
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Row() {
                            Icon(
                                painter = painterResource(id = R.drawable.outline_calendar_check_24),
                                contentDescription = "Icono de calendario"
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Text(
                                text = data.fecha,
                                style = MaterialTheme.typography.bodyMedium
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Text(
                                text = data.hora,
                                style = MaterialTheme.typography.bodyMedium
                            )
                        }

                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(2.dp),
                    //horizontalArrangement = Arrangement.SpaceBetween, // Distribuye los elementos a los lados
                    verticalAlignment = Alignment.CenterVertically // <--- ¡Esto centra los elementos verticalmente!
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.outline_alarm_on_24),
                        contentDescription = "Icono de reloj"
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = data.minutos,
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = data.xp,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }

        }
    }
}



@Preview(showBackground = true) // 'showBackground = true' añade un fondo blanco para que se lea bien
@Composable
fun TarjetaItemPreview() {
    MaterialTheme {
        TarjetaItem(
            data = TarjetaItemData(
                asignatura = "Programación Multimedia",
                fecha = "01/10/2026",
                hora = "18:30h",
                minutos = "45 min",
                xp = "150 xp"

            )
        )
    }
}