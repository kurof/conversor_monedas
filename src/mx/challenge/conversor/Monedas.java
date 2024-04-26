package mx.challenge.conversor;

public class Monedas {

	//Valores de las monedas (basado en MXN)
	private double valorDolar = 17.07;
	private double valorEuro = 18.17;
	private double valorLibraEsterlina = 21.24;
	private double valorYen = 0.11;
	private double valorWonSurCoreano = 0.012;
	
	//Clases para hacer la conversion de MXN a otra moneda
	public void dollarToMxn (double cantidad) {
		double totalMxn = cantidad * valorDolar;
		System.out.println("Tienes $" + totalMxn + " MXN :D" );
	}
	
	public void euroToMxn(double cantidad) {
		double totalMxn = cantidad * valorEuro;
		System.out.println("Tienes $" + totalMxn + " MXN :D");
	}
	
	public void libraEsterlinaToMxn(double cantidad) {
		double totalMxn = cantidad * valorLibraEsterlina;
		System.out.println("Tienes $" + totalMxn + " MXN :D");
	}
	
	public void yenToMxn(double cantidad) {
		double totalMxn = cantidad * valorYen;
		System.out.println("Tienes $" + totalMxn + " MXN :D");
	}
	
	public void wonToMxn(double cantidad) {
		double totalMxn = cantidad * valorWonSurCoreano;
		System.out.println("Tienes $" + totalMxn + " MXN :D");
	}
	
}
