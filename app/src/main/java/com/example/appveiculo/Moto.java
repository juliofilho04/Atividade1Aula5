package com.example.appveiculo;

import android.util.Log;

public class Moto extends Veiculo{
    public Moto(String nome, String marca, int ano){
        super(nome, marca, ano);
    }

    @Override
    public void acelerar(){
        Log.i("Veiculo", "Acelerando");
    }

    public void frear(){
        Log.i("Veiculo", "Freando...");
    }

    public void abastecer(){
        Log.i("Veiculo", "Moto sendo abastecido");
    }

    public void empinar(){
        Log.i("Veiculo", "Maloqueiro empina a moto");
    }

}
