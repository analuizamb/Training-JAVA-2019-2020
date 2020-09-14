package fórum05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
	class forum05062020 {
		   
		   public String criptografar (int chave, String msg)
		   {

		      StringBuilder msgcifrada = new StringBuilder();

		      int tamanho_msg = msg.length();
		      
		      for(int c=0; c < tamanho_msg; c++){
		        
		         int letraASCII = ((int) msg.charAt(c)) + chave;

		         while(letraASCII > 126)
		        	 letraASCII -= 94;

		         msgcifrada.append( (char)letraASCII );
		      }
		      
		      return msgcifrada.toString();
		   }

		   public void main(String[] args){
		      
		      try {
		         Scanner scan = new Scanner(System.in);
		      
		         System.out.println("*****************************************************");
		         
			         System.out.println("Insira o que deseja criptografar: ");
			         String msg = scan.nextLine();
			         System.out.println("Insira qual a chave a ser usada: ");
			         int chave = scan.nextInt();

		         String msgCriptografada = criptografar(chave, msg);
		         System.out.println("\n\n Mensagem criptografada: " + msgCriptografada);

		         System.out.println("*****************************************************");
		         }
		         finally {};
		      }
		   }
		}
	}