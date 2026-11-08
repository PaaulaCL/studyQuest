package com.example.studyquest.ui.page

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.studyquest.ui.component.TarjetaItem
import com.example.studyquest.ui.component.TarjetaItemData
import kotlin.String


@Composable
fun PantallaHistorial(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Llamamos a nuestra tarjeta pasándole datos de prueba
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