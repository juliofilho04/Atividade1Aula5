package com.example.appveiculo;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Log.i("Veiculo","Iniciando sistema automotivo...");

        Carro carro01 = new Carro("Spin", "Chevrolet", 2005);
        Carro carro02 = new Carro ("C3", "Citroen", 2010);

        Moto moto01 = new Moto("Ninja", "Kawasaki", 2022);

        Caminhao caminhao01 = new Caminhao("Volvo FH", "Volvo", 2024);

        carro01.exibirDetalhes();
        carro01.acelerar();
        carro01.frear();
        carro01.abastecer();
        carro01.fazerDrift();

        carro02.exibirDetalhes();
        carro02.acelerar();
        carro02.frear();
        carro02.abastecer();
        carro02.fazerDrift();

        moto01.exibirDetalhes();
        moto01.acelerar();
        moto01.frear();
        moto01.abastecer();
        moto01.empinar();

        caminhao01.exibirDetalhes();
        caminhao01.acelerar();
        caminhao01.frear();
        caminhao01.abastecer();
        caminhao01.engatarCarreta();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}