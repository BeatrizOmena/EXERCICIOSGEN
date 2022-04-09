//2- Ler 10 números e imprimir são pares e quantos são iguais. (PARA)
		
package exerciciosLacoRepeticao;

import java.util.Scanner;

public class EXERCICIO2 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
int  numero , i , par = 0 , impar = 0 ;
		
		for ( i = 1 ; i <= 10 ; i ++) {
			
			System.out.println("Digite o numero:  ");
			numero = leia . nextInt ();
			
			if ( numero % 2 == 0 ) {
				par ++; 
			}
			else if ( numero % 2 == 1 ) {
				impar ++;
				System.out.println("Total de numero pares: " + par);
				System.out.println("Total de numero impar: " + impar);
			}
		}			
	}

}
