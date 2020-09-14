package exercicio10;

abstract class Aviao {
	protected String nome;
	protected String tipo = "asas";
}

abstract class Helicoptero implements VeiculoVoadores {
	protected String nome;
	protected String tipo = "helice";
}

class MonoMotor extends Aviao implements VeiculoVoadores {
	MonoMotor(String nome){
		this.nome = nome;
	}
	
	@Override
	public void getTipo() {
		System.out.println("Nome: " + nome);
		System.out.println("Tipo :" + tipo);
	}
}

class Bell429 extends Helicoptero {
	Bell429(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void getTipo() {
		System.out.println("Nome: " + nome);
		System.out.println("Tipo: " + tipo);
	}
}
