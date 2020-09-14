package exercicio0909;

public class usuario {
	
	private String nome;
	private int id;
	private String email;
	private String cargo;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public usuario(String nome, int id, String email, String cargo) {
		this.nome = nome;
		this.id = id;
		this.email = email;
		this.cargo = cargo;
		
	}

}
