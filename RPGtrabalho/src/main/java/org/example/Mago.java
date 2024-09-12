package org.example;

public class Mago extends Personagem {
    int mana;

    private int poderMagico;

    public Mago(String nome, int nivel, int hp, int atk, int def, int mana, int poderMagico) {
        super(nome, nivel, hp, atk, def);
        this.mana = mana;
        this.poderMagico = poderMagico;
    }

    public void lancarMagia(Personagem inimigo) {
        int custoMana = 10;
        if (this.mana >= custoMana) {
            int dano = this.poderMagico - inimigo.def;
            if (dano > 0) {
                inimigo.receberDano(dano);
            }
            this.mana -= custoMana;
        } else {
            System.out.println("Mana insuficiente!");
        }
    }
}
