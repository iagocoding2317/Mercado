public class Cliente{
    private String nome;
    public double valorDaCompra;

    public Cliente(String nome, double valorDaCompra){
        this.nome = nome;
        this.valorDaCompra = valorDaCompra;
    }

    public double calcularPagamento(double dinheiro){
        return valorDaCompra - dinheiro;
    }

    public double getValorDaCompra(){
        return this.valorDaCompra;
    }
}
