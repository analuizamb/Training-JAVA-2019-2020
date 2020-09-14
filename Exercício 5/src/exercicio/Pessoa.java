package exercicio;

public class Aluno1 {
    
    private String nome;
    private int idade;
    private String email;
    
	    public String getnome() {
	        return this.nome;
	    }
	    public void setnome(String nome) {
	        if (nome=2 && nome[50]) { 
	    	this.nome = nome;
	        }
	    }

	    	public int getidade() {
		        return this.idade;
		    }
		    public void setidade(int idade) {
		        if (idade>=18 && idade<=99) {
		    	this.idade = idade;
		        }
		    }
			 
		    	public String getemail() {
			        return this.email;
			    }
			    public void setemail(String email) {
			    	if (email @contains ("." && "@")) {
			        this.email = email;
			    	}
			    }
//                          Operações                                 

			    public String getNome() {
			        return "";
			    }

			    public int getIdade() {
			        return 0;
			    }

			    public String getEmail() {
			        return "";
			    }
}