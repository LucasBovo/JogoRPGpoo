package org.example;

public class Personagem {
    protected String nome;
    protected int nivel;
    protected int hp;
    protected int atk;
    protected int def;

    public Personagem(String nome, int nivel, int hp, int atk, int def) {
        this.nome = nome;
        this.nivel = nivel;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public void atacar(Personagem defensor) {
        int dano = this.atk - defensor.def;
        if (dano > 0) {
            defensor.receberDano(dano);
        }
    }

    public void receberDano(int dano) {
        this.hp -= dano;
        if (this.hp < 0) {
            this.hp = 0;  // Garantir que HP não fique negativo

        }
    }

    public boolean estaVivo() {
        return this.hp > 0;
    }

    public void exibirStatus() {
        System.out.println(this.nome + " - HP: " + this.hp);
    }
}
