package modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Franquia implements Pagamento {
	private Franqueado franqueado;
	private Endereco endereco;
	private Contato contato;
	private Consultor consultor;
	private ArrayList<Estoquista> estoquistas; // Adicionar um estoquista, remover um estoquista, mostrar todos os estoquistas e retornar todos os estoquistas
	private ArrayList<Produto> produtos; // Adicionar um produto, retornar todos os produtos, mostrar todos os produtos e remover um produto
	private ArrayList<Pedido> pedidos; // Adicionar um pedido, retornar todos os pedidos e mostrar todos os pedidos
	private double receitaMensal, custo, taxaFranquia;
	
	public Franquia
	(
			Franqueado franqueado, 
			Endereco endereco, 
			Contato contato,
			Consultor consultor,
			double receitaMensal, 
			double custo, 
			double taxaFranquia) {
		this.franqueado = franqueado;
		this.endereco = endereco;
		this.contato = contato;
		this.consultor = consultor;
		this.receitaMensal = receitaMensal;
		this.custo = custo;
		this.taxaFranquia = taxaFranquia;
	}
	
	// métodos de set e get 
	public Franqueado getFranqueado() 
	{
		return franqueado;
	}

	public void setFranqueado(Franqueado franqueado) 
	{
		this.franqueado = franqueado;
	}

	public Endereco getEndereco() 
	{
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) 
	{
		this.endereco = endereco;
	}

	public Contato getContato() 
	{
		return this.contato;
	}

	public void setContato(Contato contato) 
	{
		this.contato = contato;
	}

	public double getReceitaMensal()
	{
		return receitaMensal;
	}

	public void setReceitaMensal(double receitaMensal) 
	{
		this.receitaMensal = receitaMensal;
	}

	public double getCusto() 
	{
		return custo;
	}

	public void setCusto(double custo) 
	{
		this.custo = custo;
	}

	//cálculo da taxa que a franquia paga ao franqueador
	public double obterTaxaFranquia() 
	{
		return (this.receitaMensal - this.custo) * (this.taxaFranquia / 100);
	}
	
	//cálculo do faturamento da franquia
	public double verificarFaturamento() 
	{
		return this.receitaMensal - (this.obterTaxaFranquia() + this.custo);
	}
	
	//adiciona produtos a lista de produtos da franquia
	public void adicionarProduto(Produto produto) 
	{
	    produtos.add(produto);
	}

	//mostra os produtos da lista
	public void mostrarProdutos() 
	{
	    for (Produto produto : produtos) produto.mostrarInformacoes();
	}
	
	//aumenta a quantidade de um produto em estoque
	public void contabilizarEstoque(int idProduto, int quantidade) 
	{
		for (Produto produto : this.produtos) {
			if (produto.hashCode() == idProduto) {
				produto.setQuantidade(produto.getQuantidade() + quantidade);
			}
		}
	}
	
	//adiciona produtos a lista de pedidos da franquia
	public void adicionarPedido(Pedido pedido) 
	{
	    pedidos.add(pedido);
	}
	
	//mostra os pedidos da lista de pedidos
	public void mostrarPedidos() {
	    for (Pedido pedido : pedidos) pedido.mostrarInformacoes();
	}
	
	//adicionar estoquistas a lista de estoquistas da franquia
	public void adicionarEstoquistas(Estoquista estoquista)
	{
		estoquistas.add(estoquista);
	}
	
	//mostra os estoquistas
	public void mostrarEstoquistas()
	{
		for (Estoquista estoquista : estoquistas) estoquista.mostrarDadosPessoais();
	}
	//retornar os produtos
	public ArrayList<Produto> getProdutos() 
	{
	    return produtos;
	}

	//retornar pedidos
	public ArrayList<Pedido> getPedidos() 
	{
	    return pedidos;
	}

	//retornar estoquistas 
	public ArrayList<Estoquista> getEstoquistas()
	{
	    return estoquistas;
	}
	
	//
	public void solicitarConsulta(LocalDateTime horarioConsulta) 
	{
		this.consultor.agendarReuniao(horarioConsulta);
	}
}
