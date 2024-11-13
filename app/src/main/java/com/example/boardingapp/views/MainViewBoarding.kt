package com.example.boardingapp.views

import androidx.compose.runtime.Composable
import com.example.boardingapp.R
import com.example.boardingapp.data.PageData

@Composable
fun MainView(){
    val items=ArrayList<PageData>()

    items.add(
        PageData(
            R.raw.page1,
            "Bienvenidos",
            "Bienvenidos a la aplicacion para mostrar el uso del OnBoard"
        )
    )
    items.add(
        PageData(
            R.raw.page2,
            "Uso de OnBoarding",
            "Esta es la segunda pagina para mostrar la descripcion"
        )
    )
    items.add(
        PageData(
            R.raw.page3,
            "Fin del Boarding",
            "Este es el final del Boarding ya debe de aparacer el boton"
        )
    )
}