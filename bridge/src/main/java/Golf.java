public class Golf extends Carro{
    public Golf (float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase * (1 + this.versao.taxaDaVersao());
    }
}
