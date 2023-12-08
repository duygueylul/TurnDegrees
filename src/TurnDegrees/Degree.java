package TurnDegrees;
import java.util.Scanner;

public class Degree {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Girmek İstediğiniz Fahrenheit Değerini Giriniz: ");
		double fahr = scan.nextDouble();
		
		double cel = (fahr - 32) * 5 / 9.0;
		
		System.out.println("Fahrenheit Değerinin Celcius Değerine Dönüşümü: " + cel + " Derece'dir.");
		

	}

}
