package com.example.appveiculo;

import android.util.Log;

public class Carro extends Veiculo {

    public Carro(String nome, String marca, int ano){
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
        Log.i("Veiculo", "Carro sendo abastecido");
    }

    public void fazerDrift(){
        Log.i("Veiculo", "Carro faz drift");
    }

}
