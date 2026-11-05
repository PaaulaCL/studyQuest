// Es la dirección postal de tu archivo dentro del proyecto.
// Le dice a Android en qué carpeta se encuentra guardado este fichero de código.
package com.example.studyquest

// traer las herramientas necesarias de la caja de herramientas
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Button
import androidx.compose.ui.tooling.preview.Preview
import com.example.studyquest.ui.theme.StudyQuestTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.foundation.layout.Column


class MainActivity : ComponentActivity() { //Clase principal de la pantalla
    override fun onCreate(savedInstanceState: Bundle?) { //Metodo del ciclo de vida que se ejecuta una vez
        super.onCreate(savedInstanceState)
        setContent { //conecta Adroid con Jetpack compose
            StudyQuestTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PantallaInicio()
                    //Se añade la pantalla de inicio al start de la app
                }
            }
        }
    }
}

@Composable
fun PantallaInicio() {
    // 1. Creamos la variable de estado para el texto del botón
    var textoBoton by remember { mutableStateOf("¡Empezar a estudiar!") }

    Column {
        Text(text = "Bienvenido a StudyQuest")

        Button(
            onClick = {
                // 2. Al hacer clic, cambiamos el valor de la variable
                textoBoton = "¡Estudiando... ⏳!"
            }
        ) {
            // 3. El Text del botón lee directamente de la variable de estado
            Text(text = textoBoton)
        }
    }
}

