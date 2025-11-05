public class ClienteVIP extends Cliente {
    private String numeroCartao;
    private double valordaCompra;


     public ClienteVIP (String numeroCartao, double valorDaCompra){
        super(numeroCartao, valorDaCompra);
    }
    public double calcularPagamento(double desconto, double dinheiro){
        desconto = valordaCompra * 9/10;
        return desconto - dinheiro;
    }
}
