package modelo;

public class Endereco {
	private String cep, pais, estado, cidade, bairro, rua, numeroDaRua;
	
	public Endereco (String cep, String pais, String estado, String cidade, String bairro, String rua, String numeroDaRua) {
		this.cep = cep;
		this.pais = pais;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numeroDaRua = numeroDaRua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumeroDaRua() {
		return numeroDaRua;
	}

	public void setNumeroDaRua(String numeroDaRua) {
		this.numeroDaRua = numeroDaRua;
	}
}
