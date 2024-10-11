package view;

import java.util.ArrayList;
import java.util.List;

public class ListaNoveNoveNove {

	/*
	 * Faça um programa que preencha automaticamente uma lista com 8 posições,
	 * conforme abaixo: 
	 * 	Valores → 999 999 999 999 999 999 999 999 
	 * 	Posições → 0 1 2 3 4 5 6 7
	 */
	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<Integer>();

		for (int i = 0; i < 8; i++) {
			numeros.add(999);
		}
		System.out.println(numeros.size());
		System.out.println(numeros); 

	}
}
