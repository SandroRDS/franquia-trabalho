package modelo;

public class Pedido {

	private int qtdProduto;
	private String dataCompra;
	private Produto tipoProduto;
	
	public Pedido(int qtdProduto, String dataCompra, Produto tipoProduto) 
	{
		super();
		this.qtdProduto = qtdProduto;
		this.dataCompra = dataCompra;
		this.tipoProduto = tipoProduto;
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
}
