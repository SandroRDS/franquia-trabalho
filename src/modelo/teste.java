package modelo;

import java.time.LocalDateTime;

public class teste {
	public static void main(String[] args) {
		Franqueador dona = new Franqueador(
				"Maria Eduarda Mendonça de Souza",
				"55818600000153",
				"Cacau Show LTDA",
				new Contato("55", "22", "998876655"),
				new Endereco("28055-293", "Brasil", "RJ", "Campos dos Goytacazes", "Pecuária", "Avenida Presidente Vargas", "43")
				);

		Consultor consultor = new Consultor(
				"Sandro Márcio Rosa de Souza Filho",
				new Contato("55", "22", "996074071"),
				new Endereco("28022280", "Brasil", "RJ", "Campos dos Goytacazes", "Parque Imperial", "Rua João Manoel de Abreu", "463"),
				2800
				);
	}
}
