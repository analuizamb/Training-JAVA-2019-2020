package exercicio10;

public class Main {
	public static void main (String[] args) {
		VeiculoVoadores primeiro = new MonoMotor("MonoMotor");
		VeiculoVoadores segundo = new Bell429("Bell429");
		primeiro.getTipo();
		segundo.getTipo();
	}
}
