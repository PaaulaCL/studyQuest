package com.example.studyquest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.studyquest.ui.theme.StudyQuestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StudyQuestTheme {
                // Contenedor principal de la app
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PantallaBienvenida("StudyQuest Lista para Empezar")
                }
            }
        }
    }
}

// Función Composable (la forma moderna de dibujar pantallas)
@Composable
fun PantallaBienvenida(mensaje: String) {
    Text(
        text = mensaje,
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewBienvenida() {
    StudyQuestTheme {
        PantallaBienvenida("StudyQuest Lista para Empezar")
    }
}