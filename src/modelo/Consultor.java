package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Consultor extends Funcionario {
	private ArrayList<LocalDateTime> datasDisponiveis = new ArrayList<>();
	private ArrayList<LocalDateTime> reunioesAgendadas = new ArrayList<>();
	
	public Consultor(String nome, Contato contato, Endereco endereco, double salario) {
		super(nome, contato, endereco, salario, LocalDateTime.now());
	}
	
	public Consultor(String nome, Contato contato, Endereco endereco, double salario, LocalDateTime dataEntrada) {
		super(nome, contato, endereco, salario, dataEntrada);
	}
	
	public void agendarReuniao(LocalDateTime dataHoraReuniao) {
		DateTimeFormatter patternDataEntrada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		if (this.consultarDisponibilidade(dataHoraReuniao)) {
			this.reunioesAgendadas.add(dataHoraReuniao);
			
			for (LocalDateTime data : this.datasDisponiveis) {
				if (data.isEqual(dataHoraReuniao)) this.removerDisponibilidade(data.hashCode());;
			}
			
			System.out.println("Consulta agendada com sucesso para " + dataHoraReuniao.format(patternDataEntrada) + ".");
		} else {
			System.out.println("Não foi possível agendar a consulta. Horário indisponível.");
		}
	}
	
	public void removerAgendamento(int idReuniao) {
		for (LocalDateTime dataReuniao : this.reunioesAgendadas) {
			if (dataReuniao.hashCode() == idReuniao) {
				this.datasDisponiveis.remove(dataReuniao);
				break;
			}
		}
	}
	
	public ArrayList<LocalDateTime> getReunioesAgendadas() {
		return this.reunioesAgendadas;
	}
	
	public boolean consultarDisponibilidade(LocalDateTime dataRequisitada) {
		for (LocalDateTime data : this.datasDisponiveis) {
			if (data.isEqual(dataRequisitada)) return true;
		}
		
		return false;
	}
	
	public void adicionarDisponibilidade(int dia, int mes, int ano, int horas, int minutos) {
		this.datasDisponiveis.add(LocalDateTime.of(ano, mes, dia, horas, minutos));
	}
	
	public void removerDisponibilidade(int idHorarioDisponivel) {
		for (LocalDateTime data : this.datasDisponiveis) {
			if (data.hashCode() == idHorarioDisponivel) {
				this.datasDisponiveis.remove(data);
				break;
			}
		}
	}
	
	public ArrayList<LocalDateTime> getDatasDisponiveis() {
		return this.datasDisponiveis;
	}
	
	public void mostrarDatasDisponiveis() {
		DateTimeFormatter patternDataEntrada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		for (LocalDateTime data : this.datasDisponiveis) {
			System.out.println(data.format(patternDataEntrada));
		}
	}
	
	public void mostrarReunioesAgendadas() {
		DateTimeFormatter patternDataEntrada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		for (LocalDateTime data : this.reunioesAgendadas) {
			System.out.println(data.format(patternDataEntrada));
		}
	}
	
	public void mostrarDadosPessoais() {
		DateTimeFormatter patternDataEntrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Nome................" + this.nome);
		System.out.println("Salário............." + this.salario);
		System.out.println("Data de Entrada....." + this.dataEntrada.format(patternDataEntrada));
		super.mostrarEnderecoContato();
	}
}
