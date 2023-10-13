public class Tiguan extends Carro{
    public Tiguan (float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase * (1 + this.versao.taxaDaVersao());
    }
}
