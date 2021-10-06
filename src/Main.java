import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lista = new ArrayList<String>();
		
		
		lista.add("teste");
		lista.add(0,"Teste2");
		lista.add(0,"teste 3");
		
		List<String> filtrado = lista.stream().filter(palavra -> palavra == "teste").toList();
		
		List<Pessoa> ids = new ArrayList<>();
	
		ids.add(new Pessoa("Rafael"));
		
		Pessoa idFiltrado = ids.stream().filter(pessoa -> pessoa.getNome() == "Rob" || pessoa.getNome() == "Rafael").findFirst().orElse(null);
		
		System.out.println(idFiltrado);
		
		Motorista motor = new Motorista("Rafael");
		
		motor.getNome();
		
		
	}

}
