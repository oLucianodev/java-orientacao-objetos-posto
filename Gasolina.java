
class Gasolina {
    private String nomeCombustivel;
    private double valorCombustivel;

    public Gasolina(String nomeCombustivel, double valorCombustivel) {
        this.nomeCombustivel = nomeCombustivel;
        this.valorCombustivel = valorCombustivel;
    }

    public String getNomeCombustivel() {
        return nomeCombustivel;
    }

    public double getValorCombustivel() {
        return valorCombustivel;
    }

    public String exibirInfo() {
        return nomeCombustivel + " - R$ " + valorCombustivel + " por litro";
    }

    public double calcularPorLitros(double litros) {
        return litros * valorCombustivel;
    }

    public double calcularPorValor(double valor) {
        return valor / valorCombustivel;
    }
}