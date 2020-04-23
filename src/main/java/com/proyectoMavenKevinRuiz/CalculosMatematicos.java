package com.proyectoMavenKevinRuiz;

import java.util.ArrayList;

public class CalculosMatematicos {

	public static int potencia(int base, int exponente) {

		int resul = 1;
		if (exponente > 0)
			resul = base * potencia(base, exponente - 1);
		return resul;
	}

	public static ArrayList <Integer> getPrimos(int iEntrada) {
		ArrayList <Integer> aIntegers = new ArrayList<Integer>();
		for (int i = 1; i < iEntrada; i+=2) {
			if (esPrimo(i))
				aIntegers.add(i);
			if(i == 1)
				aInteger.add(2);
		}
		return aIntegers;
	}

	public static boolean esPrimo(int numero) {

		boolean primo = true;
		int divisor = 3;
		if(numero !=2 && numero%2==0)
			primo=false;
		while(primo && divisor< numero/2) {
			if(numero % divisor==0)
				primo = false;
			divisor+=2;
		}
		return primo;
	}

	public static int factorial(int numero) {
		int iResult = 1;
		boolean bkeep = true;

		for (; numero > 1 && bkeep; numero--) {
			if (iResult < 0) {
				bkeep = !bkeep;
				iResult = -1;
			} else {
				iResult *= numero;
			}
		}

		return iResult;
	}

}
