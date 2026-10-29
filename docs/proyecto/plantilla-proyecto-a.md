# Plantilla: propuesta del Proyecto A

---

## 0 · Datos

| | |
|---|---|
| **StudyQuest** | |
| **Paula Casal Lorenzo** | |
| **01/10/2026** | |

---

## 1 · La idea en una frase

> Qué hace tu app y para quién, en una sola frase.
Una app que permite a estudiantes registrar sus estudios para ganas puntos y medallas.
> Fórmula: «Una app que permite a [quién] hacer [qué] para [para qué].»


---

## 2 · El problema

> ¿Qué problema resuelve? ¿Cómo se resuelve hoy sin tu app?
Resuelve el problema de las distracciones del movil, ya que la idea es que bloquee el utilizar otras aplicaciones mientras esté la sesión de estudio iniciada.
Hpy en día hay web, apps, juegos que hacen una función similar, pero siento que ninguna ayuda a solo concentrarte en estudiar o hacer tareas. Tampoco tienen ningún tipo de recompensa que invite a seguir usando la aplicación.

---

## 3 · Personas usuarias

> ¿Quién la va a usar? Describe a una persona concreta: edad, soltura con la
> tecnología, cuándo y dónde abre la app, cuánto tiempo le dedica y qué pasa
> si le falla.
Un estudiante de FP, de 27 años, que hace un ciclo a distancia. Abre la app cada vez que vay a comenzar sus sesiones de estudio, marca un tiempo en el temporizador entre 25 -50 minutos depende del tipo de estudio que tenga e interactúa con la app cuando finalice el tiempo. No es grave si falla la aplicación, pero perder puntos o medallas daría rabia.

---

## 4 · Funcionalidades

### Imprescindibles (sin esto la app no tiene sentido)

| # | Funcionalidad |
|---|---------------|
| F1 |Cronómetro / Temporizador para inicial y finalizar una sesión de estudio por asignatura |
| F2 |Guardar la sesión realizada y sumar puntos de experiencia al perfil del estudiante |
| F3 |Ver el historial de sesiones de estudio guardadas y el nivel alcanzado |

### Opcionales (si sobra tiempo)

| # | Funcionalidad |
|---|---------------|
| O1 |Pantalla con logros o medallas desbloqueables |
| O2 |Alarma al terminar la cuenta a trás del temporizador |

---

## 5 · Pantallas

| Pantalla |                       Para qué sirve              |           Se llega desde         |
|----------|---------------------------------------------------|----------------------------------|
| Inicio   | Iniciar cronómetro y elegir asignatura            | Al entrar en la app              |
| Resumen  | Muentra el tiempo estudiado, puntos...            | Al terminar un sesión de estudio |
| Historial| Muentra las sesiones de estudio guardadas         | Pulsar icono historial           |
| Perfil   | Nuestra el avatar, nivel, historial de sesiones...| ûlsar icono perfil               |

---

## 6 · Bocetos

> Dibuja las pantallas principales. A mano y fotografiado es válido.
> Pega aquí las imágenes o indica el nombre de los archivos adjuntos.

---

## 7 · Qué datos guarda la app

| Tipo de dato  |                             Campos                          |                                Ejemplo                      |
|---------------|-------------------------------------------------------------|-------------------------------------------------------------|
| SesionEstudio | id, asignatura, duracionMinutos, fecha, puntos, fotoApuntes | 1, "rogramación", 45, "01/10/2026", 45, "foto_apuntes1.jpg" |
| Usuario       | id, nombre, puntosTotales, nivelActual                      | 1, "Marcos", 300, 3                                         |

---

## 8 · Encaje con los requisitos del módulo

> Apartado obligatorio: ninguna casilla puede quedar vacía.

|        Requisito          |                                      Dónde encaja en tu app                               | Tema |
|---------------------------|-------------------------------------------------------------------------------------------|------|
| **Persistencia de datos** | Guardar el historial de estudio, puntos gandos, niveles...                                | 4    |
| **Servicio web**          | Conectarse a APIs publicas para encontrar frases que motiven y mostar el mesaje en la app | 5    |
| **Sensor o localización** | Usar el sensor de movimiento para detectar si el usuario mueve o gira el movil            | 6    |
| **Contenido multimedia**  | Capturar fotografías de los apuntes y adjuntarla al historial                             | 7    |

---

## 9 · Riesgos

|          Lo que me preocupa                |                          Plan B                                 |
|--------------------------------------------|-----------------------------------------------------------------|
| Que falle la conexión a la API de internet | Si la API no responde, se legie una frase de un listado interno |

---

## Antes de entregar

- [ ] La idea cabe en una frase.
- [ ] El público es una persona concreta, no «todo el mundo».
- [ ] Hay **3 o 4** funcionalidades imprescindibles, no diez.
- [ ] Cada funcionalidad imprescindible tiene su pantalla.
- [ ] Hay bocetos de las pantallas principales.
- [ ] **Las cuatro casillas del apartado 8 están rellenas.**
- [ ] Está identificado al menos un riesgo con su plan B.
