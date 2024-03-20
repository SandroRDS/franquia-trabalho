package modelo;

public class Estoquista extends Funcionario {
	
	private Produto produtos;
	private Franquia franquia;

	public Estoquista(String nome, String contato, String endereco, double salario, String dataEntrada, Produto produtos, Franquia franquia) 
	{
		super(nome, contato, endereco, salario, dataEntrada);
		this.produtos = produtos;
		this.franquia = franquia;
	}
	
	public Produto getProdutos() 
	{
		return produtos;
	}

	public void setProdutos(Produto produtos) 
	{
		this.produtos = produtos;
	}

	public Franquia getFranquia() 
	{
		return franquia;
	}

	public void setFranquia(Franquia franquia) 
	{
		this.franquia = franquia;
	}

	/*public void gerenciarEstoque()
	{
		String pedidoFranquia = franquia.solicitarEstoque();
		System.out.println("Recebimento de solicitação de estoque: "+pedidoFranquia);
	}*/ 
	//pensamos em criar um sistema para entrar com os dados no construtor
	
	public String organizarEntrega(String pedidoFranquia)
	{
		return "Pedido da Franquia: "+pedidoFranquia+"\nSolicitação de estoque da Franquia: "+franquia.getCodigo()+"\nEndereço: "+franquia.getEndereco();
	}

}
