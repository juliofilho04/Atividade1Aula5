package com.example.appveiculo;

import android.util.Log;

public abstract class Veiculo {
    private String nome;
    private String marca;
    private int ano;

    public Veiculo(String nome, String marca, int ano){
        this.nome=nome;
        this.marca=marca;
        this.ano=ano;
    }


    public abstract void acelerar();
    public abstract void frear();
    public abstract void abastecer();

    public void exibirDetalhes(){
        Log.i("Detalhes","Nome: " + nome + ", Marca: " + marca + ", Ano: " + ano);
    }
}
