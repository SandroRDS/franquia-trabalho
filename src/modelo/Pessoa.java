package modelo;

public abstract class Pessoa {
	protected String nome;
	protected Contato contato;
	protected Endereco endereco;
	
	public Pessoa(String nome, Contato contato, Endereco endereco) {
		this.nome = nome;
		this.contato = contato;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public abstract void mostrarDadosPessoais();
	
	protected void mostrarEnderecoContato() {
		System.out.println("Endereço:");
		System.out.println("CEP................." + this.endereco.getCep());
		System.out.println("País................" + this.endereco.getPais());
		System.out.println("Estado.............." + this.endereco.getEstado());
		System.out.println("Cidade.............." + this.endereco.getCidade());
		System.out.println("Bairro.............." + this.endereco.getBairro());
		System.out.println("Rua................." + this.endereco.getRua());
		System.out.println("Número.............." + this.endereco.getNumeroDaRua());
		System.out.println("Contato:");
		System.out.println("Telefone............" + "+" + this.contato.getDdi() + " " + this.contato.getDdd() + " " + this.contato.getNumero());
	}
}
