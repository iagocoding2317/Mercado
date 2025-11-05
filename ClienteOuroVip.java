public class ClienteOuroVip extends ClienteVIP{
    private String endereco;
    private double valordaCompra;

    public ClienteOuroVip (String endereco, double valorDaCompra){
        super(endereco, valorDaCompra);
    }
    public double calcularPagamento(double desconto, double dinheiro){
        desconto = valordaCompra * 85/100;
        return (valorDaCompra - desconto) - dinheiro;
    }
}
