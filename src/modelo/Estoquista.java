package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Estoquista extends Funcionario {
	public Estoquista(String nome, Contato contato, Endereco endereco, double salario, LocalDateTime dataEntrada) 
	{
		super(nome, contato, endereco, salario, dataEntrada);
	}
	
	public void mostrarDadosPessoais() {
		DateTimeFormatter patternDataEntrada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("\n");
		System.out.println("Nome do Estoquista....." + this.nome);
		System.out.println("Salário................R$ " + this.salario);
		System.out.println("Data de Entrada........" + this.dataEntrada.format(patternDataEntrada));
		super.mostrarEnderecoContato();
		System.out.println("\n");
	}
}
