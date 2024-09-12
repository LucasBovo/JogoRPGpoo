package org.example;

public class Arqueiro extends Personagem {
    private int precisao;

    public Arqueiro(String nome, int nivel, int hp, int atk, int def, int precisao, int i) {
        super(nome, nivel, hp, atk, def);
        this.precisao = precisao;
    }

    public void atirarFlecha(Personagem inimigo) {
        int dano = (this.atk + this.precisao) - inimigo.def;
        if (dano > 0) {
            inimigo.receberDano(dano);
        }
    }
}
