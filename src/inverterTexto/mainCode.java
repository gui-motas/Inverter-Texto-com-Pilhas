package inverterTexto;

import java.util.Scanner;

public class mainCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite uma palavra");
		String input = sc.nextLine();
		String palavra = "";
		String palavrainversa ="";
		Pilha pilhastring = new Pilha();
		Pilha pilhastringinversa = new Pilha();
		
		for(int i=0; i < input.length();i++) {
			char character = input.charAt(i);
			
			pilhastring.push(character); 
			
			 palavra += pilhastring.letras[pilhastring.topo];
			
			 
		}

		
		for(int j=palavra.length(); j > 0 ;j--) {
			char character = palavra.charAt(j-1);
			
			pilhastringinversa.push(character); 
			
			palavrainversa += pilhastringinversa.letras[pilhastringinversa.topo];
			
		}
		
		System.out.println(palavrainversa);
	}
	
	

}
