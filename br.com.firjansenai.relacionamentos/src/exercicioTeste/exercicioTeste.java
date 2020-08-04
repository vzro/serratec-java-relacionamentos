package exercicioTeste;

import exercicio.Cidade;
import exercicio.Contato;
import exercicio.Endereco;
import exercicio.Estado;
import exercicio.Telefone;

public class exercicioTeste {

	public static void main(String[] args) {
		// ESTADOS
		Estado estado1 = new Estado("Rio de Janeiro", "RJ");
		Estado estado2 = new Estado("Rio Grande do Sul", "RS");

		// CIDADES
		Cidade cidade1 = new Cidade("Petrópolis", estado1);
		Cidade cidade2 = new Cidade("Nova Petrópolis", estado2);

		// ENDEREÇOS
		Endereco endereco1 = new Endereco("Estrada da Saudade", "Centro", "29876-123", cidade1);
		Endereco endereco2 = new Endereco("Rua Hermento Pascoal", "Veredas", "56987-991", cidade2);

		// TELEFONES
		Telefone telefone1 = new Telefone("1234-1235");
		Telefone telefone2 = new Telefone("9875-2367");
		Telefone telefone3 = new Telefone("9997-5653");
		Telefone telefone4 = new Telefone("6784-1239");
		
		Telefone[] telefones1 = new Telefone[2];
		telefones1[0] = telefone1;
		telefones1[1] = telefone2;

		Telefone[] telefones2 = new Telefone[2];
		telefones2[0] = telefone3;
		telefones2[1] = telefone4;

		// CONTATOS
		Contato contato1 = new Contato("John Wick", endereco1);
		Contato contato2 = new Contato("Mr. Anderson", endereco2);
		
		contato1.setTelefones(telefones1);
		contato2.setTelefones(telefones2);
		
		System.out.printf("%s\n"
						+ "%s\n"
						+ "%s\n"
						+ "%s\n"
						+ "%s - "
						+ "%s\n",
						contato1.getNome(),
						contato1.getEndereco().getRua(),
						contato1.getEndereco().getBairro(),
						contato1.getEndereco().getCidade().getNomeCidade(),
						contato1.getEndereco().getCidade().getEstado().getNomeEstado(),
						contato1.getEndereco().getCidade().getEstado().getSigla());

		contato1.mostrarTelefones();

		System.out.printf("%s\n"
						+ "%s\n"
						+ "%s\n"
						+ "%s\n"
						+ "%s - "
						+ "%s\n",
						contato2.getNome(),
						contato2.getEndereco().getRua(),
						contato2.getEndereco().getBairro(),
						contato2.getEndereco().getCidade().getNomeCidade(),
						contato2.getEndereco().getCidade().getEstado().getNomeEstado(),
						contato2.getEndereco().getCidade().getEstado().getSigla());
		
		contato2.mostrarTelefones();

	}
}
