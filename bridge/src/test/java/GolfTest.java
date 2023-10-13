import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GolfTest {

    @Test
    void deveRetornarPrecoGolfComfortline() {
        Versao versao = new Comfortline();
        Golf golf = new Golf(50000f);
        golf.setVersao(versao);
        assertEquals(57500f, golf.calcularPreco());
    }

    @Test
    void deveRetornarPrecoGolfHighline() {
        Versao versao = new Highline();
        Golf golf = new Golf(50000f);
        golf.setVersao(versao);
        assertEquals(64999.996f, golf.calcularPreco());
    }

    @Test
    void deveRetornarPrecoGolfRline() {
        Versao versao = new Rline();
        Golf golf = new Golf(50000f);
        golf.setVersao(versao);
        assertEquals(80000f, golf.calcularPreco());
    }
}
