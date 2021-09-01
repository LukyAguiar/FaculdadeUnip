package com.example.pedrapalpetesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.Random;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Evento da Pedra
    public void selecionarPedra(View view)
    {
        this.opcaoSelecionada ("Pedra");
    }

    //Evento do Papel
    public void selecionarPapel(View view)
    {
        this.opcaoSelecionada ("Papel");
    }

    //Envento da Tesoura
    public void selecionarTesoura(View view)
    {
        this.opcaoSelecionada ("Tesoura");
    }

    private void opcaoSelecionada(String escolhaUsuario)
    {
        //Buscando Imagem e txt
        ImageView imgPadrao = (ImageView) findViewById(R.id.imgPadrao);
        TextView txtResultado = (TextView) findViewById(R.id.txtResultado);

        //Gerar resposta dinamicamente aleatoria

        String [] opcoes = {"pedra","papel","tesoura"};
        int numero = new Random().nextInt( 3);
        String escolhaApp = opcoes[numero];

        switch (escolhaApp){

            case "pedra":
                imgPadrao.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imgPadrao.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imgPadrao.setImageResource(R.drawable.tesoura);
                break;
        }

        if ((escolhaApp == "pedra" && escolhaUsuario == "tesoura") || (escolhaApp == "papel" && escolhaUsuario == "Pedra") || (escolhaApp ==  "tesoura" && escolhaUsuario == "papel"))
        {//App Ganhador
            txtResultado.setText("♦ You LOSE :< ♦");
        }

        else if ((escolhaUsuario == "pedra" && escolhaApp == "tesoura") || (escolhaUsuario == "papel" && escolhaApp == "pedra") || (escolhaUsuario == "tesoura" && escolhaApp == "papel"))
        {
            txtResultado.setText("♦ YOU WIN  :> ♦");
        }

        else
        {
            txtResultado.setText("♦ Empate ");
        }
    }

}