package modelo;

import java.time.LocalDateTime;

public abstract class Funcionario extends Pessoa {
	protected double salario;
	protected final LocalDateTime dataEntrada;
	
	public Funcionario(String nome, Contato contato, Endereco endereco, double salario, LocalDateTime dataEntrada) 
	{
		super(nome, contato, endereco);
		this.salario = salario;
		this.dataEntrada = dataEntrada;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public LocalDateTime getDataEntrada() {
		return dataEntrada;
	}
	
	public abstract void mostrarDadosPessoais();
}
