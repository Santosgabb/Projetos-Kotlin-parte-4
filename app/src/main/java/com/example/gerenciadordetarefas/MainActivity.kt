package com.example.gerenciadordetarefas
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gerenciadordetarefas.ui.theme.GerenciadorDeTarefasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            GerenciadorDeTarefasTheme {
                //Surface onde vc aplica tudo que foi desenvolvido
                Surface(modifier = Modifier.fillMaxSize()) {
                    GreetingTarefa()
                }

                }
            }
        }
    }

// Criação do metodo da tela
@Composable
fun GreetingTarefa(modifier: Modifier = Modifier){


    Column (
        modifier = modifier,
        verticalArrangement =  Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        //armazena image
        Image(
            painter = painterResource(id = R.drawable.ic_task_completed),
            contentDescription = null
        )
        Text(
            text = "All tasks completed",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 24.dp, end = 8.dp)
        )
        Text(
            text = "Nice work!",
            fontSize = 16.sp
        )
    }

}





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GerenciadorDeTarefasTheme {
        //exibindo o que foi criado
        GreetingTarefa()
    }
}