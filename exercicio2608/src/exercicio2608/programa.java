package exercicio2608;

//import java.util.ArrayList;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe quantos numeros serão listados: ");
	
        int x = ler.nextInt();
        
//        float mediaPar;
//        float  mediaImpar;
        int contPar = 0;
        int contImpar = 0;

        int num[] = new int[x];
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Insira o " + (i + 1) + "° numero: \n");
            num[i] = ler.nextInt();

            if (num[i] % 2 == 0) {
                System.out.println("Esse numero é PAR.");
                contPar++;

            } else {
                System.out.println("Esse numero é IMPAR.");
                contImpar++;
            }

        }
//        mediaPar = contPar / num[x];
//        mediaImpar = contImpar / num[x];
//
        System.out.println("A quantidade de numeros PARES é : " + contPar);
        System.out.println("A quantidade de numeros IMPARES é : " + contImpar);

    }
}
//        
//		ArrayList<numeros> listaNum = new ArrayList<numeros>();
//		listaNum.add(num);
//		ArrayList<numeros> listaNumPAR = new ArrayList<numeros>();
//		numerosPar np = new numerosPar(num);
//		listaNumPAR.add(np);
//		System.out.println("")
//		ArrayList<numeros> listaNumIMPAR = new ArrayList<numeros>();
//		listaNumIMPAR.add(ni);
//		
//	}
//}
