package exercicio8;

abstract class VCarro implements Veiculo {
	protected String tipo = "carro";
}

abstract class VMoto implements Veiculo {
	protected String tipo = "moto";
}

class carro extends VCarro {
	carro(String tipo){
		this.tipo = tipo;
	}

	@Override
	public void showTipo() {
		System.out.print("Tipo: " + tipo + "\n");
	}
}

class moto extends VMoto {
	moto(String tipo){
		this.tipo = tipo;
	}

	@Override
	public void showTipo() {
		System.out.print("Tipo: " + tipo);
	}
}