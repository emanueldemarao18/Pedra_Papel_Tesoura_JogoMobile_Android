package com.cursoandroid.pedrapapeloutesouraprojecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view) {
        this.opcaoSelecionada("Pedra");

    }

    public void selecionadoPapel(View view) {

        this.opcaoSelecionada("Papel");

    }

    public void selecionadoTesoura(View view) {

        this.opcaoSelecionada("Tesoura");

    }

    public void opcaoSelecionada(String opcaoSelecionada) {

        ImageView Resultado = findViewById(R.id.Resultado);
        TextView texto = findViewById(R.id.texto);


        int numero = new Random().nextInt(3); // 0 1 2
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        String opcaoApp = opcoes[numero];


        switch (opcaoApp) {

            case "Pedra":

                Resultado.setImageResource(R.drawable.pedra);
                break;
            case "Papel":
                Resultado.setImageResource(R.drawable.papel);
                break;

            case "Tesoura":
                Resultado.setImageResource(R.drawable.tesoura);
                break;
        }
        if (

                (opcaoApp == "tesoura" && opcaoSelecionada == "papel") ||
                        (opcaoApp == "papel" && opcaoSelecionada == "pedra") ||
                        (opcaoApp == "pedra" && opcaoSelecionada == "tesoura")) {

            texto.setText("Você perdeu :(");


        }


    }
}




