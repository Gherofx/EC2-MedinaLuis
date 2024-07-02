package pe.idat.ec2_medinaluis

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import java.lang.reflect.Modifier

@Composable
fun MiCuestionario(){
    Column (modifier = Modifier.fillMaxSize()){
        Text(text = "CUESTIONARIO", modifier = Modifier.fillMaxSize())
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MiToolBar(){
    TopAppBar(
        title = {
            Text(text = "AppIDAT") },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Color.Blue,
            titleContentColor = Color.White
        ),
        navigationIcon ={ IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Filled.Face,
                contentDescription ="", tint = Color.White )
            
        }})

}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MiScafflold(){
    Scaffold(topBar = { MiToolBar()}
    ){

    }
}



