public abstract class Carro {

    protected Versao versao;

    protected float precoBase;

    public Carro(float precoBase) {
        this.precoBase = precoBase;
    }

    public void setVersao(Versao versao) {
        this.versao = versao;
    }

    public void setSalarioBase(float salarioBase) {
        this.precoBase = precoBase;
    }

    public abstract float calcularPreco();
}
