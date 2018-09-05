import java.util.Scanner;

public class Questao5{
	public static void main(String[] agrs){
		Scanner entrada = new Scanner(System.in);
		double n1,n2,n3,resultado;
		System.out.println("Digite 3 numeros:");
		n1 = entrada.nextDouble();
		n2 = entrada.nextDouble();
		n3 = entrada.nextDouble();
		resultado=(n1+n2+n3)*(n1+n2+n3);
		System.out.println("Resultado: "+resultado);
	}
}