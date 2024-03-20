package modelo;

public class Pedido {
	private int idProduto;
	private int idEstoquista;
	private int qtdProduto;
	private String dataCompra;
	private Produto tipoProduto;
	
	public Pedido(int idProduto, int idEstoquista, int qtdProduto, String dataCompra, Produto tipoProduto) 
	{
		this.idProduto = idProduto;
		this.idEstoquista = idEstoquista;
		this.qtdProduto = qtdProduto;
		this.dataCompra = dataCompra;
		this.tipoProduto = tipoProduto;
	}

	public int getIdProduto() {
		return this.idProduto;
	}
	
	public int getQtdProduto() 
	{
		return qtdProduto;
	}

	public void setQtdProduto(int qtdProduto) 
	{
		this.qtdProduto = qtdProduto;
	}

	public String getDataCompra() 
	{
		return dataCompra;
	}

	public void setDataCompra(String dataCompra) 
	{
		this.dataCompra = dataCompra;
	}

	public Produto getTipoProduto() 
	{
		return tipoProduto;
	}

	public void setTipoProduto(Produto tipoProduto) 
	{
		this.tipoProduto = tipoProduto;
	}	

	public void mostrarInformacoes() {
		System.out.println("\n");
		System.out.println("ID do Produto....." + this.idProduto);
        System.out.println("Data da Compra...." + this.dataCompra);
        System.out.println("Quantidade........" + this.qtdProduto);
        System.out.println("Tipo.............." + this.tipoProduto);
        System.out.println("\n");
	}
}
