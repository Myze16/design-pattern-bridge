import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TiguanTest {

    @Test
    void deveRetornarPrecoTiguanComfortline() {
        Versao versao = new Comfortline();
        Tiguan tiguan = new Tiguan(60000f);
        tiguan.setVersao(versao);
        assertEquals(69000f, tiguan.calcularPreco());
    }

    @Test
    void deveRetornarPrecoTiguanHighline() {
        Versao versao = new Highline();
        Tiguan tiguan = new Tiguan(60000f);
        tiguan.setVersao(versao);
        assertEquals(78000f, tiguan.calcularPreco());
    }

    @Test
    void deveRetornarPrecoTiguanRline() {
        Versao versao = new Rline();
        Tiguan tiguan = new Tiguan(60000f);
        tiguan.setVersao(versao);
        assertEquals(96000f, tiguan.calcularPreco());
    }
}
