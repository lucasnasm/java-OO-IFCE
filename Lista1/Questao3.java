import java.util.Scanner;

public class Questao3{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		float real,dolar;
		System.out.println("Insira o valor para ser convertido:");
		real = entrada.nextFloat();
		System.out.println("Insira a cotacao do dolar");
		dolar = entrada.nextFloat();
		dolar = real * dolar;
		System.out.println(dolar);
	}
}