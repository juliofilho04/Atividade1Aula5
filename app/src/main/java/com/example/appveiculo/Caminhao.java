package com.example.appveiculo;

import android.util.Log;

public class Caminhao extends Veiculo{

    public Caminhao(String nome, String marca, int ano){
        super(nome, marca, ano);
    }

    @Override
    public void acelerar(){
        Log.i("Veiculo", "Acelerando...");
    }

    public void frear(){
        Log.i("Veiculo", "Freando...");
    }

    public void abastecer(){
        Log.i("Veiculo", "Caminhao sendo abastecido.");
    }

    public void engatarCarreta(){
        Log.i("Veiculo", "Carreta sebdi engatada no caminhao.");
    }

}
