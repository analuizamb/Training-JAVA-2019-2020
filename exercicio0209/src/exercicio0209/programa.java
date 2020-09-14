package exercicio0209;

public class programa {

	public static void main(String[] args) {
		
		pessoaRepository repositorio = new pessoaRepository();
	
		pessoa p1 = new pessoa("Ana", "123123123", "ana@email.com");
		pessoa p2 = new pessoa("Luiza", "321321321", "luiza@email.com");
		pessoa p3 = new pessoa("Bianca", "456456456", "bianca@email.com");

		repositorio.pessoa.add(p1);
		repositorio.pessoa.add(p2);
		repositorio.pessoa.add(p3);
		
		System.out.println(repositorio.pessoa);
	}

}
