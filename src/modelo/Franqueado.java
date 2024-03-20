package modelo;

public class Franqueado extends Pessoa {
	
	private String cnpj;
	
	public Franqueado(String nome, String contato, String endereco, String cnpj) 
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

	public void mostrarDados()
	{
		super.mostrarDados();
		System.out.println("Cnpj: "+this.cnpj+"\n");
	}
}
