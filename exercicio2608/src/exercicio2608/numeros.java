package exercicio2608;

public class numeros {
	int num = 0;

			public numeros(int num) {
				this.num = num; 
			}
		
			public int getNum() {
				return num;
			}
			public void setNum(int num) {
				this.num = num;
			}
	
//		if((num  % 2) == 0) {
//			numerosPar np = new numerosPar(num);
//		System.out.println("numero par");
//		}
//		else {
//		numerosImpar ni = new numerosImpar(num);
//		System.out.println("numero impar");
//		}
	
			@Override
			public String toString() {
				StringBuilder sb = new StringBuilder();
				sb.append("\nNumero: " + getNum());
				return sb.toString();
			}
			    
				
}

