//Crie um programa que leia um número do teclado até que encontre um igual a zero.
		//No final, mostre a soma dos números digitados.(DO...WHILE)
		
package exerciciosLacoRepeticao;

import java.util.Scanner;

public class EXER5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero, soma=0;
		do {
			System.out.println("Digite um numero no teclado");	
			numero =leia.nextInt ();
			soma = soma + numero;
			}
		while(numero != 0);
		System.out.println( "A soma dos números digitados é: " + soma );
		
	}

}
