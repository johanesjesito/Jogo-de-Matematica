package model;

import java.util.Random;

public class Caculacao {

	private static Random random = new Random();
	private static int resultado;
	private static String equacao;

	public static  void calcular() {

		int valor1 ,valor2;
		int operacoesAleatorias = random.nextInt(4);
		switch (operacoesAleatorias) {

		case 0:
			valor1 = random.nextInt(10);
			valor2 = random.nextInt(10);
			resultado = valor1 +valor2;
			equacao = valor1+" + " +valor2;
			break;
		case 1:
			valor2 = random.nextInt(10);
			valor1 = valor2+random.nextInt(10);
			resultado = valor1 - valor2;
			equacao = valor1+" - " +valor2;
			break;
		case 2:
			valor1 = random.nextInt(10);
			valor2 = random.nextInt(10);
			resultado = valor1 *valor2;
			equacao = valor1+" x " +valor2;
			break;
		case 3:
			valor2 = 1+random.nextInt(10);
			resultado = 1+random.nextInt(10);
			valor1 = resultado * valor2;
			equacao = valor1+" / " +valor2;			
			break;
		}
	}

	public static  void calcular2() {

		int valor1;

		resultado = random.nextInt(101);
		valor1 = resultado * resultado;
		equacao = "√" + valor1;			


	}

	public static  void calcular3() {

		int valor1;
		int potencia = random.nextInt(5);
		valor1 = random.nextInt(11);
		resultado = (int) Math.pow(valor1, potencia);
		equacao = valor1+"^"+potencia;
		
	}

	public static int getResultado() {
		return resultado;
	}

	public static String getEquacao() {
		return equacao;
	}

}
