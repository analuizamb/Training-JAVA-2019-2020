package Exercicio 4;

public abstract class Ave {
	
    private String especie;
    private String getespecie() {
		return especie;
    }
}
 class Galinha extends Ave {

    private String comportamento;

	private String emitirSom() {
        return this.comportamento;
	}    
        public static void main(String args[]) {
        	String comportamento = "Emitir Som";
        	Galinha g = new Galinha();
        	g.setComportamento(comportamento);
        	System.out.println("O comportamento da galinha é: " + g.toString());
        }
 }
 
	class Arara extends Ave {
		
		private String comportamento;
		
		private String voar() {
				return this.comportamento;
		}
			public static void main(String args[]) {
				String comportamento = "Voar";
				Arara a = new Arara();
				a.setComportamento(comportamento);
				System.out.println("O comportamento da arara é: " + a.toString());
			}
	}