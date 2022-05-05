package com.example.angui.modelo;

public class Votante {
    private int idade;
    private boolean podeVotar;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isPodeVotar() {
        return podeVotar;
    }

    public void setPodeVotar(boolean podeVotar) {
        this.podeVotar = podeVotar;
    }

    public void calcularIdade(int anoAtual, int anoNascimento){
        this.idade = anoAtual - anoNascimento;
        this.podeVotar = this.idade >= 16;
    }
}
