package modelo;

public class Franqueado extends Pessoa {
	
	private String cnpj;
	
	public Franqueado(String nome, Contato contato, Endereco endereco, String cnpj) 
	{
		super(nome, contato, endereco);
		this.cnpj = cnpj;
	}

	public String getCnpj() 
	{
		return cnpj;
	}

	public void setCnpj(String cnpj) 
	{
		this.cnpj = cnpj;
	}

	public void mostrarDadosPessoais()
	{
		System.out.println("\n");
		System.out.println("Nome do Franqueado....." + this.nome);
		System.out.println("CNPJ..................." + this.cnpj);
		super.mostrarEnderecoContato();
		System.out.println("\n");
	}
}
