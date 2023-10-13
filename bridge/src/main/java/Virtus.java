public class Virtus extends Carro{
    public Virtus (float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase * (1 + this.versao.taxaDaVersao());
    }
}
