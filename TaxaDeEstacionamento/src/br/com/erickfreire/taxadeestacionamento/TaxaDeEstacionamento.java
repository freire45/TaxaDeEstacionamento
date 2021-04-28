package br.com.erickfreire.taxadeestacionamento;

import java.util.Scanner;

/**
 * Programa em Java que calcula a taxa de estacionamento
 * @author Erick Freire
 * @version 1 - Criado em 28-04-2021 as 19:12
 */

public class TaxaDeEstacionamento {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double valor = 0.0;
		
		System.out.println("Calculador de Taxa de estacionamento: ");
		
		System.out.print("Informe quantas horas o cliente passou no estacionamento: ");
		int horas = entrada.nextInt();
		
		if(horas <= 3) {
			valor = valor + 2.00;
			
			System.out.printf("%nO Cliente vai ter que pagar:R$ %f%n", valor);
		} else {
			if(horas > 3 && horas <= 24) {
				valor = 2.00;
				for(int i = horas; i > 3; i--) {
					valor += 0.5;
				}
				
				if(valor > 10.00) {
					valor = 10.00;
				}
				
				System.out.printf("%nO Cliente vai ter que pagar:R$ %f%n", valor);
			}
		}
	}

}
