package mx.challenge.tests;

import java.util.Scanner;

import mx.challenge.conversor.Monedas;

public class TestConversor {

	public static void main(String[] args) {
		
		//objeto para llamar a los metodos de conversion mxn a otras monedas
		Monedas conversorMxn = new Monedas();
		
		Scanner entradaOpcion = new Scanner(System.in); //para crear un objeto scanner de las opcinoes
		Scanner entradaCantidad = new Scanner(System.in); //para la cantidad de dinero
		
		System.out.println("========== CONVERSOR DE MONEDAS ===========");
		System.out.println("Por favor, elige alguna de las siguientes opciones para \n"
							+ "--- 1) Convertir Dolares a MXN \n"
							+ "--- 2) Convertor Euros a MXN \n"
							+ "--- 3) Convertir Libra Esterlina a MXN \n"
							+ "--- 4) Convertir Yen a MXN \n"
							+ "--- 5) Convertir Won surcoreano a MXN \n"
							+ "\n----- Para terminar el programa ingresa una Q !!!!");
		
		int opcion = entradaOpcion.nextInt(); //para que el programa lea la opcion
		System.out.println("\nIngresa la cantidad que quieres convertir: ");
		double cantidadDinero = entradaCantidad.nextDouble(); //cantidad dinero
		
		switch (opcion) {
		case 1:
			System.out.println("Convirtiendo Dolares a MXN...");
			conversorMxn.dollarToMxn(cantidadDinero);
			break;
		case 2:
			System.out.println("Convirtiendo Euros a MXN...");
			conversorMxn.euroToMxn(cantidadDinero);
			break;
		case 3:
			System.out.println("Convirtiendo Libra Esterlina a MXN...");
			conversorMxn.libraEsterlinaToMxn(cantidadDinero);
			break;
		case 4:
			System.out.println("Convirtiendo Yen a MXN...");
			conversorMxn.yenToMxn(cantidadDinero);
			break;
		case 5:
			System.out.println("Convirtiendo Won a MXN...");
			conversorMxn.wonToMxn(cantidadDinero);
			break;
			
		default:
			System.out.println("La opcion no es valida");
			break;
		}
	}
}
