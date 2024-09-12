
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MagoTest {

    @Test
    void testLancarMagia() {
        Mago mago = new Mago("Gandalf", 10, 80, 15, 5, 50, 25);
        Personagem inimigo = new Guerreiro("Thorin", 10, 100, 20, 10, 5, 2);
        mago.lancarMagia(inimigo);
        assertEquals(85, inimigo.hp);
        assertEquals(40, mago.mana);
    }

    @Test
    void testLancarMagiaSemMana() {
        Mago mago = new Mago("Gandalf", 10, 80, 15, 5, 5, 25);
        Personagem inimigo = new Guerreiro("Thorin", 10, 100, 20, 10, 5, 2);
        mago.lancarMagia(inimigo);
        assertEquals(100, inimigo.hp);
        assertEquals(5, mago.mana);
    }
}
