package com.example.psi

import android.content.ContentValues.TAG
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.v(TAG, "OnCreate")
        setContent {
            katalogPsu()

        }
    }
}

class pes(val jmeno: String, val vaha: Double, val vek: Int,val obrazekRes:Int)


@Composable
fun katalogPsu() {
    Log.v(TAG, "KatalogPsu")
    var psi = listOf(
        pes("azor", 5.0, 3,R.drawable.ic_pes1),
        pes("tapka", 4.0, 12,R.drawable.ic_pes2),
        pes("argo", 35.0, 8,R.drawable.ic_pes3),
        pes("azor", 5.0, 3,R.drawable.ic_pes1),
        pes("tapka", 4.0, 12,R.drawable.ic_pes2),
        pes("argo", 35.0, 8,R.drawable.ic_pes3),
        pes("azor", 5.0, 3,R.drawable.ic_pes1),
        pes("tapka", 4.0, 12,R.drawable.ic_pes2),
        pes("argo", 35.0, 8,R.drawable.ic_pes3),
    )
    Column {
    Text(text = stringResource(id = R.string.titulek_katalogu))
Column {
    
}
            Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {


        psi.forEach { pes ->
            Cokl(pes = pes)
        }
    }
            Button(onClick = {}) {
                Log.v(TAG, "Přidavam psa")
                psi = psi + pes("Azor", 5.0,3)



                Text(text = "Přidej psa")



            }
        }





}

@Composable
fun Cokl( pes: pes) {
    Column(modifier = Modifier.padding(all = 4.dp)) {
        Image(painter = painterResource(id = pes.obrazekRes), contentDescription ="")
        Text(text = pes.jmeno)
        Text(text = pes.vaha.toString())
        Text(text = pes.vek.toString())
    }
}



