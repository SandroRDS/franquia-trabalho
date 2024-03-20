package modelo;

public class Franqueador extends Pessoa {
	private Franquia[] franquias = {};
	private Consultor consultor;
	private String cnpj, razaoSocial;

	public Franqueador(String nome, String cnpj, String razaoSocial, Contato contato, Endereco endereco) {
		super(nome, contato, endereco);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public void mostrarDadosPessoais() {
		System.out.println("\n");
		System.out.println("Nome............." + this.nome);
		System.out.println("CNPJ............." + this.cnpj);
		System.out.println("Razão Social....." + this.razaoSocial);
		this.mostrarEnderecoContato();
		System.out.println("\n");
	}
	
	public void criarNovaFranquia() {
		
	}
	
	public void adicionarConsultor(Consultor consultor) {
		this.consultor = consultor;
	}
	
	public void removerConsultor() {
		this.consultor = null;
	}
	
	public Consultor getConsultor() {
		return this.consultor;
	}
}
